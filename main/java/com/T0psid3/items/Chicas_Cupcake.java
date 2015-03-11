package com.T0psid3.items;


import cpw.mods.fml.client.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;

import java.util.Random;

import com.T0psid3.blocks.PPresent;
import com.T0psid3.lib.RefStrings;
import com.T0psid3.main.MainRegistry;

public class Chicas_Cupcake {

public Chicas_Cupcake(){}


		


public static Item block;public static Object instance;public void load(){
GameRegistry.addRecipe(new ItemStack(block, 100), new Object[]{
	"0XX", "XXX", "XXX", Character.valueOf('0'), new ItemStack(Items.experience_bottle, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}








// Item registry
static{
block = (Item)(new BlockCustomFood(20, 0.3F, true));block = ((BlockCustomFood)block).setUnlocalizedName("Chicascupcake").setTextureName("Chica's Cupcake").setCreativeTab(MainRegistry.tabMobs)
.setPotionEffect(PotionHelper.spiderEyeEffect);block.setMaxStackSize(640);
Item.itemRegistry.addObject(423, "Chicascupcake", block);

}

public static class BlockCustomFood extends ItemFood{public BlockCustomFood(int par2, float par3, boolean par4){super(par2, par3, par4);}
protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
super.onFoodEaten(itemStack, world, entity);float var4 = 1.0F;
int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

if(true){
if(entity instanceof EntityPlayer)((EntityPlayer)entity).setPositionAndUpdate(i, j, k);
}

}

public EnumAction getItemUseAction(ItemStack par1ItemStack){
	return EnumAction.drink;
}
}

public static void mainRegistry() {
	initializeBlock();
	registerBlock();
}

public static Block Chicas_Cupcake;

public static void initializeBlock() {
	block = (Item)(new BlockCustomFood(20, 0.3F, true));block = ((BlockCustomFood)block).setUnlocalizedName("Chicascupcake").setTextureName("Chica's Cupcake");
}

public static void registerBlock() {
	GameRegistry.registerBlock(Chicas_Cupcake, Chicas_Cupcake.getUnlocalizedName());
}}
