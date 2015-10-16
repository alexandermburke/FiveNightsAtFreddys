package com.fnaf.Client.gui;

import com.fnaf.Common.mod.Reference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUIWelcome extends GuiScreen{

	int guiwidth = 400;
	int guiheight = 350;
	
	public void drawScreen(int x, int y, float ticks) {
		drawDefaultBackground();
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/welcome.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiwidth, guiheight);
		super.drawScreen(x, y, ticks);
		
	}
	
	
	public void initGui() {
		
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		GuiButton DevButton;
		// buttonList.add(DevButton = new GuiButton(0, guiX + 10, guiY + 30, 20, 10, "Enter"));
		super.initGui();
	}
	
	protected void actionPerformed(GuiButton button) {
		switch(button.id) {
		case 0:
			button.displayString = "Dev";
			button.enabled = true;
		}
	super.actionPerformed(button);
	}
	
	
	
	
	
	
}
