package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.SugarLandsCore;
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

	public static void register(IEventBus eventBus) {
		SI.register(eventBus);
	}
}
