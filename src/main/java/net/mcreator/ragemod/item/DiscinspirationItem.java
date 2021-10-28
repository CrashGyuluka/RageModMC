
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class DiscinspirationItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:discinspiration")
	public static final Item block = null;
	public DiscinspirationItem(RagemodModElements instance) {
		super(instance, 1442);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, RagemodModElements.sounds.get(new ResourceLocation("ragemod:crashgyuluka_inspiration")),
					new Item.Properties().group(ErcekItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("discinspiration");
		}
	}
}
