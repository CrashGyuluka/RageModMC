package net.mcreator.ragemod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.entity.RagemiteEntity;
import net.mcreator.ragemod.entity.AtomRageREntity;

public class RageoverlayDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (!world.getEntitiesOfClass(AtomRageREntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 3, 3, 3),
				e -> true).isEmpty()
				|| !world.getEntitiesOfClass(RagemiteEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 3, 3, 3),
						e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}
