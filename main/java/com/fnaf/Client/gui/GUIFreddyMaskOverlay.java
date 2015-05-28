package com.fnaf.Client.gui;

import java.util.Collection;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;

import com.fnaf.Client.main.Strings;

import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class GUIFreddyMaskOverlay extends Gui
{
	private static final ResourceLocation freddymask = new ResourceLocation(Strings.MODID + ":" + "textures/gui/freddymask.png");
	  private Minecraft mc;
	  private static final int BUFF_ICON_SIZE = 18;
	  private static final int BUFF_ICON_SPACING = BUFF_ICON_SIZE + 2;
	  private static final int BUFF_ICON_BASE_U_OFFSET = 0;
	  private static final int BUFF_ICON_BASE_V_OFFSET = 198;
	  private static final int BUFF_ICONS_PER_ROW = 8;

	  public GUIFreddyMaskOverlay(Minecraft mc)
	  {
	    super();
	    
	    this.mc = mc;
	 
	  }
	  
	  private boolean Doesguipausegame()
	  {
		  return false;
	  }

	  public void renderGameOverlay(float f1, boolean bol, int i1, int i2)
      {
      	
      }
	  
	  protected void renderPumpkinBlur(int p_73836_1_, int p_73836_2_)
	  {
		    GL11.glDisable(2929);
		    GL11.glDepthMask(false);
		    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		    GL11.glDisable(3008);
		    GL11.glDepthMask(true);
		    GL11.glEnable(2929);
		    GL11.glEnable(3008);
		    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	  }
	  
	  
	  //
	  // This EVENT is called by GuiIngameForge during each frame by
	  // GuiIngameForge.pre() and GuiIngameForce.post().
	  //
	  public void onRenderExperienceBar(RenderGameOverlayEvent event)
	  {
	    if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
	    {      
	      return;
	    }
	    

	    int xPos = 2;
	    int yPos = 2;
	    Collection collection = this.mc.thePlayer.getActivePotionEffects();
	    if (!collection.isEmpty())
	    {
	      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	      GL11.glDisable(GL11.GL_LIGHTING);      
	      this.mc.renderEngine.bindTexture(freddymask);      
	      for (Iterator iterator = this.mc.thePlayer.getActivePotionEffects()
	          .iterator(); iterator.hasNext(); xPos += BUFF_ICON_SPACING)
	      {
	        PotionEffect potioneffect = (PotionEffect) iterator.next();
	        Potion potion = Potion.potionTypes[potioneffect.getPotionID()];

	        if (potion.hasStatusIcon())
	        {
	          int iconIndex = potion.getStatusIconIndex();
	          this.drawTexturedModalRect(
	              xPos, yPos, 
	              BUFF_ICON_BASE_U_OFFSET + iconIndex % BUFF_ICONS_PER_ROW * BUFF_ICON_SIZE, BUFF_ICON_BASE_V_OFFSET + iconIndex / BUFF_ICONS_PER_ROW * BUFF_ICON_SIZE,
	              BUFF_ICON_SIZE, BUFF_ICON_SIZE);
	        }
	        
	      }
	    }
	  }
	}