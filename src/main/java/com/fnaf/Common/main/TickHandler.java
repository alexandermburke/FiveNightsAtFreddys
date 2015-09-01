package com.fnaf.Common.main;

import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.gui.GuiMainMenuFNAF;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

public class TickHandler 
{
	int create = 0;
	int i, j, k;

	Minecraft mc = Minecraft.getMinecraft();
	
	public static GuiMainMenu mcmm = new GuiMainMenu();
	public static GUIRunMod runmod11 = new GUIRunMod();
	
	
		public boolean onTickInGUI(float tick, Minecraft game, GuiScreen gui)
	    {
	    	boolean mainmenu = mc.currentScreen instanceof GuiMainMenu;
	    	if(mainmenu) {
	    		create = 0;
	    	}
	        return mc.currentScreen!= runmod11;
	    }
	
	{	 
	/**
	 * Errors below have been fixed.
	 */

	if(Minecraft.getMinecraft().currentScreen == mcmm){
	
		
		Minecraft mc = Minecraft.getMinecraft();
		
		if(mc.currentScreen instanceof GuiMainMenu) {
			mc.currentScreen = null;
			
			mc.displayGuiScreen(runmod11);
		
			
		
		}

		
		
		
		/*ScaledResolution scaledresolution = new ScaledResolution(null, 0, 0);
		FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
		int width = scaledresolution.getScaledWidth();
		int height = scaledresolution.getScaledHeight();
		Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();*/

		
		}

			

}

	public static void mainregistry() {
		// TODO Auto-generated method stub
		
	}
}