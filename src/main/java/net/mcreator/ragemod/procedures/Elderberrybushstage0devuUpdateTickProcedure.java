package net.mcreator.ragemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.ragemod.block.FloweryElderberryLeavesBlock;
import net.mcreator.ragemod.block.ElderberryleavesBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.HashMap;

public class Elderberrybushstage0devuUpdateTickProcedure {
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
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Elderberrybushstage0devuUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure Elderberrybushstage0devuUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure Elderberrybushstage0devuUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure Elderberrybushstage0devuUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Elderberrybushstage0devuUpdateTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Growth = 0;
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ElderberryleavesBlock.block)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
				world.addParticle(ParticleTypes.COMPOSTER, x, y, z, 0, 1, 0);
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(
							((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(), (int) 40);
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) (y + 1), (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, (y + 1), z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 40);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, (y + 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 40);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, (y + 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 40);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, (y - 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), (y - 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), (y + 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), (y + 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), (y - 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), (y - 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), (y - 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), (y + 1), (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), (y + 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), (y + 1), z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), (y + 1), z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, (y - 1), (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, y, (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, y, (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, z, 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) y, (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), y, (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, (z - 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) y, (int) (z - 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), y, (z - 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x + 1), (int) y, (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x + 1), y, (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == ElderberryleavesBlock.block)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z + 1));
						BlockState _bs = FloweryElderberryLeavesBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, (z + 1), 0, 1, 0);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (x - 1), (int) y, (int) (z + 1)),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound((x - 1), y, (z + 1),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(
								((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem(),
								(int) 50);
				}
			}
		}
	}
}
