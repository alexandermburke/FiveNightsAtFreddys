package com.fnaf.Common.Entity.Nightmare.Freddy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityNightmareFreddyMob extends EntityMob{
	String newName = "Nightmare Freddy";
	Minecraft mc = Minecraft.getMinecraft();
	EntityPlayer p = mc.thePlayer;
	
	
	public EntityNightmareFreddyMob(World par1World) {
		super(par1World);
	    this.setSize(0.6F, 3.3F);
	    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(10, new EntityAIAvoidEntity(this, EntityBlaze.class, 8.0F, newPosX, newPosX));
        this.setCustomNameTag(newName.toUpperCase());
        
  
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 10, true));
	
		
	}
	
	public boolean isAIEnabled(){
		return false;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000D);
	}

	protected String getLivingSound()
	{
	    return "fnafvtwo:freddylaugh";
	}
	protected String getHurtSound()
	{
	    return "fnafvtwo:voicez";
	}
	protected String getDeathSound()
	{
	    return "fnafvtwo:deathscream";
	}
}