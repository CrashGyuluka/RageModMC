package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.ragemod.entity.Rageflylit2Entity;
import net.mcreator.ragemod.client.model.Modelragefly_new;

public class Rageflylit2Renderer extends MobRenderer<Rageflylit2Entity, Modelragefly_new<Rageflylit2Entity>> {
	public Rageflylit2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelragefly_new(context.bakeLayer(Modelragefly_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<Rageflylit2Entity, Modelragefly_new<Rageflylit2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/ragefly_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Rageflylit2Entity entity) {
		return new ResourceLocation("ragemod:textures/ragefly_texture.png");
	}
}
