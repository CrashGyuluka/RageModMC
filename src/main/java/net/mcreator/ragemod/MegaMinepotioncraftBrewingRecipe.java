
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.MegaMinepotionItem;
import net.mcreator.ragemod.item.CursedalieniteItem;

@RagemodModElements.ModElement.Tag
public class MegaMinepotioncraftBrewingRecipe extends RagemodModElements.ModElement {
	public MegaMinepotioncraftBrewingRecipe(RagemodModElements instance) {
		super(instance, 1279);
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
			return ingredient.getItem() == CursedalieniteItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(MegaMinepotionItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
