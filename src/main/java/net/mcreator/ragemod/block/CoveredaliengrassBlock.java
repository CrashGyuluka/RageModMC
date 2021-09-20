
package net.mcreator.ragemod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@RagemodModElements.ModElement.Tag
public class CoveredaliengrassBlock extends RagemodModElements.ModElement {

	@ObjectHolder("ragemod:coveredaliengrass")
	public static final Block block = null;

	public CoveredaliengrassBlock(RagemodModElements instance) {
		super(instance, 1234);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TermeszettabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.WET_GRASS).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0)
					.harvestLevel(2).harvestTool(ToolType.SHOVEL).setRequiresTool());

			setRegistryName("coveredaliengrass");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

	}

}
