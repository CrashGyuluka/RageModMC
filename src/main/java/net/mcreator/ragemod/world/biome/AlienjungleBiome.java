
package net.mcreator.ragemod.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.trunkplacer.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.NoiseDependant;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.foliageplacer.JungleFoliagePlacer;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.client.audio.BackgroundMusicSelector;

import net.mcreator.ragemod.particle.AlienparticleParticle;
import net.mcreator.ragemod.entity.Mob1Entity;
import net.mcreator.ragemod.block.MarokriksaLogBlock;
import net.mcreator.ragemod.block.MarokriksaLeavesBlock;
import net.mcreator.ragemod.block.Hegyiko1Block;
import net.mcreator.ragemod.block.AliensoilBlock;
import net.mcreator.ragemod.RagemodModElements;

import com.google.common.collect.ImmutableList;

@RagemodModElements.ModElement.Tag
public class AlienjungleBiome extends RagemodModElements.ModElement {
	public static Biome biome;
	public AlienjungleBiome(RagemodModElements instance) {
		super(instance, 1243);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-3582519).setWaterColor(-8840374).setWaterFogColor(-11261634)
						.withSkyColor(-3582519).withFoliageColor(-9678655).withGrassColor(-12513166)
						.setMoodSound(new MoodSoundAmbience(
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:alien_d7")),
								30000, 8, 2))
						.setMusic(new BackgroundMusicSelector(
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:alien_d5")),
								12000, 24000, true))
						.setParticle(new ParticleEffectAmbience(AlienparticleParticle.particle, 0.006f)).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(AliensoilBlock.block.getDefaultState(),
								Hegyiko1Block.block.getDefaultState(), Hegyiko1Block.block.getDefaultState())));
				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.TREE
						.withConfiguration(
								(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(MarokriksaLogBlock.block.getDefaultState()),
										new SimpleBlockStateProvider(MarokriksaLeavesBlock.block.getDefaultState()),
										new JungleFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 2),
										new MegaJungleTrunkPlacer(11, 2, 19), new TwoLayerFeature(1, 1, 2))).setDecorators(
												ImmutableList.of(TrunkVineTreeDecorator.field_236879_b_, LeaveVineTreeDecorator.field_236871_b_))
												.setMaxWaterDepth(2).build())
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.RANDOM_PATCH.withConfiguration(Features.Configs.GRASS_PATCH_CONFIG).withPlacement(Features.Placements.PATCH_PLACEMENT)
								.withPlacement(Placement.COUNT_NOISE.configure(new NoiseDependant(-0.8D, 5, 4))));
				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Feature.FLOWER.withConfiguration(Features.Configs.NORMAL_FLOWER_CONFIG)
								.withPlacement(Features.Placements.VEGETATION_PLACEMENT).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
								.func_242731_b(4));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withEmeraldOre(biomeGenerationSettings);
				DefaultBiomeFeatures.withExtraGoldOre(biomeGenerationSettings);
				DefaultBiomeFeatures.withFossils(biomeGenerationSettings);
				DefaultBiomeFeatures.withInfestedStone(biomeGenerationSettings);
				DefaultBiomeFeatures.withMonsterRoom(biomeGenerationSettings);
				DefaultBiomeFeatures.withOceanCavesAndCanyons(biomeGenerationSettings);
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(Mob1Entity.entity, 2, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 5, 1, 2));
				mobSpawnInfo.withSpawner(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 20, 4, 4));
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.2f).scale(0.3f).temperature(0.1f)
						.downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("ragemod:alienjungle"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
