package com.fnaf.Common.main;

import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import com.fnaf.Client.commands.Commands;
import com.fnaf.Client.event.Events;
import com.fnaf.Client.gui.GUIOverlayDev;
import com.fnaf.Client.handler.ConfigurationHandler;
import com.fnaf.Client.registry.EntityRegister;
import com.fnaf.Client.utils.CreativeTabFNAF;
import com.fnaf.Client.utils.CreativeTabFNAF2;
import com.fnaf.Client.utils.SpawnEvent;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.world.gen.WorldGenSU;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.name, version = Reference.version)
public class MAIN_FNAF 
{
	
	
	
//	<!-- hey there, source code reader, who probably wants to ask if you can use this design on your Game mod. -->
//	<!-- while I don't have an issue with it, the code is SO horrible and awful that it's much, much easier to -->
//	<!-- just make your own version of the design, which is completely cool with us: most of the design's from -->
//	<!-- apple's app store app anyway. again: you can use the design (but not the content) where you want, but -->
//	<!-- it's awful, so for your sake, make your own. also, see Cydia's Info.plist for another of these equal- -->
//	<!-- line-length paragraphs, which inspired this one. it's actually easier than i thought it'd be to make! -->
	
	//////	//////		  //\\
	//	  //	//		 //	 \\			   //\\\\\\\\ ///||///	//	  //
	//	  //	//		//	  \\		  //			 ||		//	//
	//			//	   //------\\        //				 ||		////     
	//			//	  //        \\		//		/////    ||		//	//
	//			//	 //	         \\		//		  //	 ||		//	  //
	//			//	//	          \\    ///////////	  ///||///	//		//
	
	
	
	
	public static enum GameMode
    {
        DONOTRUN, NORMAL, CREATIVE, HARDCORE;

		public static void CREATIVE() {
		
			Minecraft.getMinecraft().thePlayer.capabilities.isCreativeMode = true;
			
		}
    }
    public static GameMode gameMode = null;

    public static int getGameModeNumber()
    {
        if (gameMode == GameMode.DONOTRUN)
        {
            return -1;
        }
        else if (gameMode == GameMode.NORMAL)
        {
            return 0;
        }
        else if (gameMode == GameMode.CREATIVE)
        {
            return 1;
        }
        else if (gameMode == GameMode.HARDCORE)
        {
            return 2;
        }

        return 0;
    }
    public static void setGameModeFromNumber(int gm)
    {
        if (gm == -1)
        {
            gameMode = GameMode.DONOTRUN;
        }
        else if (gm == 0)
        {
            gameMode = GameMode.NORMAL;
        }
        else if (gm == 1)
        {
            gameMode = GameMode.CREATIVE;
        }
        else if (gm == 2)
        {
            gameMode = GameMode.HARDCORE;
        }
    }

	public static CreativeTabs tabFnaf2 = new CreativeTabFNAF2("standard2");
	public static CreativeTabs tabFnaf = new CreativeTabFNAF("standard");
	public static Configuration Config;
	
	public static ConfigurationHandler configFile = new ConfigurationHandler();	
	
	@SidedProxy(clientSide = "com.fnaf.Common.main.ClientProxy", serverSide = "com.fnaf.Common.main.CommonProxy")
	public static CommonProxy proxy;
	
    
    @Instance(Reference.MODID)

    
    public static MAIN_FNAF modInstance;
    public HashMap<String, Object[]> cameraUsePositions = new HashMap<String, Object[]>();
    public static ConfigurationHandler config = new ConfigurationHandler();
	
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("Config File Succesfully Loaded and Named: " + Reference.MODID + ".cfg");
	
    	
	}

  
	
    
    
    
    
    
    Boolean Main;
    Boolean AI;
    Boolean Animation;
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
			
     	GameRegistry.registerWorldGenerator(new WorldGenSU(), 0);

     //   MinecraftForge.EVENT_BUS.register(new Events());
    //	FMLCommonHandler.instance().bus().register(new Events());
    	
    	
    	System.out.println("Details:" + Reference.MODID + ", " + Reference.version + ", " + Reference.beta);
    	
    	Configuration config = new Configuration(PreEvent.getSuggestedConfigurationFile());

    	config.load();

    	Main = config.getBoolean("Main Mod On?", "Boolean", false, "Turn off the Main Mod.");
    	Main = config.get(config.CATEGORY_GENERAL, "TurnOffTheMainMod?", false).getBoolean(false);
    	
    	AI = config.getBoolean("AI On?", "Boolean", true, "Enable or disable AI.");
    	AI = config.get(config.CATEGORY_GENERAL, "Disable AI", true).getBoolean(true);
    
    	Animation = config.getBoolean("Animation On?", "Boolean", true, "Enable or disable Animation Reccomemnded for slow computers.");
    	Animation = config.get(config.CATEGORY_GENERAL, "Disable Animation", true).getBoolean(true);
    	
    		
    	config.save();
 
    	
    	
    	GUIOverlayDev.load();
   
    	
    	MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    	
    	FMLCommonHandler.instance().bus().register(MAIN_FNAF.modInstance);
       	
    	EntityRegister.mainRegistry();
    	
       	FNAFItems.mainRegistry();
    	

    	MinecraftForge.EVENT_BUS.register(new TickHandler());
    		
    	proxy.registerRenderThings();
    	
    	
    	 }
    
    public static void log(String par1){
		log(par1, false);
	}
    public static boolean debuggingMode;
	

	public static void log(String par1, boolean isSevereError){
		if(MAIN_FNAF.debuggingMode){
			System.out.println(isSevereError ? "{MAIN_FNAF} {" + FMLCommonHandler.instance().getEffectiveSide() + "} {Severe}: " + par1 : "[main_fnaf] [" + FMLCommonHandler.instance().getEffectiveSide() + "] " + par1);
		}
	}
	public Object[] getUsePosition(String playerName) {
		return cameraUsePositions.get(playerName);
	}

	public void setUsePosition(String playerName, double x, double y, double z, float yaw, float pitch) {
		cameraUsePositions.put(playerName, new Object[]{x, y, z, yaw, pitch});
	}
	
	public boolean hasUsePosition(String playerName) {
		return cameraUsePositions.containsKey(playerName);
	}
	
	public void removeUsePosition(String playerName){
		cameraUsePositions.remove(playerName);
	}

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    		
    	
    }
    protected static final String VERSION = "{$Version}";

	public static String getVersion(){
		return VERSION;
	}
	

	
    
}
