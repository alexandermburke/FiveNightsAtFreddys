package com.fnaf.Common.Entity.WitheredFoxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.mod.Reference;

public class RenderWitheredFoxy extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":textures/models/witheredfoxy.png");
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000984";
	
	public RenderWitheredFoxy(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityWitheredFoxyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityWitheredFoxyMob)entity);
	}

}
