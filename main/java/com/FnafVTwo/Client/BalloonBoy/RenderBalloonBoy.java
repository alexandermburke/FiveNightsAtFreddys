package com.FnafVTwo.Client.BalloonBoy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBalloonBoy
extends RenderLiving
 {
   private static final ResourceLocation mobTextures = new ResourceLocation("fnaf2:textures/models/bb.png");
   private static final String __OBFID = "CL_00000984";
  
  public RenderBalloonBoy(ModelBase par1ModelBase, float par2)
 {
     super(par1ModelBase, par2);
   }
  
   protected ResourceLocation getEntityTexture(EntityBalloonBoyMob entity)
  {
     return mobTextures;
   }
 
   protected ResourceLocation func_110775_a(Entity entity)
   {
     return null;
   }

@Override
protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
	// TODO Auto-generated method stub
	return null;
} }