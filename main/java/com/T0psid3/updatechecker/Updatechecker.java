package com.T0psid3.updatechecker;

import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;
import com.T0psid3.pastebin.PastebinFileReader;

import java.util.List;

public class Updatechecker extends Thread
{
	public Update update;
	
	public void run()
	{
		boolean isNewUpdateAvailable = true;

		try 
		{
			List<String> text = PastebinFileReader.readFile("64d2Fnr1");

			String version = text.get(0).split("\\:")[1];
			Version newestVersion = new Version(version);
			Version currentVersion = new Version(RefStrings.VERSION);

			if (newestVersion.compareTo(currentVersion) == 1)
			{
				isNewUpdateAvailable = true;
				update = new Update(isNewUpdateAvailable, version, text.get(1).split("\\:")[1]);
			}
			else
			{
				isNewUpdateAvailable = false;
			}
		} 
		catch (Exception e) 
		{
			System.err.println("[Freddy Fazbear] Failed to read mod version! This maybe because you are disconnected from your wifi..If nto please contact T0psid3 on twitter @iosmcpemodders");
			e.printStackTrace();
		}
		
		if (update == null)
		{
			update = new Update();
		}
		
		MainRegistry.latestUpdate = update;
	}
	
	public void handleUpdates()
	{
		this.start();
	}
}