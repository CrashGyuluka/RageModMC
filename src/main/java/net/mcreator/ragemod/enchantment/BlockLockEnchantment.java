
package net.mcreator.ragemod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ragemod.item.SavasoItem;
import net.mcreator.ragemod.item.SavasfejszeItem;
import net.mcreator.ragemod.item.SavascsakanyItem;
import net.mcreator.ragemod.item.AlieniteshovelItem;
import net.mcreator.ragemod.item.AlienitepickaxeItem;
import net.mcreator.ragemod.item.AlieniteaxeItem;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class BlockLockEnchantment extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:block_lock")
	public static final Enchantment enchantment = null;

	public BlockLockEnchantment(RagemodModElements instance) {
		super(instance, 1396);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("block_lock"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == AlienitepickaxeItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.STONE_PICKAXE)
				return true;
			if (stack.getItem() == Items.IRON_PICKAXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_PICKAXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_PICKAXE)
				return true;
			if (stack.getItem() == SavascsakanyItem.block)
				return true;
			if (stack.getItem() == AlieniteshovelItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_SHOVEL)
				return true;
			if (stack.getItem() == Items.STONE_SHOVEL)
				return true;
			if (stack.getItem() == Items.IRON_SHOVEL)
				return true;
			if (stack.getItem() == Items.GOLDEN_SHOVEL)
				return true;
			if (stack.getItem() == Items.DIAMOND_SHOVEL)
				return true;
			if (stack.getItem() == Items.NETHERITE_SHOVEL)
				return true;
			if (stack.getItem() == SavasoItem.block)
				return true;
			if (stack.getItem() == AlieniteaxeItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_AXE)
				return true;
			if (stack.getItem() == Items.STONE_AXE)
				return true;
			if (stack.getItem() == Items.IRON_AXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_AXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_AXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_AXE)
				return true;
			if (stack.getItem() == SavasfejszeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
