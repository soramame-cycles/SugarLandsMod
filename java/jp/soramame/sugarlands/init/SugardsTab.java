package jp.soramame.sugarlands.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class SugardsTab extends ItemGroup {

    public SugardsTab() {
        super("sugards");
    }

    @Override
    public ItemStack makeIcon() {
        ItemStack itemstack = new ItemStack(SLBlocks.SUGAR_BLOCK.get());
        return itemstack;
    }

}
