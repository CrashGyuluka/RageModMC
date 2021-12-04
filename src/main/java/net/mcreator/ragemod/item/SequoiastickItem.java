
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class SequoiastickItem extends Item {
	public SequoiastickItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("sequoiastick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
