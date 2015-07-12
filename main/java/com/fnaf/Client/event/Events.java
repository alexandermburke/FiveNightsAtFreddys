package com.fnaf.Client.event;

import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.gui.GuiMainMenuFNAF;
import com.fnaf.Client.gui.jumpscares.GUIBonnieJumpscare;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.main.Reference;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class Events {
	public boolean hasSeen;

	
    public static void onEntityPlay(String name,World world,Entity entityName,float volume ,float pitch){
        world.playSoundAtEntity(entityName,("fnafvtwo:" + name), (float)volume,(float) pitch);
}
	

	EntityPlayer player;
	
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent event)
	{			
	
	
	
		
		if (event.entity instanceof EntityPlayer) 
		{
			
			EntityPlayer p = (EntityPlayer) event.entity;
			p.addChatMessage(new ChatComponentText("§5Thanks for downloading the FNAF Mod ~ Beta 3.5.0 View changes at: http://tinyurl.com/fnafmodbeta"));
			
		}
	
		
	
	
	
	}

	EntityPlayer player1;
	 boolean joined;

	  @SubscribeEvent
	  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	  { EntityPlayer player = event.player;
	       NBTTagCompound entityData = event.player.getEntityData();
	    if ((!entityData.getBoolean("joinedBefore")) && (!this.joined)) {  EntityPlayer player1 = event.player;
	    entityData.setBoolean("joinedBefore", true);
	    this.joined = true;
	    Minecraft.getMinecraft().displayGuiScreen(new GUIRunMod());
		  player.inventory.addItemStackToInventory(new ItemStack(FNAFItems.FreddysMask));
		  
		  }

		if (event.player instanceof EntityPlayer) 
		{
			  player.playSound(Reference.MODID + ":phonecall1", 1.0F , 1.0F );
					
		}
	    
	  }
	  
	


	@SubscribeEvent
	  public void onPlayerDeathByFNAF(LivingDeathEvent event)
	  {
		  
		  EntityPlayer p = Helper.PlayerEvent(null);
		  
		    if ((event.entity instanceof EntityPlayer))
		    {
		    	
		
		    	
		        if ((event.source.getEntity() instanceof EntityBonnieMob))
		        {
		    	
		        	System.out.println("Player jupscared by bonnie.");
		        	
		        	Minecraft.getMinecraft().displayGuiScreen(new GUIBonnieJumpscare(null, null));
		        	       
		        	
		        }
		        
		        
		        
		    }
		    
		  
	  }	
}				
