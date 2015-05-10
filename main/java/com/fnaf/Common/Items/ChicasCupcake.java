package com.fnaf.Common.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChicasCupcake extends Block {
 public ChicasCupcake() {
	 super(Material.cake);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("axe", 1);
	 
 }
}
