
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.ragemod.world.features.plants.YellowhydrangeaFeature;
import net.mcreator.ragemod.world.features.plants.YellowcavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.YellowGlowingCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.YellowGlowingCavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.YellowCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.TallalienplantFeature;
import net.mcreator.ragemod.world.features.plants.TallRagingGrowthFeature;
import net.mcreator.ragemod.world.features.plants.SavasnovenyFeature;
import net.mcreator.ragemod.world.features.plants.RedGlowingcavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.RedGlowingCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.RedCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.RedCavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.Ragingvinesdev2Feature;
import net.mcreator.ragemod.world.features.plants.RaginggrowthFeature;
import net.mcreator.ragemod.world.features.plants.RageflowerFeature;
import net.mcreator.ragemod.world.features.plants.RagefasaplingFeature;
import net.mcreator.ragemod.world.features.plants.PurplehydrangeaFeature;
import net.mcreator.ragemod.world.features.plants.MagentahydrangeaFeature;
import net.mcreator.ragemod.world.features.plants.MagentacaveplantFeature;
import net.mcreator.ragemod.world.features.plants.MagentaGlowongCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.MagentaGlowingCavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.MagentaCavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.GenusWeigelaFeature;
import net.mcreator.ragemod.world.features.plants.Fa5sapFeature;
import net.mcreator.ragemod.world.features.plants.Fa4sapFeature;
import net.mcreator.ragemod.world.features.plants.Fa3sapFeature;
import net.mcreator.ragemod.world.features.plants.BukkspalingFeature;
import net.mcreator.ragemod.world.features.plants.BluehydrangeaFeature;
import net.mcreator.ragemod.world.features.plants.BlueglowingcavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.BlueGlowingCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.BlueCaveplantFeature;
import net.mcreator.ragemod.world.features.plants.BlueCavemushroomFeature;
import net.mcreator.ragemod.world.features.plants.Bigalienmushroomdev1Feature;
import net.mcreator.ragemod.world.features.plants.BigalienmushroomFeature;
import net.mcreator.ragemod.world.features.plants.AlienshroomdevFeature;
import net.mcreator.ragemod.world.features.plants.AlienshroomFeature;
import net.mcreator.ragemod.world.features.plants.AlienmushroomFeature;
import net.mcreator.ragemod.world.features.plants.Aliengrowthdev1Feature;
import net.mcreator.ragemod.world.features.plants.AliengrowthFeature;
import net.mcreator.ragemod.world.features.plants.AliendripstonetopdevFeature;
import net.mcreator.ragemod.world.features.plants.AliendripstonebottomFeature;
import net.mcreator.ragemod.world.features.ores.SvaskekgombaFeature;
import net.mcreator.ragemod.world.features.ores.SecretboomkoFeature;
import net.mcreator.ragemod.world.features.ores.SavercFeature;
import net.mcreator.ragemod.world.features.ores.SavaszuzottFeature;
import net.mcreator.ragemod.world.features.ores.SavasteglaFeature;
import net.mcreator.ragemod.world.features.ores.SavassoderFeature;
import net.mcreator.ragemod.world.features.ores.SavassandFeature;
import net.mcreator.ragemod.world.features.ores.SavasredsandFeature;
import net.mcreator.ragemod.world.features.ores.SavasrageiumoreFeature;
import net.mcreator.ragemod.world.features.ores.SavasrageiumblockFeature;
import net.mcreator.ragemod.world.features.ores.SavasrageiumalloyblockFeature;
import net.mcreator.ragemod.world.features.ores.SavaspirosgombaFeature;
import net.mcreator.ragemod.world.features.ores.SavaspanksFeature;
import net.mcreator.ragemod.world.features.ores.SavasobszidianFeature;
import net.mcreator.ragemod.world.features.ores.SavasnetherrackFeature;
import net.mcreator.ragemod.world.features.ores.SavasnetheritetormelekFeature;
import net.mcreator.ragemod.world.features.ores.SavaslogFeature;
import net.mcreator.ragemod.world.features.ores.SavaskoteglaFeature;
import net.mcreator.ragemod.world.features.ores.SavaskoFeature;
import net.mcreator.ragemod.world.features.ores.SavashomokkopirosFeature;
import net.mcreator.ragemod.world.features.ores.SavashomokkoFeature;
import net.mcreator.ragemod.world.features.ores.SavasgranitFeature;
import net.mcreator.ragemod.world.features.ores.SavasfoldFeature;
import net.mcreator.ragemod.world.features.ores.SavasendkoFeature;
import net.mcreator.ragemod.world.features.ores.SavasdioritFeature;
import net.mcreator.ragemod.world.features.ores.SavascsontFeature;
import net.mcreator.ragemod.world.features.ores.SavasbuzablockFeature;
import net.mcreator.ragemod.world.features.ores.SavasblackstoneFeature;
import net.mcreator.ragemod.world.features.ores.SavasblackkoteglaFeature;
import net.mcreator.ragemod.world.features.ores.SavasbazaltFeature;
import net.mcreator.ragemod.world.features.ores.SavasandesiteFeature;
import net.mcreator.ragemod.world.features.ores.RageiumoreFeature;
import net.mcreator.ragemod.world.features.ores.OpaloreFeature;
import net.mcreator.ragemod.world.features.ores.HegyimorzsoltFeature;
import net.mcreator.ragemod.world.features.ores.HegyikowallFeature;
import net.mcreator.ragemod.world.features.ores.HegyikoteglaFeature;
import net.mcreator.ragemod.world.features.ores.HegyikopolishedFeature;
import net.mcreator.ragemod.world.features.ores.HegyikogreenFeature;
import net.mcreator.ragemod.world.features.ores.HegyikofullFeature;
import net.mcreator.ragemod.world.features.ores.Hegyiko1Feature;
import net.mcreator.ragemod.world.features.ores.FullhegyikowallFeature;
import net.mcreator.ragemod.world.features.ores.DeepslateazuritoreFeature;
import net.mcreator.ragemod.world.features.ores.DeepslateanapaitoreFeature;
import net.mcreator.ragemod.world.features.ores.DeepslateaktinolitoreFeature;
import net.mcreator.ragemod.world.features.ores.DeepslateadularoreFeature;
import net.mcreator.ragemod.world.features.ores.DeepslateachatoreFeature;
import net.mcreator.ragemod.world.features.ores.CerusszitoreFeature;
import net.mcreator.ragemod.world.features.ores.BizmutoreFeature;
import net.mcreator.ragemod.world.features.ores.AzuritoreFeature;
import net.mcreator.ragemod.world.features.ores.ApofillitoreFeature;
import net.mcreator.ragemod.world.features.ores.AnapaitoreFeature;
import net.mcreator.ragemod.world.features.ores.AmazonitoreFeature;
import net.mcreator.ragemod.world.features.ores.AlientrapblocklitFeature;
import net.mcreator.ragemod.world.features.ores.AlientrapblockFeature;
import net.mcreator.ragemod.world.features.ores.AlienshroomblockFeature;
import net.mcreator.ragemod.world.features.ores.AlienlamplitFeature;
import net.mcreator.ragemod.world.features.ores.AliencobwebFeature;
import net.mcreator.ragemod.world.features.ores.AlienStoneFeature;
import net.mcreator.ragemod.world.features.ores.AktinolitoreFeature;
import net.mcreator.ragemod.world.features.ores.AdularoreFeature;
import net.mcreator.ragemod.world.features.ores.AchatoreFeature;
import net.mcreator.ragemod.world.features.YellowcaveairstrFeature;
import net.mcreator.ragemod.world.features.TallalienshrromstrFeature;
import net.mcreator.ragemod.world.features.TallalienmushroomstrFeature;
import net.mcreator.ragemod.world.features.StructportFeature;
import net.mcreator.ragemod.world.features.StructlevFeature;
import net.mcreator.ragemod.world.features.StructboomFeature;
import net.mcreator.ragemod.world.features.Str9Feature;
import net.mcreator.ragemod.world.features.Str7Feature;
import net.mcreator.ragemod.world.features.Str6Feature;
import net.mcreator.ragemod.world.features.Str5Feature;
import net.mcreator.ragemod.world.features.Str3Feature;
import net.mcreator.ragemod.world.features.Str2Feature;
import net.mcreator.ragemod.world.features.Str1Feature;
import net.mcreator.ragemod.world.features.Seqtree1Feature;
import net.mcreator.ragemod.world.features.Seqfol4Feature;
import net.mcreator.ragemod.world.features.Seqfol3Feature;
import net.mcreator.ragemod.world.features.Seqfol2Feature;
import net.mcreator.ragemod.world.features.Seqfol1Feature;
import net.mcreator.ragemod.world.features.SavstructFeature;
import net.mcreator.ragemod.world.features.Richdesertkor2Feature;
import net.mcreator.ragemod.world.features.Richdesertkor1Feature;
import net.mcreator.ragemod.world.features.Richdesertkak3Feature;
import net.mcreator.ragemod.world.features.Richdesertkak32Feature;
import net.mcreator.ragemod.world.features.Richdesertkak2Feature;
import net.mcreator.ragemod.world.features.Richdesertkak22Feature;
import net.mcreator.ragemod.world.features.Richdesertkak1Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass3Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass27Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass26Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass25Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass24Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass23Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass22Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass1Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass19Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass18Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass17Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass16Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass15Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass14Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass12Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass114Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass113Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass112Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass111Feature;
import net.mcreator.ragemod.world.features.Richdesertgrass110Feature;
import net.mcreator.ragemod.world.features.RedcaveairstrFeature;
import net.mcreator.ragemod.world.features.Ragefabiome2Feature;
import net.mcreator.ragemod.world.features.Ragefabiome1Feature;
import net.mcreator.ragemod.world.features.Ragefa2Feature;
import net.mcreator.ragemod.world.features.Ragefa1Feature;
import net.mcreator.ragemod.world.features.Portaligniterstr2Feature;
import net.mcreator.ragemod.world.features.PortaligniterfinderstrFeature;
import net.mcreator.ragemod.world.features.ParkourstructFeature;
import net.mcreator.ragemod.world.features.Oreplus5Feature;
import net.mcreator.ragemod.world.features.Oreplus4Feature;
import net.mcreator.ragemod.world.features.Oreplus3Feature;
import net.mcreator.ragemod.world.features.Oreplus2Feature;
import net.mcreator.ragemod.world.features.Oreplus1Feature;
import net.mcreator.ragemod.world.features.OpalstrFeature;
import net.mcreator.ragemod.world.features.Opalstr2Feature;
import net.mcreator.ragemod.world.features.MarokriksaplainsalienFeature;
import net.mcreator.ragemod.world.features.MarokriksajunglealienFeature;
import net.mcreator.ragemod.world.features.MarokriksaalienstrFeature;
import net.mcreator.ragemod.world.features.MarokriksaaliendimensionFeature;
import net.mcreator.ragemod.world.features.MagentaCaveairStrFeature;
import net.mcreator.ragemod.world.features.Lightstr1Feature;
import net.mcreator.ragemod.world.features.KizukrawithoutFeature;
import net.mcreator.ragemod.world.features.Haziko1structFeature;
import net.mcreator.ragemod.world.features.Hangingalienplant2Feature;
import net.mcreator.ragemod.world.features.Glowingoaktree5Feature;
import net.mcreator.ragemod.world.features.Glowingoaktree4Feature;
import net.mcreator.ragemod.world.features.Glowingoaktree3Feature;
import net.mcreator.ragemod.world.features.Glowingoaktree2Feature;
import net.mcreator.ragemod.world.features.Glowingoaktree1Feature;
import net.mcreator.ragemod.world.features.Glowingforestpafrany2Feature;
import net.mcreator.ragemod.world.features.Glowingforestfol1Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow8Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow7Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow6Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow5Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow4Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow3Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow2Feature;
import net.mcreator.ragemod.world.features.Glowingforestflow1Feature;
import net.mcreator.ragemod.world.features.Glowingforestbush4Feature;
import net.mcreator.ragemod.world.features.Glowingforestbush2Feature;
import net.mcreator.ragemod.world.features.Glowingforestbush1Feature;
import net.mcreator.ragemod.world.features.Glowingforest3Feature;
import net.mcreator.ragemod.world.features.Fa5Feature;
import net.mcreator.ragemod.world.features.Fa4Feature;
import net.mcreator.ragemod.world.features.Fa3Feature;
import net.mcreator.ragemod.world.features.Endchantstruct1Feature;
import net.mcreator.ragemod.world.features.Elderberrybush5Feature;
import net.mcreator.ragemod.world.features.Elderberrybush4Feature;
import net.mcreator.ragemod.world.features.Elderberrybush2Feature;
import net.mcreator.ragemod.world.features.Elderberrybush1Feature;
import net.mcreator.ragemod.world.features.Bukkfastruct1Feature;
import net.mcreator.ragemod.world.features.Bukkfastr5Feature;
import net.mcreator.ragemod.world.features.Bukkfastr4Feature;
import net.mcreator.ragemod.world.features.Bukkfastr3Feature;
import net.mcreator.ragemod.world.features.Bukkfastr2Feature;
import net.mcreator.ragemod.world.features.Bukkfastr11Feature;
import net.mcreator.ragemod.world.features.BluecaveairstrFeature;
import net.mcreator.ragemod.world.features.Alienstrfloor1Feature;
import net.mcreator.ragemod.world.features.AlienspikeblockstrFeature;
import net.mcreator.ragemod.world.features.Alienspikeblock3Feature;
import net.mcreator.ragemod.world.features.Alienspikeblock2Feature;
import net.mcreator.ragemod.world.features.Alienspike6Feature;
import net.mcreator.ragemod.world.features.Alienspike5Feature;
import net.mcreator.ragemod.world.features.Alienspike4Feature;
import net.mcreator.ragemod.world.features.Alienspike3Feature;
import net.mcreator.ragemod.world.features.Alienspike2Feature;
import net.mcreator.ragemod.world.features.Alienspike1Feature;
import net.mcreator.ragemod.world.features.Alienjungle3Feature;
import net.mcreator.ragemod.world.features.Alienjungle2Feature;
import net.mcreator.ragemod.world.features.Alienjugle1Feature;
import net.mcreator.ragemod.world.features.Alienfloatingisland1Feature;
import net.mcreator.ragemod.world.features.Aliencloud3Feature;
import net.mcreator.ragemod.world.features.Aliencloud2Feature;
import net.mcreator.ragemod.world.features.Aliencloud1Feature;
import net.mcreator.ragemod.world.features.AlienairstrFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(RageiumoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RageiumoreFeature.GENERATE_BIOMES,
				RageiumoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SecretboomkoFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SecretboomkoFeature.GENERATE_BIOMES, SecretboomkoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavercFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavercFeature.GENERATE_BIOMES, SavercFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AzuritoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AzuritoreFeature.GENERATE_BIOMES,
				AzuritoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepslateazuritoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DeepslateazuritoreFeature.GENERATE_BIOMES, DeepslateazuritoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AchatoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AchatoreFeature.GENERATE_BIOMES,
				AchatoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepslateachatoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DeepslateachatoreFeature.GENERATE_BIOMES, DeepslateachatoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AdularoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AdularoreFeature.GENERATE_BIOMES,
				AdularoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepslateadularoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DeepslateadularoreFeature.GENERATE_BIOMES, DeepslateadularoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AktinolitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AktinolitoreFeature.GENERATE_BIOMES, AktinolitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepslateaktinolitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DeepslateaktinolitoreFeature.GENERATE_BIOMES, DeepslateaktinolitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AnapaitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AnapaitoreFeature.GENERATE_BIOMES,
				AnapaitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepslateanapaitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DeepslateanapaitoreFeature.GENERATE_BIOMES, DeepslateanapaitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CerusszitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CerusszitoreFeature.GENERATE_BIOMES, CerusszitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AmazonitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AmazonitoreFeature.GENERATE_BIOMES, AmazonitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ApofillitoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ApofillitoreFeature.GENERATE_BIOMES, ApofillitoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BizmutoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BizmutoreFeature.GENERATE_BIOMES,
				BizmutoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OpaloreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OpaloreFeature.GENERATE_BIOMES,
				OpaloreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasfoldFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavasfoldFeature.GENERATE_BIOMES,
				SavasfoldFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaskoFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavaskoFeature.GENERATE_BIOMES,
				SavaskoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasnetherrackFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasnetherrackFeature.GENERATE_BIOMES, SavasnetherrackFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasendkoFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavasendkoFeature.GENERATE_BIOMES,
				SavasendkoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaslogFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavaslogFeature.GENERATE_BIOMES,
				SavaslogFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaspanksFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavaspanksFeature.GENERATE_BIOMES,
				SavaspanksFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasblackstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasblackstoneFeature.GENERATE_BIOMES, SavasblackstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasandesiteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasandesiteFeature.GENERATE_BIOMES, SavasandesiteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasdioritFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasdioritFeature.GENERATE_BIOMES, SavasdioritFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasgranitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasgranitFeature.GENERATE_BIOMES, SavasgranitFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaszuzottFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavaszuzottFeature.GENERATE_BIOMES, SavaszuzottFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavassoderFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavassoderFeature.GENERATE_BIOMES,
				SavassoderFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavascsontFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavascsontFeature.GENERATE_BIOMES,
				SavascsontFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasteglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavasteglaFeature.GENERATE_BIOMES,
				SavasteglaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaskoteglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavaskoteglaFeature.GENERATE_BIOMES, SavaskoteglaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasobszidianFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasobszidianFeature.GENERATE_BIOMES, SavasobszidianFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasnetheritetormelekFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasnetheritetormelekFeature.GENERATE_BIOMES, SavasnetheritetormelekFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasbazaltFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasbazaltFeature.GENERATE_BIOMES, SavasbazaltFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasblackkoteglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasblackkoteglaFeature.GENERATE_BIOMES, SavasblackkoteglaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SvaskekgombaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SvaskekgombaFeature.GENERATE_BIOMES, SvaskekgombaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavaspirosgombaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavaspirosgombaFeature.GENERATE_BIOMES, SavaspirosgombaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasbuzablockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasbuzablockFeature.GENERATE_BIOMES, SavasbuzablockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavassandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SavassandFeature.GENERATE_BIOMES,
				SavassandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavashomokkoFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavashomokkoFeature.GENERATE_BIOMES, SavashomokkoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasredsandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasredsandFeature.GENERATE_BIOMES, SavasredsandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavashomokkopirosFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavashomokkopirosFeature.GENERATE_BIOMES, SavashomokkopirosFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasrageiumoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasrageiumoreFeature.GENERATE_BIOMES, SavasrageiumoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasrageiumalloyblockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasrageiumalloyblockFeature.GENERATE_BIOMES, SavasrageiumalloyblockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasrageiumblockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SavasrageiumblockFeature.GENERATE_BIOMES, SavasrageiumblockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GenusWeigelaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				GenusWeigelaFeature.GENERATE_BIOMES, GenusWeigelaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BluehydrangeaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BluehydrangeaFeature.GENERATE_BIOMES, BluehydrangeaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentahydrangeaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagentahydrangeaFeature.GENERATE_BIOMES, MagentahydrangeaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PurplehydrangeaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PurplehydrangeaFeature.GENERATE_BIOMES, PurplehydrangeaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowhydrangeaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				YellowhydrangeaFeature.GENERATE_BIOMES, YellowhydrangeaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RageflowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RageflowerFeature.GENERATE_BIOMES, RageflowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AliengrowthFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AliengrowthFeature.GENERATE_BIOMES, AliengrowthFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienshroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AlienshroomFeature.GENERATE_BIOMES, AlienshroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TallalienplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				TallalienplantFeature.GENERATE_BIOMES, TallalienplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienmushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AlienmushroomFeature.GENERATE_BIOMES, AlienmushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BigalienmushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BigalienmushroomFeature.GENERATE_BIOMES, BigalienmushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlientrapblockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AlientrapblockFeature.GENERATE_BIOMES, AlientrapblockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AlienStoneFeature.GENERATE_BIOMES,
				AlienStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienshroomblockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AlienshroomblockFeature.GENERATE_BIOMES, AlienshroomblockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AliencobwebFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AliencobwebFeature.GENERATE_BIOMES, AliencobwebFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RaginggrowthFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RaginggrowthFeature.GENERATE_BIOMES, RaginggrowthFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TallRagingGrowthFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				TallRagingGrowthFeature.GENERATE_BIOMES, TallRagingGrowthFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Hegyiko1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Hegyiko1Feature.GENERATE_BIOMES,
				Hegyiko1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyikogreenFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyikogreenFeature.GENERATE_BIOMES, HegyikogreenFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyimorzsoltFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyimorzsoltFeature.GENERATE_BIOMES, HegyimorzsoltFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyikofullFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyikofullFeature.GENERATE_BIOMES, HegyikofullFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyikopolishedFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyikopolishedFeature.GENERATE_BIOMES, HegyikopolishedFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyikoteglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyikoteglaFeature.GENERATE_BIOMES, HegyikoteglaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HegyikowallFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HegyikowallFeature.GENERATE_BIOMES, HegyikowallFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FullhegyikowallFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				FullhegyikowallFeature.GENERATE_BIOMES, FullhegyikowallFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueCavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlueCavemushroomFeature.GENERATE_BIOMES, BlueCavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedCavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RedCavemushroomFeature.GENERATE_BIOMES, RedCavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowcavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				YellowcavemushroomFeature.GENERATE_BIOMES, YellowcavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentaCavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagentaCavemushroomFeature.GENERATE_BIOMES, MagentaCavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlueCaveplantFeature.GENERATE_BIOMES, BlueCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RedCaveplantFeature.GENERATE_BIOMES, RedCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				YellowCaveplantFeature.GENERATE_BIOMES, YellowCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentacaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagentacaveplantFeature.GENERATE_BIOMES, MagentacaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RagefasaplingFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RagefasaplingFeature.GENERATE_BIOMES, RagefasaplingFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BukkspalingFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BukkspalingFeature.GENERATE_BIOMES, BukkspalingFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa3sapFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Fa3sapFeature.GENERATE_BIOMES,
				Fa3sapFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa4sapFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Fa4sapFeature.GENERATE_BIOMES,
				Fa4sapFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa5sapFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Fa5sapFeature.GENERATE_BIOMES,
				Fa5sapFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavasnovenyFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				SavasnovenyFeature.GENERATE_BIOMES, SavasnovenyFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Str1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Str1Feature.GENERATE_BIOMES, Str1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str2Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Str2Feature.GENERATE_BIOMES, Str2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str3Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Str3Feature.GENERATE_BIOMES, Str3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str5Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Str5Feature.GENERATE_BIOMES, Str5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Str6Feature.GENERATE_BIOMES,
				Str6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str7Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Str7Feature.GENERATE_BIOMES, Str7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Str9Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Str9Feature.GENERATE_BIOMES,
				Str9Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Endchantstruct1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Endchantstruct1Feature.GENERATE_BIOMES, Endchantstruct1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Haziko1structFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Haziko1structFeature.GENERATE_BIOMES, Haziko1structFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StructportFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				StructportFeature.GENERATE_BIOMES, StructportFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SavstructFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				SavstructFeature.GENERATE_BIOMES, SavstructFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ParkourstructFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				ParkourstructFeature.GENERATE_BIOMES, ParkourstructFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StructboomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, StructboomFeature.GENERATE_BIOMES,
				StructboomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StructlevFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, StructlevFeature.GENERATE_BIOMES,
				StructlevFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Ragefa1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Ragefa1Feature.GENERATE_BIOMES,
				Ragefa1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ragefa2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Ragefa2Feature.GENERATE_BIOMES,
				Ragefa2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa3Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Fa3Feature.GENERATE_BIOMES, Fa3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa4Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Fa4Feature.GENERATE_BIOMES, Fa4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Fa5Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Fa5Feature.GENERATE_BIOMES, Fa5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(KizukrawithoutFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				KizukrawithoutFeature.GENERATE_BIOMES, KizukrawithoutFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OpalstrFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, OpalstrFeature.GENERATE_BIOMES, OpalstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Opalstr2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Opalstr2Feature.GENERATE_BIOMES,
				Opalstr2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastruct1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastruct1Feature.GENERATE_BIOMES, Bukkfastruct1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastr2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastr2Feature.GENERATE_BIOMES, Bukkfastr2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastr3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastr3Feature.GENERATE_BIOMES, Bukkfastr3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastr4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastr4Feature.GENERATE_BIOMES, Bukkfastr4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastr5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastr5Feature.GENERATE_BIOMES, Bukkfastr5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bukkfastr11Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Bukkfastr11Feature.GENERATE_BIOMES, Bukkfastr11Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MarokriksaaliendimensionFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MarokriksaaliendimensionFeature.GENERATE_BIOMES, MarokriksaaliendimensionFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MarokriksaalienstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MarokriksaalienstrFeature.GENERATE_BIOMES, MarokriksaalienstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MarokriksaplainsalienFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MarokriksaplainsalienFeature.GENERATE_BIOMES, MarokriksaplainsalienFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MarokriksajunglealienFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MarokriksajunglealienFeature.GENERATE_BIOMES, MarokriksajunglealienFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Hangingalienplant2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Hangingalienplant2Feature.GENERATE_BIOMES, Hangingalienplant2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienjugle1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienjugle1Feature.GENERATE_BIOMES, Alienjugle1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienjungle2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienjungle2Feature.GENERATE_BIOMES, Alienjungle2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienjungle3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienjungle3Feature.GENERATE_BIOMES, Alienjungle3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AlientrapblocklitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AlientrapblocklitFeature.GENERATE_BIOMES, AlientrapblocklitFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienshroomdevFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AlienshroomdevFeature.GENERATE_BIOMES, AlienshroomdevFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Ragefabiome1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Ragefabiome1Feature.GENERATE_BIOMES, Ragefabiome1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ragefabiome2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Ragefabiome2Feature.GENERATE_BIOMES, Ragefabiome2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oreplus1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Oreplus1Feature.GENERATE_BIOMES, Oreplus1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oreplus2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Oreplus2Feature.GENERATE_BIOMES, Oreplus2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oreplus3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Oreplus3Feature.GENERATE_BIOMES, Oreplus3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oreplus4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Oreplus4Feature.GENERATE_BIOMES, Oreplus4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oreplus5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Oreplus5Feature.GENERATE_BIOMES, Oreplus5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienlamplitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AlienlamplitFeature.GENERATE_BIOMES, AlienlamplitFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PortaligniterfinderstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PortaligniterfinderstrFeature.GENERATE_BIOMES, PortaligniterfinderstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Portaligniterstr2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Portaligniterstr2Feature.GENERATE_BIOMES, Portaligniterstr2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Lightstr1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Lightstr1Feature.GENERATE_BIOMES,
				Lightstr1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Bigalienmushroomdev1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				Bigalienmushroomdev1Feature.GENERATE_BIOMES, Bigalienmushroomdev1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Aliengrowthdev1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				Aliengrowthdev1Feature.GENERATE_BIOMES, Aliengrowthdev1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ragingvinesdev2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				Ragingvinesdev2Feature.GENERATE_BIOMES, Ragingvinesdev2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AliendripstonebottomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AliendripstonebottomFeature.GENERATE_BIOMES, AliendripstonebottomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AliendripstonetopdevFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				AliendripstonetopdevFeature.GENERATE_BIOMES, AliendripstonetopdevFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Aliencloud1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Aliencloud1Feature.GENERATE_BIOMES,
				Aliencloud1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Aliencloud2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Aliencloud2Feature.GENERATE_BIOMES,
				Aliencloud2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Aliencloud3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Aliencloud3Feature.GENERATE_BIOMES,
				Aliencloud3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienstrfloor1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienstrfloor1Feature.GENERATE_BIOMES, Alienstrfloor1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Elderberrybush1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Elderberrybush1Feature.GENERATE_BIOMES, Elderberrybush1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Elderberrybush2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Elderberrybush2Feature.GENERATE_BIOMES, Elderberrybush2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Elderberrybush4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Elderberrybush4Feature.GENERATE_BIOMES, Elderberrybush4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Elderberrybush5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Elderberrybush5Feature.GENERATE_BIOMES, Elderberrybush5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike1Feature.GENERATE_BIOMES, Alienspike1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike2Feature.GENERATE_BIOMES, Alienspike2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike3Feature.GENERATE_BIOMES, Alienspike3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike4Feature.GENERATE_BIOMES, Alienspike4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike5Feature.GENERATE_BIOMES, Alienspike5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspike6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspike6Feature.GENERATE_BIOMES, Alienspike6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Seqtree1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Seqtree1Feature.GENERATE_BIOMES,
				Seqtree1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Seqfol1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Seqfol1Feature.GENERATE_BIOMES,
				Seqfol1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Seqfol2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Seqfol2Feature.GENERATE_BIOMES,
				Seqfol2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Seqfol3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Seqfol3Feature.GENERATE_BIOMES,
				Seqfol3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Seqfol4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Seqfol4Feature.GENERATE_BIOMES,
				Seqfol4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienspikeblockstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				AlienspikeblockstrFeature.GENERATE_BIOMES, AlienspikeblockstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspikeblock2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspikeblock2Feature.GENERATE_BIOMES, Alienspikeblock2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienspikeblock3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Alienspikeblock3Feature.GENERATE_BIOMES, Alienspikeblock3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Alienfloatingisland1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION,
				Alienfloatingisland1Feature.GENERATE_BIOMES, Alienfloatingisland1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingoaktree1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingoaktree1Feature.GENERATE_BIOMES, Glowingoaktree1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingoaktree2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingoaktree2Feature.GENERATE_BIOMES, Glowingoaktree2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingoaktree3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingoaktree3Feature.GENERATE_BIOMES, Glowingoaktree3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingoaktree4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingoaktree4Feature.GENERATE_BIOMES, Glowingoaktree4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingoaktree5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingoaktree5Feature.GENERATE_BIOMES, Glowingoaktree5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestfol1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestfol1Feature.GENERATE_BIOMES, Glowingforestfol1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestpafrany2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestpafrany2Feature.GENERATE_BIOMES, Glowingforestpafrany2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestbush2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestbush2Feature.GENERATE_BIOMES, Glowingforestbush2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestbush1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestbush1Feature.GENERATE_BIOMES, Glowingforestbush1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforest3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforest3Feature.GENERATE_BIOMES, Glowingforest3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestbush4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestbush4Feature.GENERATE_BIOMES, Glowingforestbush4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow1Feature.GENERATE_BIOMES, Glowingforestflow1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow2Feature.GENERATE_BIOMES, Glowingforestflow2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow3Feature.GENERATE_BIOMES, Glowingforestflow3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow4Feature.GENERATE_BIOMES, Glowingforestflow4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow5Feature.GENERATE_BIOMES, Glowingforestflow5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow6Feature.GENERATE_BIOMES, Glowingforestflow6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow7Feature.GENERATE_BIOMES, Glowingforestflow7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowingforestflow8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Glowingforestflow8Feature.GENERATE_BIOMES, Glowingforestflow8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass1Feature.GENERATE_BIOMES, Richdesertgrass1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass22Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass22Feature.GENERATE_BIOMES, Richdesertgrass22Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkor1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkor1Feature.GENERATE_BIOMES, Richdesertkor1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkak1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkak1Feature.GENERATE_BIOMES, Richdesertkak1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkak2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkak2Feature.GENERATE_BIOMES, Richdesertkak2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkak3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkak3Feature.GENERATE_BIOMES, Richdesertkak3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass12Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass12Feature.GENERATE_BIOMES, Richdesertgrass12Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass3Feature.GENERATE_BIOMES, Richdesertgrass3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass14Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass14Feature.GENERATE_BIOMES, Richdesertgrass14Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass15Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass15Feature.GENERATE_BIOMES, Richdesertgrass15Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass16Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass16Feature.GENERATE_BIOMES, Richdesertgrass16Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass17Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass17Feature.GENERATE_BIOMES, Richdesertgrass17Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass23Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass23Feature.GENERATE_BIOMES, Richdesertgrass23Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass24Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass24Feature.GENERATE_BIOMES, Richdesertgrass24Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkak22Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkak22Feature.GENERATE_BIOMES, Richdesertkak22Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkak32Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkak32Feature.GENERATE_BIOMES, Richdesertkak32Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertkor2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertkor2Feature.GENERATE_BIOMES, Richdesertkor2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass18Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass18Feature.GENERATE_BIOMES, Richdesertgrass18Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass25Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass25Feature.GENERATE_BIOMES, Richdesertgrass25Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass19Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass19Feature.GENERATE_BIOMES, Richdesertgrass19Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass110Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass110Feature.GENERATE_BIOMES, Richdesertgrass110Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass111Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass111Feature.GENERATE_BIOMES, Richdesertgrass111Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass26Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass26Feature.GENERATE_BIOMES, Richdesertgrass26Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass27Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass27Feature.GENERATE_BIOMES, Richdesertgrass27Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass112Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass112Feature.GENERATE_BIOMES, Richdesertgrass112Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass113Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass113Feature.GENERATE_BIOMES, Richdesertgrass113Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Richdesertgrass114Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Richdesertgrass114Feature.GENERATE_BIOMES, Richdesertgrass114Feature.CONFIGURED_FEATURE));
		REGISTRY.put(BluecaveairstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				BluecaveairstrFeature.GENERATE_BIOMES, BluecaveairstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedcaveairstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				RedcaveairstrFeature.GENERATE_BIOMES, RedcaveairstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowcaveairstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				YellowcaveairstrFeature.GENERATE_BIOMES, YellowcaveairstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentaCaveairStrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				MagentaCaveairStrFeature.GENERATE_BIOMES, MagentaCaveairStrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueglowingcavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlueglowingcavemushroomFeature.GENERATE_BIOMES, BlueglowingcavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedGlowingcavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RedGlowingcavemushroomFeature.GENERATE_BIOMES, RedGlowingcavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowGlowingCavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				YellowGlowingCavemushroomFeature.GENERATE_BIOMES, YellowGlowingCavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentaGlowingCavemushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagentaGlowingCavemushroomFeature.GENERATE_BIOMES, MagentaGlowingCavemushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueGlowingCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BlueGlowingCaveplantFeature.GENERATE_BIOMES, BlueGlowingCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedGlowingCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RedGlowingCaveplantFeature.GENERATE_BIOMES, RedGlowingCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(YellowGlowingCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				YellowGlowingCaveplantFeature.GENERATE_BIOMES, YellowGlowingCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentaGlowongCaveplantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagentaGlowongCaveplantFeature.GENERATE_BIOMES, MagentaGlowongCaveplantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AlienairstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				AlienairstrFeature.GENERATE_BIOMES, AlienairstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TallalienmushroomstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				TallalienmushroomstrFeature.GENERATE_BIOMES, TallalienmushroomstrFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TallalienshrromstrFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				TallalienshrromstrFeature.GENERATE_BIOMES, TallalienshrromstrFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
