package com.fnaf.Client.armor.bonnie;

import com.fnaf.Common.main.mainRegistry;

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
        this.setCreativeTab(mainRegistry.tabFnaf);
    }
    
    public String getArmorTexture(Item item, String name)
    {
    	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName("fnaf2" + ":" + unlocalizedName);
		item.setCreativeTab(mainRegistry.tabFnaf);
		return unlocalizedName;
		
		
    }
    }
