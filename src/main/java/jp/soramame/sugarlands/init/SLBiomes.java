package jp.soramame.sugarlands.init;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.world.biome.SLBiomeFeatures;
import jp.soramame.sugarlands.world.biome.SLBiomeSource;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biome.BiomeBuilder;
import net.minecraft.world.level.biome.Biome.Precipitation;
import net.minecraft.world.level.biome.Biome.TemperatureModifier;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Climate.Parameter;
import net.minecraft.world.level.biome.Climate.ParameterPoint;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBiomes {

    private static final DeferredRegister<Biome> SLB = DeferredRegister.create(ForgeRegistries.BIOMES,
            SugarLandsCore.MOD_ID);

    private static String sugar_desert = "sugar_desert";
    private static String pudding_plain = "pudding_plain";
    private static String sugar_forest = "sugar_forest";
    private static String icecandy_spikes = "icecandy_spikes";
    private static String rotten_wastes = "rotten_wastes";

    public static final ResourceKey<Biome> SUGAR_DESERT = register(sugar_desert);
    public static final ResourceKey<Biome> PUDDING_PLAIN = register(pudding_plain);
    public static final ResourceKey<Biome> SUGAR_FOREST = register(sugar_forest);
    public static final ResourceKey<Biome> ICECANDY_SPIKES = register(icecandy_spikes);
    public static final ResourceKey<Biome> ROTTEN_WASTES = register(rotten_wastes);

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(SugarLandsCore.MOD_ID, name));
    }

    public static final RegistryObject<Biome> SUGAR_DESERT_REGISTRY = SLB.register(sugar_desert,
            () -> new BiomeBuilder()
                    .generationSettings(SLBiomeFeatures.sugarDesertSettings().build())
                    .temperature(2.0F)
                    .downfall(0.0F)
                    .precipitation(Precipitation.NONE)
                    .specialEffects(SLBiomeFeatures.SUGAR_DESERT_AMBIENCE)
                    .temperatureAdjustment(TemperatureModifier.NONE)
                    .mobSpawnSettings(SLBiomeFeatures.sugarDesertSpawn().build())
                    .build());

    public static final RegistryObject<Biome> PUDDING_PLAIN_REGISTRY = SLB.register(pudding_plain,
            () -> new BiomeBuilder()
                    .generationSettings(SLBiomeFeatures.puddingPlainSettings().build())
                    .downfall(0.4F)
                    .mobSpawnSettings(SLBiomeFeatures.puddingPlainSpawn().build())
                    .precipitation(Precipitation.SNOW)
                    .specialEffects(SLBiomeFeatures.PUDDING_PLAIN_AMBIENCE)
                    .temperature(0.0F)
                    .temperatureAdjustment(TemperatureModifier.NONE)
                    .build());

    public static final RegistryObject<Biome> SUGAR_FOREST_REGISTRY = SLB.register(sugar_forest,
            () -> new BiomeBuilder()
                    .generationSettings(SLBiomeFeatures.sugarForestSettings().build())
                    .downfall(0.6F)
                    .mobSpawnSettings(SLBiomeFeatures.sugarForestMobSpawn().build())
                    .precipitation(Precipitation.NONE)
                    .specialEffects(SLBiomeFeatures.SUGAR_DESERT_AMBIENCE)
                    .temperature(2.0F)
                    .temperatureAdjustment(TemperatureModifier.FROZEN)
                    .build());

    public static final RegistryObject<Biome> ICECANDY_SPIKES_REGISTRY = SLB.register(icecandy_spikes,
            () -> new BiomeBuilder()
                    .generationSettings(SLBiomeFeatures.icecandySpikesSettings().build())
                    .downfall(0.5F)
                    .mobSpawnSettings(SLBiomeFeatures.icecandySpikesSpawn().build())
                    .precipitation(Precipitation.SNOW)
                    .specialEffects(SLBiomeFeatures.ICECANDY_SPIKES_AMBIENCE)
                    .temperature(0)
                    .temperatureAdjustment(TemperatureModifier.FROZEN)
                    .build());

    public static final RegistryObject<Biome> ROTTEN_WASTES_REGISTRY = SLB.register(rotten_wastes,
            () -> new BiomeBuilder()
                    .generationSettings(SLBiomeFeatures.rottenWasteSettings().build())
                    .downfall(0)
                    .mobSpawnSettings(SLBiomeFeatures.rottenWasteSpawn().build())
                    .precipitation(Precipitation.NONE)
                    .specialEffects(SLBiomeFeatures.rottenwasteAmbience())
                    .temperature(2.0F)
                    .build());

    public static Collection<RegistryObject<Biome>> getEntries() {
        return SLB.getEntries();
    }

    public static void register(IEventBus event) {
        SLB.register(event);
    }

    public static void addBiome() {
        BiomeManager.addBiome(BiomeType.DESERT, new BiomeEntry(SUGAR_DESERT, 10));
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(PUDDING_PLAIN, 10));
        BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(SUGAR_FOREST, 10));
        BiomeManager.addBiome(BiomeType.ICY, new BiomeEntry(ICECANDY_SPIKES, 10));
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(ROTTEN_WASTES, 10));
        ImmutableList<BiomeEntry> tako = BiomeManager.getBiomes(BiomeType.DESERT);
        List<ResourceKey<Biome>> ika = BiomeManager.getAdditionalOverworldBiomes();

        tako.forEach(e->SugarLandsCore.LOGGER.debug("getBiomes(BiomeType.DESERT)に登録されているのは:" + e.getKey()));
        ika.forEach(b->SugarLandsCore.LOGGER.debug("getAdditionalOverworldBiomesに登録されているのは:" + b));
        ika.forEach(SugarLandsCore.LOGGER::info);


        //FIXME これ全部のバイオームうわがきしてね？？？？？？
        new SLBiomeSource(new ResourceLocation("overworld"), func->{
            ImmutableList.Builder<Pair<Climate.ParameterPoint, Holder<Biome>>> builder = ImmutableList.builder();
            builder.add(Pair.of(new ParameterPoint(Parameter.point(2.0F), Parameter.point(0), Parameter.point(0), Parameter.point(0), Parameter.point(0), Parameter.point(0), 0), func.getHolderOrThrow(SUGAR_DESERT)));

            return new Climate.ParameterList<>(builder.build());
        }) ;
    }

    public static void addNetherBiome() {

    }
}
