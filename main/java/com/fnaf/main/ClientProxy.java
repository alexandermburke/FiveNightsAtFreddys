/*  1:   */ package com.fnaf.main;
/*  2:   */ 
/*  3:   */ import com.fnaf.balloonboy.BalloonBoy;
/*  4:   */ import com.fnaf.balloonboy.EntityBalloonBoyMob;
/*  5:   */ import com.fnaf.balloonboy.RenderBalloonBoy;
/*  6:   */ import com.fnaf.bonnie.Bonnie;
/*  7:   */ import com.fnaf.bonnie.EntityBonnieMob;
/*  8:   */ import com.fnaf.bonnie.RenderBonnie;
/*  9:   */ import com.fnaf.chica.Chica;
/* 10:   */ import com.fnaf.chica.EntityChicaMob;
/* 11:   */ import com.fnaf.chica.RenderChica;
/* 12:   */ import com.fnaf.endo.Endo;
/* 13:   */ import com.fnaf.endo.EntityEndoMob;
/* 14:   */ import com.fnaf.endo.RenderEndo;
/* 15:   */ import com.fnaf.foxy.EntityFoxyMob;
/* 16:   */ import com.fnaf.foxy.Foxy;
/* 17:   */ import com.fnaf.foxy.RenderFoxy;
/* 18:   */ import com.fnaf.freddy.EntityFreddyMob;
/* 19:   */ import com.fnaf.freddy.Freddy;
/* 20:   */ import com.fnaf.freddy.RenderFreddyMob;
/* 21:   */ import com.fnaf.goldenfreddy.EntityGoldenFreddyMob;
/* 22:   */ import com.fnaf.goldenfreddy.GoldenFreddy;
/* 23:   */ import com.fnaf.goldenfreddy.RenderGoldenFreddy;
/* 24:   */ import com.fnaf.mangle.EntityMangleMob;
/* 25:   */ import com.fnaf.mangle.Mangle;
/* 26:   */ import com.fnaf.mangle.RenderMangle;
/* 27:   */ import com.fnaf.puppet.EntityPuppetMob;
/* 28:   */ import com.fnaf.puppet.Puppet;
/* 29:   */ import com.fnaf.puppet.RenderPuppetMob;
/* 30:   */ import com.fnaf.toybonnie.EntityToyBonnieMob;
/* 31:   */ import com.fnaf.toybonnie.RenderToyBonnie;
/* 32:   */ import com.fnaf.toybonnie.ToyBonnie;
/* 33:   */ import com.fnaf.toychica.EntityToyChicaMob;
/* 34:   */ import com.fnaf.toychica.RenderToyChica;
/* 35:   */ import com.fnaf.toychica.ToyChica;
/* 36:   */ import com.fnaf.toyfreddy.EntityToyFreddyMob;
/* 37:   */ import com.fnaf.toyfreddy.RenderToyFreddy;
/* 38:   */ import com.fnaf.toyfreddy.ToyFreddy;
/* 39:   */ import cpw.mods.fml.client.registry.RenderingRegistry;
/* 40:   */ 
/* 41:   */ public class ClientProxy
/* 42:   */   extends ServerProxy
/* 43:   */ {
/* 44:   */   public void registerRenderThings()
/* 45:   */   {
/* 46:46 */     RenderingRegistry.registerEntityRenderingHandler(EntityPuppetMob.class, new RenderPuppetMob(new Puppet(), 0.0F));
/* 47:47 */     RenderingRegistry.registerEntityRenderingHandler(EntityFreddyMob.class, new RenderFreddyMob(new Freddy(), 0.0F));
/* 48:48 */     RenderingRegistry.registerEntityRenderingHandler(EntityBalloonBoyMob.class, new RenderBalloonBoy(new BalloonBoy(), 0.0F));
/* 49:49 */     RenderingRegistry.registerEntityRenderingHandler(EntityChicaMob.class, new RenderChica(new Chica(), 0.0F));
/* 50:50 */     RenderingRegistry.registerEntityRenderingHandler(EntityFoxyMob.class, new RenderFoxy(new Foxy(), 0.0F));
/* 51:51 */     RenderingRegistry.registerEntityRenderingHandler(EntityEndoMob.class, new RenderEndo(new Endo(), 0.0F));
/* 52:52 */     RenderingRegistry.registerEntityRenderingHandler(EntityToyFreddyMob.class, new RenderToyFreddy(new ToyFreddy(), 0.0F));
/* 53:53 */     RenderingRegistry.registerEntityRenderingHandler(EntityGoldenFreddyMob.class, new RenderGoldenFreddy(new GoldenFreddy(), 0.0F));
/* 54:54 */     RenderingRegistry.registerEntityRenderingHandler(EntityBonnieMob.class, new RenderBonnie(new Bonnie(), 0.0F));
/* 55:55 */     RenderingRegistry.registerEntityRenderingHandler(EntityMangleMob.class, new RenderMangle(new Mangle(), 0.0F));
/* 56:56 */     RenderingRegistry.registerEntityRenderingHandler(EntityToyBonnieMob.class, new RenderToyBonnie(new ToyBonnie(), 0.0F));
/* 57:57 */     RenderingRegistry.registerEntityRenderingHandler(EntityToyChicaMob.class, new RenderToyChica(new ToyChica(), 0.0F));
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Users\Lori Burke\AppData\Roaming\.minecraft\mods\FNAF Alpha 2.0.jar
 * Qualified Name:     com.fnaf.main.ClientProxy
 * JD-Core Version:    0.7.1
 */