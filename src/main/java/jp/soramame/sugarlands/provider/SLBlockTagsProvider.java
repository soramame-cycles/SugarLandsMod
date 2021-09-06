package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.Block;
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
		this.tag(BlockTags.BEACON_BASE_BLOCKS).add(SLBlocks.Sugar_Diamond_Block.get(),SLBlocks.Bismuth_Crystal_Block.get());
		this.tag(BlockTags.LOGS).add(SLBlocks.Sugar_Log.get(),SLBlocks.Stripped_Sugar_Log.get(),SLBlocks.Sugar_Wood.get(),SLBlocks.Stripped_Sugar_Wood.get());
		this.tag(BlockTags.LEAVES).add(SLBlocks.Sugar_Leaves.get());
		this.tag(BlockTags.INFINIBURN_OVERWORLD).add(SLBlocks.Sugarrack.get());
		this.tag(BlockTags.INFINIBURN_NETHER).add(SLBlocks.Sugarrack.get());
		this.tag(BlockTags.INFINIBURN_END).add(SLBlocks.Sugarrack.get());
		this.tag(BlockTags.DRAGON_IMMUNE).add(SLBlocks.End_Sugar_Stone.get(),SLBlocks.Sugar_Diamond_Block.get());
		this.tag(BlockTags.SAPLINGS).add(SLBlocks.Sugar_Sapling.get());
		this.tag(BlockTags.WOODEN_FENCES).add(new Block[] {
				SLBlocks.Sugar_Log_Fence.get(),SLBlocks.Sugar_Planks_Fence.get()
		});
		this.tag(BlockTags.WALLS).add(new Block[] {
				SLBlocks.Sugar_Bricks_Wall.get(),SLBlocks.Sugar_Cobblestone_Wall.get(),SLBlocks.Sugar_Stone_Wall.get()
		});
	}

}
