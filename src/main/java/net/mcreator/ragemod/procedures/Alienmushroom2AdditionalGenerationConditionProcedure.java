package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.ragemod.block.Hegyiko1Block;
import net.mcreator.ragemod.block.DestroyablealiensoildevBlock;
import net.mcreator.ragemod.block.AlientrapblocklitBlock;
import net.mcreator.ragemod.block.AlientrapblockBlock;
import net.mcreator.ragemod.block.AliensoilBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class Alienmushroom2AdditionalGenerationConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Alienmushroom2AdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Alienmushroom2AdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Alienmushroom2AdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Alienmushroom2AdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Hegyiko1Block.block
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AliensoilBlock.block
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AlientrapblockBlock.block
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == DestroyablealiensoildevBlock.block
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AlientrapblocklitBlock.block)) {
			return true;
		}
		return false;
	}
}
