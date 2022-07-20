package jp.soramame.sugarlands.world.gen.surfacebuilders;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.ValleySurfaceBuilder;

public class RottenWasteSurfaceBuilder extends ValleySurfaceBuilder {

    public RottenWasteSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232130_1_) {
        super(p_i232130_1_);
    }

    @Override
    protected ImmutableList<BlockState> getFloorBlockStates() {
        return ImmutableList.of(SLBlocks.ROTTEN_FLESH_BLOCK.get().defaultBlockState(),Blocks.NETHERRACK.defaultBlockState());
    }

    @Override
    protected ImmutableList<BlockState> getCeilingBlockStates() {

        return ImmutableList.of(Blocks.NETHERRACK.defaultBlockState());
    }

    @Override
    protected BlockState getPatchBlockState() {
        return SLBlocks.RAW_SUGAR_BLOCK.get().defaultBlockState();
    }

}
