package net.mcreator.ragemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlaymusicinbiomesslaineprocProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double AmbientTimer = 0;
		double AmbientSelector = 0;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("ragemod:alien_dimension_portal_igniter")))) {
			AmbientTimer = (double) (AmbientTimer + 1);
			if (AmbientTimer == 2000) {
				AmbientSelector = (double) Math.random();
				if (AmbientSelector <= 1 && AmbientSelector > 0.75) {
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:alien_ambient1")), SoundSource.NEUTRAL, 1, 1);
				}
				if (AmbientSelector <= 0.75 && AmbientSelector > 0.5) {
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:alien_ambient2_1")), SoundSource.NEUTRAL, 1, 1);
				}
				if (AmbientSelector <= 0.5 && AmbientSelector > 0.25) {
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:alien_ambient_3_1")), SoundSource.NEUTRAL, 1, 1);
				}
				if (AmbientSelector <= 0.25 && AmbientSelector >= 0) {
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
				}
				AmbientTimer = (double) 0;
			}
		}
	}
}
