
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.ragemod.procedures.KaribSeaMedalRightClickedInAir2Procedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class KaribSeaMedalItem extends Item {
	public KaribSeaMedalItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_ERCEK).durability(1069).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("karib_sea_medal");
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
		return 0.9F;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		KaribSeaMedalRightClickedInAir2Procedure.execute(entity);
		return ar;
	}
}
