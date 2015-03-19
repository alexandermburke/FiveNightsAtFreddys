package com.FnafVTwo.Common.Main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;

import com.FnafVTwo.Client.Items.Plushie;
import com.FnafVTwo.Client.Mobs.Models.BalloonBoy.BalloonBoy;
import com.FnafVTwo.Client.Mobs.Models.Bonnie.Bonnie;
import com.FnafVTwo.Client.Mobs.Models.Chica.Chica;
import com.FnafVTwo.Client.Mobs.Models.EndoSkeleton.EndoSkeleton;
import com.FnafVTwo.Client.Mobs.Models.Foxy.Foxy;
import com.FnafVTwo.Client.Mobs.Models.Freddy.Freddy;
import com.FnafVTwo.Common.tabs.FNAFCreativeTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
@Mod(modid="FnafVTwo", name="Five Nights At Freddys", version="2.0", acceptedMinecraftVersions="[1.7.10]")
public class FNAFRegistry {
	 public static FNAFRegistry modInstance;
	 

	
   public static CreativeTabs tabFNAFVTwo = new FNAFCreativeTab();
	   @SidedProxy(clientSide="com.FnafVTwo.Common.Main.ClientProxy", serverSide="com.FnafVTwo.Common.Main.ServerProxy")
	   public static ServerProxy proxy;
	 
	   
	   
	   //Blocks
	   
	   public static Block BalloonBoyPlushie;
	   public static Block BonniePlushie;
	   public static Block FreddyPlushie;
	   public static Block FoxyPlushie;
	   public static Block ChicaPlushie;
	   public static Block ToyBonniePlushie;
	   public static Block GoldenFreddyPlushie;
	   public static Block ManglePlushie;
	   public static Block SpringTrapPlushie;
	   public static Block MarionettePlushie;

	   //Mobs
	   public static Entity ChicaEntity;
	   public static Entity BonnieEntity;
	   public static Entity BalloonBoyEntity;
	   public static Entity EndoSkeletonEntity;
	   public static Entity FoxyEntity;
	   public static Entity FreddyEntity;
	   public static Entity GoldenFreddyEntity;
	   public static Entity MangleEntity;
	   public static Entity MarionetteEntity;
	   public static Entity SpringTrapEntity;
	   public static Entity ToyBonnieEntity;
	   public static Entity ToyChicaEntity;
	   public static Entity ToyFreddyEntity;
	   
	   
	   
	   //registery
	   
	   
	   @Mod.EventHandler
	  public void PreLoad(FMLPreInitializationEvent PreEvent)
	   {
		  //Register Entity
		   
		   BalloonBoy BalloonBoyEntity = new BalloonBoy();
		   Chica ChicaEntity = new Chica();
		   Bonnie BonnieEntity = new Bonnie();
		   EndoSkeleton EndoSkeletonEntity = new EndoSkeleton();
		   Foxy FoxyEntity = new Foxy();
		   Freddy FreddyEntity = new Freddy();
		   Golden_Freddy GoldenFreddyEntity = new Golden_Freddy();
		   Mangle MangleEntity = new Mangle();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   //Register Items
		   
		   
		   
		   
		   //Register Blocks
		   
		   
		   
		   BalloonBoyPlushie = new Plushie();
		   BonniePlushie = new Plushie();
		   FreddyPlushie = new Plushie();
		   FoxyPlushie = new Plushie();
		   ChicaPlushie = new Plushie();
		  
		  
		   
		   
		   
		   proxy.registerRenderThings();
		   
		   
		   
		   
	   }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   }
