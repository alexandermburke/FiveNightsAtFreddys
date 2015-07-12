package com.fnaf.Common.Blocks.render;

import org.lwjgl.opengl.GL11;

import com.fnaf.Client.main.Reference;
import com.fnaf.Common.Blocks.Models.ModelLootBox;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderLootBox extends TileEntitySpecialRenderer{

	ResourceLocation texture = new ResourceLocation(Reference.MODID + ":"  + "textures/blocks/models/lootbox.png");
	
			
		private ModelLootBox model;
		
		public RenderLootBox() {
			this.model = model;
			
		}
	
	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
	GL11.glPushMatrix();
		this.bindTexture(texture);
	}

}
