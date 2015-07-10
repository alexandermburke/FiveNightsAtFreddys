package com.fnaf.Common.Entity.Phantom.foxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Entity.Phantom.chica.EntityPhantomChicaMob;

public class RenderPhantomFoxy extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":" + "textures/models/phantomfoxy.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderPhantomFoxy(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityPhantomFoxyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityPhantomFoxyMob)entity);
	}

}
