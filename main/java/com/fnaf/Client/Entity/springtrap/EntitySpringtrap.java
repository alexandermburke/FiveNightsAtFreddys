package com.fnaf.Client.Entity.springtrap;

import com.fnaf.Common.main.Strings;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntitySpringtrap
{ 
public static void mainRegistry(){
	registerEntity();
}

public static void registerEntity(){
	
	createEntity(EntitySpringtrap.class, "SpringTrap", 0xEFF0DF, 0x6B522C);
	
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
public void onKillEntity(EntityLiving entityLiving){
}

@SuppressWarnings("unchecked")
public static void createEntity(@SuppressWarnings("rawtypes") Class entityClass, String entityName, int solidColor, int spotColor){
int randomId = EntityRegistry.findGlobalUniqueEntityId();
EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Common.main.mainRegistry.modInstance, 64, 1, true);
EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
	
	createEgg(randomId, solidColor, spotColor);
	
}

@SuppressWarnings("unchecked")
private static void createEgg(int randomId, int solidColor, int spotColor){
	EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	
}}

