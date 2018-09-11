package net.mcMod_v1.MumboJumboMod.Mob.render;

import net.mcMod_v1.MumboJumboMod.Mob.EntityBumboCactoni;
import net.mcMod_v1.MumboJumboMod.Mob.model.ModelBumboCactoni;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBumboCactoni extends RenderLiving<EntityBumboCactoni> {
	public static RenderBumboCactoni.RenderBumboCactoniFactory FACTORY = new RenderBumboCactoniFactory();
	private static final ResourceLocation BLAZE_TEXTURES = new ResourceLocation("minecraft","textures/entity/blaze.png");

	public RenderBumboCactoni(RenderManager renderManager) {
		super(renderManager, new ModelBumboCactoni(), 0.0F);
	}


	protected ResourceLocation getEntityTexture(EntityBumboCactoni entity) {
		return BLAZE_TEXTURES;
	}

	public static class RenderBumboCactoniFactory implements IRenderFactory<EntityBumboCactoni> {

		@Override
		public Render<? super EntityBumboCactoni> createRenderFor(RenderManager manager) {
			return new RenderBumboCactoni(manager);
		}
	}

//	@Override
//	public void doRender(BumboCactoni entity, double x, double y, double z, float entityYaw, float partialTicks) {
//		super.doRender(entity, x, y, z, entityYaw, partialTicks);
//		System.out.println("do render");
////		super.doRender(entity, x, y, z, entityYaw, partialTicks);
//		BlockRendererDispatcher dispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
//		GlStateManager.pushMatrix();
//		Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
//		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
//		IBlockState state = Blocks.CACTUS.getDefaultState();
//
//		GlStateManager.translate(-0.5F, 0.0F, 0.5F);
//		GlStateManager.translate(0.0F, 0.32F, 0.0F);
//		dispatcher.renderBlockBrightness(state, 1.0F);
//	}
}
