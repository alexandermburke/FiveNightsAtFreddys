package com.T0psid3.achievement;
import com.T0psid3.core.FNAF;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraft.stats.StatBase;
import com.T0psid3.block.FNAFBlocks;
import com.T0psid3.items.FNAFItems;

		

public class FNAFAchievements {
	//Achievements statics
	public static Achievement donate = new Achievement("fnaf.donate", "fnaf.donate", 0, 2, Items.diamond, null).setSpecial().registerStat();
	public static Achievement fnaf = (new Achievement("achievement.fnaf_mod", "fnaf_mod", 0, 0, FNAFBlocks.FPresent, null)).initIndependentStat().registerStat();
	//Achievement page
	public static AchievementPage fnafPage = new AchievementPage("Freddy", fnaf, donate);
	public static void register()
	{
		AchievementPage.registerAchievementPage(fnafPage);
	}}
