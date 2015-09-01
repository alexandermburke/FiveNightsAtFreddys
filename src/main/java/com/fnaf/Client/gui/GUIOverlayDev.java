package com.fnaf.Client.gui;

import org.lwjgl.opengl.GL11;

import scala.reflect.internal.Trees.Super;

import com.fnaf.Common.main.Reference;

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
	private static final ResourceLocation renderer = new ResourceLocation("/gui/inventory.png");


	
	public static class Render
{
		Minecraft mc;
		
    @SubscribeEvent
	public void eventHandler(RenderGameOverlayEvent event){
	
		if(event.type == event.type.HOTBAR)
		    {

	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        GL11.glDisable(GL11.GL_LIGHTING);      
	    	GL11.glEnable(GL11.GL_DEPTH_TEST);
	    	GL11.glDepthMask(true);
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
	
						Minecraft.getMinecraft().fontRenderer.drawString(Reference.AM + " AM", posX+(285), posY+(-160), 0xffffff);
						Minecraft.getMinecraft().fontRenderer.drawString("Night 1", posX+(280), posY+(-145), 0xffffff);
						
						
					
		    }
		
	
		
		}
    
    }
    
   
    	

@SubscribeEvent
public void render(RenderGameOverlayEvent.Post event) {
}

}
}
