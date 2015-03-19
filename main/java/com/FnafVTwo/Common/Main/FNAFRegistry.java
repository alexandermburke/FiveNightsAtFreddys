package com.FnafVTwo.Common.Main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import com.FnafVTwo.Client.BalloonBoy.EntityBalloonBoy;
import com.FnafVTwo.Client.Items.Plushie;
import com.FnafVTwo.Common.utils.FNAFCreativeTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid="FnafVTwo", name="Five Nights At Freddys", version="2.0", acceptedMinecraftVersions="[1.7.10]")
public class FNAFRegistry {
	 public static FNAFRegistry modInstance;
	 

	
   public static CreativeTabs tabFNAFVTwo = new FNAFCreativeTab();
	   @SidedProxy(clientSide="com.FnafVTwo.Common.Main.ClientProxy", serverSide="com.FnafVTwo.Common.Main.ServerProxy")
	   public static ServerProxy proxy;
	  
	   
	   public static Block BalloonBoyPlushie;
	   public static Block BonniePlushie;
	   public static Block FreddyPlushie;
	   public static Block FoxyPlushie;
	   public static Block ChicaPlushie;
	   

	   
	   //registery
	   
	   
	   @Mod.EventHandler
	  public void PreLoad(FMLPreInitializationEvent PreEvent)
	   {
		   //Register Items
		   
		   
		   
		   
		   //Register Blocks
		   
		   
		   
		   BalloonBoyPlushie = new Plushie();
		   BonniePlushie = new Plushie();
		   FreddyPlushie = new Plushie();
		   FoxyPlushie = new Plushie();
		   ChicaPlushie = new Plushie();
		  
		   //register Entitys
		   EntityBalloonBoy.FNAFRegistry();
		   
		   
		   
		   proxy.registerRenderThings();
		   
		   
		   
		   
	   }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   }
