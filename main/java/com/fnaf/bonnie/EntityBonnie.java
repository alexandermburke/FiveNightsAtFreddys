/*  1:   */ package com.fnaf.bonnie;
/*  2:   */ 
/*  3:   */ import com.fnaf.main.mainRegistry;
/*  4:   */ import cpw.mods.fml.common.registry.EntityRegistry;
/*  5:   */ import java.util.HashMap;
/*  6:   */ import net.minecraft.entity.EntityList;
/*  7:   */ import net.minecraft.entity.EntityList.EntityEggInfo;
/*  8:   */ import net.minecraft.entity.EnumCreatureType;
/*  9:   */ import net.minecraft.world.biome.BiomeGenBase;
/* 10:   */ 
/* 11:   */ public class EntityBonnie
/* 12:   */ {
/* 13:   */   public static void mainRegistry() {}
/* 14:   */   
/* 15:   */   public static void registerEntity()
/* 16:   */   {
/* 17:18 */     createEntity(EntityBonnieMob.class, "Bonnie", 5394513, 15461355);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor)
/* 21:   */   {
/* 22:23 */     int randomId = EntityRegistry.findGlobalUniqueEntityId();
/* 23:24 */     EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
/* 24:25 */     EntityRegistry.registerModEntity(entityClass, entityName, randomId, mainRegistry.modInstance, 64, 1, true);
/* 25:26 */     EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, new BiomeGenBase[] { BiomeGenBase.field_76767_f });
/* 26:   */     
/* 27:28 */     createEgg(randomId, solidColor, spotColor);
/* 28:   */   }
/* 29:   */   
/* 30:   */   private static void createEgg(int randomId, int solidColor, int spotColor)
/* 31:   */   {
/* 32:33 */     EntityList.field_75627_a.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.bonnie.EntityBonnie
 * JD-Core Version:    0.7.1
 */