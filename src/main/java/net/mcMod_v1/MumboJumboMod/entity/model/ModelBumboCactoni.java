package net.mcMod_v1.MumboJumboMod.entity.model;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;

public class ModelBumboCactoni extends ModelBase {

	public ModelRenderer body_0;
	public ModelRenderer body_1;
	public ModelRenderer body_2;
	public ModelRenderer body_3;
	public ModelRenderer hat_main;
	public ModelRenderer arm_000;
	public ModelRenderer arm_100;
	public ModelRenderer hat_00;
	public ModelRenderer hat_01;
	public ModelRenderer hat_02;
	public ModelRenderer hat_10;
	public ModelRenderer hat_11;
	public ModelRenderer hat_20;
	public ModelRenderer hat_21;
	public ModelRenderer hat_22;
	public ModelRenderer arm_001;
	public ModelRenderer arm_002;
	public ModelRenderer arm_003;
	public ModelRenderer arm_010;
	public ModelRenderer arm_011;
	public ModelRenderer arm_012;
	public ModelRenderer arm_013;
	public ModelRenderer arm_014;
	public ModelRenderer arm_101;
	public ModelRenderer arm_102;
	public ModelRenderer arm_103;
	public ModelRenderer arm_110;
	public ModelRenderer arm_111;
	public ModelRenderer arm_112;
	public ModelRenderer arm_113;
	public ModelRenderer arm_114;

	public ModelBumboCactoni() {
		this.textureWidth = 32;
		this.textureHeight = 180;
		this.arm_000 = new ModelRenderer(this, 0, 0);
		this.arm_000.setRotationPoint(-6.0F, -7.5F, -1.0F);
		this.arm_000.addBox(-12.0F, -4.5F, -3.0F, 11, 9, 0, 0.0F);
		this.arm_001 = new ModelRenderer(this, 0, 0);
		this.arm_001.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_001.addBox(-12.0F, -4.5F, 3.0F, 12, 9, 0, 0.0F);
		this.body_0 = new ModelRenderer(this, 1, 38);
		this.body_0.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.body_0.addBox(-8.0F, -20.0F, -7.0F, 16, 20, 0, 0.0F);
		this.arm_013 = new ModelRenderer(this, 1, -4);
		this.arm_013.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_013.addBox(-3.0F, -11.5F, -4.0F, 0, 7, 8, 0.0F);
		this.setRotateAngle(arm_013, 0.0F, -1.5707963267948966F, 0.0F);
		this.hat_02 = new ModelRenderer(this, 18, 24);
		this.hat_02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_02.addBox(-9.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.arm_011 = new ModelRenderer(this, 1, -4);
		this.arm_011.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_011.addBox(-3.0F, -11.5F, -4.0F, 0, 8, 8, 0.0F);
		this.setRotateAngle(arm_011, 0.0F, 3.141592653589793F, 0.0F);
		this.hat_21 = new ModelRenderer(this, 22, 46);
		this.hat_21.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_21.addBox(9.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.arm_103 = new ModelRenderer(this, -8, 73);
		this.arm_103.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_103.addBox(-12.0F, -4.0F, 3.5F, 12, 8, 0, 0.0F);
		this.setRotateAngle(arm_103, -1.5707963267948966F, 0.0F, 0.0F);
		this.hat_22 = new ModelRenderer(this, 44, 53);
		this.hat_22.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_22.addBox(10.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.arm_100 = new ModelRenderer(this, 0, 0);
		this.arm_100.setRotationPoint(6.0F, -7.5F, -1.0F);
		this.arm_100.addBox(-12.0F, -4.5F, -3.0F, 11, 9, 0, 0.0F);
		this.setRotateAngle(arm_100, 0.0F, 3.141592653589793F, 0.0F);
		this.arm_110 = new ModelRenderer(this, 1, -4);
		this.arm_110.setRotationPoint(-8.0F, 0.0F, 0.0F);
		this.arm_110.addBox(-3.0F, -11.5F, -4.0F, 0, 16, 8, 0.0F);
		this.body_3 = new ModelRenderer(this, 1, 60);
		this.body_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_3.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.setRotateAngle(body_3, 0.0F, -1.5707963267948966F, 0.0F);
		this.hat_00 = new ModelRenderer(this, 54, 0);
		this.hat_00.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_00.addBox(-11.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.arm_012 = new ModelRenderer(this, 1, -4);
		this.arm_012.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_012.addBox(-3.0F, -11.5F, -4.0F, 0, 7, 8, 0.0F);
		this.setRotateAngle(arm_012, 0.0F, 1.5707963267948966F, 0.0F);
		this.arm_014 = new ModelRenderer(this, 1, 1);
		this.arm_014.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_014.addBox(-4.0F, -10.5F, -4.0F, 8, 0, 8, 0.0F);
		this.arm_003 = new ModelRenderer(this, -7, 73);
		this.arm_003.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_003.addBox(-12.0F, -4.0F, 3.5F, 12, 8, 0, 0.0F);
		this.setRotateAngle(arm_003, -1.5707963267948966F, 0.0F, -0.025132741228718346F);
		this.arm_114 = new ModelRenderer(this, 1, 1);
		this.arm_114.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_114.addBox(-4.0F, -10.5F, -4.0F, 8, 0, 8, 0.0F);
		this.hat_main = new ModelRenderer(this, 0, 0);
		this.hat_main.setRotationPoint(0.0F, -20.0F, 0.0F);
		this.hat_main.addBox(-8.0F, -2.0F, -11.0F, 16, 2, 22, 0.0F);
		this.body_1 = new ModelRenderer(this, 1, 60);
		this.body_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_1.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.arm_002 = new ModelRenderer(this, 0, 0);
		this.arm_002.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_002.addBox(-5.0F, -4.0F, 3.5F, 4, 8, 0, 0.0F);
		this.setRotateAngle(arm_002, 1.5707963267948966F, 0.0F, 0.0F);
		this.hat_01 = new ModelRenderer(this, 0, 24);
		this.hat_01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_01.addBox(-10.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.hat_11 = new ModelRenderer(this, 52, 40);
		this.hat_11.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_11.addBox(-4.0F, -13.0F, -4.0F, 8, 5, 8, 0.0F);
		this.hat_10 = new ModelRenderer(this, 40, 24);
		this.hat_10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_10.addBox(-5.0F, -8.0F, -5.0F, 10, 6, 10, 0.0F);
		this.body_2 = new ModelRenderer(this, 1, 60);
		this.body_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_2.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.setRotateAngle(body_2, 0.0F, 1.5707963267948966F, 0.0F);
		this.arm_101 = new ModelRenderer(this, 24, 82);
		this.arm_101.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_101.addBox(-12.0F, -4.5F, 3.0F, 12, 9, 0, 0.0F);
		this.arm_113 = new ModelRenderer(this, 1, -4);
		this.arm_113.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_113.addBox(-3.0F, -11.5F, -4.0F, 0, 7, 8, 0.0F);
		this.setRotateAngle(arm_113, 0.0F, -1.5707963267948966F, 0.0F);
		this.arm_112 = new ModelRenderer(this, 1, -4);
		this.arm_112.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_112.addBox(-3.0F, -11.5F, -4.0F, 0, 7, 8, 0.0F);
		this.setRotateAngle(arm_112, 0.0F, 1.5707963267948966F, 0.0F);
		this.arm_111 = new ModelRenderer(this, 1, -4);
		this.arm_111.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_111.addBox(-3.0F, -11.5F, -4.0F, 0, 8, 8, 0.0F);
		this.setRotateAngle(arm_111, 0.0F, 3.141592653589793F, 0.0F);
		this.arm_010 = new ModelRenderer(this, 1, -4);
		this.arm_010.setRotationPoint(-8.0F, 0.0F, 0.0F);
		this.arm_010.addBox(-3.0F, -11.5F, -4.0F, 0, 16, 8, 0.0F);
		this.hat_20 = new ModelRenderer(this, 0, 46);
		this.hat_20.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_20.addBox(8.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.arm_102 = new ModelRenderer(this, 0, 0);
		this.arm_102.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.arm_102.addBox(-5.0F, -4.0F, 3.5F, 4, 8, 0, 0.0F);
		this.setRotateAngle(arm_102, 1.5707963267948966F, 0.0F, 0.0F);
		this.body_0.addChild(this.arm_000);
		this.arm_000.addChild(this.arm_001);
		this.arm_010.addChild(this.arm_013);
		this.hat_main.addChild(this.hat_02);
		this.arm_010.addChild(this.arm_011);
		this.hat_main.addChild(this.hat_21);
		this.arm_100.addChild(this.arm_103);
		this.hat_main.addChild(this.hat_22);
		this.body_0.addChild(this.arm_100);
		this.arm_100.addChild(this.arm_110);
		this.body_0.addChild(this.body_3);
		this.hat_main.addChild(this.hat_00);
		this.arm_010.addChild(this.arm_012);
		this.arm_010.addChild(this.arm_014);
		this.arm_000.addChild(this.arm_003);
		this.arm_110.addChild(this.arm_114);
		this.body_0.addChild(this.hat_main);
		this.body_0.addChild(this.body_1);
		this.arm_000.addChild(this.arm_002);
		this.hat_main.addChild(this.hat_01);
		this.hat_main.addChild(this.hat_11);
		this.hat_main.addChild(this.hat_10);
		this.body_0.addChild(this.body_2);
		this.arm_100.addChild(this.arm_101);
		this.arm_110.addChild(this.arm_113);
		this.arm_110.addChild(this.arm_112);
		this.arm_110.addChild(this.arm_111);
		this.arm_000.addChild(this.arm_010);
		this.hat_main.addChild(this.hat_20);
		this.arm_100.addChild(this.arm_102);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	/**
	 * Sets the model various rotation angles then renders the model.
	 */
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {

		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		GlStateManager.pushMatrix();
		GlStateManager.translate(0.0f, -1f, 0.0f);

		this.body_0.render(scale);

		GlStateManager.translate(0.0f, 0.0f, 0.0f);
		GlStateManager.popMatrix();

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
	}
}