package net.mcMod_v1.MumboJumboMod;

import net.mcMod_v1.MumboJumboMod.Mob.ModMobs;
import net.mcMod_v1.MumboJumboMod.block.ModBlocks;
import net.mcMod_v1.MumboJumboMod.item.ModItems;
import net.mcMod_v1.MumboJumboMod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import org.apache.logging.log4j.Logger;
import sun.nio.fs.RegistryFileTypeDetector;

@Mod(modid = MumboJumboMod.MODID, name = MumboJumboMod.NAME, version = MumboJumboMod.VERSION)
public class MumboJumboMod {

    public static final String MODID = "mumbo_jumbo_mod";
    public static final String NAME = "Mumbo Jumbo Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static final MumboTab MUMBO_TAB = new MumboTab();

	@SidedProxy(serverSide = "net.mcMod_v1.MumboJumboMod.proxy.CommonProxy", clientSide = "net.mcMod_v1.MumboJumboMod.proxy.ClientProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
	    ModMobs.register();
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerTextures(final TextureStitchEvent.Pre e) {
			if(e.getMap() == Minecraft.getMinecraft().getTextureMapBlocks()) {
//				e.getMap().registerSprite(customTexture);
			}
		}
	}
}
