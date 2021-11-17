
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

import net.mcreator.ragemod.procedures.RagepotionFoodEatenProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class RagepotionItem extends Item {
	public RagepotionItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f)

						.build()));
		setRegistryName("ragepotion");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 24;
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

		RagepotionFoodEatenProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
