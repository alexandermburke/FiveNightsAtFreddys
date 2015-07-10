package com.fnaf.Common.Entity.fnati.NM;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Entity.Phantom.foxy.EntityPhantomFoxy;
import com.fnaf.Common.Entity.Phantom.foxy.EntityPhantomFoxyMob;

public class RenderNegativeMickey extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":" + "textures/models/negativemickey.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderNegativeMickey(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityNegativeMickeyMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityNegativeMickeyMob)entity);
	}

}
