
package net.mcreator.ragemod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ragemod.item.MegaMinepotionItem;
import net.mcreator.ragemod.item.MegaMinePotion2Item;

@RagemodModElements.ModElement.Tag
public class MegaMinepotion2craftBrewingRecipe extends RagemodModElements.ModElement {
	public MegaMinepotion2craftBrewingRecipe(RagemodModElements instance) {
		super(instance, 1255);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == MegaMinepotionItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.REDSTONE;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(MegaMinePotion2Item.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
