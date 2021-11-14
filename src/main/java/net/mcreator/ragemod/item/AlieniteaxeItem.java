
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.procedures.AlieniteaxeBlockDestroyedWithToolProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.List;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class AlieniteaxeItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:alieniteaxe")
	public static final Item block = null;

	public AlieniteaxeItem(RagemodModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4690;
			}

			public float getEfficiency() {
				return 15f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlieniteItem.block), new ItemStack(CursedalieniteItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(ErcekItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Mine with the MegaMine effect active!"));
			}

			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, blockstate, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();

				AlieniteaxeBlockDestroyedWithToolProcedure.executeProcedure(
						ImmutableMap.<String, Object>builder().put("entity", entity).put("x", x).put("y", y).put("z", z).put("world", world).build());
				return retval;
			}
		}.setRegistryName("alieniteaxe"));
	}
}
