package com.T0psid3.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class MPresent  extends Block {

	public MPresent(Material p_i45394_1_) {
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block MPresent;
	
	public static void initializeBlock() {
		MPresent = new PPresent(Material.ground).setBlockName("Mangles Present").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":Mangles Present");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(MPresent, MPresent.getUnlocalizedName());
	}

}
