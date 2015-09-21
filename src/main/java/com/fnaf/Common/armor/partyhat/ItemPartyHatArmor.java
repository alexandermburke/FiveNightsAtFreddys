package com.fnaf.Common.armor.partyhat;

import com.fnaf.Common.main.Reference;
import com.fnaf.Common.main.MAIN_FNAF;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemPartyHatArmor extends ItemArmor
{
    public ItemPartyHatArmor(ArmorMaterial material, int renderIndex, int armorPiece)
    {
        super(material, renderIndex, armorPiece);
        this.setCreativeTab(MAIN_FNAF.tabFnaf);
    }
    
    public String getArmorTexture(Item item, String name)
    {
    	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(Reference.MODID + ":" + unlocalizedName);
		item.setCreativeTab(MAIN_FNAF.tabFnaf);
		return unlocalizedName;
		
		
    }
    }
