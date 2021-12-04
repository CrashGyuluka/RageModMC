
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class BukkbotItem extends Item {
	public BukkbotItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("beech_stick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
