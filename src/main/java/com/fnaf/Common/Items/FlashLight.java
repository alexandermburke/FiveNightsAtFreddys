package com.fnaf.Common.Items;

import java.util.Random;

import com.fnaf.Client.gui.GUICamera;
import com.fnaf.Client.gui.GUIRunMod;
import com.fnaf.Client.sound.FNAFSoundHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
	

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
		
		
	        int l = world.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
	        double d0 = (double)((float)p_149734_2_ + 0.5F);
	        double d1 = (double)((float)p_149734_3_ + 0.7F);
	        double d2 = (double)((float)p_149734_4_ + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        if (l == 1)
	        {
	        	world.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 2)
	        {
	        	world.spawnParticle("smoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        	world.spawnParticle("flame", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 3)
	        {
	        	world.spawnParticle("smoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	        	world.spawnParticle("flame", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 4)
	        {
	        	world.spawnParticle("smoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	        }
	        else
	        {
	        	world.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        	world.spawnParticle("flame", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        }
	    
		
		
		
		
		return super.onItemRightClick(item, world, player);
	}
	
}
