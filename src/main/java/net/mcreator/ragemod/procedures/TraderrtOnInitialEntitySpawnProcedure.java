package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class TraderrtOnInitialEntitySpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure TraderrtOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure TraderrtOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			entity.getPersistentData().putDouble("randomTradeItem1", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0.83) {
				entity.getPersistentData().putDouble("tradeItem1", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0.664) {
				entity.getPersistentData().putDouble("tradeItem1", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0.498) {
				entity.getPersistentData().putDouble("tradeItem1", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0.332) {
				entity.getPersistentData().putDouble("tradeItem1", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0.166) {
				entity.getPersistentData().putDouble("tradeItem1", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem1") >= 0) {
				entity.getPersistentData().putDouble("tradeItem1", 6);
			}
			entity.getPersistentData().putDouble("randomTradeItem2", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.83) {
				entity.getPersistentData().putDouble("tradeItem2", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.664) {
				entity.getPersistentData().putDouble("tradeItem2", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.498) {
				entity.getPersistentData().putDouble("tradeItem2", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.332) {
				entity.getPersistentData().putDouble("tradeItem2", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0.166) {
				entity.getPersistentData().putDouble("tradeItem2", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem2") >= 0) {
				entity.getPersistentData().putDouble("tradeItem2", 6);
			}
			entity.getPersistentData().putDouble("randomTradeItem3", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.83) {
				entity.getPersistentData().putDouble("tradeItem3", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.664) {
				entity.getPersistentData().putDouble("tradeItem3", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.498) {
				entity.getPersistentData().putDouble("tradeItem3", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.332) {
				entity.getPersistentData().putDouble("tradeItem3", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0.166) {
				entity.getPersistentData().putDouble("tradeItem3", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeItem3") >= 0) {
				entity.getPersistentData().putDouble("tradeItem3", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount1", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount1", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount1", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount1", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0) {
				entity.getPersistentData().putDouble("tradeCount1", 16);
			}
			entity.getPersistentData().putDouble("randomTradeCount2", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount2", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount2", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount2", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0) {
				entity.getPersistentData().putDouble("tradeCount2", 16);
			}
			entity.getPersistentData().putDouble("randomTradeCount3", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.75) {
				entity.getPersistentData().putDouble("tradeCount3", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.5) {
				entity.getPersistentData().putDouble("tradeCount3", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.25) {
				entity.getPersistentData().putDouble("tradeCount3", 8);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0) {
				entity.getPersistentData().putDouble("tradeCount3", 16);
			}
		}
	}
}
