package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModMobEffects;

public class AlieniteaxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() == false) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RagemodModMobEffects.MEGAMINE_EFFECT) : false) {
				if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
					if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
						if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock())) {
							if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
									.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock())) {
								if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
										.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock())) {
									if (world instanceof Level) {
										Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
									}
									if (world instanceof Level) {
										Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (Level) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
									}
									if (world instanceof Level) {
										Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z)), (Level) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 3), (int) z), false);
									}
									if (world instanceof Level) {
										Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)), (Level) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 4), (int) z), false);
									}
									if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
											.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock())) {
										if (world instanceof Level) {
											Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z)), (Level) world,
													new BlockPos((int) x, (int) y, (int) z));
											world.destroyBlock(new BlockPos((int) x, (int) (y + 5), (int) z), false);
										}
										if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
												.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z))).getBlock())) {
											if (world instanceof Level) {
												Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z)), (Level) world,
														new BlockPos((int) x, (int) y, (int) z));
												world.destroyBlock(new BlockPos((int) x, (int) (y + 6), (int) z), false);
											}
											if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
													.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z))).getBlock())) {
												if (world instanceof Level) {
													Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z)),
															(Level) world, new BlockPos((int) x, (int) y, (int) z));
													world.destroyBlock(new BlockPos((int) x, (int) (y + 7), (int) z), false);
												}
												if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:logs"))
														.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 8), (int) z))).getBlock())) {
													if (world instanceof Level) {
														Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 8), (int) z)),
																(Level) world, new BlockPos((int) x, (int) y, (int) z));
														world.destroyBlock(new BlockPos((int) x, (int) (y + 8), (int) z), false);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
