package com.fnaf.Common.Blocks.render;

import org.lwjgl.opengl.GL11;

import com.fnaf.Common.Blocks.Models.ModelCamera;
import com.fnaf.Common.Blocks.Models.ModelFNAF3Box;
import com.fnaf.Common.main.Reference;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderBox extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(Reference.MODID + ":" + "textures/blocks/models/box.png");
	
	public ModelFNAF3Box model;
	
	public RenderBox() {
		this.model = new ModelFNAF3Box();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
	
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}


}
