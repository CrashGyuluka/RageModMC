
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.entity.TraderrtEntity;
import net.mcreator.ragemod.entity.SavragerobiEntity;
import net.mcreator.ragemod.entity.RagemiteEntity;
import net.mcreator.ragemod.entity.RageflylitEntity;
import net.mcreator.ragemod.entity.Rageflylit2Entity;
import net.mcreator.ragemod.entity.RageflyEntity;
import net.mcreator.ragemod.entity.Rageboos1Entity;
import net.mcreator.ragemod.entity.RagearrowEntity;
import net.mcreator.ragemod.entity.PoliposEntity;
import net.mcreator.ragemod.entity.Mob1Entity;
import net.mcreator.ragemod.entity.MinerEntity;
import net.mcreator.ragemod.entity.FlyilenEntity;
import net.mcreator.ragemod.entity.AtomRageREntity;
import net.mcreator.ragemod.entity.AlienslimeEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<RagemiteEntity> RAGEMITE = register("ragemite",
			EntityType.Builder.<RagemiteEntity>of(RagemiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RagemiteEntity::new).sized(0.4f, 0.3f));
	public static final EntityType<AtomRageREntity> ATOM_RAGE_R = register("atom_rage_r",
			EntityType.Builder.<AtomRageREntity>of(AtomRageREntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(84).setUpdateInterval(3).setCustomClientFactory(AtomRageREntity::new).sized(0.6f, 1.7f));
	public static final EntityType<Rageboos1Entity> RAGEBOOS_1 = register("rageboos_1",
			EntityType.Builder.<Rageboos1Entity>of(Rageboos1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(Rageboos1Entity::new).sized(1.4f, 0.9f));
	public static final EntityType<RagearrowEntity> RAGEARROW = register("entitybulletragearrow",
			EntityType.Builder.<RagearrowEntity>of(RagearrowEntity::new, MobCategory.MISC).setCustomClientFactory(RagearrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<Mob1Entity> TOXIC_MOB = register("toxic_mob",
			EntityType.Builder.<Mob1Entity>of(Mob1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Mob1Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<SavragerobiEntity> SAVRAGEROBI = register("savragerobi",
			EntityType.Builder.<SavragerobiEntity>of(SavragerobiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SavragerobiEntity::new).sized(0.6f, 2.8f));
	public static final EntityType<MinerEntity> MINER = register("miner",
			EntityType.Builder.<MinerEntity>of(MinerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(MinerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<TraderrtEntity> TRADERRT = register("traderrt",
			EntityType.Builder.<TraderrtEntity>of(TraderrtEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TraderrtEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<RageflyEntity> RAGEFLY = register("ragefly",
			EntityType.Builder.<RageflyEntity>of(RageflyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RageflyEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final EntityType<FlyilenEntity> FLYLIEN = register("flylien",
			EntityType.Builder.<FlyilenEntity>of(FlyilenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FlyilenEntity::new).sized(1f, 1f));
	public static final EntityType<AlienslimeEntity> ALIENSLIME = register("alienslime",
			EntityType.Builder.<AlienslimeEntity>of(AlienslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlienslimeEntity::new).sized(0.5f, 0.5f));
	public static final EntityType<PoliposEntity> POLIPOS = register("polipos",
			EntityType.Builder.<PoliposEntity>of(PoliposEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(PoliposEntity::new).sized(1.6f, 6.5f));
	public static final EntityType<RageflylitEntity> RAGEFLYLIT = register("rageflylit",
			EntityType.Builder.<RageflylitEntity>of(RageflylitEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RageflylitEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final EntityType<Rageflylit2Entity> RAGEFLYLIT_2 = register("rageflylit_2",
			EntityType.Builder.<Rageflylit2Entity>of(Rageflylit2Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Rageflylit2Entity::new).fireImmune().sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RagemiteEntity.init();
			AtomRageREntity.init();
			Rageboos1Entity.init();
			Mob1Entity.init();
			SavragerobiEntity.init();
			MinerEntity.init();
			TraderrtEntity.init();
			RageflyEntity.init();
			FlyilenEntity.init();
			AlienslimeEntity.init();
			PoliposEntity.init();
			RageflylitEntity.init();
			Rageflylit2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RAGEMITE, RagemiteEntity.createAttributes().build());
		event.put(ATOM_RAGE_R, AtomRageREntity.createAttributes().build());
		event.put(RAGEBOOS_1, Rageboos1Entity.createAttributes().build());
		event.put(TOXIC_MOB, Mob1Entity.createAttributes().build());
		event.put(SAVRAGEROBI, SavragerobiEntity.createAttributes().build());
		event.put(MINER, MinerEntity.createAttributes().build());
		event.put(TRADERRT, TraderrtEntity.createAttributes().build());
		event.put(RAGEFLY, RageflyEntity.createAttributes().build());
		event.put(FLYLIEN, FlyilenEntity.createAttributes().build());
		event.put(ALIENSLIME, AlienslimeEntity.createAttributes().build());
		event.put(POLIPOS, PoliposEntity.createAttributes().build());
		event.put(RAGEFLYLIT, RageflylitEntity.createAttributes().build());
		event.put(RAGEFLYLIT_2, Rageflylit2Entity.createAttributes().build());
	}
}
