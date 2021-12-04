package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ragemod.entity.RageflyEntity;
import net.mcreator.ragemod.client.model.Modelragefly;

public class RageflyRenderer extends MobRenderer<RageflyEntity, Modelragefly<RageflyEntity>> {
	public RageflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelragefly(context.bakeLayer(Modelragefly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RageflyEntity entity) {
		return new ResourceLocation("ragemod:textures/ragefly_texture.png");
	}
}
