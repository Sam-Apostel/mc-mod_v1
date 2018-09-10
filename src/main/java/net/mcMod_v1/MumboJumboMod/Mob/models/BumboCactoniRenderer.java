package net.mcMod_v1.MumboJumboMod.Mob.models;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class BumboCactoniRenderer extends Render {

	public BumboCactoniRenderer(RenderManager renderManager) {
		super(renderManager);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
//		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		BlockRendererDispatcher dispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
		GlStateManager.pushMatrix();
		Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		IBlockState state = Blocks.CACTUS.getDefaultState();

		GlStateManager.translate(-0.5F, 0.0F, 0.5F);
		GlStateManager.translate(0.0F, 0.32F, 0.0F);
		dispatcher.renderBlockBrightness(state, 1.0F);
	}
}
