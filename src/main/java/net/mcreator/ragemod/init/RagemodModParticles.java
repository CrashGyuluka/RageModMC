
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.client.particle.YellowcaveparticleParticle;
import net.mcreator.ragemod.client.particle.SavaspartParticle;
import net.mcreator.ragemod.client.particle.RedcaveparticleParticle;
import net.mcreator.ragemod.client.particle.RageparticleParticle;
import net.mcreator.ragemod.client.particle.RagefallingtreeParticle;
import net.mcreator.ragemod.client.particle.Particle2Particle;
import net.mcreator.ragemod.client.particle.ObsontiumparticleParticle;
import net.mcreator.ragemod.client.particle.MagentaCaveparticleParticle;
import net.mcreator.ragemod.client.particle.CvexparticleParticle;
import net.mcreator.ragemod.client.particle.BlueCaveparticleParticle;
import net.mcreator.ragemod.client.particle.AlienplantparticleParticle;
import net.mcreator.ragemod.client.particle.AlienparticleParticle;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModParticles {
	private static final Map<ParticleType<?>, Function<SpriteSet, ParticleProvider<SimpleParticleType>>> REGISTRY = new HashMap<>();
	public static final SimpleParticleType RAGEPARTICLE = register(new SimpleParticleType(false).setRegistryName("rageparticle"),
			RageparticleParticle::provider);
	public static final SimpleParticleType PARTICLE_2 = register(new SimpleParticleType(false).setRegistryName("particle_2"),
			Particle2Particle::provider);
	public static final SimpleParticleType SAVASPART = register(new SimpleParticleType(false).setRegistryName("savaspart"),
			SavaspartParticle::provider);
	public static final SimpleParticleType RAGETREE_FALLING = register(new SimpleParticleType(false).setRegistryName("ragetree_falling"),
			RagefallingtreeParticle::provider);
	public static final SimpleParticleType OBSONTIUMPARTICLE = register(new SimpleParticleType(false).setRegistryName("obsontiumparticle"),
			ObsontiumparticleParticle::provider);
	public static final SimpleParticleType CVEXPARTICLE = register(new SimpleParticleType(false).setRegistryName("cvexparticle"),
			CvexparticleParticle::provider);
	public static final SimpleParticleType ALIENPARTICLE = register(new SimpleParticleType(false).setRegistryName("alienparticle"),
			AlienparticleParticle::provider);
	public static final SimpleParticleType ALIENPLANTPARTICLE = register(new SimpleParticleType(false).setRegistryName("alienplantparticle"),
			AlienplantparticleParticle::provider);
	public static final SimpleParticleType BLUE_CAVEPARTICLE = register(new SimpleParticleType(false).setRegistryName("blue_caveparticle"),
			BlueCaveparticleParticle::provider);
	public static final SimpleParticleType REDCAVEPARTICLE = register(new SimpleParticleType(false).setRegistryName("redcaveparticle"),
			RedcaveparticleParticle::provider);
	public static final SimpleParticleType YELLOWCAVEPARTICLE = register(new SimpleParticleType(false).setRegistryName("yellowcaveparticle"),
			YellowcaveparticleParticle::provider);
	public static final SimpleParticleType MAGENTA_CAVEPARTICLE = register(new SimpleParticleType(false).setRegistryName("magenta_caveparticle"),
			MagentaCaveparticleParticle::provider);

	private static SimpleParticleType register(ParticleType<?> particle, Function<SpriteSet, ParticleProvider<SimpleParticleType>> provider) {
		REGISTRY.put(particle, provider);
		return (SimpleParticleType) particle;
	}

	@SubscribeEvent
	public static void registerParticleTypes(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new ParticleType[0]));
	}

	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		REGISTRY.forEach((particle, provider) -> Minecraft.getInstance().particleEngine.register((SimpleParticleType) particle,
				spriteSet -> provider.apply(spriteSet)));
	}
}
