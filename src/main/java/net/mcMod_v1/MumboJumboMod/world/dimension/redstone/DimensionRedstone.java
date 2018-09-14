package net.mcMod_v1.MumboJumboMod.world.dimension.redstone;

import net.mcMod_v1.MumboJumboMod.init.BiomeInit;
import net.mcMod_v1.MumboJumboMod.init.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionRedstone extends WorldProvider{
    public DimensionRedstone(){
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.REDSTONE_DIMENSION);
    }
    @Override
    public DimensionType getDimensionType(){
        return DimensionInit.REDSTONE;
    }
    @Override
    public IChunkGenerator createChunkGenerator(){
        return new ChunkGeneratorFlat( world, world.getSeed(),false, null );
    }
    @Override
    public boolean canRespawnHere(){
        return false;
    }
    @Override
    public boolean isSurfaceWorld(){
        return false;
    }

}
