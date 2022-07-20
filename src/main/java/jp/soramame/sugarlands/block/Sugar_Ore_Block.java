package jp.soramame.sugarlands.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;

/**
 * @deprecated 鉱石の経験値を定義時に設定できるようになったため {@link DropExperienceBlock}
 * */

@Deprecated
public class Sugar_Ore_Block extends DropExperienceBlock {
    private final IntProvider xpRange;

    public Sugar_Ore_Block(Properties properties) {
        this(properties, ConstantInt.of(0));
    }

    public Sugar_Ore_Block(Properties properties, IntProvider xpRange) {
        super(properties);
        this.xpRange = xpRange;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level,
            RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? this.xpRange.sample(randomSource) : 0;
    }

}
