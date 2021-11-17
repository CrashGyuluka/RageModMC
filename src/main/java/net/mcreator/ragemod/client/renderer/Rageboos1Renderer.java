package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.ragemod.entity.Rageboos1Entity;

public class Rageboos1Renderer extends MobRenderer<Rageboos1Entity, SpiderModel<Rageboos1Entity>> {
	public Rageboos1Renderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
		this.addLayer(new EyesLayer<Rageboos1Entity, SpiderModel<Rageboos1Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/boss1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Rageboos1Entity entity) {
		return new ResourceLocation("ragemod:textures/boss1.png");
	}
}
