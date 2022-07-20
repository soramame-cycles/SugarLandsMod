package jp.soramame.sugarlands.world.gen.feature;

import java.util.List;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLFeatures {

    private static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> sugarwells = FeatureUtils
            .register(set("sugar_desert_well"), SLWorldGen.GEN_SUGAR_WELL);
    private static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> icecandy = FeatureUtils
            .register(set("icecandy_spike"), SLWorldGen.GEN_ICECANDY_SPIKE);
    private static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> rottenpillar = FeatureUtils
            .register(set("rotten_delta"), SLWorldGen.GEN_ROTTEN_DELTA);
    /*private static Holder<ConfiguredFeature<OreConfiguration, ?>> ore_sugar_diamond_large = FeatureUtils
            .register(set("ore_sugar_diamond"), Feature.ORE, new OreConfiguration(ore_sugar_diamond_target_list(), 12, 0.7F));*/

    private static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> sugar_rapping = FeatureUtils
            .register("sugar_surface", SLWorldGen.RAPPING_SUGAR);

    //地表の構造物
    public static final Holder<PlacedFeature> SUGAR_WELL = PlacementUtils.register("sugar_desert_well", sugarwells,
            RarityFilter.onAverageOnceEvery(1000), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
            BiomeFilter.biome());
    //SLWorldGen.GEN_SUGAR_WELL;
    public static final Holder<PlacedFeature> ICECANDY = PlacementUtils.register("icecandy_spike", icecandy,
            CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> ROTTEN_PILLAR = PlacementUtils.register("roten_delta", rottenpillar,
            CountPlacement.of(10), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final Holder<PlacedFeature> SUGAR_RAPPING = PlacementUtils.register("sugar_rapping", sugar_rapping,
            BiomeFilter.biome());
    //鉱石
    public static final List<OreConfiguration.TargetBlockState> ore_sugar_diamond_target_list() {
        return List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, sugarDia()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    SLBlocks.SUGAR_DIAMOND_BLOCK.get().defaultBlockState()));
    }

    private static String set(String name) {
        return SugarLandsCore.MOD_ID + ":" + name;
    }
    private static BlockState sugarDia() {
        return SLBlocks.SUGAR_DIAMOND_ORE.get().defaultBlockState();
    }
}
