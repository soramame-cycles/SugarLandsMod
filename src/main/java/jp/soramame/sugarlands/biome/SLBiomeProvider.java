package jp.soramame.sugarlands.biome;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.init.SLBiomes;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class SLBiomeProvider extends BiomeProvider {

	private static final Codec<SLBiomeProvider> SL_CODEC = RegistryLookupCodec.create(Registry.BIOME_REGISTRY)
			.xmap(SLBiomeProvider::new, SLBiomeProvider::getBiomeRegistry).codec();

	private final Biome biome;
    private final Registry<Biome> biomeRegistry;
    private static final List<RegistryKey<Biome>> BIOMES = ImmutableList.of(SLBiomes.SUGAR_DESERT);

	public SLBiomeProvider(Registry<Biome> biomeRegistry) {
		super(getStartBiomes(biomeRegistry));
		this.biomeRegistry = biomeRegistry;
		biome = biomeRegistry.get(SLBiomes.SUGAR_DESERT.location());
	}
	private static List<Biome> getStartBiomes(Registry<Biome> registry){
		return BIOMES.stream().map(S ->registry.get(S.location())).collect(Collectors.toList());
	}

	public Registry<Biome> getBiomeRegistry(){
		return biomeRegistry;
	}

	@Override
	public Biome getNoiseBiome(int p_225526_1_, int p_225526_2_, int p_225526_3_) {
		return biome;
	}

	@Override
	protected Codec<? extends BiomeProvider> codec() {
		return SL_CODEC;
	}

	@Override
	public BiomeProvider withSeed(long p_230320_1_) {
		return this;
	}

	public Set<Biome> getBiomesWithin(int p_225530_1_, int p_225530_2_, int p_225530_3_, int p_225530_4_) {
	      int i = p_225530_1_ - p_225530_4_ >> 2;
	      int j = p_225530_2_ - p_225530_4_ >> 2;
	      int k = p_225530_3_ - p_225530_4_ >> 2;
	      int l = p_225530_1_ + p_225530_4_ >> 2;
	      int i1 = p_225530_2_ + p_225530_4_ >> 2;
	      int j1 = p_225530_3_ + p_225530_4_ >> 2;
	      int k1 = l - i + 1;
	      int l1 = i1 - j + 1;
	      int i2 = j1 - k + 1;
	      Set<Biome> set = Sets.newHashSet();

	      for(int j2 = 0; j2 < i2; ++j2) {
	         for(int k2 = 0; k2 < k1; ++k2) {
	            for(int l2 = 0; l2 < l1; ++l2) {
	               int i3 = i + k2;
	               int j3 = j + l2;
	               int k3 = k + j2;
	               set.add(this.getNoiseBiome(i3, j3, k3));
	            }
	         }
	      }

	      return set;
	   }

}
