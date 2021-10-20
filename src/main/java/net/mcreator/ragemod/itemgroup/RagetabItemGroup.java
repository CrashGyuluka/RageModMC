
package net.mcreator.ragemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ragemod.item.RageiumalloyItem;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class RagetabItemGroup extends RagemodModElements.ModElement {
	public RagetabItemGroup(RagemodModElements instance) {
		super(instance, 406);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabragetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RageiumalloyItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
