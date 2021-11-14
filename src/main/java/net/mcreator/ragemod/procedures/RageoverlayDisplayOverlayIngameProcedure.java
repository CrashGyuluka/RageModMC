package net.mcreator.ragemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.entity.RagemiteEntity;
import net.mcreator.ragemod.entity.Rageboos1Entity;
import net.mcreator.ragemod.entity.AtomRageREntity;
import net.mcreator.ragemod.RagemodMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class RageoverlayDisplayOverlayIngameProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure RageoverlayDisplayOverlayIngame!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure RageoverlayDisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((Entity) world
				.getEntitiesWithinAABB(AtomRageREntity.CustomEntity.class,
						new AxisAlignedBB((entity.getPosX()) - (7 / 2d), (entity.getPosY()) - (7 / 2d), (entity.getPosZ()) - (7 / 2d),
								(entity.getPosX()) + (7 / 2d), (entity.getPosY()) + (7 / 2d), (entity.getPosZ()) + (7 / 2d)),
						null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) != null || ((Entity) world
						.getEntitiesWithinAABB(RagemiteEntity.CustomEntity.class,
								new AxisAlignedBB((entity.getPosX()) - (7 / 2d), (entity.getPosY()) - (7 / 2d), (entity.getPosZ()) - (7 / 2d),
										(entity.getPosX()) + (7 / 2d), (entity.getPosY()) + (7 / 2d), (entity.getPosZ()) + (7 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) != null
				|| ((Entity) world
						.getEntitiesWithinAABB(Rageboos1Entity.CustomEntity.class,
								new AxisAlignedBB((entity.getPosX()) - (7 / 2d), (entity.getPosY()) - (7 / 2d), (entity.getPosZ()) - (7 / 2d),
										(entity.getPosX()) + (7 / 2d), (entity.getPosY()) + (7 / 2d), (entity.getPosZ()) + (7 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).findFirst().orElse(null)) != null) {
			return true;
		}
		return false;
	}
}
