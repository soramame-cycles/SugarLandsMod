package jp.soramame.sugarlands.tags;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;

public class SLBlockTags {

	protected static final TagRegistry<Block> HELPER = TagRegistryManager.create(new ResourceLocation("sugards:block"), ITagCollectionSupplier::getBlocks);
	public static final INamedTag<Block> SUGAR_LOGS = bind("sugar_logs");

	public static ITag.INamedTag<Block> bind(String p_199894_0_) {
		return HELPER.bind(p_199894_0_);
	}
	public static net.minecraftforge.common.Tags.IOptionalNamedTag<Block> createOptional(ResourceLocation name) {
		return createOptional(new ResourceLocation("sugards:block"), null);
	}

	public static net.minecraftforge.common.Tags.IOptionalNamedTag<Block> createOptional(ResourceLocation name, @javax.annotation.Nullable java.util.Set<java.util.function.Supplier<Block>> defaults) {
		return HELPER.createOptional(new ResourceLocation("sugards:block"), defaults);
	}

	public static ITagCollection<Block> getAllTags() {
		return HELPER.getAllTags();
	}

	public static List<? extends ITag.INamedTag<Block>> getWrappers() {
		return HELPER.getWrappers();
	}
}
