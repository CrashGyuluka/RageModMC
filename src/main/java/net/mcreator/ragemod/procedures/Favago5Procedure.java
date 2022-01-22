package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.RagemodMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class Favago5Procedure {
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Favago5!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount1"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_SAPLING);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount2"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == Items.EMERALD) {
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SPRUCE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.BIRCH_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.JUNGLE_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.ACACIA_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_PLANKS);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("playerTradeCount3"))));
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		}
	}
}
