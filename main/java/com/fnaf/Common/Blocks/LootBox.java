package com.fnaf.Common.Blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;

import com.fnaf.Client.gui.GUIDevMode;
import com.fnaf.Client.gui.GUILootBox;
import com.fnaf.Common.Blocks.render.RenderLootBox;
import com.fnaf.Common.Blocks.tileentity.TileEntityLootBox;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class LootBox extends Block{
	


	public LootBox() {
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockTextureName("textures/blocks/models/lootbox.png");
	
	}




public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
{
	Minecraft.getMinecraft().displayGuiScreen(new GUILootBox(null, null));
    if (p_149727_1_.isRemote)
    {
        return true;
    }
    else
    {
        IInventory iinventory = this.func_149951_m(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);

    }
	return blockConstructorCalled;
}

public IInventory func_149951_m(World p_149951_1_, int p_149951_2_, int p_149951_3_, int p_149951_4_)
{
    Object object = (TileEntityChest)p_149951_1_.getTileEntity(p_149951_2_, p_149951_3_, p_149951_4_);

    if (object == null)
    {
        return null;
    }
  
        return (IInventory)object;
    }

public boolean renderAsNormalBlock()
{
    return false;
}

public boolean isOpaqueCube()
{
    return false;
}

public int getRenderType()
{
	return -1;
	
}





}

	

