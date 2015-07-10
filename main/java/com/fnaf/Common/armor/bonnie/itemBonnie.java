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
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class itemBonnie extends ItemArmor
{
	
	public itemBonnie(ArmorMaterial material, int render_idx, int type) {
		super(material, render_idx, type);
		
		this.setMaxStackSize(1);
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
    
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel (EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot){
		
		ModelBiped armorModel = ClientProxy.armorModels.get(this);
		
		if(armorModel != null){
    		armorModel.bipedHead.showModel = armorSlot == 0;
    		armorModel.bipedHeadwear.showModel = false;
    		armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
    		armorModel.bipedRightArm.showModel = armorSlot == 1;
    		armorModel.bipedLeftArm.showModel = armorSlot == 1;
    		armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
    		armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
    		
    		armorModel.isSneak = entityLiving.isSneaking();
    		armorModel.isRiding = entityLiving.isRiding();
    		armorModel.isChild = entityLiving.isChild();
    		
    		armorModel.heldItemRight = 0;
    		armorModel.aimedBow = false;
    		
    		EntityPlayer player = (EntityPlayer)entityLiving;
    		
    		ItemStack held_item = player.getEquipmentInSlot(0);
    		
    		if (held_item != null){
    			armorModel.heldItemRight = 1;
    			
    			if (player.getItemInUseCount() > 0){
    				
    				EnumAction enumaction = held_item.getItemUseAction();
    				
    				if (enumaction == EnumAction.bow){
    					armorModel.aimedBow = true;
    				}else if (enumaction == EnumAction.block){
    					armorModel.heldItemRight = 3;
    				}
    				
    				
    			}
    			
    		}
    		
    		
		}
		
		
		return armorModel;
	}
	
	@Override
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
