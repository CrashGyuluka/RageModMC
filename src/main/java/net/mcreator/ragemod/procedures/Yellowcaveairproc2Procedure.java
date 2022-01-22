package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.RagemodMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class Yellowcaveairproc2Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Yellowcaveairproc2!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Yellowcaveairproc2!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Yellowcaveairproc2!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Yellowcaveairproc2!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double zs = 0;
		double ys = 0;
		double xs = 0;
		if (y <= 40) {
			zs = (-32);
			for (int index0 = 0; index0 < (int) (64); index0++) {
				xs = (-32);
				for (int index1 = 0; index1 < (int) (64); index1++) {
					ys = (-8);
					for (int index2 = 0; index2 < (int) (16); index2++) {
						ys = (ys + 1);
						YellowcaveairtickProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", (x + xs)),
										new AbstractMap.SimpleEntry<>("y", (y + ys)), new AbstractMap.SimpleEntry<>("z", (z + zs)))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					}
					xs = (xs + 1);
				}
				zs = (zs + 1);
			}
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getDefaultState(), 3);
	}
}
