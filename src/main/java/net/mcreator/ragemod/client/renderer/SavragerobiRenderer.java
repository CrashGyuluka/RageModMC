package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ragemod.entity.SavragerobiEntity;
import net.mcreator.ragemod.client.model.Modeltoxic_helper_1_17;

public class SavragerobiRenderer extends MobRenderer<SavragerobiEntity, Modeltoxic_helper_1_17<SavragerobiEntity>> {
	public SavragerobiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoxic_helper_1_17(context.bakeLayer(Modeltoxic_helper_1_17.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SavragerobiEntity entity) {
		return new ResourceLocation("ragemod:textures/savrob_texture1.png");
	}
}
