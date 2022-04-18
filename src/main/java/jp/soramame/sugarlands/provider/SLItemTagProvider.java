package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLItemTagProvider extends ItemTagsProvider {

	public SLItemTagProvider(DataGenerator p_i232552_1_, BlockTagsProvider p_i232552_2_, String modId,
			ExistingFileHelper existingFileHelper) {
		super(p_i232552_1_, p_i232552_2_, modId, existingFileHelper);
	}

	@Override
	protected void addTags() {
		tag(ItemTags.PLANKS).add(SLBlockItems.Sugar_Planks.get());
		tag(ItemTags.BEACON_PAYMENT_ITEMS).add(SLItems.Bismuth_Crystal.get(),SLItems.Sugar_Diamond.get());
	}
}
