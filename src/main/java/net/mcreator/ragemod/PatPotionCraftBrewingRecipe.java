
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.SavellenalasbottleItem;
import net.mcreator.ragemod.item.RagepotionItem;
import net.mcreator.ragemod.block.MagentaCaveTrapBlock;

@RagemodModElements.ModElement.Tag
public class PatPotionCraftBrewingRecipe extends RagemodModElements.ModElement {
	public PatPotionCraftBrewingRecipe(RagemodModElements instance) {
		super(instance, 1414);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == RagepotionItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == MagentaCaveTrapBlock.block.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(SavellenalasbottleItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
