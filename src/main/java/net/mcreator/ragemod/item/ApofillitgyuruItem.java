
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.procedures.ApofillitgyuruItemInInventoryTickProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@RagemodModElements.ModElement.Tag
public class ApofillitgyuruItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:apofillitgyuru")
	public static final Item block = null;

	public ApofillitgyuruItem(RagemodModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ErcekItemGroup.tab).maxDamage(300).rarity(Rarity.COMMON));
			setRegistryName("apofillitgyuru");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			ApofillitgyuruItemInInventoryTickProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
					.collect(HashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll));
		}
	}
}
