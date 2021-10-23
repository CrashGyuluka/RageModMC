
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.SavellenalasbottleItem;
import net.mcreator.ragemod.item.RagepotionItem;
import net.mcreator.ragemod.item.AktionitItem;

@RagemodModElements.ModElement.Tag
public class PatcraftBrewingRecipe extends RagemodModElements.ModElement {
	public PatcraftBrewingRecipe(RagemodModElements instance) {
		super(instance, 855);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == AktionitItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == RagepotionItem.block;
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
