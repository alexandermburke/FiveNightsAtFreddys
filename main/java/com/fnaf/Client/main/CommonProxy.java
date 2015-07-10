package com.fnaf.Client.main;

import net.minecraftforge.common.MinecraftForge;

import com.fnaf.Client.event.Events;
import com.fnaf.Common.Entity.bonnie.Bonnie;

import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy {

public void registerRenderThings(){
	
	//MinecraftForge.EVENT_BUS.register(new Events());
	//FMLCommonHandler.instance().bus().register(new Events());
	
	
	}
	
	public Bonnie getArmorModel(String par1String)
	{
		return null;
	}
}
