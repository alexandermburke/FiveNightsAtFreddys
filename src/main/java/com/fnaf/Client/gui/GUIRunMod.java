package com.fnaf.Client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

import org.lwjgl.input.Mouse;

import com.fnaf.Common.main.MAIN_FNAF.GameMode;

public class GUIRunMod extends GuiScreen
{
    public boolean running = true;
    private int mouseCount = 0;

  
    public GUIRunMod()
    {
    }
    
    
    public static boolean DoesGuiPauseGame()
    {
    	return false;
    }
    
    
    public void initGui()
    {
        buttonList.add(new GuiButton(100, (width / 2 - 75) , 40, "Do NOT run Five nights at Freddys"));
        buttonList.add(new GuiButton(200, (width / 2 - 75) , 90, "Normal Mode"));
        buttonList.add(new GuiButton(300, (width / 2 - 75) , 140, "Creative Mode"));
        buttonList.add(new GuiButton(400, (width / 2 - 75) , 190, "Hardcore Mode (Nightmare Mode)"));
        buttonList.add(new GuiButton(500, (width / 2 - 75) , 335, "Report a bug"));
    }

    public void drawScreen(int i, int j, float f)
    {
        try
        {
            if (mouseCount < 10)
            {
                mouseCount++;
                Mouse.setGrabbed(false);
            }

            drawDefaultBackground();
            drawCenteredString(fontRendererObj, "Please choose the game mode for Five nights at Freddys (Expieremental)", width / 2, 20, 0xffffff);
            drawCenteredString(fontRendererObj, "This mode switches off Five nights at freddys for this world.", width / 2, 60, 0xFF0724);
            drawCenteredString(fontRendererObj, "Regular Minecraft, unless yiou are counting the jumpscares.", width / 2, 110, 0xFF0724);
            drawCenteredString(fontRendererObj, "Creative is creative, do what ever when ever!", width / 2, 160, 0xFF0724);
            drawCenteredString(fontRendererObj, "Nightmare mode makes the Entitys spawn more frequent and attack more violetnly.", width / 2, 210, 0xFF0724);
        }
        catch (Exception e)
        {
        }

        super.drawScreen(i, j, f);
    }

    EntityPlayer p;
    protected void actionPerformed(GuiButton guibutton)
    {
        if (guibutton.id == 100)  
        {
        //	p.addChatComponentMessage(new ChatComponentText("§2 You have turned off the fnaf mod."));           
        	mc.thePlayer.closeScreen();
        	 this.running = false;
        	 System.err.println("Button ID 0");
        }
        else if (guibutton.id == 200)    
        {
            
        //	p.addChatComponentMessage(new ChatComponentText("§4 You have put the fnaf mod in Normal"));      
        	 this.running = false;
        	 mc.thePlayer.closeScreen();
        }
        else if (guibutton.id == 300)    
        {
                                             
        //    p.addChatComponentMessage(new ChatComponentText("§6 You have Entered Creative Mode"));      
            GameMode.CREATIVE();
            this.running = false;
            mc.thePlayer.closeScreen();
        }
        else if (guibutton.id == 400)    
        {
         
      //      p.addChatComponentMessage(new ChatComponentText("§8 You have choosen Hardcore Mode"));      
            this.running = false;
            mc.thePlayer.closeScreen();
        }
        
    }
}
