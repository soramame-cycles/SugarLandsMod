package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.modifiers.AzukiFromGrass;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class SLGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public SLGlobalLootModifierProvider(DataGenerator gen, String modid) {
        super(gen, modid);
    }

    @Override
    protected void start() {
        add("azuki_from_grass", new AzukiFromGrass());
    }

}
