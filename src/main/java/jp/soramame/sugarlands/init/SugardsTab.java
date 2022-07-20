package jp.soramame.sugarlands.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SugardsTab extends CreativeModeTab {

    public SugardsTab() {
        super("sugards");
    }

    @Override
    public ItemStack makeIcon() {
        ItemStack itemstack = new ItemStack(SLBlocks.SUGAR_BLOCK.get());
        return itemstack;
    }

}
