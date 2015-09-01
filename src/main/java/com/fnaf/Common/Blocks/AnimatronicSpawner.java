package com.fnaf.Common.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class AnimatronicSpawner extends Block {

	public AnimatronicSpawner() {		
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
		
		
	}
	
}
