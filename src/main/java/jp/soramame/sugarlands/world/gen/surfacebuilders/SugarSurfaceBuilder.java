package jp.soramame.sugarlands.world.gen.surfacebuilders;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class SugarSurfaceBuilder extends Feature<NoneFeatureConfiguration> {

    private int sugarBlock = 0;
    private int sugarStone = 1;
    private int calamelSauce = 2;
    private int puddingBlock = 3;

    public SugarSurfaceBuilder(Codec<NoneFeatureConfiguration> p_65786_) {
        super(p_65786_);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> p) {
        WorldGenLevel world = p.level();
        BlockPos blockpos = p.origin();
        MutableBlockPos mbpos = new MutableBlockPos();
        MutableBlockPos mbpos1 = new MutableBlockPos();
        RandomSource rand = p.random();

        int top = rand.nextInt(3) + 2;
        int under = top * 2;

        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int k = blockpos.getX() + i;
                int l = blockpos.getZ() + j;
                int i1 = world.getHeight(Heightmap.Types.WORLD_SURFACE, k, l);

                mbpos.set(k, i1, l);

                for (int m = 0; m < under; m++) {
                    mbpos1.set(mbpos).move(Direction.DOWN, m);
                    if (target(world.getBlockState(mbpos1))) {
                        setBlock(world, mbpos1, (m < top));
                    }
                }

            }
        }
        return true;
    }

    private void setBlock(WorldGenLevel world, MutableBlockPos pos, boolean flag) {
        if (world.getBiome(pos).is(SLBiomes.SUGAR_DESERT)) {
            world.setBlock(pos, flag ? get(sugarBlock) : get(sugarStone), 2);
        } else if (world.getBiome(pos).is(SLBiomes.PUDDING_PLAIN)) {
            world.setBlock(pos, flag ? get(calamelSauce) : get(puddingBlock), 2);
        }
    }

    private boolean target(BlockState b) {
        Block[] list = { Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.STONE };
        for (Block taget : list) {
            if (b.is(taget))
                return true;
        }
        return false;
    }

    private BlockState get(int val) {
        Block b = switch (val) {
        case 0 -> SLBlocks.SUGAR_BLOCK.get();
        case 1 -> SLBlocks.SUGAR_STONE.get();
        case 2 -> SLBlocks.CALAMEL_SAUCE.get();
        case 3 -> SLBlocks.PUDDING_BLOCK.get();
        default -> Blocks.DIRT;
        };
        return b.defaultBlockState();
    }
}
