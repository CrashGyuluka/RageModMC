
package net.mcreator.ragemod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.ragemod.procedures.ReceptbookRightClickedInAirProcedure;

public class ReceptbookItem extends Item {
	public ReceptbookItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("receptbook");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ReceptbookRightClickedInAirProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
