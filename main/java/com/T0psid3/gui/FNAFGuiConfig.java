package com.T0psid3.gui;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;

public class FNAFGuiConfig extends GuiConfig
{
	public FNAFGuiConfig(GuiScreen parent)
	{
		super(
			parent,
			new ConfigElement(MainRegistry.configFile.getCategory("Options")).getChildElements(),
			RefStrings.MODID,
			false,
			false,
			FNAFGuiConfig.getAbridgedConfigPath(MainRegistry.configFile.toString()));
	}
}