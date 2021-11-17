package net.mcreator.ragemod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.resources.ResourceLocation;

public class TrofeaFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:rage_mod_rageium_mobs")).contains(entity.getType())) {
			entity.hurt(DamageSource.GENERIC, 40);
		}
	}
}
