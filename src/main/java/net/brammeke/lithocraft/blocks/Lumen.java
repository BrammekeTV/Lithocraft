package net.brammeke.lithocraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class Lumen extends Block {
    public Lumen(Settings settings, DefaultParticleType flame) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 4.0D, 4.0D, 4.0D).offset(0.375, 0.375, 0.375);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.INVISIBLE;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.5;
        double z = pos.getZ() + 0.5;
        world.addParticle(ParticleTypes.SMOKE, true, x, y, z, 0.0D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0.0D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0.0045D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0.001D, 0.005D, 0.005D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0.005D, 0.0D, 0.006D);

        world.addParticle(ParticleTypes.FLAME, true, x, y, z, -0.0045D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, -0.001D, 0.005D, -0.005D);
        world.addParticle(ParticleTypes.FLAME, true, x, y, z, -0.005D, 0.0D, -0.006D);
    }
}
