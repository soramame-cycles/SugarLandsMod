package jp.soramame.sugarlands.tags;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class SLBlockTags {

    public static final TagKey<Block> SUGAR_LOGS = bind("sugar_logs");

    public static TagKey<Block> bind(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY,new ResourceLocation(SugarLandsCore.MOD_ID,name));
    }
}
