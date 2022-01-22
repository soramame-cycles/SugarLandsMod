package jp.soramame.sugarlands.world.gen.feature;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SLWorldGen {

	public static final DeferredRegister<Feature<?>> SLWGEN = DeferredRegister.create(ForgeRegistries.FEATURES,SugarLandsCore.MOD_ID);

	public static final Feature<NoFeatureConfig> GEN_SUGAR_WELL = new SugarDesertWellsFeature(NoFeatureConfig.CODEC);
	public static final Feature<NoFeatureConfig> GEN_ICECANDY_SPIKE = new IceCandySpikeFeature(NoFeatureConfig.CODEC);

	public static final RegistryObject<Feature<NoFeatureConfig>> SUGAR_DESERT_WELL = SLWGEN.register("sugar_desert_well", ()-> GEN_SUGAR_WELL);
	public static final RegistryObject<Feature<NoFeatureConfig>> ICECANDY_SPIKE = SLWGEN.register("icecandy_spike", ()-> GEN_ICECANDY_SPIKE);



	public static void register(IEventBus event) {
		SLWGEN.register(event);
	}
}
