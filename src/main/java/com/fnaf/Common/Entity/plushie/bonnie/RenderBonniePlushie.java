package com.fnaf.Common.Entity.plushie.bonnie;

import com.fnaf.Common.Entity.Phantom.bb.EntityPhantomBalloonBoyMob;
import com.fnaf.Common.main.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBonniePlushie extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":" + "textures/models/");
	private static final String __OBFID = "CL_00000984";
	
	public RenderBonniePlushie(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityBonniePlushie entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityBonniePlushie)entity);
	}

}
