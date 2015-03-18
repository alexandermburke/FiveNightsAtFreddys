/*  1:   */ package com.fnaf.utils;
/*  2:   */ 
/*  3:   */ import cpw.mods.fml.relauncher.Side;
/*  4:   */ import cpw.mods.fml.relauncher.SideOnly;
/*  5:   */ import net.minecraft.creativetab.CreativeTabs;
/*  6:   */ import net.minecraft.init.Items;
/*  7:   */ import net.minecraft.item.Item;
/*  8:   */ 
/*  9:   */ public class CreativeTabFNAF
/* 10:   */   extends CreativeTabs
/* 11:   */ {
/* 12:   */   public CreativeTabFNAF(int id, String unlocalizedName)
/* 13:   */   {
/* 14:13 */     super(id, unlocalizedName);
/* 15:   */   }
/* 16:   */   
/* 17:   */   @SideOnly(Side.CLIENT)
/* 18:   */   public Item func_78016_d()
/* 19:   */   {
/* 20:20 */     return Items.field_151152_bP;
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.utils.CreativeTabFNAF
 * JD-Core Version:    0.7.1
 */