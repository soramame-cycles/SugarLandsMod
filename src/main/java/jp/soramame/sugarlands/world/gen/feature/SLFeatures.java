package jp.soramame.sugarlands.world.gen.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class SLFeatures {

	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SUGAR =
			register("sugar", Feature.TREE.configured((
					new BaseTreeFeatureConfig.Builder(
							new SimpleBlockStateProvider(BlockConstants.SUGAR_LOG),
							new SimpleBlockStateProvider(BlockConstants.SUGAR_LEAVES),
							new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
							new StraightTrunkPlacer(5, 2, 0),
							new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));

	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
		}
}
