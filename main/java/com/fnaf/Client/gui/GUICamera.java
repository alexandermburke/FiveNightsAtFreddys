package com.fnaf.Client.gui;

import com.fnaf.Client.main.Strings;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUICamera extends GuiScreen{

	int guiwidth = 1300;
	int guiheight = 900;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
//		drawDefaultBackground();
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":" + "textures/gui/camera.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiwidth, guiheight);
		super.drawScreen(x, y, ticks);
		fontRendererObj.drawString("Cameras:", guiX + 40, guiY + 5, 0xFFFFFF );
	}
	
	
	@Override
	public void initGui() {
		
		int guiX = (height - guiheight);
		int guiY = (width - guiwidth);
		GuiButton DevButton;
		buttonList.add(DevButton = new GuiButton(0, guiX + 10, guiY + 30, 20, 10, "Enter"));
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id) {
		case 0:
			button.displayString = "Dev";
			button.enabled = false;
		}
	super.actionPerformed(button);
	}
	
	
	
	
	
	
}
