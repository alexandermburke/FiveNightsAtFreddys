package com.fnaf.Client.main;

import com.fnaf.Client.handler.ConfigurationHandler;
import com.fnaf.Client.utils.CreativeTabFNAF;
import com.fnaf.Client.utils.CreativeTabFNAF2;
import com.fnaf.Client.utils.CreativeTabFNAF3;
import com.fnaf.Client.utils.SpawnEvent;
import com.fnaf.Common.Blocks.LootBox;
import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnie;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoy;
import com.fnaf.Common.Entity.bonnie.EntityBonnie;
import com.fnaf.Common.Entity.chica.EntityChica;
import com.fnaf.Common.Entity.foxy.EntityFoxy;
import com.fnaf.Common.Entity.freddy.EntityFreddy;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddy;
import com.fnaf.Common.Entity.mangle.EntityMangle;
import com.fnaf.Common.Entity.puppet.EntityPuppet;
import com.fnaf.Common.Entity.springtrap.EntitySpringtrap;
import com.fnaf.Common.Entity.toybonnie.EntityToyBonnie;
import com.fnaf.Common.Entity.toychica.EntityToyChica;
import com.fnaf.Common.Entity.toyfreddy.EntityToyFreddy;
import com.fnaf.Common.Items.FNAFItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class main_fnaf
{
	public static CreativeTabs tabFnaf3 = new CreativeTabFNAF3("standard3");
	public static CreativeTabs tabFnaf2 = new CreativeTabFNAF2("standard2");
	public static CreativeTabs tabFnaf = new CreativeTabFNAF("standard");
	public static Configuration Config;
	
	public static Configuration configFile;	
	
	@SidedProxy(clientSide = "com.fnaf.Client.main.ClientProxy", serverSide = "com.fnaf.Client.main.ServerProxy")
	public static ServerProxy proxy;
    
    @Instance(Strings.MODID)
    public static main_fnaf modInstance;
	
	public static ConfigurationHandler configHandler = new ConfigurationHandler();
	
    @EventHandler
	public void postInit(FMLPostInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(main_fnaf.configHandler);
	}
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    	FMLCommonHandler.instance().bus().register(main_fnaf.modInstance);
    	
    	EntityPuppet.mainRegistry();
    	EntityFreddy.mainRegistry();
    	EntityWitheredBonnie.mainRegistry();
    	EntityBalloonBoy.mainRegistry();
    	EntitySpringtrap.mainRegistry();
    	EntityChica.mainRegistry();
    	EntityFoxy.mainRegistry();
    	EntityGoldenFreddy.mainRegistry();
    	EntityBonnie.mainRegistry();
    	EntityMangle.mainRegistry();
    	EntityToyBonnie.mainRegistry();
    	EntityToyChica.mainRegistry();
    	EntityToyFreddy.mainRegistry();
    	FNAFItems.mainRegistry();
    	TickHandler.mainregistry();
    	proxy.registerRenderThings();
    	
    	
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
