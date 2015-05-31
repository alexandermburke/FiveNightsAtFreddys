package net.ilexiconn.llibrary.client.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.fnaf.Client.main.Strings;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiLLibMainMenu extends GuiOverride
{
    @SuppressWarnings("unchecked")
	public void initGui()
    {
        super.initGui();
        buttonList.add(new GuiButton(90, width / 2 - 100, 0, 200, 20, "Download FNAF Mod + Map"));
        buttonList.add(new GuiButton(91, width / 1 - 100, 1, 100, 20, "Developer"));
    	mc.renderEngine.bindTexture(new ResourceLocation(Strings.MODID + ":" + "textures/gui/camera.png"));
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