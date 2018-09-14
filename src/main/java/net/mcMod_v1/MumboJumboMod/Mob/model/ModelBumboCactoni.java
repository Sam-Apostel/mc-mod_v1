package net.mcMod_v1.MumboJumboMod.Mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBumboCactoni extends ModelBase {
    
	private ModelRenderer body;
	private ModelRenderer leftArm;
    private ModelRenderer rightArm;
    private ModelRenderer leftArmU;
    private ModelRenderer rightArmU;
    private ModelRenderer leftEye;
    private ModelRenderer rightEye;
    private ModelRenderer moustache;
    private ModelRenderer moustache_l;
    private ModelRenderer moustache_r;
    private ModelRenderer moustache_l_tip;
    private ModelRenderer moustache_r_tip;
    private ModelRenderer moustache_l_lip;
    private ModelRenderer moustache_r_lip;
    private ModelRenderer leftTooth;
    private ModelRenderer rightTooth;
    private ModelRenderer hat;
    private ModelRenderer hat_;
    private ModelRenderer hat__;
    private ModelRenderer hat___;
    private ModelRenderer _hat;
    private ModelRenderer __hat;
    private ModelRenderer ___hat;
    private ModelRenderer hatB;
    private ModelRenderer hatS;
    private ModelRenderer lip_l;
    private ModelRenderer lip_r;
    private ModelRenderer lip_b;
    private ModelRenderer mouth;
    private ModelRenderer spikes_f;
    private ModelRenderer spikes_b;
    private ModelRenderer spikes_l;
    private ModelRenderer spikes_r;
    private ModelRenderer spikes_laf;
    private ModelRenderer spikes_lab;
    private ModelRenderer spikes_raf;
    private ModelRenderer spikes_rab;
    private ModelRenderer spikes;
	String iconName;

	public ModelBumboCactoni() {
        this.textureWidth = 128;
        this.textureHeight = 80;

        this.body = initModel(this.body);
 this.leftArm = initModel(this.leftArm);
 this.rightArm = initModel(this.rightArm);
 this.leftArmU = initModel(this.leftArmU);
 this.rightArmU = initModel(this.rightArmU);
 this.leftEye = initModel(this.leftEye);
 this.rightEye = initModel(this.rightEye);
 this.moustache = initModel(this.moustache);
 this.moustache_l = initModel(this.moustache_l);
 this.moustache_r = initModel(this.moustache_r);
 this.moustache_l_tip = initModel(this.moustache_l_tip);
 this.moustache_r_tip = initModel(this.moustache_r_tip);
 this.moustache_l_lip = initModel(this.moustache_l_lip);
 this.moustache_r_lip = initModel(this.moustache_r_lip);
 this.leftTooth = initModel(this.leftTooth);
 this.rightTooth = initModel(this.rightTooth);
 this.hat = initModel(this.hat);
 this.hat_ = initModel(this.hat_);
 this.hat__ = initModel(this.hat__);
 this.hat___ = initModel(this.hat___);
 this._hat = initModel(this._hat);
 this.__hat = initModel(this.__hat);
 this.___hat = initModel(this.___hat);
 this.hatB = initModel(this.hatB);
 this.hatS = initModel(this.hatS);
        this.lip_l = initModel(this.lip_l);
        this.lip_r = initModel(this.lip_r);
        this.lip_b = initModel(this.lip_b);
        this.mouth = initModel(this.mouth);

        this.spikes_f = initModel(this.spikes_f);
        this.spikes_b = initModel(this.spikes_b);
        this.spikes_l = initModel(this.spikes_l);
        this.spikes_r = initModel(this.spikes_r);
        this.spikes_laf = initModel(this.spikes_laf);
        this.spikes_lab = initModel(this.spikes_lab);
        this.spikes_raf = initModel(this.spikes_raf);
        this.spikes_rab = initModel(this.spikes_rab);



		this.body.setTextureOffset(0,0);
        this.body.addBox(-7F, -8F, -7F, 14, 32, 14, 0.0F);

        this.leftArm.setTextureOffset(42, 0);
        this.leftArmU.setTextureOffset(62, 0);
        this.leftArm.addBox(7F, 1F, -3F, 3, 7, 7, 0.0F);
        this.leftArmU.addBox(10F, -8F, -2F, 7, 16, 7, 0.0F);
        this.leftArm.addChild(this.leftArmU);

        this.rightArm.setTextureOffset(42, 0);
        this.rightArmU.setTextureOffset(62, 0);
        this.rightArm.addBox(-10, 4F, -2F, 3, 7, 7, 0.0F);
        this.rightArmU.addBox(-17F, -5F, -2F, 7, 16, 7, true);
        this.rightArm.addChild(this.rightArmU);

        this.hat.setTextureOffset(34,30);
        this.hat.addBox(-8F, -10F, -11F, 16, 2, 22, 0.0F);

        this.hat_.setTextureOffset(38,32);
        this.hat__.setTextureOffset(40, 34);
        this.hat___.setTextureOffset(42,36);

        this.hat_.addBox(-9F, -10F, -10F, 1, 2, 20, 0.0F);
        this.hat__.addBox(-10F, -10F, -9F, 1, 2, 18, 0.0F);
        this.hat___.addBox(-11F, -10F, -8F, 1, 2, 16, 0.0F);

        this._hat.setTextureOffset(38,32);
        this.__hat.setTextureOffset(40, 34);
        this.___hat.setTextureOffset(42,36);

        this._hat.addBox(8F, -10F, -10F, 1, 2, 20, 0.0F);
        this.__hat.addBox(9F, -10F, -9F, 1, 2, 18, 0.0F);
        this.___hat.addBox(10F, -10F, -8F, 1, 2, 16, 0.0F);

        this.hatB.setTextureOffset(78,11);
        this.hatB.addBox(-6F, -17F, -6F, 12, 7, 12, 0.0F);

        this.hatS.setTextureOffset(80,13);
        this.hatS.addBox(-5F, -22F, -5F, 10, 5, 10, 0.0F);

        this.hat.addChild(this.hat_);
        this.hat.addChild(this.hat__);
        this.hat.addChild(this.hat___);
        this.hat.addChild(this.hatB);
        this.hat.addChild(this.hatS);
        this.hat.addChild(this._hat);
        this.hat.addChild(this.__hat);
        this.hat.addChild(this.___hat);
        
        this.moustache.setTextureOffset(0,46);
        
        this.moustache_l_lip.setTextureOffset(0,46);
        this.moustache_l_tip.setTextureOffset(0,46);
        this.moustache_l.setTextureOffset(0,46);

        this.moustache_r_lip.setTextureOffset(0,46);
        this.moustache_r_tip.setTextureOffset(0,46);
        this.moustache_r.setTextureOffset(0,46);


        this.moustache.setTextureOffset(0,46);

        this.moustache_l_lip.setTextureOffset(0,46);
        this.moustache_l_tip.setTextureOffset(0,46);
        this.moustache_l.setTextureOffset(0,46);

        this.moustache_r_lip.setTextureOffset(0,46);
        this.moustache_r_tip.setTextureOffset(0,46);
        this.moustache_r.setTextureOffset(0,46);

        this.moustache.addBox(-6F, 0F, -8F, 12, 1,1);
        this.moustache_l.addBox(-8F, 1F, -8F, 6, 1,1);
        this.moustache_l_tip.addBox(-8F, 0F, -8F, 1,1,1);
        this.moustache_l_lip.addBox(-4f, -1F, -8F, 3,1,1);

        this.moustache_r.addBox(2F, 1F, -8F, 6, 1,1);
        this.moustache_r_tip.addBox(7F, 0F, -8F, 1,1,1);
        this.moustache_r_lip.addBox(1f, -1F, -8F, 3,1,1);
        

        this.moustache_l.addChild(this.moustache_l_lip);
        this.moustache_l.addChild(this.moustache_l_tip);
        this.moustache_r.addChild(this.moustache_r_lip);
        this.moustache_r.addChild(this.moustache_r_tip);
        this.moustache.addChild(this.moustache_l);
        this.moustache.addChild(this.moustache_r);

        this.leftEye.setTextureOffset(0,10);
        this.leftEye.addBox(-4F,-6F,-8F, 2, 3, 1);

        this.rightEye.setTextureOffset(0,10);
        this.rightEye.addBox(2F,-5F,-8F, 2, 3, 1);

        this.leftTooth.setTextureOffset(0,0);
        this.rightTooth.setTextureOffset(0,0);
        this.leftTooth.addBox(0F, 1F, -7.6F,2,2,1);
        this.rightTooth.addBox(-3F, 1F, -7.6F, 2,2,1);

        this.lip_l.setTextureOffset(0,7);
        this.lip_r.setTextureOffset(0,7);
        this.lip_b.setTextureOffset(0,7);
        this.mouth.setTextureOffset(0,3);

        this.lip_l.addBox(-4F, 2F, -7.8F, 1,2,1);
        this.lip_r.addBox(2F, 2F, -7.8F, 1,2,1);
        this.lip_b.addBox(-4F, 4F, -7.8F, 6, 1, 1);
        this.mouth.addBox(-3F, 1F, -7.1F, 5, 3, 1);

        this.mouth.addChild(this.lip_r);
        this.mouth.addChild(this.lip_b);
        this.mouth.addChild(this.lip_l);
        this.mouth.addChild(this.leftTooth);
        this.mouth.addChild(this.rightTooth);


        
        this.spikes_f.setTextureOffset(0,48);
        this.spikes_b.setTextureOffset(0,48);
        this.spikes_l.setTextureOffset(0,32);
        this.spikes_r.setTextureOffset(0,32);
        this.spikes_laf.setTextureOffset(112,32);
        this.spikes_lab.setTextureOffset(112,32);
        this.spikes_raf.setTextureOffset(112,32);
        this.spikes_rab.setTextureOffset(112,32);

        this.spikes_f.addBox(-8F,-8F,7F,16,32,0);
        this.spikes_b.addBox(-8F,-8F,-7F,16,32,0);
        this.spikes_l.addBox(-7F,-8F,-8F,0,32,16);
        this.spikes_r.addBox(7F,-8F,-8F,0,32,16);
        /*
        this.spikes_laf.addBox(16,32,0);
        this.spikes_lab.addBox(16,32,0);
        this.spikes_raf.addBox(16,32,0);
        this.spikes_rab.addBox(16,32,0);
        */

        this.spikes = new ModelRenderer(this);
        this.spikes.addChild(this.spikes_f);
        this.spikes.addChild(this.spikes_b);
        this.spikes.addChild(this.spikes_l);
        this.spikes.addChild(this.spikes_r);
        this.spikes.addChild(this.spikes_laf);
        this.spikes.addChild(this.spikes_lab);
        this.spikes.addChild(this.spikes_raf);
        this.spikes.addChild(this.spikes_rab);
        //112, 32
	}
	private ModelRenderer initModel(ModelRenderer model){
	    model = new ModelRenderer(this);
	    model.setTextureSize(this.textureWidth, this.textureHeight);
	    return model;
    }

	/**
	 * Sets the model various rotation angles then renders the model.
	 */
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.body.render(scale);
        this.leftArm.render(scale);
        this.rightArm.render(scale);
        this.hat.render(scale);
        this.moustache.render(scale);
        this.leftEye.render(scale);
        this.rightEye.render(scale);
        this.mouth.render(scale);
        this.spikes.render(scale);
	}
}