
package net.mcreator.ragemod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class AlpivblockstairsBlock extends StairBlock {
	public AlpivblockstairsBlock() {
		super(() -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 10f).lightLevel(s -> 0)
				.requiresCorrectToolForDrops().dynamicShape()).defaultBlockState(),
				Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 10f).lightLevel(s -> 0).requiresCorrectToolForDrops()
						.dynamicShape());
		setRegistryName("alpiv_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
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
