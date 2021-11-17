
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion SAVELLENALLAS = register(
			new Potion(new MobEffectInstance(RagemodModMobEffects.SAVELLENALLAS, 3600, 0, false, true)).setRegistryName("savellenallas"));
	public static final Potion RAGE_POTION_PLUS = register(new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 2, false, true),
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2, false, true), new MobEffectInstance(MobEffects.DIG_SPEED, 1000, 2, false, true))
					.setRegistryName("rage_potion_plus"));
	public static final Potion CREATIVEONLYMEGAMINEPOTION = register(
			new Potion(new MobEffectInstance(RagemodModMobEffects.MEGAMINE_EFFECT, 6000, 1, false, false))
					.setRegistryName("creativeonlymegaminepotion"));
	public static final Potion CREATIVEONLYMEGAMINEPOTION_2 = register(
			new Potion(new MobEffectInstance(RagemodModMobEffects.MEGAMINE_EFFECT, 12000, 1, false, false))
					.setRegistryName("creativeonlymegaminepotion_2"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
