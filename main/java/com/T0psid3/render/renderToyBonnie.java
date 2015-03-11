package com.T0psid3.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class renderToyBonnie extends RenderLiving  {
    
    private static final ResourceLocation ToyBonnie = new ResourceLocation("tutorialmod:textures/models/bonnie/bon bon texture.png");

    public renderToyBonnie(ModelBase par1ModelBase, float par2) {
            super(par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return null;
    }}