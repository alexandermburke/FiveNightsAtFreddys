package com.fnaf.Common.Entity.puppet;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

import com.fnaf.Common.Items.fnaf2Items;

public class EntityPuppetMob extends EntityAnimal{

	public EntityPuppetMob(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.4F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
		this.tasks.addTask(2, new EntityAITempt(this, 0.7D, fnaf2Items.PlasticIngot, true));
		this.tasks.addTask(3, new EntityAIOpenDoor(this, true));
		//LOL Dis AI task doh!!
		
		this.tasks.addTask(4, new EntityAIMate(this, 1.0F));
	
	
		
		
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return new EntityPuppetMob(worldObj);
	}

	

}
