package com.T0psid3.main;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

import com.T0psid3.FNAFEntities;
import com.T0psid3.block.FNAFBlocks;
import com.T0psid3.items.FNAFItems;
import com.T0psid3.main.MainRegistry;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerRenderers(MainRegistry ins) {
	}

	public void preInit() {
		FNAFBlocks.register();
		FNAFItems.register();
		FNAFEntities.register();
	}
}
