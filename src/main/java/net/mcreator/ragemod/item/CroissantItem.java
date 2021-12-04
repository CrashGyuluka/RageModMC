
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.ragemod.init.RagemodModTabs;

public class CroissantItem extends Item {
	public CroissantItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(7).saturationMod(7f)

						.build()));
		setRegistryName("croissant");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 20;
	}
}
