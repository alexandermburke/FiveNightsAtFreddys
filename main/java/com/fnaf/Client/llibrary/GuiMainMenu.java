package com.fnaf.Client.llibrary;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


import net.ilexiconn.llibrary.client.gui.GuiOverride;
import net.minecraft.client.gui.GuiButton;

public class GuiMainMenu extends GuiOverride {

	public void initGui()
    {
		 super.initGui();
	       
		 
		 buttonList.add(new GuiButton(90, width / 2 - 100, 0, 200, 20, "MiniGames!"));
		
		
		
    }
	 public void actionPerformed(GuiButton button)
	    {
	    	if (button.id == 91)
	    	{
	    		System.out.println("Enter Developer mode at: http://www.itopside.us/devmode");
	    	}
	    	
	    	if (button.id == 90)
	    	{
	    		System.out.println("Checking for updates in: http://www.planetminecraft.com/mod/instanthouse-mod-132-one-click-one-house/");
	  
	    	 try {
	    		    Desktop.getDesktop().browse(new URI("http://www.planetminecraft.com/mod/instanthouse-mod-132-one-click-one-house/"));
	    		   } catch (IOException e) {
	    		    e.printStackTrace();
	    		   } catch (URISyntaxException e) {
	   		    e.printStackTrace();
	    		   }
	  		  
	    }
	    }
}
