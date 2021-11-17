
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.init.RagemodModParticles;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class AlienshroomblockBlock extends Block {
	public AlienshroomblockBlock() {
		super(Block.Properties.of(Material.PLANT).sound(SoundType.CORAL_BLOCK).strength(0.7f, 2f).lightLevel(s -> 7).noCollission().speedFactor(1.1f)
				.jumpFactor(1.1f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
		setRegistryName("alienshroomblock");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
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
			for (int l = 0; l < 2; ++l) {
				double d0 = (x + random.nextFloat());
				double d1 = (y + random.nextFloat());
				double d2 = (z + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.3999999985098839D;
				double d4 = (random.nextFloat() - 0.5D) * 0.3999999985098839D;
				double d5 = (random.nextFloat() - 0.5D) * 0.3999999985098839D;
				world.addParticle(RagemodModParticles.ALIENPLANTPARTICLE, d0, d1, d2, d3, d4, d5);
			}
	}
}
