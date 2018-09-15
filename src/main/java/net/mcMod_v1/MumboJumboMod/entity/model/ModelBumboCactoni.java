package net.mcMod_v1.MumboJumboMod.entity.model;

import net.mcMod_v1.MumboJumboMod.entity.EntityBumboCactoni;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBumboCactoni extends ModelBase {

	/*
	All the parts of the small size Bumbo Cactoni
	 */
	public ModelRenderer body_0_s1;
	public ModelRenderer body_1_s1;
	public ModelRenderer body_2_s1;
	public ModelRenderer body_3_s1;
	public ModelRenderer hat_main_s1;
	public ModelRenderer arm_00_s1;
	public ModelRenderer arm_10_s1;
	public ModelRenderer mouth_0_s1;
	public ModelRenderer mouth_1_s1;
	public ModelRenderer mouth_2_s1;
	public ModelRenderer moustache_0_s1;
	public ModelRenderer moustache_1_s1;
	public ModelRenderer moustache_2_s1;
	public ModelRenderer moustache_3_s1;
	public ModelRenderer moustache_4_s1;
	public ModelRenderer moustache_5_s1;
	public ModelRenderer moustache_6_s1;
	public ModelRenderer moustache_7_s1;
	public ModelRenderer eye_0_s1;
	public ModelRenderer eye_1_s1;
	public ModelRenderer hat_00_s1;
	public ModelRenderer hat_01_s1;
	public ModelRenderer hat_02_s1;
	public ModelRenderer hat_10_s1;
	public ModelRenderer hat_11_s1;
	public ModelRenderer hat_20_s1;
	public ModelRenderer hat_21_s1;
	public ModelRenderer hat_22_s1;
	public ModelRenderer amr_01_s1;
	public ModelRenderer amr_11_s1;
	/*
	All the parts of the medium ModelRenderer body_0_s2;
	*/
	public ModelRenderer body_0_s2;
	public ModelRenderer body_1_s2;
	public ModelRenderer body_2_s2;
	public ModelRenderer body_3_s2;
	public ModelRenderer hat_main_s2;
	public ModelRenderer arm_00_s2;
	public ModelRenderer mouth_0_s2;
	public ModelRenderer mouth_1_s2;
	public ModelRenderer mouth_2_s2;
	public ModelRenderer moustache_0_s2;
	public ModelRenderer moustache_1_s2;
	public ModelRenderer moustache_2_s2;
	public ModelRenderer moustache_3_s2;
	public ModelRenderer moustache_4_s2;
	public ModelRenderer moustache_5_s2;
	public ModelRenderer moustache_6_s2;
	public ModelRenderer moustache_7_s2;
	public ModelRenderer eye_0_s2;
	public ModelRenderer eye_1_s2;
	public ModelRenderer arm_10_s2;
	public ModelRenderer hat_00_s2;
	public ModelRenderer hat_01_s2;
	public ModelRenderer hat_02_s2;
	public ModelRenderer hat_10_s2;
	public ModelRenderer hat_11_s2;
	public ModelRenderer hat_20_s2;
	public ModelRenderer hat_21_s2;
	public ModelRenderer hat_22_s2;
	public ModelRenderer hat_ext_0_s2;
	public ModelRenderer hat_ext_1_s2;
	public ModelRenderer amr_01_s2;
	public ModelRenderer amr_11_s2;
	/*
	All the parts of the large size Bumbo Cactoni
	*/
	public ModelRenderer body_0_s3;
	public ModelRenderer body_1_s3;
	public ModelRenderer body_2_s3;
	public ModelRenderer body_3_s3;
	public ModelRenderer hat_main_s3;
	public ModelRenderer arm_00_s3;
	public ModelRenderer mouth_0_s3;
	public ModelRenderer mouth_1_s3;
	public ModelRenderer mouth_2_s3;
	public ModelRenderer moustache_0_s3;
	public ModelRenderer moustache_1_s3;
	public ModelRenderer moustache_2_s3;
	public ModelRenderer moustache_3_s3;
	public ModelRenderer moustache_4_s3;
	public ModelRenderer moustache_5_s3;
	public ModelRenderer moustache_6_s3;
	public ModelRenderer moustache_7_s3;
	public ModelRenderer eye_0_s3;
	public ModelRenderer eye_1_s3;
	public ModelRenderer arm_10_s3;
	public ModelRenderer hat_00_s3;
	public ModelRenderer hat_01_s3;
	public ModelRenderer hat_02_s3;
	public ModelRenderer hat_10_s3;
	public ModelRenderer hat_11_s3;
	public ModelRenderer hat_20_s3;
	public ModelRenderer hat_21_s3;
	public ModelRenderer hat_22_s3;
	public ModelRenderer hat_ext_0_s3;
	public ModelRenderer hat_ext_1_s3;
	public ModelRenderer amr_01_s3;
	public ModelRenderer amr_11_s3;

	public ModelBumboCactoni() {
		this.textureWidth = 96;
		this.textureHeight = 153;
		/*
		All the parts of the small size Bumbo Cactoni given their properties
	    */
		this.hat_10_s1 = new ModelRenderer(this, 0, 128);
		this.hat_10_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_10_s1.addBox(-5.0F, -9.0F, -5.0F, 10, 8, 10, 0.0F);
		this.setRotateAngle(hat_10_s1, 0.017453292519943295F, 0.0F, 0.0F);
		this.hat_02_s1 = new ModelRenderer(this, 19, 105);
		this.hat_02_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_02_s1.addBox(-9.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.body_1_s1 = new ModelRenderer(this, 48, 0);
		this.body_1_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_1_s1.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.mouth_2_s1 = new ModelRenderer(this, 12, 3);
		this.mouth_2_s1.setRotationPoint(3.0F, -10.0F, -7.2F);
		this.mouth_2_s1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.body_2_s1 = new ModelRenderer(this, 48, 0);
		this.body_2_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_2_s1.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.setRotateAngle(body_2_s1, 0.0F, 1.5707963267948966F, 0.0F);
		this.moustache_5_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_5_s1.setRotationPoint(7.0F, -12.0F, -8.0F);
		this.moustache_5_s1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.eye_0_s1 = new ModelRenderer(this, 0, 0);
		this.eye_0_s1.setRotationPoint(2.0F, -17.0F, -8.0F);
		this.eye_0_s1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.eye_1_s1 = new ModelRenderer(this, 0, 0);
		this.eye_1_s1.setRotationPoint(-4.0F, -18.0F, -8.0F);
		this.eye_1_s1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.arm_00_s1 = new ModelRenderer(this, -6, 50);
		this.arm_00_s1.setRotationPoint(5.0F, -9.5F, -1.0F);
		this.arm_00_s1.addBox(2.0F, -3.5F, -3.0F, 10, 7, 6, 0.0F);
		this.moustache_7_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_7_s1.setRotationPoint(1.0F, -13.0F, -8.0F);
		this.moustache_7_s1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.hat_22_s1 = new ModelRenderer(this, 10, 109);
		this.hat_22_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_22_s1.addBox(10.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.moustache_0_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_0_s1.setRotationPoint(-6.0F, -12.0F, -8.0F);
		this.moustache_0_s1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_21_s1 = new ModelRenderer(this, 8, 107);
		this.hat_21_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_21_s1.addBox(9.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.hat_00_s1 = new ModelRenderer(this, 7, 109);
		this.hat_00_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_00_s1.addBox(-11.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.amr_11_s1 = new ModelRenderer(this, 0, 0);
		this.amr_11_s1.setRotationPoint(9.0F, 0.0F, 0.0F);
		this.amr_11_s1.addBox(-3.0F, -10.5F, -3.0F, 6, 7, 6, 0.0F);
		this.moustache_1_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_1_s1.setRotationPoint(0.0F, -12.0F, -8.0F);
		this.moustache_1_s1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.moustache_3_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_3_s1.setRotationPoint(2.0F, -11.0F, -8.0F);
		this.moustache_3_s1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.mouth_0_s1 = new ModelRenderer(this, 12, 3);
		this.mouth_0_s1.setRotationPoint(-3.0F, -10.0F, -7.2F);
		this.mouth_0_s1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.hat_20_s1 = new ModelRenderer(this, 19, 105);
		this.hat_20_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_20_s1.addBox(8.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.moustache_4_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_4_s1.setRotationPoint(-8.0F, -12.0F, -8.0F);
		this.moustache_4_s1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.hat_11_s1 = new ModelRenderer(this, 8, 130);
		this.hat_11_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_11_s1.addBox(-4.0F, -14.0F, -4.0F, 8, 5, 8, 0.0F);
		this.hat_main_s1 = new ModelRenderer(this, 0, 103);
		this.hat_main_s1.setRotationPoint(0.0F, -20.0F, 0.0F);
		this.hat_main_s1.addBox(-8.0F, -2.0F, -11.0F, 16, 2, 22, 0.0F);
		this.moustache_2_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_2_s1.setRotationPoint(-8.0F, -11.0F, -8.0F);
		this.moustache_2_s1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.body_0_s1 = new ModelRenderer(this, 33, 0);
		this.body_0_s1.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.body_0_s1.addBox(-8.0F, -20.0F, -7.0F, 16, 20, 0, 0.0F);
		this.moustache_6_s1 = new ModelRenderer(this, 12, 0);
		this.moustache_6_s1.setRotationPoint(-4.0F, -13.0F, -8.0F);
		this.moustache_6_s1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.body_3_s1 = new ModelRenderer(this, 48, 0);
		this.body_3_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_3_s1.addBox(-8.0F, -20.0F, 7.0F, 16, 20, 0, 0.0F);
		this.setRotateAngle(body_3_s1, 0.0F, -1.5707963267948966F, 0.0F);
		this.mouth_1_s1 = new ModelRenderer(this, 12, 3);
		this.mouth_1_s1.setRotationPoint(-2.0F, -8.0F, -7.2F);
		this.mouth_1_s1.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.amr_01_s1 = new ModelRenderer(this, 0, 0);
		this.amr_01_s1.setRotationPoint(9.0F, 0.0F, 0.0F);
		this.amr_01_s1.addBox(-3.0F, -10.5F, -3.0F, 6, 7, 6, 0.0F);
		this.arm_10_s1 = new ModelRenderer(this, -6, 50);
		this.arm_10_s1.setRotationPoint(-5.0F, -9.5F, -1.0F);
		this.arm_10_s1.addBox(2.0F, -3.5F, -3.0F, 10, 7, 6, 0.0F);
		this.setRotateAngle(arm_10_s1, 0.0F, 3.141592653589793F, 0.0F);
		this.hat_01_s1 = new ModelRenderer(this, 8, 107);
		this.hat_01_s1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_01_s1.addBox(-10.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.hat_main_s1.addChild(this.hat_10_s1);
		this.hat_main_s1.addChild(this.hat_02_s1);
		this.body_0_s1.addChild(this.body_1_s1);
		this.body_0_s1.addChild(this.mouth_2_s1);
		this.body_0_s1.addChild(this.body_2_s1);
		this.body_0_s1.addChild(this.moustache_5_s1);
		this.body_0_s1.addChild(this.eye_0_s1);
		this.body_0_s1.addChild(this.eye_1_s1);
		this.body_0_s1.addChild(this.arm_00_s1);
		this.body_0_s1.addChild(this.moustache_7_s1);
		this.hat_main_s1.addChild(this.hat_22_s1);
		this.body_0_s1.addChild(this.moustache_0_s1);
		this.hat_main_s1.addChild(this.hat_21_s1);
		this.hat_main_s1.addChild(this.hat_00_s1);
		this.arm_10_s1.addChild(this.amr_11_s1);
		this.body_0_s1.addChild(this.moustache_1_s1);
		this.body_0_s1.addChild(this.moustache_3_s1);
		this.body_0_s1.addChild(this.mouth_0_s1);
		this.hat_main_s1.addChild(this.hat_20_s1);
		this.body_0_s1.addChild(this.moustache_4_s1);
		this.hat_main_s1.addChild(this.hat_11_s1);
		this.body_0_s1.addChild(this.hat_main_s1);
		this.body_0_s1.addChild(this.moustache_2_s1);
		this.body_0_s1.addChild(this.moustache_6_s1);
		this.body_0_s1.addChild(this.body_3_s1);
		this.body_0_s1.addChild(this.mouth_1_s1);
		this.arm_00_s1.addChild(this.amr_01_s1);
		this.body_0_s1.addChild(this.arm_10_s1);
		this.hat_main_s1.addChild(this.hat_01_s1);
		/*
		All the parts of the medium size Bumbo Cactoni given their properties
	    */
		this.moustache_3_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_3_s2.setRotationPoint(2.0F, -23.0F, -8.0F);
		this.moustache_3_s2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_21_s2 = new ModelRenderer(this, 6, 106);
		this.hat_21_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_21_s2.addBox(11.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.body_2_s2 = new ModelRenderer(this, 64, 0);
		this.body_2_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_2_s2.addBox(-8.0F, -32.0F, 7.0F, 16, 32, 0, 0.0F);
		this.setRotateAngle(body_2_s2, 0.0F, 1.5707963267948966F, 0.0F);
		this.moustache_4_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_4_s2.setRotationPoint(-8.0F, -24.0F, -8.0F);
		this.moustache_4_s2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.hat_ext_0_s2 = new ModelRenderer(this, 19, 102);
		this.hat_ext_0_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_ext_0_s2.addBox(-10.0F, -2.0F, -11.0F, 1, 2, 22, 0.0F);
		this.hat_ext_1_s2 = new ModelRenderer(this, 18, 102);
		this.hat_ext_1_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_ext_1_s2.addBox(9.0F, -2.0F, -11.0F, 1, 2, 22, 0.0F);
		this.amr_11_s2 = new ModelRenderer(this, 0, 13);
		this.amr_11_s2.setRotationPoint(8.5F, 0.0F, 0.0F);
		this.amr_11_s2.addBox(-3.5F, -13.5F, -3.5F, 7, 10, 7, 0.0F);
		this.setRotateAngle(amr_11_s2, 0.0F, 0.005235987755982988F, 0.0F);
		this.mouth_0_s2 = new ModelRenderer(this, 12, 3);
		this.mouth_0_s2.setRotationPoint(-3.0F, -22.0F, -7.2F);
		this.mouth_0_s2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.moustache_0_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_0_s2.setRotationPoint(-6.0F, -24.0F, -8.0F);
		this.moustache_0_s2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.eye_1_s2 = new ModelRenderer(this, 0, 0);
		this.eye_1_s2.setRotationPoint(-4.0F, -30.0F, -8.0F);
		this.eye_1_s2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.body_3_s2 = new ModelRenderer(this, 64, 0);
		this.body_3_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_3_s2.addBox(-8.0F, -32.0F, 7.0F, 16, 32, 0, 0.0F);
		this.setRotateAngle(body_3_s2, 0.0F, -1.5707963267948966F, 0.0F);
		this.moustache_6_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_6_s2.setRotationPoint(-4.0F, -25.0F, -8.0F);
		this.moustache_6_s2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.moustache_7_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_7_s2.setRotationPoint(1.0F, -25.0F, -8.0F);
		this.moustache_7_s2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.arm_10_s2 = new ModelRenderer(this, -7, 63);
		this.arm_10_s2.setRotationPoint(5.0F, -13.5F, -0.5F);
		this.arm_10_s2.addBox(2.0F, -3.5F, -3.5F, 10, 7, 7, 0.0F);
		this.moustache_1_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_1_s2.setRotationPoint(0.0F, -24.0F, -8.0F);
		this.moustache_1_s2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.eye_0_s2 = new ModelRenderer(this, 0, 0);
		this.eye_0_s2.setRotationPoint(2.0F, -29.0F, -8.0F);
		this.eye_0_s2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.mouth_1_s2 = new ModelRenderer(this, 12, 3);
		this.mouth_1_s2.setRotationPoint(-2.0F, -20.0F, -7.2F);
		this.mouth_1_s2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.body_0_s2 = new ModelRenderer(this, 33, 0);
		this.body_0_s2.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.body_0_s2.addBox(-8.0F, -32.0F, -7.0F, 16, 32, 0, 0.0F);
		this.hat_22_s2 = new ModelRenderer(this, 5, 108);
		this.hat_22_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_22_s2.addBox(12.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.hat_10_s2 = new ModelRenderer(this, 29, 54);
		this.hat_10_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_10_s2.addBox(-6.0F, -9.0F, -6.0F, 12, 8, 12, 0.0F);
		this.hat_main_s2 = new ModelRenderer(this, 0, 100);
		this.hat_main_s2.setRotationPoint(0.0F, -32.0F, 0.0F);
		this.hat_main_s2.addBox(-9.0F, -2.0F, -12.0F, 18, 2, 24, 0.0F);
		this.mouth_2_s2 = new ModelRenderer(this, 12, 3);
		this.mouth_2_s2.setRotationPoint(3.0F, -22.0F, -7.2F);
		this.mouth_2_s2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.body_1_s2 = new ModelRenderer(this, 64, 0);
		this.body_1_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_1_s2.addBox(-8.0F, -32.0F, 7.0F, 16, 32, 0, 0.0F);
		this.hat_20_s2 = new ModelRenderer(this, 17, 104);
		this.hat_20_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_20_s2.addBox(10.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.hat_00_s2 = new ModelRenderer(this, 6, 108);
		this.hat_00_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_00_s2.addBox(-13.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.moustache_5_s2 = new ModelRenderer(this, 12, 0);
		this.moustache_5_s2.setRotationPoint(7.0F, -24.0F, -8.0F);
		this.moustache_5_s2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.hat_11_s2 = new ModelRenderer(this, 29, 56);
		this.hat_11_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_11_s2.addBox(-5.0F, -14.0F, -5.0F, 10, 5, 10, 0.0F);
		this.arm_00_s2 = new ModelRenderer(this, -7, 63);
		this.arm_00_s2.setRotationPoint(-5.0F, -13.5F, -0.5F);
		this.arm_00_s2.addBox(2.0F, -3.5F, -3.5F, 10, 7, 7, 0.0F);
		this.setRotateAngle(arm_00_s2, 0.0F, 3.141592653589793F, 0.0F);
		this.moustache_2_s2 = new ModelRenderer(this, 13, 0);
		this.moustache_2_s2.setRotationPoint(-8.0F, -23.0F, -8.0F);
		this.moustache_2_s2.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.amr_01_s2 = new ModelRenderer(this, 0, 13);
		this.amr_01_s2.setRotationPoint(8.5F, 0.0F, 0.0F);
		this.amr_01_s2.addBox(-3.5F, -13.5F, -3.5F, 7, 10, 7, 0.0F);
		this.setRotateAngle(amr_01_s2, 0.0F, 0.005235987755982988F, 0.0F);
		this.hat_02_s2 = new ModelRenderer(this, 18, 104);
		this.hat_02_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_02_s2.addBox(-11.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.hat_01_s2 = new ModelRenderer(this, 7, 106);
		this.hat_01_s2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_01_s2.addBox(-12.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.body_0_s2.addChild(this.moustache_3_s2);
		this.hat_main_s2.addChild(this.hat_21_s2);
		this.body_0_s2.addChild(this.body_2_s2);
		this.body_0_s2.addChild(this.moustache_4_s2);
		this.hat_main_s2.addChild(this.hat_ext_0_s2);
		this.hat_main_s2.addChild(this.hat_ext_1_s2);
		this.arm_10_s2.addChild(this.amr_11_s2);
		this.body_0_s2.addChild(this.mouth_0_s2);
		this.body_0_s2.addChild(this.moustache_0_s2);
		this.body_0_s2.addChild(this.eye_1_s2);
		this.body_0_s2.addChild(this.body_3_s2);
		this.body_0_s2.addChild(this.moustache_6_s2);
		this.body_0_s2.addChild(this.moustache_7_s2);
		this.body_0_s2.addChild(this.arm_10_s2);
		this.body_0_s2.addChild(this.moustache_1_s2);
		this.body_0_s2.addChild(this.eye_0_s2);
		this.body_0_s2.addChild(this.mouth_1_s2);
		this.hat_main_s2.addChild(this.hat_22_s2);
		this.hat_main_s2.addChild(this.hat_10_s2);
		this.body_0_s2.addChild(this.hat_main_s2);
		this.body_0_s2.addChild(this.mouth_2_s2);
		this.body_0_s2.addChild(this.body_1_s2);
		this.hat_main_s2.addChild(this.hat_20_s2);
		this.hat_main_s2.addChild(this.hat_00_s2);
		this.body_0_s2.addChild(this.moustache_5_s2);
		this.hat_main_s2.addChild(this.hat_11_s2);
		this.body_0_s2.addChild(this.arm_00_s2);
		this.body_0_s2.addChild(this.moustache_2_s2);
		this.arm_00_s2.addChild(this.amr_01_s2);
		this.hat_main_s2.addChild(this.hat_02_s2);
		this.hat_main_s2.addChild(this.hat_01_s2);
		/*
		All the parts of the large size Bumbo Cactoni given their properties
	    */
		this.moustache_1_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_1_s3.setRotationPoint(0.0F, -40.0F, -8.0F);
		this.moustache_1_s3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_01_s3 = new ModelRenderer(this, 7, 106);
		this.hat_01_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_01_s3.addBox(-12.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.moustache_4_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_4_s3.setRotationPoint(-8.0F, -40.0F, -8.0F);
		this.moustache_4_s3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.moustache_5_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_5_s3.setRotationPoint(7.0F, -40.0F, -8.0F);
		this.moustache_5_s3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.mouth_2_s3 = new ModelRenderer(this, 12, 3);
		this.mouth_2_s3.setRotationPoint(3.0F, -38.0F, -7.2F);
		this.mouth_2_s3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.eye_1_s3 = new ModelRenderer(this, 0, 0);
		this.eye_1_s3.setRotationPoint(-4.0F, -46.0F, -8.0F);
		this.eye_1_s3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.moustache_3_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_3_s3.setRotationPoint(2.0F, -39.0F, -8.0F);
		this.moustache_3_s3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.arm_10_s3 = new ModelRenderer(this, -8, 76);
		this.arm_10_s3.setRotationPoint(5.0F, -28.0F, 0.0F);
		this.arm_10_s3.addBox(2.0F, -4.0F, -4.0F, 12, 8, 8, 0.0F);
		this.moustache_7_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_7_s3.setRotationPoint(1.0F, -41.0F, -8.0F);
		this.moustache_7_s3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.eye_0_s3 = new ModelRenderer(this, 0, 0);
		this.eye_0_s3.setRotationPoint(2.0F, -45.0F, -8.0F);
		this.eye_0_s3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
		this.arm_00_s3 = new ModelRenderer(this, -8, 76);
		this.arm_00_s3.setRotationPoint(-5.0F, -31.0F, 0.0F);
		this.arm_00_s3.addBox(2.0F, -4.0F, -4.0F, 12, 8, 8, 0.0F);
		this.setRotateAngle(arm_00_s3, 0.0F, 3.141592653589793F, 0.0F);
		this.hat_22_s3 = new ModelRenderer(this, 5, 108);
		this.hat_22_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_22_s3.addBox(12.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.hat_11_s3 = new ModelRenderer(this, 29, 56);
		this.hat_11_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_11_s3.addBox(-5.0F, -14.0F, -5.0F, 10, 5, 10, 0.0F);
		this.hat_ext_1_s3 = new ModelRenderer(this, 18, 102);
		this.hat_ext_1_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_ext_1_s3.addBox(9.0F, -2.0F, -11.0F, 1, 2, 22, 0.0F);
		this.body_0_s3 = new ModelRenderer(this, 33, 0);
		this.body_0_s3.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.body_0_s3.addBox(-8.0F, -48.0F, -7.0F, 16, 48, 0, 0.0F);
		this.mouth_1_s3 = new ModelRenderer(this, 12, 3);
		this.mouth_1_s3.setRotationPoint(-2.0F, -36.0F, -7.2F);
		this.mouth_1_s3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_20_s3 = new ModelRenderer(this, 17, 104);
		this.hat_20_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_20_s3.addBox(10.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.amr_01_s3 = new ModelRenderer(this, 0, 29);
		this.amr_01_s3.setRotationPoint(10.0F, 0.0F, 0.0F);
		this.amr_01_s3.addBox(-4.0F, -16.0F, -4.0F, 8, 12, 8, 0.0F);
		this.hat_00_s3 = new ModelRenderer(this, 6, 108);
		this.hat_00_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_00_s3.addBox(-13.0F, -2.0F, -8.0F, 1, 2, 16, 0.0F);
		this.body_3_s3 = new ModelRenderer(this, 64, 0);
		this.body_3_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_3_s3.addBox(-8.0F, -48.0F, 7.0F, 16, 48, 0, 0.0F);
		this.setRotateAngle(body_3_s3, 0.0F, -1.5707963267948966F, 0.0F);
		this.moustache_0_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_0_s3.setRotationPoint(-6.0F, -40.0F, -8.0F);
		this.moustache_0_s3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_02_s3 = new ModelRenderer(this, 18, 104);
		this.hat_02_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_02_s3.addBox(-11.0F, -2.0F, -10.0F, 1, 2, 20, 0.0F);
		this.amr_11_s3 = new ModelRenderer(this, 0, 29);
		this.amr_11_s3.setRotationPoint(10.0F, 0.0F, 0.0F);
		this.amr_11_s3.addBox(-4.0F, -16.0F, -4.0F, 8, 12, 8, 0.0F);
		this.body_2_s3 = new ModelRenderer(this, 64, 0);
		this.body_2_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_2_s3.addBox(-8.0F, -48.0F, 7.0F, 16, 48, 0, 0.0F);
		this.setRotateAngle(body_2_s3, 0.0F, 1.5707963267948966F, 0.0F);
		this.body_1_s3 = new ModelRenderer(this, 64, 0);
		this.body_1_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body_1_s3.addBox(-8.0F, -48.0F, 7.0F, 16, 48, 0, 0.0F);
		this.hat_main_s3 = new ModelRenderer(this, 0, 100);
		this.hat_main_s3.setRotationPoint(0.0F, -48.0F, 0.0F);
		this.hat_main_s3.addBox(-9.0F, -2.0F, -12.0F, 18, 2, 24, 0.0F);
		this.moustache_6_s3 = new ModelRenderer(this, 12, 0);
		this.moustache_6_s3.setRotationPoint(-4.0F, -41.0F, -8.0F);
		this.moustache_6_s3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.mouth_0_s3 = new ModelRenderer(this, 12, 3);
		this.mouth_0_s3.setRotationPoint(-3.0F, -38.0F, -7.2F);
		this.mouth_0_s3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.moustache_2_s3 = new ModelRenderer(this, 13, 0);
		this.moustache_2_s3.setRotationPoint(-8.0F, -39.0F, -8.0F);
		this.moustache_2_s3.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
		this.hat_21_s3 = new ModelRenderer(this, 6, 106);
		this.hat_21_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_21_s3.addBox(11.0F, -2.0F, -9.0F, 1, 2, 18, 0.0F);
		this.hat_ext_0_s3 = new ModelRenderer(this, 19, 102);
		this.hat_ext_0_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_ext_0_s3.addBox(-10.0F, -2.0F, -11.0F, 1, 2, 22, 0.0F);
		this.hat_10_s3 = new ModelRenderer(this, 29, 54);
		this.hat_10_s3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hat_10_s3.addBox(-6.0F, -9.0F, -6.0F, 12, 8, 12, 0.0F);
		this.body_0_s3.addChild(this.moustache_1_s3);
		this.hat_main_s3.addChild(this.hat_01_s3);
		this.body_0_s3.addChild(this.moustache_4_s3);
		this.body_0_s3.addChild(this.moustache_5_s3);
		this.body_0_s3.addChild(this.mouth_2_s3);
		this.body_0_s3.addChild(this.eye_1_s3);
		this.body_0_s3.addChild(this.moustache_3_s3);
		this.body_0_s3.addChild(this.arm_10_s3);
		this.body_0_s3.addChild(this.moustache_7_s3);
		this.body_0_s3.addChild(this.eye_0_s3);
		this.body_0_s3.addChild(this.arm_00_s3);
		this.hat_main_s3.addChild(this.hat_22_s3);
		this.hat_main_s3.addChild(this.hat_11_s3);
		this.hat_main_s3.addChild(this.hat_ext_1_s3);
		this.body_0_s3.addChild(this.mouth_1_s3);
		this.hat_main_s3.addChild(this.hat_20_s3);
		this.arm_00_s3.addChild(this.amr_01_s3);
		this.hat_main_s3.addChild(this.hat_00_s3);
		this.body_0_s3.addChild(this.body_3_s3);
		this.body_0_s3.addChild(this.moustache_0_s3);
		this.hat_main_s3.addChild(this.hat_02_s3);
		this.arm_10_s3.addChild(this.amr_11_s3);
		this.body_0_s3.addChild(this.body_2_s3);
		this.body_0_s3.addChild(this.body_1_s3);
		this.body_0_s3.addChild(this.hat_main_s3);
		this.body_0_s3.addChild(this.moustache_6_s3);
		this.body_0_s3.addChild(this.mouth_0_s3);
		this.body_0_s3.addChild(this.moustache_2_s3);
		this.hat_main_s3.addChild(this.hat_21_s3);
		this.hat_main_s3.addChild(this.hat_ext_0_s3);
		this.hat_main_s3.addChild(this.hat_10_s3);
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
//		int stage = ((EntityBumboCactoni) entityIn).disguiseStage;
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

		switch (entityIn.getDataManager().get(EntityBumboCactoni.SIZE).intValue()) {
			case 1 :
				this.body_0_s1.render(scale);
				break;
			case 2 :
				this.body_0_s2.render(scale);
				break;
			case 3 :
				this.body_0_s3.render(scale);
				break;
		}
	}
}