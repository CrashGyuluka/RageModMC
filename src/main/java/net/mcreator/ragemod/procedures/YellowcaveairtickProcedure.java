package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class YellowcaveairtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				if (Math.random() < 0.7) {
					world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), RagemodModBlocks.YELLOWCAVESTONE.defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == RagemodModBlocks.YELLOWCAVESTONE) {
					if (0.13 >= Math.random()) {
						if (0.5 >= Math.random()) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.YELLOWCAVEMUSHROOM.defaultBlockState(), 3);
						} else {
							if (0.6 >= Math.random()) {
								world.setBlock(new BlockPos((int) x, (int) y, (int) z),
										RagemodModBlocks.YELLOW_GLOWING_CAVEMUSHROOM.defaultBlockState(), 3);
							} else {
								world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.YELLOW_CAVE_TRAP.defaultBlockState(), 3);
							}
						}
					} else if (0.2 >= Math.random()) {
						if (0.7 >= Math.random()) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.YELLOW_CAVEPLANT.defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.YELLOW_GLOWING_CAVEPLANT.defaultBlockState(), 3);
						}
					} else {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
					}
				}
			} else if (0.17 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.7 >= Math.random()) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGING_YELLOW_CAVEPLANT.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGING_YELLOW_GLOWING_CAVEPLANT.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			}
		}
	}
}
