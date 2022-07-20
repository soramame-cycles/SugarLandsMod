package jp.soramame.sugarlands.item;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

public class SLFoodItem extends Item {

    public static MutableComponent wolf = Component.translatable("tooltip.sugards.can_eat_wolf");
    public static MutableComponent maid = Component.translatable("tooltip.sugards.can_eat_maid");

    public SLFoodItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(wolf.withStyle(ChatFormatting.YELLOW));
        if(ModList.get().isLoaded("littlemaidrebirth")) {
            tooltip.add(maid.withStyle(ChatFormatting.YELLOW));
        }
    }

}
