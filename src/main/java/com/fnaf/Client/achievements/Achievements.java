package com.fnaf.Client.achievements;

import com.fnaf.Common.Items.FNAFItems;

import net.minecraft.block.Block;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class Achievements {
	
	

	 public static Achievement LoadMod = (new Achievement("achievement.fivenightsatfreddys_mod", "fivenightsatfreddys_mod", 0, 0, FNAFItems.Hook, null)).initIndependentStat().registerStat();
	   
	 public static Achievement KilledByAmythest = (new Achievement("achievement.killed_by_animatronics", "killed_by_animatronics", 0, 0, FNAFItems.FreddyHelmet, null)).initIndependentStat().registerStat();
		
	 public static Achievement Dev = (new Achievement("achievement.dev", "dev", 0, 0, FNAFItems.flashlight, null)).initIndependentStat().registerStat();
		
	    public static AchievementPage FNAFPage = new AchievementPage("fivenightsatfreddys", LoadMod);
	   
	  public static void register()
	    {
	        AchievementPage.registerAchievementPage(FNAFPage);
	    }
	 






 }
