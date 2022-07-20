package jp.soramame.sugarlands.world.gen.feature;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class SugarDesertWellsFeature extends Feature<NoneFeatureConfiguration> {

    public SugarDesertWellsFeature(Codec<NoneFeatureConfiguration> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> feature) {
        WorldGenLevel worldgenlevel = feature.level();
        BlockPos blockpos = feature.origin();
        //SugarLandsCore.LOGGER.debug("X:"+blockpos.getX()+" Y:"+blockpos.getY()+" Z:"+blockpos.getZ());

        for (blockpos = blockpos.above(); worldgenlevel.isEmptyBlock(blockpos)
                && blockpos.getY() > worldgenlevel.getMinBuildHeight() + 2; blockpos = blockpos.below()) {
        }
        if (match(Blocks.WATER).test(worldgenlevel.getBlockState(blockpos))) {
            return false;
        } else {
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    if (worldgenlevel.isEmptyBlock(blockpos.offset(i, -1, j))
                            && worldgenlevel.isEmptyBlock(blockpos.offset(i, -2, j))) {
                        return false;
                    }
                }
            }

            for (int l = -1; l <= 0; ++l) {
                for (int l1 = -2; l1 <= 2; ++l1) {
                    for (int k = -2; k <= 2; ++k) {
                        worldgenlevel.setBlock(blockpos.offset(l1, l, k), sugarstone(), 2);
                    }
                }
            }

            worldgenlevel.setBlock(blockpos, this.water(), 2);

            for (Direction direction : Direction.Plane.HORIZONTAL) {
                worldgenlevel.setBlock(blockpos.relative(direction), water(), 2);
            }

            for (int i1 = -2; i1 <= 2; ++i1) {
                for (int i2 = -2; i2 <= 2; ++i2) {
                    if (i1 == -2 || i1 == 2 || i2 == -2 || i2 == 2) {
                        worldgenlevel.setBlock(blockpos.offset(i1, 1, i2), sugarstone(), 2);
                    }
                }
            }

            worldgenlevel.setBlock(blockpos.offset(2, 1, 0), sugarslab(), 2);
            worldgenlevel.setBlock(blockpos.offset(-2, 1, 0), sugarslab(), 2);
            worldgenlevel.setBlock(blockpos.offset(0, 1, 2), sugarslab(), 2);
            worldgenlevel.setBlock(blockpos.offset(0, 1, -2), sugarslab(), 2);

            for (int j1 = -1; j1 <= 1; ++j1) {
                for (int j2 = -1; j2 <= 1; ++j2) {
                    if (j1 == 0 && j2 == 0) {
                        worldgenlevel.setBlock(blockpos.offset(j1, 4, j2), sugarstone(), 2);
                    } else {
                        worldgenlevel.setBlock(blockpos.offset(j1, 4, j2), sugarslab(), 2);
                    }
                }
            }

            for (int k1 = 1; k1 <= 3; ++k1) {
                worldgenlevel.setBlock(blockpos.offset(-1, k1, -1), sugarstone(), 2);
                worldgenlevel.setBlock(blockpos.offset(-1, k1, 1), sugarstone(), 2);
                worldgenlevel.setBlock(blockpos.offset(1, k1, -1), sugarstone(), 2);
                worldgenlevel.setBlock(blockpos.offset(1, k1, 1), sugarstone(), 2);
            }
            SugarLandsCore.LOGGER.debug("sucsess:desertwell");
            SugarLandsCore.LOGGER.debug("X:"+blockpos.getX()+" Y:"+blockpos.getY()+" Z:"+blockpos.getZ());
            return true;
        }
    }

    private BlockState sugarstone() {
        return SLBlocks.SUGAR_STONE.get().defaultBlockState();
    }
    private BlockState sugarslab() {
        return SLBlocks.SUGAR_STONE_SLAB.get().defaultBlockState();
    }
    private BlockState water() {
        return Blocks.WATER.defaultBlockState();
    }

    private BlockStatePredicate match(Block block) {
        return BlockStatePredicate.forBlock(block);
    }
}
