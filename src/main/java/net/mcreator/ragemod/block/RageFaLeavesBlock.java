
package net.mcreator.ragemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.fluid.FluidState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragemod.procedures.RageFaLeavesBlockDestroyedByPlayerProcedure;
import net.mcreator.ragemod.particle.RagefallingtreeParticle;
import net.mcreator.ragemod.itemgroup.TermeszettabItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.Random;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class RageFaLeavesBlock extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:rage_fa_leaves")
	public static final Block block = null;

	public RageFaLeavesBlock(RagemodModElements instance) {
		super(instance, 408);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TermeszettabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.1f, 0.2f).setLightLevel(s -> 0).notSolid());
			setRegistryName("rage_fa_leaves");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 1;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 30;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public void animateTick(BlockState blockstate, World world, BlockPos pos, Random random) {
			super.animateTick(blockstate, world, pos, random);
			PlayerEntity entity = Minecraft.getInstance().player;
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
					world.addParticle(RagefallingtreeParticle.particle, d0, d1, d2, d3, d4, d5);
				}
		}

		@Override
		public boolean removedByPlayer(BlockState blockstate, World world, BlockPos pos, PlayerEntity entity, boolean willHarvest, FluidState fluid) {
			boolean retval = super.removedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();

			RageFaLeavesBlockDestroyedByPlayerProcedure.executeProcedure(
					ImmutableMap.<String, Object>builder().put("entity", entity).put("x", x).put("y", y).put("z", z).put("world", world).build());
			return retval;
		}
	}
}
