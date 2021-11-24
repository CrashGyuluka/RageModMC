package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.block.MagentacaveplantBlock;
import net.mcreator.ragemod.block.MagentaGlowongCaveplantBlock;
import net.mcreator.ragemod.block.MagentaGlowingCavemushroomBlock;
import net.mcreator.ragemod.block.MagentaCavestoneBlock;
import net.mcreator.ragemod.block.MagentaCavemushroomBlock;
import net.mcreator.ragemod.block.HangingMagentaCaveplantBlock;
import net.mcreator.ragemod.block.HangingGlowingMagentaCaveplantBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class MagentaCaveairproc1Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure MagentaCaveairproc1!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure MagentaCaveairproc1!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure MagentaCaveairproc1!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure MagentaCaveairproc1!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) {
			if (Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MagentaCavestoneBlock.block.getDefaultState(), 3);
				if (0.1 >= Math.random()) {
					if (0.66 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MagentaCavemushroomBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MagentaGlowingCavemushroomBlock.block.getDefaultState(), 3);
					}
				} else if (0.2 >= Math.random()) {
					if (0.66 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MagentacaveplantBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MagentaGlowongCaveplantBlock.block.getDefaultState(), 3);
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && Blocks.STONE == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.66 >= Math.random()) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingMagentaCaveplantBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingGlowingMagentaCaveplantBlock.block.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
