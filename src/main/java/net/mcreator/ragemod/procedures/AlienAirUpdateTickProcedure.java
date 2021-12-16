package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class AlienAirUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			if (RagemodModBlocks.HEGYIKO_1 == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
				if (0.05 >= Math.random()) {
					if (0.69 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.ALIEN_MUSHROOM.defaultBlockState(), 3);
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("ragemod", "tall_alien_mush"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (0.1 >= Math.random()) {
					if (0.6 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.ALIEN_SHROOM.defaultBlockState(), 3);
					} else {
						if (0.5 >= Math.random()) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.ALIENSHROOMDEV.defaultBlockState(), 3);
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("ragemod", "tall_alien_shroom"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
											new BlockPos((int) x, (int) y, (int) z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
				}
			} else if (0.1 >= Math.random()
					&& RagemodModBlocks.HEGYIKO_1 == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
				if (0.61 >= Math.random()) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGING_ALIEN_SHROOM.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.HANGINGALIENOFF_1.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			}
		}
	}
}
