package com.fnaf.Common.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Camera extends Block
{
	public Camera()
	{
		super(Material.cactus);
		this.setHardness(200F);
		this.setResistance(1500F);
		this.setHarvestLevel("pickaxe", 3);
	}



	public boolean renderAsNormalBlock()
	{
	    return false;
	}

	public boolean isOpaqueCube()
	{
	    return false;
	}

	public int getRenderType()
	{
		return -1;
		
	}

}

