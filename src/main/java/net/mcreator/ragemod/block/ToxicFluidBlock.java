
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModFluids;

public class ToxicFluidBlock extends LiquidBlock {
	public ToxicFluidBlock() {
		super(RagemodModFluids.TOXIC_FLUID, BlockBehaviour.Properties.of(Material.LAVA, MaterialColor.COLOR_GREEN).strength(50f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 2));
		setRegistryName("toxic_fluid");
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 1;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
