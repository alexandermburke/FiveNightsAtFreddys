package com.fnaf.Client.event;

import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.gui.jumpscares.GUIBonnieJumpscare;
import com.fnaf.Client.main.Strings;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class Events {
	public boolean hasSeen;

	 
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent event)
	{			
	
		  
		 
		System.out.println("ClientLoggedIn Event successful.");
		
		
		if (event.entity instanceof EntityPlayer) 
		{
			EntityPlayer p = (EntityPlayer) event.entity;
			p.addChatMessage(new ChatComponentText("§5Thanks for downloading the FNAF Mod ~ Beta 3.5.0 View changes at: http://tinyurl.com/fnafmodbeta"));
			
		}
	
		
	
	
	
	}

	

	  @SubscribeEvent
	  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	  {
		  
		  EntityPlayer player = event.player;
		  
		  Minecraft.getMinecraft().displayGuiScreen(new GUIRunMod());
			
		  // Play Phone call
		  player.playSound(Strings.MODID + ":startphonecall", 1.0F , 1.0F );



	  }
	  



	@SubscribeEvent
	  public void onPlayerDeathByFNAF(LivingDeathEvent event)
	  {
		  
		  
		  event.setCanceled(true);
		    if ((event.entity instanceof EntityPlayer))
		    {
		    	

		        if ((event.source.getEntity() instanceof EntityBonnieMob))
		        {
		    	
		        	System.out.println("Player jupscared by bonnie.");
		        	  FMLCommonHandler.instance().showGuiScreen(new GUIBonnieJumpscare((EntityPlayer)event.entity, event.entity.worldObj));
		              
		        	
		        }
		        
		        
		        
		    }
		    
		  
	  }	
}				
