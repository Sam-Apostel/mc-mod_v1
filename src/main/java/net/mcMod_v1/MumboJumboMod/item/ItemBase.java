package net.mcMod_v1.MumboJumboMod.item;

import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MumboJumboMod.MUMBO_TAB);
	}

	public void registerItemModel() {
		MumboJumboMod.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}