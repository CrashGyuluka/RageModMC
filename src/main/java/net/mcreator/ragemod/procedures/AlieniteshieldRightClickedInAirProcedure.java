package net.mcreator.ragemod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ragemod.network.RagemodModVariables;
import net.mcreator.ragemod.init.RagemodModItems;

public class AlieniteshieldRightClickedInAirProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sheildDamage = 0;
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			sheildDamage = (double) ((itemstack).getDamageValue());
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RagemodModItems.ALIENITESHIELDBLOCKINGDEV);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) sheildDamage);
			{
				double _setval = (double) 40;
				entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RageModShieldTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
