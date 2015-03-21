package com.fnaf.Common.utils;

import com.google.common.eventbus.Subscribe;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class SpawnEvent {
	
	@Subscribe
	public void onEntitySpawn(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof EntitySlime || event.entity instanceof EntityZombie || event.entity instanceof EntitySpider) {
	    	event.setCanceled(true);
	    }
	}
	
}
	
