package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLBlockTagsProvider extends BlockTagsProvider {

	public SLBlockTagsProvider(DataGenerator p_i48256_1_, String modId, ExistingFileHelper existingFileHelper) {
		super(p_i48256_1_, modId, existingFileHelper);
	}

	@Override
	protected void addTags() {
		this.tag(BlockTags.BEACON_BASE_BLOCKS).add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(),SLBlocks.BISMUTH_CRYSTAL_BLOCK.get());
		this.tag(BlockTags.LOGS).add(SLBlocks.SUGAR_LOG.get(),SLBlocks.STRIPPED_SUGAR_LOG.get(),SLBlocks.SUGAR_WOOD.get(),SLBlocks.STRIPPED_SUGAR_WOOD.get());
		this.tag(BlockTags.LEAVES).add(SLBlocks.SUGAR_LEAVES.get());
		this.tag(BlockTags.INFINIBURN_OVERWORLD).add(SLBlocks.SUGARRACK.get());
		this.tag(BlockTags.INFINIBURN_NETHER).add(SLBlocks.SUGARRACK.get());
		this.tag(BlockTags.INFINIBURN_END).add(SLBlocks.SUGARRACK.get());
		this.tag(BlockTags.DRAGON_IMMUNE).add(SLBlocks.END_SUGAR_STONE.get(),SLBlocks.SUGAR_DIAMOND_BLOCK.get());
		this.tag(BlockTags.SAPLINGS).add(SLBlocks.SUGAR_SAPLING.get());
		this.tag(BlockTags.WOODEN_FENCES).add(SLBlocks.SUGAR_LOG_FENCE.get(),SLBlocks.SUGAR_PLANKS_FENCE.get());
		this.tag(BlockTags.WALLS).add(SLBlocks.SUGAR_BRICKS_WALL.get(),SLBlocks.SUGAR_COBBLESTONE_WALL.get(),SLBlocks.SUGAR_STONE_WALL.get());
		this.tag(BlockTags.FENCE_GATES).add(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(),SLBlocks.SUGAR_LOG_FENCE_GATE.get());
		this.tag(BlockTags.WOODEN_DOORS).add(SLBlocks.SUGAR_DOOR.get());
	}

}
