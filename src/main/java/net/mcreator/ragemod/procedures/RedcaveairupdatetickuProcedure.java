package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class RedcaveairupdatetickuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), RagemodModBlocks.RED_CAVESTONE.defaultBlockState(), 3);
				if (0.05 >= Math.random()) {
					if (0.69 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.RED_CAVEMUSHROOM.defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.RED_GLOWINGCAVEMUSHROOM.defaultBlockState(), 3);
					}
				} else if (0.2 >= Math.random()) {
					if (0.69 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.RED_CAVEPLANT.defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.RED_GLOWING_CAVEPLANT.defaultBlockState(), 3);
					}
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
				}
			} else if (0.15 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.68 >= Math.random()) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGING_REDCAVEPLANT.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGING_GLOWING_RED_CAVESTONE.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			}
		}
	}
}
