package com.FnafVTwo.Common.Main;

import com.FnafVTwo.Client.BalloonBoy.EntityBalloonBoyMob;
import com.FnafVTwo.Client.BalloonBoy.RenderBalloonBoy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {
	public void registerRenderThings()
  {
		
		// RenderingRegistry.registerEntityRenderingHandler(EntityPuppetMob.class, new RenderPuppetMob(new Puppet(), 0.0F));
		RenderingRegistry.registerEntityHandler(EntityBalloonBoyMob.class, new RenderBalloonBoy(new BalloonBoy(), 0.0F));
		
  }
	
}
