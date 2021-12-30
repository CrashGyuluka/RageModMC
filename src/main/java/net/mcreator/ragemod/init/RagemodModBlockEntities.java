
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ragemod.block.entity.SequoiaSaplingBlockEntity;
import net.mcreator.ragemod.block.entity.RagefasaplingBlockEntity;
import net.mcreator.ragemod.block.entity.PortalrtBlockEntity;
import net.mcreator.ragemod.block.entity.KonvertaloBlockEntity;
import net.mcreator.ragemod.block.entity.FloweryElderberryLeavesBlockEntity;
import net.mcreator.ragemod.block.entity.Fa5sapBlockEntity;
import net.mcreator.ragemod.block.entity.Fa4sapBlockEntity;
import net.mcreator.ragemod.block.entity.Fa3sapBlockEntity;
import net.mcreator.ragemod.block.entity.ElderberryleavesBlockEntity;
import net.mcreator.ragemod.block.entity.BukkspalingBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> PORTALRT = register("ragemod:portalrt", RagemodModBlocks.PORTALRT, PortalrtBlockEntity::new);
	public static final BlockEntityType<?> CONVERTER = register("ragemod:converter", RagemodModBlocks.CONVERTER, KonvertaloBlockEntity::new);
	public static final BlockEntityType<?> RAGETREE_SAPLING = register("ragemod:ragetree_sapling", RagemodModBlocks.RAGETREE_SAPLING,
			RagefasaplingBlockEntity::new);
	public static final BlockEntityType<?> BEECH_SAPLING = register("ragemod:beech_sapling", RagemodModBlocks.BEECH_SAPLING,
			BukkspalingBlockEntity::new);
	public static final BlockEntityType<?> KIZUKRA_SAPLING = register("ragemod:kizukra_sapling", RagemodModBlocks.KIZUKRA_SAPLING,
			Fa3sapBlockEntity::new);
	public static final BlockEntityType<?> ROBTAI_SAPLING = register("ragemod:robtai_sapling", RagemodModBlocks.ROBTAI_SAPLING,
			Fa4sapBlockEntity::new);
	public static final BlockEntityType<?> FA_5SAP = register("ragemod:fa_5sap", RagemodModBlocks.FA_5SAP, Fa5sapBlockEntity::new);
	public static final BlockEntityType<?> SEQUOIA_SAPLING = register("ragemod:sequoia_sapling", RagemodModBlocks.SEQUOIA_SAPLING,
			SequoiaSaplingBlockEntity::new);
	public static final BlockEntityType<?> ELDERBERRY_LEAVES = register("ragemod:elderberry_leaves", RagemodModBlocks.ELDERBERRY_LEAVES,
			ElderberryleavesBlockEntity::new);
	public static final BlockEntityType<?> FLOWERY_ELDERBERRY_LEAVES = register("ragemod:flowery_elderberry_leaves",
			RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES, FloweryElderberryLeavesBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
