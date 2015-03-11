package com.T0psid3.Commands;
import com.T0psid3.core.FNAF;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.util.ChatComponentText;

public class CommandReloadModProperties extends CommandBase
{
	public CommandReloadModProperties()
	{
	}

	@Override
	public String getCommandName()
	{
		return "fnaf.reload";
	}

	@Override
	public String getCommandUsage(ICommandSender sender)
	{
		return "/fnaf.reload";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] arguments)
	{
		
		{
			throw new WrongUsageException(getCommandUsage(sender));
		}
	}

	@Override
	public int compareTo(Object arg0)
	{
		return 0;
	}
}
