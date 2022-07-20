package jp.soramame.sugarlands.world.gen.feature;

import java.util.Random;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class RottenWastePillar extends Feature<NoFeatureConfig> {

    public RottenWastePillar(Codec<NoFeatureConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @Override
    public boolean place(ISeedReader reader, ChunkGenerator gen, Random rand, BlockPos pos,NoFeatureConfig config) {
        final BlockState ROTTEN = SLBlocks.ROTTEN_FLESH_BLOCK.get().defaultBlockState();

        while(reader.isEmptyBlock(pos) && pos.getY()==13) {
            pos = pos.below();
        }
        if(rand.nextInt(60)==0) {
            pos = pos.above(10 + rand.nextInt(30));
        }
        while(13<=pos.getY()) {
            setBlock(reader, pos, ROTTEN);
            if(rand.nextBoolean()) {
                int height = rand.nextInt(10)+1;
                for(int i=0;i<height;i++) {
                    BlockPos[] fourWay = {pos.west(i),pos.south(i),pos.north(i),pos.east(i)};
                    for (BlockPos b:fourWay) {
                        setBlock(reader, b, ROTTEN);
                        subPillar(reader, b, rand, ROTTEN);
                    }
                }
            }
            pos = pos.below();
        }
        return true;
    }

    private void subPillar(ISeedReader reader,BlockPos pos,Random rand,BlockState state) {
        BlockPos[] fiveWay = {pos.above(),pos.west(),pos.south(),pos.north(),pos.east()};
        if(rand.nextBoolean()) {
            for(BlockPos b:fiveWay) {
                if(reader.getBlockState(b) == Blocks.AIR.defaultBlockState()) {
                    setBlock(reader, b, state);
                }
            }
        }
    }
}
