/*  1:   */ package com.fnaf.main;
/*  2:   */ 
/*  3:   */ import com.fnaf.balloonboy.EntityBalloonBoy;
/*  4:   */ import com.fnaf.chica.EntityChica;
/*  5:   */ import com.fnaf.endo.EntityEndo;
/*  6:   */ import com.fnaf.foxy.EntityFoxy;
/*  7:   */ import com.fnaf.freddy.EntityFreddy;
/*  8:   */ import com.fnaf.goldenfreddy.EntityGoldenFreddy;
/*  9:   */ import com.fnaf.mangle.EntityMangle;
/* 10:   */ import com.fnaf.puppet.EntityPuppet;
/* 11:   */ import com.fnaf.toybonnie.EntityToyBonnie;
/* 12:   */ import com.fnaf.toychica.EntityToyChica;
/* 13:   */ import com.fnaf.toyfreddy.EntityToyFreddy;
/* 14:   */ import com.fnaf.utils.CreativeTabFNAF;
/* 15:   */ import cpw.mods.fml.common.Mod;
/* 16:   */ import cpw.mods.fml.common.Mod.EventHandler;
/* 17:   */ import cpw.mods.fml.common.Mod.Instance;
/* 18:   */ import cpw.mods.fml.common.SidedProxy;
/* 19:   */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/* 20:   */ import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/* 21:   */ import net.minecraft.creativetab.CreativeTabs;
/* 22:   */ 
/* 23:   */ @Mod(modid="fnaf2", name="Five Nights At Freddys", version="2.0", acceptedMinecraftVersions="[1.7.10]")
/* 24:   */ public class mainRegistry
/* 25:   */ {
/* 26:40 */   public static CreativeTabs tabFnaf = new CreativeTabFNAF(CreativeTabs.getNextID(), "standard");
/* 27:   */   @SidedProxy(clientSide="com.fnaf.main.ClientProxy", serverSide="com.fnaf.main.ServerProxy")
/* 28:   */   public static ServerProxy proxy;
/* 29:   */   @Mod.Instance("fnaf2")
/* 30:   */   public static mainRegistry modInstance;
/* 31:   */   
/* 32:   */   @Mod.EventHandler
/* 33:   */   public void PreLoad(FMLPreInitializationEvent PreEvent)
/* 34:   */   {
/* 35:52 */     EntityPuppet.mainRegistry();
/* 36:53 */     EntityFreddy.mainRegistry();
/* 37:54 */     EntityBalloonBoy.mainRegistry();
/* 38:55 */     EntityChica.mainRegistry();
/* 39:56 */     EntityFoxy.mainRegistry();
/* 40:57 */     EntityGoldenFreddy.mainRegistry();
/* 41:   */     
/* 42:59 */     EntityMangle.mainRegistry();
/* 43:60 */     EntityToyBonnie.mainRegistry();
/* 44:61 */     EntityToyChica.mainRegistry();
/* 45:62 */     EntityToyFreddy.mainRegistry();
/* 46:63 */     EntityEndo.mainRegistry();
/* 47:   */     
/* 48:   */ 
/* 49:66 */     proxy.registerRenderThings();
/* 50:   */   }
/* 51:   */   
/* 52:   */   @Mod.EventHandler
/* 53:   */   public void load(FMLInitializationEvent event) {}
/* 54:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.main.mainRegistry
 * JD-Core Version:    0.7.1
 */