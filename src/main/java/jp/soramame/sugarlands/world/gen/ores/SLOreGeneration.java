package jp.soramame.sugarlands.world.gen.ores;

import java.util.Collection;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SLOreGeneration {

    public static final RuleTest ENDSTONE = new TagMatchTest(Blocks.END_STONES);

    private static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER = DeferredRegister
            .create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, SugarLandsCore.MOD_ID);

    public static final RegistryObject<Codec<? extends SugarBiomeModifier>> CODEC = BIOME_MODIFIER.register(
            "ore_generation",
            () -> RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(SugarBiomeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("feature").forGetter(SugarBiomeModifier::feature))
                    .apply(builder, SugarBiomeModifier::new)));

    public record SugarBiomeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> feature) implements BiomeModifier {

        @Override
        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (Phase.ADD == phase  && this.biomes.contains(biome)) {
                builder.getGenerationSettings().addFeature(Decoration.UNDERGROUND_ORES, this.feature);
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return CODEC.get();
        }
    }

    public static void register(IEventBus event) {
        BIOME_MODIFIER.register(event);
    }

    public static Collection<RegistryObject<Codec<? extends BiomeModifier>>> getEntries() {
        return BIOME_MODIFIER.getEntries();
    }
}
