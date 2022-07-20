package jp.soramame.sugarlands.config;

import org.apache.commons.lang3.tuple.Pair;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraftforge.common.ForgeConfig.Client;
import net.minecraftforge.common.ForgeConfig.Server;
import net.minecraftforge.common.ForgeConfigSpec;

public class SugarLandsConfigs {

    public static Common common;
    public static Client client;
    public static Server server;

    public static ForgeConfigSpec SPEC;

    private static String config = SugarLandsCore.MOD_ID + ".config.";

    public static class Common{
        @SLConfig
        private static boolean gen_sugar_block = true;

        public static boolean isGen_sugar_block() {
            return gen_sugar_block;
        }

        public static void setGen_sugar_block(boolean gen_sugar_block) {
            Common.gen_sugar_block = gen_sugar_block;
        }

        public final ForgeConfigSpec.BooleanValue GEN_SUGAR_BLOCK;


        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("Common");
                this.GEN_SUGAR_BLOCK = builder.comment("Genarate").define(config+"gen_sugar_block", gen_sugar_block);
            builder.pop();
            SPEC = builder.build();
        }
    }

    static {
        Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        common = commonSpecPair.getLeft();
        SPEC = commonSpecPair.getRight();
    }

}
