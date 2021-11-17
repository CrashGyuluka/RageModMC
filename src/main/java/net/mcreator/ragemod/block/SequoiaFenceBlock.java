
package net.mcreator.ragemod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class SequoiaFenceBlock extends FenceBlock {
	public SequoiaFenceBlock() {
		super(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.4000000000000004f, 3.6000000000000005f).lightLevel(s -> 0));
		setRegistryName("sequoia_fence");
	}

	@Override
	public boolean connectsTo(BlockState state, boolean checkattach, Direction face) {
		boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == this.material;
		boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
		return !isExceptionForConnection(state) && checkattach || flag || flag1;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 6;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
