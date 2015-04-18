package com.fnaf.ClientSide.gui.HUD;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class TickHandler extends Gui
{
	{	 
	/**
	 * Errors below have been fixed.
	 */
	
	if(Minecraft.getMinecraft().currentScreen == null){
		ScaledResolution scaledresolution = new ScaledResolution(null, 0, 0);
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
		int width = scaledresolution.getScaledWidth();
		int height = scaledresolution.getScaledHeight();
		Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();

		
		}

			

}

	public static void mainregistry() {
		// TODO Auto-generated method stub
		
	}
}