package com.FnafVTwo.Client.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Plushie 
extends Block
 {
 
	public Plushie()
	{
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
 }}

