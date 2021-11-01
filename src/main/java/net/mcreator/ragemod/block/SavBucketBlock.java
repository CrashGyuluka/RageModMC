
package net.mcreator.ragemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.StateContainer;
import net.minecraft.particles.IParticleData;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragemod.particle.SavaspartParticle;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class SavBucketBlock extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:sav_bucket")
	public static final FlowingFluidBlock block = null;
	@ObjectHolder("ragemod:sav_bucket_bucket")
	public static final Item bucket = null;
	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;
	private ForgeFlowingFluid.Properties fluidproperties = null;
	public SavBucketBlock(RagemodModElements instance) {
		super(instance, 35);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FluidRegisterHandler());
	}
	private static class FluidRegisterHandler {
		@SubscribeEvent
		public void registerFluids(RegistryEvent.Register<Fluid> event) {
			event.getRegistry().register(still);
			event.getRegistry().register(flowing);
		}
	}
	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				FluidAttributes.builder(new ResourceLocation("ragemod:blocks/--sav"), new ResourceLocation("ragemod:blocks/--sav")).luminosity(0)
						.density(800).viscosity(1000).temperature(300).rarity(Rarity.COMMON)
						.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")))).explosionResistance(100f)
								.canMultiply().tickRate(5).levelDecreasePerBlock(1).slopeFindDistance(5).bucket(() -> bucket).block(() -> block);
		still = (FlowingFluid) new CustomFlowingFluid.Source(fluidproperties).setRegistryName("sav_bucket");
		flowing = (FlowingFluid) new CustomFlowingFluid.Flowing(fluidproperties).setRegistryName("sav_bucket_flowing");
		elements.blocks.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.LAVA).hardnessAndResistance(100f)
				.setNeedsPostProcessing((bs, br, bp) -> true).setEmmisiveRendering((bs, br, bp) -> true).setLightLevel(s -> 2)) {
			@Override
			public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
				return true;
			}
		}.setRegistryName("sav_bucket"));
		elements.items.add(() -> new BucketItem(still,
				new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ErcekItemGroup.tab).rarity(Rarity.COMMON))
						.setRegistryName("sav_bucket_bucket"));
	}
	public static abstract class CustomFlowingFluid extends ForgeFlowingFluid {
		public CustomFlowingFluid(Properties properties) {
			super(properties);
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public IParticleData getDripParticleData() {
			return SavaspartParticle.particle;
		}
		public static class Source extends CustomFlowingFluid {
			public Source(Properties properties) {
				super(properties);
			}

			public int getLevel(FluidState state) {
				return 8;
			}

			public boolean isSource(FluidState state) {
				return true;
			}
		}

		public static class Flowing extends CustomFlowingFluid {
			public Flowing(Properties properties) {
				super(properties);
			}

			protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
				super.fillStateContainer(builder);
				builder.add(LEVEL_1_8);
			}

			public int getLevel(FluidState state) {
				return state.get(LEVEL_1_8);
			}

			public boolean isSource(FluidState state) {
				return false;
			}
		}
	}
}
