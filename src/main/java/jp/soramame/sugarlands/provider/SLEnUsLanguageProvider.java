package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class SLEnUsLanguageProvider extends LanguageProvider {

	public SLEnUsLanguageProvider(DataGenerator gen, String modid) {
		super(gen, modid,"en_us");
	}

	@Override
	protected void addTranslations() {
		this.add("itemGroup.sugards", "SugarLands");
		this.add(SLBlocks.Sugar_Block.get(),"Sugar Block");
		this.add(SLBlocks.Sugar_Stone.get(), "Sugar Stone");
		this.add(SLBlocks.Sugar_Candy.get(), "Sugar Candy");
		this.add(SLBlocks.Sugar_Diamond_Ore.get(), "Sugar Diamond Ore");
		this.add(SLBlocks.Sugar_Diamond_Block.get(), "Sugar Diamond Block");
		this.add(SLItems.Sugar_Diamond.get(), "Sugar Diamond");
		this.add(SLItems.Sugar_Diamond_nugget.get(), "Sugar Diamond Nugget");
		this.add(SLBlocks.Sugar_CobbleStone.get(),"Sugar Cobblestone");
		this.add(SLBlocks.Sugar_Bricks.get(),"Sugar Bricks");
		this.add(SLBlocks.Moist_Sugar_Block.get(),"Moist Sugar Block");
		this.add(SLBlocks.Raw_Sugar_Block.get(),"Raw Sugar Block");
		this.add(SLBlocks.Lit_Raw_Sugar_Block.get(),"Lit Raw sugar Block");
		this.add(SLBlocks.Sugarrack.get(),"Sugarrack");
		this.add(SLBlocks.End_Sugar_Stone.get(),"End Sugar Stone");
		this.add(SLBlocks.Bismuth_Ore.get(),"Bismuth Ore");
		this.add(SLBlocks.Bismuth_Crystal_Block.get(),"Bismuth Crystal Block");
		this.add(SLBlocks.Pudding_Block.get(),"Pudding Block");
		this.add(SLBlocks.Calamel_Sauce.get(),"Caramel Block");
		this.add(SLBlocks.Cookie_Block.get(),"Cookie Block");
		this.add(SLBlocks.Sugar_Pillar.get(),"Sugar Pillar");
		this.add(SLBlocks.Rotten_Flesh_Block.get(),"Rotten Fresh Block");
		this.add(SLBlocks.Black_Ice_Candy.get(),"Black Icecandy");
		this.add(SLBlocks.Blue_Ice_Candy.get(),"Blue Icecandy");
		this.add(SLBlocks.Brown_Ice_Candy.get(),"Brown Icecandy");
		this.add(SLBlocks.Cyan_Ice_Candy.get(),"Cyan Icecandy");
		this.add(SLBlocks.Gray_Ice_Candy.get(),"Gray Icecandy");
		this.add(SLBlocks.Green_Ice_Candy.get(),"Green Icecandy");
		this.add(SLBlocks.Light_Blue_Ice_Candy.get(),"LightBlue Icecandy");
		this.add(SLBlocks.Light_Gray_Ice_Candy.get(),"LightGray Icecandy");
		this.add(SLBlocks.Lime_Ice_Candy.get(),"Lime Icecandy");
		this.add(SLBlocks.Magenta_Ice_Candy.get(),"Magenta Icecandy");
		this.add(SLBlocks.Orange_Ice_Candy.get(),"Orange Icecandy");
		this.add(SLBlocks.Pink_Ice_Candy.get(),"Pink Icecandy");
		this.add(SLBlocks.Purple_Ice_Candy.get(),"Purple Icecandy");
		this.add(SLBlocks.Red_Ice_Candy.get(),"Red Icecandy");
		this.add(SLBlocks.White_Ice_Candy.get(),"White Icecandy");
		this.add(SLBlocks.Yellow_Ice_Candy.get(),"Yellow Icecandy");
		this.add(SLBlocks.Sugar_Log.get(),"Sugar Log");
		this.add(SLBlocks.Sugar_Leaves.get(),"Sugar Leaves");
		this.add(SLBlocks.Sugar_Sapling.get(),"Sugar Sapling");
		this.add(SLBlocks.Sugar_Planks.get(),"Sugar Planks");
		this.add(SLBlocks.Sugar_Planks_Stairs.get(),"Sugar Planks Stairs");
		this.add(SLBlocks.Sugar_Stone_Stairs.get(), "Sugar Stone Stairs");
		this.add(SLBlocks.Sugar_Cobblestone_Stairs.get(), "Sugar Cobblestone Stairs");
		this.add(SLBlocks.Sugar_Log_Stairs.get(), "Sugar Log Stairs");
		this.add(SLBlocks.Sugar_Planks_Slab.get(), "Sugar Planks Slab");
		this.add(SLBlocks.Sugar_Stone_Slab.get(), "Sugar Stone Slab");
		this.add(SLBlocks.Sugar_Cobblestone_Slab.get(), "Sugar Cobblestone Slab");
		this.add(SLBlocks.Sugar_Log_Slab.get(), "Sugar Log Slab");
		this.add(SLBlocks.Sugar_Log_Fence.get(),"Sugar Log Fence");
		this.add(SLBlocks.Sugar_Planks_Fence.get(),"Sugar Planks Fence");
		this.add(SLBlocks.Sugar_Stone_Wall.get(),"Sugar Stone Wall");
		this.add(SLBlocks.Sugar_Cobblestone_Wall.get(),"Sugar Cobblestone Wall");
		this.add(SLBlocks.Sugar_Bricks_Wall.get(),"Sugar Bricks Wall");
		this.add(SLBlocks.Sugar_Candy_Pane.get(),"Sugar Candy Pane");
		this.add(SLBlocks.Sugar_Planks_TrapDoor.get(),"Sugar Planks TrapDoor");
		this.add(SLBlocks.Sugar_Door.get(),"Sugar Door");
		this.add(SLBlocks.Sugar_Torch.get(),"Sugar Torch");
		//this.add(SLBlocks.Wall_Sugar_Torch.get(),"Wall Sugar Torch");
		this.add(SLBlocks.Sugar_Planks_Button.get(),"Sugar Planks Button");
		this.add(SLBlocks.Sugar_Stone_Button.get(),"Sugar Stone Button");
		this.add(SLBlocks.Sugar_planks_Pressure_Plate.get(),"Sugar Planks PressurePlate");
		this.add(SLBlocks.Sugar_stone_Pressure_Plate.get(),"Sugar Stone PressurePlate");
		this.add(SLBlocks.Stripped_Sugar_Log.get(),"Stripped Sugar Log");
		this.add(SLBlocks.Sugar_Wood.get(),"Sugar Wood");
		this.add(SLBlocks.Stripped_Sugar_Wood.get(),"Stripped Sugar Wood");
	}

}
