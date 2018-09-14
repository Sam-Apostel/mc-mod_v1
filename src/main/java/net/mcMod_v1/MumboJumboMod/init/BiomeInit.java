package net.mcMod_v1.MumboJumboMod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.mcMod_v1.MumboJumboMod.world.biomes.BiomeRedstone;

import org.lwjgl.Sys;

import net.minecraftforge.common.BiomeManager;

public class BiomeInit {
    public static final Biome REDSTONE_DIMENSION = new BiomeRedstone();
    public static void registerBiomes(){
        initBiome(REDSTONE_DIMENSION, "Redstone", BiomeType.WARM, Type.MAGICAL);
    }
    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome registered");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        System.out.println("Biome added");
        return biome;
    }
}
