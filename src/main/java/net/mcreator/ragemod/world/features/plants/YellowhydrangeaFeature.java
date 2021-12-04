
package net.mcreator.ragemod.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;

public class YellowhydrangeaFeature extends DefaultFlowerFeature {
	public static final YellowhydrangeaFeature FEATURE = (YellowhydrangeaFeature) new YellowhydrangeaFeature()
			.setRegistryName("ragemod:yellowhydrangea");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new RandomPatchConfiguration.GrassConfigurationBuilder(
					new SimpleStateProvider(RagemodModBlocks.YELLOWHYDRANGEA.defaultBlockState()), SimpleBlockPlacer.INSTANCE).tries(5)

							.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(9);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"),
			new ResourceLocation("ragemod:beech_forest"), new ResourceLocation("ragemod:alien_hills"), new ResourceLocation("ragemod:beech_hill"),
			new ResourceLocation("beach"), new ResourceLocation("jungle_edge"), new ResourceLocation("plains"), new ResourceLocation("birch_forest"),
			new ResourceLocation("flower_forest"), new ResourceLocation("ragemod:beech_meadow"), new ResourceLocation("jungle"));

	public YellowhydrangeaFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
