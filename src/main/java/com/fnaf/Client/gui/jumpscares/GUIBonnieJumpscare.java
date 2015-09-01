package com.fnaf.Client.gui.jumpscares;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.opengl.GL11;

import com.fnaf.Client.gui.GUIOverlayDev.Render;
import com.fnaf.Client.sound.FNAFSoundHandler;
import com.fnaf.Common.Entity.Nightmare.Bonnie.EntityNightmareBonnieMob;
import com.fnaf.Common.Entity.Nightmare.Bonnie.NightmareBonnie;
import com.fnaf.Common.main.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GUIBonnieJumpscare  {
	
	public static void load(){
		MinecraftForge.EVENT_BUS.register(new Render());
	}
	
	
	
	Minecraft mc = Minecraft.getMinecraft();
	  private World worldObj;
	  public EntityPlayer player = mc.thePlayer;
	  EntityLivingBase par3EntityLivingBase;
	  ItemStack par1ItemStack;
	
	  private FNAFSoundHandler sound = new FNAFSoundHandler();
	  private EntityNightmareBonnieMob entity = new EntityNightmareBonnieMob(worldObj);
	  private NightmareBonnie model = new NightmareBonnie();
	  
	  
	  
	  //private static final ResourceLocation[] jumps = new ResourceLocation[] {new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
	  
	  public ResourceLocation jumps = new ResourceLocation(Reference.MODID + ":textures/gui/jumpscare/bonniejumpscare.png");
	  
	  public GUIBonnieJumpscare(EntityPlayer player, World world)
	  {
	    this.player = player;
	    this.worldObj = world;
	    
	 
	  }
	
	    @SubscribeEvent
		public void eventHandler(RenderGameOverlayEvent event){
		
			if(event.type == event.type.HOTBAR)
			    {

		        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		        GL11.glDisable(GL11.GL_LIGHTING);      
		    	GL11.glEnable(GL11.GL_DEPTH_TEST);
		    	GL11.glDepthMask(true);
				int posX = (event.resolution.getScaledWidth()) /2;
			    int posY = (event.resolution.getScaledHeight()) /2;

			    EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
				int i = (int)entity.posX;
				int j = (int)entity.posY;
				int k = (int)entity.posZ;
				MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
				World world = server.worldServers[0];
				
				Minecraft.getMinecraft().renderEngine.bindTexture(jumps);
			
				if(true){
		
						this.renderPumpkinBlur(1, 1);	
						model.render(entity, 1.0F, 1.0F, 1.0F, 1.0F , 1.0F, 1.0F);
						FNAFSoundHandler.jumpscare(mc.thePlayer, 20, 1);
		
				}
			
		
			
			}
	    
	    }
	    
		public boolean doesGuiPauseGame()
	    {
	        return false;
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
