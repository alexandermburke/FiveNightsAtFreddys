package com.T0psid3.hud;



import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.potion.Potion;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.FoodStats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;


public class FNAFRender  extends Gui
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
  
