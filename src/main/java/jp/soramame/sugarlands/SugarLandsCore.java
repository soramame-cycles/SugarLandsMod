package jp.soramame.sugarlands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.soramame.sugarlands.config.SugarLandsConfigs;
import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import jp.soramame.sugarlands.init.SLLootModifiers;
import jp.soramame.sugarlands.init.SugardsTab;
import jp.soramame.sugarlands.provider.SLAdvancementProvider;
import jp.soramame.sugarlands.provider.SLBiomeTagsProvider;
import jp.soramame.sugarlands.provider.SLBlockStateProvider;
import jp.soramame.sugarlands.provider.SLBlockTagsProvider;
import jp.soramame.sugarlands.provider.SLEnUsLanguageProvider;
import jp.soramame.sugarlands.provider.SLGlobalLootModifierProvider;
import jp.soramame.sugarlands.provider.SLItemModelProvider;
import jp.soramame.sugarlands.provider.SLItemTagProvider;
import jp.soramame.sugarlands.provider.SLJaJpLanguageProvider;
import jp.soramame.sugarlands.provider.SLLootTableProvider;
import jp.soramame.sugarlands.provider.SLOriginalBlockTagsProvider;
import jp.soramame.sugarlands.provider.SLOriginalItemTagsProvider;
import jp.soramame.sugarlands.provider.SLRecipeProvider;
import jp.soramame.sugarlands.world.gen.feature.SLWorldGen;
import jp.soramame.sugarlands.world.gen.ores.SLOreGeneration;
import jp.soramame.sugarlands.world.gen.surfacebuilders.SLSurfaceBuilders;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.util.profiling.jfr.event.WorldLoadFinishedEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SugarLandsCore.MOD_ID)
public class SugarLandsCore {

    public static final String MOD_ID = "sugards";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab SUGARD_TAB = new SugardsTab();

    public SugarLandsCore() {
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext modLoadingContext = ModLoadingContext.get();
        SLBlocks.register(modbus);
        SLBlockItems.register(modbus);
        SLItems.register(modbus);
        SLBiomes.register(modbus);
        SLWorldGen.register(modbus);
        //SLLootModifiers.register(modbus);
        SLOreGeneration.register(modbus);
        SLSurfaceBuilders.register(modbus);
        SLLootModifiers.register(modbus);

        modbus.addListener(this::registerProviders);
        modbus.addListener(this::common);
        modbus.addListener(this::client);

        setting(modLoadingContext);
        //forgeEventBus();
        debug();
    }

    private void registerProviders(GatherDataEvent event) {
        /**自動生成されないと思ってたけどeclipseのプロジェクト、クリーンそしてリフレッシュをしてから
         * runDataを実行したらうまくいったなぜだったかは知らん*/
        DataGenerator gen = event.getGenerator();
        BlockTagsProvider block = new SLBlockTagsProvider(gen, MOD_ID, event.getExistingFileHelper());
        gen.addProvider(event.includeServer(), new SLBlockStateProvider(gen, MOD_ID, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(), new SLItemModelProvider(gen, MOD_ID, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(), new SLEnUsLanguageProvider(gen, MOD_ID));
        gen.addProvider(event.includeServer(), new SLJaJpLanguageProvider(gen, MOD_ID));
        gen.addProvider(event.includeServer(), block);
        gen.addProvider(event.includeServer(),new SLItemTagProvider(gen, block, MOD_ID, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(),new SLOriginalBlockTagsProvider(gen, MOD_ID, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(),new SLOriginalItemTagsProvider(gen, MOD_ID, event.getExistingFileHelper()));
        gen.addProvider(event.includeServer(), new SLGlobalLootModifierProvider(gen, MOD_ID));
        gen.addProvider(event.includeServer(), new SLBiomeTagsProvider(gen, MOD_ID, event.getExistingFileHelper()));

        gen.addProvider(event.includeServer(), new SLLootTableProvider(gen));
        gen.addProvider(event.includeServer(), new SLRecipeProvider(gen));
        gen.addProvider(event.includeServer(), new SLAdvancementProvider(gen, event.getExistingFileHelper()));
    }

    private void common(FMLCommonSetupEvent event) {
        event.enqueueWork(()->{
            SLBiomes.addBiome();
        });
    }

    @SuppressWarnings("removal")
    private void client(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_CANDY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.CALAMEL_SAUCE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_CANDY_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.WALL_SUGAR_TORCH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(SLBlocks.SUGAR_TORCH.get(), RenderType.cutout());
        });
    }

    public void postinit(WorldLoadFinishedEvent e) {

    }

    private void setting(ModLoadingContext event) {
        event.registerConfig(Type.COMMON, SugarLandsConfigs.SPEC);
        //event.registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY,()->(minecraft,screen)->new SLConfigGui(screen));
    }

    /*private void forgeEventBus() {
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, SLOreGeneration::generateOres);
    }*/
    private void debug() {
        LOGGER.debug("デバッグ");
        SLSurfaceBuilders.getEntries().forEach(p->LOGGER.debug(p.getKey()));
        SLOreGeneration.getEntries().forEach(okura->LOGGER.debug(okura.getKey()));
        SLSurfaceBuilders.getEntries2().forEach(LOGGER::debug);
    }
}
