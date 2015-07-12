package com.fnaf.Common.Entity.toyfreddy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderToyFreddy extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Client.main.Reference.MODID + ":textures/models/toyfreddy.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderToyFreddy(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(EntityToyFreddyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityToyFreddyMob)entity);
	}

}

