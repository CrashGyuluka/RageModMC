
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModFluids;

public class ToxicFluidItem extends BucketItem {
	public ToxicFluidItem() {
		super(() -> RagemodModFluids.TOXIC_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(RagemodModTabs.TAB_ERCEK));
		setRegistryName("toxic_fluid_bucket");
	}
}
