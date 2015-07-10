package com.fnaf.Client.event;

import com.fnaf.Client.gui.GUICamera;
import com.fnaf.Client.gui.GUIDevMode;
import com.fnaf.Client.gui.GUIOverlayDev;
import com.fnaf.Client.gui.GUIWelcome;
import com.fnaf.Client.web.Link;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Items.FNAFItems;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;

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

	
	

	
	
}				
