
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.procedures.AlieniteshieldRightClickedInAirProcedure;
import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class AlieniteshieldItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:alieniteshield")
	public static final Item block = null;

	public AlieniteshieldItem(RagemodModElements instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				AlieniteshieldRightClickedInAirProcedure
						.executeProcedure(ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
				return retval;
			}

			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				BlockState blockstate = world.getBlockState(pos);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();

				AlieniteshieldRightClickedInAirProcedure
						.executeProcedure(ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
				return retval;
			}
		}.setRegistryName("alieniteshield"));
	}

	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ErcekItemGroup.tab).maxDamage(6942).isImmuneToFire());
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", -2f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -4, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}
	}
}
