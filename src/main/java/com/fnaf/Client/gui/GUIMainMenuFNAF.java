package com.fnaf.Client.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
public class GUIMainMenuFNAF extends GuiScreen{
	
    protected String screenTitle = "DNAMM Character Settings";
    
    private static final int screenW=370;
    private static final int screenH=68;
    
    public GUIMainMenuFNAF()
    {}
    
    public void initGui()
    {
        this.buttonList.add(new GuiButton(101, getPosX(66), getPosY(0), 150, 20, "button 1"));
        this.buttonList.add(new GuiButton(100, getPosX(216), getPosY(0), 150, 20,"button 2"));
        this.buttonList.add(new GuiButton(102, getPosX(66), getPosY(24), 150, 20,"button 3"));
        this.buttonList.add(new GuiButton(103, getPosX(216), getPosY(24), 150, 20,"button 4"));
        this.buttonList.add(new GuiButton(105, getPosX(66), getPosY(48), 150, 20,"button 5"));
        this.buttonList.add(new GuiButton(104, getPosX(216), getPosY(48), 150, 20,"button 6"));
        this.buttonList.add(new GuiButton(200, this.width / 2 - 100, this.height / 6 + 168,"exit GUI"));
    }
    
    protected void actionPerformed(GuiButton button){
    	
    }
    
    public void updateScreen(){
    	
    }
    
    public void drawScreen(int par1, int par2, float par3)
    {
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, width/2, getPosY(-15), 16777215);
        func_110423_a(getPosX(51), getPosY(75), 30, (float)(getPosX(51)) - this.screenW, (float)(getPosX(25)) - this.screenH, this.mc.thePlayer);
        super.drawScreen(par1, par2, par3);
    }
    
    public static void func_110423_a(int par0, int par1, int par2, float par3, float par4, EntityLivingBase par5EntityLivingBase)
    {
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par0, (float)par1, 50.0F);
        GL11.glScalef((float)(-par2), (float)par2, (float)par2);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = par5EntityLivingBase.renderYawOffset;
        float f3 = par5EntityLivingBase.rotationYaw;
        float f4 = par5EntityLivingBase.rotationPitch;
        float f5 = par5EntityLivingBase.prevRotationYawHead;
        float f6 = par5EntityLivingBase.rotationYawHead;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-((float)Math.atan((double)(par4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        par5EntityLivingBase.renderYawOffset = (float)Math.atan((double)(par3 / 40.0F)) * 20.0F;
        par5EntityLivingBase.rotationYaw = (float)Math.atan((double)(par3 / 40.0F)) * 40.0F;
        par5EntityLivingBase.rotationPitch = -((float)Math.atan((double)(par4 / 40.0F))) * 20.0F;
        par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
        par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
        GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
        RenderManager.instance.playerViewY = 180.0F;
        RenderManager.instance.renderEntityWithPosYaw(par5EntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        par5EntityLivingBase.renderYawOffset = f2;
        par5EntityLivingBase.rotationYaw = f3;
        par5EntityLivingBase.rotationPitch = f4;
        par5EntityLivingBase.prevRotationYawHead = f5;
        par5EntityLivingBase.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    public  int getPosX(int x){
    	return (width-screenW)/2+x;
    }
    public  int getPosY(int y){
    	return (height-screenH)/2+y;
    }
}