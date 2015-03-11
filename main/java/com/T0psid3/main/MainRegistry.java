package com.T0psid3.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import com.T0psid3.CreativeTabs.MobsTab;
import com.T0psid3.CreativeTabs.blockTab;
import com.T0psid3.GuiRegistry.GlobalEvents;
import com.T0psid3.Mobs.Bonnie;
import com.T0psid3.Mobs.Foxy;
import com.T0psid3.Mobs.Freddy;
import com.T0psid3.Mobs.Mangle;
import com.T0psid3.Mobs.Mangle.Entitymangle;
import com.T0psid3.Mobs.Marionette;
import com.T0psid3.Mobs.SpringTrap;
import com.T0psid3.Mobs.Withered_Bonnie;
import com.T0psid3.Mobs.Withered_Chica;
import com.T0psid3.Mobs.Withered_Freddy;
import com.T0psid3.achievement.FNAFAchievements;
import com.T0psid3.blocks.FPresent;
import com.T0psid3.blocks.MPresent;
import com.T0psid3.blocks.Main_tile;
import com.T0psid3.blocks.Office_Door_Bottom;
import com.T0psid3.blocks.Office_Door_Top;
import com.T0psid3.blocks.PPresent;
import com.T0psid3.config.FNAFConfig;
import com.T0psid3.donator.Donators;
import com.T0psid3.gui.GuiHandler;
import com.T0psid3.gui.Overlay;
import com.T0psid3.gui.Overlay.GUIRenderEventClass;
import com.T0psid3.hud.FNAFHud;
import com.T0psid3.hud.FNAFRender;
import com.T0psid3.items.Chicas_Cupcake;
import com.T0psid3.items.foxys_hook;
import com.T0psid3.keybind.Camera;
import com.T0psid3.lib.RefStrings;
import com.T0psid3.misc.CreativeTabBlocks;
import com.T0psid3.updatechecker.Update;
import com.T0psid3.updatechecker.Updatechecker;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = RefStrings.MODID, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide =  RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
    public static MainRegistry instance;
	private static Object MobsTab;
    @SuppressWarnings("rawtypes")
    public static final MobsTab tabMobs = new MobsTab("tabMobs").setCreativeTab(null);
    public static final blockTab tabBlocks = new blockTab("tabBlocks").setCreativeTab(null);
    // Static-ing Files and Variables :P
    // fnaf 1-9 + fnafFood + FnafSword are Variables xD
    static Camera fnaf9 = new Camera();
	static Overlay fnaf0 = new Overlay();
	static Foxy fnaf3 = new Foxy();
	static SpringTrap fnaf4 = new SpringTrap();
	static Marionette fnaf5 = new Marionette();
	static Withered_Bonnie fnaf6 = new Withered_Bonnie();
	static Withered_Chica fnaf7 = new Withered_Chica();
	static Withered_Freddy fnaf8 = new Withered_Freddy();
	static Chicas_Cupcake fnafFood = new Chicas_Cupcake();
	static foxys_hook fnafSword = new foxys_hook();
	
	// Ref strings MODID and Version DONT TOUCH 
	
	
	    public static final String MODID = "fnaf";
	    public static final String VERSION = "2.0.0";
	    
	    public void init(FMLInitializationEvent event)  {
	    
	    	//Proxy, TileEntity, entity, Gui, and packet registering
	    	
	    	
	    }
	    
	    
	    
	    //Pre-load
	    
	private static Block blockTab(String string) {
			// TODO Auto-generated method stub
			return null;
		}



	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		Office_Door_Top.mainRegistry();
		Main_tile.mainRegistry();
		PPresent.mainRegistry();
		FPresent.mainRegistry();
		MPresent.mainRegistry();
		Office_Door_Bottom.mainRegistry();
		proxy.registerRenderInfo();
		Camera.mainregistry();
		
		//Load
		
	}
	public static void load(FMLInitializationEvent event) {
	
		
		
		
	}
	
	//Post load (Post = after)
	@SuppressWarnings("deprecation")
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass()); 
		 LanguageRegistry.instance().addStringLocalization("itemGroup.tabCustom", "en_US", "tabKismet");
		
}																			
	{
	
		new FNAFConfig();

//Item registry

}
public static void registerBlock(Block fPresent, String string) {

	
}

			//config + Check for updates
public static Configuration configFile;
	public static Update latestUpdate;
 

		//Pre init
	
	
	@SuppressWarnings("unchecked")
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
		// Gui registry 
		
		MinecraftForge.EVENT_BUS.register(new GlobalEvents());
		MinecraftForge.EVENT_BUS.register(new GUIRenderEventClass());
		MinecraftForge.EVENT_BUS.register(new Overlay());
		
		MinecraftForge.EVENT_BUS.register(new FNAFRender());
		//Same Classes for now :/
	    MinecraftForge.EVENT_BUS.register(new FNAFHud());
	    
	    
	    
		Updatechecker updateChecker = new Updatechecker();
		updateChecker.handleUpdates();
		Donators.loadDonators();
		FNAFAchievements.register();  
		
		
	}
	
	 //Gui handlers
		
	public static class GuiHandler implements IGuiHandler {
		@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		return null;}
		@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		return null;}
		}
	}