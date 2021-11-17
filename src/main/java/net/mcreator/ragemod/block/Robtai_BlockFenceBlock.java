
package net.mcreator.ragemod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class Robtai_BlockFenceBlock extends FenceBlock {
	public Robtai_BlockFenceBlock() {
		super(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(4f, 2f).lightLevel(s -> 0).requiresCorrectToolForDrops());
		setRegistryName("stripped_robtai_fence");
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
		return 5;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 3;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
