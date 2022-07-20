package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLBlockTagsProvider extends BlockTagsProvider {

    public SLBlockTagsProvider(DataGenerator p_i48256_1_, String modId, ExistingFileHelper existingFileHelper) {
        super(p_i48256_1_, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.BEACON_BASE_BLOCKS).add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(),SLBlocks.BISMUTH_CRYSTAL_BLOCK.get());
        tag(BlockTags.LOGS).add(SLBlocks.SUGAR_LOG.get(),SLBlocks.STRIPPED_SUGAR_LOG.get(),SLBlocks.SUGAR_WOOD.get(),SLBlocks.STRIPPED_SUGAR_WOOD.get());
        tag(BlockTags.LEAVES).add(SLBlocks.SUGAR_LEAVES.get());
        tag(BlockTags.INFINIBURN_OVERWORLD).add(SLBlocks.SUGARRACK.get());
        tag(BlockTags.INFINIBURN_NETHER).add(SLBlocks.SUGARRACK.get());
        tag(BlockTags.INFINIBURN_END).add(SLBlocks.SUGARRACK.get());
        tag(BlockTags.DRAGON_IMMUNE).add(SLBlocks.END_SUGAR_STONE.get(),SLBlocks.SUGAR_DIAMOND_BLOCK.get());
        tag(BlockTags.SAPLINGS).add(SLBlocks.SUGAR_SAPLING.get());
        tag(BlockTags.WOODEN_FENCES).add(SLBlocks.SUGAR_LOG_FENCE.get(),SLBlocks.SUGAR_PLANKS_FENCE.get());
        tag(BlockTags.WALLS).add(SLBlocks.SUGAR_BRICKS_WALL.get(),SLBlocks.SUGAR_COBBLESTONE_WALL.get(),SLBlocks.SUGAR_STONE_WALL.get());
        tag(BlockTags.FENCE_GATES).add(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(),SLBlocks.SUGAR_LOG_FENCE_GATE.get());
        tag(BlockTags.WOODEN_DOORS).add(SLBlocks.SUGAR_DOOR.get());
        tag(BlockTags.GOATS_SPAWNABLE_ON).add(SLBlocks.SUGAR_BLOCK.get());
        tag(BlockTags.ANIMALS_SPAWNABLE_ON).add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(),SLBlocks.BISMUTH_CRYSTAL_BLOCK.get());


        tag(BlockTags.MINEABLE_WITH_AXE).add(SLBlocks.use_axe());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(SLBlocks.use_pickaxe());
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(SLBlocks.use_shovel());
        tag(BlockTags.MINEABLE_WITH_HOE).add(SLBlocks.use_hoe());

        tag(BlockTags.NEEDS_IRON_TOOL).add(SLBlocks.SUGAR_DIAMOND_ORE.get(),SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(SLBlocks.BISMUTH_ORE.get(),SLBlocks.DEEPSLATE_BISMUTH_ORE.get());
    }
}
