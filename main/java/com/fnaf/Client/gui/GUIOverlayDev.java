package com.fnaf.Client.gui;

import scala.reflect.internal.Trees.Super;

import com.fnaf.Client.main.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GUIOverlayDev {
	
	public static void load(){
		MinecraftForge.EVENT_BUS.register(new Render());
	}
	
	Minecraft mc;
	private static final ResourceLocation renderer = new ResourceLocation(Strings.MODID + "textures/gui/widgets.png");

	
	public static class Render
{
    @SubscribeEvent
	public void eventHandler(RenderGameOverlayEvent event){
    	
		int posX = (event.resolution.getScaledWidth()) /2;
	    int posY = (event.resolution.getScaledHeight()) /2;

	    EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
		int i = (int)entity.posX;
		int j = (int)entity.posY;
		int k = (int)entity.posZ;
		MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
		World world = server.worldServers[0];
		
		Minecraft.getMinecraft().renderEngine.bindTexture(renderer);
		
		if(true){

			Minecraft.getMinecraft().fontRenderer.drawString("Fnaf Mod 3.5.0 - Unlicensed Dev Copy :(", posX+(-205), posY+(-150), 0xffffff);
			Minecraft.getMinecraft().fontRenderer.drawString("Or in a development environment.", posX+(-205), posY+(-140), 0xffffff);
			Minecraft.getMinecraft().fontRenderer.drawString("FNAF Mod Version: 3.5.0PRE-ALPHA", posX+(-340), posY+(150), 0xffffff);
			
		
		}
    }
}
}
