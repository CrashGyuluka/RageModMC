
package net.mcreator.ragemod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.ragemod.init.RagemodModItems;

public class PingvinhunenchantEnchantment extends Enchantment {
	public PingvinhunenchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RagemodModItems.RAGEIUMAROMR_CHESTPLATE)
			return true;
		if (stack.getItem() == RagemodModItems.ALIENITE_ARMOR_CHESTPLATE)
			return true;
		return false;
	}
}
