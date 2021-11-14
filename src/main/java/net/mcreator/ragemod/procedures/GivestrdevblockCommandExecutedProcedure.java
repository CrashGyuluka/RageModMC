package net.mcreator.ragemod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ragemod.block.Structurehatarolo1Block;
import net.mcreator.ragemod.block.Strhatarolo6Block;
import net.mcreator.ragemod.block.Strhatarolo5Block;
import net.mcreator.ragemod.block.Strhatarolo4Block;
import net.mcreator.ragemod.block.Strhatarolo3Block;
import net.mcreator.ragemod.block.Strhatarolo2Block;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;

public class GivestrdevblockCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure GivestrdevblockCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Structurehatarolo1Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Strhatarolo2Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Strhatarolo3Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Strhatarolo4Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Strhatarolo5Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Strhatarolo6Block.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
