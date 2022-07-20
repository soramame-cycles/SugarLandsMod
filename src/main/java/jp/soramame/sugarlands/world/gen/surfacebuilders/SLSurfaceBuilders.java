package jp.soramame.sugarlands.world.gen.surfacebuilders;

import java.util.Collection;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.NoiseSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.SurfaceRules.ConditionSource;
import net.minecraft.world.level.levelgen.SurfaceRules.RuleSource;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SLSurfaceBuilders {

    private static final RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final RuleSource DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final RuleSource SAND = makeStateRule(Blocks.SAND);
    private static final RuleSource SANDSTONE = makeStateRule(Blocks.SANDSTONE);

    private static final DeferredRegister<Codec<? extends RuleSource>> RULE = DeferredRegister
            .create(Registry.RULE_REGISTRY, SugarLandsCore.MOD_ID);

    public static final RegistryObject<Codec<? extends RuleSource>> SUGARSURFACE = RULE.register("sugar_surface",
            ()-> Codec.unit(hoge()));

    public static final ResourceKey<Codec<? extends RuleSource>> SUGAR_SURFACE = register("sugar_surface");

    private static ResourceKey<Codec<? extends RuleSource>> register(String name){
        return ResourceKey.create(Registry.RULE_REGISTRY, new ResourceLocation(SugarLandsCore.MOD_ID,name));
    }

    private static RuleSource makeStateRule(Block b) {
        return SurfaceRules.state(b.defaultBlockState());
    }

    public static RuleSource hoge() {
        return sugarlandsLike(true);
    }

    private static RuleSource sugarlandsLike(boolean setUnderBedrock) {
        RuleSource sugarblock = makeStateRule(SLBlocks.SUGAR_BLOCK.get());
        RuleSource sugarstone = makeStateRule((Block)SLBlocks.SUGAR_STONE.get());

        ConditionSource source1 = SurfaceRules.waterBlockCheck(-1, 0);
        ConditionSource source2 = SurfaceRules.waterStartCheck(-6, -1);
        RuleSource sandRules = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, sugarstone), sugarblock);
        ConditionSource desert$condition = SurfaceRules.isBiome(SLBiomes.SUGAR_DESERT);
        RuleSource desert$rule = SurfaceRules.sequence(SurfaceRules.ifTrue(desert$condition, sandRules));
        RuleSource isDesert = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(source1, desert$rule)),
                SurfaceRules.ifTrue(source2, SurfaceRules.sequence(SurfaceRules.ifTrue(desert$condition,
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, sugarstone)))));
        ImmutableList.Builder<RuleSource> builder = ImmutableList.builder();

        if (setUnderBedrock) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(),
                    VerticalAnchor.aboveBottom(5)), BEDROCK));
        }
        builder.add(isDesert);
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("deepslate",
                VerticalAnchor.absolute(0), VerticalAnchor.absolute(8)), DEEPSLATE));
        SugarLandsCore.LOGGER.debug("多分読み込まれてるよ:sugarlandslike");
        SugarLandsCore.LOGGER.debug(isDesert);
        return SurfaceRules.sequence(builder.build().toArray(list -> new RuleSource[list]));
    }

    private static SurfaceRules.RuleSource test(boolean p_198381_, boolean p_198382_, boolean p_198383_) {
        RuleSource sugarblock = makeStateRule(SLBlocks.SUGAR_BLOCK.get());
        RuleSource sugarstone = makeStateRule(SLBlocks.SUGAR_STONE.get());
        ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();
        if (p_198382_) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.not(
                    SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())),
                    BEDROCK));
        }

        if (p_198383_) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(),
                    VerticalAnchor.aboveBottom(5)), BEDROCK));
        }

        builder.add(SurfaceRules.ifTrue(
                SurfaceRules.verticalGradient("deepslate", VerticalAnchor.absolute(0), VerticalAnchor.absolute(8)),
                DEEPSLATE));

        SurfaceRules.RuleSource surface = SurfaceRules
                .sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), sugarstone), sugarblock);

        SurfaceRules.RuleSource overworldLike = SurfaceRules.ifTrue(SurfaceRules.isBiome(SLBiomes.SUGAR_DESERT),
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, surface),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, BEDROCK)));

        SurfaceRules.RuleSource surfacerules$rulesource9 = SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
                overworldLike);

        builder.add(surfacerules$rulesource9);
        SugarLandsCore.LOGGER.debug("testsurface");
        SugarLandsCore.LOGGER.debug(surfacerules$rulesource9);
        SugarLandsCore.LOGGER.debug(SLSurfaceBuilders.class.getName());
        return SurfaceRules.sequence(builder.build().toArray(tako -> new SurfaceRules.RuleSource[tako]));
    }

    public static RuleSource overworldLike(boolean setUnderBedrock) {
        //waterStartCheck(水面からどれだけ離れているか, 表面深度乗算器(????))
        ConditionSource source1 = SurfaceRules.waterBlockCheck(-1, 0);
        ConditionSource source2 = SurfaceRules.waterStartCheck(-6, -1);
        RuleSource sandRules = SurfaceRules
                .sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, SANDSTONE), SAND);
        ConditionSource desert$condition = SurfaceRules.isBiome(Biomes.DESERT);
        RuleSource desert$rule = SurfaceRules.sequence(SurfaceRules.ifTrue(desert$condition, sandRules));
        RuleSource isDesert = SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(source1, desert$rule)),
                SurfaceRules.ifTrue(source2, SurfaceRules.sequence(SurfaceRules.ifTrue(desert$condition,
                        SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, SANDSTONE)))));
        ImmutableList.Builder<RuleSource> builder = ImmutableList.builder();

        if (setUnderBedrock) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(),
                    VerticalAnchor.aboveBottom(5)), BEDROCK));
        }
        builder.add(isDesert);
        builder.add(SurfaceRules.ifTrue(
                SurfaceRules.verticalGradient("deepslate", VerticalAnchor.absolute(0), VerticalAnchor.absolute(8)),
                DEEPSLATE));
        return SurfaceRules.sequence(builder.build().toArray(list -> new RuleSource[list]));
    }

    public static class SugarNoises extends NoiseRouterData {
        public static NoiseGeneratorSettings sugardesert() {
            SugarLandsCore.LOGGER.debug("多分読み込まれてるよNoise");
            return new NoiseGeneratorSettings(new NoiseSettings(-64, 384, 1, 2), Blocks.STONE.defaultBlockState(),
                    Blocks.WATER.defaultBlockState(),
                    NoiseRouterData.overworld(BuiltinRegistries.DENSITY_FUNCTION, false, false),
                    test(true, false, true),
                    (new OverworldBiomeBuilder()).spawnTarget(), 63, false, true, true, false);
        }
    }

    private static DeferredRegister<NoiseGeneratorSettings> SUGAR_NOISE = DeferredRegister
            .create(Registry.NOISE_GENERATOR_SETTINGS_REGISTRY, SugarLandsCore.MOD_ID);

    public static RegistryObject<NoiseGeneratorSettings> SUGAR_WORLD = SUGAR_NOISE.register("sugar_world",
            () -> SugarNoises.sugardesert());

    public static Collection<RegistryObject<NoiseGeneratorSettings>> getEntries() {
        return SUGAR_NOISE.getEntries();
    }

    public static Collection<RegistryObject<Codec<? extends RuleSource>>> getEntries2(){
        return RULE.getEntries();
    }

    public static void register(IEventBus event) {
        RULE.register(event);
        SUGAR_NOISE.register(event);
    }
}
