
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.ragemod.world.inventory.RttraderguiMenu;
import net.mcreator.ragemod.world.inventory.KonvertaloguiMenu;
import net.mcreator.ragemod.world.inventory.CrashchestguiMenu;
import net.mcreator.ragemod.world.inventory.Book3Menu;
import net.mcreator.ragemod.world.inventory.Book2Menu;
import net.mcreator.ragemod.world.inventory.Book1Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CrashchestguiMenu> CRASHCHESTGUI = register("crashchestgui",
			(id, inv, extraData) -> new CrashchestguiMenu(id, inv, extraData));
	public static final MenuType<Book1Menu> BOOK_1 = register("book_1", (id, inv, extraData) -> new Book1Menu(id, inv, extraData));
	public static final MenuType<Book2Menu> BOOK_2 = register("book_2", (id, inv, extraData) -> new Book2Menu(id, inv, extraData));
	public static final MenuType<Book3Menu> BOOK_3 = register("book_3", (id, inv, extraData) -> new Book3Menu(id, inv, extraData));
	public static final MenuType<RttraderguiMenu> RTTRADERGUI = register("rttradergui",
			(id, inv, extraData) -> new RttraderguiMenu(id, inv, extraData));
	public static final MenuType<KonvertaloguiMenu> KONVERTALOGUI = register("konvertalogui",
			(id, inv, extraData) -> new KonvertaloguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
