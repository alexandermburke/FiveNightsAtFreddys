package com.T0psid3.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class BiomeFloorCheck extends Block {

	public BiomeFloorCheck(Material p_i45394_1_)  { 
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block BiomeFloorCheck;
	
	public static void initializeBlock() {
		BiomeFloorCheck = new BiomeFloorCheck(Material.ground).setBlockName("Old floor").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":BiomeFloor");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(BiomeFloorCheck, BiomeFloorCheck.getUnlocalizedName());
	}

	public Object setUnlocalizedName(String string) {
		// TODO Auto-generated method stub
		return BiomeFloorCheck;
	}

}
