package net.mcMod_v1.MumboJumboMod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBumboCactoni extends EntityLiving {

	public static final DataParameter<Integer> SIZE = EntityDataManager.createKey(EntityBumboCactoni.class, DataSerializers.VARINT);
	public int disguiseStage = 0;
	public int age = 0;

	public EntityBumboCactoni(World worldIn) {
		super(worldIn);
		setSize(0.875f, 1.0f);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SIZE, Integer.valueOf(1));
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if(dataManager.get(SIZE) < 3) {
			int rand = Math.round((float) Math.random() * 4051.0f - 0.5f);
			int speed = world.getGameRules().getInt("randomTickSpeed");
			if(rand <= (1 * speed) - 1) {
				if(this.age < 15) {
					age++;
				} else {
					age = 0;
					setBumboCactoniSize(dataManager.get(SIZE) + 1);
				}
			}
		}
	}

	private void setBumboCactoniSize(int size) {
		size = size > 3 ? 3 : (size < 1 ? 1 : size);
		dataManager.set(SIZE, size);
		setSize(0.875f, (float) size);
	}

	public void readEntityFromNBT(NBTTagCompound compound)
	{
		super.readEntityFromNBT(compound);
		if(compound.hasKey("disguiseStage")) {
			this.disguiseStage = compound.getInteger("disguiseStage");
		}
		if(compound.hasKey("age")) {
			this.age = compound.getInteger("age");
		}
		if(compound.hasKey("size")) {
			dataManager.set(SIZE, compound.getInteger("size"));
		}
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("disguiseStage", this.disguiseStage);
		compound.setInteger("age", this.age);
		compound.setInteger("size", dataManager.get(SIZE));
	}

	public boolean getCanSpawnHere() {
		if(Blocks.CACTUS.canBlockStay(this.world, getPosition())) {
			if (this.rand.nextFloat() < 0.5F && this.world.getLightFromNeighbors(new BlockPos(this)) >= 8) {
				return super.getCanSpawnHere();
			}
		}
		return false;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevRenderYawOffset = 180.0F;
		this.renderYawOffset = 180.0F;
		this.rotationYaw = 180.0F;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		this.setEntityBoundingBox(new AxisAlignedBB(this.posX - 0.4375D, this.posY, this.posZ - 0.4375D, this.posX + 0.4375D, this.posY + 1.0D, this.posZ + 0.4375D));

		BlockPos beginBlockPos = getPosition();
		if(!(prevPosX == posX && prevPosY == posY && prevPosZ == posZ)) {
			System.out.println(prevPosX + " , " + posX);
			System.out.println(prevPosY + " , " + posY);
			System.out.println(prevPosZ + " , " + posZ);

			prevPosX = posX;
			prevPosY = posY;
			prevPosZ = posZ;
			this.lastTickPosX = this.posX;
			this.lastTickPosY = this.posY;
			this.lastTickPosZ = this.posZ;
		}
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		super.attackEntityFrom(source, amount);

		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;

		return false;
	}

	public float getEyeHeight() {
		return (float) dataManager.get(SIZE) - 0.2f;
	}

	public int getVerticalFaceSpeed()
	{
		return 180;
	}

	public int getHorizontalFaceSpeed()
	{
		return 180;
	}

	/**
	 * Applies a velocity to the entities, to push them away from eachother.
	 */
	public void applyEntityCollision(Entity entityIn)
	{
	}

	public float getCollisionBorderSize()
	{
		return 0.0F;
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	protected void collideWithEntity(Entity entityIn) {}

	@Override
	public boolean isPushedByWater() {
		return false;
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox() {
		return this.isEntityAlive() ? getEntityBoundingBox() : null;
	}

}
