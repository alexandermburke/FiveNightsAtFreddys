package com.fnaf.Common.Blocks.Models;

import net.minecraft.client.model.ModelBase;
//Exported java file
//Keep in mind that you still need to fill in some blanks
// - ZeuX
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCamera extends ModelBase
{
	public ModelCamera()
	{
		Shape1 = new ModelRenderer(this, 0, 15);
		Shape1.addBox(-1F, -1F, -6F, 2, 2, 6, 0F);
		Shape1.setRotationPoint(0F, 18F, 7F);
		Shape1.rotateAngleX = 0F;
		Shape1.rotateAngleY = 0F;
		Shape1.rotateAngleZ = 0F;
		Shape1.mirror = false;
		Shape2 = new ModelRenderer(this, 0, 26);
		Shape2.addBox(-1.533333F, -2.533333F, -1F, 3, 5, 1, 0F);
		Shape2.setRotationPoint(0F, 18F, 8F);
		Shape2.rotateAngleX = 0F;
		Shape2.rotateAngleY = 0F;
		Shape2.rotateAngleZ = 0F;
		Shape2.mirror = false;
		Shape3 = new ModelRenderer(this, 15, 26);
		Shape3.addBox(-1F, -3F, -1F, 2, 4, 2, 0F);
		Shape3.setRotationPoint(0F, 17F, 1.533333F);
		Shape3.rotateAngleX = 0F;
		Shape3.rotateAngleY = 0F;
		Shape3.rotateAngleZ = 0F;
		Shape3.mirror = false;
		Shape4 = new ModelRenderer(this, 29, 18);
		Shape4.addBox(-2F, -4F, -5.466667F, 4, 4, 10, 0F);
		Shape4.setRotationPoint(0F, 16F, 2F);
		Shape4.rotateAngleX = 0.1570796F;
		Shape4.rotateAngleY = 0F;
		Shape4.rotateAngleZ = 0F;
		Shape4.mirror = false;
		Shape5 = new ModelRenderer(this, 31, 5);
		Shape5.addBox(-2.5F, -4.333333F, -6F, 5, 1, 11, 0F);
		Shape5.setRotationPoint(0F, 16F, 2F);
		Shape5.rotateAngleX = 0.1570796F;
		Shape5.rotateAngleY = 0F;
		Shape5.rotateAngleZ = 0F;
		Shape5.mirror = false;
		Shape6 = new ModelRenderer(this, 0, 0);
		Shape6.addBox(-2.5F, -3.333333F, -6F, 1, 1, 11, 0F);
		Shape6.setRotationPoint(0F, 16F, 2F);
		Shape6.rotateAngleX = 0.1570796F;
		Shape6.rotateAngleY = 0F;
		Shape6.rotateAngleZ = 0F;
		Shape6.mirror = false;
		Shape7 = new ModelRenderer(this, 17, 0);
		Shape7.addBox(-2.5F, -2.333333F, -6F, 1, 1, 8, 0F);
		Shape7.setRotationPoint(0F, 16F, 2F);
		Shape7.rotateAngleX = 0.1570796F;
		Shape7.rotateAngleY = 0F;
		Shape7.rotateAngleZ = 0F;
		Shape7.mirror = false;
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(1.5F, -3.333333F, -6F, 1, 1, 11, 0F);
		Shape8.setRotationPoint(0F, 16F, 2F);
		Shape8.rotateAngleX = 0.1570796F;
		Shape8.rotateAngleY = 0F;
		Shape8.rotateAngleZ = 0F;
		Shape8.mirror = false;
		Shape9 = new ModelRenderer(this, 17, 0);
		Shape9.addBox(1.5F, -2.333333F, -6F, 1, 1, 8, 0F);
		Shape9.setRotationPoint(0F, 16F, 2F);
		Shape9.rotateAngleX = 0.1570796F;
		Shape9.rotateAngleY = 0F;
		Shape9.rotateAngleZ = 0F;
		Shape9.mirror = false;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}
	
	//fields
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public ModelRenderer Shape3;
	public ModelRenderer Shape4;
	public ModelRenderer Shape5;
	public ModelRenderer Shape6;
	public ModelRenderer Shape7;
	public ModelRenderer Shape8;
	public ModelRenderer Shape9;
}
