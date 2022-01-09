package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class Alienmushroom2AdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == RagemodModBlocks.HEGYIKO_1
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == RagemodModBlocks.ALIEN_SOIL
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == RagemodModBlocks.ALIEN_TRAP
						|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == RagemodModBlocks.ALIENTRAPBLOCKLIT)) {
			return true;
		}
		return false;
	}
}
