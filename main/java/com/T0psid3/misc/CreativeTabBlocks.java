package com.T0psid3.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabBlocks extends CreativeTabs
{
	public CreativeTabBlocks()
	{
		super("FNAF Blocks");
	}

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(null);
	}
}