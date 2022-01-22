package net.mcreator.ragemod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.block.Hegyiko1Block;
import net.mcreator.ragemod.block.HangingalienplantBlock;
import net.mcreator.ragemod.block.Hangingalienoff1Block;
import net.mcreator.ragemod.block.AlienshroomdevBlock;
import net.mcreator.ragemod.block.AlienshroomBlock;
import net.mcreator.ragemod.block.AlienmushroomBlock;
import net.mcreator.ragemod.block.AlienPlantTrapBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class AlienAirUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure AlienAirUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure AlienAirUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure AlienAirUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure AlienAirUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.block.material.Material.AIR) {
			if (Hegyiko1Block.block == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				if (0.1 >= Math.random()) {
					if (0.4 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AlienmushroomBlock.block.getDefaultState(), 3);
					} else if (0.61 >= Math.random()) {
						if (world instanceof ServerWorld) {
							Template template = ((ServerWorld) world).getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("ragemod", "tall_alien_mush"));
							if (template != null) {
								template.func_237144_a_(
										(ServerWorld) world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
										((World) world).rand);
							}
						}
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AlienPlantTrapBlock.block.getDefaultState(), 3);
					}
				} else if (0.1 >= Math.random()) {
					if (0.6 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AlienshroomBlock.block.getDefaultState(), 3);
					} else {
						if (0.5 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AlienshroomdevBlock.block.getDefaultState(), 3);
						} else {
							if (world instanceof ServerWorld) {
								Template template = ((ServerWorld) world).getStructureTemplateManager()
										.getTemplateDefaulted(new ResourceLocation("ragemod", "tall_alien_shroom"));
								if (template != null) {
									template.func_237144_a_(
											(ServerWorld) world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
													.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
											((World) world).rand);
								}
							}
						}
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random()
					&& Hegyiko1Block.block == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.61 >= Math.random()) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HangingalienplantBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Hangingalienoff1Block.block.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
			}
		}
	}
}
