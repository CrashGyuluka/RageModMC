package net.mcreator.ragemod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class AlienspiketopdevEntityWalksOnTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure AlienspiketopdevEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
