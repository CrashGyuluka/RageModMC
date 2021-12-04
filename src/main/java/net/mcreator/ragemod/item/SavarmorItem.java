
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public abstract class SavarmorItem extends ArmorItem {
	public SavarmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 8, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.SAVKRISTALYP_2));
			}

			@Override
			public String getName() {
				return "savarmor";
			}

			@Override
			public float getToughness() {
				return 1.7999999999999998f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SavarmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK));
			setRegistryName("savarmor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/--savarmor__layer_1.png";
		}
	}

	public static class Chestplate extends SavarmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK));
			setRegistryName("savarmor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/--savarmor__layer_1.png";
		}
	}

	public static class Leggings extends SavarmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK));
			setRegistryName("savarmor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/--savarmor__layer_2.png";
		}
	}

	public static class Boots extends SavarmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK));
			setRegistryName("savarmor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ragemod:textures/models/armor/--savarmor__layer_1.png";
		}
	}
}
