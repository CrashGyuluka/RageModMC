
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class AmazonitesavasoItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:amazonitesavaso")
	public static final Item block = null;
	public AmazonitesavasoItem(RagemodModElements instance) {
		super(instance, 380);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 0f;
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
		}.setRegistryName("amazonitesavaso"));
	}
}
