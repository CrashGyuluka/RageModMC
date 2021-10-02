
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class AmazonitsavasfejszeItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:amazonitsavasfejsze")
	public static final Item block = null;
	public AmazonitsavasfejszeItem(RagemodModElements instance) {
		super(instance, 156);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmazonitrtItem.block), new ItemStack(Savkristalyp2Item.block));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().group(ErcekItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("amazonitsavasfejsze"));
	}
}
