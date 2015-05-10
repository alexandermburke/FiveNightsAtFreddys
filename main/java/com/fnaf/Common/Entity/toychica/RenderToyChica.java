package com.fnaf.Common.Entity.toychica;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderToyChica extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Client.main.Strings.MODID + ":textures/models/toychica.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderToyChica(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityToyChicaMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityToyChicaMob)entity);
	}

}
