package com.fnaf.Common.Entity.WitheredChica;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.mod.Reference;

public class RenderWitheredChica extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":textures/models/witheredchica.png");
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000984";
	
	public RenderWitheredChica(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityWitheredChicaMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityWitheredChicaMob)entity);
	}

}
