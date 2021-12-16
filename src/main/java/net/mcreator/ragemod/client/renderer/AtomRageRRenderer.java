package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.ragemod.entity.AtomRageREntity;

public class AtomRageRRenderer extends MobRenderer<AtomRageREntity, CreeperModel<AtomRageREntity>> {
	public AtomRageRRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
		this.addLayer(new EyesLayer<AtomRageREntity, CreeperModel<AtomRageREntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/atomragernew.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AtomRageREntity entity) {
		return new ResourceLocation("ragemod:textures/atomragernew.png");
	}
}
