package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.item.SLFoodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLItems {

	static ItemGroup satou = SugarLandsCore.SUGARD_TAB;

	public static final DeferredRegister<Item> SI =
			DeferredRegister.create(ForgeRegistries.ITEMS, SugarLandsCore.MOD_ID);

	//public static final RegistryObject<Item>

	public static final RegistryObject<Item> Sugar_Diamond =
			SI.register("sugar_diamond", ()-> new Item(new Item.Properties().tab(SugarLandsCore.SUGARD_TAB)));
	public static final RegistryObject<Item> Sugar_Diamond_nugget =
			SI.register("sugar_diamond_nugget", ()-> new Item(new Item.Properties().tab(SugarLandsCore.SUGARD_TAB)));
	public static final RegistryObject<Item> Bismuth_Crystal =
			SI.register("bismuth_crystal", ()-> new Item(new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Azuki_Been =
			SI.register("azuki_been", ()-> new Item(new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Azuki_Paste =
			SI.register("azuki_paste", ()-> new SLFoodItem(new Item.Properties().tab(satou).food(SLFoods.Azuki_Paste)));
	public static final RegistryObject<Item> Azuki_Paste_Bun =
			SI.register("azuki_paste_bun", ()-> new SLFoodItem(new Item.Properties().tab(satou).food(SLFoods.Azuki_Paste_Bun)));


	public static void register(IEventBus eventBus) {
		SI.register(eventBus);
	}
}
