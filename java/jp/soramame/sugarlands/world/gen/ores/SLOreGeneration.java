package jp.soramame.sugarlands.world.gen.ores;

import java.util.List;

import com.google.common.collect.ImmutableList;

import jp.soramame.sugarlands.config.SugarLandsConfigs;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features.Placements;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class SLOreGeneration {

    public static final RuleTest ENDSTONE = new TagMatchRuleTest(Blocks.END_STONES);

    public static void generateOres(final BiomeLoadingEvent event) {
        /* なんでoverworld無いんですか？*/
        List<Category> ctg = ImmutableList.of(Category.PLAINS, Category.BEACH, Category.DESERT, Category.EXTREME_HILLS,
                Category.FOREST, Category.ICY, Category.JUNGLE, Category.MESA, Category.MUSHROOM, Category.OCEAN,
                Category.RIVER,Category.SAVANNA,Category.SWAMP,Category.TAIGA);
        for(Category c:ctg) {
            if(event.getCategory().equals(c)) {
                generateOre(event.getGeneration(), SLBlocks.BISMUTH_ORE.get().defaultBlockState(), 9, 16, 10);
                generateOre(event.getGeneration(),SLBlocks.SUGAR_DIAMOND_ORE.get().defaultBlockState(),9,16,7);
                if (SugarLandsConfigs.Common.isGen_sugar_block()) {
                    generateOre(event.getGeneration(), SLBlocks.SUGAR_BLOCK.get().defaultBlockState(), 16, 128, 20);
                }
            }
        }
        if(event.getCategory().equals(Category.NETHER)) {
            generateNetherOre(event.getGeneration(), SLBlocks.SUGARRACK.get().defaultBlockState(), 14, 40, 10);
        }else if(event.getCategory().equals(Category.THEEND)) {
            generateTheEndOre(event.getGeneration(), SLBlocks.END_SUGAR_STONE.get().defaultBlockState(), 14, 40, 20);
        }
    }
    /** @param range Y軸<br>
     * @param count 鉱脈の大きさ*/
    private static void generateOre(BiomeGenerationSettingsBuilder builder, BlockState state,int veinSize, int range, int count) {
        builder.addFeature(Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, state, veinSize))
                .range(range).squared().count(count));
    }
    private static void generateNetherOre(BiomeGenerationSettingsBuilder builder, BlockState state,int veinSize, int range, int count) {
        builder.addFeature(Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, state, veinSize))
                .range(range).squared().count(count).decorated(Placements.RANGE_10_20_ROOFED));
    }
    private static void generateTheEndOre(BiomeGenerationSettingsBuilder builder, BlockState state,int veinSize, int range, int count) {
        builder.addFeature(Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(ENDSTONE, state, veinSize))
                .range(range).squared().count(count));
    }
}
