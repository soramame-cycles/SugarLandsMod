package jp.soramame.sugarlands.world.gen.feature;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.world.gen.surfacebuilders.SugarSurfaceBuilder;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SLWorldGen {

    //private static int sugarDia = 0;

    private static final DeferredRegister<Feature<?>> SLWGEN = DeferredRegister.create(ForgeRegistries.FEATURES,
            SugarLandsCore.MOD_ID);

    public static final Feature<NoneFeatureConfiguration> GEN_SUGAR_WELL = new SugarDesertWellsFeature(
            NoneFeatureConfiguration.CODEC);
    public static final Feature<NoneFeatureConfiguration> GEN_ICECANDY_SPIKE = new IceCandySpikeFeature(
            NoneFeatureConfiguration.CODEC);
    public static final Feature<NoneFeatureConfiguration> GEN_ROTTEN_DELTA = new RottenWastePillar(
            NoneFeatureConfiguration.CODEC);
    public static final Feature<NoneFeatureConfiguration> RAPPING_SUGAR = new SugarSurfaceBuilder(
            NoneFeatureConfiguration.CODEC);
    //public static final Feature<OreConfiguration> SUGAR_DIAMOND_GEN = new SLOreFeature(sugarDia, 15);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SUGAR_DESERT_WELL = SLWGEN
            .register("sugar_desert_well", () -> GEN_SUGAR_WELL);
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> ICECANDY_SPIKE = SLWGEN
            .register("icecandy_spike", () -> GEN_ICECANDY_SPIKE);
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> ROTTEN_DELTA = SLWGEN.register("roten_delta",
            () -> GEN_ROTTEN_DELTA);
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> SUGAR = SLWGEN.register("sugar_surface",
            () -> RAPPING_SUGAR);
    //public static final RegistryObject<Feature<OreConfiguration>> SUGAR_DIA = SLWGEN.register("ore_sugar_diamond",
    //        () -> SUGAR_DIAMOND_GEN);

    public static void register(IEventBus event) {
        SLWGEN.register(event);
    }
}
