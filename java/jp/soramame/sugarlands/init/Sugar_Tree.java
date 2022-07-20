package jp.soramame.sugarlands.init;

import java.util.Random;

import jp.soramame.sugarlands.world.gen.feature.SLTreeConfigurations;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class Sugar_Tree extends Tree {

    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random p_225546_1_,
            boolean p_225546_2_) {
        return SLTreeConfigurations.SUGAR_TREE;
    }

}
