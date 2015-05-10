package com.fnaf.Client.Items.Plushies;

import com.fnaf.Common.Entity.freddy.EntityFreddy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemFreddysPlushie extends Item{
	public itemFreddysPlushie()
	{
		this.maxStackSize = 1;
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		

					Entity Freddy = new EntityFreddy(world);
					
					if (!world.isRemote)
					{
						world.spawnEntityInWorld(Freddy);
					}

					

				return stack;
			}
		}
	
