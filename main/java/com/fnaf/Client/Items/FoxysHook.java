package com.fnaf.Client.Items;

import com.fnaf.Client.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.main.mainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoxysHook extends Item {
	public static void mainRegistry(){
		registerItem();
		register();
	}
	
	
	public static Item Foxyshook1;	
	
	
	
	public static void registerItem(){
	
	}
	
	public static void register()
	{
	
	}	
	
public FoxysHook(){
setMaxDamage(6);
maxStackSize = 1;
setUnlocalizedName("FoxysHook");
setTextureName("FoxysHook");
setCreativeTab(mainRegistry.tabFnaf);
}

public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
	



	
	
	
	

}
