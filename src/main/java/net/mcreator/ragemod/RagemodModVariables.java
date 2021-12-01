package net.mcreator.ragemod;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class RagemodModVariables {
	public RagemodModVariables(RagemodModElements elements) {
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("ragemod", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("PlayerGotKaribMedal", instance.PlayerGotKaribMedal);
			nbt.putDouble("RageModShieldTimer", instance.RageModShieldTimer);
			nbt.putBoolean("ToxicBlockPlace1", instance.ToxicBlockPlace1);
			nbt.putBoolean("ToxicBlockPlace2", instance.ToxicBlockPlace2);
			nbt.putBoolean("ToxicBlockPlace3", instance.ToxicBlockPlace3);
			nbt.putBoolean("ToxicBlockPlace4", instance.ToxicBlockPlace4);
			nbt.putBoolean("ToxicBlockPlace5", instance.ToxicBlockPlace5);
			nbt.putBoolean("ToxicBlockPlace6", instance.ToxicBlockPlace6);
			nbt.putBoolean("ToxicBlockPlace7", instance.ToxicBlockPlace7);
			nbt.putBoolean("ToxicBlockPlace8", instance.ToxicBlockPlace8);
			nbt.putBoolean("ToxicBlockPlace9", instance.ToxicBlockPlace9);
			nbt.putBoolean("ToxicBlockPlace10", instance.ToxicBlockPlace10);
			nbt.putBoolean("ToxicBlockPlace11", instance.ToxicBlockPlace11);
			nbt.putBoolean("ToxicBlockPlace12", instance.ToxicBlockPlace12);
			nbt.putBoolean("ToxicBlockPlace13", instance.ToxicBlockPlace13);
			nbt.putBoolean("ToxicBlockPlace14", instance.ToxicBlockPlace14);
			nbt.putBoolean("ToxicBlockPlace15", instance.ToxicBlockPlace15);
			nbt.putBoolean("ToxicBlockPlace16", instance.ToxicBlockPlace16);
			nbt.putBoolean("ToxicBlockPlace17", instance.ToxicBlockPlace17);
			nbt.putBoolean("ToxicBlockPlace18", instance.ToxicBlockPlace18);
			nbt.putBoolean("ToxicBlockPlace19", instance.ToxicBlockPlace19);
			nbt.putBoolean("ToxicBlockPlace20", instance.ToxicBlockPlace20);
			nbt.putBoolean("ToxicBlockPlace21", instance.ToxicBlockPlace21);
			nbt.putBoolean("ToxicBlockPlace22", instance.ToxicBlockPlace22);
			nbt.putBoolean("ToxicBlockPlace23", instance.ToxicBlockPlace23);
			nbt.putBoolean("ToxicBlockPlace24", instance.ToxicBlockPlace24);
			nbt.putBoolean("ToxicBlockPlace25", instance.ToxicBlockPlace25);
			nbt.putBoolean("ToxicBlockPlace26", instance.ToxicBlockPlace26);
			nbt.putBoolean("ToxicBlockPlace27", instance.ToxicBlockPlace27);
			nbt.putBoolean("ToxicBlockPlace28", instance.ToxicBlockPlace28);
			nbt.putBoolean("ToxicBlockPlace29", instance.ToxicBlockPlace29);
			nbt.putBoolean("ToxicBlockPlace30", instance.ToxicBlockPlace30);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.PlayerGotKaribMedal = nbt.getBoolean("PlayerGotKaribMedal");
			instance.RageModShieldTimer = nbt.getDouble("RageModShieldTimer");
			instance.ToxicBlockPlace1 = nbt.getBoolean("ToxicBlockPlace1");
			instance.ToxicBlockPlace2 = nbt.getBoolean("ToxicBlockPlace2");
			instance.ToxicBlockPlace3 = nbt.getBoolean("ToxicBlockPlace3");
			instance.ToxicBlockPlace4 = nbt.getBoolean("ToxicBlockPlace4");
			instance.ToxicBlockPlace5 = nbt.getBoolean("ToxicBlockPlace5");
			instance.ToxicBlockPlace6 = nbt.getBoolean("ToxicBlockPlace6");
			instance.ToxicBlockPlace7 = nbt.getBoolean("ToxicBlockPlace7");
			instance.ToxicBlockPlace8 = nbt.getBoolean("ToxicBlockPlace8");
			instance.ToxicBlockPlace9 = nbt.getBoolean("ToxicBlockPlace9");
			instance.ToxicBlockPlace10 = nbt.getBoolean("ToxicBlockPlace10");
			instance.ToxicBlockPlace11 = nbt.getBoolean("ToxicBlockPlace11");
			instance.ToxicBlockPlace12 = nbt.getBoolean("ToxicBlockPlace12");
			instance.ToxicBlockPlace13 = nbt.getBoolean("ToxicBlockPlace13");
			instance.ToxicBlockPlace14 = nbt.getBoolean("ToxicBlockPlace14");
			instance.ToxicBlockPlace15 = nbt.getBoolean("ToxicBlockPlace15");
			instance.ToxicBlockPlace16 = nbt.getBoolean("ToxicBlockPlace16");
			instance.ToxicBlockPlace17 = nbt.getBoolean("ToxicBlockPlace17");
			instance.ToxicBlockPlace18 = nbt.getBoolean("ToxicBlockPlace18");
			instance.ToxicBlockPlace19 = nbt.getBoolean("ToxicBlockPlace19");
			instance.ToxicBlockPlace20 = nbt.getBoolean("ToxicBlockPlace20");
			instance.ToxicBlockPlace21 = nbt.getBoolean("ToxicBlockPlace21");
			instance.ToxicBlockPlace22 = nbt.getBoolean("ToxicBlockPlace22");
			instance.ToxicBlockPlace23 = nbt.getBoolean("ToxicBlockPlace23");
			instance.ToxicBlockPlace24 = nbt.getBoolean("ToxicBlockPlace24");
			instance.ToxicBlockPlace25 = nbt.getBoolean("ToxicBlockPlace25");
			instance.ToxicBlockPlace26 = nbt.getBoolean("ToxicBlockPlace26");
			instance.ToxicBlockPlace27 = nbt.getBoolean("ToxicBlockPlace27");
			instance.ToxicBlockPlace28 = nbt.getBoolean("ToxicBlockPlace28");
			instance.ToxicBlockPlace29 = nbt.getBoolean("ToxicBlockPlace29");
			instance.ToxicBlockPlace30 = nbt.getBoolean("ToxicBlockPlace30");
		}
	}

	public static class PlayerVariables {
		public boolean PlayerGotKaribMedal = false;
		public double RageModShieldTimer = 0;
		public boolean ToxicBlockPlace1 = false;
		public boolean ToxicBlockPlace2 = false;
		public boolean ToxicBlockPlace3 = false;
		public boolean ToxicBlockPlace4 = false;
		public boolean ToxicBlockPlace5 = false;
		public boolean ToxicBlockPlace6 = false;
		public boolean ToxicBlockPlace7 = false;
		public boolean ToxicBlockPlace8 = false;
		public boolean ToxicBlockPlace9 = false;
		public boolean ToxicBlockPlace10 = false;
		public boolean ToxicBlockPlace11 = false;
		public boolean ToxicBlockPlace12 = false;
		public boolean ToxicBlockPlace13 = false;
		public boolean ToxicBlockPlace14 = false;
		public boolean ToxicBlockPlace15 = false;
		public boolean ToxicBlockPlace16 = false;
		public boolean ToxicBlockPlace17 = false;
		public boolean ToxicBlockPlace18 = false;
		public boolean ToxicBlockPlace19 = false;
		public boolean ToxicBlockPlace20 = false;
		public boolean ToxicBlockPlace21 = false;
		public boolean ToxicBlockPlace22 = false;
		public boolean ToxicBlockPlace23 = false;
		public boolean ToxicBlockPlace24 = false;
		public boolean ToxicBlockPlace25 = false;
		public boolean ToxicBlockPlace26 = false;
		public boolean ToxicBlockPlace27 = false;
		public boolean ToxicBlockPlace28 = false;
		public boolean ToxicBlockPlace29 = false;
		public boolean ToxicBlockPlace30 = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				RagemodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.PlayerGotKaribMedal = original.PlayerGotKaribMedal;
		if (!event.isWasDeath()) {
			clone.RageModShieldTimer = original.RageModShieldTimer;
			clone.ToxicBlockPlace1 = original.ToxicBlockPlace1;
			clone.ToxicBlockPlace2 = original.ToxicBlockPlace2;
			clone.ToxicBlockPlace3 = original.ToxicBlockPlace3;
			clone.ToxicBlockPlace4 = original.ToxicBlockPlace4;
			clone.ToxicBlockPlace5 = original.ToxicBlockPlace5;
			clone.ToxicBlockPlace6 = original.ToxicBlockPlace6;
			clone.ToxicBlockPlace7 = original.ToxicBlockPlace7;
			clone.ToxicBlockPlace8 = original.ToxicBlockPlace8;
			clone.ToxicBlockPlace9 = original.ToxicBlockPlace9;
			clone.ToxicBlockPlace10 = original.ToxicBlockPlace10;
			clone.ToxicBlockPlace11 = original.ToxicBlockPlace11;
			clone.ToxicBlockPlace12 = original.ToxicBlockPlace12;
			clone.ToxicBlockPlace13 = original.ToxicBlockPlace13;
			clone.ToxicBlockPlace14 = original.ToxicBlockPlace14;
			clone.ToxicBlockPlace15 = original.ToxicBlockPlace15;
			clone.ToxicBlockPlace16 = original.ToxicBlockPlace16;
			clone.ToxicBlockPlace17 = original.ToxicBlockPlace17;
			clone.ToxicBlockPlace18 = original.ToxicBlockPlace18;
			clone.ToxicBlockPlace19 = original.ToxicBlockPlace19;
			clone.ToxicBlockPlace20 = original.ToxicBlockPlace20;
			clone.ToxicBlockPlace21 = original.ToxicBlockPlace21;
			clone.ToxicBlockPlace22 = original.ToxicBlockPlace22;
			clone.ToxicBlockPlace23 = original.ToxicBlockPlace23;
			clone.ToxicBlockPlace24 = original.ToxicBlockPlace24;
			clone.ToxicBlockPlace25 = original.ToxicBlockPlace25;
			clone.ToxicBlockPlace26 = original.ToxicBlockPlace26;
			clone.ToxicBlockPlace27 = original.ToxicBlockPlace27;
			clone.ToxicBlockPlace28 = original.ToxicBlockPlace28;
			clone.ToxicBlockPlace29 = original.ToxicBlockPlace29;
			clone.ToxicBlockPlace30 = original.ToxicBlockPlace30;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.PlayerGotKaribMedal = message.data.PlayerGotKaribMedal;
					variables.RageModShieldTimer = message.data.RageModShieldTimer;
					variables.ToxicBlockPlace1 = message.data.ToxicBlockPlace1;
					variables.ToxicBlockPlace2 = message.data.ToxicBlockPlace2;
					variables.ToxicBlockPlace3 = message.data.ToxicBlockPlace3;
					variables.ToxicBlockPlace4 = message.data.ToxicBlockPlace4;
					variables.ToxicBlockPlace5 = message.data.ToxicBlockPlace5;
					variables.ToxicBlockPlace6 = message.data.ToxicBlockPlace6;
					variables.ToxicBlockPlace7 = message.data.ToxicBlockPlace7;
					variables.ToxicBlockPlace8 = message.data.ToxicBlockPlace8;
					variables.ToxicBlockPlace9 = message.data.ToxicBlockPlace9;
					variables.ToxicBlockPlace10 = message.data.ToxicBlockPlace10;
					variables.ToxicBlockPlace11 = message.data.ToxicBlockPlace11;
					variables.ToxicBlockPlace12 = message.data.ToxicBlockPlace12;
					variables.ToxicBlockPlace13 = message.data.ToxicBlockPlace13;
					variables.ToxicBlockPlace14 = message.data.ToxicBlockPlace14;
					variables.ToxicBlockPlace15 = message.data.ToxicBlockPlace15;
					variables.ToxicBlockPlace16 = message.data.ToxicBlockPlace16;
					variables.ToxicBlockPlace17 = message.data.ToxicBlockPlace17;
					variables.ToxicBlockPlace18 = message.data.ToxicBlockPlace18;
					variables.ToxicBlockPlace19 = message.data.ToxicBlockPlace19;
					variables.ToxicBlockPlace20 = message.data.ToxicBlockPlace20;
					variables.ToxicBlockPlace21 = message.data.ToxicBlockPlace21;
					variables.ToxicBlockPlace22 = message.data.ToxicBlockPlace22;
					variables.ToxicBlockPlace23 = message.data.ToxicBlockPlace23;
					variables.ToxicBlockPlace24 = message.data.ToxicBlockPlace24;
					variables.ToxicBlockPlace25 = message.data.ToxicBlockPlace25;
					variables.ToxicBlockPlace26 = message.data.ToxicBlockPlace26;
					variables.ToxicBlockPlace27 = message.data.ToxicBlockPlace27;
					variables.ToxicBlockPlace28 = message.data.ToxicBlockPlace28;
					variables.ToxicBlockPlace29 = message.data.ToxicBlockPlace29;
					variables.ToxicBlockPlace30 = message.data.ToxicBlockPlace30;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
