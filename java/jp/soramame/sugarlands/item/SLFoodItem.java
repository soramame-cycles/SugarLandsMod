package jp.soramame.sugarlands.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ModList;

public class SLFoodItem extends Item {

    public static TranslationTextComponent wolf = new TranslationTextComponent("tooltip.sugards.can_eat_wolf");
    public static TranslationTextComponent maid = new TranslationTextComponent("tooltip.sugards.can_eat_maid");

    public SLFoodItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(wolf.withStyle(TextFormatting.YELLOW));
        if(ModList.get().isLoaded("littlemaidrebirth")) {
            tooltip.add(maid.withStyle(TextFormatting.YELLOW));
        }
    }

}
