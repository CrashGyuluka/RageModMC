
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ragemod.world.biome.TotallyNotAlienBiome;
import net.mcreator.ragemod.world.biome.SpikyalienplainsBiome;
import net.mcreator.ragemod.world.biome.SequoiaforestBiome;
import net.mcreator.ragemod.world.biome.SavasbiomBiome;
import net.mcreator.ragemod.world.biome.RichDesertBiome;
import net.mcreator.ragemod.world.biome.RagetreebiomeBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestMountainBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestBiome;
import net.mcreator.ragemod.world.biome.GlowingOakFieldeBiome;
import net.mcreator.ragemod.world.biome.FloweryalienplainsBiome;
import net.mcreator.ragemod.world.biome.BukkmountainBiome;
import net.mcreator.ragemod.world.biome.BukkmeadowBiome;
import net.mcreator.ragemod.world.biome.BukkhighmountainvariatedBiome;
import net.mcreator.ragemod.world.biome.BukkhighmountainBiome;
import net.mcreator.ragemod.world.biome.BukkbiomeBiome;
import net.mcreator.ragemod.world.biome.AlienplainsBiome;
import net.mcreator.ragemod.world.biome.AlienlakeBiome;
import net.mcreator.ragemod.world.biome.AlienforestBiome;
import net.mcreator.ragemod.RagemodMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome TOXIC_WASTE = register("toxic_waste", SavasbiomBiome.createBiome());
	public static Biome BEECH_FOREST = register("beech_forest", BukkbiomeBiome.createBiome());
	public static Biome BEECH_HILL = register("beech_hill", BukkmountainBiome.createBiome());
	public static Biome BEECH_HIGHLANDS = register("beech_highlands", BukkmeadowBiome.createBiome());
	public static Biome BEECH_MOUNTAIN = register("beech_mountain", BukkhighmountainBiome.createBiome());
	public static Biome BEECH_AMPLIFIED_MOUNTAIN = register("beech_amplified_mountain", BukkhighmountainvariatedBiome.createBiome());
	public static Biome ALIEN_HILLS = register("alien_hills", TotallyNotAlienBiome.createBiome());
	public static Biome ALIEN_PLAINS = register("alien_plains", AlienplainsBiome.createBiome());
	public static Biome ALIEN_LAKE = register("alien_lake", AlienlakeBiome.createBiome());
	public static Biome ALIEN_FOREST = register("alien_forest", AlienforestBiome.createBiome());
	public static Biome RAGETREE_FOREST = register("ragetree_forest", RagetreebiomeBiome.createBiome());
	public static Biome FLOWERY_ALIEN_PLAINS = register("flowery_alien_plains", FloweryalienplainsBiome.createBiome());
	public static Biome SPIKY_ALIEN_PLAINS = register("spiky_alien_plains", SpikyalienplainsBiome.createBiome());
	public static Biome SEQUOIA_FOREST = register("sequoia_forest", SequoiaforestBiome.createBiome());
	public static Biome GLOWING_OAK_FOREST = register("glowing_oak_forest", GlowingOakForestBiome.createBiome());
	public static Biome GLOWING_OAK_FOREST_MOUNTAIN = register("glowing_oak_forest_mountain", GlowingOakForestMountainBiome.createBiome());
	public static Biome RICH_DESERT = register("rich_desert", RichDesertBiome.createBiome());
	public static Biome GLOWING_OAK_FIELD = register("glowing_oak_field", GlowingOakFieldeBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(RagemodMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SavasbiomBiome.init();
			BukkbiomeBiome.init();
			BukkmountainBiome.init();
			BukkmeadowBiome.init();
			BukkhighmountainBiome.init();
			BukkhighmountainvariatedBiome.init();
			TotallyNotAlienBiome.init();
			AlienplainsBiome.init();
			AlienlakeBiome.init();
			AlienforestBiome.init();
			RagetreebiomeBiome.init();
			FloweryalienplainsBiome.init();
			SpikyalienplainsBiome.init();
			SequoiaforestBiome.init();
			GlowingOakForestBiome.init();
			GlowingOakForestMountainBiome.init();
			RichDesertBiome.init();
			GlowingOakFieldeBiome.init();
		});
	}
}
