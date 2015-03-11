package com.T0psid3.blocks;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PPresent extends Block {

	public PPresent(Material p_i45394_1_) {
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block PPresent;
	
	public static void initializeBlock() {
		PPresent = new PPresent(Material.ground).setBlockName("Puppets Present").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":Puppets Present");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(PPresent, PPresent.getUnlocalizedName());
	}

}
