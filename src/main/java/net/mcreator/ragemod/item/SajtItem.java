
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.ragemod.init.RagemodModTabs;

public class SajtItem extends Item {
	public SajtItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(6f)

						.build()));
		setRegistryName("sajt");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 30;
	}
}
