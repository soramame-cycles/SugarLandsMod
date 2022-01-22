package jp.soramame.sugarlands.provider;

import java.nio.file.Path;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.tags.SLItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLOriginalItemTagsProvider extends TagsProvider<Item> {

	@SuppressWarnings("deprecation")
	public SLOriginalItemTagsProvider(DataGenerator p_i49827_1_, String modId,
			ExistingFileHelper existingFileHelper) {
		super(p_i49827_1_, Registry.ITEM, modId, existingFileHelper);
	}

	@Override
	public String getName() {
		return "SugarLands Item Tags";
	}

	@Override
	protected void addTags() {
		tag(SLItemTags.SUGAR_LOGS).add(SLBlockItems.Sugar_log.get(),SLBlockItems.Sugar_Wood.get(),
				SLBlockItems.STRIPPED_SUGAR_LOG.get(),SLBlockItems.STRIPPED_SUGAR_WOOD.get());
	}

	@Override
	protected Path getPath(ResourceLocation name) {
		return this.generator.getOutputFolder().resolve("data/" + SugarLandsCore.MOD_ID + "/tags/items/" + name.getPath() + ".json");
	}

}
