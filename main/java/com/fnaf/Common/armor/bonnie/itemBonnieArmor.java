package com.fnaf.Common.armor.bonnie;

import com.fnaf.Client.main.Strings;
import com.fnaf.Client.main.main_fnaf;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class itemBonnieArmor extends ItemArmor
{
    public itemBonnieArmor(ArmorMaterial material, int renderIndex, int armorPiece)
    {
        super(material, renderIndex, armorPiece);
        this.setCreativeTab(main_fnaf.tabFnaf);
    }
    
    public String getArmorTexture(Item item, String name)
    {
    	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Strings.MODID + ":" + unlocalizedName);
		item.setCreativeTab(main_fnaf.tabFnaf);
		return unlocalizedName;
		
		
    }
    }
