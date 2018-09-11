package net.mcMod_v1.MumboJumboMod.Mob;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class EntityBumboCactoni extends EntityLiving {

	public int disguiseStage = 0;
	public boolean passive = true;

	public List<AxisAlignedBB> aabbs = new ArrayList(){{
		add(new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375));
		add(new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375));
		add(new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375));
		add(new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.9375, 1.0, 0.9375));
	}};

	private static final Predicate<Entity> IS_RIDEABLE_MINECART = entity -> entity instanceof EntityMinecart && ((EntityMinecart) entity).canBeRidden();

	public EntityBumboCactoni(World worldIn) {
		super(worldIn);
		setSize(0.875f, 1.0f);

	}

	protected void initEntityAI() {
//		this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
	}

	public boolean getCanSpawnHere() {
		System.out.println("checking for spawn");
//		BlockPos blockpos = new BlockPos(MathHelper.floor(this.posX), 0, MathHelper.floor(this.posZ));
//		Chunk chunk = this.world.getChunkFromBlockCoords(blockpos);

//		if (this.world.getDifficulty() != EnumDifficulty.PEACEFUL) {
//		Biome biome = this.world.getBiome(blockpos);
		System.out.println(getPosition());
		System.out.println(Blocks.CACTUS.canBlockStay(this.world, getPosition()));
		if(Blocks.CACTUS.canBlockStay(this.world, getPosition())) {
			if (this.rand.nextFloat() < 0.5F && this.world.getLightFromNeighbors(new BlockPos(this)) >= 8) {
				System.out.println("can spawn");
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

	public float getEyeHeight()
	{
		return 0.5F;
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
	protected void collideWithNearbyEntities() {
		List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox(), IS_RIDEABLE_MINECART);

		for (int i = 0; i < list.size(); ++i) {
			Entity entity = list.get(i);

			if (this.getDistanceSq(entity) <= 0.2D) {
				entity.applyEntityCollision(this);
			}
		}
	}

	@Override
	public boolean isPushedByWater() {
		return false;
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBoundingBox() {
		return this.isEntityAlive() ? getBumboBoundingBox() : null;
	}

	public AxisAlignedBB getBumboBoundingBox() {
		return aabbs.get(disguiseStage);
	}

	@Override
	@Nullable
	public AxisAlignedBB getCollisionBox(Entity entityIn) {
		return entityIn.canBePushed() ? getBumboBoundingBox() : null;
	}

}
