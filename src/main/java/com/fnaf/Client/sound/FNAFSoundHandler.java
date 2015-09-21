package com.fnaf.Client.sound;

import com.fnaf.Common.main.Reference;
import net.minecraft.entity.Entity;

public class FNAFSoundHandler {
	
	
	public static void playSound(String name, Entity entity, float volume, float pitch)
	{
		entity.worldObj.playSoundAtEntity(entity, ("fnaf:" + name), (float)volume, (float) pitch);
	}
	
	public static void Phonecall1(Entity entity, float volume, float pitch)
	{
		playSound("phonecall1", entity, volume, pitch);
	}

	public static void jumpscare(Entity entity, float volume, float pitch)
	{
		playSound("deathscream", entity, volume, pitch);
	}
	
	public static void mask(Entity entity, float volume, float pitch)
	{
		playSound("mask1", entity, volume, pitch);
	}
}
