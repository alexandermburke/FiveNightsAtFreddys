package com.fnaf.Client.Entity.goldenfreddy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoldenFreddy extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Common.main.Strings.MODID + ":textures/models/goldenfreddy.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderGoldenFreddy(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityGoldenFreddyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityGoldenFreddyMob)entity);
	}

}
