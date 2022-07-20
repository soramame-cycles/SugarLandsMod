package jp.soramame.sugarlands.provider;

import org.jetbrains.annotations.Nullable;

import jp.soramame.sugarlands.init.SLBiomes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLBiomeTagsProvider extends BiomeTagsProvider {

    public SLBiomeTagsProvider(DataGenerator p_211094_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_211094_, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BiomeTags.IS_OVERWORLD).add(SLBiomes.SUGAR_DESERT,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES,SLBiomes.SUGAR_FOREST);
        tag(BiomeTags.IS_NETHER).add(SLBiomes.ROTTEN_WASTES);
        tag(BiomeTags.IS_FOREST).add(SLBiomes.SUGAR_FOREST);

        tag(Biomes.IS_COLD).add(SLBiomes.ICECANDY_SPIKES);
        tag(Biomes.IS_HOT).add(SLBiomes.SUGAR_DESERT);
        tag(Biomes.IS_SANDY).add(SLBiomes.SUGAR_DESERT);
        tag(Biomes.IS_SNOWY).add(SLBiomes.PUDDING_PLAIN);
        //tag(Biomes.IS_OVERWORLD).add(SLBiomes.SUGAR_DESERT,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES,SLBiomes.SUGAR_FOREST);
        tag(Biomes.IS_HOT_OVERWORLD).add(SLBiomes.SUGAR_DESERT);
        tag(Biomes.IS_PLAINS).add(SLBiomes.SUGAR_DESERT,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES,SLBiomes.SUGAR_FOREST);

        tag(BiomeTags.HAS_DESERT_PYRAMID).add(SLBiomes.SUGAR_DESERT);
        tag(BiomeTags.HAS_MINESHAFT).add(SLBiomes.SUGAR_DESERT,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES,SLBiomes.SUGAR_FOREST);
        tag(BiomeTags.HAS_STRONGHOLD).add(SLBiomes.SUGAR_DESERT,SLBiomes.PUDDING_PLAIN,SLBiomes.ICECANDY_SPIKES,SLBiomes.SUGAR_FOREST);
    }
}
