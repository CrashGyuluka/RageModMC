package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ragemod.network.RagemodModVariables;
import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ToxicBlockPlacedProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:toxic_blocks"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASKO) {
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ToxicBlockPlace1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASNETHERRACK) {
					{
						boolean _setval = (boolean) (true);
						entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ToxicBlockPlace2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASENDKO) {
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ToxicBlockPlace3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASFOLD) {
							{
								boolean _setval = (boolean) (true);
								entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ToxicBlockPlace4 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASLOG) {
								{
									boolean _setval = (boolean) (true);
									entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ToxicBlockPlace5 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASPANKS) {
									{
										boolean _setval = (boolean) (true);
										entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.ToxicBlockPlace6 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.SAVASANDESITE) {
										{
											boolean _setval = (boolean) (true);
											entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ToxicBlockPlace7 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
												.getBlock() == RagemodModBlocks.SAVASDIORIT) {
											{
												boolean _setval = (boolean) (true);
												entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ToxicBlockPlace8 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == RagemodModBlocks.SAVASGRANIT) {
												{
													boolean _setval = (boolean) (true);
													entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.ToxicBlockPlace9 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
											} else {
												if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == RagemodModBlocks.SAVASCSONT) {
													{
														boolean _setval = (boolean) (true);
														entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.ToxicBlockPlace10 = _setval;
																	capability.syncPlayerVariables(entity);
																});
													}
												} else {
													if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == RagemodModBlocks.SAVASTEGLA) {
														{
															boolean _setval = (boolean) (true);
															entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.ToxicBlockPlace11 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
													} else {
														if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == RagemodModBlocks.SAVASKOTEGLA) {
															{
																boolean _setval = (boolean) (true);
																entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.ifPresent(capability -> {
																			capability.ToxicBlockPlace12 = _setval;
																			capability.syncPlayerVariables(entity);
																		});
															}
														} else {
															if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == RagemodModBlocks.SAVASNETHERITETORMELEK) {
																{
																	boolean _setval = (boolean) (true);
																	entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.ToxicBlockPlace13 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
															} else {
																if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == RagemodModBlocks.SAVASBAZALT) {
																	{
																		boolean _setval = (boolean) (true);
																		entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.ifPresent(capability -> {
																					capability.ToxicBlockPlace14 = _setval;
																					capability.syncPlayerVariables(entity);
																				});
																	}
																} else {
																	if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																			.getBlock() == RagemodModBlocks.SAVASZUZOTT) {
																		{
																			boolean _setval = (boolean) (true);
																			entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.ToxicBlockPlace15 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																	} else {
																		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																				.getBlock() == RagemodModBlocks.SAVASSODER) {
																			{
																				boolean _setval = (boolean) (true);
																				entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null).ifPresent(capability -> {
																							capability.ToxicBlockPlace16 = _setval;
																							capability.syncPlayerVariables(entity);
																						});
																			}
																		} else {
																			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																					.getBlock() == RagemodModBlocks.SAVASBUZABLOCK) {
																				{
																					boolean _setval = (boolean) (true);
																					entity.getCapability(
																							RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.ifPresent(capability -> {
																								capability.ToxicBlockPlace17 = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																				}
																			} else {
																				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																						.getBlock() == RagemodModBlocks.SAVASBLACKSTONE) {
																					{
																						boolean _setval = (boolean) (true);
																						entity.getCapability(
																								RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.ifPresent(capability -> {
																									capability.ToxicBlockPlace18 = _setval;
																									capability.syncPlayerVariables(entity);
																								});
																					}
																				} else {
																					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																							.getBlock() == RagemodModBlocks.SAVASBLACKKOTEGLA) {
																						{
																							boolean _setval = (boolean) (true);
																							entity.getCapability(
																									RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																									null).ifPresent(capability -> {
																										capability.ToxicBlockPlace19 = _setval;
																										capability.syncPlayerVariables(entity);
																									});
																						}
																					} else {
																						if ((world.getBlockState(
																								new BlockPos((int) x, (int) y, (int) z)))
																										.getBlock() == RagemodModBlocks.SVASKEKGOMBA) {
																							{
																								boolean _setval = (boolean) (true);
																								entity.getCapability(
																										RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null).ifPresent(capability -> {
																											capability.ToxicBlockPlace20 = _setval;
																											capability.syncPlayerVariables(entity);
																										});
																							}
																						} else {
																							if ((world.getBlockState(
																									new BlockPos((int) x, (int) y, (int) z)))
																											.getBlock() == RagemodModBlocks.SAVASPIROSGOMBA) {
																								{
																									boolean _setval = (boolean) (true);
																									entity.getCapability(
																											RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																											null).ifPresent(capability -> {
																												capability.ToxicBlockPlace21 = _setval;
																												capability
																														.syncPlayerVariables(entity);
																											});
																								}
																							} else {
																								if ((world.getBlockState(
																										new BlockPos((int) x, (int) y, (int) z)))
																												.getBlock() == RagemodModBlocks.SAVASSAND) {
																									{
																										boolean _setval = (boolean) (true);
																										entity.getCapability(
																												RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																												null).ifPresent(capability -> {
																													capability.ToxicBlockPlace22 = _setval;
																													capability.syncPlayerVariables(
																															entity);
																												});
																									}
																								} else {
																									if ((world.getBlockState(
																											new BlockPos((int) x, (int) y, (int) z)))
																													.getBlock() == RagemodModBlocks.SAVASREDSAND) {
																										{
																											boolean _setval = (boolean) (true);
																											entity.getCapability(
																													RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																													null).ifPresent(capability -> {
																														capability.ToxicBlockPlace23 = _setval;
																														capability
																																.syncPlayerVariables(
																																		entity);
																													});
																										}
																									} else {
																										if ((world.getBlockState(new BlockPos((int) x,
																												(int) y, (int) z)))
																														.getBlock() == RagemodModBlocks.SAVASHOMOKKO) {
																											{
																												boolean _setval = (boolean) (true);
																												entity.getCapability(
																														RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																														null)
																														.ifPresent(capability -> {
																															capability.ToxicBlockPlace24 = _setval;
																															capability
																																	.syncPlayerVariables(
																																			entity);
																														});
																											}
																										} else {
																											if ((world.getBlockState(new BlockPos(
																													(int) x, (int) y, (int) z)))
																															.getBlock() == RagemodModBlocks.SAVASHOMOKKOPIROS) {
																												{
																													boolean _setval = (boolean) (true);
																													entity.getCapability(
																															RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																															null)
																															.ifPresent(capability -> {
																																capability.ToxicBlockPlace25 = _setval;
																																capability
																																		.syncPlayerVariables(
																																				entity);
																															});
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
		if ((entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace1 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace2 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace3 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace4 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace5 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace6 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace7 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace8 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace9 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace10 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace11 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace12 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace13 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace14 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace15 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace16 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace17 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace18 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace19 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace20 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace21 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace22 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace23 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace24 == true
				&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new RagemodModVariables.PlayerVariables())).ToxicBlockPlace25 == true) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ragemod:adv_37"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
