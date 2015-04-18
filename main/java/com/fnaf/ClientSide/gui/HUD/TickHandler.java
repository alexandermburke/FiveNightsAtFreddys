package com.fnaf.ClientSide.gui.HUD;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class TickHandler extends Gui
{
	 
	/* 
	 * Yes I know there are errors below, I am trying to fix them :P
	 */
	
	if(Minecraft.getMinecraft().currentScreen == null){
		ScaledResolution scaledresolution = new ScaledResolution(Minecraft.getMinecraft().gameSettings, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
		int width = scaledresolution.getScaledWidth();
		int height = scaledresolution.getScaledHeight();
		Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();

		
		}

	public static void mainregistry() {
		// TODO Auto-generated method stub
		
	}
}
}