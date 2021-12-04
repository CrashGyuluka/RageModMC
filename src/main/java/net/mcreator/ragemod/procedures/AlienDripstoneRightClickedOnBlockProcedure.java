package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class AlienDripstoneRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == true) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
				BlockState _bs = RagemodModBlocks.ALIENDRIPSTONEBOTTOM.defaultBlockState();
				world.setBlock(_bp, _bs, 3);
			}
		} else {
			if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == true) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
					BlockState _bs = RagemodModBlocks.ALIENDRIPSTONETOPDEV.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
