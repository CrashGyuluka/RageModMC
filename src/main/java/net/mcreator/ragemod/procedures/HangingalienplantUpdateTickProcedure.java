package net.mcreator.ragemod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.ragemod.block.Haningalienplant5Block;
import net.mcreator.ragemod.block.Hangingalienplantexluse1Block;
import net.mcreator.ragemod.block.HangingalienplantdevblockBlock;
import net.mcreator.ragemod.block.HangingalienplantBlock;
import net.mcreator.ragemod.block.Hangingalienplant5Block;
import net.mcreator.ragemod.block.Hangingalienplant3Block;
import net.mcreator.ragemod.block.Hangingalienoff1Block;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class HangingalienplantUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure HangingalienplantUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure HangingalienplantUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure HangingalienplantUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure HangingalienplantUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HangingalienplantBlock.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HangingalienplantdevblockBlock.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Hangingalienoff1Block.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Hangingalienplant3Block.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Haningalienplant5Block.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Hangingalienplant5Block.block
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Hangingalienplantexluse1Block.block) {
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == HangingalienplantBlock.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == HangingalienplantdevblockBlock.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Hangingalienoff1Block.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Hangingalienplant3Block.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Haningalienplant5Block.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Hangingalienplant5Block.block
					|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Hangingalienplantexluse1Block.block
					|| world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isSolid() == false) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
		}
	}
}
