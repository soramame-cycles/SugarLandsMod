package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.modifiers.AzukiFromGrass;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SLLootModifiers {

    private static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM =
            DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, SugarLandsCore.MOD_ID);

    public static final RegistryObject<AzukiFromGrass.Serializer> AZUKI =
            GLM.register("azuki_from_grass", AzukiFromGrass.Serializer::new);

    public static void register(IEventBus event) {
        GLM.register(event);
    }
}
