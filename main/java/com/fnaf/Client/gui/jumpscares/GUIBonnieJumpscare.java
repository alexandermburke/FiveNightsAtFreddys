package com.fnaf.Client.gui.jumpscares;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.opengl.GL11;

import com.fnaf.Client.gui.GUIOverlayDev.Render;
import com.fnaf.Common.main.Reference;

public class GUIBonnieJumpscare extends GuiScreen {
	
	public static void load(){
		MinecraftForge.EVENT_BUS.register(new Render());
	}
	
	
	
	Minecraft mc = Minecraft.getMinecraft();
	  private World worldObj;
	  public EntityPlayer player;
	  EntityLivingBase par3EntityLivingBase;
	  ItemStack par1ItemStack;
	  
	  
	  
	  //private static final ResourceLocation[] jumps = new ResourceLocation[] {new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
	  
	  public ResourceLocation jumps = new ResourceLocation(Reference.MODID + ":textures/gui/jumpscare/bonniejumpscare.png");
	  
	  public GUIBonnieJumpscare(EntityPlayer player, World world)
	  {
	    this.player = player;
	    this.worldObj = world;
	    
	  }
	
			  
		    protected void renderPumpkinBlur(int p_73836_1_, int p_73836_2_)
		    {
		        GL11.glDisable(GL11.GL_DEPTH_TEST);
		        GL11.glDepthMask(false);
		        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		        GL11.glDisable(GL11.GL_ALPHA_TEST);
		        this.mc.getTextureManager().bindTexture(jumps);
		        Tessellator tessellator = Tessellator.instance;
		        tessellator.startDrawingQuads();
		        tessellator.addVertexWithUV(0.0D, (double)p_73836_2_, -90.0D, 0.0D, 1.0D);
		        tessellator.addVertexWithUV((double)p_73836_1_, (double)p_73836_2_, -90.0D, 1.0D, 1.0D);
		        tessellator.addVertexWithUV((double)p_73836_1_, 0.0D, -90.0D, 1.0D, 0.0D);
		        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
		        tessellator.draw();
		        GL11.glDepthMask(true);
		        GL11.glEnable(GL11.GL_DEPTH_TEST);
		        GL11.glEnable(GL11.GL_ALPHA_TEST);
		        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		    }
}
