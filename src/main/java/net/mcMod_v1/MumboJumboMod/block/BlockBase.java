package net.mcMod_v1.MumboJumboMod.block;

import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class BlockBase extends Block {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);

		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MumboJumboMod.MUMBO_TAB);
	}

	public void registerItemModel(Item itemBlock) {
		MumboJumboMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}

	public Item createItemBlock(ResourceLocation name) {
		return new ItemBlock(this).setRegistryName(name);
	}

	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}