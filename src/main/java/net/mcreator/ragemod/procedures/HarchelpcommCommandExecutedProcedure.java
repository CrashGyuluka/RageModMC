package net.mcreator.ragemod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.item.RageiumaromrItem;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class HarchelpcommCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure HarchelpcommCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.NETHERITE_SWORD);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof LivingEntity) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.armorInventory.set((int) 3, new ItemStack(RageiumaromrItem.helmet));
			else
				((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3),
						new ItemStack(RageiumaromrItem.helmet));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		if (entity instanceof LivingEntity) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.armorInventory.set((int) 2, new ItemStack(RageiumaromrItem.body));
			else
				((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2),
						new ItemStack(RageiumaromrItem.body));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		if (entity instanceof LivingEntity) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.armorInventory.set((int) 1, new ItemStack(RageiumaromrItem.legs));
			else
				((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1),
						new ItemStack(RageiumaromrItem.legs));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		if (entity instanceof LivingEntity) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(RageiumaromrItem.boots));
			else
				((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0),
						new ItemStack(RageiumaromrItem.boots));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
