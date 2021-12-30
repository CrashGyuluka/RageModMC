
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ragemod.client.gui.KonvertaloguiScreen;
import net.mcreator.ragemod.client.gui.Book3Screen;
import net.mcreator.ragemod.client.gui.Book2Screen;
import net.mcreator.ragemod.client.gui.Book1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RagemodModMenus.BOOK_1, Book1Screen::new);
			MenuScreens.register(RagemodModMenus.BOOK_2, Book2Screen::new);
			MenuScreens.register(RagemodModMenus.BOOK_3, Book3Screen::new);
			MenuScreens.register(RagemodModMenus.KONVERTALOGUI, KonvertaloguiScreen::new);
		});
	}
}
