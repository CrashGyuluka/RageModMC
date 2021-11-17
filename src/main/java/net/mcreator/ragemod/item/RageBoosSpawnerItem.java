
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.ragemod.procedures.RageBoosSpawnerRightClickedOnBlockProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class RageBoosSpawnerItem extends Item {
	public RageBoosSpawnerItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("rage_boos_spawner");
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
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		RageBoosSpawnerRightClickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
		return retval;
	}
}
