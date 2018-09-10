package net.mcMod_v1.MumboJumboMod.proxy;

import net.mcMod_v1.MumboJumboMod.Mob.BumboCactoni;
import net.mcMod_v1.MumboJumboMod.Mob.models.BumboCactoniModel;
import net.mcMod_v1.MumboJumboMod.Mob.models.BumboCactoniRenderer;
import net.mcMod_v1.MumboJumboMod.MumboJumboMod;
import net.mcMod_v1.MumboJumboMod.item.ItemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

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
		IRenderFactory<BumboCactoni> renderer = new IRenderFactory<BumboCactoni>() {
			@Override
			public Render<? super BumboCactoni> createRenderFor(RenderManager manager)
			{
				return new BumboCactoniRenderer(manager);
			}
		};
		RenderingRegistry.registerEntityRenderingHandler(BumboCactoni.class, renderer);
	}

}