package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ragemod.entity.Mob1Entity;
import net.mcreator.ragemod.client.model.Modeltoxic_mob;

public class Mob1Renderer extends MobRenderer<Mob1Entity, Modeltoxic_mob<Mob1Entity>> {
	public Mob1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoxic_mob(context.bakeLayer(Modeltoxic_mob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Mob1Entity entity) {
		return new ResourceLocation("ragemod:textures/mob1texture2.png");
	}
}
