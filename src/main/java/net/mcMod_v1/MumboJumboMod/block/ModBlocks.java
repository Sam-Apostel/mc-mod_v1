package net.mcMod_v1.MumboJumboMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static BlockBase basicBlock = new BlockBase(Material.ROCK, "basic_block");

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				basicBlock
		);
//		GameRegistry.registerTileEntity(tileEntityClass, tileEntity.getRegistryName().toString());
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				basicBlock.createItemBlock(basicBlock.getRegistryName())
		);
	}

	public static void registerModels() {
		basicBlock.registerItemModel(Item.getItemFromBlock(basicBlock));
	}

}