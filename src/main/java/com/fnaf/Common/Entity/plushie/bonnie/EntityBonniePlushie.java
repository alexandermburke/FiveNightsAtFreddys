package com.fnaf.Common.Entity.plushie.bonnie;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBonniePlushie extends EntityMob{

	public EntityBonniePlushie(World par1World) {
		super(par1World);
	    this.setSize(0.6F, 0.9F);
	
		
		
	}
	
	public boolean isAIEnabled(){
		return false;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(100D);
	}

	protected String getLivingSound()
	{
	    return "fnafvtwo:moan";
	}
	protected String getHurtSound()
	{
	    return "";
	}
	protected String getDeathSound()
	{
	    return "fnafvtwo:deathscream";
	}
}