package net.mcreator.ragemod.procedures;

import net.minecraftforge.fmllegacy.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.world.inventory.RttraderguiMenu;

import io.netty.buffer.Unpooled;

public class TraderrtRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.getPersistentData().putDouble("playerTradeCount1", (entity.getPersistentData().getDouble("tradeCount1")));
		sourceentity.getPersistentData().putDouble("playerTradeCount2", (entity.getPersistentData().getDouble("tradeCount2")));
		sourceentity.getPersistentData().putDouble("playerTradeCount3", (entity.getPersistentData().getDouble("tradeCount3")));
		sourceentity.getPersistentData().putDouble("playerTradeItem1", (entity.getPersistentData().getDouble("tradeItem1")));
		sourceentity.getPersistentData().putDouble("playerTradeItem2", (entity.getPersistentData().getDouble("tradeItem2")));
		sourceentity.getPersistentData().putDouble("playerTradeItem3", (entity.getPersistentData().getDouble("tradeItem3")));
		sourceentity.getPersistentData().putDouble("playerTradePage", 1);
		{
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("Rttradergui");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new RttraderguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
