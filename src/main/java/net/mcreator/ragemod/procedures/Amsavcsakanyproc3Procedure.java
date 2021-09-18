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

import net.mcreator.ragemod.item.MegasavcsakaknyItem;
import net.mcreator.ragemod.block.TorootteglaBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.HashMap;

public class Amsavcsakanyproc3Procedure {
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Amsavcsakanyproc3!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Amsavcsakanyproc3!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Amsavcsakanyproc3!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Amsavcsakanyproc3!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Amsavcsakanyproc3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == MegasavcsakaknyItem.block)
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.MOSSY_STONE_BRICK_SLAB))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Blocks.STONE_BRICK_SLAB.getDefaultState();
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
			if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == MegasavcsakaknyItem.block)
					&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.POLISHED_BLACKSTONE_SLAB))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.getDefaultState();
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
				if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MegasavcsakaknyItem.block)
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BLACKSTONE_SLAB))) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = Blocks.POLISHED_BLACKSTONE_SLAB.getDefaultState();
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
					if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == MegasavcsakaknyItem.block)
							&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.STONE_STAIRS))) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = Blocks.STONE_BRICK_STAIRS.getDefaultState();
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
						if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == MegasavcsakaknyItem.block)
								&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.COBBLESTONE_STAIRS))) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = Blocks.STONE_STAIRS.getDefaultState();
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
							if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == MegasavcsakaknyItem.block)
									&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
											.getBlock() == Blocks.MOSSY_STONE_BRICK_STAIRS))) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = Blocks.STONE_BRICK_STAIRS.getDefaultState();
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
								if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem() == MegasavcsakaknyItem.block)
										&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
												.getBlock() == Blocks.POLISHED_BLACKSTONE_STAIRS))) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.getDefaultState();
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
									if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
											.getItem() == MegasavcsakaknyItem.block)
											&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == Blocks.BLACKSTONE_STAIRS))) {
										{
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											BlockState _bs = Blocks.POLISHED_BLACKSTONE_STAIRS.getDefaultState();
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
										if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getItem() == MegasavcsakaknyItem.block)
												&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == Blocks.COBBLESTONE_WALL))) {
											{
												BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
												BlockState _bs = Blocks.STONE_BRICK_WALL.getDefaultState();
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
											if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
													.getItem() == MegasavcsakaknyItem.block)
													&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == Blocks.POLISHED_BLACKSTONE_WALL))) {
												{
													BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
													BlockState _bs = Blocks.POLISHED_BLACKSTONE_BRICK_WALL.getDefaultState();
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
												if (((((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY).getItem() == MegasavcsakaknyItem.block)
														&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == Blocks.BLACKSTONE_WALL))) {
													{
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														BlockState _bs = Blocks.POLISHED_BLACKSTONE_WALL.getDefaultState();
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
													if (((((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY).getItem() == MegasavcsakaknyItem.block)
															&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == Blocks.MOSSY_STONE_BRICK_WALL))) {
														{
															BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
															BlockState _bs = Blocks.STONE_BRICK_WALL.getDefaultState();
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
														if (((((entity instanceof LivingEntity)
																? ((LivingEntity) entity).getHeldItemMainhand()
																: ItemStack.EMPTY).getItem() == MegasavcsakaknyItem.block)
																&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == Blocks.BRICKS))) {
															{
																BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																BlockState _bs = TorootteglaBlock.block.getDefaultState();
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
															if (((((entity instanceof LivingEntity)
																	? ((LivingEntity) entity).getHeldItemMainhand()
																	: ItemStack.EMPTY).getItem() == MegasavcsakaknyItem.block)
																	&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																			.getBlock() == TorootteglaBlock.block))) {
																{
																	BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																	BlockState _bs = Blocks.BRICKS.getDefaultState();
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
