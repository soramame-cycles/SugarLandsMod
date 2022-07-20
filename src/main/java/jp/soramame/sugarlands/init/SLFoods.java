package jp.soramame.sugarlands.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SLFoods {
    public static final FoodProperties Azuki_Paste = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties Azuki_Paste_Bun = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F)
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 6000,0), 1).build();
    //		.effect(()-> new EffectInstance(効果, 何tick続くか,ポーションのレベル"0=1"), 確率"max=1.0F").build());
    public static final FoodProperties Pudding = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F).build();
}
