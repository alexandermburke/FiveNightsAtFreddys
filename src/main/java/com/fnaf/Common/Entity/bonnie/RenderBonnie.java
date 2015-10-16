package com.fnaf.Common.Entity.bonnie;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBonnie extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(com.fnaf.Common.mod.Reference.MODID + ":textures/models/Bonnie.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderBonnie(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityBonnieMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityBonnieMob)entity);
	}

}
