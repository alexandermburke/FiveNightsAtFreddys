package com.T0psid3.block;

import com.T0psid3.main.MainRegistry;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.T0psid3.blocks.FPresent;
import com.T0psid3.blocks.Main_tile;
import com.T0psid3.blocks.MPresent;
import com.T0psid3.blocks.Office_Door_Bottom;
import com.T0psid3.blocks.Office_Door_Top;
import com.T0psid3.blocks.PPresent;

public class FNAFBlocks {
	public static Block FPresent;
	public static Block Main_tile;
	public static Block MPresent;
	public static Block Office_Door_Bottom;
	public static Block Office_Door_Top;
	public static Block PPresent;
	public static Block Chicas_Cupcake;
	public static boolean FnafFoodVariable1;
	public static boolean FnafSwordVariable1;
	
	
	
	public void load()
	{
		FPresent = new FPresent(null);
		Main_tile = new Main_tile(null);
		MPresent = new MPresent(null);
		Office_Door_Bottom = new Office_Door_Bottom(null);
		Office_Door_Top = new Office_Door_Top(null);
		PPresent = new PPresent(null);
		
				
		
	}



	public static void register() {
		// TODO Auto-generated method stub
		
	}
}