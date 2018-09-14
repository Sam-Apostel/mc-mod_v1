package net.mcMod_v1.MumboJumboMod.init;

import net.mcMod_v1.MumboJumboMod.world.dimension.redstone.DimensionRedstone;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
    public static final DimensionType REDSTONE = DimensionType.register("Redstone", "_redstone", 2, DimensionRedstone.class, true);
    public static void registerDimensions(){
        DimensionManager.registerDimension(2, REDSTONE);
        if(DimensionManager.isDimensionRegistered(2)){
            System.out.println("Redstone Dimension is registered");
        }else{
            System.err.println("Redstone Dimension is not registered");
        }
    }
}
