package com.fnaf.Client.event.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;

public class JumpscareEvent {
private Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void renderTickOverlay(Pre event)
	{
		if (mc.thePlayer != null)
		{
			if (event.type == RenderGameOverlayEvent.ElementType.HOTBAR)
			{
		
				
				
				
			}
		}
	}

	
}
