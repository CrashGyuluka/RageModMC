
package net.mcreator.ragemod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.BreakBlockGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.Blocks;

import net.mcreator.ragemod.itemgroup.ErcekItemGroup;
import net.mcreator.ragemod.entity.renderer.MinerRenderer;
import net.mcreator.ragemod.block.RageiumoreBlock;
import net.mcreator.ragemod.block.DestroyablealiensoildevBlock;
import net.mcreator.ragemod.block.DeepslateazuritoreBlock;
import net.mcreator.ragemod.block.DeepslateanapaitoreBlock;
import net.mcreator.ragemod.block.DeepslateaktinolitoreBlock;
import net.mcreator.ragemod.block.DeepslateadularoreBlock;
import net.mcreator.ragemod.block.DeepslateachatoreBlock;
import net.mcreator.ragemod.block.AzuritoreBlock;
import net.mcreator.ragemod.block.AnapaitoreBlock;
import net.mcreator.ragemod.block.AktinolitoreBlock;
import net.mcreator.ragemod.block.AdularoreBlock;
import net.mcreator.ragemod.block.AchatoreBlock;
import net.mcreator.ragemod.RagemodModElements;

@RagemodModElements.ModElement.Tag
public class MinerEntity extends RagemodModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("miner").setRegistryName("miner");

	public MinerEntity(RagemodModElements instance) {
		super(instance, 71);
		FMLJavaModLoadingContext.get().getModEventBus().register(new MinerRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -10066330, -10040065, new Item.Properties().group(ErcekItemGroup.tab))
				.setRegistryName("miner_spawn_egg"));
	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("ragemod:cave_dimension_biome1").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("ragemod:cave_dimension_biome2").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(entity, 4, 1, 2));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
	}

	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 25);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 2);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 6);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.1);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 0.1);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 2;
			setNoAI(false);
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_PICKAXE));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, false));
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.fromItems(Items.NETHERITE_INGOT), false));
			this.goalSelector.addGoal(4, new BreakBlockGoal(Blocks.STONE, this, 2, (int) 6));
			this.goalSelector.addGoal(5, new BreakBlockGoal(DestroyablealiensoildevBlock.block, this, 2, (int) 6));
			this.goalSelector.addGoal(6, new BreakBlockGoal(RageiumoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(7, new BreakBlockGoal(Blocks.DIAMOND_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(8, new BreakBlockGoal(AnapaitoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(9, new BreakBlockGoal(AzuritoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(10, new BreakBlockGoal(AktinolitoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(11, new BreakBlockGoal(AdularoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(12, new BreakBlockGoal(AchatoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(13, new BreakBlockGoal(DeepslateadularoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(14, new BreakBlockGoal(DeepslateaktinolitoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(15, new BreakBlockGoal(DeepslateanapaitoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(16, new BreakBlockGoal(DeepslateachatoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(17, new BreakBlockGoal(DeepslateazuritoreBlock.block, this, 1, (int) 6));
			this.goalSelector.addGoal(18, new BreakBlockGoal(Blocks.COAL_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(19, new BreakBlockGoal(Blocks.IRON_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(20, new BreakBlockGoal(Blocks.REDSTONE_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(21, new BreakBlockGoal(Blocks.GOLD_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(22, new BreakBlockGoal(Blocks.LAPIS_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(23, new BreakBlockGoal(Blocks.EMERALD_ORE, this, 1, (int) 6));
			this.goalSelector.addGoal(24, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(25, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(26, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEAD;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:toxicmob_idle2"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:toxic_mob_sendhelp1"));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.DROWN)
				return false;
			if (source.getDamageType().equals("trident"))
				return false;
			return super.attackEntityFrom(source, amount);
		}
	}
}
