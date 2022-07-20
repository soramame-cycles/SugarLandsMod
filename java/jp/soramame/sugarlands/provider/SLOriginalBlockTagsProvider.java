package jp.soramame.sugarlands.provider;

import java.nio.file.Path;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.tags.SLBlockTags;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLOriginalBlockTagsProvider extends TagsProvider<Block> {

    @SuppressWarnings("deprecation")
    public SLOriginalBlockTagsProvider(DataGenerator p_i244815_1_, String p_i244815_3_,
            ExistingFileHelper p_i244815_4_) {
        super(p_i244815_1_, Registry.BLOCK, p_i244815_3_, p_i244815_4_);
    }

    @Override
    public String getName() {
        return "SugarLands Block Tags";
    }

    @Override
    protected void addTags() {
        tag(SLBlockTags.SUGAR_LOGS)
            .add(SLBlocks.SUGAR_LOG.get(),SLBlocks.STRIPPED_SUGAR_LOG.get(),
                    SLBlocks.SUGAR_WOOD.get(),SLBlocks.STRIPPED_SUGAR_WOOD.get());
    }

    @Override
    protected Path getPath(ResourceLocation resourcelocation) {
        return generator.getOutputFolder().resolve("data/" + SugarLandsCore.MOD_ID + "/tags/blocks/" + resourcelocation.getPath() + ".json");
    }

}
