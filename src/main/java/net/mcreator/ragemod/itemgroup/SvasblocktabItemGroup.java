
package net.mcreator.ragemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ragemod.block.SavasnetherrackBlock;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class SvasblocktabItemGroup extends RagemodModElements.ModElement {
	public SvasblocktabItemGroup(RagemodModElements instance) {
		super(instance, 498);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsvasblocktab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SavasnetherrackBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
