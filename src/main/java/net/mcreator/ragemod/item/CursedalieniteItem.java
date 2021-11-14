
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.ragemod.procedures.CursedalieniteFoodEatenProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class CursedalieniteItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:cursed_alienite")
	public static final Item block = null;

	public CursedalieniteItem(RagemodModElements instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ErcekItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.2f).setAlwaysEdible()

							.build()));
			setRegistryName("cursed_alienite");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			CursedalieniteFoodEatenProcedure.executeProcedure(ImmutableMap.<String, Object>builder().put("entity", entity).build());
			return retval;
		}
	}
}
