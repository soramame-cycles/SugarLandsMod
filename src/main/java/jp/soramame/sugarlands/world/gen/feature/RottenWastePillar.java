package jp.soramame.sugarlands.world.gen.feature;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class RottenWastePillar extends Feature<NoneFeatureConfiguration> {

    public RottenWastePillar(Codec<NoneFeatureConfiguration> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration>feature) {
        final BlockState ROTTEN = SLBlocks.ROTTEN_FLESH_BLOCK.get().defaultBlockState();
        WorldGenLevel worldgenlevel = feature.level();
        BlockPos pos = feature.origin();
        RandomSource rand = feature.random();
        while(worldgenlevel.isEmptyBlock(pos) && pos.getY()==13) {
            pos = pos.below();
        }
        if(rand.nextInt(60)==0) {
            pos = pos.above(10 + rand.nextInt(30));
        }
        while(13<=pos.getY()) {
            setBlock(worldgenlevel, pos, ROTTEN);
            if(rand.nextBoolean()) {
                int height = rand.nextInt(10)+1;
                for(int i=0;i<height;i++) {
                    BlockPos[] fourWay = {pos.west(i),pos.south(i),pos.north(i),pos.east(i)};
                    for (BlockPos b:fourWay) {
                        setBlock(worldgenlevel, b, ROTTEN);
                        subPillar(worldgenlevel, b, rand, ROTTEN);
                    }
                }
            }
            pos = pos.below();
        }
        return true;
    }
    private void subPillar(WorldGenLevel worldgenlevel,BlockPos pos,RandomSource rand,BlockState state) {
        BlockPos[] Way = {pos.above(),pos.west(),pos.south(),pos.north(),pos.east(),
                pos.west().south(),pos.west().north(),pos.south().west(),pos.south().east(),
                pos.north().west(),pos.north().east(),pos.east().south(),pos.east().north()};
        if(rand.nextBoolean()) {
            for(BlockPos b:Way) {
                if(worldgenlevel.getBlockState(b) == Blocks.AIR.defaultBlockState()) {
                    setBlock(worldgenlevel, b, state);
                }
            }
        }
    }
}
