package com.fnaf.Client.main;

import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import com.fnaf.Client.commands.Commands;
import com.fnaf.Client.event.Events;
import com.fnaf.Client.gui.GUIOverlayDev;
import com.fnaf.Client.gui.GuiHelper;
import com.fnaf.Client.gui.GuiMainMenuFNAF;
import com.fnaf.Client.handler.ConfigurationHandler;
import com.fnaf.Client.registry.EntityRegister;
import com.fnaf.Client.utils.CreativeTabFNAF;
import com.fnaf.Client.utils.CreativeTabFNAF2;
import com.fnaf.Client.utils.SpawnEvent;
import com.fnaf.Common.Items.FNAFItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MODID, name = Reference.name, version = Reference.version)
public class main_fnaf 
{
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
	
	@SidedProxy(clientSide = "com.fnaf.Client.main.ClientProxy", serverSide = "com.fnaf.Client.main.CommonProxy")
	public static CommonProxy proxy;
	
    
    @Instance(Reference.MODID)

    
    public static main_fnaf modInstance;
    public HashMap<String, Object[]> cameraUsePositions = new HashMap<String, Object[]>();
    public static ConfigurationHandler config = new ConfigurationHandler();
	
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println("Config File Succesfully Loaded and Named: " + Reference.MODID + ".cfg");
		configFile.load(config);
        if(configFile.hasChanged())
        {
            configFile.save();
            System.out.println("Config File Successfully Saved to .minecraft/config/" + Reference.MODID + ".cfg");
        }

    	
	}

    GuiMainMenuFNAF Override = new GuiMainMenuFNAF();
	Minecraft mc = Minecraft.getMinecraft();
    
		@SubscribeEvent
    	public void MainMenuOverride(GuiOpenEvent event) {
		
	        if (mc.currentScreen instanceof GuiMainMenu) {
	        	
	        	 GuiHelper.addOverride(GuiMainMenu.class, new GuiMainMenuFNAF());
			
	        }
			
	}
	
	
    
    
    @EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
    	Commands.register(event);
    	
	}
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	

        MinecraftForge.EVENT_BUS.register(new Events());
    	FMLCommonHandler.instance().bus().register(new Events());
    	
    	
    	System.out.println("Details:" + Reference.MODID + ", " + Reference.version + ", " + Reference.beta);
    	

    	
    	
    	GUIOverlayDev.load();
   
    	
    	MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    	
    	FMLCommonHandler.instance().bus().register(main_fnaf.modInstance);
       	
    	EntityRegister.mainRegistry();
    	
       	FNAFItems.mainRegistry();
    	
    	TickHandler.mainregistry();
    	
    	proxy.registerRenderThings();
    	
    	
    	System.out.println("Items, Entitys, and Blocks Loaded for:" + Reference.version + ", " + Reference.MODID );
    	 }
    
    public static void log(String par1){
		log(par1, false);
	}
    public static boolean debuggingMode;
	

	public static void log(String par1, boolean isSevereError){
		if(main_fnaf.debuggingMode){
			System.out.println(isSevereError ? "{main_fnaf} {" + FMLCommonHandler.instance().getEffectiveSide() + "} {Severe}: " + par1 : "[main_fnaf] [" + FMLCommonHandler.instance().getEffectiveSide() + "] " + par1);
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
