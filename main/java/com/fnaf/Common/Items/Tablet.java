package com.fnaf.Common.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.fnaf.Client.gui.GUICamera;
import com.fnaf.Client.gui.GUIDevMode;

public class Tablet extends Item {
	public Tablet()
	{
		
	}
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GUICamera());
		return super.onItemRightClick(item, world, player);
	}

}
