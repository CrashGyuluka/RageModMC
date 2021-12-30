
package net.mcreator.ragemod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.ragemod.procedures.AlienfoodFoodEatenProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class AlienfoodItem extends Item {
	public AlienfoodItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.2f)

						.build()));
		setRegistryName("alien_food");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 20;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AlienfoodFoodEatenProcedure.execute(entity);
		return retval;
	}
}
