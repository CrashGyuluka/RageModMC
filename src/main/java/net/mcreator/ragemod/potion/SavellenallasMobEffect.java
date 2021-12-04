
package net.mcreator.ragemod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SavellenallasMobEffect extends MobEffect {
	public SavellenallasMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16737946);
		setRegistryName("savellenallas");
	}

	@Override
	public String getDescriptionId() {
		return "effect.ragemod.savellenallas";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
