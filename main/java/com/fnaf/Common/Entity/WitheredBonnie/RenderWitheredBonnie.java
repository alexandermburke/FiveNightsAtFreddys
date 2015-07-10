package com.fnaf.Common.Entity.WitheredBonnie;

import com.fnaf.Client.main.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderWitheredBonnie extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/models/WitheredBonnie.png");
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000984";
	
	public RenderWitheredBonnie(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityWitheredBonnieMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityWitheredBonnieMob)entity);
	}

}
