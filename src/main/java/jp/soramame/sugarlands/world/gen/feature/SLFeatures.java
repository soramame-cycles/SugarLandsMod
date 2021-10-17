package jp.soramame.sugarlands.world.gen.feature;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLFeatures {

	public static final ConfiguredFeature<?, ?> SUGAR_WELL =
			SLWorldGen.GEN_SUGAR_WELL.configured(IFeatureConfig.NONE).decorated(Features.Placements.HEIGHTMAP_SQUARE).chance(1000);

			//register("sugar_desert_well", SLFeature.SUGAR_DESERT_WELL.configured(IFeatureConfig.NONE)
					//.decorated(Features.Placements.HEIGHTMAP_SQUARE).chance(1000));
}
