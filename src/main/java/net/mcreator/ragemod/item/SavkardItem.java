
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import net.mcreator.ragemod.procedures.SavkardLivingEntityIsHitWithToolProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class SavkardItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:savkard")
	public static final Item block = null;

	public SavkardItem(RagemodModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6.6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Savkristalyp2Item.block));
			}
		}, 3, -3f, new Item.Properties().group(ErcekItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				SavkardLivingEntityIsHitWithToolProcedure.executeProcedure(ImmutableMap.<String, Object>builder().put("entity", entity).build());
				return retval;
			}
		}.setRegistryName("savkard"));
	}
}
