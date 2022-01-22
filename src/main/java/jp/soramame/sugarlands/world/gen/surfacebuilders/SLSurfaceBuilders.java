package jp.soramame.sugarlands.world.gen.surfacebuilders;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLSurfaceBuilders {

	public static RegistryKey<SurfaceBuilder<?>> SUGAR_SARFACE_REGISTRY = register("sugar_sarface");

	public static RegistryKey<SurfaceBuilder<?>> register(String name){
		return RegistryKey.create(Registry.SURFACE_BUILDER_REGISTRY, new ResourceLocation(SugarLandsCore.MOD_ID,name));
	}

	public static final DeferredRegister<SurfaceBuilder<?>> SLSurface = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, SugarLandsCore.MOD_ID);

	public static final SurfaceBuilder<SurfaceBuilderConfig> SUGAR_PUDDING = new SugarSurfaceBuilder(SurfaceBuilderConfig.CODEC);

	public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> SUGAR_SARFACE =
			SLSurface.register("sugar_sarface", ()-> SUGAR_PUDDING);


	public static void register(IEventBus event) {
		SLSurface.register(event);
	}

}
