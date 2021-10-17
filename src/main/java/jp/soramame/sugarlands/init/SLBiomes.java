package jp.soramame.sugarlands.init;

import java.util.Collection;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.world.gen.feature.SLFeatures;
import jp.soramame.sugarlands.world.gen.surfacebuilders.SLConfiguredSurfaceBuilders;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.Biome.TemperatureModifier;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeAmbience.GrassColorModifier;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBiomes {

	public static final DeferredRegister<Biome> SLB =
			DeferredRegister.create(ForgeRegistries.BIOMES, SugarLandsCore.MOD_ID);


	public static final RegistryKey<Biome> SUGAR_DESERT = registerSugarDesert("sugar_desert");

	public static RegistryKey<Biome> registerSugarDesert(String name){
		SLB.register(name, ()-> new Biome.Builder()
				.generationSettings(new BiomeGenerationSettings.Builder()
						.surfaceBuilder(SLConfiguredSurfaceBuilders.FULL_SUGAR)
						.addFeature(Decoration.SURFACE_STRUCTURES, SLFeatures.SUGAR_WELL)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GRANITE)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIORITE)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_ANDESITE)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_COAL)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_IRON)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_GOLD)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_REDSTONE)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_DIAMOND)
						.addFeature(Decoration.UNDERGROUND_ORES, Features.ORE_LAPIS)
						.build())
				.biomeCategory(Biome.Category.PLAINS)
				.temperature(2.0F)
				.depth(0.125F)
				.downfall(0.0F)
				.scale(0.05F)
				.precipitation(RainType.NONE)
				.specialEffects(SUGAR_DESERT_AMBIENCE)
				.temperatureAdjustment(TemperatureModifier.NONE)
				.mobSpawnSettings(new MobSpawnInfo.Builder().addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 4, 2, 3)).build())
				.build());
		return RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(SugarLandsCore.MOD_ID,name));
	}

	public static final BiomeAmbience SUGAR_DESERT_AMBIENCE = new BiomeAmbience.Builder()
			.fogColor(13434879)
			.waterColor(13434879)
			.waterFogColor(13434879)
			.skyColor(13434879)
			.grassColorModifier(GrassColorModifier.NONE)
			.foliageColorOverride(13434879)
			.build();

	public static Collection<?> getEntries(){
		return SLB.getEntries();
	}

	public static void register(IEventBus event) {
		SLB.register(event);
	}

	public static void addBiomeTypes() {
		BiomeDictionary.addTypes(SUGAR_DESERT, BiomeDictionary.Type.PLAINS,BiomeDictionary.Type.SANDY,BiomeDictionary.Type.DRY,BiomeDictionary.Type.OVERWORLD);
	}
	public static void addBiome() {
		BiomeManager.addAdditionalOverworldBiomes(SUGAR_DESERT);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(SUGAR_DESERT, 8));
	}


}
