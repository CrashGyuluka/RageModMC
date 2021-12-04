
package net.mcreator.ragemod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.ragemod.init.RagemodModEntities;
import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;

@Mod.EventBusSubscriber
public class MinerEntity extends Monster {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("ragemod:cave_dimension_biome1"),
			new ResourceLocation("ragemod:cave_dimension_biome2"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(RagemodModEntities.MINER, 4, 1, 2));
	}

	public MinerEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(RagemodModEntities.MINER, world);
	}

	public MinerEntity(EntityType<MinerEntity> type, Level world) {
		super(type, world);
		xpReward = 2;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_PICKAXE));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers(this.getClass()));
		this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(Items.NETHERITE_INGOT), false));
		this.goalSelector.addGoal(4, new RemoveBlockGoal(Blocks.STONE, this, 2, (int) 6));
		this.goalSelector.addGoal(5, new RemoveBlockGoal(RagemodModBlocks.DESTROYABLEALIENSOILDEV, this, 2, (int) 6));
		this.goalSelector.addGoal(6, new RemoveBlockGoal(RagemodModBlocks.RAGEIUMORE, this, 1, (int) 6));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(Blocks.DIAMOND_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(RagemodModBlocks.ANAPAITORE, this, 1, (int) 6));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(RagemodModBlocks.AZURITORE, this, 1, (int) 6));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(RagemodModBlocks.AKTINOLITORE, this, 1, (int) 6));
		this.goalSelector.addGoal(11, new RemoveBlockGoal(RagemodModBlocks.ADULARORE, this, 1, (int) 6));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(RagemodModBlocks.ACHATORE, this, 1, (int) 6));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(RagemodModBlocks.DEEPSLATEADULARORE, this, 1, (int) 6));
		this.goalSelector.addGoal(14, new RemoveBlockGoal(RagemodModBlocks.DEEPSLATEAKTINOLITORE, this, 1, (int) 6));
		this.goalSelector.addGoal(15, new RemoveBlockGoal(RagemodModBlocks.DEEPSLATE_ANAPAIT_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(16, new RemoveBlockGoal(RagemodModBlocks.DEEPSLATEACHATORE, this, 1, (int) 6));
		this.goalSelector.addGoal(17, new RemoveBlockGoal(RagemodModBlocks.DEEPSLATEAZURITORE, this, 1, (int) 6));
		this.goalSelector.addGoal(18, new RemoveBlockGoal(Blocks.COAL_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(19, new RemoveBlockGoal(Blocks.IRON_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(20, new RemoveBlockGoal(Blocks.REDSTONE_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(21, new RemoveBlockGoal(Blocks.GOLD_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(22, new RemoveBlockGoal(Blocks.LAPIS_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(23, new RemoveBlockGoal(Blocks.EMERALD_ORE, this, 1, (int) 6));
		this.goalSelector.addGoal(24, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(25, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(26, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:toxicmob_idle2"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ragemod:toxic_mob_sendhelp1"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		return super.hurt(source, amount);
	}

	public static void init() {
		SpawnPlacements.register(RagemodModEntities.MINER, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		return builder;
	}
}
