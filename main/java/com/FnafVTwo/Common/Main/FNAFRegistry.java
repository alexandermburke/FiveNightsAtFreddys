package com.FnafVTwo.Common.Main;

import net.minecraft.creativetab.CreativeTabs;

import com.FnafVTwo.Common.utils.FNAFCreativeTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid="FnafVTwo", name="Five Nights At Freddys", version="2.0", acceptedMinecraftVersions="[1.7.10]")
public class FNAFRegistry {
	 public static FNAFRegistry Instance;
	 
// EntityPuppet.mainRegistry();
	
   public static CreativeTabs tabFNAFVTwo = new FNAFCreativeTab();
	   @SidedProxy(clientSide="com.FnafVTwo.Common.Main.ClientProxy", serverSide="com.FnafVTwo.Common.Main.ServerProxy")
	   public static ServerProxy proxy;
	  
	   
	   
	   
	   @Mod.EventHandler
	  public void PreLoad(FMLPreInitializationEvent PreEvent)
	   {
		   
		   
		   //register Entitys
		   proxy.registerRenderThings();
		   
		   
		   
		   
	   }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   }
