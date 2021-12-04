
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscinspirationItem extends RecordItem {
	public DiscinspirationItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
				new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("disc_inspiration");
	}
}
