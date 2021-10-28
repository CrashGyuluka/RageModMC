
package net.mcreator.ragemod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class DeepslateanapaitoreBlock extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:deepslate_anapait_ore")
	public static final Block block = null;
	public DeepslateanapaitoreBlock(RagemodModElements instance) {
		super(instance, 359);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ErcekItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(6f, 11f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("deepslate_anapait_ore");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
