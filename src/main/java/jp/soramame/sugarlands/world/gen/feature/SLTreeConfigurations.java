package jp.soramame.sugarlands.world.gen.feature;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class SLTreeConfigurations {

	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SUGAR_TREE = Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(SLBlocks.SUGAR_LOG.get().defaultBlockState()),
			new SimpleBlockStateProvider(SLBlocks.SUGAR_LEAVES.get().defaultBlockState()),
			new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
			new StraightTrunkPlacer(5, 2, 0),
			new TwoLayerFeature(1, 0, 1)
			).ignoreVines().build());
}
