package net.divinerpg.utils.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModVine;
import net.divinerpg.api.blocks.BlockStupidSpawner;
import net.divinerpg.blocks.vethea.BlockAcid;
import net.divinerpg.blocks.vethea.BlockHelioticBeam;
import net.divinerpg.blocks.vethea.BlockInfusionTable;
import net.divinerpg.blocks.vethea.BlockKarosCannon;
import net.divinerpg.blocks.vethea.BlockKarosHeatTile;
import net.divinerpg.blocks.vethea.BlockNightmareBed;
import net.divinerpg.blocks.vethea.BlockShimmer;
import net.divinerpg.blocks.vethea.BlockVetheaPlant;
import net.divinerpg.blocks.vethea.BlockVetheaPortal;
import net.divinerpg.utils.material.EnumBlockType;
import net.divinerpg.utils.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheaBlocks {

	public static Block vetheaPortal;
	
	public static Block dreamwreckerSpawner;
	public static Block vermenousSpawner;
	public static Block twinsSpawner;
	public static Block biphronSpawner;
	public static Block gorgosionSpawner;

	public static Block wreckAltar;
	public static Block quadroticAltar;
	public static Block karosAltar;
	public static Block raglokAltar;
	public static Block lunicAltar;

	public static Block dreamStone;
	public static Block dreamDirt;
	public static Block dreamGrass;
	public static Block fireCrystal;

	public static Block dreamWoodLog;
	public static Block dreamWoodLeaves;
	public static Block dreamBricks1;
	public static Block dreamBricks2;
	public static Block lunaStone;
	public static Block lunaBricks;
	public static Block metalCaging;
	public static Block dreamLampOn;
	public static Block dreamLamp;
	public static Block weedwoodVine;
	public static Block blossomingWeedwoodVine;
	public static Block cryptWall;
	public static Block smoothGlass;
	public static Block villageLamp;
	public static Block cellLamp;
	public static Block barredDoor;
	public static Block firelight;
	public static Block hyrewood;
	public static Block mintwoodLeaves;
	public static Block firewall;
	public static Block karosHeatTileGreen;
	public static Block karosHeatTileRed;
	public static Block firewood;
	public static Block bacterialAcid;
	public static Block blockAcid;
	public static Block everstone;
	public static Block lunicAcid;
	public static Block firewoodLeaves;
	public static Block hyrewoodLeaves;
	public static Block gemtopGreen;
	public static Block gemtopPurple;
	public static Block purpleDulah;
	public static Block yellowDulah;
	public static Block greenDulah;
	public static Block mintwood;
	public static Block cracklespike;
	public static Block fernite;
	public static Block bulatobe;
	public static Block shineGrass;
	public static Block shimmer;
	public static Block hiveWall;
	public static Block dreamglow;
	public static Block hyrewoodVine;
	public static Block chamberWall;
	public static Block chamberWall1;
	public static Block chamberWall2;
	public static Block whiteEverstone;
	public static Block darkEverstone;
	public static Block hungerstone1;
	public static Block hungerstone2;
	public static Block cryptFloor;
	public static Block hallWall;
	public static Block karosBricks;
	public static Block karosBricks2;
	public static Block infusionTable;
	public static BlockHelioticBeam helioticBeam;
	public static BlockKarosCannon karosCannon;
	public static Block nightmareBedBlock;
	
	public static void init() {
		vetheaPortal 		   = new BlockVetheaPortal();
		
        dreamwreckerSpawner    = new BlockStupidSpawner("dreamWreckerSpawner", "Dreamwrecker", "fireCrystal", true);
        vermenousSpawner       = new BlockStupidSpawner("vermenousSpawner", "Vermenous", "fireCrystal", true);
        twinsSpawner           = new BlockStupidSpawner("twinsSpawner", "Twins", "fireCrystal", true);
        biphronSpawner         = new BlockStupidSpawner("biphronSpawner", "Biphron", "fireCrystal", true);
        gorgosionSpawner       = new BlockStupidSpawner("gorgosionSpawner", "Gorgosion", "fireCrystal", true);

        wreckAltar             = new BlockMod("wreckAltar", 0.7F, DivineRPGTabs.spawner);
        quadroticAltar         = new BlockMod("quadroticAltar", 0.7F, DivineRPGTabs.spawner);
        karosAltar             = new BlockMod("karosAltar", 0.7F, DivineRPGTabs.spawner);
        raglokAltar            = new BlockMod("raglokAltar", 0.7F, DivineRPGTabs.spawner);
        lunicAltar             = new BlockMod("lunicAltar", 0.7F, DivineRPGTabs.spawner);

        dreamStone             = new BlockMod("dreamStone", 0.4F, DivineRPGTabs.vethea);
        dreamDirt              = new BlockMod(EnumBlockType.DIRT, "dreamDirt", 0.3F, DivineRPGTabs.vethea);
        dreamGrass             = new BlockModGrass((BlockMod)dreamDirt, "dreamGrass", "dreamDirt", 0.3F);
        fireCrystal            = new BlockMod(EnumBlockType.GLASS, "fireCrystal", 1.0F, DivineRPGTabs.vethea).setLightLevel(0.7F);

        dreamWoodLog           = new BlockModLog("dreamWoodLog").setCreativeTab(DivineRPGTabs.vethea);
        dreamWoodLeaves        = new BlockModLeaves("dreamWoodLeaves", 0.3F).setCreativeTab(DivineRPGTabs.vethea);
        dreamBricks1           = new BlockMod("dreamBricks1", 1.0F, DivineRPGTabs.vethea);
        dreamBricks2           = new BlockMod("dreamBricks2", 1.0F, DivineRPGTabs.vethea);
        lunaStone              = new BlockMod("lunaStone", 1.0F, DivineRPGTabs.vethea);
        lunaBricks             = new BlockMod("lunaBrick", 1.0F, DivineRPGTabs.vethea);
        metalCaging            = new BlockMod("metalCaging", 1.0F, DivineRPGTabs.vethea);
        dreamLampOn            = new BlockMod(EnumBlockType.GLASS, "dreamLampOn", 1.0F, DivineRPGTabs.vethea).setLightLevel(1);
        dreamLamp              = new BlockMod(EnumBlockType.GLASS, "dreamLampOff", 1.0F, DivineRPGTabs.vethea);
        weedwoodVine           = new BlockModVine("weedWoodVine").setCreativeTab(DivineRPGTabs.vethea);
        blossomingWeedwoodVine = new BlockModVine("blossemedWeedWoodVine").setCreativeTab(DivineRPGTabs.vethea);
        cryptWall              = new BlockMod("cryptWall", 1.0F, DivineRPGTabs.vethea);
        smoothGlass            = new BlockModGlass("smoothGlass", 0.3F).setCreativeTab(DivineRPGTabs.vethea);
        villageLamp            = new BlockMod(EnumBlockType.GLASS, "villageLamp", 1.0F, DivineRPGTabs.vethea).setLightLevel(1);
        cellLamp               = new BlockMod(EnumBlockType.GLASS, "cellLamp", 1.0F, DivineRPGTabs.vethea).setLightLevel(1);
        barredDoor             = new BlockModDoor(EnumBlockType.IRON, "barredDoorBlock", 3.0F, true);
        firelight              = new BlockMod(EnumBlockType.GLASS, "firelight", 1.0F, DivineRPGTabs.vethea).setLightLevel(1).setResistance(1);
        hyrewood               = new BlockModLog("hyreWoodLog").setCreativeTab(DivineRPGTabs.vethea);
        mintwoodLeaves         = new BlockModLeaves("mintwoodLeaves", 0.3F).setCreativeTab(DivineRPGTabs.vethea);
        firewall               = new BlockMod("fireWall", 1.0F, DivineRPGTabs.vethea);
        karosHeatTileGreen     = new BlockMod(EnumBlockType.GLASS, "karosHeatTileGreen", false, DivineRPGTabs.vethea);
        karosHeatTileRed       = new BlockKarosHeatTile();
        firewood               = new BlockModLog("fireWoodLog").setCreativeTab(DivineRPGTabs.vethea);
        bacterialAcid          = new BlockAcid("bacterialAcid", false);
        blockAcid              = new BlockAcid("acidBlock", true);
        everstone              = new BlockMod("greenEverstone", 3.0F, DivineRPGTabs.vethea);
        lunicAcid              = new BlockAcid("lunicAcid", true);
        firewoodLeaves         = new BlockModLeaves("fireWoodLeaves", 0.3F).setCreativeTab(DivineRPGTabs.vethea);
        hyrewoodLeaves         = new BlockModLeaves("hyreWoodLeaves", 0.3F).setCreativeTab(DivineRPGTabs.vethea);
        gemtopGreen            = new BlockVetheaPlant("greenGemTop");
        gemtopPurple            = new BlockVetheaPlant("purpleGemTop");
        purpleDulah            = new BlockVetheaPlant("purpleDulah");
        yellowDulah            = new BlockVetheaPlant("yellowDulah");
        greenDulah             = new BlockVetheaPlant("greenDulah");
        mintwood               = new BlockModLog("mintwoodLog").setCreativeTab(DivineRPGTabs.vethea);
        cracklespike           = new BlockVetheaPlant("crackleSpike");
        fernite                = new BlockVetheaPlant("fernite");
        bulatobe               = new BlockVetheaPlant("bulbatobe");
        shineGrass             = new BlockVetheaPlant("shineGrass").setLightLevel(0.4F);
        shimmer                = new BlockShimmer("shimmer").setLightLevel(0.4F);
        hiveWall               = new BlockMod(EnumBlockType.GLASS, "hiveWalls", 1.0F, DivineRPGTabs.vethea).setLightLevel(0.533F);
        dreamglow              = new BlockVetheaPlant("dreamglow").setLightLevel(0.4F);
        hyrewoodVine           = new BlockModVine("hyreWoodVine").setCreativeTab(DivineRPGTabs.vethea);
        chamberWall            = new BlockMod(EnumBlockType.ROCK, "chamberWall1", false, DivineRPGTabs.vethea);
        chamberWall1           = new BlockMod(EnumBlockType.ROCK, "chamberWall2", false, DivineRPGTabs.vethea);
        chamberWall2           = new BlockMod(EnumBlockType.ROCK, "chamberWall3", false, DivineRPGTabs.vethea);
        whiteEverstone         = new BlockMod(EnumBlockType.ROCK, "whiteEverstone", false, DivineRPGTabs.vethea);
        darkEverstone          = new BlockMod(EnumBlockType.ROCK, "darkEverstone", false, DivineRPGTabs.vethea);
        hungerstone1           = new BlockMod(EnumBlockType.ROCK, "hungerStone1", false, DivineRPGTabs.vethea);
        hungerstone2           = new BlockMod(EnumBlockType.ROCK, "hungerStone2", false, DivineRPGTabs.vethea);
        cryptFloor             = new BlockMod(EnumBlockType.ROCK, "cryptFloor", false, DivineRPGTabs.vethea);
        hallWall               = new BlockMod(EnumBlockType.ROCK, "hallWall", false, DivineRPGTabs.vethea);
        karosBricks            = new BlockMod(EnumBlockType.ROCK, "karosBrick", false, DivineRPGTabs.vethea);
        karosBricks2           = new BlockMod(EnumBlockType.ROCK, "karosBrick2", false, DivineRPGTabs.vethea);
        infusionTable          = new BlockInfusionTable().setName("infusionTable").setBlockUnbreakable();
        helioticBeam           = (BlockHelioticBeam) new BlockHelioticBeam("helioticBeam");
        karosCannon            = (BlockKarosCannon) new BlockKarosCannon(Material.rock).setName("karosCannonBlock");
        nightmareBedBlock      = new BlockNightmareBed();
	}
}
