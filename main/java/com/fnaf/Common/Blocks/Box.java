package com.fnaf.Common.Blocks;

import com.fnaf.Common.Blocks.tileentity.TileEntityBox;
import com.fnaf.Common.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Box extends Block{

	public Box() {
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
	
	}
	
	public TileEntity createNewTileEntity(World world) {
		
		
		return new TileEntityBox();
		
	}
	
	
	public void registerIcons(IIconRegister icon){
		this.blockIcon = icon.registerIcon(Reference.MODID + ":" + "textures/blocks/box1.png");
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
