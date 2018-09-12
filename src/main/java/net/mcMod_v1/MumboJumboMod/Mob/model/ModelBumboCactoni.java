package net.mcMod_v1.MumboJumboMod.Mob.model;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.List;

public class ModelBumboCactoni extends ModelBase {
	/** The slime's bodies, both the inside box and the outside box */
	ModelRenderer body;
	String iconName;

	public ModelBumboCactoni() {
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setTextureSize(16, 16);

		this.body.addBox(-7f, 9.0f, -7f, 14, 16, 14);
	}

	/**
	 * Sets the model various rotation angles then renders the model.
	 */
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if(true) {

			BlockRendererDispatcher dispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
			GlStateManager.pushMatrix();

			Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
			GlStateManager.translate(-0.5F, -1.5F, 0.5F);

			IBlockState state = Blocks.CACTUS.getDefaultState();
			dispatcher.renderBlockBrightness(state, 1.0f);

			GlStateManager.translate(0.0F, 0.0F, 0.0F);
			GlStateManager.rotate(0.0f, 0.0f, 0.0f, 0.0f);
			GlStateManager.popMatrix();
		}

		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0.0f, -1f, 0.0f);

		this.body.render(scale);

		GlStateManager.translate(0.0f, 0.0f, 0.0f);
		GlStateManager.popMatrix();
	}
}