package net.mcreator.ragemod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ragemod.init.RagemodModItems;

public class HarchelpcommCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.NETHERITE_SWORD);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
			_setstack.setCount(64);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(3, new ItemStack(RagemodModItems.RAGEIUMAROMR_HELMET));
			else
				_entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(RagemodModItems.RAGEIUMAROMR_HELMET));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(2, new ItemStack(RagemodModItems.RAGEIUMAROMR_CHESTPLATE));
			else
				_entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(RagemodModItems.RAGEIUMAROMR_CHESTPLATE));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(1, new ItemStack(RagemodModItems.RAGEIUMAROMR_LEGGINGS));
			else
				_entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(RagemodModItems.RAGEIUMAROMR_LEGGINGS));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(0, new ItemStack(RagemodModItems.RAGEIUMAROMR_BOOTS));
			else
				_entity.setItemSlot(EquipmentSlot.FEET, new ItemStack(RagemodModItems.RAGEIUMAROMR_BOOTS));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
	}
}
