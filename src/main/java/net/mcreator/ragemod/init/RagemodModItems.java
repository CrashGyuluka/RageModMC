
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ragemod.item.WaterItem;
import net.mcreator.ragemod.item.TrofeaItem;
import net.mcreator.ragemod.item.Stick3Item;
import net.mcreator.ragemod.item.Stick2Item;
import net.mcreator.ragemod.item.Stick1Item;
import net.mcreator.ragemod.item.SequoiastickItem;
import net.mcreator.ragemod.item.Savkristalyp2Item;
import net.mcreator.ragemod.item.SavkardItem;
import net.mcreator.ragemod.item.SavkapaItem;
import net.mcreator.ragemod.item.SavercrItem;
import net.mcreator.ragemod.item.SavellenalasbottleItem;
import net.mcreator.ragemod.item.SavasoItem;
import net.mcreator.ragemod.item.SavasfejszeItem;
import net.mcreator.ragemod.item.SavascsakanyItem;
import net.mcreator.ragemod.item.SavarmorItem;
import net.mcreator.ragemod.item.SajtostallerItem;
import net.mcreator.ragemod.item.SajtosceossianItem;
import net.mcreator.ragemod.item.SajtItem;
import net.mcreator.ragemod.item.ReceptbookItem;
import net.mcreator.ragemod.item.RagepotionItem;
import net.mcreator.ragemod.item.RageiumaromrItem;
import net.mcreator.ragemod.item.RageiumalloyItem;
import net.mcreator.ragemod.item.RageiumItem;
import net.mcreator.ragemod.item.RagegyuruItem;
import net.mcreator.ragemod.item.RagefastickItem;
import net.mcreator.ragemod.item.RagearrowscrapItem;
import net.mcreator.ragemod.item.RagearrowammoItem;
import net.mcreator.ragemod.item.RagearrowItem;
import net.mcreator.ragemod.item.RageBoosSpawnerItem;
import net.mcreator.ragemod.item.OpalItem;
import net.mcreator.ragemod.item.MegasavcsakaknyItem;
import net.mcreator.ragemod.item.MegaMinepotionItem;
import net.mcreator.ragemod.item.MegaMinePotion2Item;
import net.mcreator.ragemod.item.KaribSeaMedalItem;
import net.mcreator.ragemod.item.KakoscsigaItem;
import net.mcreator.ragemod.item.FireItem;
import net.mcreator.ragemod.item.FakitoItem;
import net.mcreator.ragemod.item.ElderberryflowerItem;
import net.mcreator.ragemod.item.EarthItem;
import net.mcreator.ragemod.item.DiscinspirationItem;
import net.mcreator.ragemod.item.DiamondnugetItem;
import net.mcreator.ragemod.item.DetonatorrtItem;
import net.mcreator.ragemod.item.CverxItem;
import net.mcreator.ragemod.item.CursedalieniteItem;
import net.mcreator.ragemod.item.CsokiscrossaintItem;
import net.mcreator.ragemod.item.CroissantItem;
import net.mcreator.ragemod.item.ChocolateItem;
import net.mcreator.ragemod.item.CerusszitItem;
import net.mcreator.ragemod.item.BuzmitgyuruItem;
import net.mcreator.ragemod.item.BukkbotItem;
import net.mcreator.ragemod.item.BizmutItem;
import net.mcreator.ragemod.item.AzuritgyuruItem;
import net.mcreator.ragemod.item.AzuritItem;
import net.mcreator.ragemod.item.ApofillitgyuruItem;
import net.mcreator.ragemod.item.ApofillitItem;
import net.mcreator.ragemod.item.AnapaitgyuruItem;
import net.mcreator.ragemod.item.AnapaitItem;
import net.mcreator.ragemod.item.AmazsavkardItem;
import net.mcreator.ragemod.item.AmazonitsavkapaItem;
import net.mcreator.ragemod.item.AmazonitsavasfejszeItem;
import net.mcreator.ragemod.item.AmazonitrtItem;
import net.mcreator.ragemod.item.AmazonitgyuruItem;
import net.mcreator.ragemod.item.AmazonitesavasoItem;
import net.mcreator.ragemod.item.AlieniteswordItem;
import net.mcreator.ragemod.item.AlieniteshovelItem;
import net.mcreator.ragemod.item.AlieniteshieldblockingdevItem;
import net.mcreator.ragemod.item.AlieniteshieldItem;
import net.mcreator.ragemod.item.AlienitepickaxeItem;
import net.mcreator.ragemod.item.AlienitehoeItem;
import net.mcreator.ragemod.item.AlieniteaxeItem;
import net.mcreator.ragemod.item.AlieniteItem;
import net.mcreator.ragemod.item.AlieniteArmorItem;
import net.mcreator.ragemod.item.AlienfoodItem;
import net.mcreator.ragemod.item.AlienTorchItem;
import net.mcreator.ragemod.item.AlienDimensionItem;
import net.mcreator.ragemod.item.AlderflowerJuiceItem;
import net.mcreator.ragemod.item.AktionitItem;
import net.mcreator.ragemod.item.AktinolitgyuruItem;
import net.mcreator.ragemod.item.AirRelicItem;
import net.mcreator.ragemod.item.AdulargyuruItem;
import net.mcreator.ragemod.item.AdularItem;
import net.mcreator.ragemod.item.AchatgyuruItem;
import net.mcreator.ragemod.item.AchatItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RAGEIUMORE = register(RagemodModBlocks.RAGEIUMORE, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM = register(new RageiumItem());
	public static final Item RAGEIUMALLOY = register(new RageiumalloyItem());
	public static final Item RAGEIUMBLOCK = register(RagemodModBlocks.RAGEIUMBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUMALLOYBLOCK = register(RagemodModBlocks.RAGEIUMALLOYBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEMITE = register(
			new SpawnEggItem(RagemodModEntities.RAGEMITE, -16777114, -10092442, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("ragemite_spawn_egg"));
	public static final Item ATOM_RAGE_R = register(
			new SpawnEggItem(RagemodModEntities.ATOM_RAGE_R, -16777063, -3927929, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("atom_rage_r_spawn_egg"));
	public static final Item RAGEBOOS_1 = register(
			new SpawnEggItem(RagemodModEntities.RAGEBOOS_1, -6684673, -13434880, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("rageboos_1_spawn_egg"));
	public static final Item RAGE_BOOS_SPAWNER = register(new RageBoosSpawnerItem());
	public static final Item FIRE = register(new FireItem());
	public static final Item WATER = register(new WaterItem());
	public static final Item AIR_RELIC = register(new AirRelicItem());
	public static final Item EARTH = register(new EarthItem());
	public static final Item TROFEA = register(new TrofeaItem());
	public static final Item RAGEPOTION = register(new RagepotionItem());
	public static final Item RAGEARROWSCRAP = register(new RagearrowscrapItem());
	public static final Item RAGEARROW = register(new RagearrowItem());
	public static final Item RAGEARROWAMMO = register(new RagearrowammoItem());
	public static final Item RAGEIUMAROMR_HELMET = register(new RageiumaromrItem.Helmet());
	public static final Item RAGEIUMAROMR_CHESTPLATE = register(new RageiumaromrItem.Chestplate());
	public static final Item RAGEIUMAROMR_LEGGINGS = register(new RageiumaromrItem.Leggings());
	public static final Item RAGEIUMAROMR_BOOTS = register(new RageiumaromrItem.Boots());
	public static final Item CRASHCHEST = register(RagemodModBlocks.CRASHCHEST, RagemodModTabs.TAB_ERCEK);
	public static final Item PORTALRT = register(RagemodModBlocks.PORTALRT, RagemodModTabs.TAB_ERCEK);
	public static final Item SECRETBOOMKO = register(RagemodModBlocks.SECRETBOOMKO, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVERC = register(RagemodModBlocks.SAVERC, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVBLOCK = register(RagemodModBlocks.SAVBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVBLOCKOK = register(RagemodModBlocks.SAVBLOCKOK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVERCR = register(new SavercrItem());
	public static final Item SAVKRISTALYP_2 = register(new Savkristalyp2Item());
	public static final Item SAVKARD = register(new SavkardItem());
	public static final Item SAVASCSAKANY = register(new SavascsakanyItem());
	public static final Item SAVASFEJSZE = register(new SavasfejszeItem());
	public static final Item SAVASO = register(new SavasoItem());
	public static final Item SAVKAPA = register(new SavkapaItem());
	public static final Item SAVARMOR_HELMET = register(new SavarmorItem.Helmet());
	public static final Item SAVARMOR_CHESTPLATE = register(new SavarmorItem.Chestplate());
	public static final Item SAVARMOR_LEGGINGS = register(new SavarmorItem.Leggings());
	public static final Item SAVARMOR_BOOTS = register(new SavarmorItem.Boots());
	public static final Item SAVELLENALASBOTTLE = register(new SavellenalasbottleItem());
	public static final Item TOXIC_MOB = register(
			new SpawnEggItem(RagemodModEntities.TOXIC_MOB, -16724941, -13395712, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("toxic_mob_spawn_egg"));
	public static final Item AZURIT = register(new AzuritItem());
	public static final Item ACHAT = register(new AchatItem());
	public static final Item ADULAR = register(new AdularItem());
	public static final Item AKTIONIT = register(new AktionitItem());
	public static final Item ANAPAIT = register(new AnapaitItem());
	public static final Item CERUSSZIT = register(new CerusszitItem());
	public static final Item AMAZONITRT = register(new AmazonitrtItem());
	public static final Item APOFILLIT = register(new ApofillitItem());
	public static final Item BIZMUT = register(new BizmutItem());
	public static final Item OPAL = register(new OpalItem());
	public static final Item AZURITORE = register(RagemodModBlocks.AZURITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item DEEPSLATEAZURITORE = register(RagemodModBlocks.DEEPSLATEAZURITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item ACHATORE = register(RagemodModBlocks.ACHATORE, RagemodModTabs.TAB_ERCEK);
	public static final Item DEEPSLATEACHATORE = register(RagemodModBlocks.DEEPSLATEACHATORE, RagemodModTabs.TAB_ERCEK);
	public static final Item ADULARORE = register(RagemodModBlocks.ADULARORE, RagemodModTabs.TAB_ERCEK);
	public static final Item DEEPSLATEADULARORE = register(RagemodModBlocks.DEEPSLATEADULARORE, RagemodModTabs.TAB_ERCEK);
	public static final Item AKTINOLITORE = register(RagemodModBlocks.AKTINOLITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item DEEPSLATEAKTINOLITORE = register(RagemodModBlocks.DEEPSLATEAKTINOLITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item ANAPAITORE = register(RagemodModBlocks.ANAPAITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item DEEPSLATE_ANAPAIT_ORE = register(RagemodModBlocks.DEEPSLATE_ANAPAIT_ORE, RagemodModTabs.TAB_ERCEK);
	public static final Item CERUSSZITORE = register(RagemodModBlocks.CERUSSZITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item AMAZONITORE = register(RagemodModBlocks.AMAZONITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item APOFILLITORE = register(RagemodModBlocks.APOFILLITORE, RagemodModTabs.TAB_ERCEK);
	public static final Item BIZMUTORE = register(RagemodModBlocks.BIZMUTORE, RagemodModTabs.TAB_ERCEK);
	public static final Item OPALORE = register(RagemodModBlocks.OPALORE, RagemodModTabs.TAB_ERCEK);
	public static final Item AZURITBLOCK = register(RagemodModBlocks.AZURITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item ACHATBLOCK = register(RagemodModBlocks.ACHATBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item ADULARBLOCK = register(RagemodModBlocks.ADULARBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item AKTINOLITBLOCK = register(RagemodModBlocks.AKTINOLITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item ANAPITBLOCK = register(RagemodModBlocks.ANAPITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item CERUSSZITBLOCK = register(RagemodModBlocks.CERUSSZITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item AMAZONITBLOCK = register(RagemodModBlocks.AMAZONITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item APIFILLITBLOCK = register(RagemodModBlocks.APIFILLITBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item BIZMUTBLOCK = register(RagemodModBlocks.BIZMUTBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item OPALBLOCK = register(RagemodModBlocks.OPALBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVRAGEROBI = register(
			new SpawnEggItem(RagemodModEntities.SAVRAGEROBI, -14075068, -6750208, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("savragerobi_spawn_egg"));
	public static final Item MINER = register(
			new SpawnEggItem(RagemodModEntities.MINER, -10066330, -10040065, new Item.Properties().tab(RagemodModTabs.TAB_ERCEK))
					.setRegistryName("miner_spawn_egg"));
	public static final Item AMAZSAVKARD = register(new AmazsavkardItem());
	public static final Item MEGASAVCSAKAKNY = register(new MegasavcsakaknyItem());
	public static final Item AMAZONITSAVASFEJSZE = register(new AmazonitsavasfejszeItem());
	public static final Item AMAZONITESAVASO = register(new AmazonitesavasoItem());
	public static final Item AMAZONITSAVKAPA = register(new AmazonitsavkapaItem());
	public static final Item DETONATORRT = register(new DetonatorrtItem());
	public static final Item KARIB_SEA_MEDAL = register(new KaribSeaMedalItem());
	public static final Item RAGEGYURU = register(new RagegyuruItem());
	public static final Item AMAZONITGYURU = register(new AmazonitgyuruItem());
	public static final Item APOFILLITGYURU = register(new ApofillitgyuruItem());
	public static final Item AZURITGYURU = register(new AzuritgyuruItem());
	public static final Item BUZMITGYURU = register(new BuzmitgyuruItem());
	public static final Item ACHATGYURU = register(new AchatgyuruItem());
	public static final Item ADULARGYURU = register(new AdulargyuruItem());
	public static final Item AKTINOLITGYURU = register(new AktinolitgyuruItem());
	public static final Item ANAPAITGYURU = register(new AnapaitgyuruItem());
	public static final Item CONVERTER = register(RagemodModBlocks.CONVERTER, RagemodModTabs.TAB_ERCEK);
	public static final Item CVEX = register(new CverxItem());
	public static final Item CVEX_BLOCK = register(RagemodModBlocks.CVEX_BLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item ALIEN_DIMENSION_PORTAL_IGNITER = register(new AlienDimensionItem());
	public static final Item ALIENITE = register(new AlieniteItem());
	public static final Item CURSED_ALIENITE = register(new CursedalieniteItem());
	public static final Item ALIEN_FOOD = register(new AlienfoodItem());
	public static final Item ALIENITESWORD = register(new AlieniteswordItem());
	public static final Item ALIENITEPICKAXE = register(new AlienitepickaxeItem());
	public static final Item ALIENITEAXE = register(new AlieniteaxeItem());
	public static final Item ALIENITESHOVEL = register(new AlieniteshovelItem());
	public static final Item ALIENITEHOE = register(new AlienitehoeItem());
	public static final Item ALIENITE_ARMOR_HELMET = register(new AlieniteArmorItem.Helmet());
	public static final Item ALIENITE_ARMOR_CHESTPLATE = register(new AlieniteArmorItem.Chestplate());
	public static final Item ALIENITE_ARMOR_LEGGINGS = register(new AlieniteArmorItem.Leggings());
	public static final Item ALIENITE_ARMOR_BOOTS = register(new AlieniteArmorItem.Boots());
	public static final Item MEGAMINE_POTION = register(new MegaMinepotionItem());
	public static final Item LONGER_MEGAMINE_POTION = register(new MegaMinePotion2Item());
	public static final Item ALIENITESHIELD = register(new AlieniteshieldItem());
	public static final Item PARKETTA = register(RagemodModBlocks.PARKETTA, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKSNAKE = register(RagemodModBlocks.PARKSNAKE, RagemodModTabs.TAB_ERCEK);
	public static final Item TOROOTTEGLA = register(RagemodModBlocks.TOROOTTEGLA, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICKS = register(RagemodModBlocks.RAGEIUM_BRICKS, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICK_STAIRS = register(RagemodModBlocks.RAGEIUM_BRICK_STAIRS, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICK_SLAB = register(RagemodModBlocks.RAGEIUM_BRICK_SLAB, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICK_WALL = register(RagemodModBlocks.RAGEIUM_BRICK_WALL, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICKS_PRESSURE_PLATE = register(RagemodModBlocks.RAGEIUM_BRICKS_PRESSURE_PLATE, RagemodModTabs.TAB_ERCEK);
	public static final Item RAGEIUM_BRICKS_BUTTON = register(RagemodModBlocks.RAGEIUM_BRICKS_BUTTON, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKOURFEL = register(RagemodModBlocks.PARKOURFEL, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKFELPLUS = register(RagemodModBlocks.PARKFELPLUS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKOLD = register(RagemodModBlocks.PARKOLD, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKOLD_2 = register(RagemodModBlocks.PARKOLD_2, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKLEV = register(RagemodModBlocks.PARKLEV, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKLEVPLUS = register(RagemodModBlocks.PARKLEVPLUS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKGYORS = register(RagemodModBlocks.PARKGYORS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKGYORSPLUS = register(RagemodModBlocks.PARKGYORSPLUS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKLASS = register(RagemodModBlocks.PARKLASS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKLASSPLUS = register(RagemodModBlocks.PARKLASSPLUS, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKVAK = register(RagemodModBlocks.PARKVAK, RagemodModTabs.TAB_ERCEK);
	public static final Item PARKOL = register(RagemodModBlocks.PARKOL, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASFOLD = register(RagemodModBlocks.SAVASFOLD, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASKO = register(RagemodModBlocks.SAVASKO, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASNETHERRACK = register(RagemodModBlocks.SAVASNETHERRACK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASENDKO = register(RagemodModBlocks.SAVASENDKO, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASLOG = register(RagemodModBlocks.SAVASLOG, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASPANKS = register(RagemodModBlocks.SAVASPANKS, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASBLACKSTONE = register(RagemodModBlocks.SAVASBLACKSTONE, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASANDESITE = register(RagemodModBlocks.SAVASANDESITE, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASDIORIT = register(RagemodModBlocks.SAVASDIORIT, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASGRANIT = register(RagemodModBlocks.SAVASGRANIT, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASZUZOTT = register(RagemodModBlocks.SAVASZUZOTT, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASSODER = register(RagemodModBlocks.SAVASSODER, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASCSONT = register(RagemodModBlocks.SAVASCSONT, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASTEGLA = register(RagemodModBlocks.SAVASTEGLA, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASKOTEGLA = register(RagemodModBlocks.SAVASKOTEGLA, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASOBSZIDIAN = register(RagemodModBlocks.SAVASOBSZIDIAN, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASNETHERITETORMELEK = register(RagemodModBlocks.SAVASNETHERITETORMELEK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASBAZALT = register(RagemodModBlocks.SAVASBAZALT, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASBLACKKOTEGLA = register(RagemodModBlocks.SAVASBLACKKOTEGLA, RagemodModTabs.TAB_ERCEK);
	public static final Item SVASKEKGOMBA = register(RagemodModBlocks.SVASKEKGOMBA, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASPIROSGOMBA = register(RagemodModBlocks.SAVASPIROSGOMBA, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASBUZABLOCK = register(RagemodModBlocks.SAVASBUZABLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASSAND = register(RagemodModBlocks.SAVASSAND, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASHOMOKKO = register(RagemodModBlocks.SAVASHOMOKKO, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASREDSAND = register(RagemodModBlocks.SAVASREDSAND, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASHOMOKKOPIROS = register(RagemodModBlocks.SAVASHOMOKKOPIROS, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASRAGEIUMORE = register(RagemodModBlocks.SAVASRAGEIUMORE, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASRAGEIUMALLOYBLOCK = register(RagemodModBlocks.SAVASRAGEIUMALLOYBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item SAVASRAGEIUMBLOCK = register(RagemodModBlocks.SAVASRAGEIUMBLOCK, RagemodModTabs.TAB_ERCEK);
	public static final Item FAKITO = register(new FakitoItem());
	public static final Item DIAMONDNUGET = register(new DiamondnugetItem());
	public static final Item GENUS_WEIGELA = register(RagemodModBlocks.GENUS_WEIGELA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUEHYDRANGEA = register(RagemodModBlocks.BLUEHYDRANGEA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAGENTAHYDRANGEA = register(RagemodModBlocks.MAGENTAHYDRANGEA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item PURPLEHYDRANGEA = register(RagemodModBlocks.PURPLEHYDRANGEA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item YELLOWHYDRANGEA = register(RagemodModBlocks.YELLOWHYDRANGEA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ELDERFLOWER = register(new ElderberryflowerItem());
	public static final Item RAGEFLOWER = register(RagemodModBlocks.RAGEFLOWER, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ELDERFLOWER_SYRUP = register(new AlderflowerJuiceItem());
	public static final Item ALIEN_SOIL = register(RagemodModBlocks.ALIEN_SOIL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_DIRT = register(RagemodModBlocks.ALIEN_DIRT, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item COVERED_ALIEN_SOIL = register(RagemodModBlocks.COVERED_ALIEN_SOIL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_GROWTH = register(RagemodModBlocks.ALIEN_GROWTH, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_SHROOM = register(RagemodModBlocks.ALIEN_SHROOM, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item TALLALIENPLANT = register(RagemodModBlocks.TALLALIENPLANT, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HANGING_ALIEN_SHROOM = register(RagemodModBlocks.HANGING_ALIEN_SHROOM, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_MUSHROOM = register(RagemodModBlocks.ALIEN_MUSHROOM, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BIG_ALIEN_MUSHROOM = register(RagemodModBlocks.BIG_ALIEN_MUSHROOM, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_SPIKE = register(RagemodModBlocks.ALIEN_SPIKE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_CRYSTAL_BLOCK = register(RagemodModBlocks.ALIEN_CRYSTAL_BLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_TRAP = register(RagemodModBlocks.ALIEN_TRAP, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_STONE = register(RagemodModBlocks.ALIEN_STONE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIENSHROOMBLOCK = register(RagemodModBlocks.ALIENSHROOMBLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_COBWEB = register(RagemodModBlocks.ALIEN_COBWEB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGING_GROWTH = register(RagemodModBlocks.RAGING_GROWTH, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item TALLRAGINGGROWTH = register(RagemodModBlocks.TALLRAGINGGROWTH, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item TRADERRT = register(
			new SpawnEggItem(RagemodModEntities.TRADERRT, -3368704, -13424634, new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB))
					.setRegistryName("traderrt_spawn_egg"));
	public static final Item RAGEFLY = register(
			new SpawnEggItem(RagemodModEntities.RAGEFLY, -10092493, -13434676, new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB))
					.setRegistryName("ragefly_spawn_egg"));
	public static final Item FLYLIEN = register(
			new SpawnEggItem(RagemodModEntities.FLYLIEN, -5227856, -16737997, new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB))
					.setRegistryName("flylien_spawn_egg"));
	public static final Item ALIENSLIME = register(
			new SpawnEggItem(RagemodModEntities.ALIENSLIME, -10053376, -6750055, new Item.Properties().tab(RagemodModTabs.TAB_TERMESZETTAB))
					.setRegistryName("alienslime_spawn_egg"));
	public static final Item ALPIVBLOCK = register(RagemodModBlocks.ALPIVBLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALPIV_STAIRS = register(RagemodModBlocks.ALPIV_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALPIV_SLAB = register(RagemodModBlocks.ALPIV_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALPIV_WALL = register(RagemodModBlocks.ALPIV_WALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHEDALPIV = register(RagemodModBlocks.POLISHEDALPIV, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHED_ALPIV_STAIRS = register(RagemodModBlocks.POLISHED_ALPIV_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHED_ALPIV_SLAB = register(RagemodModBlocks.POLISHED_ALPIV_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHED_ALPIV_WALL = register(RagemodModBlocks.POLISHED_ALPIV_WALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item CHISELED_ALPIV = register(RagemodModBlocks.CHISELED_ALPIV, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALPIVPILLAR = register(RagemodModBlocks.ALPIVPILLAR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALPIV_FLOOR = register(RagemodModBlocks.ALPIV_FLOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_LAMP = register(RagemodModBlocks.ALIEN_LAMP, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ALIEN_TORCH = register(new AlienTorchItem());
	public static final Item HEGYIKO_1 = register(RagemodModBlocks.HEGYIKO_1, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOGREEN = register(RagemodModBlocks.HEGYIKOGREEN, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIMORZSOLT = register(RagemodModBlocks.HEGYIMORZSOLT, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOFULL = register(RagemodModBlocks.HEGYIKOFULL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOPOLISHED = register(RagemodModBlocks.HEGYIKOPOLISHED, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOTEGLA = register(RagemodModBlocks.HEGYIKOTEGLA, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item CHISELEDHEGYIKO = register(RagemodModBlocks.CHISELEDHEGYIKO, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOSTAIRS = register(RagemodModBlocks.HEGYIKOSTAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MOSSYHEGYIKOSTAIRS = register(RagemodModBlocks.MOSSYHEGYIKOSTAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FULLHEGYIKOSTAIR = register(RagemodModBlocks.FULLHEGYIKOSTAIR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHEDHEGYIKOSTAIRS = register(RagemodModBlocks.POLISHEDHEGYIKOSTAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOTEGLASTAIRS = register(RagemodModBlocks.HEGYIKOTEGLASTAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOSLAB = register(RagemodModBlocks.HEGYIKOSLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MOSSYHEGYIKOSLAB = register(RagemodModBlocks.MOSSYHEGYIKOSLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FULLHEGYIKOSLAB = register(RagemodModBlocks.FULLHEGYIKOSLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHEDHEGYIKOSLAB = register(RagemodModBlocks.POLISHEDHEGYIKOSLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOTEGLASLAB = register(RagemodModBlocks.HEGYIKOTEGLASLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOWALL = register(RagemodModBlocks.HEGYIKOWALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MOSSYHEGYIKOWALL = register(RagemodModBlocks.MOSSYHEGYIKOWALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FULLHEGYIKOWALL = register(RagemodModBlocks.FULLHEGYIKOWALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item POLISHEDHEGYIKOWALL = register(RagemodModBlocks.POLISHEDHEGYIKOWALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOTEGLAWALL = register(RagemodModBlocks.HEGYIKOTEGLAWALL, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOPRESSUREPLATE = register(RagemodModBlocks.HEGYIKOPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MOSSYHEGYIKOPRESSUREPLATE = register(RagemodModBlocks.MOSSYHEGYIKOPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FULLHEGYIKOPRESSUREPLATE = register(RagemodModBlocks.FULLHEGYIKOPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOPOLISHEDPRESSUREPLATE = register(RagemodModBlocks.HEGYIKOPOLISHEDPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item HEGYIKOTEGLAPRESSUREPLATE = register(RagemodModBlocks.HEGYIKOTEGLAPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGE_FA_WOOD = register(RagemodModBlocks.RAGE_FA_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGE_FA_LOG = register(RagemodModBlocks.RAGE_FA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_BLOCK = register(RagemodModBlocks.STRIPPED_RAGEWOOD_BLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_BLOCK = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_BLOCK,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_LOG = register(RagemodModBlocks.STRIPPED_RAGEWOOD_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_LOG = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BUKK_WOOD = register(RagemodModBlocks.BUKK_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BUKK_LOG = register(RagemodModBlocks.BUKK_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_LOG = register(RagemodModBlocks.STRIPPED_BEECH_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_WOOD = register(RagemodModBlocks.KIZUKRA_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_LOG = register(RagemodModBlocks.KIZUKRA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_BLOCK = register(RagemodModBlocks.STRIPPED_KIZUKRA_BLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_LOG = register(RagemodModBlocks.STRIPPED_KIZUKRA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_WOOD = register(RagemodModBlocks.ROBTAI_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_LOG = register(RagemodModBlocks.ROBTAI_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_BLOCK = register(RagemodModBlocks.ROBTAI_BLOCK_BLOCK, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_LOG = register(RagemodModBlocks.STRIPPED_ROBTAI_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_WOOD = register(RagemodModBlocks.MAROKRIKSA_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_LOG = register(RagemodModBlocks.MAROKRIKSA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_WOOD = register(RagemodModBlocks.MAROKRIKSA_2_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_LOG = register(RagemodModBlocks.MAROKRIKSA_2_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_WOOD = register(RagemodModBlocks.SEQUOIA_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_LOG = register(RagemodModBlocks.SEQUOIA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_SEQUOIA_WOOD = register(RagemodModBlocks.STRIPPED_SEQUOIA_WOOD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_SEQUOIA_LOG = register(RagemodModBlocks.STRIPPED_SEQUOIA_LOG, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGE_FA_PLANKS = register(RagemodModBlocks.RAGE_FA_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_PLANKS = register(RagemodModBlocks.BLUE_RAGEWOOD_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_PLANKS = register(RagemodModBlocks.RED_RAGEWOOD_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_PLANKS = register(RagemodModBlocks.BEECH_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_PLANKS = register(RagemodModBlocks.KIZUKRA_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_PLANKS = register(RagemodModBlocks.ROBTAI_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_PLANKS = register(RagemodModBlocks.MAROKRIKSA_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_PLANKS = register(RagemodModBlocks.SEQUOIA_PLANKS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_BLOCK_STAIRS = register(RagemodModBlocks.RAGEWOOD_BLOCK_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_STAIRS = register(RagemodModBlocks.STRIPPED_RAGEWOOD_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_STAIRS = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_STAIRS,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_STAIRS = register(RagemodModBlocks.BLUE_RAGEWOOD_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_STAIRS = register(RagemodModBlocks.RED_RAGEWOOD_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_BLOCK_STAIRS = register(RagemodModBlocks.BEECH_BLOCK_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK_STAIRS = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_STAIRS = register(RagemodModBlocks.BEECH_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_BLOCK_STAIRS = register(RagemodModBlocks.KIZUKRA_BLOCK_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_STAIRS = register(RagemodModBlocks.STRIPPED_KIZUKRA_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_STAIRS = register(RagemodModBlocks.KIZUKRA_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_STAIRS = register(RagemodModBlocks.ROBTAI_BLOCK_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_STAIRS = register(RagemodModBlocks.STRIPPED_ROBTAI_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_STAIRS = register(RagemodModBlocks.ROBTAI_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_STAIRS = register(RagemodModBlocks.MAROKRIKSA_2_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_MAROKRIKSA_STAIRS = register(RagemodModBlocks.STRIPPED_MAROKRIKSA_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_STAIRS = register(RagemodModBlocks.MAROKRIKSA_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_STAIRS = register(RagemodModBlocks.SEQUOIA_STAIRS, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_BLOCK_SLAB = register(RagemodModBlocks.RAGEWOOD_BLOCK_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_SLAB = register(RagemodModBlocks.STRIPPED_RAGEWOOD_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_SLAB = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_SLAB,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_SLAB = register(RagemodModBlocks.BLUE_RAGEWOOD_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEFASLABRED = register(RagemodModBlocks.RAGEFASLABRED, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_BLOCK_SLAB = register(RagemodModBlocks.BEECH_BLOCK_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK_SLAB = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_SLAB = register(RagemodModBlocks.BEECH_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_BLOCK_SLAB = register(RagemodModBlocks.KIZUKRA_BLOCK_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_SLAB = register(RagemodModBlocks.STRIPPED_KIZUKRA_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_SLAB = register(RagemodModBlocks.KIZUKRA_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_SLAB = register(RagemodModBlocks.ROBTAI_BLOCK_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_SLAB = register(RagemodModBlocks.STRIPPED_ROBTAI_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_SLAB = register(RagemodModBlocks.ROBTAI_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_SLAB = register(RagemodModBlocks.MAROKRIKSA_2_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_MAROKRIKSA_SLAB = register(RagemodModBlocks.STRIPPED_MAROKRIKSA_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_SLAB = register(RagemodModBlocks.MAROKRIKSA_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_SLAB = register(RagemodModBlocks.SEQUOIA_SLAB, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_BLOCK_FENCE = register(RagemodModBlocks.RAGEWOOD_BLOCK_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_BLOCK_FENCE = register(RagemodModBlocks.STRIPPED_RAGEWOOD_BLOCK_FENCE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOODSTR_2F = register(RagemodModBlocks.RAGEWOODSTR_2F, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_FENCE = register(RagemodModBlocks.BLUE_RAGEWOOD_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_FENCE = register(RagemodModBlocks.RED_RAGEWOOD_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_BLOCK_FENCE = register(RagemodModBlocks.BEECH_BLOCK_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK_FENCE = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_FENCE = register(RagemodModBlocks.BEECH_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_BLOCK_FENCE = register(RagemodModBlocks.KIZUKRA_BLOCK_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_FENCE = register(RagemodModBlocks.STRIPPED_KIZUKRA_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_FENCE = register(RagemodModBlocks.KIZUKRA_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_FENCE = register(RagemodModBlocks.ROBTAI_BLOCK_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_FENCE = register(RagemodModBlocks.STRIPPED_ROBTAI_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_FENCE = register(RagemodModBlocks.ROBTAI_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_FENCE = register(RagemodModBlocks.MAROKRIKSA_2_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_MAROKRIKSA_FENCE = register(RagemodModBlocks.STRIPPED_MAROKRIKSA_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_FENCE = register(RagemodModBlocks.MAROKRIKSA_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_FENCE = register(RagemodModBlocks.SEQUOIA_FENCE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_BLOCK_FENCE_GATE = register(RagemodModBlocks.RAGEWOOD_BLOCK_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_FENCE_GATE = register(RagemodModBlocks.STRIPPED_RAGEWOOD_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_FENCE_GATE = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_FENCE_GATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_FENCE_GATE = register(RagemodModBlocks.BLUE_RAGEWOOD_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_FENCE_GATE = register(RagemodModBlocks.RED_RAGEWOOD_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_BLOCK_FENCE_GATE = register(RagemodModBlocks.BEECH_BLOCK_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK_FENCE_GATE = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK_FENCE_GATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_FENCE_GATE = register(RagemodModBlocks.BEECH_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_BLOCK_FENCE_GATE = register(RagemodModBlocks.KIZUKRA_BLOCK_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_FENCE_GATE = register(RagemodModBlocks.STRIPPED_KIZUKRA_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_FENCE_GATE = register(RagemodModBlocks.KIZUKRA_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_FENCE_GATE = register(RagemodModBlocks.ROBTAI_BLOCK_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_FENCE_GATE = register(RagemodModBlocks.STRIPPED_ROBTAI_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_FENCE_GATE = register(RagemodModBlocks.ROBTAI_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_FENCE_GATE = register(RagemodModBlocks.MAROKRIKSA_2_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_MAROKRIKSA_FENCE_GATE = register(RagemodModBlocks.STRIPPED_MAROKRIKSA_FENCE_GATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_FENCE_GATE = register(RagemodModBlocks.MAROKRIKSA_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_FENCE_GATE = register(RagemodModBlocks.SEQUOIA_FENCE_GATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_DOOR = register(RagemodModBlocks.RAGEWOOD_DOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_DOOR = register(RagemodModBlocks.BEECH_DOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_DOOR = register(RagemodModBlocks.KIZUKRA_DOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_DOOR = register(RagemodModBlocks.ROBTAI_DOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSADOOR = register(RagemodModBlocks.MAROKRIKSADOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIADOOR = register(RagemodModBlocks.SEQUOIADOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_TRAPDOOR = register(RagemodModBlocks.BLUE_RAGEWOOD_TRAPDOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_TRAPDOOR = register(RagemodModBlocks.RED_RAGEWOOD_TRAPDOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_TRAPDOOR = register(RagemodModBlocks.BEECH_TRAPDOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_TRAPDOOR = register(RagemodModBlocks.KIZUKRA_TRAPDOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_TRAPDOOR = register(RagemodModBlocks.ROBTAI_TRAPDOOR, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSATD = register(RagemodModBlocks.MAROKRIKSATD, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.RAGEWOOD_BLOCK_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_RAGEWOOD_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.STRIPPED_RAGEWOOD_BLOCK_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BETTER_STRIPPED_RAGEWOOD_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.BETTER_STRIPPED_RAGEWOOD_BLOCK_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_PRESSURE_PLATE = register(RagemodModBlocks.RAGEWOOD_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BLUE_RAGEWOOD_PRESSURE_PLATE = register(RagemodModBlocks.BLUE_RAGEWOOD_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_RAGEWOOD_PRESSURE_PLATE = register(RagemodModBlocks.RED_RAGEWOOD_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.BEECH_BLOCK_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_BEECH_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.STRIPPED_BEECH_BLOCK_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_PRESSURE_PLATE = register(RagemodModBlocks.BEECH_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.KIZUKRA_BLOCK_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_KIZUKRA_PRESSURE_PLATE = register(RagemodModBlocks.STRIPPED_KIZUKRA_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_PRESSURE_PLATE = register(RagemodModBlocks.KIZUKRA_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_BLOCK_PRESSURE_PLATE = register(RagemodModBlocks.ROBTAI_BLOCK_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_ROBTAI_PRESSURE_PLATE = register(RagemodModBlocks.STRIPPED_ROBTAI_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_PRESSURE_PLATE = register(RagemodModBlocks.ROBTAI_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_2_PRESSURE_PLATE = register(RagemodModBlocks.MAROKRIKSA_2_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item STRIPPED_MAROKRIKSA_PRESSURE_PLATE = register(RagemodModBlocks.STRIPPED_MAROKRIKSA_PRESSURE_PLATE,
			RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSAPRESSUREPLATE = register(RagemodModBlocks.MAROKRIKSAPRESSUREPLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_PRESSURE_PLATE = register(RagemodModBlocks.SEQUOIA_PRESSURE_PLATE, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGEWOOD_STICK = register(new RagefastickItem());
	public static final Item BEECH_STICK = register(new BukkbotItem());
	public static final Item KIZUKRA_STICK = register(new Stick1Item());
	public static final Item ROBTAI_STICK = register(new Stick2Item());
	public static final Item STICK_3 = register(new Stick3Item());
	public static final Item SEQUOIASTICK = register(new SequoiastickItem());
	public static final Item RAGETREE_SAPLING = register(RagemodModBlocks.RAGETREE_SAPLING, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BEECH_SAPLING = register(RagemodModBlocks.BEECH_SAPLING, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_SAPLING = register(RagemodModBlocks.KIZUKRA_SAPLING, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_SAPLING = register(RagemodModBlocks.ROBTAI_SAPLING, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FA_5SAP = register(RagemodModBlocks.FA_5SAP, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_SAPLING = register(RagemodModBlocks.SEQUOIA_SAPLING, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RAGE_FA_LEAVES = register(RagemodModBlocks.RAGE_FA_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BUKK_LEAVES = register(RagemodModBlocks.BUKK_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item KIZUKRA_LEAVES = register(RagemodModBlocks.KIZUKRA_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ROBTAI_LEAVES = register(RagemodModBlocks.ROBTAI_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item MAROKRIKSA_LEAVES = register(RagemodModBlocks.MAROKRIKSA_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SEQUOIA_LEAVES = register(RagemodModBlocks.SEQUOIA_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item ELDERBERRY_LEAVES = register(RagemodModBlocks.ELDERBERRY_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item FLOWERY_ELDERBERRY_LEAVES = register(RagemodModBlocks.FLOWERY_ELDERBERRY_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item YELLOW_GLOWING_OAK_LEAVES = register(RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item BROWN_GLOWING_OAK_LEAVES = register(RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item GREEN_GLOWING_OAK_LEAVES = register(RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item RED_GLOWING_OAK_LEAVES = register(RagemodModBlocks.RED_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item SAVASNOVENY = register(RagemodModBlocks.SAVASNOVENY, RagemodModTabs.TAB_TERMESZETTAB);
	public static final Item CROISSANT = register(new CroissantItem());
	public static final Item CHOCOLATE = register(new ChocolateItem());
	public static final Item SAJT = register(new SajtItem());
	public static final Item CSOKISCROSSAINT = register(new CsokiscrossaintItem());
	public static final Item SAJTOSCEOSSIAN = register(new SajtosceossianItem());
	public static final Item KAKOSCSIGA = register(new KakoscsigaItem());
	public static final Item SAJTOSTALLER = register(new SajtostallerItem());
	public static final Item SAVASRAGEIUMSECRET = register(RagemodModBlocks.SAVASRAGEIUMSECRET, null);
	public static final Item EPITOBLOCK = register(RagemodModBlocks.EPITOBLOCK, null);
	public static final Item RECEPTBOOK = register(new ReceptbookItem());
	public static final Item POLIPOS = register(
			new SpawnEggItem(RagemodModEntities.POLIPOS, -13421773, -13180872, new Item.Properties().tab(null)).setRegistryName("polipos_spawn_egg"));
	public static final Item STRUCTUREHATAROLO_1 = register(RagemodModBlocks.STRUCTUREHATAROLO_1, null);
	public static final Item STURTUREPLACER_1 = register(RagemodModBlocks.STURTUREPLACER_1, null);
	public static final Item STRUCTUREPLACER_2 = register(RagemodModBlocks.STRUCTUREPLACER_2, null);
	public static final Item DESTROYABLEALIENSOILDEV = register(RagemodModBlocks.DESTROYABLEALIENSOILDEV, null);
	public static final Item HANGINGALIENPLANTDEVBLOCK = register(RagemodModBlocks.HANGINGALIENPLANTDEVBLOCK, null);
	public static final Item HANGINGALIENOFF_1 = register(RagemodModBlocks.HANGINGALIENOFF_1, null);
	public static final Item HANGINGALIENPLANT_3 = register(RagemodModBlocks.HANGINGALIENPLANT_3, null);
	public static final Item HANGINGALIENPLANT_4 = register(RagemodModBlocks.HANGINGALIENPLANT_4, null);
	public static final Item HANINGALIENPLANT_5 = register(RagemodModBlocks.HANINGALIENPLANT_5, null);
	public static final Item HANGINGALIENPLANT_5 = register(RagemodModBlocks.HANGINGALIENPLANT_5, null);
	public static final Item ALIENTRAPBLOCKLIT = register(RagemodModBlocks.ALIENTRAPBLOCKLIT, null);
	public static final Item HANGINGALIENPLANTEXLUSE_1 = register(RagemodModBlocks.HANGINGALIENPLANTEXLUSE_1, null);
	public static final Item ALIENSHROOMDEV = register(RagemodModBlocks.ALIENSHROOMDEV, null);
	public static final Item STRHATAROLO_2 = register(RagemodModBlocks.STRHATAROLO_2, null);
	public static final Item STRHATAROLO_3 = register(RagemodModBlocks.STRHATAROLO_3, null);
	public static final Item STRPLACER_3 = register(RagemodModBlocks.STRPLACER_3, null);
	public static final Item STRPLACER_4 = register(RagemodModBlocks.STRPLACER_4, null);
	public static final Item STRPLACER_5 = register(RagemodModBlocks.STRPLACER_5, null);
	public static final Item STRPLACER_6 = register(RagemodModBlocks.STRPLACER_6, null);
	public static final Item STRHATAROLO_4 = register(RagemodModBlocks.STRHATAROLO_4, null);
	public static final Item STRHATAROLO_5 = register(RagemodModBlocks.STRHATAROLO_5, null);
	public static final Item STRHATAROLO_6 = register(RagemodModBlocks.STRHATAROLO_6, null);
	public static final Item ALIEN_TORCH_FLOOR = register(RagemodModBlocks.ALIEN_TORCH_FLOOR, null);
	public static final Item ALIEN_WALLTORCH = register(RagemodModBlocks.ALIEN_WALLTORCH, null);
	public static final Item LIT_ALIEN_LAMP = register(RagemodModBlocks.LIT_ALIEN_LAMP, null);
	public static final Item RAGEFLYLIT = register(
			new SpawnEggItem(RagemodModEntities.RAGEFLYLIT, -10092493, -13434676, new Item.Properties().tab(null))
					.setRegistryName("rageflylit_spawn_egg"));
	public static final Item RAGEFLYLIT_2 = register(
			new SpawnEggItem(RagemodModEntities.RAGEFLYLIT_2, -10092493, -13434676, new Item.Properties().tab(null))
					.setRegistryName("rageflylit_2_spawn_egg"));
	public static final Item BIGALIENMUSHROOMDEV_1 = register(RagemodModBlocks.BIGALIENMUSHROOMDEV_1, null);
	public static final Item ALIENGROWTHDEV_1 = register(RagemodModBlocks.ALIENGROWTHDEV_1, null);
	public static final Item RAGINGVINESDEV_2 = register(RagemodModBlocks.RAGINGVINESDEV_2, null);
	public static final Item ALIENDRIPSTONEBOTTOM = register(RagemodModBlocks.ALIENDRIPSTONEBOTTOM, null);
	public static final Item ALIENDRIPSTONETOPDEV = register(RagemodModBlocks.ALIENDRIPSTONETOPDEV, null);
	public static final Item ALIENITESHIELDBLOCKINGDEV = register(new AlieniteshieldblockingdevItem());
	public static final Item ALIEN_SPIKE_MID_DEV = register(RagemodModBlocks.ALIEN_SPIKE_MID_DEV, null);
	public static final Item DISC_INSPIRATION = register(new DiscinspirationItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
