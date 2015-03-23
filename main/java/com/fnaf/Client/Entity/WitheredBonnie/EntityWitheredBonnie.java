package com.fnaf.Client.Entity.WitheredBonnie;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityWitheredBonnie {
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		createEntity(EntityWitheredBonnieMob.class, "Withered Bonnie", 0x525023, 0xEBEBEB);
		
	}
	//Sounds
	protected String getLivingSound()
	{
	    return "scare.ogg";
	}
	protected String getHurtSound()
	{
	    return "";
	}
	protected String getDeathSound()
	{
	    return "CROWD_SMALL_CHIL_EC049202.ogg";
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Common.main.mainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}