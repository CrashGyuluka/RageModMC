package net.mcreator.ragemod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class CursedalieniteFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure CursedalieniteFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(0, 3, 0);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 200, (int) 1, (false), (false)));
	}
}
