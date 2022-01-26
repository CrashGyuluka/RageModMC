
package net.mcreator.ragemod.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.BlockPos;

import java.util.Set;
import java.util.List;

public class Elderberrybush2Feature extends Feature<NoneFeatureConfiguration> {
	public static final Elderberrybush2Feature FEATURE = (Elderberrybush2Feature) new Elderberrybush2Feature()
			.setRegistryName("ragemod:elderberrybush_2");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE.configured(FeatureConfiguration.NONE);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("ragemod:beech_highlands"),
			new ResourceLocation("forest"), new ResourceLocation("wooded_hills"), new ResourceLocation("sunflower_plains"),
			new ResourceLocation("ragemod:beech_forest"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"),
			new ResourceLocation("beach"), new ResourceLocation("plains"), new ResourceLocation("dark_forest_hills"),
			new ResourceLocation("ragemod:beech_hill"), new ResourceLocation("tall_birch_hills"), new ResourceLocation("jungle"),
			new ResourceLocation("tall_birch_forest"));
	private final List<Block> base_blocks = List.of(Blocks.GRASS_BLOCK);
	private StructureTemplate template = null;

	public Elderberrybush2Feature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		boolean dimensionCriteria = false;
		ResourceKey<Level> dimensionType = context.level().getLevel().dimension();
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("ragemod", "elderberry_bush2"));
		if (template == null)
			return false;
		if ((context.random().nextInt(1000000) + 1) <= 12000) {
			boolean anyPlaced = false;
			int count = context.random().nextInt(2) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
				j -= 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 1, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
			return anyPlaced;
		}
		return false;
	}
}
