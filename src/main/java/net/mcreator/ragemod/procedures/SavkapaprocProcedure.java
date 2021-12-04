package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModItems;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class SavkapaprocProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RagemodModItems.SAVKAPA
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RagemodModItems.ALIENITEHOE) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.DIRT
					|| (world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
							.getMaterial() == net.minecraft.world.level.material.Material.GRASS) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1));
					BlockState _bs = Blocks.FARMLAND.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
