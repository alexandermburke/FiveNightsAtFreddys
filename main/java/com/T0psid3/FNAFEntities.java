package com.T0psid3;

import com.T0psid3.Mobs.BalloonBoy;
import com.T0psid3.Mobs.Bonnie;
import com.T0psid3.Mobs.Foxy;
import com.T0psid3.Mobs.Freddy;
import com.T0psid3.Mobs.Mangle;
import com.T0psid3.Mobs.Marionette;

import net.minecraft.entity.Entity;


import cpw.mods.fml.common.registry.EntityRegistry;

public class FNAFEntities {

	public static void register()
	{
		registerEntity(Bonnie.class, "fnaf_Bonnie", 40, 1, true);
		//registerEntity(EntityAstronaut.class, "interstellar_astronaut", 40, 1, true); - Sorry wrong mod
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange, int updateFrequency, boolean sendVelocityUpdates)
	{
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, id, 0, 0);
		EntityRegistry.registerModEntity(entityClass, name, id, FiveNightsAtFreddys.instance, trackingRange, updateFrequency, sendVelocityUpdates);
	}
}
