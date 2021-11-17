package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.world.ToxicGivesYouBadEffectsGameRule;
import net.mcreator.ragemod.potion.SavellenallasPotionEffect;
import net.mcreator.ragemod.entity.SavragerobiEntity;
import net.mcreator.ragemod.entity.Mob1Entity;
import net.mcreator.ragemod.RagemodMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;
import java.util.Collection;

public class Savmobcloseproc1Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure Savmobcloseproc1!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure Savmobcloseproc1!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (true == world.getWorldInfo().getGameRulesInstance().getBoolean(ToxicGivesYouBadEffectsGameRule.gamerule) && !(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SavellenallasPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) && (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.ADVENTURE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (((Entity) world
					.getEntitiesWithinAABB(Mob1Entity.CustomEntity.class,
							new AxisAlignedBB((entity.getPosX()) - (2 / 2d), (entity.getPosY()) - (2 / 2d), (entity.getPosZ()) - (2 / 2d),
									(entity.getPosX()) + (2 / 2d), (entity.getPosY()) + (2 / 2d), (entity.getPosZ()) + (2 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) != null || ((Entity) world
							.getEntitiesWithinAABB(SavragerobiEntity.CustomEntity.class,
									new AxisAlignedBB((entity.getPosX()) - (2 / 2d), (entity.getPosY()) - (2 / 2d), (entity.getPosZ()) - (2 / 2d),
											(entity.getPosX()) + (2 / 2d), (entity.getPosY()) + (2 / 2d), (entity.getPosZ()) + (2 / 2d)),
									null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) != null) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 20, (int) 1, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 20, (int) 1, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 20, (int) 1, (false), (false)));
			}
		}
	}
}
