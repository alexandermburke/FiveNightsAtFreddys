package com.fnaf.Common.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.fnaf.Client.Items.Plushies.itemBalloonBoysPlushie;
import com.fnaf.Client.Items.Plushies.itemBonniesPlushie;
import com.fnaf.Client.Items.Plushies.itemChicasPlushie;
import com.fnaf.Client.Items.Plushies.itemFoxysPlushie;
import com.fnaf.Client.Items.Plushies.itemFreddysPlushie;
import com.fnaf.Client.main.Strings;
import com.fnaf.Client.main.main_fnaf;
import com.fnaf.Common.Blocks.AnimatronicSpawner;
import com.fnaf.Common.Blocks.Camera;
import com.fnaf.Common.Blocks.LootBox;
import com.fnaf.Common.Blocks.SteelOre;
import com.fnaf.Common.armor.bonnie.itemBonnie;
import com.fnaf.Common.armor.freddy.itemFreddy;
import com.fnaf.dev.itemEnterDevMode;

import cpw.mods.fml.common.registry.GameRegistry;

public class FNAFItems {
	public static void mainRegistry(){
		register();
		registerRecipes();
		addSmelting();
	}
	public static Item FreddyHelmet;
    public static Item BonnieHelmet;
    public static Item BonnieChestplate;
    public static Item BonnieLeggings;
    public static Item BonnieBoots;
	public static Item BGuitar;
	public static Item BBPlushie;
	public static Item PlasticIngot;
	public static Item SteelIngot;
	public static Item Foxyshook1;
	public static Item CPlushie;
	public static Item Cupcake;
	public static Item C;
	public static Item FOPlushie;
	public static Item FRPlushie;
	public static Item FreddysMask;
	public static Item FreddysMic;
	public static Item BPlushie;
	public static Item GPlushie;
	public static Block SteelOres;
	public static Block plasticOres;
	public static Block CB;
	public static Block Spawn;
	public static Item Knife;

	
	//GUI
	public static Item E;
	public static Block Loot;
	
	public static void register()
	{
		 
	//	Loot = new LootBox().setBlockName("textures/blocks/models/lootbox.png");
		E = new itemEnterDevMode();
		BPlushie = new itemBonniesPlushie();
		FRPlushie = new itemFreddysPlushie();
		BBPlushie = new itemBalloonBoysPlushie();
		CPlushie = new itemChicasPlushie();
		FOPlushie = new itemFoxysPlushie();
		GPlushie = new itemFreddysPlushie();
		Cupcake = new ItemPlush();
		
		Knife = new ItemPlush();
		
		C = new Tablet();
		
		PlasticIngot = new ItemIngot();
		SteelIngot = new ItemIngot();
		
		
		
		Spawn = new AnimatronicSpawner();
			
		
		
		Foxyshook1 = new FoxysHook();
		BGuitar = new FoxysHook();
		FreddysMic = new FoxysHook();
		
		CB = new Camera();
		SteelOres = new SteelOre();
		plasticOres = new SteelOre();
	//	registerTheItem(E, "Enter Dev Mode");
		registerTheItem(FreddysMic, "Freddy's Microphone");
		registerTheItem(Cupcake, "Chica's Cupcake");
		registerBlock(Spawn, "Animatronic Spawner");
		registerBlock(SteelOres, "Steel Ore");
		registerBlock(plasticOres, "Plastic Ore");
		registerBlock(CB, "Camera Block");
		registerTheItem(C, "Camera +");
		registerTheItem(PlasticIngot, "Plastic Ingot");
		registerTheItem(SteelIngot, "Steel Ingot");
		registerTheItem(BPlushie, "Bonnie's Plushie");
		registerTheItem(FRPlushie, "Freddy's Plushie");
		registerTheItem(FOPlushie, "Foxy's Plushie");
		registerTheItem(CPlushie, "Chica's Plushie");
		registerTheItem(BBPlushie, "Balloon Boy's Plushie");
		registerTheItem(Foxyshook1, "Foxys Hook");
		registerTheItem(GPlushie, "Golden Freddy's Plushie");
		registerTheItem(Knife, "knife");
		registerTheItem(BGuitar, "Bonnie's Guitar");
		 	
		
			BonnieHelmet = new itemBonnie(0);
			registerArmor(BonnieHelmet, "Bonnie Head");
			
			BonnieChestplate = new itemBonnie(1);
			registerArmor(BonnieChestplate, "Bonnie Torso");
	        
			BonnieLeggings = new itemBonnie(2);
			registerArmor(BonnieLeggings, "Bonnie Legs");
	        
	    	BonnieBoots = new itemBonnie(3);
	    	registerArmor(BonnieBoots, "Bonnie Feet");
	
			FreddysMask = new itemFreddy(0);
			registerArmor(FreddysMask, "Freddy Mask");
	}
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(FNAFItems.FreddysMic, 1), new Object[] {"CXX", "XCX", "XXC", 'C', FNAFItems.PlasticIngot, '0', Material.wood});
		GameRegistry.addRecipe(new ItemStack(FNAFItems.FreddysMask, 1), new Object[] {"0XC", "0XC", "0XC", 'C', FNAFItems.SteelIngot, '0', FNAFItems.PlasticIngot});
		GameRegistry.addRecipe(new ItemStack(FNAFItems.Foxyshook1, 1), new Object[] {"CXX", "XCX", "XXC", 'C', FNAFItems.SteelIngot, '0', Material.wood});
		GameRegistry.addRecipe(new ItemStack(FNAFItems.BGuitar, 1), new Object[] {"CX0", "XCX", "0XC", 'C', FNAFItems.PlasticIngot, '0', FNAFItems.SteelIngot});
		GameRegistry.addRecipe(new ItemStack(FNAFItems.Spawn, 1), new Object[] {"CXX", "XXX", "XXX", 'C', FNAFItems.PlasticIngot, '0', FNAFItems.SteelIngot});
		
	}
	private static void addSmelting()
	{
		GameRegistry.addSmelting(FNAFItems.plasticOres, new ItemStack(FNAFItems.PlasticIngot, 1), 5.0F);
		GameRegistry.addSmelting(FNAFItems.BGuitar, new ItemStack(FNAFItems.PlasticIngot, 1), 5.0F);
		GameRegistry.addSmelting(FNAFItems.SteelOres, new ItemStack(FNAFItems.SteelIngot, 1), 5.0F);
	}

	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Strings.MODID + ":" + unlocalizedName);
		item.setCreativeTab(main_fnaf.tabFnaf2);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	private static void registerTheItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Strings.MODID + ":" + unlocalizedName);
		item.setCreativeTab(main_fnaf.tabFnaf);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	private static void registerBlock(Block block, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		block.setBlockName(unlocalizedName);
		block.setBlockTextureName(Strings.MODID + ":" + unlocalizedName);
		block.setCreativeTab(main_fnaf.tabFnaf);
		
		GameRegistry.registerBlock(block, unlocalizedName);
	}

}
