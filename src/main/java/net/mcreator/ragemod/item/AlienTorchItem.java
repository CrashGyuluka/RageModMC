
package net.mcreator.ragemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.procedures.AlienTorchRightClickedOnBlockProcedure;
import net.mcreator.ragemod.itemgroup.TermeszettabItemGroup;
import net.mcreator.ragemod.RagemodModElements;

import com.google.common.collect.ImmutableMap;

@RagemodModElements.ModElement.Tag
public class AlienTorchItem extends RagemodModElements.ModElement {
	@ObjectHolder("ragemod:alien_torch")
	public static final Item block = null;

	public AlienTorchItem(RagemodModElements instance) {
		super(instance, 226);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TermeszettabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("alien_torch");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
			ActionResultType retval = super.onItemUseFirst(stack, context);
			World world = context.getWorld();
			BlockPos pos = context.getPos();
			PlayerEntity entity = context.getPlayer();
			Direction direction = context.getFace();
			BlockState blockstate = world.getBlockState(pos);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			ItemStack itemstack = context.getItem();

			AlienTorchRightClickedOnBlockProcedure.executeProcedure(ImmutableMap.<String, Object>builder().put("direction", direction).put("x", x)
					.put("y", y).put("z", z).put("world", world).build());
			return retval;
		}
	}
}
