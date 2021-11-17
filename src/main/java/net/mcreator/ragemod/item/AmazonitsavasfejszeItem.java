
package net.mcreator.ragemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class AmazonitsavasfejszeItem extends AxeItem {
	public AmazonitsavasfejszeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.AMAZONITRT), new ItemStack(RagemodModItems.SAVKRISTALYP_2));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).fireResistant());
		setRegistryName("amazonitsavasfejsze");
	}
}
