package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.ragemod.entity.AlienslimeEntity;

public class AlienslimeRenderer extends MobRenderer<AlienslimeEntity, SlimeModel<AlienslimeEntity>> {
	public AlienslimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
		this.addLayer(new EyesLayer<AlienslimeEntity, SlimeModel<AlienslimeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/alien_slime_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AlienslimeEntity entity) {
		return new ResourceLocation("ragemod:textures/alien_slime.png");
	}
}
