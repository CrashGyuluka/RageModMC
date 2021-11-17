
package net.mcreator.ragemod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.procedures.RageFaLeavesBlockDestroyedByPlayerProcedure;
import net.mcreator.ragemod.init.RagemodModParticles;

import java.util.Random;

public class RageFaLeavesBlock extends LeavesBlock {
	public RageFaLeavesBlock() {
		super(Block.Properties.of(Material.LEAVES).sound(SoundType.GRASS).strength(0.1f, 0.2f).lightLevel(s -> 0).noOcclusion());
		setRegistryName("rage_fa_leaves");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if (true)
			for (int l = 0; l < 1; ++l) {
				double d0 = (x + random.nextFloat());
				double d1 = (y + random.nextFloat());
				double d2 = (z + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.1D;
				double d4 = (random.nextFloat() - 0.5D) * 0.1D;
				double d5 = (random.nextFloat() - 0.5D) * 0.1D;
				world.addParticle(RagemodModParticles.RAGETREE_FALLING, d0, d1, d2, d3, d4, d5);
			}
	}

	@Override
	public boolean removedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.removedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		RageFaLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
