package jp.soramame.sugarlands.world.gen.feature;

import java.util.Random;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class Sugar_Tree extends Tree {

	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random p_225546_1_,
			boolean p_225546_2_) {
		return SLFeatures.SUGAR;
	}

}
