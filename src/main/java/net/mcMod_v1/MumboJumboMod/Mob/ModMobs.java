package net.mcMod_v1.MumboJumboMod.Mob;

import net.mcMod_v1.MumboJumboMod.Mob.render.RenderBumboCactoni;
import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModMobs {

//	public static void register(RegistryEvent.Register<EntityEntry> event) {
//		System.out.println("going to register Bumbo Cactoni spawning");
//		EntityEntry entry = EntityEntryBuilder.create()
//				.entity(EntityBumboCactoni.class)
//				.id(new ResourceLocation("mumbo_jumbo_mod"), 1)
//                .name("bumbo_cactoni")
//				.egg(0xFFFFFF, 0xAAAAAA)
//				.tracker(64, 20, false)
//				.spawn(EnumCreatureType.AMBIENT, 2, 1, 2, Biomes.DESERT, Biomes.DESERT_HILLS)
//				.build();
//		event.getRegistry().register(entry);
//		System.out.println("registered Bumbo Cactoni spawning");
//	}

	private static int modEntityID = 0;
	public static Set<EntityEntry> ENTITIES = new HashSet<>();
	public static List<String> ENTITY_NAMES = new ArrayList<String>();

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name, int eggPrimary, int eggSecondary,
	                                                 EnumCreatureType creatureType, int spawnWeight, int spawnMin, int spawnMax, BiomeDictionary.Type... biomeTypes) {
		EntityEntry entityEntry =
				createBuilder(entityClass, name)
						.egg(eggPrimary, eggSecondary)
						.spawn(creatureType, spawnWeight, spawnMin, spawnMax, getBiomes(biomeTypes))
						.build();
		ENTITIES.add(entityEntry);
	}

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name, int eggPrimary, int eggSecondary,
	                                                 EnumCreatureType creatureType, int spawnWeight, int spawnMin, int spawnMax, Biome... biomes) {
		ENTITIES.add(createBuilder(entityClass, name)
				.egg(eggPrimary, eggSecondary)
				.spawn(creatureType, spawnWeight, spawnMin, spawnMax, biomes)
				.build());
	}

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name, int eggPrimary, int eggSecondary,
	                                                 int spawnWeight, int spawnMin, int spawnMax, BiomeDictionary.Type... biomeTypes) {
		addEntity(entityClass, name, eggPrimary, eggSecondary, EnumCreatureType.CREATURE, spawnWeight, spawnMin, spawnMax, biomeTypes);
//		EntityEntry entityEntry =
//				createBuilder(entityClass, name)
//				.egg(eggPrimary, eggSecondary)
//				.spawn(EnumCreatureType.CREATURE, spawnWeight, spawnMin, spawnMax, getBiomes(biomeTypes))
//				.build();
//		ENTITIES.add(entityEntry);
	}

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name, int eggPrimary, int eggSecondary,
	                                                 int spawnWeight, int spawnMin, int spawnMax, Biome... biomes) {
		addEntity(entityClass, name, eggPrimary, eggSecondary, EnumCreatureType.CREATURE, spawnWeight, spawnMin, spawnMax, biomes);
//		ENTITIES.add(createBuilder(entityClass, name)
//				.egg(eggPrimary, eggSecondary)
//				.spawn(EnumCreatureType.CREATURE, spawnWeight, spawnMin, spawnMax, biomes)
//				.build());
	}

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name, int eggPrimary, int eggSecondary) {
		ENTITIES.add(createBuilder(entityClass, name)
				.egg(eggPrimary, eggSecondary)
				.build());
	}

	private static <T extends Entity> void addEntity(Class<T> entityClass, String name) {
		ENTITIES.add(createBuilder(entityClass, name).build());
	}

	private static EntityEntryBuilder<Entity> createBuilder(Class<? extends Entity> entityClass, String name) {
		String entityName = String.format("%s.%s", MumboJumboMod.MODID, name);
		ENTITY_NAMES.add(entityName);
		return EntityEntryBuilder.create()
				.entity(entityClass)
				.name(entityName)
				.id(new ResourceLocation(MumboJumboMod.MODID, name), modEntityID++)
				.tracker(64, 20, false);
	}

	private static Set<Biome> getBiomes(BiomeDictionary.Type... biomeTypes) {
		Set<Biome> biomes = new HashSet<>();
		for(BiomeDictionary.Type type : biomeTypes)
			biomes.addAll(BiomeDictionary.getBiomes(type));
		return biomes;
	}

	private static <T extends Entity> void registerRender(Class<T> entityClass, IRenderFactory<? super T> renderFactory) {
		RenderingRegistry.registerEntityRenderingHandler(entityClass, renderFactory);
	}

	public static void init() {
		addEntity(EntityBumboCactoni.class, "bumbo_cactoni", 0x003300, 0x007700,
				EnumCreatureType.AMBIENT, 2, 1, 2,
				Biomes.DESERT, Biomes.DESERT_HILLS);
	}

	@SideOnly(Side.CLIENT)
	public static void regRenders() {
		registerRender(EntityBumboCactoni.class, RenderBumboCactoni.FACTORY);
	}

	public static Set<EntityEntry> getEntities() {
		if(ENTITIES.isEmpty()) init();
		return ENTITIES;
	}
}
