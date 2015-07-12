package com.fnaf.Common.Items;

import com.fnaf.Client.gui.GUICamera;
import com.fnaf.Client.gui.GUIRunMod;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlashLight extends Item{
	
	public FlashLight() {
		
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GUIRunMod());
	
		return super.onItemRightClick(item, world, player);
	}
	
}
