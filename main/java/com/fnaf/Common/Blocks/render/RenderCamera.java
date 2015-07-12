package com.fnaf.Common.Blocks.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fnaf.Common.Blocks.Models.ModelCamera;
import com.fnaf.Common.Blocks.Models.ModelLootBox;
import com.fnaf.Common.main.Reference;

public class RenderCamera extends TileEntitySpecialRenderer{

	ResourceLocation texture = new ResourceLocation(Reference.MODID + ":"  + "textures/blocks/models/camera.png");
	
			
		private ModelCamera model;
		
		public RenderCamera() {
			this.model = model;
			
		}
	
	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
	GL11.glPushMatrix();
		this.bindTexture(texture);
	}

}
