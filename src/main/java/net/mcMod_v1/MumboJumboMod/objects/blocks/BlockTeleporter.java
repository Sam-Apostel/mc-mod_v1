package net.mcMod_v1.MumboJumboMod.objects.blocks;

import net.mcMod_v1.MumboJumboMod.block.BlockBase;
import net.mcMod_v1.MumboJumboMod.commands.util.Teleport;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class BlockTeleporter extends BlockBase {
    public BlockTeleporter(String name){
        super(Material.ROCK, name);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            Teleport.teleportToDimension(playerIn, 2, playerIn.getPosition().getX(),playerIn.getPosition().getY() + 5,playerIn.getPosition().getZ());
            return true;
        }
        return false;
    }
}
