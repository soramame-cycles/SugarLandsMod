package jp.soramame.sugarlands.world.biome;

import java.util.function.Function;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate.ParameterList;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource.Preset;

public class SLBiomeSource extends Preset {

    public SLBiomeSource(ResourceLocation p_187090_,
            Function<Registry<Biome>, ParameterList<Holder<Biome>>> p_187091_) {
        super(p_187090_, p_187091_);
    }
}
