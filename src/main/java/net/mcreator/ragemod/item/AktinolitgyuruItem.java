
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.procedures.AktinolitgyurupProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class AktinolitgyuruItem extends Item {
	public AktinolitgyuruItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).durability(300).rarity(Rarity.COMMON));
		setRegistryName("aktinolitgyuru");
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
		AktinolitgyurupProcedure.execute(entity);
	}
}
