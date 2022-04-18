package jp.soramame.sugarlands.init;

import java.util.Collection;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.world.biome.SLBiomeFeatures;
import jp.soramame.sugarlands.world.gen.surfacebuilders.SLConfiguredSurfaceBuilders;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.Biome.TemperatureModifier;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBiomes {

	public static final DeferredRegister<Biome> SLB =
			DeferredRegister.create(ForgeRegistries.BIOMES, SugarLandsCore.MOD_ID);

	public static final RegistryKey<Biome> SUGAR_DESERT = register("sugar_desert");
	public static final RegistryKey<Biome> PUDDING_PLAIN = register("pudding_plain");
	public static final RegistryKey<Biome> SUGAR_FOREST = register("sugar_forest");
	public static final RegistryKey<Biome> ICECANDY_SPIKES = register("icecandy_spikes");
	//public static final RegistryKey<Biome> ROTTEN_WASTES = register("rotten_wastes");


	public static RegistryKey<Biome> register(String name){
		return RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(SugarLandsCore.MOD_ID,name));
	}


	public static final RegistryObject<Biome> SUGAR_DESERT_REGISTRY = SLB.register("sugar_desert", ()-> new Biome.Builder()
			.generationSettings(SLBiomeFeatures.sugarDesertSettings().surfaceBuilder(SLConfiguredSurfaceBuilders.FULL_SUGAR).build())
			.biomeCategory(Biome.Category.PLAINS)
			.temperature(2.0F)
			.depth(0.125F)
			.downfall(0.0F)
			.scale(0.05F)
			.precipitation(RainType.NONE)
			.specialEffects(SLBiomeFeatures.SUGAR_DESERT_AMBIENCE)
			.temperatureAdjustment(TemperatureModifier.NONE)
			.mobSpawnSettings(SLBiomeFeatures.sugarDesertSpawn().build())
			.build());


	public static final RegistryObject<Biome> PUDDING_PLAIN_REGISTRY = SLB.register("pudding_plain", ()->new Biome.Builder()
			.generationSettings(SLBiomeFeatures.puddingPlainSettings().surfaceBuilder(SLConfiguredSurfaceBuilders.PUDDING).build())
			.biomeCategory(Biome.Category.PLAINS)
			.depth(0.125F)
			.downfall(0.4F)
			.mobSpawnSettings(SLBiomeFeatures.puddingPlainSpawn().build())
			.precipitation(RainType.SNOW)
			.scale(0.05F)
			.specialEffects(SLBiomeFeatures.PUDDING_PLAIN_AMBIENCE)
			.temperature(0.0F)
			.temperatureAdjustment(TemperatureModifier.NONE)
			.build());

	public static final RegistryObject<Biome> SUGAR_FOREST_REGISTRY = SLB.register("sugar_forest", ()->new Biome.Builder()
			.generationSettings(SLBiomeFeatures.sugarForestSettings().surfaceBuilder(ConfiguredSurfaceBuilders.GRASS).build())
			.biomeCategory(Biome.Category.FOREST)
			.depth(0.1F)
			.downfall(0.6F)
			.mobSpawnSettings(SLBiomeFeatures.sugarForestMobSpawn().build())
			.precipitation(RainType.NONE)
			.scale(0.1F)
			.specialEffects(SLBiomeFeatures.SUGAR_DESERT_AMBIENCE)
			.temperature(2.0F)
			.temperatureAdjustment(TemperatureModifier.FROZEN)
			.build());

	public static final RegistryObject<Biome> ICECANDY_SPIKES_REGISTRY = SLB.register("icecandy_spikes", ()->new Biome.Builder()
			.generationSettings(SLBiomeFeatures.icecandySpikesSettings().surfaceBuilder(ConfiguredSurfaceBuilders.ICE_SPIKES).build())
			.biomeCategory(Biome.Category.ICY)
			.depth(0.425F)
			.downfall(0.5F)
			.mobSpawnSettings(SLBiomeFeatures.icecandySpikesSpawn().build())
			.precipitation(RainType.SNOW)
			.scale(0.425F)
			.specialEffects(SLBiomeFeatures.ICECANDY_SPIKES_AMBIENCE)
			.temperature(0)
			.temperatureAdjustment(TemperatureModifier.FROZEN)
			.build());

	public static Collection<?> getEntries(){
		return SLB.getEntries();
	}

	public static void register(IEventBus event) {
		SLB.register(event);
	}

	public static void addBiomeTypes() {
		BiomeDictionary.addTypes(SUGAR_DESERT, Type.PLAINS,Type.SANDY,Type.DRY,Type.OVERWORLD);
		BiomeDictionary.addTypes(PUDDING_PLAIN, Type.PLAINS,Type.SNOWY,Type.COLD,Type.OVERWORLD);
		BiomeDictionary.addTypes(SUGAR_FOREST, Type.FOREST,Type.SNOWY,Type.COLD,Type.OVERWORLD);
		BiomeDictionary.addTypes(ICECANDY_SPIKES, Type.COLD, Type.SNOWY, Type.HILLS, Type.OVERWORLD);
	}
	public static void addBiome() {
		BiomeManager.addAdditionalOverworldBiomes(SUGAR_DESERT);

		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(SUGAR_DESERT, 8));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(PUDDING_PLAIN,8));
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(SUGAR_FOREST, 8));
		BiomeManager.addBiome(BiomeType.ICY, new BiomeEntry(ICECANDY_SPIKES,4));
	}


}

