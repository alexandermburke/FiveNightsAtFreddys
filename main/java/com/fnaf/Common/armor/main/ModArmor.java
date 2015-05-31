package com.fnaf.Common.armor.main;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.armor.bonnie.itemBonnie;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModArmor {
	
	
public static Item BonnieHelmet;
public static Item BonnieChestplate;
public static Item BonnieLeggings;
public static Item BonnieFeet;



	public static void init()
	{
		BonnieHelmet = (new itemBonnie(0).setUnlocalizedName("bonnie_helmet"));
		GameRegistry.registerItem(BonnieHelmet, "bonnie_helmet", Strings.MODID);
		
		BonnieChestplate = (new itemBonnie(1).setUnlocalizedName("bonnie_chestplate"));
		GameRegistry.registerItem(BonnieChestplate, "bonnie_chestplate", Strings.MODID);
		
		BonnieLeggings = (new itemBonnie(2).setUnlocalizedName("bonnie_leggings"));
		GameRegistry.registerItem(BonnieLeggings, "bonnie_leggings", Strings.MODID);
		
		
}
}
