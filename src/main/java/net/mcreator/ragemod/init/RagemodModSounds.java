
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("ragemod", "toxicmob_idle2"), new SoundEvent(new ResourceLocation("ragemod", "toxicmob_idle2")));
		REGISTRY.put(new ResourceLocation("ragemod", "toxicmob_idle1"), new SoundEvent(new ResourceLocation("ragemod", "toxicmob_idle1")));
		REGISTRY.put(new ResourceLocation("ragemod", "toxicmob_death1"), new SoundEvent(new ResourceLocation("ragemod", "toxicmob_death1")));
		REGISTRY.put(new ResourceLocation("ragemod", "toxic_mob_sendhelp1"), new SoundEvent(new ResourceLocation("ragemod", "toxic_mob_sendhelp1")));
		REGISTRY.put(new ResourceLocation("ragemod", "alien_ambient1"), new SoundEvent(new ResourceLocation("ragemod", "alien_ambient1")));
		REGISTRY.put(new ResourceLocation("ragemod", "alien_ambient2_1"), new SoundEvent(new ResourceLocation("ragemod", "alien_ambient2_1")));
		REGISTRY.put(new ResourceLocation("ragemod", "alien_ambient_3_1"), new SoundEvent(new ResourceLocation("ragemod", "alien_ambient_3_1")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
