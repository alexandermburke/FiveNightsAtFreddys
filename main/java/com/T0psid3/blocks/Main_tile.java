package com.T0psid3.blocks;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class Main_tile extends Block {

	public Main_tile(Material p_i45394_1_) {
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block Main_Tile;
	
	public static void initializeBlock() {
		Main_Tile = new PPresent(Material.ground).setBlockName("Main Tile").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":Main_Tile");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(Main_Tile, Main_Tile.getUnlocalizedName());
	}

	public Block setUnlocalizedName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
