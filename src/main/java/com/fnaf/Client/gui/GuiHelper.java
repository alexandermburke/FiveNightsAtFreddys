package com.fnaf.Client.gui;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;

import java.util.List;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class GuiHelper {
	
	  private static Map<GuiOverride, Class<? extends GuiScreen>> overrideMap = Maps.newHashMap();
	 
	  public static void addOverride(Class<? extends GuiScreen> clazz, GuiOverride gui)
	    {
	        overrideMap.put(gui, clazz);
	    
}
	  public static List<GuiOverride> getOverridesForGui(Class<? extends GuiScreen> clazz)
	    {
	        List<GuiOverride> list = Lists.newArrayList();

	        for (Map.Entry<GuiOverride, Class<? extends GuiScreen>> e : overrideMap.entrySet())
	        {
	            if (e.getValue() == clazz)
	            {
	                list.add(e.getKey());
	            }
	        }

	        return list;
	    }

	    public static Map<GuiOverride, Class<? extends GuiScreen>> getOverrides()
	    {
	        return overrideMap;
	    }
	}

