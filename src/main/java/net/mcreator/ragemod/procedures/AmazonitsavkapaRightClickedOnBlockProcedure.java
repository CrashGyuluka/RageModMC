package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.item.AmazonitsavkapaItem;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.HashMap;

public class AmazonitsavkapaRightClickedOnBlockProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure AmazonitsavkapaRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure AmazonitsavkapaRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure AmazonitsavkapaRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure AmazonitsavkapaRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure AmazonitsavkapaRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == AmazonitsavkapaItem.block)) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.block.material.Material.EARTH)
					|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.block.material.Material.ORGANIC))) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
	}
}
