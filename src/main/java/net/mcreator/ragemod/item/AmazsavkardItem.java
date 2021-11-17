
package net.mcreator.ragemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class AmazsavkardItem extends SwordItem {
	public AmazsavkardItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.AMAZONITRT), new ItemStack(RagemodModItems.SAVKRISTALYP_2));
			}
		}, 3, -3.2f, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).fireResistant());
		setRegistryName("amazsavkard");
	}
}
