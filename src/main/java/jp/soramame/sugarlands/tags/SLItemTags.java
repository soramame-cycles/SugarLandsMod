package jp.soramame.sugarlands.tags;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.tags.ITagCollection;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tags.TagRegistry;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.IOptionalNamedTag;

public class SLItemTags {

	protected static final TagRegistry<Item> HELPER = TagRegistryManager.create(new ResourceLocation(SugarLandsCore.MOD_ID+":item"), ITagCollectionSupplier::getItems);

	public static final INamedTag<Item> SUGAR_LOGS = bind("sugar_logs");

	public static INamedTag<Item> bind(String name){
		return HELPER.bind(name);
	}
	public static IOptionalNamedTag<Item> createOptional(ResourceLocation name){
		return createOptional(new ResourceLocation(SugarLandsCore.MOD_ID+":item"), null);
	}
	public static IOptionalNamedTag<Item> createOptional(ResourceLocation name,Set<Supplier<Item>> defaults){
		return HELPER.createOptional(new ResourceLocation(SugarLandsCore.MOD_ID+":item"), defaults);
	}
	public static ITagCollection<Item> getAllTags(){
		return HELPER.getAllTags();
	}
	public static List<? extends INamedTag<Item>> getWrappers(){
		return HELPER.getWrappers();
	}

}
