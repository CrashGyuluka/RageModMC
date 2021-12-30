
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ragemod.client.model.Modeltoxic_mob;
import net.mcreator.ragemod.client.model.Modeltoxic_helper_1_17;
import net.mcreator.ragemod.client.model.Modelragefly;
import net.mcreator.ragemod.client.model.Modelalien_mob;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RagemodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltoxic_mob.LAYER_LOCATION, Modeltoxic_mob::createBodyLayer);
		event.registerLayerDefinition(Modelalien_mob.LAYER_LOCATION, Modelalien_mob::createBodyLayer);
		event.registerLayerDefinition(Modelragefly.LAYER_LOCATION, Modelragefly::createBodyLayer);
		event.registerLayerDefinition(Modeltoxic_helper_1_17.LAYER_LOCATION, Modeltoxic_helper_1_17::createBodyLayer);
	}
}
