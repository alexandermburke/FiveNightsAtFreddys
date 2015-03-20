package com.fnaf.main;

import com.fnaf.balloonboy.BalloonBoy;
import com.fnaf.balloonboy.EntityBalloonBoyMob;
import com.fnaf.balloonboy.RenderBalloonBoy;
import com.fnaf.bonnie.Bonnie;
import com.fnaf.bonnie.EntityBonnieMob;
import com.fnaf.bonnie.RenderBonnie;
import com.fnaf.chica.Chica;
import com.fnaf.chica.EntityChicaMob;
import com.fnaf.chica.RenderChica;
import com.fnaf.endo.Endo;
import com.fnaf.endo.EntityEndoMob;
import com.fnaf.endo.RenderEndo;
import com.fnaf.foxy.EntityFoxyMob;
import com.fnaf.foxy.Foxy;
import com.fnaf.foxy.RenderFoxy;
import com.fnaf.freddy.EntityFreddyMob;
import com.fnaf.freddy.Freddy;
import com.fnaf.freddy.RenderFreddyMob;
import com.fnaf.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.goldenfreddy.GoldenFreddy;
import com.fnaf.goldenfreddy.RenderGoldenFreddy;
import com.fnaf.mangle.EntityMangleMob;
import com.fnaf.mangle.Mangle;
import com.fnaf.mangle.RenderMangle;
import com.fnaf.puppet.EntityPuppetMob;
import com.fnaf.puppet.Puppet;
import com.fnaf.puppet.RenderPuppetMob;
import com.fnaf.toybonnie.EntityToyBonnieMob;
import com.fnaf.toybonnie.RenderToyBonnie;
import com.fnaf.toybonnie.ToyBonnie;
import com.fnaf.toychica.EntityToyChicaMob;
import com.fnaf.toychica.RenderToyChica;
import com.fnaf.toychica.ToyChica;
import com.fnaf.toyfreddy.EntityToyFreddyMob;
import com.fnaf.toyfreddy.RenderToyFreddy;
import com.fnaf.toyfreddy.ToyFreddy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPuppetMob.class, new RenderPuppetMob(new Puppet(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFreddyMob.class, new RenderFreddyMob(new Freddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBalloonBoyMob.class, new RenderBalloonBoy(new BalloonBoy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChicaMob.class, new RenderChica(new Chica(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFoxyMob.class, new RenderFoxy(new Foxy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityEndoMob.class, new RenderEndo(new Endo(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyFreddyMob.class, new RenderToyFreddy(new ToyFreddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenFreddyMob.class, new RenderGoldenFreddy(new GoldenFreddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBonnieMob.class, new RenderBonnie(new Bonnie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMangleMob.class, new RenderMangle(new Mangle(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyBonnieMob.class, new RenderToyBonnie(new ToyBonnie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyChicaMob.class, new RenderToyChica(new ToyChica(), 0));
	}

}
