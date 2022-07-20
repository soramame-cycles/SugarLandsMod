package jp.soramame.sugarlands.world.gen.feature;

import java.util.Random;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class SugarDesertWellsFeature extends Feature<NoFeatureConfig> {

    public static BlockState water = Blocks.WATER.defaultBlockState();


    public SugarDesertWellsFeature(Codec<NoFeatureConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @Override
    public boolean place(ISeedReader seedreader, ChunkGenerator generator, Random rand, BlockPos pos,
            NoFeatureConfig config) {

        for(pos = pos.above(); seedreader.isEmptyBlock(pos) && pos.getY() > 2; pos = pos.below()) {}

        if (!BlockStateMatcher.forBlock(SLBlocks.SUGAR_BLOCK.get()).test(seedreader.getBlockState(pos))) {
            return false;
        } else {
            for(int i = -2; i <= 2; ++i) {
                for(int j = -2; j <= 2; ++j) {
                    if (seedreader.isEmptyBlock(pos.offset(i, -1, j)) && seedreader.isEmptyBlock(pos.offset(i, -2, j))) {
                        return false;
                    }
                }
            }

            for(int l = -1; l <= 0; ++l) {
                for(int l1 = -2; l1 <= 2; ++l1) {
                   for(int k = -2; k <= 2; ++k) {
                       seedreader.setBlock(pos.offset(l1, l, k), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                   }
                }
             }

            seedreader.setBlock(pos, SugarDesertWellsFeature.water, 2);

             for(Direction direction : Direction.Plane.HORIZONTAL) {
                 seedreader.setBlock(pos.relative(direction), SugarDesertWellsFeature.water, 2);
             }

             for(int i1 = -2; i1 <= 2; ++i1) {
                for(int i2 = -2; i2 <= 2; ++i2) {
                   if (i1 == -2 || i1 == 2 || i2 == -2 || i2 == 2) {
                       seedreader.setBlock(pos.offset(i1, 1, i2), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                   }
                }
             }

             seedreader.setBlock(pos.offset(2, 1, 0), SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState(), 2);
             seedreader.setBlock(pos.offset(-2, 1, 0), SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState(), 2);
             seedreader.setBlock(pos.offset(0, 1, 2), SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState(), 2);
             seedreader.setBlock(pos.offset(0, 1, -2), SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState(), 2);

             for(int j1 = -1; j1 <= 1; ++j1) {
                for(int j2 = -1; j2 <= 1; ++j2) {
                   if (j1 == 0 && j2 == 0) {
                       seedreader.setBlock(pos.offset(j1, 4, j2), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                   } else {
                       seedreader.setBlock(pos.offset(j1, 4, j2), SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState(), 2);
                   }
                }
             }

             for(int k1 = 1; k1 <= 3; ++k1) {
                 seedreader.setBlock(pos.offset(-1, k1, -1), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                 seedreader.setBlock(pos.offset(-1, k1, 1), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                 seedreader.setBlock(pos.offset(1, k1, -1), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
                 seedreader.setBlock(pos.offset(1, k1, 1), SLBlocks.SUGAR_STONE.get().defaultBlockState(), 2);
             }

             return true;
          }
    }

}
