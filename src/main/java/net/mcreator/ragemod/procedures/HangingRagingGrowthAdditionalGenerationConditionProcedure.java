package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class HangingRagingGrowthAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude()
						|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == RagemodModBlocks.RAGE_FA_LEAVES)) {
			return true;
		}
		return false;
	}
}
