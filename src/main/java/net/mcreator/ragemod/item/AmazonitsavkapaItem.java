
package net.mcreator.ragemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class AmazonitsavkapaItem extends HoeItem {
	public AmazonitsavkapaItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.AMAZONITRT), new ItemStack(RagemodModItems.SAVKRISTALYP_2));
			}
		}, 0, -2.7999999999999998f, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).fireResistant());
		setRegistryName("amazonitsavkapa");
	}
}
