package com.fnaf.Common.Entity.toybonnie;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityToyBonnieMob extends EntityMob {

	private int animID;
	private int animTick;
	
	public EntityToyBonnieMob(World par1World) {
		super(par1World);
	    this.setSize(0.6F, 2.9F);
	    animID = 0;
		animTick = 0;
		//ADD THIS!
	   this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		
		par1World.getGameRules().getGameRuleBooleanValue("");
	}
	
	
	public boolean isAIEnabled(){
		return false;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10D);
	}
	protected String getLivingSound()
	{
	    return "fnafvtwo:stare";
	}
	protected String getHurtSound()
	{
	    return "fnafvtwo:voicez";
	}
	protected String getDeathSound()
	{
	    return "fnafvtwo:deathscream";
	}


	/*
	 * Implemented method from IAnimatedEntity.
	 * Set the animID field to the id in the parameter.
	 */
	public void setAnimID(int id) {
		animID = id;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Set the animTick field to the tick in the parameter.
	 */
	public void setAnimTick(int tick) {
		animTick = tick;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Return the animID.
	 */
	public int getAnimID() {
		return animID;
	}
	
	/*
	 * Implemented method from IAnimatedEntity.
	 * Return the animTick.
	 */
	public int getAnimTick() {
		return animTick;
	}
	
	public void onUpdate() {
		super.onUpdate();
		//increment the animTick if there is an animation playing
		if(animID != 0) animTick++;
	}

}