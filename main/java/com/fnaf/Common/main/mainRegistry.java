package com.fnaf.Common.main;

import com.fnaf.Client.Entity.balloonboy.EntityBalloonBoy;
import com.fnaf.Client.Entity.bonnie.EntityBonnie;
import com.fnaf.Client.Entity.chica.EntityChica;
import com.fnaf.Client.Entity.endo.EntityEndo;
import com.fnaf.Client.Entity.foxy.EntityFoxy;
import com.fnaf.Client.Entity.freddy.EntityFreddy;
import com.fnaf.Client.Entity.goldenfreddy.EntityGoldenFreddy;
import com.fnaf.Client.Entity.mangle.EntityMangle;
import com.fnaf.Client.Entity.springtrap.EntitySpringtrap;
import com.fnaf.Client.Entity.toybonnie.EntityToyBonnie;
import com.fnaf.Client.Entity.toychica.EntityToyChica;
import com.fnaf.Client.Entity.toyfreddy.EntityToyFreddy;
import com.fnaf.Client.Items.FoxysHook;
import com.fnaf.Client.Items.fnaf2Items;
import com.fnaf.Common.utils.CreativeTabFNAF;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class mainRegistry
{
	
	public static CreativeTabs tabFnaf = new CreativeTabFNAF(CreativeTabs.getNextID(), "standard");
	
	@SidedProxy(clientSide = "com.fnaf.Common.main.ClientProxy", serverSide = "com.fnaf.Common.main.ServerProxy")
	public static ServerProxy proxy;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	MinecraftForge.EVENT_BUS.register(new com.fnaf.Common.utils.SpawnEvent());
    	
    	EntityEndo.mainRegistry();
    	EntityFreddy.mainRegistry();
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
    	EntityEndo.mainRegistry();
    	fnaf2Items.mainRegistry();
    	
    	
    	
    	proxy.registerRenderThings();
    	
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    		
    	
    }
    
    
}
