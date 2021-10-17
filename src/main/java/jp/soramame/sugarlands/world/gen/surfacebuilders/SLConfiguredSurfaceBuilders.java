package jp.soramame.sugarlands.world.gen.surfacebuilders;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SLConfiguredSurfaceBuilders {


	public static final DeferredRegister<SurfaceBuilder<?>> SLSurface = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, SugarLandsCore.MOD_ID);

	//よくよく考えたら水の下も砂糖だったら生成時に一斉に湿気るのでこれだけ変更
	private static final SurfaceBuilderConfig SUGAR_CONFIG = new SurfaceBuilderConfig(SLBlocks.SUGAR_BLOCK.get().defaultBlockState(), SLBlocks.SUGAR_BLOCK.get().defaultBlockState(), SLBlocks.MOIST_SUGAR_BLOCK.get().defaultBlockState());

	public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> FULL_SUGAR = SurfaceBuilder.DEFAULT.configured(SUGAR_CONFIG);

	public static void registerConfigurations() {
		WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, "full_sugar", FULL_SUGAR);
	}

	public static void init() {
		registerConfigurations();
	}
}
