
package net.mcreator.ragemod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.init.RagemodModParticles;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class CvexblockBlock extends Block {
	public CvexblockBlock() {
		super(Block.Properties.of(Material.METAL).sound(SoundType.NETHERITE_BLOCK).strength(6f, 60f).lightLevel(s -> 0).requiresCorrectToolForDrops()
				.jumpFactor(1.1f));
		setRegistryName("cvex_block");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 2f;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
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
			for (int l = 0; l < 12; ++l) {
				double d0 = (x + 0.5) + (random.nextFloat() - 0.5) * 0.5999999985098838D;
				double d1 = ((y + 0.7) + (random.nextFloat() - 0.5) * 0.5999999985098838D * 100) + 0.5;
				double d2 = (z + 0.5) + (random.nextFloat() - 0.5) * 0.5999999985098838D;
				world.addParticle(RagemodModParticles.CVEXPARTICLE, d0, d1, d2, 0, 0, 0);
			}
	}
}
