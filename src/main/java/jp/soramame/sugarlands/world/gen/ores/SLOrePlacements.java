package jp.soramame.sugarlands.world.gen.ores;

import java.util.List;

import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.world.gen.feature.SLFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class SLOrePlacements {

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_DIAMOND_SMALL = FeatureUtils.register(
            "sugards:ore_sugar_diamond", Feature.ORE,
            new OreConfiguration(SLFeatures.ore_sugar_diamond_target_list(), 4, 0.5F));

    public static final Holder<PlacedFeature> ORE_SUGAR_DIAMOND = PlacementUtils.register("sugards:ore_sugar_diamond",
            ORE_DIAMOND_SMALL, commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final List<OreConfiguration.TargetBlockState> ORE_SUGAR_DIAMOND_TARGET_LIST = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SLBlocks.SUGAR_DIAMOND_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SLBlocks.SUGAR_DIAMOND_BLOCK.get().defaultBlockState()));

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    @SuppressWarnings("unused")
    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
