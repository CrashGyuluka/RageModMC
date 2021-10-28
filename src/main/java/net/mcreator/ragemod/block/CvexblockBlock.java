
package net.mcreator.ragemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragemod.particle.CvexparticleParticle;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@RagemodModElements.ModElement.Tag
public class CvexblockBlock extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:cvex_block")
	public static final Block block = null;
	public CvexblockBlock(RagemodModElements instance) {
		super(instance, 400);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ErcekItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(6f, 60f).setLightLevel(s -> 0)
					.harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().jumpFactor(1.1f));
			setRegistryName("cvex_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
			return 2f;
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
		public void animateTick(BlockState blockstate, World world, BlockPos pos, Random random) {
			super.animateTick(blockstate, world, pos, random);
			PlayerEntity entity = Minecraft.getInstance().player;
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (true)
				for (int l = 0; l < 12; ++l) {
					double d0 = (x + 0.5) + (random.nextFloat() - 0.5) * 0.5999999985098838D;
					double d1 = ((y + 0.7) + (random.nextFloat() - 0.5) * 0.5999999985098838D * 100) + 0.5;
					double d2 = (z + 0.5) + (random.nextFloat() - 0.5) * 0.5999999985098838D;
					world.addParticle(CvexparticleParticle.particle, d0, d1, d2, 0, 0, 0);
				}
		}
	}
}
