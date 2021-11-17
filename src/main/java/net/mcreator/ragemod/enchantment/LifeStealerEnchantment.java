
package net.mcreator.ragemod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.ragemod.init.RagemodModItems;

public class LifeStealerEnchantment extends Enchantment {
	public LifeStealerEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RagemodModItems.ALIENITESWORD)
			return true;
		if (stack.getItem() == RagemodModItems.ALIENITEAXE)
			return true;
		return false;
	}
}
