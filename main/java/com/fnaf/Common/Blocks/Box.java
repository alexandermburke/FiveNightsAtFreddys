package com.fnaf.Common.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Box extends Block{

	protected Box(Material p_i45394_1_) {
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
		
	}


	public boolean renderAsNormalBlock(){
		return false;
	}

	public boolean isNormalCube(){
		return false;
	}

	public boolean isOpaqueCube(){
		return false;
	}

	public int getRenderType(){
		return -1;
	}

}
