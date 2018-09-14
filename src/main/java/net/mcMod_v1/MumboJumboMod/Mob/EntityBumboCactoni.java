package net.mcMod_v1.MumboJumboMod.Mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBumboCactoni extends EntityLiving {

	public int disguiseStage = 0;
	public boolean passive = true;


	public EntityBumboCactoni(World worldIn) {
		super(worldIn);
		setSize(0.875f, 3.0f);
	}

	protected void initEntityAI() {
//		this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
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
		//this.motionY = 0.0D;
		this.motionZ = 0.0D;
		this.prevRenderYawOffset = 180.0F;
		this.renderYawOffset = 180.0F;
		this.rotationYaw = 180.0F;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		this.setEntityBoundingBox(new AxisAlignedBB(this.posX - 0.4375D, this.posY, this.posZ - 0.4375D, this.posX + 0.4375D, this.posY + 2.8D, this.posZ + 0.4375D));

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

	public float getEyeHeight()
	{
		return 1.8F;
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

//	@Override
//	protected void collideWithNearbyEntities() {
//		List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox(), IS_RIDEABLE_MINECART);
//
//		for (int i = 0; i < list.size(); ++i) {
//			Entity entity = list.get(i);
//
//			if (this.getDistanceSq(entity) <= 0.2D) {
//				entity.applyEntityCollision(this);
//			}
//		}
//	}

	@Override
	public boolean isPushedByWater() {
		return true;
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox() {
		return this.isEntityAlive() ? getEntityBoundingBox() : null;
	}

}
