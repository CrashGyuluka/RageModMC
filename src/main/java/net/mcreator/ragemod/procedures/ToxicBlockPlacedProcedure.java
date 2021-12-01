package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ragemod.block.SvaskekgombaBlock;
import net.mcreator.ragemod.block.SavaszuzottBlock;
import net.mcreator.ragemod.block.SavasteglaBlock;
import net.mcreator.ragemod.block.SavassoderBlock;
import net.mcreator.ragemod.block.SavassandBlock;
import net.mcreator.ragemod.block.SavasredsandBlock;
import net.mcreator.ragemod.block.SavaspirosgombaBlock;
import net.mcreator.ragemod.block.SavaspanksBlock;
import net.mcreator.ragemod.block.SavasnetherrackBlock;
import net.mcreator.ragemod.block.SavasnetheritetormelekBlock;
import net.mcreator.ragemod.block.SavaslogBlock;
import net.mcreator.ragemod.block.SavaskoteglaBlock;
import net.mcreator.ragemod.block.SavaskoBlock;
import net.mcreator.ragemod.block.SavashomokkopirosBlock;
import net.mcreator.ragemod.block.SavashomokkoBlock;
import net.mcreator.ragemod.block.SavasgranitBlock;
import net.mcreator.ragemod.block.SavasfoldBlock;
import net.mcreator.ragemod.block.SavasendkoBlock;
import net.mcreator.ragemod.block.SavasdioritBlock;
import net.mcreator.ragemod.block.SavascsontBlock;
import net.mcreator.ragemod.block.SavasbuzablockBlock;
import net.mcreator.ragemod.block.SavasblackstoneBlock;
import net.mcreator.ragemod.block.SavasblackkoteglaBlock;
import net.mcreator.ragemod.block.SavasbazaltBlock;
import net.mcreator.ragemod.block.SavasandesiteBlock;
import net.mcreator.ragemod.RagemodModVariables;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class ToxicBlockPlacedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
			Entity entity = event.getEntity();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("placedagainst", event.getPlacedAgainst());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure ToxicBlockPlaced!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure ToxicBlockPlaced!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure ToxicBlockPlaced!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure ToxicBlockPlaced!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure ToxicBlockPlaced!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:toxic_blocks"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavaskoBlock.block) {
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ToxicBlockPlace1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasnetherrackBlock.block) {
					{
						boolean _setval = (boolean) (true);
						entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ToxicBlockPlace2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasendkoBlock.block) {
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ToxicBlockPlace3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasfoldBlock.block) {
							{
								boolean _setval = (boolean) (true);
								entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ToxicBlockPlace4 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavaslogBlock.block) {
								{
									boolean _setval = (boolean) (true);
									entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ToxicBlockPlace5 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavaspanksBlock.block) {
									{
										boolean _setval = (boolean) (true);
										entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.ToxicBlockPlace6 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasandesiteBlock.block) {
										{
											boolean _setval = (boolean) (true);
											entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ToxicBlockPlace7 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasdioritBlock.block) {
											{
												boolean _setval = (boolean) (true);
												entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ToxicBlockPlace8 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SavasgranitBlock.block) {
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
														.getBlock() == SavascsontBlock.block) {
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
															.getBlock() == SavasteglaBlock.block) {
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
																.getBlock() == SavaskoteglaBlock.block) {
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
																	.getBlock() == SavasnetheritetormelekBlock.block) {
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
																		.getBlock() == SavasbazaltBlock.block) {
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
																			.getBlock() == SavaszuzottBlock.block) {
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
																				.getBlock() == SavassoderBlock.block) {
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
																					.getBlock() == SavasbuzablockBlock.block) {
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
																						.getBlock() == SavasblackstoneBlock.block) {
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
																							.getBlock() == SavasblackkoteglaBlock.block) {
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
																										.getBlock() == SvaskekgombaBlock.block) {
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
																											.getBlock() == SavaspirosgombaBlock.block) {
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
																												.getBlock() == SavassandBlock.block) {
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
																													.getBlock() == SavasredsandBlock.block) {
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
																														.getBlock() == SavashomokkoBlock.block) {
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
																															.getBlock() == SavashomokkopirosBlock.block) {
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
			if (entity instanceof ServerPlayerEntity) {
				Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
						.getAdvancement(new ResourceLocation("ragemod:adv_37"));
				AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}
