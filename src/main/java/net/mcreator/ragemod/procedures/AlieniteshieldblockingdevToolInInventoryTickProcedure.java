package net.mcreator.ragemod.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.item.AlieniteshieldItem;
import net.mcreator.ragemod.RagemodModVariables;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class AlieniteshieldblockingdevToolInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure AlieniteshieldblockingdevToolInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				RagemodMod.LOGGER.warn("Failed to load dependency itemstack for procedure AlieniteshieldblockingdevToolInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double sheildDamage = 0;
		double localShieldTimer = 0;
		if ((entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new RagemodModVariables.PlayerVariables())).RageModShieldTimer == 0
				&& itemstack.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem()) {
			sheildDamage = ((itemstack).getDamage());
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(AlieniteshieldItem.block);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage((int) sheildDamage);
		} else {
			localShieldTimer = ((entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new RagemodModVariables.PlayerVariables())).RageModShieldTimer - 1);
			{
				double _setval = localShieldTimer;
				entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RageModShieldTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
