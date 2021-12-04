
package net.mcreator.ragemod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.procedures.BizmutgyuruProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class BuzmitgyuruItem extends Item {
	public BuzmitgyuruItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).durability(300).rarity(Rarity.COMMON));
		setRegistryName("buzmitgyuru");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BizmutgyuruProcedure.execute(entity);
	}
}
