package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineBoss;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.client.render.RenderSpecialProjectile;
import net.divinerpg.client.render.entity.vethea.RenderBiphron;
import net.divinerpg.client.render.entity.vethea.RenderGalroid;
import net.divinerpg.client.render.entity.vethea.RenderLadyLuna;
import net.divinerpg.client.render.entity.vethea.RenderWreck;
import net.divinerpg.client.render.entity.vethea.model.AcidHag;
import net.divinerpg.client.render.entity.vethea.model.Biphron;
import net.divinerpg.client.render.entity.vethea.model.Boheimite;
import net.divinerpg.client.render.entity.vethea.model.CryptKeeper;
import net.divinerpg.client.render.entity.vethea.model.Cymesoid;
import net.divinerpg.client.render.entity.vethea.model.Dissiment;
import net.divinerpg.client.render.entity.vethea.model.Dreamwrecker;
import net.divinerpg.client.render.entity.vethea.model.Duo;
import net.divinerpg.client.render.entity.vethea.model.Ehu;
import net.divinerpg.client.render.entity.vethea.model.Endiku;
import net.divinerpg.client.render.entity.vethea.model.Ent;
import net.divinerpg.client.render.entity.vethea.model.Galroid;
import net.divinerpg.client.render.entity.vethea.model.Gorgosion;
import net.divinerpg.client.render.entity.vethea.model.Helio;
import net.divinerpg.client.render.entity.vethea.model.Herbomancer;
import net.divinerpg.client.render.entity.vethea.model.HiveQueen;
import net.divinerpg.client.render.entity.vethea.model.HiveSoldier;
import net.divinerpg.client.render.entity.vethea.model.HoverStinger;
import net.divinerpg.client.render.entity.vethea.model.Husk;
import net.divinerpg.client.render.entity.vethea.model.Karos;
import net.divinerpg.client.render.entity.vethea.model.Kazrotic;
import net.divinerpg.client.render.entity.vethea.model.LadyLuna;
import net.divinerpg.client.render.entity.vethea.model.Lheiva;
import net.divinerpg.client.render.entity.vethea.model.Lorga;
import net.divinerpg.client.render.entity.vethea.model.Lorgaflight;
import net.divinerpg.client.render.entity.vethea.model.Mandragora;
import net.divinerpg.client.render.entity.vethea.model.ModelHungerHungry;
import net.divinerpg.client.render.entity.vethea.model.MysteriousMan;
import net.divinerpg.client.render.entity.vethea.model.Quadro;
import net.divinerpg.client.render.entity.vethea.model.RaglokGogdure;
import net.divinerpg.client.render.entity.vethea.model.Shadahier;
import net.divinerpg.client.render.entity.vethea.model.StoneGolem;
import net.divinerpg.client.render.entity.vethea.model.Tocaxin;
import net.divinerpg.client.render.entity.vethea.model.Twins;
import net.divinerpg.client.render.entity.vethea.model.Vermenous;
import net.divinerpg.client.render.entity.vethea.model.Vhraak;
import net.divinerpg.client.render.entity.vethea.model.Zone;
import net.divinerpg.client.render.entity.vethea.model.Zoragon;
import net.divinerpg.entities.base.EntityStats;
import net.divinerpg.entities.vethea.EntityAcidHag;
import net.divinerpg.entities.vethea.EntityBiphron;
import net.divinerpg.entities.vethea.EntityBohemite;
import net.divinerpg.entities.vethea.EntityCryptKeeper;
import net.divinerpg.entities.vethea.EntityCymesoid;
import net.divinerpg.entities.vethea.EntityDissiment;
import net.divinerpg.entities.vethea.EntityDreamwrecker;
import net.divinerpg.entities.vethea.EntityDuo;
import net.divinerpg.entities.vethea.EntityEhu;
import net.divinerpg.entities.vethea.EntityEndiku;
import net.divinerpg.entities.vethea.EntityEnt;
import net.divinerpg.entities.vethea.EntityGalroid;
import net.divinerpg.entities.vethea.EntityGorgosion;
import net.divinerpg.entities.vethea.EntityHelio;
import net.divinerpg.entities.vethea.EntityHerbomancer;
import net.divinerpg.entities.vethea.EntityHiveQueen;
import net.divinerpg.entities.vethea.EntityHiveSoldier;
import net.divinerpg.entities.vethea.EntityHoverStinger;
import net.divinerpg.entities.vethea.EntityTheHunger;
import net.divinerpg.entities.vethea.EntityHusk;
import net.divinerpg.entities.vethea.EntityKaros;
import net.divinerpg.entities.vethea.EntityKazrotic;
import net.divinerpg.entities.vethea.EntityLadyLuna;
import net.divinerpg.entities.vethea.EntityLheiva;
import net.divinerpg.entities.vethea.EntityLorga;
import net.divinerpg.entities.vethea.EntityLorgaFlight;
import net.divinerpg.entities.vethea.EntityMandragora;
import net.divinerpg.entities.vethea.EntityMysteriousManLayer1;
import net.divinerpg.entities.vethea.EntityMysteriousManLayer2;
import net.divinerpg.entities.vethea.EntityMysteriousManLayer3;
import net.divinerpg.entities.vethea.EntityQuadro;
import net.divinerpg.entities.vethea.EntityRaglok;
import net.divinerpg.entities.vethea.EntityShadahier;
import net.divinerpg.entities.vethea.EntityStoneGolem;
import net.divinerpg.entities.vethea.EntityTempleGuardian;
import net.divinerpg.entities.vethea.EntityTocaxin;
import net.divinerpg.entities.vethea.EntityTwins;
import net.divinerpg.entities.vethea.EntityVermenous;
import net.divinerpg.entities.vethea.EntityVhraak;
import net.divinerpg.entities.vethea.EntityWreck;
import net.divinerpg.entities.vethea.EntityZone;
import net.divinerpg.entities.vethea.EntityZoragon;
import net.divinerpg.entities.vethea.projectile.EntityAmthirmisDisk;
import net.divinerpg.entities.vethea.projectile.EntityArksianeDisk;
import net.divinerpg.entities.vethea.projectile.EntityBouncingProjectile;
import net.divinerpg.entities.vethea.projectile.EntityCermileDisk;
import net.divinerpg.entities.vethea.projectile.EntityDarvenDisk;
import net.divinerpg.entities.vethea.projectile.EntityDissimentShot;
import net.divinerpg.entities.vethea.projectile.EntityEvernightProjectile;
import net.divinerpg.entities.vethea.projectile.EntityHeliosisDisk;
import net.divinerpg.entities.vethea.projectile.EntityKarosDisk;
import net.divinerpg.entities.vethea.projectile.EntityKazroticShot;
import net.divinerpg.entities.vethea.projectile.EntityPardimalDisk;
import net.divinerpg.entities.vethea.projectile.EntityQuadroticDisk;
import net.divinerpg.entities.vethea.projectile.EntityRaglokBomb;
import net.divinerpg.entities.vethea.projectile.EntityTeakerDisk;
import net.divinerpg.entities.vethea.projectile.EntityWreckBouncingProjectile;
import net.divinerpg.entities.vethea.projectile.EntityWreckExplosiveShot;
import net.divinerpg.entities.vethea.projectile.EntityWreckShot;
import net.divinerpg.entities.vethea.projectile.EntityZoragonBomb;
import net.divinerpg.utils.items.VetheaItems;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class VetheaEntityRenderer {

	private static EntityResourceLocation x;
	private static EntityStats s;

	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityAmthirmisDisk.class, new RenderIconProjectile(VetheaItems.amthrimisDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityArksianeDisk.class, new RenderIconProjectile(VetheaItems.arksianeDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityCermileDisk.class, new RenderIconProjectile(VetheaItems.cermileDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarvenDisk.class, new RenderIconProjectile(VetheaItems.darvenDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeliosisDisk.class, new RenderIconProjectile(VetheaItems.heliosisDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityKarosDisk.class, new RenderIconProjectile(VetheaItems.karosDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityPardimalDisk.class, new RenderIconProjectile(VetheaItems.pardimalDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityQuadroticDisk.class, new RenderIconProjectile(VetheaItems.quadroticDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisk.class, new RenderIconProjectile(VetheaItems.teakerDisk));
		RenderingRegistry.registerEntityRenderingHandler(EntityDissimentShot.class, new RenderSpecialProjectile(x.DISSIMENT_SHOT));
		RenderingRegistry.registerEntityRenderingHandler(EntityRaglokBomb.class, new RenderSpecialProjectile(x.RAGLOK_BOMB));
		RenderingRegistry.registerEntityRenderingHandler(EntityZoragonBomb.class, new RenderSpecialProjectile(x.ZORAGON_BOMB));
		RenderingRegistry.registerEntityRenderingHandler(EntityWreckShot.class, new RenderSpecialProjectile(x.WRECK_SHOT));
		RenderingRegistry.registerEntityRenderingHandler(EntityWreckExplosiveShot.class, new RenderSpecialProjectile(x.WRECK_SHOT));
		RenderingRegistry.registerEntityRenderingHandler(EntityWreckBouncingProjectile.class, new RenderSpecialProjectile(x.WRECK_BOUNCING));
		RenderingRegistry.registerEntityRenderingHandler(EntityKazroticShot.class, new RenderSpecialProjectile(x.KAZROTIC_SHOT));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBouncingProjectile.class, new RenderSpecialProjectile(EntityResourceLocation.staffProjectile));
		RenderingRegistry.registerEntityRenderingHandler(EntityEvernightProjectile.class, new RenderSpecialProjectile(EntityResourceLocation.evernight));

		RenderingRegistry.registerEntityRenderingHandler(EntityVermenous.class, new RenderDivineMob(new Vermenous(), 0.0F, x.VERMENOUS));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnt.class, new RenderDivineMob(new Ent(), 0.0F, x.ENT));
		RenderingRegistry.registerEntityRenderingHandler(EntityCymesoid.class, new RenderDivineMob(new Cymesoid(), 0.0F, x.CYMESOID));
		RenderingRegistry.registerEntityRenderingHandler(EntityDreamwrecker.class, new RenderDivineMob(new Dreamwrecker(), 0.0F, x.DREAMWRECKER));
		RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderDivineMob(new Tocaxin(), 0.0F, x.TOCAXIN));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadahier.class, new RenderDivineMob(new Shadahier(), 0.0F, x.SHADAHIER));
		RenderingRegistry.registerEntityRenderingHandler(EntityAcidHag.class, new RenderDivineMob(new AcidHag(), 0.0F, x.ACID_HAG));
		RenderingRegistry.registerEntityRenderingHandler(EntityKazrotic.class, new RenderDivineMob(new Kazrotic(), 0.0F, x.KAZROTIC));
		RenderingRegistry.registerEntityRenderingHandler(EntityHelio.class, new RenderDivineMob(new Helio(), 0.0F, x.HELIO));
		RenderingRegistry.registerEntityRenderingHandler(EntityGorgosion.class, new RenderDivineMob(new Gorgosion(), 0.0F, x.GORGOSION));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverStinger.class, new RenderDivineMob(new HoverStinger(), 0.0F, x.HOVER_STINGER));
		RenderingRegistry.registerEntityRenderingHandler(EntityZone.class, new RenderDivineMob(new Zone(), 0.0F, x.ZONE));
		RenderingRegistry.registerEntityRenderingHandler(EntityZoragon.class, new RenderDivineMob(new Zoragon(), 0.0F, 5.0F, x.ZORAGON));
		RenderingRegistry.registerEntityRenderingHandler(EntityDissiment.class, new RenderDivineMob(new Dissiment(), 0.0F, 3, x.DISSIMENT));
		RenderingRegistry.registerEntityRenderingHandler(EntityVhraak.class, new RenderDivineMob(new Vhraak(), 0.0F, x.VHRAAK));
		RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderGalroid(new Galroid(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBohemite.class, new RenderDivineMob(new Boheimite(), 0.0F, x.BOHEMITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBiphron.class, new RenderBiphron(new Biphron(), 0.0F, x.BIPHRON));
		RenderingRegistry.registerEntityRenderingHandler(EntityHiveSoldier.class, new RenderDivineMob(new HiveSoldier(), 0.0F, x.HIVE_SOLDIER));
		RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderDivineMob(new Lheiva(), 0.0F, x.LHEIVA));
		RenderingRegistry.registerEntityRenderingHandler(EntityTwins.class, new RenderDivineMob(new Twins(), 0.0F, x.TWINS));
		RenderingRegistry.registerEntityRenderingHandler(EntityEndiku.class, new RenderDivineMob(new Endiku(), 0.0F, x.ENDIKU));
		RenderingRegistry.registerEntityRenderingHandler(EntityTempleGuardian.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.TEMPLE_GUARDIAN));
		RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer1.class, new RenderDivineMob(new MysteriousMan(), 0.0F, x.MM1));
		RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer2.class, new RenderDivineMob(new MysteriousMan(), 0.0F, x.MM2));
		RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer3.class, new RenderDivineMob(new MysteriousMan(), 0.0F, x.MM3));
		RenderingRegistry.registerEntityRenderingHandler(EntityCryptKeeper.class, new RenderDivineMob(new CryptKeeper(), 0.0F, x.CRYPT_KEEPER));
		RenderingRegistry.registerEntityRenderingHandler(EntityDuo.class, new RenderDivineMob(new Duo(), 0.0F, x.DUO));
		//RenderingRegistry.registerEntityRenderingHandler(EntityEhu.class, new RenderDivineMob(new Ehu(), 0.0F, x.EHU));
		//RenderingRegistry.registerEntityRenderingHandler(EntityHusk.class, new RenderDivineMob(new Husk(), 0.0F, x.HUSK));
		//RenderingRegistry.registerEntityRenderingHandler(EntityStoneGolem.class, new RenderDivineMob(new StoneGolem(), 0.0F, x.STONE_GOLEM));
		RenderingRegistry.registerEntityRenderingHandler(EntityHerbomancer.class, new RenderDivineMob(new Herbomancer(), 0.0F, x.HERBOMANCER));
		RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderDivineMob(new Lheiva(), 0.0F, x.LHEIVA));
		RenderingRegistry.registerEntityRenderingHandler(EntityLorga.class, new RenderDivineMob(new Lorga(), 0.0F, x.LORGA));
		RenderingRegistry.registerEntityRenderingHandler(EntityLorgaFlight.class, new RenderDivineMob(new Lorgaflight(), 0.0F, x.LORGA_FLIGHT));
		RenderingRegistry.registerEntityRenderingHandler(EntityMandragora.class, new RenderDivineMob(new Mandragora(), 0.0F, x.MANDRAGORA));
		RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderDivineMob(new Tocaxin(), 0.0F, x.TOCAXIN));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheHunger.class, new RenderDivineMob(new ModelHungerHungry(), 0.0F, x.HUNGER_HUNGRY));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityHiveQueen.class, new RenderDivineBoss(new HiveQueen(), 0.0F, x.HIVE_QUEEN, s.hiveQueenBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityRaglok.class, new RenderDivineBoss(new RaglokGogdure(), 0.0F, x.RAGLOK, s.raglokBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityQuadro.class, new RenderDivineBoss(new Quadro(), 0.0F, x.QUADRO, s.quadroBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityLadyLuna.class, new RenderLadyLuna(new LadyLuna(), 0.0F, x.LADY_LUNA_MELEE));
		RenderingRegistry.registerEntityRenderingHandler(EntityWreck.class, new RenderWreck(null, 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKaros.class, new RenderDivineBoss(new Karos(), 0.0F, x.KAROS, s.karosBossID));

	}
}