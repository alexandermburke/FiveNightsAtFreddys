package com.FnafVTwo.Client.BalloonBoy;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EntityBalloonBoyMob {

	
	

	public void applyEntityAttributes(){
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.00);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000D);
	}
	
	
	
	
 

protected void dropFewItems(boolean var1, int var2)
	{
	    this.entityDropItem(new ItemStack(Items.diamond), 0.0F);
	}

	private void entityDropItem(ItemStack itemStack, float f) {
		// TODO Auto-generated method stub
		
	}


	protected String getLivingSound()
	{
	    return "";
	}

	
	protected String getHurtSound()
	{
	    return "";
	}


	protected String getDeathSound()
	{
	    return "";
	}
	
	
	
	
	
	
}
