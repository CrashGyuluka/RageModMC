package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.item.SavascsakanyItem;
import net.mcreator.ragemod.item.AlienitepickaxeItem;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.HashMap;

public class Savascsakanyproc4Procedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Savascsakanyproc4!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Savascsakanyproc4!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Savascsakanyproc4!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Savascsakanyproc4!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Savascsakanyproc4!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == SavascsakanyItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == AlienitepickaxeItem.block) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CHISELED_SANDSTONE) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Blocks.SMOOTH_SANDSTONE.getDefaultState();
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
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CUT_SANDSTONE) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = Blocks.SMOOTH_SANDSTONE.getDefaultState();
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
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SANDSTONE_STAIRS) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.SMOOTH_SANDSTONE_STAIRS.getDefaultState();
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
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CUT_SANDSTONE_SLAB) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.SMOOTH_SANDSTONE_SLAB.getDefaultState();
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
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SANDSTONE_SLAB) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.CUT_SANDSTONE_SLAB.getDefaultState();
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
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CHISELED_RED_SANDSTONE) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE.getDefaultState();
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
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CUT_RED_SANDSTONE) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE.getDefaultState();
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
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
												.getBlock() == Blocks.RED_SANDSTONE_STAIRS) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE_STAIRS.getDefaultState();
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
										} else {
											if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == Blocks.CUT_RED_SANDSTONE_SLAB) {
												{
													BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
													BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE_SLAB.getDefaultState();
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
											} else {
												if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == Blocks.RED_SANDSTONE_SLAB) {
													{
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														BlockState _bs = Blocks.CUT_RED_SANDSTONE_SLAB.getDefaultState();
														BlockState _bso = world.getBlockState(_bp);
														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
															Property _property = _bs.getBlock().getStateContainer()
																	.getProperty(entry.getKey().getName());
															if (_property != null && _bs.get(_property) != null)
																try {
																	_bs = _bs.with(_property, (Comparable) entry.getValue());
																} catch (Exception e) {
																}
														}
														world.setBlockState(_bp, _bs, 3);
													}
												} else {
													if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == Blocks.MOSSY_COBBLESTONE) {
														{
															BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
															BlockState _bs = Blocks.COBBLESTONE.getDefaultState();
															BlockState _bso = world.getBlockState(_bp);
															for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																Property _property = _bs.getBlock().getStateContainer()
																		.getProperty(entry.getKey().getName());
																if (_property != null && _bs.get(_property) != null)
																	try {
																		_bs = _bs.with(_property, (Comparable) entry.getValue());
																	} catch (Exception e) {
																	}
															}
															world.setBlockState(_bp, _bs, 3);
														}
													} else {
														if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == Blocks.MOSSY_COBBLESTONE_STAIRS) {
															{
																BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																BlockState _bs = Blocks.COBBLESTONE_STAIRS.getDefaultState();
																BlockState _bso = world.getBlockState(_bp);
																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																	Property _property = _bs.getBlock().getStateContainer()
																			.getProperty(entry.getKey().getName());
																	if (_property != null && _bs.get(_property) != null)
																		try {
																			_bs = _bs.with(_property, (Comparable) entry.getValue());
																		} catch (Exception e) {
																		}
																}
																world.setBlockState(_bp, _bs, 3);
															}
														} else {
															if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == Blocks.MOSSY_COBBLESTONE_SLAB) {
																{
																	BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																	BlockState _bs = Blocks.COBBLESTONE_SLAB.getDefaultState();
																	BlockState _bso = world.getBlockState(_bp);
																	for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																		Property _property = _bs.getBlock().getStateContainer()
																				.getProperty(entry.getKey().getName());
																		if (_property != null && _bs.get(_property) != null)
																			try {
																				_bs = _bs.with(_property, (Comparable) entry.getValue());
																			} catch (Exception e) {
																			}
																	}
																	world.setBlockState(_bp, _bs, 3);
																}
															} else {
																if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == Blocks.MOSSY_COBBLESTONE_WALL) {
																	{
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		BlockState _bs = Blocks.COBBLESTONE_WALL.getDefaultState();
																		BlockState _bso = world.getBlockState(_bp);
																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																				.entrySet()) {
																			Property _property = _bs.getBlock().getStateContainer()
																					.getProperty(entry.getKey().getName());
																			if (_property != null && _bs.get(_property) != null)
																				try {
																					_bs = _bs.with(_property, (Comparable) entry.getValue());
																				} catch (Exception e) {
																				}
																		}
																		world.setBlockState(_bp, _bs, 3);
																	}
																} else {
																	if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																			.getBlock() == Blocks.CRACKED_STONE_BRICKS) {
																		{
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			BlockState _bs = Blocks.STONE_BRICKS.getDefaultState();
																			BlockState _bso = world.getBlockState(_bp);
																			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																					.entrySet()) {
																				Property _property = _bs.getBlock().getStateContainer()
																						.getProperty(entry.getKey().getName());
																				if (_property != null && _bs.get(_property) != null)
																					try {
																						_bs = _bs.with(_property, (Comparable) entry.getValue());
																					} catch (Exception e) {
																					}
																			}
																			world.setBlockState(_bp, _bs, 3);
																		}
																	} else {
																		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																				.getBlock() == Blocks.MOSSY_STONE_BRICKS) {
																			{
																				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																				BlockState _bs = Blocks.STONE_BRICKS.getDefaultState();
																				BlockState _bso = world.getBlockState(_bp);
																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																						.entrySet()) {
																					Property _property = _bs.getBlock().getStateContainer()
																							.getProperty(entry.getKey().getName());
																					if (_property != null && _bs.get(_property) != null)
																						try {
																							_bs = _bs.with(_property, (Comparable) entry.getValue());
																						} catch (Exception e) {
																						}
																				}
																				world.setBlockState(_bp, _bs, 3);
																			}
																		} else {
																			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																					.getBlock() == Blocks.NETHER_BRICKS) {
																				{
																					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																					BlockState _bs = Blocks.CHISELED_NETHER_BRICKS.getDefaultState();
																					BlockState _bso = world.getBlockState(_bp);
																					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																							.getValues().entrySet()) {
																						Property _property = _bs.getBlock().getStateContainer()
																								.getProperty(entry.getKey().getName());
																						if (_property != null && _bs.get(_property) != null)
																							try {
																								_bs = _bs.with(_property,
																										(Comparable) entry.getValue());
																							} catch (Exception e) {
																							}
																					}
																					world.setBlockState(_bp, _bs, 3);
																				}
																			} else {
																				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																						.getBlock() == Blocks.NETHERRACK) {
																					{
																						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																						BlockState _bs = Blocks.NETHER_BRICKS.getDefaultState();
																						BlockState _bso = world.getBlockState(_bp);
																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																								.getValues().entrySet()) {
																							Property _property = _bs.getBlock().getStateContainer()
																									.getProperty(entry.getKey().getName());
																							if (_property != null && _bs.get(_property) != null)
																								try {
																									_bs = _bs.with(_property,
																											(Comparable) entry.getValue());
																								} catch (Exception e) {
																								}
																						}
																						world.setBlockState(_bp, _bs, 3);
																					}
																				} else {
																					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																							.getBlock() == Blocks.CRACKED_NETHER_BRICKS) {
																						{
																							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																							BlockState _bs = Blocks.NETHER_BRICKS.getDefaultState();
																							BlockState _bso = world.getBlockState(_bp);
																							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																									.getValues().entrySet()) {
																								Property _property = _bs.getBlock()
																										.getStateContainer()
																										.getProperty(entry.getKey().getName());
																								if (_property != null && _bs.get(_property) != null)
																									try {
																										_bs = _bs.with(_property,
																												(Comparable) entry.getValue());
																									} catch (Exception e) {
																									}
																							}
																							world.setBlockState(_bp, _bs, 3);
																						}
																					} else {
																						if ((world.getBlockState(
																								new BlockPos((int) x, (int) y, (int) z)))
																										.getBlock() == Blocks.BASALT) {
																							{
																								BlockPos _bp = new BlockPos((int) x, (int) y,
																										(int) z);
																								BlockState _bs = Blocks.POLISHED_BASALT
																										.getDefaultState();
																								BlockState _bso = world.getBlockState(_bp);
																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																										.getValues().entrySet()) {
																									Property _property = _bs.getBlock()
																											.getStateContainer()
																											.getProperty(entry.getKey().getName());
																									if (_property != null
																											&& _bs.get(_property) != null)
																										try {
																											_bs = _bs.with(_property,
																													(Comparable) entry.getValue());
																										} catch (Exception e) {
																										}
																								}
																								world.setBlockState(_bp, _bs, 3);
																							}
																						} else {
																							if ((world.getBlockState(
																									new BlockPos((int) x, (int) y, (int) z)))
																											.getBlock() == Blocks.SMOOTH_STONE_SLAB) {
																								{
																									BlockPos _bp = new BlockPos((int) x, (int) y,
																											(int) z);
																									BlockState _bs = Blocks.STONE_BRICK_SLAB
																											.getDefaultState();
																									BlockState _bso = world.getBlockState(_bp);
																									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																											.getValues().entrySet()) {
																										Property _property = _bs.getBlock()
																												.getStateContainer().getProperty(
																														entry.getKey().getName());
																										if (_property != null
																												&& _bs.get(_property) != null)
																											try {
																												_bs = _bs.with(_property,
																														(Comparable) entry
																																.getValue());
																											} catch (Exception e) {
																											}
																									}
																									world.setBlockState(_bp, _bs, 3);
																								}
																							} else {
																								if ((world.getBlockState(
																										new BlockPos((int) x, (int) y, (int) z)))
																												.getBlock() == Blocks.STONE_SLAB) {
																									{
																										BlockPos _bp = new BlockPos((int) x, (int) y,
																												(int) z);
																										BlockState _bs = Blocks.SMOOTH_STONE_SLAB
																												.getDefaultState();
																										BlockState _bso = world.getBlockState(_bp);
																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																												.getValues().entrySet()) {
																											Property _property = _bs.getBlock()
																													.getStateContainer().getProperty(
																															entry.getKey().getName());
																											if (_property != null
																													&& _bs.get(_property) != null)
																												try {
																													_bs = _bs.with(_property,
																															(Comparable) entry
																																	.getValue());
																												} catch (Exception e) {
																												}
																										}
																										world.setBlockState(_bp, _bs, 3);
																									}
																								} else {
																									if ((world.getBlockState(
																											new BlockPos((int) x, (int) y, (int) z)))
																													.getBlock() == Blocks.COBBLESTONE_SLAB) {
																										{
																											BlockPos _bp = new BlockPos((int) x,
																													(int) y, (int) z);
																											BlockState _bs = Blocks.STONE_SLAB
																													.getDefaultState();
																											BlockState _bso = world
																													.getBlockState(_bp);
																											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																													.getValues().entrySet()) {
																												Property _property = _bs.getBlock()
																														.getStateContainer()
																														.getProperty(entry.getKey()
																																.getName());
																												if (_property != null
																														&& _bs.get(_property) != null)
																													try {
																														_bs = _bs.with(_property,
																																(Comparable) entry
																																		.getValue());
																													} catch (Exception e) {
																													}
																											}
																											world.setBlockState(_bp, _bs, 3);
																										}
																									} else {
																										if ((world.getBlockState(new BlockPos((int) x,
																												(int) y, (int) z)))
																														.getBlock() == Blocks.QUARTZ_SLAB) {
																											{
																												BlockPos _bp = new BlockPos((int) x,
																														(int) y, (int) z);
																												BlockState _bs = Blocks.QUARTZ_SLAB
																														.getDefaultState();
																												BlockState _bso = world
																														.getBlockState(_bp);
																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																														.getValues().entrySet()) {
																													Property _property = _bs
																															.getBlock()
																															.getStateContainer()
																															.getProperty(entry
																																	.getKey()
																																	.getName());
																													if (_property != null && _bs
																															.get(_property) != null)
																														try {
																															_bs = _bs.with(_property,
																																	(Comparable) entry
																																			.getValue());
																														} catch (Exception e) {
																														}
																												}
																												world.setBlockState(_bp, _bs, 3);
																											}
																										} else {
																											if ((world.getBlockState(new BlockPos(
																													(int) x, (int) y, (int) z)))
																															.getBlock() == Blocks.PRISMARINE) {
																												{
																													BlockPos _bp = new BlockPos(
																															(int) x, (int) y,
																															(int) z);
																													BlockState _bs = Blocks.PRISMARINE_BRICKS
																															.getDefaultState();
																													BlockState _bso = world
																															.getBlockState(_bp);
																													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																															.getValues().entrySet()) {
																														Property _property = _bs
																																.getBlock()
																																.getStateContainer()
																																.getProperty(entry
																																		.getKey()
																																		.getName());
																														if (_property != null && _bs
																																.get(_property) != null)
																															try {
																																_bs = _bs.with(
																																		_property,
																																		(Comparable) entry
																																				.getValue());
																															} catch (Exception e) {
																															}
																													}
																													world.setBlockState(_bp, _bs, 3);
																												}
																											} else {
																												if ((world.getBlockState(new BlockPos(
																														(int) x, (int) y, (int) z)))
																																.getBlock() == Blocks.PRISMARINE_STAIRS) {
																													{
																														BlockPos _bp = new BlockPos(
																																(int) x, (int) y,
																																(int) z);
																														BlockState _bs = Blocks.PRISMARINE_BRICK_STAIRS
																																.getDefaultState();
																														BlockState _bso = world
																																.getBlockState(_bp);
																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																.getValues()
																																.entrySet()) {
																															Property _property = _bs
																																	.getBlock()
																																	.getStateContainer()
																																	.getProperty(entry
																																			.getKey()
																																			.getName());
																															if (_property != null
																																	&& _bs.get(
																																			_property) != null)
																																try {
																																	_bs = _bs.with(
																																			_property,
																																			(Comparable) entry
																																					.getValue());
																																} catch (Exception e) {
																																}
																														}
																														world.setBlockState(_bp, _bs,
																																3);
																													}
																												} else {
																													if ((world.getBlockState(
																															new BlockPos((int) x,
																																	(int) y,
																																	(int) z)))
																																			.getBlock() == Blocks.PRISMARINE_SLAB) {
																														{
																															BlockPos _bp = new BlockPos(
																																	(int) x, (int) y,
																																	(int) z);
																															BlockState _bs = Blocks.PRISMARINE_BRICK_SLAB
																																	.getDefaultState();
																															BlockState _bso = world
																																	.getBlockState(
																																			_bp);
																															for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																	.getValues()
																																	.entrySet()) {
																																Property _property = _bs
																																		.getBlock()
																																		.getStateContainer()
																																		.getProperty(
																																				entry.getKey()
																																						.getName());
																																if (_property != null
																																		&& _bs.get(
																																				_property) != null)
																																	try {
																																		_bs = _bs
																																				.with(_property,
																																						(Comparable) entry
																																								.getValue());
																																	} catch (Exception e) {
																																	}
																															}
																															world.setBlockState(_bp,
																																	_bs, 3);
																														}
																													} else {
																														if ((world.getBlockState(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z)))
																																				.getBlock() == Blocks.GRANITE_SLAB) {
																															{
																																BlockPos _bp = new BlockPos(
																																		(int) x,
																																		(int) y,
																																		(int) z);
																																BlockState _bs = Blocks.POLISHED_GRANITE_SLAB
																																		.getDefaultState();
																																BlockState _bso = world
																																		.getBlockState(
																																				_bp);
																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																		.getValues()
																																		.entrySet()) {
																																	Property _property = _bs
																																			.getBlock()
																																			.getStateContainer()
																																			.getProperty(
																																					entry.getKey()
																																							.getName());
																																	if (_property != null
																																			&& _bs.get(
																																					_property) != null)
																																		try {
																																			_bs = _bs
																																					.with(_property,
																																							(Comparable) entry
																																									.getValue());
																																		} catch (Exception e) {
																																		}
																																}
																																world.setBlockState(
																																		_bp, _bs, 3);
																															}
																														} else {
																															if ((world.getBlockState(
																																	new BlockPos(
																																			(int) x,
																																			(int) y,
																																			(int) z)))
																																					.getBlock() == Blocks.DIORITE_SLAB) {
																																{
																																	BlockPos _bp = new BlockPos(
																																			(int) x,
																																			(int) y,
																																			(int) z);
																																	BlockState _bs = Blocks.POLISHED_DIORITE_SLAB
																																			.getDefaultState();
																																	BlockState _bso = world
																																			.getBlockState(
																																					_bp);
																																	for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																			.getValues()
																																			.entrySet()) {
																																		Property _property = _bs
																																				.getBlock()
																																				.getStateContainer()
																																				.getProperty(
																																						entry.getKey()
																																								.getName());
																																		if (_property != null
																																				&& _bs.get(
																																						_property) != null)
																																			try {
																																				_bs = _bs
																																						.with(_property,
																																								(Comparable) entry
																																										.getValue());
																																			} catch (Exception e) {
																																			}
																																	}
																																	world.setBlockState(
																																			_bp, _bs,
																																			3);
																																}
																															} else {
																																if ((world
																																		.getBlockState(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z)))
																																								.getBlock() == Blocks.ANDESITE_SLAB) {
																																	{
																																		BlockPos _bp = new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z);
																																		BlockState _bs = Blocks.POLISHED_ANDESITE_SLAB
																																				.getDefaultState();
																																		BlockState _bso = world
																																				.getBlockState(
																																						_bp);
																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																				.getValues()
																																				.entrySet()) {
																																			Property _property = _bs
																																					.getBlock()
																																					.getStateContainer()
																																					.getProperty(
																																							entry.getKey()
																																									.getName());
																																			if (_property != null
																																					&& _bs.get(
																																							_property) != null)
																																				try {
																																					_bs = _bs
																																							.with(_property,
																																									(Comparable) entry
																																											.getValue());
																																				} catch (Exception e) {
																																				}
																																		}
																																		world.setBlockState(
																																				_bp,
																																				_bs,
																																				3);
																																	}
																																} else {
																																	if ((world
																																			.getBlockState(
																																					new BlockPos(
																																							(int) x,
																																							(int) y,
																																							(int) z)))
																																									.getBlock() == Blocks.GRANITE_STAIRS) {
																																		{
																																			BlockPos _bp = new BlockPos(
																																					(int) x,
																																					(int) y,
																																					(int) z);
																																			BlockState _bs = Blocks.POLISHED_GRANITE_STAIRS
																																					.getDefaultState();
																																			BlockState _bso = world
																																					.getBlockState(
																																							_bp);
																																			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																					.getValues()
																																					.entrySet()) {
																																				Property _property = _bs
																																						.getBlock()
																																						.getStateContainer()
																																						.getProperty(
																																								entry.getKey()
																																										.getName());
																																				if (_property != null
																																						&& _bs.get(
																																								_property) != null)
																																					try {
																																						_bs = _bs
																																								.with(_property,
																																										(Comparable) entry
																																												.getValue());
																																					} catch (Exception e) {
																																					}
																																			}
																																			world.setBlockState(
																																					_bp,
																																					_bs,
																																					3);
																																		}
																																	} else {
																																		if ((world
																																				.getBlockState(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z)))
																																										.getBlock() == Blocks.ANDESITE_STAIRS) {
																																			{
																																				BlockPos _bp = new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z);
																																				BlockState _bs = Blocks.POLISHED_ANDESITE_STAIRS
																																						.getDefaultState();
																																				BlockState _bso = world
																																						.getBlockState(
																																								_bp);
																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																						.getValues()
																																						.entrySet()) {
																																					Property _property = _bs
																																							.getBlock()
																																							.getStateContainer()
																																							.getProperty(
																																									entry.getKey()
																																											.getName());
																																					if (_property != null
																																							&& _bs.get(
																																									_property) != null)
																																						try {
																																							_bs = _bs
																																									.with(_property,
																																											(Comparable) entry
																																													.getValue());
																																						} catch (Exception e) {
																																						}
																																				}
																																				world.setBlockState(
																																						_bp,
																																						_bs,
																																						3);
																																			}
																																		} else {
																																			if ((world
																																					.getBlockState(
																																							new BlockPos(
																																									(int) x,
																																									(int) y,
																																									(int) z)))
																																											.getBlock() == Blocks.DIORITE_STAIRS) {
																																				{
																																					BlockPos _bp = new BlockPos(
																																							(int) x,
																																							(int) y,
																																							(int) z);
																																					BlockState _bs = Blocks.POLISHED_DIORITE_STAIRS
																																							.getDefaultState();
																																					BlockState _bso = world
																																							.getBlockState(
																																									_bp);
																																					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																							.getValues()
																																							.entrySet()) {
																																						Property _property = _bs
																																								.getBlock()
																																								.getStateContainer()
																																								.getProperty(
																																										entry.getKey()
																																												.getName());
																																						if (_property != null
																																								&& _bs.get(
																																										_property) != null)
																																							try {
																																								_bs = _bs
																																										.with(_property,
																																												(Comparable) entry
																																														.getValue());
																																							} catch (Exception e) {
																																							}
																																					}
																																					world.setBlockState(
																																							_bp,
																																							_bs,
																																							3);
																																				}
																																			} else {
																																				if ((world
																																						.getBlockState(
																																								new BlockPos(
																																										(int) x,
																																										(int) y,
																																										(int) z)))
																																												.getBlock() == Blocks.RED_NETHER_BRICKS) {
																																					{
																																						BlockPos _bp = new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z);
																																						BlockState _bs = Blocks.NETHER_BRICKS
																																								.getDefaultState();
																																						BlockState _bso = world
																																								.getBlockState(
																																										_bp);
																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																								.getValues()
																																								.entrySet()) {
																																							Property _property = _bs
																																									.getBlock()
																																									.getStateContainer()
																																									.getProperty(
																																											entry.getKey()
																																													.getName());
																																							if (_property != null
																																									&& _bs.get(
																																											_property) != null)
																																								try {
																																									_bs = _bs
																																											.with(_property,
																																													(Comparable) entry
																																															.getValue());
																																								} catch (Exception e) {
																																								}
																																						}
																																						world.setBlockState(
																																								_bp,
																																								_bs,
																																								3);
																																					}
																																				} else {
																																					if ((world
																																							.getBlockState(
																																									new BlockPos(
																																											(int) x,
																																											(int) y,
																																											(int) z)))
																																													.getBlock() == Blocks.RED_NETHER_BRICK_STAIRS) {
																																						{
																																							BlockPos _bp = new BlockPos(
																																									(int) x,
																																									(int) y,
																																									(int) z);
																																							BlockState _bs = Blocks.NETHER_BRICK_STAIRS
																																									.getDefaultState();
																																							BlockState _bso = world
																																									.getBlockState(
																																											_bp);
																																							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																									.getValues()
																																									.entrySet()) {
																																								Property _property = _bs
																																										.getBlock()
																																										.getStateContainer()
																																										.getProperty(
																																												entry.getKey()
																																														.getName());
																																								if (_property != null
																																										&& _bs.get(
																																												_property) != null)
																																									try {
																																										_bs = _bs
																																												.with(_property,
																																														(Comparable) entry
																																																.getValue());
																																									} catch (Exception e) {
																																									}
																																							}
																																							world.setBlockState(
																																									_bp,
																																									_bs,
																																									3);
																																						}
																																					} else {
																																						if ((world
																																								.getBlockState(
																																										new BlockPos(
																																												(int) x,
																																												(int) y,
																																												(int) z)))
																																														.getBlock() == Blocks.RED_NETHER_BRICK_SLAB) {
																																							{
																																								BlockPos _bp = new BlockPos(
																																										(int) x,
																																										(int) y,
																																										(int) z);
																																								BlockState _bs = Blocks.NETHER_BRICK_SLAB
																																										.getDefaultState();
																																								BlockState _bso = world
																																										.getBlockState(
																																												_bp);
																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																										.getValues()
																																										.entrySet()) {
																																									Property _property = _bs
																																											.getBlock()
																																											.getStateContainer()
																																											.getProperty(
																																													entry.getKey()
																																															.getName());
																																									if (_property != null
																																											&& _bs.get(
																																													_property) != null)
																																										try {
																																											_bs = _bs
																																													.with(_property,
																																															(Comparable) entry
																																																	.getValue());
																																										} catch (Exception e) {
																																										}
																																								}
																																								world.setBlockState(
																																										_bp,
																																										_bs,
																																										3);
																																							}
																																						} else {
																																							if ((world
																																									.getBlockState(
																																											new BlockPos(
																																													(int) x,
																																													(int) y,
																																													(int) z)))
																																															.getBlock() == Blocks.RED_NETHER_BRICK_WALL) {
																																								{
																																									BlockPos _bp = new BlockPos(
																																											(int) x,
																																											(int) y,
																																											(int) z);
																																									BlockState _bs = Blocks.NETHER_BRICK_WALL
																																											.getDefaultState();
																																									BlockState _bso = world
																																											.getBlockState(
																																													_bp);
																																									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																											.getValues()
																																											.entrySet()) {
																																										Property _property = _bs
																																												.getBlock()
																																												.getStateContainer()
																																												.getProperty(
																																														entry.getKey()
																																																.getName());
																																										if (_property != null
																																												&& _bs.get(
																																														_property) != null)
																																											try {
																																												_bs = _bs
																																														.with(_property,
																																																(Comparable) entry
																																																		.getValue());
																																											} catch (Exception e) {
																																											}
																																									}
																																									world.setBlockState(
																																											_bp,
																																											_bs,
																																											3);
																																								}
																																							} else {
																																								if ((world
																																										.getBlockState(
																																												new BlockPos(
																																														(int) x,
																																														(int) y,
																																														(int) z)))
																																																.getBlock() == Blocks.RED_NETHER_BRICK_WALL) {
																																									{
																																										BlockPos _bp = new BlockPos(
																																												(int) x,
																																												(int) y,
																																												(int) z);
																																										BlockState _bs = Blocks.NETHER_BRICK_WALL
																																												.getDefaultState();
																																										BlockState _bso = world
																																												.getBlockState(
																																														_bp);
																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																												.getValues()
																																												.entrySet()) {
																																											Property _property = _bs
																																													.getBlock()
																																													.getStateContainer()
																																													.getProperty(
																																															entry.getKey()
																																																	.getName());
																																											if (_property != null
																																													&& _bs.get(
																																															_property) != null)
																																												try {
																																													_bs = _bs
																																															.with(_property,
																																																	(Comparable) entry
																																																			.getValue());
																																												} catch (Exception e) {
																																												}
																																										}
																																										world.setBlockState(
																																												_bp,
																																												_bs,
																																												3);
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
		}
	}
}
