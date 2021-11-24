package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.block.YellowcavestoneBlock;
import net.mcreator.ragemod.block.YellowcavemushroomBlock;
import net.mcreator.ragemod.block.YellowGlowingCaveplantBlock;
import net.mcreator.ragemod.block.YellowGlowingCavemushroomBlock;
import net.mcreator.ragemod.block.YellowCaveplantBlock;
import net.mcreator.ragemod.block.HangingYellowGlowingCaveplantBlock;
import net.mcreator.ragemod.block.HangingYellowCaveplantBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class YellowcaveairtickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Yellowcaveairtick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Yellowcaveairtick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Yellowcaveairtick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Yellowcaveairtick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), YellowcavestoneBlock.block.getDefaultState(), 3);
				if (0.1 >= Math.random()) {
					if (0.7 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), YellowcavemushroomBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), YellowGlowingCavemushroomBlock.block.getDefaultState(), 3);
					}
				} else if (0.2 >= Math.random()) {
					if (0.7 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), YellowCaveplantBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), YellowGlowingCaveplantBlock.block.getDefaultState(), 3);
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.17 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.7 >= Math.random()) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingYellowCaveplantBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingYellowGlowingCaveplantBlock.block.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
