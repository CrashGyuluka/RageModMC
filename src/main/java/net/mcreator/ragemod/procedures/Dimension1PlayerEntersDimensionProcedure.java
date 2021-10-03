package net.mcreator.ragemod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.item.BedrockbrakerpotionItem;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class Dimension1PlayerEntersDimensionProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Dimension1PlayerEntersDimension!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Dimension1PlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Dimension1PlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Dimension1PlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Dimension1PlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(BedrockbrakerpotionItem.block))
				: false) == (false))) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(BedrockbrakerpotionItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
