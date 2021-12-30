
package net.mcreator.ragemod.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModParticles;
import net.mcreator.ragemod.init.RagemodModItems;
import net.mcreator.ragemod.init.RagemodModFluids;
import net.mcreator.ragemod.init.RagemodModBlocks;

public abstract class ToxicFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> RagemodModFluids.TOXIC_FLUID,
			() -> RagemodModFluids.FLOWING_TOXIC_FLUID,
			FluidAttributes.builder(new ResourceLocation("ragemod:blocks/--sav"), new ResourceLocation("ragemod:blocks/--sav")).luminosity(1)

					.temperature(400)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")))).explosionResistance(50f)

							.slopeFindDistance(3).bucket(() -> RagemodModItems.TOXIC_FLUID_BUCKET)
							.block(() -> (LiquidBlock) RagemodModBlocks.TOXIC_FLUID);

	private ToxicFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return RagemodModParticles.SAVASPART;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.4000000000000001);
	}

	public static class Source extends ToxicFluidFluid {
		public Source() {
			super();
			setRegistryName("toxic_fluid");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxicFluidFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_toxic_fluid");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
