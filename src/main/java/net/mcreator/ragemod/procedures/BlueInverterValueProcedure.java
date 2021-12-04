package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BlueInverterValueProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		return 15 - (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos((int) x, (int) y, (int) z), Direction.NORTH) : 0);
	}
}
