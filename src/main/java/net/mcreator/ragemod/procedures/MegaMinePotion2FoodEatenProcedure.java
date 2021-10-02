package net.mcreator.ragemod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.potion.MegaMineeffectPotionEffect;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class MegaMinePotion2FoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure MegaMinePotion2FoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(MegaMineeffectPotionEffect.potion, (int) 18000, (int) 1, (false), (false)));
	}
}
