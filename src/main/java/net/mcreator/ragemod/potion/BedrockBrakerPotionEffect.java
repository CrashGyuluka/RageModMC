
package net.mcreator.ragemod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockBrakerPotionEffect {
	@ObjectHolder("ragemod:bedrock_braker")
	public static final Effect potion = null;
	@SubscribeEvent
	public static void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}
	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.NEUTRAL, -16571613);
			setRegistryName("bedrock_braker");
			potionIcon = new ResourceLocation("ragemod:textures/bedrock_braker_potio_effect.png");
		}

		@Override
		public String getName() {
			return "effect.bedrock_braker";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
