package com.fnaf.Client.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCamera extends Block
{
	public BlockCamera()
	{
		super(Material.fire);
		this.setHardness(200F);
		this.setResistance(1500F);
		this.setHarvestLevel("pickaxe", 3);
	}
}