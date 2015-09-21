package com.fnaf.Common.armor.freddy;

import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.fnaf.Client.gui.GUIDevMode;
import com.fnaf.Client.gui.GUIMask;
import com.fnaf.Client.sound.FNAFSoundHandler;
import com.fnaf.Common.Items.FNAFItems;
import com.fnaf.Common.main.Reference;
import com.fnaf.Common.main.MAIN_FNAF;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class itemFreddy extends ItemArmor
{
	Minecraft mc = Minecraft.getMinecraft();
    EntityPlayer p = mc.thePlayer;
    ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
	
	
	public itemFreddy(int armourType)
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
	
	public void renderHelmetOverlay(ItemStack stack, EntityPlayer player, ScaledResolution resolution, float partialTicks, boolean hasScreen, int mouseX, int mouseY)
    {
    	ScaledResolution res = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		int width = res.getScaledWidth();
		int height = res.getScaledHeight();
		
		if (res != null)
		{
	        Tessellator tessellator = Tessellator.instance;

			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.6F);
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
	        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
	        tessellator.draw();
	        GL11.glEnable(GL11.GL_TEXTURE_2D);
	        
			GL11.glEnable(GL11.GL_BLEND);
	    	GL11.glDisable(GL11.GL_DEPTH_TEST);
	        GL11.glDepthMask(false);
	        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	        float f = 0.5F;
	        GL11.glColor4f(f, f, f, 1.0F);
	        GL11.glDisable(GL11.GL_ALPHA_TEST);
	        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MODID, "textures/gui/freddymask.png"));
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV(0.0D, (double)height, -90.0D, 0.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, (double)height, -90.0D, 1.0D, 1.0D);
	        tessellator.addVertexWithUV((double)width, 0.0D, -90.0D, 1.0D, 0.0D);
	        tessellator.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
	        tessellator.draw();
	        GL11.glDepthMask(true);
	        GL11.glEnable(GL11.GL_DEPTH_TEST);
	        GL11.glEnable(GL11.GL_ALPHA_TEST);
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);	        
		}
    }
	
	
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
    {
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
        return Reference.MODID + ":" + "textures/armor/freddy.png";
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
    

		
		
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_) 
    {
    	info.add("To use this mask, you must right click it.");
    }
}
