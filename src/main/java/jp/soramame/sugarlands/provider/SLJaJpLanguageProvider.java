package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class SLJaJpLanguageProvider extends LanguageProvider {

	public SLJaJpLanguageProvider(DataGenerator gen, String modid) {
		super(gen, modid, "ja_jp");
	}

	@Override
	protected void addTranslations() {
		this.add("itemGroup.sugards", "シュガーランド");
		this.add(SLBlocks.SUGAR_BLOCK.get(), "'砂'糖");
		this.add(SLBlocks.SUGAR_STONE.get(), "砂糖石");
		this.add(SLBlocks.SUGAR_CANDY.get(), "氷砂糖");
		this.add(SLBlocks.SUGAR_DIAMOND_ORE.get(), "砂糖ダイヤ鉱石");
		this.add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(), "砂糖ダイヤブロック");
		this.add(SLItems.Sugar_Diamond.get(), "砂糖ダイヤ");
		this.add(SLItems.Sugar_Diamond_nugget.get(), "砂糖ダイヤの欠片");
		this.add(SLBlocks.SUGAR_COBBLESTONE.get(),"砂糖の丸石");
		this.add(SLBlocks.SUGAR_BRICKS.get(),"砂糖レンガ");
		this.add(SLBlocks.MOIST_SUGAR_BLOCK.get(),"湿気った'砂'糖");
		this.add(SLBlocks.RAW_SUGAR_BLOCK.get(),"黒糖ブロック");
		this.add(SLBlocks.LIT_RAW_SUGAR_BLOCK.get(),"きらめく黒糖ブロック");
		this.add(SLBlocks.SUGARRACK.get(),"シュガーラック");
		this.add(SLBlocks.END_SUGAR_STONE.get(),"エンド砂糖石");
		this.add(SLBlocks.BISMUTH_ORE.get(),"ビスマス鉱石");
		this.add(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get(),"ビスマス骸晶ブロック");
		this.add(SLBlocks.PUDDING_BLOCK.get(),"プリンブロック");
		this.add(SLBlocks.CALAMEL_SAUCE.get(),"カラメルソースブロック");
		this.add(SLBlocks.COOKIE_BLOCK.get(),"クッキーブロック");
		this.add(SLBlocks.SUGAR_PILLAR.get(),"砂糖の柱");
		this.add(SLBlocks.ROTTEN_FLESH_BLOCK.get(),"腐肉ブロック");
		this.add(SLBlocks.BLACK_ICE_CANDY.get(),"黒色のアイス");
		this.add(SLBlocks.BLUE_ICE_CANDY.get(),"青色のアイス");
		this.add(SLBlocks.BROWN_ICE_CANDY.get(),"茶色のアイス");
		this.add(SLBlocks.CYAN_ICE_CANDY.get(),"青緑色のアイス");
		this.add(SLBlocks.GRAY_ICE_CANDY.get(),"灰色のアイス");
		this.add(SLBlocks.GREEN_ICE_CANDY.get(),"緑色のアイス");
		this.add(SLBlocks.LIGHT_BLUE_ICE_CANDY.get(),"空色のアイス");
		this.add(SLBlocks.LIGHT_GRAY_ICE_CANDY.get(),"薄灰色のアイス");
		this.add(SLBlocks.LIME_ICE_CANDY.get(),"黄緑色のアイス");
		this.add(SLBlocks.MAGENTA_ICE_CANDY.get(),"マゼンタのアイス");
		this.add(SLBlocks.ORANGE_ICE_CANDY.get(),"橙のアイス");
		this.add(SLBlocks.PINK_ICE_CANDY.get(),"桃色のアイス");
		this.add(SLBlocks.PURPLE_ICE_CANDY.get(),"紫色のアイス");
		this.add(SLBlocks.RED_ICE_CANDY.get(),"赤色のアイス");
		this.add(SLBlocks.WHITE_ICE_CANDY.get(),"白のアイス");
		this.add(SLBlocks.YELLOW_ICE_CANDY.get(),"黄色のアイス");
		this.add(SLBlocks.SUGAR_LOG.get(),"砂糖の木");
		this.add(SLBlocks.SUGAR_LEAVES.get(),"砂糖の葉");
		this.add(SLBlocks.SUGAR_SAPLING.get(),"砂糖木の苗木");
		this.add(SLBlocks.SUGAR_PLANKS.get(),"砂糖の板材");
		this.add(SLBlocks.SUGAR_PLANKS_STAIRS.get(),"砂糖板材の階段");
		this.add(SLBlocks.SUGAR_STONE_STAIRS.get(), "砂糖石");
		this.add(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), "砂糖丸石の階段");
		this.add(SLBlocks.SUGAR_LOG_STAIRS.get(), "砂糖原木の階段");
		this.add(SLBlocks.SUGAR_PLANKS_SLAB.get(), "砂糖板材のハーフ");
		this.add(SLBlocks.SUGAR_STONE_SLAB.get(), "砂糖石のハーフ");
		this.add(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), "砂糖丸石のハーフ");
		this.add(SLBlocks.SUGAR_LOG_SLAB.get(), "砂糖原木のハーフ");
		this.add(SLBlocks.SUGAR_LOG_FENCE.get(),"砂糖原木のフェンス");
		this.add(SLBlocks.SUGAR_PLANKS_FENCE.get(),"砂糖板材のフェンス");
		this.add(SLBlocks.SUGAR_STONE_WALL.get(),"砂糖石の壁");
		this.add(SLBlocks.SUGAR_COBBLESTONE_WALL.get(),"砂糖丸石の壁");
		this.add(SLBlocks.SUGAR_BRICKS_WALL.get(),"砂糖レンガの壁");
		this.add(SLBlocks.SUGAR_CANDY_PANE.get(),"氷砂糖の板ガラス");
		this.add(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),"砂糖板材のトラップドア");
		this.add(SLBlocks.SUGAR_DOOR.get(),"砂糖板材のドア");
		this.add(SLBlocks.SUGAR_TORCH.get(),"おさトーチ");
		//this.add(SLBlocks.Wall_Sugar_Torch.get(),"壁付おさトーチ");
		this.add(SLBlocks.SUGAR_PLANKS_BUTTON.get(),"砂糖板材のボタン");
		this.add(SLBlocks.SUGAR_STONE_BUTTON.get(),"砂糖石のボタン");
		this.add(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),"砂糖板材の感圧版");
		this.add(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),"砂糖石の感圧版");
		this.add(SLBlocks.STRIPPED_SUGAR_LOG.get(),"樹皮を剥いだ砂糖原木");
		this.add(SLBlocks.SUGAR_WOOD.get(),"砂糖の木");
		this.add(SLBlocks.STRIPPED_SUGAR_WOOD.get(),"樹皮を剥いだ砂糖の木");
		this.add("biome.sugards.sugar_desert", "砂糖砂漠");

	}

}
