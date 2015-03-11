package com.T0psid3.items;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class PPlushie extends BlockContainer{

	protected PPlushie(Material material) {
		super(material);
		this.setHardness(5.0f);
		this.setResistance(0.5f);
	}
	public int getRenderType(){
		return 1;
		
	}

	public boolean isOpaqueCube(){
		return false;
	
}
public abstract boolean renderAsNormalBlock();
}