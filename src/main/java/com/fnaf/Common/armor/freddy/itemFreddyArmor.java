package com.fnaf.Common.armor.freddy;

import com.fnaf.Client.gui.GUIDevMode;
import com.fnaf.Client.gui.GUIMask;
import com.fnaf.Common.main.MAIN_FNAF;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

public class itemFreddyArmor extends ItemArmor
{
    public itemFreddyArmor(ArmorMaterial material, int renderIndex, int armorPiece)
    {
        super(material, renderIndex, armorPiece);
        this.setCreativeTab(MAIN_FNAF.tabFnaf);
    }
    
   
    
    public String getArmorTexture(Item item, String name)
    {
    	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName("fnaf2" + ":" + unlocalizedName);
		item.setCreativeTab(MAIN_FNAF.tabFnaf);
		return unlocalizedName;
		
		
    }
    }
