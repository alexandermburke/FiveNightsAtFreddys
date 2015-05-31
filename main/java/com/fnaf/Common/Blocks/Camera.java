package com.fnaf.Common.Blocks;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Blocks.tileentity.TileEntityCamera;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Camera extends BlockContainer
{
	


	public Camera(Material par2Material, boolean isLit) {
		super(par2Material);
		this.isBlockContainer = isLit;
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

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityCamera();
	}

	
	
	
	
}

