package com.fnaf.Client.gui;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Iterator;
import java.util.List;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;


public class GuiMainMenuWarning extends GuiScreen
{
    private String field_146306_a;
    private List field_146305_g;


    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char par1, int par2) {}

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 -18,"Setup Skin Now"));
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 120 + 12,"Continue to Main Menu"));
        this.field_146305_g = this.fontRendererObj.listFormattedStringToWidth("DNAT is loaded. Explain how you should click the menu button to configure stuff. Blah blah blah.", this.width - 50);
    }

    protected void actionPerformed(GuiButton butt)
    {
        if (butt.id == 0)
        {
            this.mc.currentScreen=new GUIMainMenuFNAF();
        }
        if(butt.id==1){
        	System.out.println("This button does not work yet.");
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.field_146306_a, this.width / 2, this.height / 2 - 50, 11184810);
        int k = this.height / 2 - 30;

        if (this.field_146305_g != null)
        {
            for (Iterator iterator = this.field_146305_g.iterator(); iterator.hasNext(); k += this.fontRendererObj.FONT_HEIGHT)
            {
                String s = (String)iterator.next();
                this.drawCenteredString(this.fontRendererObj, s, this.width / 2, k, 16777215);
            }
        }

        super.drawScreen(par1, par2, par3);
    }
}