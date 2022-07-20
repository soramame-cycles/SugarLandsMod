package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.world.gen.feature.SLTreeConfigurations;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class Sugar_Tree extends AbstractTreeGrower {

    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_,
            boolean p_222911_) {
        return SLTreeConfigurations.SUGAR_TREE;
    }

}
