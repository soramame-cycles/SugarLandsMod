package jp.soramame.sugarlands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.soramame.sugarlands.config.SugarLandsConfigs;
import jp.soramame.sugarlands.gui.SLConfigGui;
import jp.soramame.sugarlands.init.SLBiomes;
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
import jp.soramame.sugarlands.provider.SLOriginalItemTagsProvider;
import jp.soramame.sugarlands.provider.SLRecipeProvider;
import jp.soramame.sugarlands.world.gen.feature.SLWorldGen;
import jp.soramame.sugarlands.world.gen.ores.SLOreGeneration;
import jp.soramame.sugarlands.world.gen.surfacebuilders.SLSurfaceBuilders;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		SLBlocks.register(modbus);
		SLBlockItems.register(modbus);
		SLItems.register(modbus);
		modbus.addListener(this::registerProviders);
		modbus.addListener(this::setup);
		modbus.addListener(this::init);
		SLSurfaceBuilders.register(modbus);
		SLBiomes.register(modbus);
		SLWorldGen.register(modbus);

		setting(modLoadingContext);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH,SLOreGeneration::generateOres);
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
			gen.addProvider(new SLOriginalItemTagsProvider(gen,MOD_ID,event.getExistingFileHelper()));
		}
		if(event.includeServer()) {
			gen.addProvider(new SLLootTableProvider(gen));
			gen.addProvider(new SLRecipeProvider(gen));
		}
	}
	//検討中
	/*public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
			event.getRegistry().register(new SeedForGrassConverterModifier.Serializer()
					.setRegistryName(new ResourceLocation(MOD_ID, "azuki")));
	}*/

	/**透明とかの設定をぶち込む場所*/
	private void setup(FMLCommonSetupEvent event) {
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_CANDY.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.CALAMEL_SAUCE.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_SAPLING.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_CANDY_PANE.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_DOOR.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.WALL_SUGAR_TORCH.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(SLBlocks.SUGAR_TORCH.get(), RenderType.cutout());
	}

	public void init(FMLClientSetupEvent event) {
		SLBiomes.addBiome();
		SLBiomes.addBiomeTypes();
		/*event.enqueueWork(() ->{ });*/
	}
	public void setting(ModLoadingContext event) {
		event.registerConfig(Type.COMMON, SugarLandsConfigs.SPEC);
		event.registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY,()->(minecraft,screen)->new SLConfigGui(screen));
	}
}