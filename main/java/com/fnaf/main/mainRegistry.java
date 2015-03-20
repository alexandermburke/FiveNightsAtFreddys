package com.fnaf.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;

import com.fnaf.balloonboy.EntityBalloonBoy;
import com.fnaf.bonnie.EntityBonnie;
import com.fnaf.chica.EntityChica;
import com.fnaf.endo.EntityEndo;
import com.fnaf.foxy.EntityFoxy;
import com.fnaf.freddy.EntityFreddy;
import com.fnaf.goldenfreddy.EntityGoldenFreddy;
import com.fnaf.main.Strings;
import com.fnaf.mangle.EntityMangle;
import com.fnaf.puppet.EntityPuppet;
import com.fnaf.toybonnie.EntityToyBonnie;
import com.fnaf.toychica.EntityToyChica;
import com.fnaf.toyfreddy.EntityToyFreddy;
import com.fnaf.utils.CreativeTabFNAF;
import com.fnaf.utils.SpawnEvent;

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
	
	@SidedProxy(clientSide = "com.fnaf.main.ClientProxy", serverSide = "com.fnaf.main.ServerProxy")
	public static ServerProxy proxy;
    
    @Instance(Strings.MODID)
    public static mainRegistry modInstance;
    
    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	
    	MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    	
    	EntityPuppet.mainRegistry();
    	EntityFreddy.mainRegistry();
    	EntityBalloonBoy.mainRegistry();
    	EntityChica.mainRegistry();
    	EntityFoxy.mainRegistry();
    	EntityGoldenFreddy.mainRegistry();
    	EntityBonnie.mainRegistry();
    	EntityMangle.mainRegistry();
    	EntityToyBonnie.mainRegistry();
    	EntityToyChica.mainRegistry();
    	EntityToyFreddy.mainRegistry();
    	EntityEndo.mainRegistry();
    	
    	
    	proxy.registerRenderThings();
    	
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    		
    	
    }
    
    
}
