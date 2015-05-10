package com.fnaf.Common.Entity.WitheredBonnie;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;

public class EntityWitheredBonnieMob extends EntityAnimal{

	public EntityWitheredBonnieMob(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.4F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAITempt(this, 0.7D, Items.beef, false));
		
		
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return new EntityWitheredBonnieMob(worldObj);
	}

	

}