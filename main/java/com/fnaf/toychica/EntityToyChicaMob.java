/*  1:   */ package com.fnaf.toychica;
/*  2:   */ 
/*  3:   */ import net.minecraft.entity.EntityAgeable;
/*  4:   */ import net.minecraft.entity.SharedMonsterAttributes;
/*  5:   */ import net.minecraft.entity.ai.EntityAIPanic;
/*  6:   */ import net.minecraft.entity.ai.EntityAITasks;
/*  7:   */ import net.minecraft.entity.ai.EntityAITempt;
/*  8:   */ import net.minecraft.entity.ai.EntityAIWander;
/*  9:   */ import net.minecraft.entity.ai.attributes.IAttributeInstance;
/* 10:   */ import net.minecraft.entity.passive.EntityAnimal;
/* 11:   */ import net.minecraft.init.Items;
/* 12:   */ import net.minecraft.world.World;
/* 13:   */ 
/* 14:   */ public class EntityToyChicaMob
/* 15:   */   extends EntityAnimal
/* 16:   */ {
/* 17:   */   public EntityToyChicaMob(World par1World)
/* 18:   */   {
/* 19:15 */     super(par1World);
/* 20:16 */     func_70105_a(0.5F, 0.4F);
/* 21:17 */     this.field_70714_bg.func_75776_a(0, new EntityAIWander(this, 0.5D));
/* 22:18 */     this.field_70714_bg.func_75776_a(1, new EntityAIPanic(this, 2.0D));
/* 23:19 */     this.field_70714_bg.func_75776_a(2, new EntityAITempt(this, 0.7D, Items.field_151082_bd, false));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean func_70650_aV()
/* 27:   */   {
/* 28:25 */     return true;
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void func_110147_ax()
/* 32:   */   {
/* 33:29 */     super.func_110147_ax();
/* 34:30 */     func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(16.0D);
/* 35:31 */     func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.0D);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public EntityAgeable func_90011_a(EntityAgeable p_90011_1_)
/* 39:   */   {
/* 40:37 */     return new EntityToyChicaMob(this.field_70170_p);
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.toychica.EntityToyChicaMob
 * JD-Core Version:    0.7.1
 */