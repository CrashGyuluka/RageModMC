
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RagemodModTabs {
	public static CreativeModeTab TAB_ERCEK;
	public static CreativeModeTab TAB_TERMESZETTAB;

	public static void load() {
		TAB_ERCEK = new CreativeModeTab("tabercek") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RagemodModItems.RAGEIUMALLOY);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TERMESZETTAB = new CreativeModeTab("tabtermeszettab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RagemodModBlocks.RAGE_FA_LOG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
