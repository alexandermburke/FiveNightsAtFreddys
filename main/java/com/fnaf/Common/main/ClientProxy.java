package com.fnaf.Common.main;



import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.fnaf.Client.gui.GuiMainMenuFNAF;
import com.fnaf.Client.main.renderer.CustomModeledBlockRenderer;
import com.fnaf.Common.Blocks.Models.ModelCamera;
import com.fnaf.Common.Blocks.tileentity.TileEntityCamera;
import com.fnaf.Common.Entity.Camera.EntityCameraMob;
import com.fnaf.Common.Entity.Camera.RenderTheCamera;
import com.fnaf.Common.Entity.Phantom.bb.EntityPhantomBalloonBoyMob;
import com.fnaf.Common.Entity.Phantom.bb.PhantomBalloonBoy;
import com.fnaf.Common.Entity.Phantom.bb.RenderPhantomBalloonBoy;
import com.fnaf.Common.Entity.Phantom.chica.EntityPhantomChicaMob;
import com.fnaf.Common.Entity.Phantom.chica.PhantomChica;
import com.fnaf.Common.Entity.Phantom.chica.RenderPhantomChica;
import com.fnaf.Common.Entity.Phantom.foxy.EntityPhantomFoxyMob;
import com.fnaf.Common.Entity.Phantom.foxy.PhantomFoxy;
import com.fnaf.Common.Entity.Phantom.foxy.RenderPhantomFoxy;
import com.fnaf.Common.Entity.Phantom.mangle.EntityPhantomMangleMob;
import com.fnaf.Common.Entity.Phantom.mangle.PhantomMangle;
import com.fnaf.Common.Entity.Phantom.mangle.RenderPhantomMangle;
import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.Entity.WitheredBonnie.RenderWitheredBonnie;
import com.fnaf.Common.Entity.WitheredBonnie.WitheredBonnie;
import com.fnaf.Common.Entity.WitheredChica.EntityWitheredChicaMob;
import com.fnaf.Common.Entity.WitheredChica.RenderWitheredChica;
import com.fnaf.Common.Entity.WitheredChica.WitheredChica;
import com.fnaf.Common.Entity.WitheredFoxy.EntityWitheredFoxyMob;
import com.fnaf.Common.Entity.WitheredFoxy.RenderWitheredFoxy;
import com.fnaf.Common.Entity.WitheredFoxy.WitheredFoxy;
import com.fnaf.Common.Entity.WitheredFreddy.EntityWitheredFreddyMob;
import com.fnaf.Common.Entity.WitheredFreddy.RenderWitheredFreddy;
import com.fnaf.Common.Entity.WitheredFreddy.WitheredFreddy;
import com.fnaf.Common.Entity.balloonboy.BalloonBoy;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.Entity.balloonboy.RenderBalloonBoy;
import com.fnaf.Common.Entity.bonnie.Bonnie;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.bonnie.RenderBonnie;
import com.fnaf.Common.Entity.chica.Chica;
import com.fnaf.Common.Entity.chica.EntityChicaMob;
import com.fnaf.Common.Entity.chica.RenderChica;
import com.fnaf.Common.Entity.fnati.NM.EntityNegativeMickeyMob;
import com.fnaf.Common.Entity.fnati.NM.NegativeMickey;
import com.fnaf.Common.Entity.fnati.NM.RenderNegativeMickey;
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
import com.fnaf.Common.Items.FNAFItems;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	
	
	GuiMainMenuFNAF mm = new GuiMainMenuFNAF();
	
	@Override
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
		RenderingRegistry.registerEntityRenderingHandler(EntityWitheredChicaMob.class, new RenderWitheredChica(new WitheredChica(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityWitheredFoxyMob.class, new RenderWitheredFoxy(new WitheredFoxy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityWitheredFreddyMob.class, new RenderWitheredFreddy(new WitheredFreddy(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntityCameraMob.class, new RenderTheCamera(new ModelCamera(), 0));

		
		RenderingRegistry.registerEntityRenderingHandler(EntityPhantomBalloonBoyMob.class, new RenderPhantomBalloonBoy(new PhantomBalloonBoy(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhantomChicaMob.class, new RenderPhantomChica(new PhantomChica(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhantomMangleMob.class, new RenderPhantomMangle(new PhantomMangle(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhantomFoxyMob.class, new RenderPhantomFoxy(new PhantomFoxy(), 0));
		

		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNegativeMickeyMob.class, new RenderNegativeMickey(new NegativeMickey(), 0));
		
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FNAFItems.CB), new CustomModeledBlockRenderer(new TileEntityCamera(), new ModelCamera(), 0.0D, -0.1D, 0.0D, 0.0F));

		
		
		
		
	
	}
	private static final Bonnie modelBonnie = new Bonnie();
	
	@Override
	public Bonnie getArmorModel(String par1String)
	{
		
			return modelBonnie;
		}

public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	public static void register_renderers(){
		
	
	}

}