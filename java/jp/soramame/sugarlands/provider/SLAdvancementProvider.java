package jp.soramame.sugarlands.provider;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.advancements.SugarAdvancements;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.AdvancementProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.util.ResourceLocation;

public class SLAdvancementProvider extends AdvancementProvider {

    private final List<Consumer<Consumer<Advancement>>> tabs = ImmutableList.of(new SugarAdvancements());
    private DataGenerator generator;
    private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();

    @SuppressWarnings("deprecation")
    public SLAdvancementProvider(DataGenerator datagen) {
        super(datagen);
        this.generator = datagen;
    }

    @Override
    public void run(DirectoryCache p_200398_1_) throws IOException {
        Path path = this.generator.getOutputFolder();
        Set<ResourceLocation> set = Sets.newHashSet();

        for(Consumer<Consumer<Advancement>> c:this.tabs) {
            c.accept(neko->{
                if(!(set.add(neko.getId()))) {
                    throw new IllegalStateException("同じ進捗があります"+neko.getId());
                }else {
                    Path path1 = createPath(path, neko);
                    try {
                        IDataProvider.save(GSON, p_200398_1_, neko.deconstruct().serializeToJson(), path1);
                    } catch (IOException e) {
                        e.printStackTrace();
                        SugarLandsCore.LOGGER.error("えらーだよ", e);
                    }
                }
            });
        }
    }


    private static Path createPath(Path path, Advancement a) {
        return path.resolve("data/" + SugarLandsCore.MOD_ID + "/advancements/" + a.getId().getPath() + ".json");
    }

    public String getName() {
        return "SLAdvancements";
    }
}
