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
		this.add(SLBlocks.Sugar_Block.get(), "'砂'糖");
		this.add(SLBlocks.Sugar_Stone.get(), "砂糖石");
		this.add(SLBlocks.Sugar_Candy.get(), "氷砂糖");
		this.add(SLBlocks.Sugar_Diamond_Ore.get(), "砂糖ダイヤ鉱石");
		this.add(SLBlocks.Sugar_Diamond_Block.get(), "砂糖ダイヤブロック");
		this.add(SLItems.Sugar_Diamond.get(), "砂糖ダイヤ");
		this.add(SLItems.Sugar_Diamond_nugget.get(), "砂糖ダイヤの欠片");
		this.add(SLBlocks.Sugar_CobbleStone.get(),"砂糖の丸石");
		this.add(SLBlocks.Sugar_Bricks.get(),"砂糖レンガ");
		this.add(SLBlocks.Moist_Sugar_Block.get(),"湿気った'砂'糖");
		this.add(SLBlocks.Raw_Sugar_Block.get(),"黒糖ブロック");
		this.add(SLBlocks.Lit_Raw_Sugar_Block.get(),"きらめく黒糖ブロック");
		this.add(SLBlocks.Sugarrack.get(),"シュガーラック");
		this.add(SLBlocks.End_Sugar_Stone.get(),"エンド砂糖石");
		this.add(SLBlocks.Bismuth_Ore.get(),"ビスマス鉱石");
		this.add(SLBlocks.Bismuth_Crystal_Block.get(),"ビスマス骸晶ブロック");
		this.add(SLBlocks.Pudding_Block.get(),"プリンブロック");
		this.add(SLBlocks.Calamel_Sauce.get(),"カラメルソースブロック");
		this.add(SLBlocks.Cookie_Block.get(),"クッキーブロック");
		this.add(SLBlocks.Sugar_Pillar.get(),"砂糖の柱");
		this.add(SLBlocks.Rotten_Flesh_Block.get(),"腐肉ブロック");
		this.add(SLBlocks.Black_Ice_Candy.get(),"黒色のアイス");
		this.add(SLBlocks.Blue_Ice_Candy.get(),"青色のアイス");
		this.add(SLBlocks.Brown_Ice_Candy.get(),"茶色のアイス");
		this.add(SLBlocks.Cyan_Ice_Candy.get(),"青緑色のアイス");
		this.add(SLBlocks.Gray_Ice_Candy.get(),"灰色のアイス");
		this.add(SLBlocks.Green_Ice_Candy.get(),"緑色のアイス");
		this.add(SLBlocks.Light_Blue_Ice_Candy.get(),"空色のアイス");
		this.add(SLBlocks.Light_Gray_Ice_Candy.get(),"薄灰色のアイス");
		this.add(SLBlocks.Lime_Ice_Candy.get(),"黄緑色のアイス");
		this.add(SLBlocks.Magenta_Ice_Candy.get(),"マゼンタのアイス");
		this.add(SLBlocks.Orange_Ice_Candy.get(),"橙のアイス");
		this.add(SLBlocks.Pink_Ice_Candy.get(),"桃色のアイス");
		this.add(SLBlocks.Purple_Ice_Candy.get(),"紫色のアイス");
		this.add(SLBlocks.Red_Ice_Candy.get(),"赤色のアイス");
		this.add(SLBlocks.White_Ice_Candy.get(),"白のアイス");
		this.add(SLBlocks.Yellow_Ice_Candy.get(),"黄色のアイス");
		this.add(SLBlocks.Sugar_Log.get(),"砂糖の木");
		this.add(SLBlocks.Sugar_Leaves.get(),"砂糖の葉");
		this.add(SLBlocks.Sugar_Sapling.get(),"砂糖木の苗木");
		this.add(SLBlocks.Sugar_Planks.get(),"砂糖の板材");
		this.add(SLBlocks.Sugar_Planks_Stairs.get(),"砂糖板材の階段");
		this.add(SLBlocks.Sugar_Stone_Stairs.get(), "砂糖石");
		this.add(SLBlocks.Sugar_Cobblestone_Stairs.get(), "砂糖丸石の階段");
		this.add(SLBlocks.Sugar_Log_Stairs.get(), "砂糖原木の階段");
		this.add(SLBlocks.Sugar_Planks_Slab.get(), "砂糖板材のハーフ");
		this.add(SLBlocks.Sugar_Stone_Slab.get(), "砂糖石のハーフ");
		this.add(SLBlocks.Sugar_Cobblestone_Slab.get(), "砂糖丸石のハーフ");
		this.add(SLBlocks.Sugar_Log_Slab.get(), "砂糖原木のハーフ");
		this.add(SLBlocks.Sugar_Log_Fence.get(),"砂糖原木のフェンス");
		this.add(SLBlocks.Sugar_Planks_Fence.get(),"砂糖板材のフェンス");
		this.add(SLBlocks.Sugar_Stone_Wall.get(),"砂糖石の壁");
		this.add(SLBlocks.Sugar_Cobblestone_Wall.get(),"砂糖丸石の壁");
		this.add(SLBlocks.Sugar_Bricks_Wall.get(),"砂糖レンガの壁");
		this.add(SLBlocks.Sugar_Candy_Pane.get(),"氷砂糖の板ガラス");
		this.add(SLBlocks.Sugar_Planks_TrapDoor.get(),"砂糖板材のトラップドア");
		this.add(SLBlocks.Sugar_Door.get(),"砂糖板材のドア");
		this.add(SLBlocks.Sugar_Torch.get(),"おさトーチ");
		//this.add(SLBlocks.Wall_Sugar_Torch.get(),"壁付おさトーチ");
		this.add(SLBlocks.Sugar_Planks_Button.get(),"砂糖板材のボタン");
		this.add(SLBlocks.Sugar_Stone_Button.get(),"砂糖石のボタン");
		this.add(SLBlocks.Sugar_planks_Pressure_Plate.get(),"砂糖板材の感圧版");
		this.add(SLBlocks.Sugar_stone_Pressure_Plate.get(),"砂糖石の感圧版");
		this.add(SLBlocks.Stripped_Sugar_Log.get(),"樹皮を剥いだ砂糖原木");
		this.add(SLBlocks.Sugar_Wood.get(),"砂糖の木");
		this.add(SLBlocks.Stripped_Sugar_Wood.get(),"樹皮を剥いだ砂糖の木");

	}

}
