
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.RagepotionItem;
import net.mcreator.ragemod.item.RageiumalloyItem;

@RagemodModElements.ModElement.Tag
public class RagepotioncraftBrewingRecipe extends RagemodModElements.ModElement {
	public RagepotioncraftBrewingRecipe(RagemodModElements instance) {
		super(instance, 715);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == RageiumalloyItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(RagepotionItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
