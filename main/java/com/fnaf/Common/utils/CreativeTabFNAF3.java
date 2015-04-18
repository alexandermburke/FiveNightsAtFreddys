package com.fnaf.Common.utils;

import com.fnaf.Client.Items.fnaf2Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class CreativeTabFNAF3 extends CreativeTabs {
 
    public CreativeTabFNAF3(int id, String unlocalizedName) {
 
        super(id, unlocalizedName);
    }
 
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
 
        //return Item.getItemFromBlock(Blocks.chest);
        return fnaf2Items.C;
    }
}