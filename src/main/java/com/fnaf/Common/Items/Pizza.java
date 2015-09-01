package com.fnaf.Common.Items;

import com.fnaf.Common.main.Reference;

import net.minecraft.item.ItemFood;

public class Pizza extends ItemFood {

	public Pizza(int p_i45340_1_, boolean p_i45340_2_) {
		super(p_i45340_1_, p_i45340_2_);
		
		
		this.isWolfsFavoriteMeat();
		this.setAlwaysEdible();
	/*	this.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_); */
		this.setMaxDamage(1);
	
	}

}
