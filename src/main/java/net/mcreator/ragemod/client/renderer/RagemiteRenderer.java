package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.ragemod.entity.RagemiteEntity;

public class RagemiteRenderer extends MobRenderer<RagemiteEntity, SilverfishModel<RagemiteEntity>> {
	public RagemiteRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
		this.addLayer(new EyesLayer<RagemiteEntity, SilverfishModel<RagemiteEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/ragemite.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RagemiteEntity entity) {
		return new ResourceLocation("ragemod:textures/ragemite.png");
	}
}
