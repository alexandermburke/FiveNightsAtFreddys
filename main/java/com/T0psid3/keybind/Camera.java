package com.T0psid3.keybind;

import java.util.Random;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import com.T0psid3.gui.guiCamera;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class Camera {

public static Object instance;

public Camera(){}

public void load(){
	FMLCommonHandler.instance().bus().register(new KeyHandlerClass());
}

public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void registerRenderers(){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}

public class KeyHandlerClass
{

	private static final String desc = "key.fnaf_inventory.desc";
	
	
	// Change the Key bind here
	private static final int keyValues = Keyboard.KEY_C;
	private final KeyBinding keys;
	public KeyHandlerClass() {
		keys = new KeyBinding(desc, keyValues, "key.fnaf.category");
		ClientRegistry.registerKeyBinding(keys);
	}
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
			if (keys.isPressed()) {
				EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
				int i = (int)entity.posX;
				int j = (int)entity.posY;
				int k = (int)entity.posZ;
				MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
				World world = server.worldServers[0];

            	if(true){
if(true){
				//open gui
if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).openGui(instance, guiCamera.GUIID, world, i, j, k);
}
}
}

			}
		}
	}
}

public static void mainregistry() {
	// Register the cameras HERE
	
}

}
