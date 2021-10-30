
package net.mcreator.ragemod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ragemod.block.RageFaLogBlock;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class TermeszettabItemGroup extends RagemodModElements.ModElement {
	public TermeszettabItemGroup(RagemodModElements instance) {
		super(instance, 790);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtermeszettab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RageFaLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
