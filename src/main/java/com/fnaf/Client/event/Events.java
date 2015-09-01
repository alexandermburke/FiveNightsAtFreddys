
package com.fnaf.Client.event;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.fnaf.Client.achievements.Achievements;
import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.gui.GuiMainMenuFNAF;
import com.fnaf.Client.gui.jumpscares.GUIBonnieJumpscare;
import com.fnaf.Client.sound.FNAFSoundHandler;
import com.fnaf.Common.Entity.Nightmare.Bonnie.EntityNightmareBonnieMob;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Entity.plushie.bonnie.EntityBonniePlushie;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.main.Reference;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.world.WorldEvent;

public class Events {

	  
						public boolean hasSeen;
						Minecraft mc = Minecraft.getMinecraft();
						public EntityPlayer player = mc.thePlayer;
						World world = mc.theWorld;
		
			 @SubscribeEvent
			public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
			{
		
			}
			 
						
						
			@SubscribeEvent
		   public void playerInteract(EntityInteractEvent event)
		   {
					    	
		   }
		
	
			@SubscribeEvent
		    public void worldLoad(WorldEvent.Load event)
		    {
			  
		    }
	
	
	
			@SubscribeEvent
			public void clientLoggedIn(EntityJoinWorldEvent event)
			{			
		
		
		
			
			if (event.entity instanceof EntityPlayer) 
			{
				
								EntityPlayer player = (EntityPlayer) event.entity;
							
							player.addStat(Achievements.LoadMod, 1);
				
						player.addChatMessage(new ChatComponentText("Welcome to Five nights at Freddy's Mod 4"));
		   }
			
		}

	
	

				@SubscribeEvent
				public void onPlayerDeathByFNAF(LivingDeathEvent event)
				{
		
		  	
		    	
		        if ((event.source.getEntity() instanceof EntityNightmareBonnieMob))
		        {
		    	
		        	FNAFSoundHandler.jumpscare(player, 20, 1);
		        	
		        	
		        	       
		        	 mc.thePlayer.addStat(Achievements.KilledByAmythest, 1);
		        	
		        }
		        
		        if ((event.source.getEntity() instanceof EntityGoldenFreddyMob))
		        {
		    	
		        	System.out.println(player + "jumpscared by Golden Freddy.");
		        	
		        	       
		        	System.exit(0);
		        	
		        	
		        }
		        
		        if ((event.source.getEntity() instanceof EntityBonniePlushie))
		        {
		        	
		        	mc.thePlayer.addChatMessage(new ChatComponentText("Trololololol"));
		        	
					FNAFSoundHandler.jumpscare(mc.thePlayer, 20, 1);
					
					
					mc.thePlayer.addStat(Achievements.KilledByAmythest, 1);
		        	
		        }
		        
		    }
	

	
	
	
	public void renderHelmetOverlay(ItemStack stack, EntityPlayer player, ScaledResolution resolution, float partialTicks, boolean hasScreen, int mouseX, int mouseY)
    {
    	ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		int width = res.getScaledWidth();
		int height = res.getScaledHeight();
		
		if (res != null)
		{
	        Tessellator tessellator = Tessellator.instance;

			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.6F);
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
	        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
	        tessellator.draw();
	        GL11.glEnable(GL11.GL_TEXTURE_2D);
	        
			GL11.glEnable(GL11.GL_BLEND);
	    	GL11.glDisable(GL11.GL_DEPTH_TEST);
	        GL11.glDepthMask(false);
	        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	        float f = 0.5F;
	        GL11.glColor4f(f, f, f, 1.0F);
	        GL11.glDisable(GL11.GL_ALPHA_TEST);
	        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/freddymask.png"));
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
	        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
	        tessellator.draw();
	        GL11.glDepthMask(true);
	        GL11.glEnable(GL11.GL_DEPTH_TEST);
	        GL11.glEnable(GL11.GL_ALPHA_TEST);
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);	        
		}
    }
	
		  
}