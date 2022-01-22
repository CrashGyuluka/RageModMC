package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.block.HangingGlowingCaveplantBlock;
import net.mcreator.ragemod.block.HangingBlueCaveplantBlock;
import net.mcreator.ragemod.block.BlueglowingcavemushroomBlock;
import net.mcreator.ragemod.block.BlueGlowingCaveplantBlock;
import net.mcreator.ragemod.block.BlueCavestoneBlock;
import net.mcreator.ragemod.block.BlueCaveplantBlock;
import net.mcreator.ragemod.block.BlueCavemushroomBlock;
import net.mcreator.ragemod.block.BlueCaveTrapBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class BluecaveairupdatetickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Bluecaveairupdatetick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Bluecaveairupdatetick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Bluecaveairupdatetick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Bluecaveairupdatetick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlueCavestoneBlock.block.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlueCavestoneBlock.block) {
					if (0.13 >= Math.random()) {
						if (0.5 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueCavemushroomBlock.block.getDefaultState(), 3);
						} else {
							if (0.6 >= Math.random()) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueglowingcavemushroomBlock.block.getDefaultState(), 3);
							} else {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueCaveTrapBlock.block.getDefaultState(), 3);
							}
						}
					} else if (0.2 >= Math.random()) {
						if (0.75 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueCaveplantBlock.block.getDefaultState(), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlueGlowingCaveplantBlock.block.getDefaultState(), 3);
						}
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					}
				}
			} else if (0.15 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.66 >= Math.random()) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingBlueCaveplantBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingGlowingCaveplantBlock.block.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
