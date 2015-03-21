package com.fnaf.Client.Entity.toybonnie;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderToyBonnie extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Common.main.Strings.MODID + ":textures/models/toybonnie.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderToyBonnie(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityToyBonnieMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityToyBonnieMob)entity);
	}

}
