package com.fnaf.Common.Entity.Nightmare.Freddy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.mod.Reference;

public class RenderNightmareFreddy extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":" + "textures/models/nmf.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderNightmareFreddy(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityNightmareFreddyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityNightmareFreddyMob)entity);
	}

}
