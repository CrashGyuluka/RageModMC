
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.procedures.AzuritgyuruItemInInventoryTickProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class AzuritgyuruItem extends Item {
	public AzuritgyuruItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).durability(300).rarity(Rarity.COMMON));
		setRegistryName("azuritgyuru");
	}

	@Override
	public int getEnchantmentValue() {
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
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AzuritgyuruItemInInventoryTickProcedure.execute(entity);
	}
}
