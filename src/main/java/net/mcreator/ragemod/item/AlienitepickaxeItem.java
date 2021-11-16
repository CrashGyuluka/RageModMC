
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.procedures.AlienitepickaxeBlockDestroyedWithToolProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.List;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class AlienitepickaxeItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:alienitepickaxe")
	public static final Item block = null;

	public AlienitepickaxeItem(RagemodModElements instance) {
		super(instance, 98);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4690;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AlieniteItem.block), new ItemStack(CursedalieniteItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ErcekItemGroup.tab).isImmuneToFire()) {
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

				AlienitepickaxeBlockDestroyedWithToolProcedure.executeProcedure(
						ImmutableMap.<String, Object>builder().put("entity", entity).put("x", x).put("y", y).put("z", z).put("world", world).build());
				return retval;
			}
		}.setRegistryName("alienitepickaxe"));
	}
}
