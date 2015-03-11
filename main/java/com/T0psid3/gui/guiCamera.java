package com.T0psid3.gui;

import java.util.Random;



import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.T0psid3.keybind.Camera;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class guiCamera extends Camera{

public static Object instance;

public static int GUIID = 1;

public guiCamera(){}

public void load(){
	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
}

public void registerRenderers(){}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}

public static class GuiHandler implements IGuiHandler {
@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {return new guiCamera.GuiContainerMod(player);}
@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {return new guiCamera.GuiWindow(world, x, y, z, player);}
}

public static class GuiContainerMod extends Container {

        public GuiContainerMod (EntityPlayer player){
        }

        @Override
        public boolean canInteractWith(EntityPlayer player) {
                return true;
        }


        protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        }

        @Override
        public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
                return null;
        }
}

public static class GuiWindow extends GuiContainer
{

	int i = 0;
	int j = 0;
	int k = 0;
	EntityPlayer entity = null;

	

public GuiWindow(World world, int i, int j, int k, EntityPlayer entity){
	super(new GuiContainerMod((EntityPlayer)entity));
	this.i = i;
	this.j = j;
	this.k = k;
	this.entity = entity;
}

private static final ResourceLocation texture = new ResourceLocation("CameraGui.png");

protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
{
	int posX = (this.width) /2;
	int posY = (this.height) /2;
	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	
this.mc.renderEngine.bindTexture(texture);
this.xSize=377;
this.ySize=150;
int k = (this.width - this.xSize) / 2;
int l = (this.height - this.ySize) / 2;
this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);


    zLevel = 100.0F;
    
this.mc.renderEngine.bindTexture(new ResourceLocation("Battery.png"));
this.drawTexturedModalRect(posX+(-181), posY+(36), 0, 0, 256, 256);


}

protected void mouseClicked(int par1, int par2, int par3)
{
super.mouseClicked(par1, par2, par3);

}

public void updateScreen()
{
int posX = (this.width) /2;
int posY = (this.height) /2;

}

protected void keyTyped(char par1, int par2)
{


if (par2 != 28 && par2 != 156){
	if (par2 == 1){
		this.mc.displayGuiScreen((GuiScreen)null);
	}
}

}

protected void drawGuiContainerForegroundLayer(int par1, int par2){
	int posX = (this.width) /2;
	int posY = (this.height) /2;
	this.fontRendererObj.drawString("Camera Loaded successfully", posX+(-188), posY+(82), 0xffffff);

}

public void onGuiClosed()
{
Keyboard.enableRepeatEvents(false);
}

public void initGui(){
Keyboard.enableRepeatEvents(true);
this.buttonList.clear();
int posX = (this.width) / 2;
int posY = (this.height) / 2;
this.buttonList.add(new GuiButton(0, posX+(-183), posY+(-69), 174, 20, "Camera 1 (Buggy)"));
this.buttonList.add(new GuiButton(1, posX+(-183), posY+(-45), 180, 20, "Camera 2 (Buggy)"));
this.buttonList.add(new GuiButton(2, posX+(-70), posY+(35), 154, 20, "Reload Mod Data"));

}

protected void actionPerformed(GuiButton button)
{
MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
World world = server.worldServers[0];


if (button.id == 0){

if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).setPositionAndUpdate(i, j, k);
}

}


if (button.id == 1){

if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).setPositionAndUpdate(i, j, k);
}

}


if (button.id == 2){

if(true){
}

}


}

public boolean doesGuiPauseGame()
{
    return false;
}

}

}
