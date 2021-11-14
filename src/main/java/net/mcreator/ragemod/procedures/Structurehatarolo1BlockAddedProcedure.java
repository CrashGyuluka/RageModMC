package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.world.RageModDevModeGameRule;
import net.mcreator.ragemod.block.Sturtureplacer1Block;
import net.mcreator.ragemod.block.Structureplacer2Block;
import net.mcreator.ragemod.block.Structurehatarolo1Block;
import net.mcreator.ragemod.block.Strplacer6Block;
import net.mcreator.ragemod.block.Strplacer5Block;
import net.mcreator.ragemod.block.Strplacer4Block;
import net.mcreator.ragemod.block.Strplacer3Block;
import net.mcreator.ragemod.block.Strhatarolo6Block;
import net.mcreator.ragemod.block.Strhatarolo5Block;
import net.mcreator.ragemod.block.Strhatarolo4Block;
import net.mcreator.ragemod.block.Strhatarolo3Block;
import net.mcreator.ragemod.block.Strhatarolo2Block;
import net.mcreator.ragemod.block.RageiumblockBlock;
import net.mcreator.ragemod.block.RageiumalloyblockBlock;
import net.mcreator.ragemod.block.PolishedalpivBlock;
import net.mcreator.ragemod.block.Hegyiko1Block;
import net.mcreator.ragemod.block.ChiseledalpivBlock;
import net.mcreator.ragemod.block.AlpivfloorBlock;
import net.mcreator.ragemod.block.AlpivblockBlock;
import net.mcreator.ragemod.block.AlientrapblockBlock;
import net.mcreator.ragemod.block.AlienshroomblockBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.HashMap;

public class Structurehatarolo1BlockAddedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Structurehatarolo1BlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Structurehatarolo1BlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Structurehatarolo1BlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Structurehatarolo1BlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(RageModDevModeGameRule.gamerule) == false) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:random_changer_blocks"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Structurehatarolo1Block.block) {
					if (Math.random() > 0.67) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.STONE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.COBBLESTONE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strhatarolo2Block.block) {
						if (Math.random() < 0.69) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = AlpivblockBlock.block.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						} else {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = PolishedalpivBlock.block.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strhatarolo3Block.block) {
							if (Math.random() < 0.67) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = RageiumblockBlock.block.getDefaultState();
									world.setBlockState(_bp, _bs, 3);
								}
							} else {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = RageiumalloyblockBlock.block.getDefaultState();
									world.setBlockState(_bp, _bs, 3);
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strhatarolo4Block.block) {
								if (Math.random() < 0.67) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = AlpivfloorBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								} else {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = ChiseledalpivBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strhatarolo5Block.block) {
									if (Math.random() < 0.51) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = AlientrapblockBlock.block.getDefaultState();
											world.setBlockState(_bp, _bs, 3);
										}
									} else {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Hegyiko1Block.block.getDefaultState();
											world.setBlockState(_bp, _bs, 3);
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strhatarolo6Block.block) {
										if (Math.random() < 0.6) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = AlienshroomblockBlock.block.getDefaultState();
												world.setBlockState(_bp, _bs, 3);
											}
										} else {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.AIR.getDefaultState();
												world.setBlockState(_bp, _bs, 3);
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:structure_placer_blocks"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sturtureplacer1Block.block) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.AIR.getDefaultState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlockState(_bp, _bs, 3);
						}
						if (world instanceof ServerWorld) {
							Template template = ((ServerWorld) world).getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
							if (template != null) {
								template.func_237144_a_(
										(ServerWorld) world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
										((World) world).rand);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Structureplacer2Block.block) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.AIR.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							if (world instanceof ServerWorld) {
								Template template = ((ServerWorld) world).getStructureTemplateManager()
										.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
								if (template != null) {
									template.func_237144_a_(
											(ServerWorld) world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
													.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
											((World) world).rand);
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strplacer3Block.block) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.AIR.getDefaultState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
										if (_property != null && _bs.get(_property) != null)
											try {
												_bs = _bs.with(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlockState(_bp, _bs, 3);
								}
								if (world instanceof ServerWorld) {
									Template template = ((ServerWorld) world).getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
									if (template != null) {
										template.func_237144_a_(
												(ServerWorld) world, new BlockPos((int) x, (int) y, (int) z), new PlacementSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
												((World) world).rand);
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strplacer4Block.block) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.AIR.getDefaultState();
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
											if (_property != null && _bs.get(_property) != null)
												try {
													_bs = _bs.with(_property, (Comparable) entry.getValue());
												} catch (Exception e) {
												}
										}
										world.setBlockState(_bp, _bs, 3);
									}
									if (world instanceof ServerWorld) {
										Template template = ((ServerWorld) world).getStructureTemplateManager()
												.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
										if (template != null) {
											template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
													new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null)
															.setIgnoreEntities(false),
													((World) world).rand);
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strplacer5Block.block) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.AIR.getDefaultState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
												if (_property != null && _bs.get(_property) != null)
													try {
														_bs = _bs.with(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlockState(_bp, _bs, 3);
										}
										if (world instanceof ServerWorld) {
											Template template = ((ServerWorld) world).getStructureTemplateManager()
													.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
											if (template != null) {
												template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
														new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null)
																.setIgnoreEntities(false),
														((World) world).rand);
											}
										}
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Strplacer6Block.block) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.AIR.getDefaultState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
													if (_property != null && _bs.get(_property) != null)
														try {
															_bs = _bs.with(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlockState(_bp, _bs, 3);
											}
											if (world instanceof ServerWorld) {
												Template template = ((ServerWorld) world).getStructureTemplateManager()
														.getTemplateDefaulted(new ResourceLocation("ragemod", "alien_str_floor1"));
												if (template != null) {
													template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
															new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null)
																	.setIgnoreEntities(false),
															((World) world).rand);
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
