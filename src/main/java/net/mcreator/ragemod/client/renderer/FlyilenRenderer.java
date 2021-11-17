package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.ragemod.entity.FlyilenEntity;

public class FlyilenRenderer extends MobRenderer<FlyilenEntity, GhastModel<FlyilenEntity>> {
	public FlyilenRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
		this.addLayer(new EyesLayer<FlyilenEntity, GhastModel<FlyilenEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/flylien_light.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FlyilenEntity entity) {
		return new ResourceLocation("ragemod:textures/flylien_2.png");
	}
}
