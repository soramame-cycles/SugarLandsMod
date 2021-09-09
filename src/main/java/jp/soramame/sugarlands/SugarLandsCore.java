package jp.soramame.sugarlands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import jp.soramame.sugarlands.init.SugardsTab;
import jp.soramame.sugarlands.provider.SLBlockStateProvider;
import jp.soramame.sugarlands.provider.SLBlockTagsProvider;
import jp.soramame.sugarlands.provider.SLEnUsLanguageProvider;
import jp.soramame.sugarlands.provider.SLItemModelProvider;
import jp.soramame.sugarlands.provider.SLJaJpLanguageProvider;
import jp.soramame.sugarlands.provider.SLLootTableProvider;
import jp.soramame.sugarlands.provider.SLOriginalBlockTagsProvider;
import jp.soramame.sugarlands.provider.SLRecipeProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SugarLandsCore.MOD_ID)
public class SugarLandsCore {

	public static final String MOD_ID = "sugards";
	public static final Logger LOGGER = LogManager.getLogger();

	public static final ItemGroup SUGARD_TAB = new SugardsTab();

	public SugarLandsCore() {
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
		SLBlocks.register(modbus);
		SLBlockItems.register(modbus);
		SLItems.register(modbus);
		modbus.addListener(this::registerProviders);
		modbus.addListener(this::setup);
	}

	private void registerProviders(GatherDataEvent event) {
		/**自動生成されないと思ってたけどeclipseのプロジェクト、クリーンそしてリフレッシュをしてから
		 * runDataを実行したらうまくいったなぜだったかは知らん*/
		DataGenerator gen = event.getGenerator();
		if (event.includeClient()) {
			gen.addProvider(new SLBlockStateProvider(gen,MOD_ID,event.getExistingFileHelper()));
			gen.addProvider(new SLItemModelProvider(gen,MOD_ID,event.getExistingFileHelper()));
			gen.addProvider(new SLEnUsLanguageProvider(gen,MOD_ID));
			gen.addProvider(new SLJaJpLanguageProvider(gen,MOD_ID));
			gen.addProvider(new SLBlockTagsProvider(gen, MOD_ID,event.getExistingFileHelper()));
			gen.addProvider(new SLOriginalBlockTagsProvider(gen,MOD_ID,event.getExistingFileHelper()));
		}
		if(event.includeServer()) {
			gen.addProvider(new SLLootTableProvider(gen));
			gen.addProvider(new SLRecipeProvider(gen));
		}
	}

	/**透明とかの設定をぶち込む場所*/
	private void setup(final FMLCommonSetupEvent event) {
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Candy.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.Calamel_Sauce.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Sapling.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Candy_Pane.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Planks_TrapDoor.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Door.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.Wall_Sugar_Torch.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.Sugar_Torch.get(), RenderType.cutout());
	}
}
