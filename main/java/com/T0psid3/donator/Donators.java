package com.T0psid3.donator;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.T0psid3.achievement.FNAFAchievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.relauncher.Side;
import com.T0psid3.achievement.FNAFAchievements;
import com.T0psid3.donator.DonatorLoader;
import com.T0psid3.donator.Money;

public class Donators {
	public static Map<UUID, Money> donators = new HashMap<UUID, Money>();

	public static void loadDonators()
	{
		donators.clear();

		DonatorLoader loader = new DonatorLoader();
		loader.loadDonators();
	}

	public static boolean isDonator(UUID id)
	{
		return donators.containsKey(id);
	}

	public static boolean isDonator(EntityPlayer player)
	{
		return isDonator(player.getUniqueID());
	}

	public static Money getDonationAmount(UUID id)
	{
		Money money = donators.get(id);

		if (money == null)
		{
			money = new Money("$0");
		}

		return money;
	}

	public static Money getDonationAmount(EntityPlayer player)
	{
		return getDonationAmount(player.getUniqueID());
	}

	public static void doAchievements(Side side)
	{
		if (side.isServer())
		{
			for (WorldServer world : MinecraftServer.getServer().worldServers) 
			{
				for (Object player : world.playerEntities)
				{
					if (player instanceof EntityPlayer)
					{
						if (isDonator((EntityPlayer) player))
						{
							((EntityPlayer) player).addStat(FNAFAchievements.donate, 1);
						}
					}
				}
			}
		}
	}
}
