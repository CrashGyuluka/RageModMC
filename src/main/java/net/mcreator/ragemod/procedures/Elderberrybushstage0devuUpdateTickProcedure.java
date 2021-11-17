package net.mcreator.ragemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Elderberrybushstage0devuUpdateTickProcedure {
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
		double Growth = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
					world.setBlock(_bp, _bs, 3);
				}
				world.addParticle(ParticleTypes.COMPOSTER, x, y, z, 0, 1, 0);
				if (world instanceof Level _level)
					_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
				if (entity instanceof Player _player)
					_player.getCooldowns()
							.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, (y + 1), z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, (y + 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, (y + 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 40);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, (y - 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), (y - 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), (y + 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), (y + 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), (y - 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), (y - 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y - 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), (y - 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), (y + 1), (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))))
						.getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), (y + 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), (y + 1), z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), (y + 1), z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), (y + 1), z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), (y + 1), z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, (y - 1), (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, (y - 1), (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, y, (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, x, y, (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, z, 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), y, (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, (z - 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), y, (z - 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x + 1), y, (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x + 1), y, (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == RagemodModBlocks.ELDERBERRY_LEAVES) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z + 1));
						BlockState _bs = RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES.defaultBlockState();
						world.setBlock(_bp, _bs, 3);
					}
					world.addParticle(ParticleTypes.COMPOSTER, (x - 1), y, (z + 1), 0, 1, 0);
					if (world instanceof Level _level)
						_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, (x - 1), y, (z + 1),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.composter.ready")), SoundSource.NEUTRAL, 1, 1);
					if (entity instanceof Player _player)
						_player.getCooldowns()
								.addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 50);
				}
			}
		}
	}
}
