package com.T0psid3;


import com.T0psid3.main.CommonProxy;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class FiveNightsAtFreddys {
	public static CommonProxy proxy;

	@Instance("interstellar")
	public static FiveNightsAtFreddys instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}
}

