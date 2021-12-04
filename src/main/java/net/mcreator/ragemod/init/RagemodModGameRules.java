
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> TOXICGIVESYOUBADEFFECTS = GameRules.register("toxicGivesYouBadEffects",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> PORTALSENDSFEEDBACK = GameRules.register("portalSendsFeedback",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> RAGEMODDEVMODE = GameRules.register("rageModDevMode", GameRules.Category.UPDATES,
			GameRules.BooleanValue.create(false));
}
