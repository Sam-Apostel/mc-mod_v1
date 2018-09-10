package net.mcMod_v1.MumboJumboMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MumboTab extends CreativeTabs {

	public MumboTab() {
		super(MumboJumboMod.MODID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BOOK);
	}
	
	@Override
	public boolean hasSearchBar() {
		return false;
	}

}