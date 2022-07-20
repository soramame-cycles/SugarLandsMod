package jp.soramame.sugarlands.init;

import com.mojang.serialization.Codec;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.modifiers.AzukiFromGrass;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SLLootModifiers {

    private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLM =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, SugarLandsCore.MOD_ID);

    public static final RegistryObject<Codec<AzukiFromGrass>> AZUKI =
            GLM.register("azuki_from_grass",()-> AzukiFromGrass.CODEC);

    public static void register(IEventBus event) {
        GLM.register(event);
    }
}
