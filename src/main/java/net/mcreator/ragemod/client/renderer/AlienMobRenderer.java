package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.ragemod.entity.AlienMobEntity;
import net.mcreator.ragemod.client.model.Modelalien_mob;

public class AlienMobRenderer extends MobRenderer<AlienMobEntity, Modelalien_mob<AlienMobEntity>> {
	public AlienMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalien_mob(context.bakeLayer(Modelalien_mob.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AlienMobEntity, Modelalien_mob<AlienMobEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/alien_mob_texture_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AlienMobEntity entity) {
		return new ResourceLocation("ragemod:textures/alien_mob_texture.png");
	}
}
