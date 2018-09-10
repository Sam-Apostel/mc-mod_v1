package net.mcMod_v1.MumboJumboMod.Mob;

import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModMobs {

	public static void register(RegistryEvent.Register<EntityEntry> event) {
		System.out.println("going to register Bumbo Cactoni spawning");
		EntityEntry entry = EntityEntryBuilder.create()
				.entity(BumboCactoni.class)
				.id(new ResourceLocation("mumbo_jumbo_mod"), 1)
                .name("bumbo_cactoni")
				.egg(0xFFFFFF, 0xAAAAAA)
				.tracker(64, 20, false)
				.spawn(EnumCreatureType.AMBIENT, 10, 1, 10, Biomes.DESERT, Biomes.DESERT_HILLS)
				.build();
		event.getRegistry().register(entry);
//		EntityRegistry.addSpawn(BumboCactoni.class, 10, 1, 10, EnumCreatureType.CREATURE, Biomes.DESERT, Biomes.DESERT_HILLS);
		System.out.println("registered Bumbo Cactoni spawning");
	}

}
