package com.T0psid3.CreativeTabs;

import com.T0psid3.block.FNAFBlocks;
import com.T0psid3.registry.FNAFItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class blockTab extends CreativeTabs {

	public static CreativeTabs tabBlockFNAF;

	public blockTab(String label) {
		super(label);
		this.setBackgroundImageName("teleport.png");
	}

	public Block getTabIconBlock() {
		return FNAFBlocks.PPresent;
	}

	public blockTab setCreativeTab(blockTab tabBlocks)
	  {
	    return null;
	  }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null; 
	}}
