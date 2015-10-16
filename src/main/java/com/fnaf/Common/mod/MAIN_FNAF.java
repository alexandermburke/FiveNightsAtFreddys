package com.fnaf.Common.mod;

import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import com.fnaf.Client.event.Events;
import com.fnaf.Client.registry.EntityRegister;
import com.fnaf.Client.utils.CreativeTabFNAF;
import com.fnaf.Client.utils.SpawnEvent;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.world.worldtype.WorldTypes;

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
	public static CreativeTabs tabFnaf = new CreativeTabFNAF("standard");
	public static Configuration Config;
	
	
	@SidedProxy(clientSide = "com.fnaf.Common.mod.ClientProxy", serverSide = "com.fnaf.Common.mod.CommonProxy")
	public static CommonProxy proxy;
	
    
    @Instance(Reference.MODID)

    
    public static MAIN_FNAF modInstance;
    public HashMap<String, Object[]> cameraUsePositions = new HashMap<String, Object[]>();
	
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
    	
	}

  
	
    
    
    
    
    
    Boolean Main;
    Boolean AI;
    Boolean Animation;
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	

			
    	
    	
    	
    	Configuration config = new Configuration(PreEvent.getSuggestedConfigurationFile());

    	config.load();

    	Main = config.getBoolean("Main Mod On?", "Boolean", false, "Turn off the Main Mod.");
    	Main = config.get(config.CATEGORY_GENERAL, "TurnOffTheMainMod?", false).getBoolean(false);
    	
    	AI = config.getBoolean("AI On?", "Boolean", true, "Enable or disable AI.");
    	AI = config.get(config.CATEGORY_GENERAL, "Disable AI", true).getBoolean(true);
    
    	Animation = config.getBoolean("Animation On?", "Boolean", true, "Enable or disable Animation Reccomemnded for slow computers.");
    	Animation = config.get(config.CATEGORY_GENERAL, "Disable Animation", true).getBoolean(true);
    	
    		
    	config.save();
 
    	

        MinecraftForge.EVENT_BUS.register(new WorldTypes("FNAF"));
    	FMLCommonHandler.instance().bus().register(new WorldTypes("FNAF"));    	
   
    	MinecraftForge.EVENT_BUS.register(new TickHandler());
    	MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    	
    	FMLCommonHandler.instance().bus().register(MAIN_FNAF.modInstance);       	
    	
    	EntityRegister.mainRegistry();
       	FNAFItems.mainRegistry();
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
