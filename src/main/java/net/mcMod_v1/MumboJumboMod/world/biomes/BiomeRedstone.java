package net.mcMod_v1.MumboJumboMod.world.biomes;

import net.minecraft.world.biome.Biome;

public class BiomeRedstone extends Biome{
    public BiomeRedstone(){
        super(new BiomeProperties("Redstone").setBaseHeight(1.5F).setHeightVariation(0.1F).setTemperature(0.6F).setRainDisabled().setWaterColor(16711680));
    }
}
