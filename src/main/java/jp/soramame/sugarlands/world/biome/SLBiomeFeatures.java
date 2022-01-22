package jp.soramame.sugarlands.world.biome;

import jp.soramame.sugarlands.world.gen.feature.SLFeatures;
import jp.soramame.sugarlands.world.gen.feature.SLTreeConfigurations;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeAmbience.GrassColorModifier;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class SLBiomeFeatures {

	static BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
	static MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();

	public static int calculateSkyColor(float p_244206_0_) {
		float lvt_1_1_ = p_244206_0_ / 3.0F;
		lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
		return MathHelper.hsvToRgb(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
	}

	public static final BiomeAmbience SUGAR_DESERT_AMBIENCE = new BiomeAmbience.Builder()
			.fogColor(13434879)
			.waterColor(13434879)
			.waterFogColor(13434879)
			.skyColor(13434879)
			.grassColorModifier(GrassColorModifier.NONE)
			.foliageColorOverride(13434879)
			.build();
	public static final BiomeAmbience PUDDING_PLAIN_AMBIENCE = new BiomeAmbience.Builder()
			.waterColor(8388608)
			.waterFogColor(329011)
			.fogColor(12638463)
			.skyColor(calculateSkyColor(0.8F))
			.grassColorModifier(GrassColorModifier.NONE)
			.foliageColorOverride(0)
			.build();
	public static final BiomeAmbience ICECANDY_SPIKES_AMBIENCE = new BiomeAmbience.Builder()
			.waterColor(4159204)
			.waterFogColor(329011)
			.fogColor(12638463)
			.skyColor(calculateSkyColor(0.0F))
			.grassColorModifier(GrassColorModifier.NONE)
			.foliageColorOverride(0)
			.build();

	public static BiomeGenerationSettings.Builder sugarDesertSettings(){
		biomegenerationsettings$builder
		.addFeature(Decoration.SURFACE_STRUCTURES, SLFeatures.SUGAR_WELL)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GRANITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIORITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_ANDESITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_COAL)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_IRON)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GOLD)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_REDSTONE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIAMOND)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_LAPIS)
		.addFeature(Decoration.UNDERGROUND_STRUCTURES, Features.MONSTER_ROOM)
		.addStructureStart(StructureFeatures.STRONGHOLD)
		.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
		return biomegenerationsettings$builder;
	}
	public static BiomeGenerationSettings.Builder puddingPlainSettings(){
		biomegenerationsettings$builder
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GRANITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIORITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_ANDESITE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_COAL)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_IRON)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GOLD)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_REDSTONE)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIAMOND)
		.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_LAPIS)
		.addFeature(Decoration.UNDERGROUND_STRUCTURES, Features.MONSTER_ROOM)
		.addFeature(Decoration.TOP_LAYER_MODIFICATION, Features.FREEZE_TOP_LAYER)
		.addStructureStart(StructureFeatures.VILLAGE_SNOWY)
		.addStructureStart(StructureFeatures.MINESHAFT)
		.addStructureStart(StructureFeatures.STRONGHOLD)
		.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
		return biomegenerationsettings$builder;
	}
	public static BiomeGenerationSettings.Builder sugarForestSettings() {
		DefaultBiomeFeatures.addDefaultOverworldLandStructures(biomegenerationsettings$builder);
		biomegenerationsettings$builder.addStructureStart(StructureFeatures.RUINED_PORTAL_STANDARD);
		DefaultBiomeFeatures.addDefaultCarvers(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultLakes(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultMonsterRoom(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultMushrooms(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultExtraVegetation(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addSurfaceFreezing(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultOres(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultUndergroundVariety(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addExtraEmeralds(biomegenerationsettings$builder);
		sugaForestTree(biomegenerationsettings$builder,2);
		return biomegenerationsettings$builder;
	}
	public static BiomeGenerationSettings.Builder icecandySpikesSettings(){
		biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, Features.ICE_PATCH);
		biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, Features.ICE_SPIKE);
		biomegenerationsettings$builder.addFeature(Decoration.RAW_GENERATION, SLFeatures.ICECANDY);
		biomegenerationsettings$builder.addStructureStart(StructureFeatures.VILLAGE_SNOWY);
		biomegenerationsettings$builder.addStructureStart(StructureFeatures.IGLOO);
		DefaultBiomeFeatures.addDefaultCarvers(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultLakes(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultMonsterRoom(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultOres(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultUndergroundVariety(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addDefaultGrass(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addSurfaceFreezing(biomegenerationsettings$builder);
		DefaultBiomeFeatures.addSnowyTrees(biomegenerationsettings$builder);
		sugaForestTree(biomegenerationsettings$builder, 50);
		return biomegenerationsettings$builder;
	}

	public static void sugaForestTree(BiomeGenerationSettings.Builder builder,int chance) {
		//Decoration.VEGETAL_DECORATIONが正解なのだろうが、それで実行するとハゲの森が出来上がる(何も生成されない)
		builder.addFeature(Decoration.SURFACE_STRUCTURES, SLTreeConfigurations.SUGAR_TREE.chance(chance)
				.decorated(Features.Placements.HEIGHTMAP_SQUARE)
				.decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
		builder.addFeature(Decoration.VEGETAL_DECORATION, Features.OAK);
	}

	public static MobSpawnInfo.Builder sugarForestMobSpawn(){
		DefaultBiomeFeatures.farmAnimals(mobspawninfo$builder);
		DefaultBiomeFeatures.commonSpawns(mobspawninfo$builder);
		mobspawninfo$builder
			.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.WOLF, 8, 4, 4))
			.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3))
			.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.FOX, 8, 2, 4))
			.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.STRAY, 80, 4, 4));
		return mobspawninfo$builder;
	}
	public static MobSpawnInfo.Builder sugarDesertSpawn(){
		mobspawninfo$builder
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3))
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.CHICKEN, 10, 4, 4))
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.COW, 8, 4, 4));
		return mobspawninfo$builder;
	}
	public static MobSpawnInfo.Builder puddingPlainSpawn(){
		mobspawninfo$builder
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.SHEEP, 12, 4, 4))
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.PIG, 10, 4, 4))
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.CHICKEN, 10, 4, 4))
		.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.COW, 8, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 100, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 100, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 100, 1, 1))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 100, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1))
		.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.STRAY, 80, 4, 4));
		return mobspawninfo$builder;
	}
	public static MobSpawnInfo.Builder icecandySpikesSpawn(){
		DefaultBiomeFeatures.snowySpawns(mobspawninfo$builder);
		return mobspawninfo$builder;
	}

}
