package com.fnaf.Client.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelOre extends Block
{
	public SteelOre()
	{
		super(Material.fire);
		this.setHardness(20F);
		this.setResistance(150F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
