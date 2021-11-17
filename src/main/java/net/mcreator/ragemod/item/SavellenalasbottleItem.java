
package net.mcreator.ragemod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.ragemod.procedures.SavellenalasbottleFoodEatenProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class SavellenalasbottleItem extends Item {
	public SavellenalasbottleItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

						.build()));
		setRegistryName("savellenalasbottle");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 30;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SavellenalasbottleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
