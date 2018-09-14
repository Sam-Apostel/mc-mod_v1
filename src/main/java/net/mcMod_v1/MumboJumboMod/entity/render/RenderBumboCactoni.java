package net.mcMod_v1.MumboJumboMod.entity.render;

import net.mcMod_v1.MumboJumboMod.entity.EntityBumboCactoni;
import net.mcMod_v1.MumboJumboMod.entity.model.ModelBumboCactoni;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBumboCactoni extends RenderLiving<EntityBumboCactoni> {
	public static RenderBumboCactoni.RenderBumboCactoniFactory FACTORY = new RenderBumboCactoniFactory();
	public static final ResourceLocation TEXTURE_BUMBO_CACTONI = new ResourceLocation("mumbo_jumbo_mod","textures/entity/bumbotexture.png");

	public RenderBumboCactoni(RenderManager renderManager) {
		super(renderManager, new ModelBumboCactoni(), 0.0F);
	}

	protected ResourceLocation getEntityTexture(EntityBumboCactoni entity) {
		return TEXTURE_BUMBO_CACTONI;
	}

	public static class RenderBumboCactoniFactory implements IRenderFactory<EntityBumboCactoni> {

		@Override
		public Render<? super EntityBumboCactoni> createRenderFor(RenderManager manager) {
			return new RenderBumboCactoni(manager);
		}
	}
}
