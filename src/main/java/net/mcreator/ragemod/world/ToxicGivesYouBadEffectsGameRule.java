package net.mcreator.ragemod.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.ragemod.RagemodModElements;

import java.lang.reflect.Method;

@RagemodModElements.ModElement.Tag
public class ToxicGivesYouBadEffectsGameRule extends RagemodModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("toxicGivesYouBadEffects", GameRules.Category.PLAYER,
			create(true));

	public ToxicGivesYouBadEffectsGameRule(RagemodModElements instance) {
		super(instance, 869);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
