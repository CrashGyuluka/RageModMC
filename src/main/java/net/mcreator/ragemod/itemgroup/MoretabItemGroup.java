
package net.mcreator.ragemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ragemod.block.ParkettaBlock;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class MoretabItemGroup extends RagemodModElements.ModElement {
	public MoretabItemGroup(RagemodModElements instance) {
		super(instance, 1297);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmoretab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ParkettaBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
