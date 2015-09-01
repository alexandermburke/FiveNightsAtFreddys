package com.fnaf.dev;

import com.fnaf.Client.gui.GUIDevMode;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemEnterDevMode extends Item {
	public itemEnterDevMode()
	{
		
	}
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GUIDevMode());
		return super.onItemRightClick(item, world, player);
	}

}
