package com.fnaf.Client.commands;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class Commands {
	public static void init(FMLServerStartingEvent event)
	{
		/**
		 * Force Faction commands
		 */
		event.registerServerCommand(new Commandrekt());
		
	}
}
