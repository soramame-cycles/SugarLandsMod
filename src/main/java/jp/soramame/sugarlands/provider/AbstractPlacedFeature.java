package jp.soramame.sugarlands.provider;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public abstract class AbstractPlacedFeature implements DataProvider {

    //private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final DataGenerator gen;
    private final String modid;
    private final Map<String, JsonElement> placedFeature = new HashMap<>();

    public AbstractPlacedFeature(DataGenerator gen, String modid) {
        this.gen = gen;
        this.modid = modid;
    }

    protected abstract void gen();

    @Override
    public void run(CachedOutput cache) throws IOException {
        List<ResourceLocation> entries = new ArrayList<>();
        String modPath = "data/" + modid + "/worldgen/placed_feature/";

        this.placedFeature.clear();
          this.gen();
          this.placedFeature.forEach((name, json) -> {
              entries.add(new ResourceLocation(modid, name));
                Path placedPath = gen.getOutputFolder().resolve(modPath + name + ".json");
                try {
                    DataProvider.saveStable(cache, json, placedPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
          });
    }

    public <T extends OreConfiguration> void add(String modifier, T instance){
        JsonElement json = OreConfiguration.CODEC.encodeStart(JsonOps.INSTANCE, instance).getOrThrow(false, s -> {});
        this.placedFeature.put(modifier, json);
    }

    @Override
    public abstract String getName();


}
