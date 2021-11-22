
package net.mcreator.ragemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragemod.itemgroup.TermeszettabItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class AliendirtBlock extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:alien_dirt")
	public static final Block block = null;

	public AliendirtBlock(RagemodModElements instance) {
		super(instance, 165);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(TermeszettabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(2f, 10f).setLightLevel(s -> 0)
					.harvestLevel(2).harvestTool(ToolType.SHOVEL).setRequiresTool());
			setRegistryName("alien_dirt");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
