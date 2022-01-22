package net.mcreator.ragemod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

import net.mcreator.ragemod.potion.MegaMineeffectPotionEffect;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.Collection;

public class AlieniteaxeBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure AlieniteaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure AlieniteaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure AlieniteaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure AlieniteaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure AlieniteaxeBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isSneaking() == false) {
			if (new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == MegaMineeffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
						if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock())) {
							if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
									.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock())) {
								if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
										.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock())) {
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
									}
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (World) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
									}
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z)), (World) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 3), (int) z), false);
									}
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)), (World) world,
												new BlockPos((int) x, (int) y, (int) z));
										world.destroyBlock(new BlockPos((int) x, (int) (y + 4), (int) z), false);
									}
									if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
											.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock())) {
										if (world instanceof World) {
											Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z)), (World) world,
													new BlockPos((int) x, (int) y, (int) z));
											world.destroyBlock(new BlockPos((int) x, (int) (y + 5), (int) z), false);
										}
										if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
												.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z))).getBlock())) {
											if (world instanceof World) {
												Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z)), (World) world,
														new BlockPos((int) x, (int) y, (int) z));
												world.destroyBlock(new BlockPos((int) x, (int) (y + 6), (int) z), false);
											}
											if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
													.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z))).getBlock())) {
												if (world instanceof World) {
													Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z)),
															(World) world, new BlockPos((int) x, (int) y, (int) z));
													world.destroyBlock(new BlockPos((int) x, (int) (y + 7), (int) z), false);
												}
												if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:logs"))
														.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 8), (int) z))).getBlock())) {
													if (world instanceof World) {
														Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 8), (int) z)),
																(World) world, new BlockPos((int) x, (int) y, (int) z));
														world.destroyBlock(new BlockPos((int) x, (int) (y + 8), (int) z), false);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
