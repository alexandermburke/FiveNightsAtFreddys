package com.fnaf.Client.Items;

import net.minecraft.item.Item;

import com.fnaf.Common.main.mainRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class fnaf2Items {
	public static void mainRegistry(){
		register();
	}
	
	public static Item BBPlushie;
	public static Item PlasticIngot;
	public static Item SteelIngot;
	public static Item Foxyshook1;
	
	
	public static void register()
	{
		BBPlushie = new ItemPlush();
		
		
		PlasticIngot = new ItemIngot();
		SteelIngot = new ItemIngot();
		BBPlushie = new ItemPlush();
		
		
		
		Foxyshook1 = new FoxysHook();
		
		registerTheItem(PlasticIngot, "Plastic Ingot");
		registerTheItem(SteelIngot, "Steel Ingot");
		registerTheItem(BBPlushie, "Balloon Boy's Plushie");
		registerTheItem(Foxyshook1, "Foxys Hook");
	}


	private static void registerTheItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName("fnaf2" + ":" + unlocalizedName);
		item.setCreativeTab(mainRegistry.tabFnaf);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}

}
