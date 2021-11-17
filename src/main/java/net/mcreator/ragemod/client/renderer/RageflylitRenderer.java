package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.ragemod.entity.RageflylitEntity;
import net.mcreator.ragemod.client.model.Modelragefly_new;

public class RageflylitRenderer extends MobRenderer<RageflylitEntity, Modelragefly_new<RageflylitEntity>> {
	public RageflylitRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelragefly_new(context.bakeLayer(Modelragefly_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<RageflylitEntity, Modelragefly_new<RageflylitEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/ragefly_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RageflylitEntity entity) {
		return new ResourceLocation("ragemod:textures/ragefly_texture.png");
	}
}
