package net.mcreator.ragemod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class Favago4Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Favago4!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			entity.getPersistentData().putDouble("playerTradePage", 3);
		}
	}
}
