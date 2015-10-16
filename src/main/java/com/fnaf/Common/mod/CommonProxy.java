package com.fnaf.Common.mod;

import net.minecraftforge.common.MinecraftForge;

import com.fnaf.Client.event.Events;
import com.fnaf.Common.Entity.bonnie.Bonnie;
import com.fnaf.Common.world.worldtype.WorldTypes;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

public void registerRenderThings(){
	
	//MinecraftForge.EVENT_BUS.register(new Events());
	//FMLCommonHandler.instance().bus().register(new Events());
	
	
	}
	
	public Bonnie getArmorModel(String par1String)
	{
		return null;
	}
	
    @EventHandler
	 public void preload(FMLPreInitializationEvent event) {
		  

	       	
		 
		 WorldTypes.loadWorldTypes();
	        
	        
	 }
}
