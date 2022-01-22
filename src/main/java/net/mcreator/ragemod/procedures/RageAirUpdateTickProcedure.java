package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.block.Ragingvinesdev2Block;
import net.mcreator.ragemod.block.RaginggrowthBlock;
import net.mcreator.ragemod.block.RageflowerBlock;
import net.mcreator.ragemod.block.HangingGlowingCaveplantBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class RageAirUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure RageAirUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure RageAirUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure RageAirUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure RageAirUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.STONE.getDefaultState(), 3);
				if (0.05 >= Math.random()) {
					if (0.69 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), RaginggrowthBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Ragingvinesdev2Block.block.getDefaultState(), 3);
					}
				} else if (0.2 >= Math.random()) {
					if (0.75 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), RageflowerBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.15 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.66 >= Math.random()) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), RageflowerBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingGlowingCaveplantBlock.block.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
