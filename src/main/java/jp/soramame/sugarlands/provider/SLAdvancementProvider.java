package jp.soramame.sugarlands.provider;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.advancements.SugarAdvancements;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SLAdvancementProvider extends AdvancementProvider {

    private final List<Consumer<Consumer<Advancement>>> tabs = ImmutableList.of(new SugarAdvancements());
    private DataGenerator generator;

    public SLAdvancementProvider(DataGenerator datagen,ExistingFileHelper fileHelperIn) {
        super(datagen,fileHelperIn);
        this.generator = datagen;
    }

    public void run(CachedOutput output) {
        Path path = this.generator.getOutputFolder();
        Set<ResourceLocation> set = Sets.newHashSet();

        for(Consumer<Consumer<Advancement>> c:this.tabs) {
            c.accept(neko->{
                if(!(set.add(neko.getId()))) {
                    throw new IllegalStateException("同じ進捗があります"+neko.getId());
                }else {
                    Path path1 = createPath(path, neko);
                    try {
                        DataProvider.saveStable(output, neko.deconstruct().serializeToJson(), path1);
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
