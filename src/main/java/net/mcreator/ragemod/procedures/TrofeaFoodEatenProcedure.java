package net.mcreator.ragemod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.resources.ResourceLocation;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TrofeaFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:toxic_mobs")).contains(entityiterator.getType())) {
					entityiterator.hurt(DamageSource.GENERIC, 60);
				}
			}
		}
	}
}
