
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class AmazonitsavkapaItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:amazonitsavkapa")
	public static final Item block = null;
	public AmazonitsavkapaItem(RagemodModElements instance) {
		super(instance, 291);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmazonitrtItem.block), new ItemStack(Savkristalyp2Item.block));
			}
		}, 0, -2.7999999999999998f, new Item.Properties().group(ErcekItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("amazonitsavkapa"));
	}
}
