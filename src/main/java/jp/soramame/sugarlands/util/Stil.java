package jp.soramame.sugarlands.util;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

public class Stil {

    public static BlockState get(RegistryObject<Block> b) {
        return b.get().defaultBlockState();
    }
    public static BlockState get(Block b) {
        return b.defaultBlockState();
    }
    public static String prefix(Object s) {
        return SugarLandsCore.MOD_ID+":"+s;
    }
    public static ResourceLocation sugarLoc(String name) {
        return new ResourceLocation(SugarLandsCore.MOD_ID, name);
    }
}
