
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class AlieniteItem extends Item {
	public AlieniteItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("alienite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
