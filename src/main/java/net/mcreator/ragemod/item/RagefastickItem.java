
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class RagefastickItem extends Item {
	public RagefastickItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ragewood_stick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
