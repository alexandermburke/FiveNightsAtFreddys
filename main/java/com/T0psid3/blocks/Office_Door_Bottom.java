package com.T0psid3.blocks;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class Office_Door_Bottom extends Block {

	public Office_Door_Bottom(Material p_i45394_1_) {
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block Office_Door_Bottom;
	
	public static void initializeBlock() {
		Office_Door_Bottom = new PPresent(Material.ground).setBlockName("Office Door part two").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":Office_Door_Bottom");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(Office_Door_Bottom,Office_Door_Bottom.getUnlocalizedName());
	}

}
