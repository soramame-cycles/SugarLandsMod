package jp.soramame.sugarlands.world.gen.surfacebuilders;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SLConfiguredSurfaceBuilders {


	//public static final DeferredRegister<SurfaceBuilder<?>> SLSurface = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, SugarLandsCore.MOD_ID);

	//よくよく考えたら水の下も砂糖だったら生成時に一斉に湿気るのでこれだけ変更
	public static final SurfaceBuilderConfig SUGAR_CONFIG = new SurfaceBuilderConfig(SLBlocks.SUGAR_BLOCK.get().defaultBlockState(), SLBlocks.SUGAR_BLOCK.get().defaultBlockState(), SLBlocks.MOIST_SUGAR_BLOCK.get().defaultBlockState());
	public static final SurfaceBuilderConfig PUDDING_CONFIG = new SurfaceBuilderConfig(SLBlocks.CALAMEL_SAUCE.get().defaultBlockState(), SLBlocks.PUDDING_BLOCK.get().defaultBlockState(), SLBlocks.PUDDING_BLOCK.get().defaultBlockState());

	public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> FULL_SUGAR =  SLSurfaceBuilders.SUGAR_PUDDING.configured(SUGAR_CONFIG);
	public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> PUDDING = SLSurfaceBuilders.SUGAR_PUDDING.configured(PUDDING_CONFIG);

	public static void registerConfigurations() {
		WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, "full_sugar", FULL_SUGAR);
		WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, "pudding", PUDDING);
	}

	public static void init() {
		registerConfigurations();
	}
}
