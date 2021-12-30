
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ragemod.client.renderer.SavragerobiRenderer;
import net.mcreator.ragemod.client.renderer.RagemiteRenderer;
import net.mcreator.ragemod.client.renderer.RageflylitRenderer;
import net.mcreator.ragemod.client.renderer.Rageflylit2Renderer;
import net.mcreator.ragemod.client.renderer.RageflyRenderer;
import net.mcreator.ragemod.client.renderer.Rageboos1Renderer;
import net.mcreator.ragemod.client.renderer.PoliposRenderer;
import net.mcreator.ragemod.client.renderer.Mob1Renderer;
import net.mcreator.ragemod.client.renderer.FlyilenRenderer;
import net.mcreator.ragemod.client.renderer.AtomRageRRenderer;
import net.mcreator.ragemod.client.renderer.AlienslimeRenderer;
import net.mcreator.ragemod.client.renderer.AlienMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RagemodModEntities.RAGEMITE, RagemiteRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.ATOM_RAGE_R, AtomRageRRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGEBOOS_1, Rageboos1Renderer::new);
		event.registerEntityRenderer(RagemodModEntities.TOXIC_MOB, Mob1Renderer::new);
		event.registerEntityRenderer(RagemodModEntities.SAVRAGEROBI, SavragerobiRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.ALIEN_MOB, AlienMobRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGEARROW, ThrownItemRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGEFLY, RageflyRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.FLYLIEN, FlyilenRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.ALIENSLIME, AlienslimeRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.POLIPOS, PoliposRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGEFLYLIT, RageflylitRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGEFLYLIT_2, Rageflylit2Renderer::new);
	}
}
