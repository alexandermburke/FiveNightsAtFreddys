package com.fnaf.Common.Items;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.fnaf.Common.Blocks.AnimatronicSpawner;
import com.fnaf.Common.Blocks.Camera;
import com.fnaf.Common.Blocks.SteelOre;
import com.fnaf.Common.Blocks.render.RenderBox;
import com.fnaf.Common.armor.bonnie.itemBonnie;
import com.fnaf.Common.armor.freddy.itemFreddy;
import com.fnaf.Common.mod.MAIN_FNAF;
import com.fnaf.Common.mod.Reference;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class FNAFItems {
	public static void mainRegistry(){
		register();
		registerRecipes();
		addSmelting();
	}
	
	public static Item Pizza;
	public static ItemStack FreddyHelmet;
	public static Item Guitar;
	public static Item Cupcake;
	public static Item Tablet;
	public static Item FreddysMask;
	public static Item Microphone;
	public static Item Knife;
	public static Item flashlight;
	public static Item Hook;

	public static Item logo;

	static ToolMaterial Foxy = EnumHelper.addToolMaterial("Hook", 2, 750, 7, 6.0F, 7);
		
	
	public static void register()
	{
		 
		Cupcake = new ItemPlush();
		Knife = new ItemPlush();
		Tablet = new Tablet();
		Pizza = new ItemIngot();
		Hook = new FoxysHook(Foxy);
		Guitar = new ItemIngot();
		Microphone = new ItemIngot();
		flashlight = new FlashLight();
		logo = new ItemIngot();
		
		
		registerTheItem(Microphone, "Freddy's Microphone");
		registerTheItem(Cupcake, "Chica's Cupcake");
		registerTheItem(Tablet, "Tablet");
		registerTheItem(Knife, "knife");
		registerTheItem(Guitar, "Bonnie's Guitar");
		registerTheItem(Pizza, "pizza");
		registerTheItem(flashlight, "Flashlight");
		registerTheItem(Hook, "hook");
		RegisterSpecialItem(logo, "logo");
		
		
		
		ArmorMaterial Useless = EnumHelper.addArmorMaterial("useless", 0, new int[]{0, 0, 0, 0}, 0);
			FreddysMask = new itemFreddy(0);
			registerArmor(FreddysMask, "Freddy Mask");
	}
	public static void registerRecipes()
	{
	}
	private static void addSmelting()
	{
		GameRegistry.addSmelting(FNAFItems.Guitar, new ItemStack(Items.iron_ingot, 1), 5.0F);
	}

	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Reference.MODID + ":" + unlocalizedName);
		item.setCreativeTab(MAIN_FNAF.tabFnaf);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	private static void registerTheItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Reference.MODID + ":" + unlocalizedName);
		item.setCreativeTab(MAIN_FNAF.tabFnaf);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}

	private static void RegisterSpecialItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Reference.MODID + ":" + unlocalizedName);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}

}
