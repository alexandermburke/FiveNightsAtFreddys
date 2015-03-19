package com.FnafVTwo.Common.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FNAFCreativeTab extends CreativeTabs
	  
{
	public FNAFCreativeTab() 
	{
		super("FNAF");
	}

 @SideOnly(Side.CLIENT)
 public Item getTabIconItem()
	{
		return Items.bread;
	}
 }


