package com.fnaf.Common.Entity.Phantom.chica;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Entity.Phantom.bb.EntityPhantomBalloonBoyMob;

public class RenderPhantomChica extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":" + "textures/models/phantomchica.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderPhantomChica(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityPhantomChicaMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPhantomChicaMob)entity);
	}

}
