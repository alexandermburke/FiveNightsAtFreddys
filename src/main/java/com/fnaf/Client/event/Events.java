
package com.fnaf.Client.event;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.fnaf.Client.achievements.Achievements;
import com.fnaf.Client.gui.GUIMainMenuFNAF;
import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.gui.GuiMainMenuWarning;
import com.fnaf.Client.sound.FNAFSoundHandler;
import com.fnaf.Common.Entity.Nightmare.Bonnie.EntityNightmareBonnieMob;
import com.fnaf.Common.Entity.Nightmare.Freddy.EntityNightmareFreddyMob;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Entity.plushie.bonnie.EntityBonniePlushie;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.mod.Reference;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
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

//@SideClient(Side.CLIENT)
public class Events {

	  
						public boolean hasSeen;
						Minecraft mc = Minecraft.getMinecraft();
						public EntityPlayer player = mc.thePlayer;
						World world = mc.theWorld;
		
			 @SubscribeEvent
			public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
			{
		
			}
			 
			 @SuppressWarnings("unused")
			@SubscribeEvent
				public void onGuiOpenEvent(GuiOpenEvent event) {
					if (event.gui instanceof GuiMainMenu) {
						if (!(event.gui instanceof GUIMainMenuFNAF)) {
							if (/*ModDNAT.instance.clientSettings.hasMainMenuWarningBeenShown*/ true) {
								Minecraft.getMinecraft().currentScreen=(
										new GuiMainMenuWarning());
							} else {
								Minecraft.getMinecraft().displayGuiScreen(
										new GUIMainMenuFNAF());
							}
						}else{
							System.out.println("Instance of DNATGuiMainMenu");
						}

					}else{
						System.out.println("Gui opened: no instance of GuiMainMenu.");
					}
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
				
						player.addChatMessage(new ChatComponentText("Welcome to Five nights at Freddy's Mod 4!"));
		  
				        	
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
		        
		        if ((event.source.getEntity() instanceof EntityNightmareFreddyMob))
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
	

	
	
	
	
		  
}