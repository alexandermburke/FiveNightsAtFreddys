package com.fnaf.Common.Entity.Nightmare.Bonnie;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.mod.Reference;

public class RenderNightmareBonnie extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":" + "textures/models/nmb.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderNightmareBonnie(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityNightmareBonnieMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityNightmareBonnieMob)entity);
	}

}
