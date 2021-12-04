
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class AirRelicItem extends Item {
	public AirRelicItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(4).rarity(Rarity.RARE));
		setRegistryName("air_relic");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
