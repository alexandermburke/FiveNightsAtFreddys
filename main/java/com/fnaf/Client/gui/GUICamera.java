package com.fnaf.Client.gui;

import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Items.Tablet;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public class GUICamera extends GuiScreen {
	
	private Tablet cameraMonitor;
	private NBTTagCompound nbtTag;
	
	private int page = 1;
	
	public GUICamera() {
		
	}

	
	public void GuiCamera(Tablet item, NBTTagCompound itemNBTTag){
		
		this.cameraMonitor = item;
		this.nbtTag = itemNBTTag;
	}
	
	public void GuiCamera(Tablet item, NBTTagCompound itemNBTTag, int page){
		this.page = page;
	}
	
	@SuppressWarnings("unchecked")
	public void initGui(){
		super.initGui();
				
		this.buttonList.add(new GuiButton(((page * 5) - 4), 5, this.height - 45, 20, 20, "Back"));
        
		int counter = 1;
		for(int i = ((page * 5) - 3); i <= ((page * 5) + 1); i++){
				this.buttonList.add(new GuiButton(i, -25 + ((counter) * 70), this.height - 45, 60, 20, "Camera 1A" + (i - 1)));
			}			
			counter += 1;
		{}
		
		this.buttonList.add(new GuiButton(((page * 5) + 2), this.width - 25, this.height - 45, 20, 20, "Forward"));
		fontRendererObj.drawString("Cameras - Still buggy", 40, 5, 0xFFFFFF );
		
	}
    
    public void onGuiClosed(){
    	System.out.println("Camera gui Closed.");
    	
    	
    	/**
    	 * Play Tablet closing sound hear
    	 */
    	
    	/**
    	 * Teleport player back to where X was at.
    	 * X  Player
    	 */
    }
	
   
    
	public void drawScreen(int par1, int par2, float par3){
		super.drawScreen(par1, par2, par3);
    }
	
	protected void actionPerformed(GuiButton guibutton){		
		
//		if(guibutton.id == ((page * 5) - 4) && page > 1){
	//		this.mc.displayGuiScreen(new GUICamera());
		
	//	}else if(guibutton.id == ((page * 5) + 2) && cameraMonitor.getCameraPositions(nbtTag).size() > ((page * 5) - 1)){
		//	this.mc.displayGuiScreen(new GUICamera());
	
//		}else if(guibutton.id > page && guibutton.id <= (page * 6) ){
		
	//	}
		
	}

	public boolean doesGuiPauseGame()
    {
        return false;
        //Leave False for now, havent tested yet
    }
	
}