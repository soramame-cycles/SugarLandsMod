package jp.soramame.sugarlands.world.biome;

import jp.soramame.sugarlands.world.gen.feature.SLFeatures;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeSpecialEffects.GrassColorModifier;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.MobSpawnSettings.Builder;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;

public class SLBiomeFeatures {

    public static int calculateSkyColor(float p_244206_0_) {
        float lvt_1_1_ = p_244206_0_ / 3.0F;
        lvt_1_1_ = Mth.clamp(lvt_1_1_, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }

    public static final BiomeSpecialEffects SUGAR_DESERT_AMBIENCE = new BiomeSpecialEffects.Builder()
            .fogColor(0xccffff)
            .waterColor(0xccffff)
            .waterFogColor(0xccffff)
            .skyColor(0xccffff)
            .grassColorModifier(GrassColorModifier.NONE)
            .foliageColorOverride(0xccffff)
            .build();
    public static final BiomeSpecialEffects PUDDING_PLAIN_AMBIENCE = new BiomeSpecialEffects.Builder()
            .waterColor(0x800000)
            .waterFogColor(0x050533)
            .fogColor(0xc0d8ff)
            .skyColor(calculateSkyColor(0.8F))
            .grassColorModifier(GrassColorModifier.NONE)
            .foliageColorOverride(0)
            .build();
    public static final BiomeSpecialEffects ICECANDY_SPIKES_AMBIENCE = new BiomeSpecialEffects.Builder()
            .waterColor(0x3f76e4)
            .waterFogColor(0x050533)
            .fogColor(0xc0d8ff)
            .skyColor(calculateSkyColor(0.0F))
            .grassColorModifier(GrassColorModifier.NONE)
            .foliageColorOverride(0)
            .build();
    public static final BiomeSpecialEffects rottenwasteAmbience(){
        BiomeSpecialEffects.Builder rotten = new BiomeSpecialEffects.Builder();
        rotten
        .waterColor(0x3f76e4)
        .waterFogColor(0x423e42)
        .fogColor(0x8000)
        .skyColor(calculateSkyColor(2.0F))
        .ambientParticle(new AmbientParticleSettings(ParticleTypes.MYCELIUM, 0.118093334F))
        .ambientLoopSound(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)
        .ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_BASALT_DELTAS_MOOD, 6000, 8, 2.0D))
        .ambientAdditionsSound(new AmbientAdditionsSettings(SoundEvents.AMBIENT_BASALT_DELTAS_ADDITIONS, 0.0111D))
        .backgroundMusic(new Music(SoundEvents.MUSIC_BIOME_BASALT_DELTAS,0,1,false)).build();
        return rotten.build();
    }

    public static BiomeGenerationSettings.Builder sugarDesertSettings(){
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
        sugarlandsBiomesOreSettings(biomegenerationsettings$builder);
        biomegenerationsettings$builder.addFeature(Decoration.TOP_LAYER_MODIFICATION , SLFeatures.SUGAR_RAPPING);
        biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, SLFeatures.SUGAR_WELL);
        return biomegenerationsettings$builder;
    }
    public static BiomeGenerationSettings.Builder puddingPlainSettings(){
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
        biomegenerationsettings$builder
        .addFeature(Decoration.UNDERGROUND_STRUCTURES, CavePlacements.MONSTER_ROOM)
        .addFeature(Decoration.TOP_LAYER_MODIFICATION, MiscOverworldPlacements.FREEZE_TOP_LAYER);
        sugarlandsBiomesOreSettings(biomegenerationsettings$builder);
        return biomegenerationsettings$builder;
    }
    public static BiomeGenerationSettings.Builder sugarForestSettings() {
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addSurfaceFreezing(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultOres(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addExtraEmeralds(biomegenerationsettings$builder);
        sugaForestTree(biomegenerationsettings$builder,2);
        return biomegenerationsettings$builder;
    }
    public static BiomeGenerationSettings.Builder icecandySpikesSettings(){
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
        biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, MiscOverworldPlacements.ICE_PATCH);
        biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, MiscOverworldPlacements.ICE_SPIKE);
        biomegenerationsettings$builder.addFeature(Decoration.RAW_GENERATION, SLFeatures.ICECANDY);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultOres(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addDefaultGrass(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addSurfaceFreezing(biomegenerationsettings$builder);
        BiomeDefaultFeatures.addSnowyTrees(biomegenerationsettings$builder);
        sugaForestTree(biomegenerationsettings$builder, 50);
        return biomegenerationsettings$builder;
    }
    public static BiomeGenerationSettings.Builder rottenWasteSettings(){
        BiomeGenerationSettings.Builder biomegenerationsettings$builder = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addAncientDebris(biomegenerationsettings$builder);
        biomegenerationsettings$builder.addFeature(Decoration.SURFACE_STRUCTURES, SLFeatures.ROTTEN_PILLAR);
        return biomegenerationsettings$builder;
    }
    public static void sugarlandsBiomesOreSettings(BiomeGenerationSettings.Builder build) {
        build.addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GRANITE_LOWER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GRANITE_UPPER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_DIORITE_UPPER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_DIORITE_LOWER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_ANDESITE_UPPER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_ANDESITE_LOWER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_COAL_UPPER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_COAL_LOWER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_IRON_UPPER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_IRON_MIDDLE)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GOLD)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_REDSTONE)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_REDSTONE_LOWER)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_DIAMOND)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_DIAMOND_LARGE)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_DIAMOND_BURIED)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_LAPIS)
        .addFeature(Decoration.UNDERGROUND_ORES, OrePlacements.ORE_LAPIS_BURIED);
    }

    public static void sugaForestTree(BiomeGenerationSettings.Builder builder,int chance) {
        //Decoration.VEGETAL_DECORATIONが正解なのだろうが、それで実行するとハゲの森が出来上がる(何も生成されない)
        /*builder.addFeature(Decoration.SURFACE_STRUCTURES, SLTreeConfigurations.SUGAR_TREE.chance(chance)
                .decorated(Placements.HEIGHTMAP_SQUARE)
                .decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
        builder.addFeature(Decoration.VEGETAL_DECORATION, Features.OAK);*/
    }

    public static MobSpawnSettings.Builder sugarForestMobSpawn(){
        MobSpawnSettings.Builder MobSpawnSettings$builder =new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.farmAnimals(MobSpawnSettings$builder);
        BiomeDefaultFeatures.commonSpawns(MobSpawnSettings$builder);
        return MobSpawnSettings$builder;
    }
    public static MobSpawnSettings.Builder sugarDesertSpawn(){
        MobSpawnSettings.Builder MobSpawnSettings$builder = new MobSpawnSettings.Builder();
        MobSpawnSettings$builder
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.RABBIT, 4, 2, 3))
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.CHICKEN, 10, 4, 4))
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.COW, 8, 4, 4));
        return MobSpawnSettings$builder;
    }
    public static MobSpawnSettings.Builder puddingPlainSpawn(){
        MobSpawnSettings.Builder MobSpawnSettings$builder = new MobSpawnSettings.Builder();
        MobSpawnSettings$builder
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.SHEEP, 12, 4, 4))
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.PIG, 10, 4, 4))
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.CHICKEN, 10, 4, 4))
        .addSpawn(MobCategory.CREATURE, new SpawnerData(EntityType.COW, 8, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.SPIDER, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.ZOMBIE, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.ZOMBIE_VILLAGER, 100, 1, 1))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.SKELETON, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.CREEPER, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.SLIME, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.ENDERMAN, 10, 1, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.WITCH, 5, 1, 1))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.STRAY, 80, 4, 4));
        return MobSpawnSettings$builder;
    }
    public static MobSpawnSettings.Builder icecandySpikesSpawn(){
        MobSpawnSettings.Builder MobSpawnSettings$builder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.snowySpawns(MobSpawnSettings$builder);
        return MobSpawnSettings$builder;
    }
    public static MobSpawnSettings.Builder rottenWasteSpawn(){
        MobSpawnSettings.Builder MobSpawnSettings$builder = new Builder();
        MobSpawnSettings$builder
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.ZOMBIFIED_PIGLIN, 100, 4, 4))
        .addSpawn(MobCategory.MONSTER, new SpawnerData(EntityType.ZOGLIN,1,1,1));
        return MobSpawnSettings$builder;
    }
}
