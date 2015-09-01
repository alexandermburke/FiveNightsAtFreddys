package com.fnaf.Client.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.util.ScreenShotHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Utils {

	
	
	public static boolean toggleBoolean(boolean par1) {
		return !par1;
	}

public static class ClientUtils{
	
	/**
	 * Closes any GUI that is currently open. <p>
	 * 
	 * Only works on the CLIENT side. 
	 */
	@SideOnly(Side.CLIENT)
	public static void closePlayerScreen(){
		Minecraft.getMinecraft().displayGuiScreen((GuiScreen)null);
		Minecraft.getMinecraft().setIngameFocus();
	}
	
	/**
	 * Sets the "zoom" of the client's view.
	 * 
	 * Only works on the CLIENT side. 
	 */
	@SideOnly(Side.CLIENT)
	public static void setCameraZoom(double zoom){
		if(zoom == 0){
			ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, 1.0D, 46);
			return;
		}
		
		double tempZoom = ObfuscationReflectionHelper.getPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, 46);
		ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, tempZoom + zoom, 46);
	}
	
	/**
	 * Gets the "zoom" of the client's view.
	 * 
	 * Only works on the CLIENT side. 
	 */
	@SideOnly(Side.CLIENT)
	public static double getCameraZoom(){
		return ObfuscationReflectionHelper.getPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, 46);
	}
	
	/**
	 * Takes a screenshot, and sends the player a notification. <p>
	 * 
	 * Only works on the CLIENT side. 
	 */
	@SideOnly(Side.CLIENT)
	public static void takeScreenshot() {
        if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT){
        	Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(ScreenShotHelper.saveScreenshot(Minecraft.getMinecraft().mcDataDir, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, Minecraft.getMinecraft().getFramebuffer()));	
        }
	}
	
	/**
	 * Returns the current Minecraft in-game time, in a 12-hour AM/PM format.
	 * 
	 * Only works on the CLIENT side. 
	 */
	@SideOnly(Side.CLIENT)
	public static String getFormattedMinecraftTime(){
		Long time = Long.valueOf(Minecraft.getMinecraft().theWorld.provider.getWorldTime());
		
		int hours24 = (int) ((float) time.longValue() / 1000L + 6L) % 24;
		int hours = hours24 % 12;
		int minutes = (int) ((float) time.longValue() / 16.666666F % 60.0F);
		
		return String.format("%02d:%02d %s", new Object[]{Integer.valueOf(hours < 1 ? 12 : hours), Integer.valueOf(minutes), hours24 < 12 ? "AM" : "PM"});
	}
}
}