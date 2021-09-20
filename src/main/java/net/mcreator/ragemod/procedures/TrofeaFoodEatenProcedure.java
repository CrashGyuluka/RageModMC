package net.mcreator.ragemod.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class TrofeaFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure TrofeaFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("forge:rage_mod_rageium_mobs").toLowerCase(java.util.Locale.ENGLISH)))
				.contains(entity.getType()))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 40);
		}
	}
}
