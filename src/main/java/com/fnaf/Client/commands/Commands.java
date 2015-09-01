package com.fnaf.Client.commands;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class Commands {
	public static void register(FMLServerStartingEvent event)
	{
		/**
		 * Force Faction commands
		 */
		event.registerServerCommand(new Commandrekt());
		event.registerServerCommand(new CommandDisableJumpscares());
		event.registerServerCommand(new CommandEnableJumpscares());
		
	}
}
