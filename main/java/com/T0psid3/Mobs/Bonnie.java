package com.T0psid3.Mobs;
import com.T0psid3.ModelMangle;
import com.T0psid3.FNAFEntity.FNAFEntitys;
import com.T0psid3.Modelbonnie;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.*;



@SuppressWarnings("unchecked")
public class Bonnie	extends EntityCreature implements FNAFEntitys
	{
		
		
		public Bonnie(World world) 
		{
			super(world);
	        this.setSize(0.6F, 1.8F);
	        this.getNavigator().setAvoidsWater(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(3, new EntityAILookIdle(this));
		}
		@SideOnly(Side.CLIENT)
		public void registerRenderers(){
			RenderingRegistry.registerEntityRenderingHandler(Bonnie.class, new RenderLiving(new Modelbonnie(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("Bonnie Texture.png");}});
		}
		public Bonnie(World world, String name)
		{
			this(world);
			
			String newName = "";
			
			name = name.replaceAll("\\.", "");
			
			for (int i = 0; i < name.length(); i++) 
			{
				newName = newName + name.charAt(i) + (i >= name.length() - 1 ? "" : ".");
			}
			
			this.setCustomNameTag(newName.toUpperCase());
		}

	
		
		 /**
	     * Returns true if the newer Entity AI code should be run
	     */
	    public boolean isAIEnabled()
	    {
	        return true;
	    }

	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9999.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
	    }
		
		@Override
		protected void entityInit()
		{
			super.entityInit();
			
			try 
			{
		
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		@Override
		public void onUpdate()
		{
			super.onUpdate();
		}

		@Override
		public ItemStack getHeldItem()
		{
			return null;
		}

		@Override
		public ItemStack getEquipmentInSlot(int slot) 
		{
			return null;
		}

		@Override
		public void setCurrentItemOrArmor(int slot, ItemStack stack)
		{
			
		}

		@Override
		public ItemStack[] getLastActiveItems() 
		{
			return new ItemStack[]{};
		}
	}

//Model COPYRIGHTED If you copy and paste any of this model into your fnaf mod we can take your mod down as fast as it went up!
   
