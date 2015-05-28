package com.fnaf.Client.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{

    public static Configuration configuration;

    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean allowRecording = true;

        try
        {
            configuration.load();

            allowRecording = configuration.get(Configuration.CATEGORY_GENERAL, "allowRecording", true, "Allow users to record video footage.").getBoolean(true);
        }
        catch (Exception e)
        {
           System.out.print("TESTICALS");
        }
        finally
        {
            if (configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
}