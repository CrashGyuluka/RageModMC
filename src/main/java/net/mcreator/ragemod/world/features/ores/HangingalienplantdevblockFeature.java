
package net.mcreator.ragemod.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.ragemod.procedures.HangingalienshroomAdditionalPlacinggrowthConditionProcedure;
import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;

public class HangingalienplantdevblockFeature extends OreFeature {
	public static final HangingalienplantdevblockFeature FEATURE = (HangingalienplantdevblockFeature) new HangingalienplantdevblockFeature()
			.setRegistryName("ragemod:hangingalienplantdevblock");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(HangingalienplantdevblockFeatureRuleTest.INSTANCE,
					RagemodModBlocks.HANGINGALIENPLANTDEVBLOCK.defaultBlockState(), 17))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(75)))).squared().count(30);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public HangingalienplantdevblockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		Level world = context.level().getLevel();
		ResourceKey<Level> dimensionType = world.dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("ragemod:alien_dimension_portal_igniter")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!HangingalienshroomAdditionalPlacinggrowthConditionProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}

	private static class HangingalienplantdevblockFeatureRuleTest extends RuleTest {
		static final HangingalienplantdevblockFeatureRuleTest INSTANCE = new HangingalienplantdevblockFeatureRuleTest();
		static final com.mojang.serialization.Codec<HangingalienplantdevblockFeatureRuleTest> codec = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		static final RuleTestType<HangingalienplantdevblockFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("ragemod:hangingalienplantdevblock_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.AIR)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.VOID_AIR)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.CAVE_AIR)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
