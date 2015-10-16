package com.fnaf.Common.world.worldtype;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypes extends WorldType {
	  public static WorldType FNAF;

	  public WorldTypes(String name) {
	    super(name);
	  }

	  public static void loadWorldTypes() {
		  FNAF = new WorldTypes("FNAF");
	  }

	  @Override
	  public WorldChunkManager getChunkManager(World world) {
	    return new WorldChunkManager(world);
	  }

	  @Override
	  public IChunkProvider getChunkGenerator(World world, String generatorOptions) {
	    return new ChunkProviderGenerate(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled());
	  }

	  public BiomeGenBase setOceanBiomes(BiomeGenBase biome, GenLayer genLayer) {
	    return null;
	  }

	  public BiomeGenBase setBorderBiomes(BiomeGenBase biome1, BiomeGenBase biome2, GenLayer genLayer) {
	    return null;
	  }

	  public BiomeGenBase setMiscellaneousBiomes(GenLayer genLayer) {
	    return BiomeGenBase.hell;
	  }

	  @Override
	  public int getSpawnFuzz() {
	    return 100;
	  }
	}