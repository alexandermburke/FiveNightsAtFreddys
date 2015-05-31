package com.fnaf.Common.Blocks.tileentity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fnaf.Common.Blocks.Models.ModelCamera;

public class TileEntityCameraRenderer extends TileEntitySpecialRenderer {

	private ModelCamera modelSecurityCamera;
	private ResourceLocation cameraTexture;

	public TileEntityCameraRenderer() {
		this.modelSecurityCamera = new ModelCamera();
		this.cameraTexture = new ResourceLocation("securitycraft:textures/blocks/models/camera.png");
	}

	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
	}
		
	}
	
	

