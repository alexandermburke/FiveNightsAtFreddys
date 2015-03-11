package com.T0psid3.CreativeTabs;

import com.T0psid3.registry.FNAFMobRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MobsTab<MobsTab2> extends CreativeTabs {

	public static CreativeTabs tabBlockFNAF;

	public MobsTab(String label) {
		super(label);
		this.setBackgroundImageName("teleport.png");
	}

	@Override
	public Item getTabIconItem() {
		return FNAFMobRegistry.Bonnie;
	}

	 @SuppressWarnings("rawtypes")
	public MobsTab setCreativeTab(MobsTab tabMobs)
	  {
	    return null;
	  }}