package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModItems;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class Amsavcsakanyproc2Procedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
				&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SMOOTH_STONE) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Blocks.STONE_BRICKS.defaultBlockState();
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
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
					&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.POLISHED_BLACKSTONE) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState();
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
			} else {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == RagemodModItems.MEGASAVCSAKAKNY
						&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = Blocks.END_STONE_BRICKS.defaultBlockState();
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
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
							.getItem() == RagemodModItems.MEGASAVCSAKAKNY
							&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SANDSTONE) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.SMOOTH_SANDSTONE.defaultBlockState();
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
					} else {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
								.getItem() == RagemodModItems.MEGASAVCSAKAKNY
								&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.RED_SANDSTONE) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE.defaultBlockState();
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
						} else {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
									.getItem() == RagemodModItems.MEGASAVCSAKAKNY
									&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CHISELED_SANDSTONE) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.SMOOTH_SANDSTONE.defaultBlockState();
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
							} else {
								if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
										.getItem() == RagemodModItems.MEGASAVCSAKAKNY
										&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CUT_SANDSTONE) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.SMOOTH_SANDSTONE.defaultBlockState();
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
								} else {
									if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
											.getItem() == RagemodModItems.MEGASAVCSAKAKNY
											&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.SANDSTONE_STAIRS) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.SMOOTH_SANDSTONE_STAIRS.defaultBlockState();
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
									} else {
										if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
												.getItem() == RagemodModItems.MEGASAVCSAKAKNY
												&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == Blocks.CUT_SANDSTONE_SLAB) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState();
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
										} else {
											if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
													.getItem() == RagemodModItems.MEGASAVCSAKAKNY
													&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == Blocks.SANDSTONE_SLAB) {
												{
													BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
													BlockState _bs = Blocks.CUT_SANDSTONE_SLAB.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition()
																.getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											} else {
												if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
														.getItem() == RagemodModItems.MEGASAVCSAKAKNY
														&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == Blocks.CHISELED_RED_SANDSTONE) {
													{
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE.defaultBlockState();
														BlockState _bso = world.getBlockState(_bp);
														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
															Property _property = _bs.getBlock().getStateDefinition()
																	.getProperty(entry.getKey().getName());
															if (_property != null && _bs.getValue(_property) != null)
																try {
																	_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																} catch (Exception e) {
																}
														}
														world.setBlock(_bp, _bs, 3);
													}
												} else {
													if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
															.getItem() == RagemodModItems.MEGASAVCSAKAKNY
															&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == Blocks.CUT_RED_SANDSTONE) {
														{
															BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
															BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE.defaultBlockState();
															BlockState _bso = world.getBlockState(_bp);
															for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																Property _property = _bs.getBlock().getStateDefinition()
																		.getProperty(entry.getKey().getName());
																if (_property != null && _bs.getValue(_property) != null)
																	try {
																		_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																	} catch (Exception e) {
																	}
															}
															world.setBlock(_bp, _bs, 3);
														}
													} else {
														if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == Blocks.RED_SANDSTONE_STAIRS) {
															{
																BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE_STAIRS.defaultBlockState();
																BlockState _bso = world.getBlockState(_bp);
																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																	Property _property = _bs.getBlock().getStateDefinition()
																			.getProperty(entry.getKey().getName());
																	if (_property != null && _bs.getValue(_property) != null)
																		try {
																			_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																		} catch (Exception e) {
																		}
																}
																world.setBlock(_bp, _bs, 3);
															}
														} else {
															if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
																	.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																	&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																			.getBlock() == Blocks.CUT_RED_SANDSTONE_SLAB) {
																{
																	BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																	BlockState _bs = Blocks.SMOOTH_RED_SANDSTONE_SLAB.defaultBlockState();
																	BlockState _bso = world.getBlockState(_bp);
																	for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
																		Property _property = _bs.getBlock().getStateDefinition()
																				.getProperty(entry.getKey().getName());
																		if (_property != null && _bs.getValue(_property) != null)
																			try {
																				_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																			} catch (Exception e) {
																			}
																	}
																	world.setBlock(_bp, _bs, 3);
																}
															} else {
																if ((entity instanceof LivingEntity _livEnt
																		? _livEnt.getMainHandItem()
																		: ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
																		&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																				.getBlock() == Blocks.RED_SANDSTONE_SLAB) {
																	{
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		BlockState _bs = Blocks.CUT_RED_SANDSTONE_SLAB.defaultBlockState();
																		BlockState _bso = world.getBlockState(_bp);
																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																				.entrySet()) {
																			Property _property = _bs.getBlock().getStateDefinition()
																					.getProperty(entry.getKey().getName());
																			if (_property != null && _bs.getValue(_property) != null)
																				try {
																					_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																				} catch (Exception e) {
																				}
																		}
																		world.setBlock(_bp, _bs, 3);
																	}
																} else {
																	if ((entity instanceof LivingEntity _livEnt
																			? _livEnt.getMainHandItem()
																			: ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
																			&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																					.getBlock() == Blocks.MOSSY_COBBLESTONE) {
																		{
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			BlockState _bs = Blocks.COBBLESTONE.defaultBlockState();
																			BlockState _bso = world.getBlockState(_bp);
																			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																					.entrySet()) {
																				Property _property = _bs.getBlock().getStateDefinition()
																						.getProperty(entry.getKey().getName());
																				if (_property != null && _bs.getValue(_property) != null)
																					try {
																						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
																					} catch (Exception e) {
																					}
																			}
																			world.setBlock(_bp, _bs, 3);
																		}
																	} else {
																		if ((entity instanceof LivingEntity _livEnt
																				? _livEnt.getMainHandItem()
																				: ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
																				&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																						.getBlock() == Blocks.MOSSY_COBBLESTONE_STAIRS) {
																			{
																				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																				BlockState _bs = Blocks.COBBLESTONE_STAIRS.defaultBlockState();
																				BlockState _bso = world.getBlockState(_bp);
																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues()
																						.entrySet()) {
																					Property _property = _bs.getBlock().getStateDefinition()
																							.getProperty(entry.getKey().getName());
																					if (_property != null && _bs.getValue(_property) != null)
																						try {
																							_bs = _bs.setValue(_property,
																									(Comparable) entry.getValue());
																						} catch (Exception e) {
																						}
																				}
																				world.setBlock(_bp, _bs, 3);
																			}
																		} else {
																			if ((entity instanceof LivingEntity _livEnt
																					? _livEnt.getMainHandItem()
																					: ItemStack.EMPTY).getItem() == RagemodModItems.MEGASAVCSAKAKNY
																					&& (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																							.getBlock() == Blocks.MOSSY_COBBLESTONE_SLAB) {
																				{
																					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																					BlockState _bs = Blocks.COBBLESTONE_SLAB.defaultBlockState();
																					BlockState _bso = world.getBlockState(_bp);
																					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																							.getValues().entrySet()) {
																						Property _property = _bs.getBlock().getStateDefinition()
																								.getProperty(entry.getKey().getName());
																						if (_property != null && _bs.getValue(_property) != null)
																							try {
																								_bs = _bs.setValue(_property,
																										(Comparable) entry.getValue());
																							} catch (Exception e) {
																							}
																					}
																					world.setBlock(_bp, _bs, 3);
																				}
																			} else {
																				if ((entity instanceof LivingEntity _livEnt
																						? _livEnt.getMainHandItem()
																						: ItemStack.EMPTY)
																								.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																						&& (world.getBlockState(
																								new BlockPos((int) x, (int) y, (int) z)))
																										.getBlock() == Blocks.MOSSY_COBBLESTONE_WALL) {
																					{
																						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																						BlockState _bs = Blocks.COBBLESTONE_WALL.defaultBlockState();
																						BlockState _bso = world.getBlockState(_bp);
																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																								.getValues().entrySet()) {
																							Property _property = _bs.getBlock().getStateDefinition()
																									.getProperty(entry.getKey().getName());
																							if (_property != null && _bs.getValue(_property) != null)
																								try {
																									_bs = _bs.setValue(_property,
																											(Comparable) entry.getValue());
																								} catch (Exception e) {
																								}
																						}
																						world.setBlock(_bp, _bs, 3);
																					}
																				} else {
																					if ((entity instanceof LivingEntity _livEnt
																							? _livEnt.getMainHandItem()
																							: ItemStack.EMPTY)
																									.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																							&& (world.getBlockState(
																									new BlockPos((int) x, (int) y, (int) z)))
																											.getBlock() == Blocks.CRACKED_STONE_BRICKS) {
																						{
																							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																							BlockState _bs = Blocks.STONE_BRICKS.defaultBlockState();
																							BlockState _bso = world.getBlockState(_bp);
																							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																									.getValues().entrySet()) {
																								Property _property = _bs.getBlock()
																										.getStateDefinition()
																										.getProperty(entry.getKey().getName());
																								if (_property != null
																										&& _bs.getValue(_property) != null)
																									try {
																										_bs = _bs.setValue(_property,
																												(Comparable) entry.getValue());
																									} catch (Exception e) {
																									}
																							}
																							world.setBlock(_bp, _bs, 3);
																						}
																					} else {
																						if ((entity instanceof LivingEntity _livEnt
																								? _livEnt.getMainHandItem()
																								: ItemStack.EMPTY)
																										.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																								&& (world.getBlockState(
																										new BlockPos((int) x, (int) y, (int) z)))
																												.getBlock() == Blocks.MOSSY_STONE_BRICKS) {
																							{
																								BlockPos _bp = new BlockPos((int) x, (int) y,
																										(int) z);
																								BlockState _bs = Blocks.STONE_BRICKS
																										.defaultBlockState();
																								BlockState _bso = world.getBlockState(_bp);
																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																										.getValues().entrySet()) {
																									Property _property = _bs.getBlock()
																											.getStateDefinition()
																											.getProperty(entry.getKey().getName());
																									if (_property != null
																											&& _bs.getValue(_property) != null)
																										try {
																											_bs = _bs.setValue(_property,
																													(Comparable) entry.getValue());
																										} catch (Exception e) {
																										}
																								}
																								world.setBlock(_bp, _bs, 3);
																							}
																						} else {
																							if ((entity instanceof LivingEntity _livEnt
																									? _livEnt.getMainHandItem()
																									: ItemStack.EMPTY)
																											.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																									&& (world.getBlockState(
																											new BlockPos((int) x, (int) y, (int) z)))
																													.getBlock() == Blocks.NETHER_BRICKS) {
																								{
																									BlockPos _bp = new BlockPos((int) x, (int) y,
																											(int) z);
																									BlockState _bs = Blocks.CHISELED_NETHER_BRICKS
																											.defaultBlockState();
																									BlockState _bso = world.getBlockState(_bp);
																									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																											.getValues().entrySet()) {
																										Property _property = _bs.getBlock()
																												.getStateDefinition().getProperty(
																														entry.getKey().getName());
																										if (_property != null
																												&& _bs.getValue(_property) != null)
																											try {
																												_bs = _bs.setValue(_property,
																														(Comparable) entry
																																.getValue());
																											} catch (Exception e) {
																											}
																									}
																									world.setBlock(_bp, _bs, 3);
																								}
																							} else {
																								if ((entity instanceof LivingEntity _livEnt
																										? _livEnt.getMainHandItem()
																										: ItemStack.EMPTY)
																												.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																										&& (world.getBlockState(new BlockPos((int) x,
																												(int) y, (int) z)))
																														.getBlock() == Blocks.NETHERRACK) {
																									{
																										BlockPos _bp = new BlockPos((int) x, (int) y,
																												(int) z);
																										BlockState _bs = Blocks.NETHER_BRICKS
																												.defaultBlockState();
																										BlockState _bso = world.getBlockState(_bp);
																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																												.getValues().entrySet()) {
																											Property _property = _bs.getBlock()
																													.getStateDefinition().getProperty(
																															entry.getKey().getName());
																											if (_property != null && _bs
																													.getValue(_property) != null)
																												try {
																													_bs = _bs.setValue(_property,
																															(Comparable) entry
																																	.getValue());
																												} catch (Exception e) {
																												}
																										}
																										world.setBlock(_bp, _bs, 3);
																									}
																								} else {
																									if ((entity instanceof LivingEntity _livEnt
																											? _livEnt.getMainHandItem()
																											: ItemStack.EMPTY)
																													.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																											&& (world.getBlockState(new BlockPos(
																													(int) x, (int) y, (int) z)))
																															.getBlock() == Blocks.CRACKED_NETHER_BRICKS) {
																										{
																											BlockPos _bp = new BlockPos((int) x,
																													(int) y, (int) z);
																											BlockState _bs = Blocks.NETHER_BRICKS
																													.defaultBlockState();
																											BlockState _bso = world
																													.getBlockState(_bp);
																											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																													.getValues().entrySet()) {
																												Property _property = _bs.getBlock()
																														.getStateDefinition()
																														.getProperty(entry.getKey()
																																.getName());
																												if (_property != null && _bs
																														.getValue(_property) != null)
																													try {
																														_bs = _bs.setValue(_property,
																																(Comparable) entry
																																		.getValue());
																													} catch (Exception e) {
																													}
																											}
																											world.setBlock(_bp, _bs, 3);
																										}
																									} else {
																										if ((entity instanceof LivingEntity _livEnt
																												? _livEnt.getMainHandItem()
																												: ItemStack.EMPTY)
																														.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																												&& (world.getBlockState(new BlockPos(
																														(int) x, (int) y, (int) z)))
																																.getBlock() == Blocks.BASALT) {
																											{
																												BlockPos _bp = new BlockPos((int) x,
																														(int) y, (int) z);
																												BlockState _bs = Blocks.POLISHED_BASALT
																														.defaultBlockState();
																												BlockState _bso = world
																														.getBlockState(_bp);
																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																														.getValues().entrySet()) {
																													Property _property = _bs
																															.getBlock()
																															.getStateDefinition()
																															.getProperty(entry
																																	.getKey()
																																	.getName());
																													if (_property != null
																															&& _bs.getValue(
																																	_property) != null)
																														try {
																															_bs = _bs.setValue(
																																	_property,
																																	(Comparable) entry
																																			.getValue());
																														} catch (Exception e) {
																														}
																												}
																												world.setBlock(_bp, _bs, 3);
																											}
																										} else {
																											if ((entity instanceof LivingEntity _livEnt
																													? _livEnt.getMainHandItem()
																													: ItemStack.EMPTY)
																															.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																													&& (world.getBlockState(
																															new BlockPos((int) x,
																																	(int) y,
																																	(int) z)))
																																			.getBlock() == Blocks.SMOOTH_STONE_SLAB) {
																												{
																													BlockPos _bp = new BlockPos(
																															(int) x, (int) y,
																															(int) z);
																													BlockState _bs = Blocks.STONE_BRICK_SLAB
																															.defaultBlockState();
																													BlockState _bso = world
																															.getBlockState(_bp);
																													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																															.getValues().entrySet()) {
																														Property _property = _bs
																																.getBlock()
																																.getStateDefinition()
																																.getProperty(entry
																																		.getKey()
																																		.getName());
																														if (_property != null
																																&& _bs.getValue(
																																		_property) != null)
																															try {
																																_bs = _bs.setValue(
																																		_property,
																																		(Comparable) entry
																																				.getValue());
																															} catch (Exception e) {
																															}
																													}
																													world.setBlock(_bp, _bs, 3);
																												}
																											} else {
																												if ((entity instanceof LivingEntity _livEnt
																														? _livEnt.getMainHandItem()
																														: ItemStack.EMPTY)
																																.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																														&& (world.getBlockState(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z)))
																																				.getBlock() == Blocks.STONE_SLAB) {
																													{
																														BlockPos _bp = new BlockPos(
																																(int) x, (int) y,
																																(int) z);
																														BlockState _bs = Blocks.SMOOTH_STONE_SLAB
																																.defaultBlockState();
																														BlockState _bso = world
																																.getBlockState(_bp);
																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																.getValues()
																																.entrySet()) {
																															Property _property = _bs
																																	.getBlock()
																																	.getStateDefinition()
																																	.getProperty(entry
																																			.getKey()
																																			.getName());
																															if (_property != null
																																	&& _bs.getValue(
																																			_property) != null)
																																try {
																																	_bs = _bs
																																			.setValue(
																																					_property,
																																					(Comparable) entry
																																							.getValue());
																																} catch (Exception e) {
																																}
																														}
																														world.setBlock(_bp, _bs, 3);
																													}
																												} else {
																													if ((entity instanceof LivingEntity _livEnt
																															? _livEnt
																																	.getMainHandItem()
																															: ItemStack.EMPTY)
																																	.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																															&& (world.getBlockState(
																																	new BlockPos(
																																			(int) x,
																																			(int) y,
																																			(int) z)))
																																					.getBlock() == Blocks.COBBLESTONE_SLAB) {
																														{
																															BlockPos _bp = new BlockPos(
																																	(int) x, (int) y,
																																	(int) z);
																															BlockState _bs = Blocks.STONE_SLAB
																																	.defaultBlockState();
																															BlockState _bso = world
																																	.getBlockState(
																																			_bp);
																															for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																	.getValues()
																																	.entrySet()) {
																																Property _property = _bs
																																		.getBlock()
																																		.getStateDefinition()
																																		.getProperty(
																																				entry.getKey()
																																						.getName());
																																if (_property != null
																																		&& _bs.getValue(
																																				_property) != null)
																																	try {
																																		_bs = _bs
																																				.setValue(
																																						_property,
																																						(Comparable) entry
																																								.getValue());
																																	} catch (Exception e) {
																																	}
																															}
																															world.setBlock(_bp, _bs,
																																	3);
																														}
																													} else {
																														if ((entity instanceof LivingEntity _livEnt
																																? _livEnt
																																		.getMainHandItem()
																																: ItemStack.EMPTY)
																																		.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																&& (world
																																		.getBlockState(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z)))
																																								.getBlock() == Blocks.QUARTZ_SLAB) {
																															{
																																BlockPos _bp = new BlockPos(
																																		(int) x,
																																		(int) y,
																																		(int) z);
																																BlockState _bs = Blocks.QUARTZ_SLAB
																																		.defaultBlockState();
																																BlockState _bso = world
																																		.getBlockState(
																																				_bp);
																																for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																		.getValues()
																																		.entrySet()) {
																																	Property _property = _bs
																																			.getBlock()
																																			.getStateDefinition()
																																			.getProperty(
																																					entry.getKey()
																																							.getName());
																																	if (_property != null
																																			&& _bs.getValue(
																																					_property) != null)
																																		try {
																																			_bs = _bs
																																					.setValue(
																																							_property,
																																							(Comparable) entry
																																									.getValue());
																																		} catch (Exception e) {
																																		}
																																}
																																world.setBlock(_bp,
																																		_bs, 3);
																															}
																														} else {
																															if ((entity instanceof LivingEntity _livEnt
																																	? _livEnt
																																			.getMainHandItem()
																																	: ItemStack.EMPTY)
																																			.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																	&& (world
																																			.getBlockState(
																																					new BlockPos(
																																							(int) x,
																																							(int) y,
																																							(int) z)))
																																									.getBlock() == Blocks.PRISMARINE) {
																																{
																																	BlockPos _bp = new BlockPos(
																																			(int) x,
																																			(int) y,
																																			(int) z);
																																	BlockState _bs = Blocks.PRISMARINE_BRICKS
																																			.defaultBlockState();
																																	BlockState _bso = world
																																			.getBlockState(
																																					_bp);
																																	for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																			.getValues()
																																			.entrySet()) {
																																		Property _property = _bs
																																				.getBlock()
																																				.getStateDefinition()
																																				.getProperty(
																																						entry.getKey()
																																								.getName());
																																		if (_property != null
																																				&& _bs.getValue(
																																						_property) != null)
																																			try {
																																				_bs = _bs
																																						.setValue(
																																								_property,
																																								(Comparable) entry
																																										.getValue());
																																			} catch (Exception e) {
																																			}
																																	}
																																	world.setBlock(
																																			_bp, _bs,
																																			3);
																																}
																															} else {
																																if ((entity instanceof LivingEntity _livEnt
																																		? _livEnt
																																				.getMainHandItem()
																																		: ItemStack.EMPTY)
																																				.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																		&& (world
																																				.getBlockState(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z)))
																																										.getBlock() == Blocks.PRISMARINE_STAIRS) {
																																	{
																																		BlockPos _bp = new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z);
																																		BlockState _bs = Blocks.PRISMARINE_BRICK_STAIRS
																																				.defaultBlockState();
																																		BlockState _bso = world
																																				.getBlockState(
																																						_bp);
																																		for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																				.getValues()
																																				.entrySet()) {
																																			Property _property = _bs
																																					.getBlock()
																																					.getStateDefinition()
																																					.getProperty(
																																							entry.getKey()
																																									.getName());
																																			if (_property != null
																																					&& _bs.getValue(
																																							_property) != null)
																																				try {
																																					_bs = _bs
																																							.setValue(
																																									_property,
																																									(Comparable) entry
																																											.getValue());
																																				} catch (Exception e) {
																																				}
																																		}
																																		world.setBlock(
																																				_bp,
																																				_bs,
																																				3);
																																	}
																																} else {
																																	if ((entity instanceof LivingEntity _livEnt
																																			? _livEnt
																																					.getMainHandItem()
																																			: ItemStack.EMPTY)
																																					.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																			&& (world
																																					.getBlockState(
																																							new BlockPos(
																																									(int) x,
																																									(int) y,
																																									(int) z)))
																																											.getBlock() == Blocks.PRISMARINE_SLAB) {
																																		{
																																			BlockPos _bp = new BlockPos(
																																					(int) x,
																																					(int) y,
																																					(int) z);
																																			BlockState _bs = Blocks.PRISMARINE_BRICK_SLAB
																																					.defaultBlockState();
																																			BlockState _bso = world
																																					.getBlockState(
																																							_bp);
																																			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																					.getValues()
																																					.entrySet()) {
																																				Property _property = _bs
																																						.getBlock()
																																						.getStateDefinition()
																																						.getProperty(
																																								entry.getKey()
																																										.getName());
																																				if (_property != null
																																						&& _bs.getValue(
																																								_property) != null)
																																					try {
																																						_bs = _bs
																																								.setValue(
																																										_property,
																																										(Comparable) entry
																																												.getValue());
																																					} catch (Exception e) {
																																					}
																																			}
																																			world.setBlock(
																																					_bp,
																																					_bs,
																																					3);
																																		}
																																	} else {
																																		if ((entity instanceof LivingEntity _livEnt
																																				? _livEnt
																																						.getMainHandItem()
																																				: ItemStack.EMPTY)
																																						.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																				&& (world
																																						.getBlockState(
																																								new BlockPos(
																																										(int) x,
																																										(int) y,
																																										(int) z)))
																																												.getBlock() == Blocks.GRANITE_SLAB) {
																																			{
																																				BlockPos _bp = new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z);
																																				BlockState _bs = Blocks.POLISHED_GRANITE_SLAB
																																						.defaultBlockState();
																																				BlockState _bso = world
																																						.getBlockState(
																																								_bp);
																																				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																						.getValues()
																																						.entrySet()) {
																																					Property _property = _bs
																																							.getBlock()
																																							.getStateDefinition()
																																							.getProperty(
																																									entry.getKey()
																																											.getName());
																																					if (_property != null
																																							&& _bs.getValue(
																																									_property) != null)
																																						try {
																																							_bs = _bs
																																									.setValue(
																																											_property,
																																											(Comparable) entry
																																													.getValue());
																																						} catch (Exception e) {
																																						}
																																				}
																																				world.setBlock(
																																						_bp,
																																						_bs,
																																						3);
																																			}
																																		} else {
																																			if ((entity instanceof LivingEntity _livEnt
																																					? _livEnt
																																							.getMainHandItem()
																																					: ItemStack.EMPTY)
																																							.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																					&& (world
																																							.getBlockState(
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
																																							.defaultBlockState();
																																					BlockState _bso = world
																																							.getBlockState(
																																									_bp);
																																					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																							.getValues()
																																							.entrySet()) {
																																						Property _property = _bs
																																								.getBlock()
																																								.getStateDefinition()
																																								.getProperty(
																																										entry.getKey()
																																												.getName());
																																						if (_property != null
																																								&& _bs.getValue(
																																										_property) != null)
																																							try {
																																								_bs = _bs
																																										.setValue(
																																												_property,
																																												(Comparable) entry
																																														.getValue());
																																							} catch (Exception e) {
																																							}
																																					}
																																					world.setBlock(
																																							_bp,
																																							_bs,
																																							3);
																																				}
																																			} else {
																																				if ((entity instanceof LivingEntity _livEnt
																																						? _livEnt
																																								.getMainHandItem()
																																						: ItemStack.EMPTY)
																																								.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																						&& (world
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
																																								.defaultBlockState();
																																						BlockState _bso = world
																																								.getBlockState(
																																										_bp);
																																						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																								.getValues()
																																								.entrySet()) {
																																							Property _property = _bs
																																									.getBlock()
																																									.getStateDefinition()
																																									.getProperty(
																																											entry.getKey()
																																													.getName());
																																							if (_property != null
																																									&& _bs.getValue(
																																											_property) != null)
																																								try {
																																									_bs = _bs
																																											.setValue(
																																													_property,
																																													(Comparable) entry
																																															.getValue());
																																								} catch (Exception e) {
																																								}
																																						}
																																						world.setBlock(
																																								_bp,
																																								_bs,
																																								3);
																																					}
																																				} else {
																																					if ((entity instanceof LivingEntity _livEnt
																																							? _livEnt
																																									.getMainHandItem()
																																							: ItemStack.EMPTY)
																																									.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																							&& (world
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
																																									.defaultBlockState();
																																							BlockState _bso = world
																																									.getBlockState(
																																											_bp);
																																							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																									.getValues()
																																									.entrySet()) {
																																								Property _property = _bs
																																										.getBlock()
																																										.getStateDefinition()
																																										.getProperty(
																																												entry.getKey()
																																														.getName());
																																								if (_property != null
																																										&& _bs.getValue(
																																												_property) != null)
																																									try {
																																										_bs = _bs
																																												.setValue(
																																														_property,
																																														(Comparable) entry
																																																.getValue());
																																									} catch (Exception e) {
																																									}
																																							}
																																							world.setBlock(
																																									_bp,
																																									_bs,
																																									3);
																																						}
																																					} else {
																																						if ((entity instanceof LivingEntity _livEnt
																																								? _livEnt
																																										.getMainHandItem()
																																								: ItemStack.EMPTY)
																																										.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																								&& (world
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
																																										.defaultBlockState();
																																								BlockState _bso = world
																																										.getBlockState(
																																												_bp);
																																								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																										.getValues()
																																										.entrySet()) {
																																									Property _property = _bs
																																											.getBlock()
																																											.getStateDefinition()
																																											.getProperty(
																																													entry.getKey()
																																															.getName());
																																									if (_property != null
																																											&& _bs.getValue(
																																													_property) != null)
																																										try {
																																											_bs = _bs
																																													.setValue(
																																															_property,
																																															(Comparable) entry
																																																	.getValue());
																																										} catch (Exception e) {
																																										}
																																								}
																																								world.setBlock(
																																										_bp,
																																										_bs,
																																										3);
																																							}
																																						} else {
																																							if ((entity instanceof LivingEntity _livEnt
																																									? _livEnt
																																											.getMainHandItem()
																																									: ItemStack.EMPTY)
																																											.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																									&& (world
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
																																											.defaultBlockState();
																																									BlockState _bso = world
																																											.getBlockState(
																																													_bp);
																																									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																											.getValues()
																																											.entrySet()) {
																																										Property _property = _bs
																																												.getBlock()
																																												.getStateDefinition()
																																												.getProperty(
																																														entry.getKey()
																																																.getName());
																																										if (_property != null
																																												&& _bs.getValue(
																																														_property) != null)
																																											try {
																																												_bs = _bs
																																														.setValue(
																																																_property,
																																																(Comparable) entry
																																																		.getValue());
																																											} catch (Exception e) {
																																											}
																																									}
																																									world.setBlock(
																																											_bp,
																																											_bs,
																																											3);
																																								}
																																							} else {
																																								if ((entity instanceof LivingEntity _livEnt
																																										? _livEnt
																																												.getMainHandItem()
																																										: ItemStack.EMPTY)
																																												.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																										&& (world
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
																																												.defaultBlockState();
																																										BlockState _bso = world
																																												.getBlockState(
																																														_bp);
																																										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																												.getValues()
																																												.entrySet()) {
																																											Property _property = _bs
																																													.getBlock()
																																													.getStateDefinition()
																																													.getProperty(
																																															entry.getKey()
																																																	.getName());
																																											if (_property != null
																																													&& _bs.getValue(
																																															_property) != null)
																																												try {
																																													_bs = _bs
																																															.setValue(
																																																	_property,
																																																	(Comparable) entry
																																																			.getValue());
																																												} catch (Exception e) {
																																												}
																																										}
																																										world.setBlock(
																																												_bp,
																																												_bs,
																																												3);
																																									}
																																								} else {
																																									if ((entity instanceof LivingEntity _livEnt
																																											? _livEnt
																																													.getMainHandItem()
																																											: ItemStack.EMPTY)
																																													.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																											&& (world
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
																																													.defaultBlockState();
																																											BlockState _bso = world
																																													.getBlockState(
																																															_bp);
																																											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																													.getValues()
																																													.entrySet()) {
																																												Property _property = _bs
																																														.getBlock()
																																														.getStateDefinition()
																																														.getProperty(
																																																entry.getKey()
																																																		.getName());
																																												if (_property != null
																																														&& _bs.getValue(
																																																_property) != null)
																																													try {
																																														_bs = _bs
																																																.setValue(
																																																		_property,
																																																		(Comparable) entry
																																																				.getValue());
																																													} catch (Exception e) {
																																													}
																																											}
																																											world.setBlock(
																																													_bp,
																																													_bs,
																																													3);
																																										}
																																									} else {
																																										if ((entity instanceof LivingEntity _livEnt
																																												? _livEnt
																																														.getMainHandItem()
																																												: ItemStack.EMPTY)
																																														.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																												&& (world
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
																																														.defaultBlockState();
																																												BlockState _bso = world
																																														.getBlockState(
																																																_bp);
																																												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																														.getValues()
																																														.entrySet()) {
																																													Property _property = _bs
																																															.getBlock()
																																															.getStateDefinition()
																																															.getProperty(
																																																	entry.getKey()
																																																			.getName());
																																													if (_property != null
																																															&& _bs.getValue(
																																																	_property) != null)
																																														try {
																																															_bs = _bs
																																																	.setValue(
																																																			_property,
																																																			(Comparable) entry
																																																					.getValue());
																																														} catch (Exception e) {
																																														}
																																												}
																																												world.setBlock(
																																														_bp,
																																														_bs,
																																														3);
																																											}
																																										} else {
																																											if ((entity instanceof LivingEntity _livEnt
																																													? _livEnt
																																															.getMainHandItem()
																																													: ItemStack.EMPTY)
																																															.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																													&& (world
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
																																															.defaultBlockState();
																																													BlockState _bso = world
																																															.getBlockState(
																																																	_bp);
																																													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																															.getValues()
																																															.entrySet()) {
																																														Property _property = _bs
																																																.getBlock()
																																																.getStateDefinition()
																																																.getProperty(
																																																		entry.getKey()
																																																				.getName());
																																														if (_property != null
																																																&& _bs.getValue(
																																																		_property) != null)
																																															try {
																																																_bs = _bs
																																																		.setValue(
																																																				_property,
																																																				(Comparable) entry
																																																						.getValue());
																																															} catch (Exception e) {
																																															}
																																													}
																																													world.setBlock(
																																															_bp,
																																															_bs,
																																															3);
																																												}
																																											} else {
																																												if ((entity instanceof LivingEntity _livEnt
																																														? _livEnt
																																																.getMainHandItem()
																																														: ItemStack.EMPTY)
																																																.getItem() == RagemodModItems.MEGASAVCSAKAKNY
																																														&& (world
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
																																																.defaultBlockState();
																																														BlockState _bso = world
																																																.getBlockState(
																																																		_bp);
																																														for (Map.Entry<Property<?>, Comparable<?>> entry : _bso
																																																.getValues()
																																																.entrySet()) {
																																															Property _property = _bs
																																																	.getBlock()
																																																	.getStateDefinition()
																																																	.getProperty(
																																																			entry.getKey()
																																																					.getName());
																																															if (_property != null
																																																	&& _bs.getValue(
																																																			_property) != null)
																																																try {
																																																	_bs = _bs
																																																			.setValue(
																																																					_property,
																																																					(Comparable) entry
																																																							.getValue());
																																																} catch (Exception e) {
																																																}
																																														}
																																														world.setBlock(
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
			}
		}
	}
}
