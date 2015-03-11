package com.T0psid3.Biome;

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

import com.T0psid3.blocks.FPresent;
import com.T0psid3.blocks.Main_tile;
import com.T0psid3.items.Chicas_Cupcake;

public class FNAFBiome {

public static BiomeGenfNAFBiome biome = new BiomeGenfNAFBiome();

public Object instance;

public FNAFBiome(){}

public void load(){
BiomeDictionary.registerBiomeType(biome, BiomeDictionary.Type.FOREST);
BiomeManager.addSpawnBiome(biome);
BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(biome, 10));
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public void registerRenderers(){}
public int addFuel(ItemStack fuel){
	return 0;
}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}

static class BiomeGenfNAFBiome extends BiomeGenBase
{
	@SuppressWarnings("unchecked")
    public BiomeGenfNAFBiome()
    {
        super(41);
        setBiomeName("FNAFBiome");
        //Top Block = Block on the top of the biome
        topBlock = Main_tile.Main_Tile;
        //Filler Block = Block Under Biome, Currently TNT :/
        fillerBlock = Blocks.tnt;
        theBiomeDecorator.generateLakes = false;
	theBiomeDecorator.treesPerChunk = 10;
	theBiomeDecorator.flowersPerChunk = 10;
	theBiomeDecorator.grassPerChunk = 10;
	theBiomeDecorator.deadBushPerChunk = 10;
	theBiomeDecorator.mushroomsPerChunk = 10;
	theBiomeDecorator.reedsPerChunk = 10;
	theBiomeDecorator.cactiPerChunk = 10;
   	theBiomeDecorator.sandPerChunk = 10;
   	
   	
   	//Change 0.5F to 0.0F for no Rain in biome
   	rainfall = 0.5F;
   	setHeight(new BiomeGenBase.Height(0.1F, 0.3F));
    } 
}

}
