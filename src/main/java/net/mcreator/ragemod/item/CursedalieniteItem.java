
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
import net.mcreator.ragemod.itemgroup.RagetabItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.Map;
import java.util.HashMap;

@RagemodModElements.ModElement.Tag
public class CursedalieniteItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:cursedalienite")
	public static final Item block = null;
	public CursedalieniteItem(RagemodModElements instance) {
		super(instance, 1246);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(RagetabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.2f).setAlwaysEdible().build()));
			setRegistryName("cursedalienite");
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
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				CursedalieniteFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
