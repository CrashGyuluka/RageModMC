
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class Savkristalyp2Item extends Item {
	public Savkristalyp2Item() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("savkristalyp_2");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
