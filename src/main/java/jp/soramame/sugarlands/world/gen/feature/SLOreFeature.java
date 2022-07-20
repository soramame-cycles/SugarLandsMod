package jp.soramame.sugarlands.world.gen.feature;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class SLOreFeature extends Feature<OreConfiguration> {

    private int topY;
    private BlockState base;
    private BlockState deep;

    private int setBlockState;

    private SLOreFeature(Codec<OreConfiguration> codec) {
        super(codec);
    }

    public SLOreFeature(int block,int topY) {
        this(OreConfiguration.CODEC);
        this.setBlockState = block;
        SugarLandsCore.LOGGER.debug("コンストラクター");
    }

    @Override
    public boolean place(FeaturePlaceContext<OreConfiguration> feature) {
        WorldGenLevel world = feature.level();
        BlockPos pos = feature.origin();
        RandomSource randomsource = feature.random();
        OreConfiguration config = feature.config();
        MutableBlockPos mbpos = new MutableBlockPos();
        ChunkGenerator gen = feature.chunkGenerator();

        setBlockState(this.setBlockState);

        for (int y = -59; y < topY; y++) {
            for(int x=0; x<16; x++) {
                for(int z=0; z<16; z++) {
                    int getX = pos.getX()+x;
                    int getZ = pos.getZ()+z;

                    mbpos.set(getX, y, getZ);
                    SugarLandsCore.LOGGER.debug("if文前");
                    if(world.getBlockState(mbpos).getTags().anyMatch(tag -> tag.equals(BlockTags.BASE_STONE_OVERWORLD))) {
                        boolean sucsess = setBlock(world, mbpos, base);
                        SugarLandsCore.LOGGER.debug("ORE:"+sucsess);
                        boolean sucsess1 = ORE.place(config, world, gen, randomsource, mbpos);
                        SugarLandsCore.LOGGER.debug("ORE:"+sucsess1);
                    }else if(world.getBlockState(mbpos).getTags().anyMatch(tag -> tag.equals(BlockTags.DEEPSLATE_ORE_REPLACEABLES))) {
                        setBlock(world,mbpos,deep);
                    }
                    SugarLandsCore.LOGGER.debug("if文後");

                }
            }
        }

        return true;
    }
    private boolean setBlock(WorldGenLevel world, MutableBlockPos pos,BlockState state) {
        boolean flag = false;
        world.setBlock(pos, state,2);
        BlockPos[] Way = {pos.above(),pos.west(),pos.south(),pos.north(),pos.east(),
                pos.west().south(),pos.west().north(),pos.south().west(),pos.south().east(),
                pos.north().west(),pos.north().east(),pos.east().south(),pos.east().north()
        };
        for(BlockPos b:Way) {
            world.setBlock(b, state,2);
            flag = true;
        }
        return flag;
    }

    private void setBlockState(int block) {
        if(block == 0) {
            base = SLBlocks.SUGAR_DIAMOND_ORE.get().defaultBlockState();
            deep = SLBlocks.SUGAR_DIAMOND_BLOCK.get().defaultBlockState();
        }
    }
}
