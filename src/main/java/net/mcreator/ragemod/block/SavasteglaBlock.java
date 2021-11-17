
package net.mcreator.ragemod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.procedures.SavaskoEntityWalksOnTheBlockProcedure;
import net.mcreator.ragemod.init.RagemodModParticles;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class SavasteglaBlock extends Block {
	public SavasteglaBlock() {
		super(Block.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 5f).lightLevel(s -> 0).requiresCorrectToolForDrops()
				.friction(0.7999999999999999f));
		setRegistryName("savastegla");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
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

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if (true)
			for (int l = 0; l < 4; ++l) {
				double d0 = (x + random.nextFloat());
				double d1 = (y + random.nextFloat());
				double d2 = (z + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.5D;
				double d4 = (random.nextFloat() - 0.5D) * 0.5D;
				double d5 = (random.nextFloat() - 0.5D) * 0.5D;
				world.addParticle(RagemodModParticles.SAVASPART, d0, d1, d2, d3, d4, d5);
			}
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		SavaskoEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}
