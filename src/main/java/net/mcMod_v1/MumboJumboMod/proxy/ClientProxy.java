package net.mcMod_v1.MumboJumboMod.proxy;

import net.mcMod_v1.MumboJumboMod.entity.ModMobs;
import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.mcMod_v1.MumboJumboMod.item.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	public void registerItemRenderer(ItemBase item, int meta, String id) {
		// TODO Auto-generated method stub
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MumboJumboMod.MODID + ":" + id, "inventory"));
	}

	public void registerItemRenderer(Item item, int meta, String id) {
		// TODO Auto-generated method stub
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MumboJumboMod.MODID + ":" + id, "inventory"));
	}
	
	@Override
	public String localize(String unlocalized, Object... args) {
		return I18n.format(unlocalized, args);
	}
	
	@Override
	public void registerRenderers() {
		System.out.println("registering renderers");
//		RenderingRegistry.registerEntityRenderingHandler(EntityBumboCactoni.class, RenderBumboCactoni.FACTORY);
		ModMobs.regRenders();
		System.out.println("finished registering renderers");
	}

}