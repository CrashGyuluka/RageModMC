package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModGameRules;
import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class Structurehatarolo1BlockAddedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(RagemodModGameRules.RAGEMODDEVMODE) == false) {
			if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:random_changer_blocks"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRUCTUREHATAROLO_1) {
					if (Math.random() > 0.67) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.STONE.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.COBBLESTONE.defaultBlockState();
							world.setBlock(_bp, _bs, 3);
						}
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRHATAROLO_2) {
						if (Math.random() < 0.69) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = RagemodModBlocks.ALPIVBLOCK.defaultBlockState();
								world.setBlock(_bp, _bs, 3);
							}
						} else {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = RagemodModBlocks.POLISHEDALPIV.defaultBlockState();
								world.setBlock(_bp, _bs, 3);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRHATAROLO_3) {
							if (Math.random() < 0.67) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = RagemodModBlocks.RAGEIUMBLOCK.defaultBlockState();
									world.setBlock(_bp, _bs, 3);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = RagemodModBlocks.RAGEIUMALLOYBLOCK.defaultBlockState();
									world.setBlock(_bp, _bs, 3);
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRHATAROLO_4) {
								if (Math.random() < 0.67) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = RagemodModBlocks.ALPIV_FLOOR.defaultBlockState();
										world.setBlock(_bp, _bs, 3);
									}
								} else {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = RagemodModBlocks.CHISELED_ALPIV.defaultBlockState();
										world.setBlock(_bp, _bs, 3);
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRHATAROLO_5) {
									if (Math.random() < 0.51) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = RagemodModBlocks.ALIEN_TRAP.defaultBlockState();
											world.setBlock(_bp, _bs, 3);
										}
									} else {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = RagemodModBlocks.HEGYIKO_1.defaultBlockState();
											world.setBlock(_bp, _bs, 3);
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRHATAROLO_6) {
										if (Math.random() < 0.6) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = RagemodModBlocks.ALIENSHROOMBLOCK.defaultBlockState();
												world.setBlock(_bp, _bs, 3);
											}
										} else {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.AIR.defaultBlockState();
												world.setBlock(_bp, _bs, 3);
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:structure_placer_blocks"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STURTUREPLACER_1) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.AIR.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRUCTUREPLACER_2) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.AIR.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
											new BlockPos((int) x, (int) y, (int) z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRPLACER_3) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.AIR.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
												new BlockPos((int) x, (int) y, (int) z), new StructurePlaceSettings().setRotation(Rotation.NONE)
														.setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRPLACER_4) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.AIR.defaultBlockState();
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
											if (_property != null && _bs.getValue(_property) != null)
												try {
													_bs = _bs.setValue(_property, (Comparable) entry.getValue());
												} catch (Exception e) {
												}
										}
										world.setBlock(_bp, _bs, 3);
									}
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
													new BlockPos((int) x, (int) y, (int) z), new StructurePlaceSettings().setRotation(Rotation.NONE)
															.setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRPLACER_5) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.AIR.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager()
													.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
														new BlockPos((int) x, (int) y, (int) z), new StructurePlaceSettings()
																.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
												.getBlock() == RagemodModBlocks.STRPLACER_6) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.AIR.defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager()
														.getOrCreate(new ResourceLocation("ragemod", "alien_str_floor1"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
															new BlockPos((int) x, (int) y, (int) z), new StructurePlaceSettings()
																	.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
															_serverworld.random, 3);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
