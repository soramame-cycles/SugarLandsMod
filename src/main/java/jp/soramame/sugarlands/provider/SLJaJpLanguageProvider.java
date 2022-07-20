package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import jp.soramame.sugarlands.item.SLFoodItem;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

public class SLJaJpLanguageProvider extends LanguageProvider {

    public SLJaJpLanguageProvider(DataGenerator gen, String modid) {
        super(gen, modid, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        add(SugarLandsCore.SUGARD_TAB, "シュガーランド");
        add(SLFoodItem.maid,"メイドさんも食べることができます！");
        add(SLFoodItem.wolf,"オオカミさんも食べることができます！");
        add(SLBlocks.SUGAR_BLOCK.get(), "\"砂\"糖");
        add(SLBlocks.SUGAR_STONE.get(), "砂糖石");
        add(SLBlocks.SUGAR_CANDY.get(), "氷砂糖");
        add(SLBlocks.SUGAR_DIAMOND_ORE.get(), "砂糖ダイヤ鉱石");
        add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(), "砂糖ダイヤブロック");
        add(SLItems.Sugar_Diamond.get(), "砂糖ダイヤ");
        add(SLItems.Sugar_Diamond_nugget.get(), "砂糖ダイヤの欠片");
        add(SLBlocks.SUGAR_COBBLESTONE.get(),"砂糖の丸石");
        add(SLBlocks.SUGAR_BRICKS.get(),"砂糖レンガ");
        add(SLBlocks.MOIST_SUGAR_BLOCK.get(),"湿気った'砂'糖");
        add(SLBlocks.RAW_SUGAR_BLOCK.get(),"黒糖ブロック");
        add(SLBlocks.LIT_RAW_SUGAR_BLOCK.get(),"きらめく黒糖ブロック");
        add(SLBlocks.SUGARRACK.get(),"シュガーラック");
        add(SLBlocks.END_SUGAR_STONE.get(),"エンド砂糖石");
        add(SLBlocks.BISMUTH_ORE.get(),"ビスマス鉱石");
        add(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get(),"ビスマス骸晶ブロック");
        add(SLBlocks.PUDDING_BLOCK.get(),"プリンブロック");
        add(SLBlocks.CALAMEL_SAUCE.get(),"カラメルソースブロック");
        add(SLBlocks.COOKIE_BLOCK.get(),"クッキーブロック");
        add(SLBlocks.SUGAR_PILLAR.get(),"砂糖の柱");
        add(SLBlocks.ROTTEN_FLESH_BLOCK.get(),"腐肉ブロック");
        add(SLBlocks.BLACK_ICE_CANDY.get(),"黒色のアイス");
        add(SLBlocks.BLUE_ICE_CANDY.get(),"青色のアイス");
        add(SLBlocks.BROWN_ICE_CANDY.get(),"茶色のアイス");
        add(SLBlocks.CYAN_ICE_CANDY.get(),"青緑色のアイス");
        add(SLBlocks.GRAY_ICE_CANDY.get(),"灰色のアイス");
        add(SLBlocks.GREEN_ICE_CANDY.get(),"緑色のアイス");
        add(SLBlocks.LIGHT_BLUE_ICE_CANDY.get(),"空色のアイス");
        add(SLBlocks.LIGHT_GRAY_ICE_CANDY.get(),"薄灰色のアイス");
        add(SLBlocks.LIME_ICE_CANDY.get(),"黄緑色のアイス");
        add(SLBlocks.MAGENTA_ICE_CANDY.get(),"マゼンタのアイス");
        add(SLBlocks.ORANGE_ICE_CANDY.get(),"橙のアイス");
        add(SLBlocks.PINK_ICE_CANDY.get(),"桃色のアイス");
        add(SLBlocks.PURPLE_ICE_CANDY.get(),"紫色のアイス");
        add(SLBlocks.RED_ICE_CANDY.get(),"赤色のアイス");
        add(SLBlocks.WHITE_ICE_CANDY.get(),"白のアイス");
        add(SLBlocks.YELLOW_ICE_CANDY.get(),"黄色のアイス");
        add(SLBlocks.SUGAR_LOG.get(),"砂糖の木");
        add(SLBlocks.SUGAR_LEAVES.get(),"砂糖の葉");
        add(SLBlocks.SUGAR_SAPLING.get(),"砂糖木の苗木");
        add(SLBlocks.SUGAR_PLANKS.get(),"砂糖の板材");
        add(SLBlocks.SUGAR_PLANKS_STAIRS.get(),"砂糖板材の階段");
        add(SLBlocks.SUGAR_STONE_STAIRS.get(), "砂糖石");
        add(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), "砂糖丸石の階段");
        add(SLBlocks.SUGAR_LOG_STAIRS.get(), "砂糖原木の階段");
        add(SLBlocks.SUGAR_PLANKS_SLAB.get(), "砂糖板材のハーフ");
        add(SLBlocks.SUGAR_STONE_SLAB.get(), "砂糖石のハーフ");
        add(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), "砂糖丸石のハーフ");
        add(SLBlocks.SUGAR_LOG_SLAB.get(), "砂糖原木のハーフ");
        add(SLBlocks.SUGAR_LOG_FENCE.get(),"砂糖原木のフェンス");
        add(SLBlocks.SUGAR_PLANKS_FENCE.get(),"砂糖板材のフェンス");
        add(SLBlocks.SUGAR_STONE_WALL.get(),"砂糖石の壁");
        add(SLBlocks.SUGAR_COBBLESTONE_WALL.get(),"砂糖丸石の壁");
        add(SLBlocks.SUGAR_BRICKS_WALL.get(),"砂糖レンガの壁");
        add(SLBlocks.SUGAR_CANDY_PANE.get(),"氷砂糖の板ガラス");
        add(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),"砂糖板材のトラップドア");
        add(SLBlocks.SUGAR_DOOR.get(),"砂糖板材のドア");
        add(SLBlocks.SUGAR_TORCH.get(),"おさトーチ");
        //add(SLBlocks.Wall_Sugar_Torch.get(),"壁付おさトーチ");
        add(SLBlocks.SUGAR_PLANKS_BUTTON.get(),"砂糖板材のボタン");
        add(SLBlocks.SUGAR_STONE_BUTTON.get(),"砂糖石のボタン");
        add(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),"砂糖板材の感圧版");
        add(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),"砂糖石の感圧版");
        add(SLBlocks.STRIPPED_SUGAR_LOG.get(),"樹皮を剥いだ砂糖原木");
        add(SLBlocks.SUGAR_WOOD.get(),"砂糖の木");
        add(SLBlocks.STRIPPED_SUGAR_WOOD.get(),"樹皮を剥いだ砂糖の木");
        add(SLBiomes.SUGAR_DESERT_REGISTRY.get(), sugarDesert);
        add(SLBiomes.PUDDING_PLAIN_REGISTRY.get(), puddingPlain);
        add(SLBiomes.SUGAR_FOREST_REGISTRY.get(), sugarForest);
        add(SLBiomes.ICECANDY_SPIKES_REGISTRY.get(), icecandySpikes);
        add(SLBiomes.ROTTEN_WASTES_REGISTRY.get(), rottenWaste);
        add(SLItems.Sugar_Diamond_Pickaxe.get(), "砂糖ダイヤのツルハシ");
        add(SLItems.Bismuth_Pickaxe.get(), "ビスマスのツルハシ");
        add(SLItems.Crushed_Sugar_Cane.get(), "砕いたサトウキビ");
        add(SLItems.Poppy_Seed.get(), "ポピーシード");
        add(SLItems.Pudding.get(), "プリン");
        add(SLItems.Raw_sugar.get(), "黒糖");
        add(SLItems.Bismuth_Crystal.get(), "ビスマス骸晶");
        add(SLItems.Azuki_Been.get(), "あずき");
        add(SLItems.Azuki_Paste.get(), "あんこ");
        add(SLItems.Azuki_Paste_Bun.get(), "あんパン");
        add(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(), "砂糖板材のフェンスゲート");
        add(SLBlocks.SUGAR_LOG_FENCE_GATE.get(), "砂糖原木のフェンスゲート");
        add(SLBlocks.DEEPSLATE_BISMUTH_ORE.get(),"深層ビスマス鉱石");
        add(SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get(),"深層砂糖ダイヤ鉱石");
        add();
    }
    private void add() {
        addadvance("sugar.sugar", "白い粉", "砂糖を入手する");
        addadvance("sugar.root", "新砂糖島", "甘えを求めて");
        addadvance("sugar.sugar_block", "シュガーハンター", "\"砂\"糖を手に入れる");
        addadvance("sugar.rotten", "それ腐ってね?", "腐肉ブロックを手に入れる");
        addadvance("sugar.sugar_desert", "お砂糖警報！", sugarDesert+"を訪れる");
        addadvance("sugar.sweet_adventure", "甘味旅行", "シュガーランドで追加されるバイオームすべてに訪れる");
    }
    private void add(Biome biome, String name) {
        add(Util.makeDescriptionId("biome",ForgeRegistries.BIOMES.getKey(biome)),name);
    }
    private void add(CreativeModeTab i,String name) {
        add(i.getDisplayName().getString(),name);
    }
    private void add(MutableComponent t,String name) {
        add(t.getString(),name);
    }
    public void addadvance(String ad,String title,String desc) {
        String modid = SugarLandsCore.MOD_ID;
        add(Util.makeDescriptionId("advancements", new ResourceLocation(modid,ad+".title")),title);
        add(Util.makeDescriptionId("advancements", new ResourceLocation(modid,ad+".description")),desc);
    }
    //バイオーム名使いまわし
    private String sugarDesert = "砂糖砂漠";
    private String puddingPlain = "プリン平原";
    private String sugarForest = "砂糖の森林";
    private String icecandySpikes = "樹氷菓";
    private String rottenWaste = "腐った荒野";
}
