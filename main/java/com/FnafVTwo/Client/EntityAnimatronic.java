package com.FnafVTwo.Client;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityAnimatronic {
	 public static void FNAFRegistry() {}
	 
	  public static void registerEntity()
	  {
		     createEntity(EntityAnimatronic.class, "", 15861025, 2101711);
		  }
		  
		   @SuppressWarnings("unchecked")
		public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor)
		  {
		     int randomId = EntityRegistry.findGlobalUniqueEntityId();
		    EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		     EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.FnafVTwo.Common.Main.FNAFRegistry.modInstance, 1, 1, true);
		    EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.birchForest });
		      
		    createEgg(randomId, solidColor, spotColor);
		   }
		  
		    private static void createEgg(int randomId, int solidColor, int spotColor)
		   {
		      EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		    }
}
