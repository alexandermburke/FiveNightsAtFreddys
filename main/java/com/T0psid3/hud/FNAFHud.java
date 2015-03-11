package com.T0psid3.hud;

import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class FNAFHud  extends Gui
{

	  private static final ResourceLocation hud = new ResourceLocation("fnafhud", "textures/freddyblur.jpg");
	   //HUD is VERY basic right now...execpt changes
	  private float old_health = 0.0F;
	  public static int x = 0;
	  private float hunger;
	  public static void fix()
	  {
	    x = 0;
	  }
	  public static void set()
	  {
	    x = 1;
	  }
	  @SubscribeEvent(priority=EventPriority.NORMAL)
	  public void RenderHUD(RenderGameOverlayEvent event)
	  {
	  
	  
	    GL11.glEnable(3042);
	   
	  

	    }
	  }    
	  
