package com.T0psid3.blocks;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;
import com.T0psid3.misc.CreativeTabBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class FPresent extends Block {

	public FPresent(Material p_i45394_1_)  { 
		super(p_i45394_1_);
		
	}

	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}

	public static Block FPresent;
	
	public static void initializeBlock() {
		FPresent = new PPresent(Material.ground).setBlockName("Freddys Present").setCreativeTab(MainRegistry.tabBlocks).setBlockTextureName(RefStrings.MODID + ":Freddys Present");
	}
	
	public static void registerItem() {
		GameRegistry.registerBlock(FPresent, FPresent.getUnlocalizedName());
	}

	public Object setUnlocalizedName(String string) {
		// TODO Auto-generated method stub
		return FPresent;
	}

}
