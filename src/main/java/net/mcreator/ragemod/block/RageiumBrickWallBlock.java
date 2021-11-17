
package net.mcreator.ragemod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.init.RagemodModParticles;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class RageiumBrickWallBlock extends WallBlock {
	public RageiumBrickWallBlock() {
		super(Block.Properties.of(Material.METAL).sound(SoundType.NETHERITE_BLOCK).strength(4f, 100f).lightLevel(s -> 0).requiresCorrectToolForDrops()
				.friction(0.7f));
		setRegistryName("rageium_brick_wall");
	}

	private static final int WALL_WIDTH = 3;
	private static final int WALL_HEIGHT = 14;
	private static final int POST_WIDTH = 4;
	private static final int POST_COVER_WIDTH = 1;
	private static final int WALL_COVER_START = 7;
	private static final int WALL_COVER_END = 9;
	private static final VoxelShape POST_TEST = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
	private static final VoxelShape NORTH_TEST = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 9.0D);
	private static final VoxelShape SOUTH_TEST = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 16.0D);
	private static final VoxelShape WEST_TEST = Block.box(0.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);
	private static final VoxelShape EAST_TEST = Block.box(7.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext p_57973_) {
		LevelReader levelreader = p_57973_.getLevel();
		BlockPos blockpos = p_57973_.getClickedPos();
		FluidState fluidstate = p_57973_.getLevel().getFluidState(p_57973_.getClickedPos());
		BlockPos blockpos1 = blockpos.north();
		BlockPos blockpos2 = blockpos.east();
		BlockPos blockpos3 = blockpos.south();
		BlockPos blockpos4 = blockpos.west();
		BlockPos blockpos5 = blockpos.above();
		BlockState blockstate = levelreader.getBlockState(blockpos1);
		BlockState blockstate1 = levelreader.getBlockState(blockpos2);
		BlockState blockstate2 = levelreader.getBlockState(blockpos3);
		BlockState blockstate3 = levelreader.getBlockState(blockpos4);
		BlockState blockstate4 = levelreader.getBlockState(blockpos5);
		boolean flag = this.connectsTo(blockstate, blockstate.isFaceSturdy(levelreader, blockpos1, Direction.SOUTH), Direction.SOUTH);
		boolean flag1 = this.connectsTo(blockstate1, blockstate1.isFaceSturdy(levelreader, blockpos2, Direction.WEST), Direction.WEST);
		boolean flag2 = this.connectsTo(blockstate2, blockstate2.isFaceSturdy(levelreader, blockpos3, Direction.NORTH), Direction.NORTH);
		boolean flag3 = this.connectsTo(blockstate3, blockstate3.isFaceSturdy(levelreader, blockpos4, Direction.EAST), Direction.EAST);
		BlockState blockstate5 = this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
		return this.updateShape(levelreader, blockstate5, blockpos5, blockstate4, flag, flag1, flag2, flag3);
	}

	@Override
	public BlockState updateShape(BlockState p_58014_, Direction p_58015_, BlockState p_58016_, LevelAccessor p_58017_, BlockPos p_58018_,
			BlockPos p_58019_) {
		if (p_58014_.getValue(WATERLOGGED)) {
			p_58017_.getLiquidTicks().scheduleTick(p_58018_, Fluids.WATER, Fluids.WATER.getTickDelay(p_58017_));
		}
		if (p_58015_ == Direction.DOWN) {
			return super.updateShape(p_58014_, p_58015_, p_58016_, p_58017_, p_58018_, p_58019_);
		} else {
			return p_58015_ == Direction.UP
					? this.topUpdate(p_58017_, p_58014_, p_58019_, p_58016_)
					: this.sideUpdate(p_58017_, p_58018_, p_58014_, p_58019_, p_58016_, p_58015_);
		}
	}

	private BlockState topUpdate(LevelReader p_57975_, BlockState p_57976_, BlockPos p_57977_, BlockState p_57978_) {
		boolean flag = isConnected(p_57976_, NORTH_WALL);
		boolean flag1 = isConnected(p_57976_, EAST_WALL);
		boolean flag2 = isConnected(p_57976_, SOUTH_WALL);
		boolean flag3 = isConnected(p_57976_, WEST_WALL);
		return this.updateShape(p_57975_, p_57976_, p_57977_, p_57978_, flag, flag1, flag2, flag3);
	}

	private BlockState sideUpdate(LevelReader p_57989_, BlockPos p_57990_, BlockState p_57991_, BlockPos p_57992_, BlockState p_57993_,
			Direction p_57994_) {
		Direction direction = p_57994_.getOpposite();
		boolean flag = p_57994_ == Direction.NORTH
				? this.connectsTo(p_57993_, p_57993_.isFaceSturdy(p_57989_, p_57992_, direction), direction)
				: isConnected(p_57991_, NORTH_WALL);
		boolean flag1 = p_57994_ == Direction.EAST
				? this.connectsTo(p_57993_, p_57993_.isFaceSturdy(p_57989_, p_57992_, direction), direction)
				: isConnected(p_57991_, EAST_WALL);
		boolean flag2 = p_57994_ == Direction.SOUTH
				? this.connectsTo(p_57993_, p_57993_.isFaceSturdy(p_57989_, p_57992_, direction), direction)
				: isConnected(p_57991_, SOUTH_WALL);
		boolean flag3 = p_57994_ == Direction.WEST
				? this.connectsTo(p_57993_, p_57993_.isFaceSturdy(p_57989_, p_57992_, direction), direction)
				: isConnected(p_57991_, WEST_WALL);
		BlockPos blockpos = p_57990_.above();
		BlockState blockstate = p_57989_.getBlockState(blockpos);
		return this.updateShape(p_57989_, p_57991_, blockpos, blockstate, flag, flag1, flag2, flag3);
	}

	private BlockState updateShape(LevelReader p_57980_, BlockState p_57981_, BlockPos p_57982_, BlockState p_57983_, boolean p_57984_,
			boolean p_57985_, boolean p_57986_, boolean p_57987_) {
		VoxelShape voxelshape = p_57983_.getCollisionShape(p_57980_, p_57982_).getFaceShape(Direction.DOWN);
		BlockState blockstate = this.updateSides(p_57981_, p_57984_, p_57985_, p_57986_, p_57987_, voxelshape);
		return blockstate.setValue(UP, Boolean.valueOf(this.shouldRaisePost(blockstate, p_57983_, voxelshape)));
	}

	private BlockState updateSides(BlockState p_58025_, boolean p_58026_, boolean p_58027_, boolean p_58028_, boolean p_58029_, VoxelShape p_58030_) {
		return p_58025_.setValue(NORTH_WALL, this.makeWallState(p_58026_, p_58030_, NORTH_TEST))
				.setValue(EAST_WALL, this.makeWallState(p_58027_, p_58030_, EAST_TEST))
				.setValue(SOUTH_WALL, this.makeWallState(p_58028_, p_58030_, SOUTH_TEST))
				.setValue(WEST_WALL, this.makeWallState(p_58029_, p_58030_, WEST_TEST));
	}

	private WallSide makeWallState(boolean p_58042_, VoxelShape p_58043_, VoxelShape p_58044_) {
		if (p_58042_) {
			return isCovered(p_58043_, p_58044_) ? WallSide.TALL : WallSide.LOW;
		} else {
			return WallSide.NONE;
		}
	}

	private boolean shouldRaisePost(BlockState p_58007_, BlockState p_58008_, VoxelShape p_58009_) {
		boolean flag = p_58008_.getBlock() instanceof WallBlock && p_58008_.getValue(UP);
		if (flag) {
			return true;
		} else {
			WallSide wallside = p_58007_.getValue(NORTH_WALL);
			WallSide wallside1 = p_58007_.getValue(SOUTH_WALL);
			WallSide wallside2 = p_58007_.getValue(EAST_WALL);
			WallSide wallside3 = p_58007_.getValue(WEST_WALL);
			boolean flag1 = wallside1 == WallSide.NONE;
			boolean flag2 = wallside3 == WallSide.NONE;
			boolean flag3 = wallside2 == WallSide.NONE;
			boolean flag4 = wallside == WallSide.NONE;
			boolean flag5 = flag4 && flag1 && flag2 && flag3 || flag4 != flag1 || flag2 != flag3;
			if (flag5) {
				return true;
			} else {
				boolean flag6 = wallside == WallSide.TALL && wallside1 == WallSide.TALL || wallside2 == WallSide.TALL && wallside3 == WallSide.TALL;
				if (flag6) {
					return false;
				} else {
					return p_58008_.is(BlockTags.WALL_POST_OVERRIDE) || isCovered(p_58009_, POST_TEST);
				}
			}
		}
	}

	private boolean connectsTo(BlockState state, boolean checkattach, Direction face) {
		boolean flag = state.getBlock() instanceof WallBlock
				|| state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
		return !isExceptionForConnection(state) && checkattach || flag;
	}

	private static boolean isConnected(BlockState state, Property<WallSide> heightProperty) {
		return state.getValue(heightProperty) != WallSide.NONE;
	}

	private static boolean isCovered(VoxelShape shape1, VoxelShape shape2) {
		return !Shapes.joinIsNotEmpty(shape2, shape1, BooleanOp.ONLY_FIRST);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Thank you Lyof! :D"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if (true)
			for (int l = 0; l < 1; ++l) {
				double d0 = (x + random.nextFloat());
				double d1 = (y + random.nextFloat());
				double d2 = (z + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.2999999985098839D;
				double d4 = (random.nextFloat() - 0.5D) * 0.2999999985098839D;
				double d5 = (random.nextFloat() - 0.5D) * 0.2999999985098839D;
				world.addParticle(RagemodModParticles.PARTICLE_2, d0, d1, d2, d3, d4, d5);
			}
	}
}
