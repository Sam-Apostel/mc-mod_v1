package net.mcMod_v1.MumboJumboMod;

import net.mcMod_v1.MumboJumboMod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MumboJumboMod.MODID, name = MumboJumboMod.NAME, version = MumboJumboMod.VERSION)
public class MumboJumboMod {

    public static final String MODID = "mumbo_jumbo_mod";
    public static final String NAME = "Mumbo Jumbo Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static final MumboTab MUMBO_TAB = new MumboTab();

	@SidedProxy(serverSide = "com.AppliedPhysics.proxy.CommonProxy", clientSide = "com.AppliedPhysics.proxy.ClientProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
