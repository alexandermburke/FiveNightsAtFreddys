package com.fnaf.Common.main;



import com.fnaf.Client.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Client.Entity.WitheredBonnie.RenderWitheredBonnie;
import com.fnaf.Client.Entity.WitheredBonnie.WitheredBonnie;
import com.fnaf.Client.Entity.balloonboy.BalloonBoy;
import com.fnaf.Client.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Client.Entity.balloonboy.RenderBalloonBoy;
import com.fnaf.Client.Entity.bonnie.Bonnie;
import com.fnaf.Client.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Client.Entity.bonnie.RenderBonnie;
import com.fnaf.Client.Entity.chica.Chica;
import com.fnaf.Client.Entity.chica.EntityChicaMob;
import com.fnaf.Client.Entity.chica.RenderChica;
import com.fnaf.Client.Entity.foxy.EntityFoxyMob;
import com.fnaf.Client.Entity.foxy.Foxy;
import com.fnaf.Client.Entity.foxy.RenderFoxy;
import com.fnaf.Client.Entity.freddy.EntityFreddyMob;
import com.fnaf.Client.Entity.freddy.Freddy;
import com.fnaf.Client.Entity.freddy.RenderFreddyMob;
import com.fnaf.Client.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Client.Entity.goldenfreddy.GoldenFreddy;
import com.fnaf.Client.Entity.goldenfreddy.RenderGoldenFreddy;
import com.fnaf.Client.Entity.mangle.EntityMangleMob;
import com.fnaf.Client.Entity.mangle.Mangle;
import com.fnaf.Client.Entity.mangle.RenderMangle;
import com.fnaf.Client.Entity.puppet.EntityPuppetMob;
import com.fnaf.Client.Entity.puppet.Puppet;
import com.fnaf.Client.Entity.puppet.RenderPuppetMob;
import com.fnaf.Client.Entity.springtrap.EntitySpringtrapMob;
import com.fnaf.Client.Entity.springtrap.RenderSpringtrap;
import com.fnaf.Client.Entity.springtrap.Springtrap;
import com.fnaf.Client.Entity.toybonnie.EntityToyBonnieMob;
import com.fnaf.Client.Entity.toybonnie.RenderToyBonnie;
import com.fnaf.Client.Entity.toybonnie.ToyBonnie;
import com.fnaf.Client.Entity.toychica.EntityToyChicaMob;
import com.fnaf.Client.Entity.toychica.RenderToyChica;
import com.fnaf.Client.Entity.toychica.ToyChica;
import com.fnaf.Client.Entity.toyfreddy.EntityToyFreddyMob;
import com.fnaf.Client.Entity.toyfreddy.RenderToyFreddy;
import com.fnaf.Client.Entity.toyfreddy.ToyFreddy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPuppetMob.class, new RenderPuppetMob(new Puppet(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFreddyMob.class, new RenderFreddyMob(new Freddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBalloonBoyMob.class, new RenderBalloonBoy(new BalloonBoy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityChicaMob.class, new RenderChica(new Chica(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFoxyMob.class, new RenderFoxy(new Foxy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpringtrapMob .class, new RenderSpringtrap(new Springtrap(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyFreddyMob.class, new RenderToyFreddy(new ToyFreddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenFreddyMob.class, new RenderGoldenFreddy(new GoldenFreddy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBonnieMob.class, new RenderBonnie(new Bonnie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMangleMob.class, new RenderMangle(new Mangle(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyBonnieMob.class, new RenderToyBonnie(new ToyBonnie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityToyChicaMob.class, new RenderToyChica(new ToyChica(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityWitheredBonnieMob.class, new RenderWitheredBonnie(new WitheredBonnie(), 0));
		
		
	}

}
