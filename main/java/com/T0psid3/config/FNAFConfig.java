package com.T0psid3.config;
import net.minecraftforge.common.config.Configuration;
public class FNAFConfig {
	
	public static boolean AI;
	public static boolean AILevel;
	public static boolean Controls;
	public static boolean EasterEggGTAJetpack;
	public static void load(Configuration config)
	{
		
	
		EasterEggGTAJetpack = config.getBoolean("Give the anamatronics a fucken jetpack D:", "Options", false, "");
		AI = config.getBoolean("AI On/Off", "Options", true, "If true, The AI will be much more advanced and act more aggresive towards players.");	
		AILevel = config.getBoolean("AI Level", "Numbers", true, "1", "(only works if true is on) 1 = Very easy and hardly any fighting need...20 = atleast 50 years of gaming xp needed.");
		Controls = config.getBoolean("C button to open gui", "Options", true, "Changes the buttton that opens the gui from right clicking the cmaera or tablet to a key bind tha opens the gui");
	
	
	
	
	}
	{
	
}}