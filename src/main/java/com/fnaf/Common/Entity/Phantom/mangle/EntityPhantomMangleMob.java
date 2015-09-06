package com.fnaf.Common.Entity.Phantom.mangle;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityPhantomMangleMob extends EntityMob{

	public EntityPhantomMangleMob(World par1World) {
		super(par1World);
	    this.setSize(0.6F, 2.9F);
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		
		
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
	    return "fnafvtwo:manglestatic";
	}
	protected String getHurtSound()
	{
	    return "fnafvtwo:";
	}
	protected String getDeathSound()
	{
	    return "fnafvtwo:";
	}
}