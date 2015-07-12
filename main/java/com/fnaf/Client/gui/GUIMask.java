package com.fnaf.Client.gui;

import org.lwjgl.opengl.GL11;

import com.fnaf.Common.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GUIMask   extends GuiScreen{

	int guiwidth = 1024;
	int guiheight = 768;

	public void drawScreen(int x, int y, float ticks) {
		drawDefaultBackground();
		int guiY = (height - guiheight);
		int guiX = (width - guiwidth);
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/freddymask.png"));
		drawTexturedModalRect(guiY, guiX, 0, 0, guiwidth, guiheight);
		super.drawScreen(y, x, ticks);
		
		
		//fontRendererObj.drawString("Welcome Dev! This is the Developer portal.", guiX + 40, guiY + 5, 0xFFFFFF );
	}
	
	
	public void initGui() {
		
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		GuiButton DevButton;
		//buttonList.add(DevButton = new GuiButton(0, guiX + 10, guiY + 30, 20, 10, "Enter"));
		super.initGui();
	}
	
	public boolean doesGuiPauseGame()
    {
        return false;
    }
	
//	@Override
//	protected void actionPerformed(GuiButton button) {
	//	switch(button.id) {
		//case 0:
			//button.displayString = "Dev";
			//button.enabled = true;
	//	}
	//super.actionPerformed(button);
	}
	
	
	

