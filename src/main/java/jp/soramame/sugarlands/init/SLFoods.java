package jp.soramame.sugarlands.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SLFoods {
	public static final Food Azuki_Paste = (new Food.Builder()).nutrition(4).saturationMod(0.3F).build();
	public static final Food Azuki_Paste_Bun = (new Food.Builder().nutrition(8).saturationMod(0.6F)
			.effect(()-> new EffectInstance(Effects.DIG_SPEED, 6000,0), 1).build());
	//		.effect(()-> new EffectInstance(効果, 何tick続くか,ポーションのレベル"0=1"), 確率"max=1.0F").build());
}
