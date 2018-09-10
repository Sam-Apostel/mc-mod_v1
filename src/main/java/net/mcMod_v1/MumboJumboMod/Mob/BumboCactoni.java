package net.mcMod_v1.MumboJumboMod.Mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFindEntityNearest;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;

import javax.annotation.Nullable;

public class BumboCactoni extends EntityTameable {

	public int disguiseStage = 0;
	public boolean passive = true;

	public BumboCactoni(World worldIn) {
		super(worldIn);
		spawnableBlock = Blocks.SAND;
	}

	@Nullable
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
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

}
