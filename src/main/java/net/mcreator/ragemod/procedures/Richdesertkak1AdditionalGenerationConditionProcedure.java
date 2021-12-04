package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Richdesertkak1AdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).canOcclude() == false
				&& world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).canOcclude() == false
				&& world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).canOcclude() == false
				&& world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).canOcclude() == false) {
			return true;
		}
		return false;
	}
}
