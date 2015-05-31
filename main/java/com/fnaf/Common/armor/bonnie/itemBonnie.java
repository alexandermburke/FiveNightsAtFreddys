package com.fnaf.Common.armor.bonnie;

import java.util.List;

import com.fnaf.Client.main.ClientProxy;
import com.fnaf.Client.main.Strings;
import com.fnaf.Client.main.main_fnaf;
import com.fnaf.Common.Entity.bonnie.Bonnie;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class itemBonnie extends ItemArmor
{
	
	public itemBonnie(int armourType)
	{
		super(ArmorMaterial.DIAMOND, 4, armourType); //TODO custom material
	}
	
    /**
     * Override this method to have an item handle its own armor rendering.
     * 
     * @param  entityLiving  The entity wearing the armor 
     * @param  itemStack  The itemStack to render the model of 
     * @param  armorSlot  0=head, 1=torso, 2=legs, 3=feet
     * 
     * @return  A ModelBiped to render instead of the default
     */
    
    @SideOnly(Side.CLIENT)
  	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot) 
  	{
  		Bonnie armorModel = null;

  		if (itemstack != null)
  		{
  			if (itemstack.getItem() instanceof itemBonnie)
  			{
  				int type = ((ItemArmor)itemstack.getItem()).armorType;

  				armorModel = main_fnaf.proxy.getArmorModel("bonnie");
  			}
  			
  			
  		}
  		return null;
  	}
 
    
    /**
     * Called by RenderBiped and RenderPlayer to determine the armor texture that 
     * should be use for the currently equiped item.
     * This will only be called on instances of ItemArmor. 
     * 
     * Returning null from this function will use the default value.
     * 
     * @param stack ItemStack for the equpt armor
     * @param entity The entity wearing the armor
     * @param slot The slot the armor is in
     * @param type The subtype, can be null or "overlay"
     * @return Path of texture to bind, or null to use default
     */
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Strings.MODID + ":"  + "textures/models/bonnie.png";
    }
    
    /**
     * Called to tick armor in the armor slot. Override to do something
     *
     * @param world
     * @param player
     * @param itemStack
     */
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
    		if(true){
				if(player instanceof EntityPlayer)((EntityPlayer)player).setHealth(1);
				}

			
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_) 
    {
    	info.add("TBT To when this mod was first made! (Hence the skin.)");
    }
}
