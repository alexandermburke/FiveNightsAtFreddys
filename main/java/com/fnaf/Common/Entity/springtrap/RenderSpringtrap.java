package com.fnaf.Common.Entity.springtrap;

import com.fnaf.Client.main.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


@SuppressWarnings("unused")
public class RenderSpringtrap extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/models/springtrap.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderSpringtrap(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntitySpringtrapMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntitySpringtrapMob)entity);
	}

}