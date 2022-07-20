package jp.soramame.sugarlands.world.gen.feature;

import java.util.ArrayList;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class IceCandySpikeFeature extends Feature<NoFeatureConfig> {

    public IceCandySpikeFeature(Codec<NoFeatureConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    public static final Logger LOGGER = LogManager.getLogger();

    //実験用のstaticイニシャライザー
    static {
        LOGGER.debug("どうして");
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean place(ISeedReader reader, ChunkGenerator gen, Random rand, BlockPos pos, NoFeatureConfig config) {
        ArrayList<BlockState> ice_color = new ArrayList<BlockState>();
        ice_color.add(SLBlocks.BLACK_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.BLUE_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.BROWN_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.CYAN_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.GRAY_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.GREEN_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.LIGHT_BLUE_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.LIGHT_GRAY_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.LIME_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.MAGENTA_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.ORANGE_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.PINK_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.PURPLE_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.RED_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.WHITE_ICE_CANDY.get().defaultBlockState());
        ice_color.add(SLBlocks.YELLOW_ICE_CANDY.get().defaultBlockState());
        ice_color.add(Blocks.PACKED_ICE.defaultBlockState());

        /**numberにリスト内にある要素の数までのランダムな数字を代入
         * color_stateにnumber番目のカラーのブロックを代入
         * */
        int number = new Random().nextInt(ice_color.size());
        BlockState color_state = ice_color.get(number);

        while (reader.isEmptyBlock(pos) && pos.getY() > 2) {
            pos = pos.below();
        }

        LOGGER.debug("gen");
        pos = pos.above(rand.nextInt(4));
        int i = rand.nextInt(4) + 7;
        int j = i / 4 + rand.nextInt(2);
        //jが1より大きいかつ乱数が0の時
        if (j > 1 && rand.nextInt(60) == 0) {
            pos = pos.above(10 + rand.nextInt(30));
        }
        for (int k = 0; k < i; ++k) {
            float f = (1.0F - (float) k / (float) i) * (float) j;
            int m = MathHelper.ceil(f);

            for (int i1 = -m; i1 <= m; ++i1) {
                float f1 = (float) MathHelper.abs(i1) - 0.25F;

                for (int j1 = -m; j1 <= m; ++j1) {
                    float f2 = (float) MathHelper.abs(j1) - 0.25F;
                    if ((i1 == 0 && j1 == 0 || !(f1 * f1 + f2 * f2 > f * f))
                            && (i1 != -m && i1 != m && j1 != -m && j1 != m || !(rand.nextFloat() > 0.75F))) {
                        BlockState blockstate = reader.getBlockState(pos.offset(i1, k, j1));

                        Block block = blockstate.getBlock();
                        if (blockstate.isAir(reader, pos.offset(i1, k, j1)) || isDirt(block)
                                || block == Blocks.SNOW_BLOCK || block == Blocks.ICE || block == Blocks.SNOW) {
                            this.setBlock(reader, pos.offset(i1, k, j1), color_state);
                        }

                        if (k != 0 && m > 1) {
                            blockstate = reader.getBlockState(pos.offset(i1, -k, j1));
                            block = blockstate.getBlock();
                            if (blockstate.isAir(reader, pos.offset(i1, -k, j1)) || isDirt(block)
                                    || block == Blocks.SNOW_BLOCK || block == Blocks.ICE || block == Blocks.SNOW) {
                                this.setBlock(reader, pos.offset(i1, -k, j1), color_state);
                            }
                        }
                    }
                }
            }
        }
        int k1 = j - 1;
        if (k1 < 0) {
            k1 = 0;
        } else if (k1 > 1) {
            k1 = 1;
        }

        for (int l1 = -k1; l1 <= k1; ++l1) {
            for (int i2 = -k1; i2 <= k1; ++i2) {
                BlockPos blockpos = pos.offset(l1, -1, i2);
                int j2 = 50;
                if (Math.abs(l1) == 1 && Math.abs(i2) == 1) {
                    j2 = rand.nextInt(5);
                }

                while (blockpos.getY() > 50) {
                    BlockState blockstate1 = reader.getBlockState(blockpos);
                    Block block1 = blockstate1.getBlock();
                    if (!blockstate1.isAir(reader, blockpos) && !isDirt(block1) && block1 != Blocks.SNOW_BLOCK
                            && block1 != Blocks.ICE && block1 != Blocks.PACKED_ICE
                            && block1 != SLBlocks.BLACK_ICE_CANDY.get()
                            && block1 != SLBlocks.BLUE_ICE_CANDY.get() && block1 != SLBlocks.BROWN_ICE_CANDY.get()
                            && block1 != SLBlocks.CYAN_ICE_CANDY.get() && block1 != SLBlocks.GRAY_ICE_CANDY.get()
                            && block1 != SLBlocks.GREEN_ICE_CANDY.get() && block1 != SLBlocks.LIGHT_BLUE_ICE_CANDY.get()
                            && block1 != SLBlocks.LIGHT_GRAY_ICE_CANDY.get() && block1 != SLBlocks.LIME_ICE_CANDY.get()
                            && block1 != SLBlocks.MAGENTA_ICE_CANDY.get() && block1 != SLBlocks.ORANGE_ICE_CANDY.get()
                            && block1 != SLBlocks.PINK_ICE_CANDY.get() && block1 != SLBlocks.PURPLE_ICE_CANDY.get()
                            && block1 != SLBlocks.RED_ICE_CANDY.get() && block1 != SLBlocks.WHITE_ICE_CANDY.get()
                            && block1 != SLBlocks.YELLOW_ICE_CANDY.get()) {
                        break;
                    }

                    this.setBlock(reader, blockpos, color_state);
                    blockpos = blockpos.below();
                    --j2;
                    if (j2 <= 0) {
                        blockpos = blockpos.below(rand.nextInt(5) + 1);
                        j2 = rand.nextInt(5);
                    }
                }
            }
        }
        return true;
    }

}
