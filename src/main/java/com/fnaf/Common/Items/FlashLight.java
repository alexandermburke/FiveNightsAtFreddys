package com.fnaf.Common.Items;

import com.fnaf.Client.gui.GUICamera;
import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.sound.FNAFSoundHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FlashLight extends Item{
	Minecraft mc = Minecraft.getMinecraft();
	EntityPlayer p = mc.thePlayer;
	public FlashLight() {
		
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		FNAFSoundHandler.Phonecall1(p, 20, 1);
		return super.onItemRightClick(item, world, player);
	}
	
}
