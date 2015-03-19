package com.FnafVTwo.Client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAnimatronicMob extends RenderLiving{
	
	   private static final ResourceLocation mobTextures = new ResourceLocation("fnaf2:textures/models/bb.png");
	   private static final String __OBFID = "CL_00000984";
	  
	  public RenderAnimatronicMob(ModelBase par1ModelBase, float par2)
	 {
	     super(par1ModelBase, par2);
	   }
	  
	   protected ResourceLocation getEntityTexture(EntityAnimatronic entity)
	  {
	     return mobTextures;
	   }
	 
	   protected ResourceLocation func_110775_a(Entity entity)
	   {
	     return null;
	   }

	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
