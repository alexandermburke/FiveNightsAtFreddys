package com.T0psid3.donator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import com.T0psid3.pastebin.PastebinFileReader;

public class DonatorLoader extends Thread
{
	//Thank you Fisk For the open source it helped this specific part of the mod A LOT
	private Side side;
	
	public void run()
	{try 
		{
			List<String> text = PastebinFileReader.readFile("1Vp1hqzt");
			for (String line : text) 
			{
				String[] split = line.split(Pattern.quote(": "));
				Donators.donators.put(UUID.fromString(split[0]), new Money(split[1]));
			}
			
			Donators.doAchievements(side);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void loadDonators()
	{
		side = FMLCommonHandler.instance().getEffectiveSide();
		this.start();
	}
}

