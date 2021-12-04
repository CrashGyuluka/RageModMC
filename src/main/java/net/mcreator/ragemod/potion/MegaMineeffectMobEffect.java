
package net.mcreator.ragemod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MegaMineeffectMobEffect extends MobEffect {
	public MegaMineeffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434829);
		setRegistryName("megamine_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.ragemod.megamine_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
