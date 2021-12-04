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
import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class Savascsakanyproc5Procedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RagemodModItems.SAVASCSAKANY
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == RagemodModItems.ALIENITEPICKAXE) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.MOSSY_STONE_BRICK_SLAB) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Blocks.STONE_BRICK_SLAB.defaultBlockState();
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
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.POLISHED_BLACKSTONE_SLAB) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.defaultBlockState();
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
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BLACKSTONE_SLAB) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.POLISHED_BLACKSTONE_SLAB.defaultBlockState();
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
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.STONE_STAIRS) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.STONE_BRICK_STAIRS.defaultBlockState();
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
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COBBLESTONE_STAIRS) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.STONE_STAIRS.defaultBlockState();
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
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.MOSSY_STONE_BRICK_STAIRS) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.STONE_BRICK_STAIRS.defaultBlockState();
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
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
											.getBlock() == Blocks.POLISHED_BLACKSTONE_STAIRS) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.defaultBlockState();
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
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BLACKSTONE_STAIRS) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.POLISHED_BLACKSTONE_STAIRS.defaultBlockState();
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
											if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == Blocks.COBBLESTONE_WALL) {
												{
													BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
													BlockState _bs = Blocks.STONE_BRICK_WALL.defaultBlockState();
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
												if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == Blocks.POLISHED_BLACKSTONE_WALL) {
													{
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_WALL.defaultBlockState();
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
													if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == Blocks.BLACKSTONE_WALL) {
														{
															BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
															BlockState _bs = Blocks.POLISHED_BLACKSTONE_WALL.defaultBlockState();
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
														if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == Blocks.MOSSY_STONE_BRICK_WALL) {
															{
																BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																BlockState _bs = Blocks.STONE_BRICK_WALL.defaultBlockState();
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
															if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == Blocks.BRICKS) {
																{
																	BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																	BlockState _bs = RagemodModBlocks.TOROOTTEGLA.defaultBlockState();
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
																if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == RagemodModBlocks.TOROOTTEGLA) {
																	{
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		BlockState _bs = Blocks.BRICKS.defaultBlockState();
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
