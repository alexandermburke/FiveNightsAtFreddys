package com.fnaf.Client.main;



import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;

import com.fnaf.Common.Blocks.Camera;
import com.fnaf.Common.Blocks.LootBox;
import com.fnaf.Common.Blocks.render.RenderCamera;
import com.fnaf.Common.Blocks.render.RenderLootBox;
import com.fnaf.Common.Blocks.tileentity.TileEntityCamera;
import com.fnaf.Common.Blocks.tileentity.TileEntityCameraRenderer;
import com.fnaf.Common.Blocks.tileentity.TileEntityLootBox;
import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.Entity.WitheredBonnie.RenderWitheredBonnie;
import com.fnaf.Common.Entity.WitheredBonnie.WitheredBonnie;
import com.fnaf.Common.Entity.balloonboy.BalloonBoy;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.Entity.balloonboy.RenderBalloonBoy;
import com.fnaf.Common.Entity.bonnie.Bonnie;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.bonnie.RenderBonnie;
import com.fnaf.Common.Entity.chica.Chica;
import com.fnaf.Common.Entity.chica.EntityChicaMob;
import com.fnaf.Common.Entity.chica.RenderChica;
import com.fnaf.Common.Entity.foxy.EntityFoxyMob;
import com.fnaf.Common.Entity.foxy.Foxy;
import com.fnaf.Common.Entity.foxy.RenderFoxy;
import com.fnaf.Common.Entity.freddy.EntityFreddyMob;
import com.fnaf.Common.Entity.freddy.Freddy;
import com.fnaf.Common.Entity.freddy.RenderFreddyMob;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Entity.goldenfreddy.GoldenFreddy;
import com.fnaf.Common.Entity.goldenfreddy.RenderGoldenFreddy;
import com.fnaf.Common.Entity.mangle.EntityMangleMob;
import com.fnaf.Common.Entity.mangle.Mangle;
import com.fnaf.Common.Entity.mangle.RenderMangle;
import com.fnaf.Common.Entity.puppet.EntityPuppetMob;
import com.fnaf.Common.Entity.puppet.Puppet;
import com.fnaf.Common.Entity.puppet.RenderPuppetMob;
import com.fnaf.Common.Entity.springtrap.EntitySpringtrapMob;
import com.fnaf.Common.Entity.springtrap.RenderSpringtrap;
import com.fnaf.Common.Entity.springtrap.Springtrap;
import com.fnaf.Common.Entity.toybonnie.EntityToyBonnieMob;
import com.fnaf.Common.Entity.toybonnie.RenderToyBonnie;
import com.fnaf.Common.Entity.toybonnie.ToyBonnie;
import com.fnaf.Common.Entity.toychica.EntityToyChicaMob;
import com.fnaf.Common.Entity.toychica.RenderToyChica;
import com.fnaf.Common.Entity.toychica.ToyChica;
import com.fnaf.Common.Entity.toyfreddy.EntityToyFreddyMob;
import com.fnaf.Common.Entity.toyfreddy.RenderToyFreddy;
import com.fnaf.Common.Entity.toyfreddy.ToyFreddy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
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
		
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCamera.class, new TileEntityCameraRenderer());
	}
	private static final Bonnie modelBonnie = new Bonnie();
	
	public Bonnie getArmorModel(String par1String)
	{
		
			return modelBonnie;
		}
}