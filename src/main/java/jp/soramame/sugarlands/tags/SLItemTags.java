package jp.soramame.sugarlands.tags;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class SLItemTags {

    public static final TagKey<Item> SUGAR_LOGS = bind("sugar_logs");

    public static TagKey<Item> bind(String name){
        return TagKey.create(Registry.ITEM_REGISTRY,new ResourceLocation(SugarLandsCore.MOD_ID,name));
    }

}
