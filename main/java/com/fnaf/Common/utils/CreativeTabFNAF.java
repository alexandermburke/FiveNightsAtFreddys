package com.fnaf.Common.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class CreativeTabFNAF extends CreativeTabs {
 
    public CreativeTabFNAF(int id, String unlocalizedName) {
 
        super(id, unlocalizedName);
    }
 
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
 
        //return Item.getItemFromBlock(Blocks.chest);
        return Items.fireworks;
    }
}