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
		this.add(SLBlocks.SUGAR_BLOCK.get(),"Sugar Block");
		this.add(SLBlocks.SUGAR_STONE.get(), "Sugar Stone");
		this.add(SLBlocks.SUGAR_CANDY.get(), "Sugar Candy");
		this.add(SLBlocks.SUGAR_DIAMOND_ORE.get(), "Sugar Diamond Ore");
		this.add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(), "Sugar Diamond Block");
		this.add(SLItems.Sugar_Diamond.get(), "Sugar Diamond");
		this.add(SLItems.Sugar_Diamond_nugget.get(), "Sugar Diamond Nugget");
		this.add(SLBlocks.SUGAR_COBBLESTONE.get(),"Sugar Cobblestone");
		this.add(SLBlocks.SUGAR_BRICKS.get(),"Sugar Bricks");
		this.add(SLBlocks.MOIST_SUGAR_BLOCK.get(),"Moist Sugar Block");
		this.add(SLBlocks.RAW_SUGAR_BLOCK.get(),"Raw Sugar Block");
		this.add(SLBlocks.LIT_RAW_SUGAR_BLOCK.get(),"Lit Raw sugar Block");
		this.add(SLBlocks.SUGARRACK.get(),"Sugarrack");
		this.add(SLBlocks.END_SUGAR_STONE.get(),"End Sugar Stone");
		this.add(SLBlocks.BISMUTH_ORE.get(),"Bismuth Ore");
		this.add(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get(),"Bismuth Crystal Block");
		this.add(SLBlocks.PUDDING_BLOCK.get(),"Pudding Block");
		this.add(SLBlocks.CALAMEL_SAUCE.get(),"Caramel Block");
		this.add(SLBlocks.COOKIE_BLOCK.get(),"Cookie Block");
		this.add(SLBlocks.SUGAR_PILLAR.get(),"Sugar Pillar");
		this.add(SLBlocks.ROTTEN_FLESH_BLOCK.get(),"Rotten Fresh Block");
		this.add(SLBlocks.BLACK_ICE_CANDY.get(),"Black Icecandy");
		this.add(SLBlocks.BLUE_ICE_CANDY.get(),"Blue Icecandy");
		this.add(SLBlocks.BROWN_ICE_CANDY.get(),"Brown Icecandy");
		this.add(SLBlocks.CYAN_ICE_CANDY.get(),"Cyan Icecandy");
		this.add(SLBlocks.GRAY_ICE_CANDY.get(),"Gray Icecandy");
		this.add(SLBlocks.GREEN_ICE_CANDY.get(),"Green Icecandy");
		this.add(SLBlocks.LIGHT_BLUE_ICE_CANDY.get(),"LightBlue Icecandy");
		this.add(SLBlocks.LIGHT_GRAY_ICE_CANDY.get(),"LightGray Icecandy");
		this.add(SLBlocks.LIME_ICE_CANDY.get(),"Lime Icecandy");
		this.add(SLBlocks.MAGENTA_ICE_CANDY.get(),"Magenta Icecandy");
		this.add(SLBlocks.ORANGE_ICE_CANDY.get(),"Orange Icecandy");
		this.add(SLBlocks.PINK_ICE_CANDY.get(),"Pink Icecandy");
		this.add(SLBlocks.PURPLE_ICE_CANDY.get(),"Purple Icecandy");
		this.add(SLBlocks.RED_ICE_CANDY.get(),"Red Icecandy");
		this.add(SLBlocks.WHITE_ICE_CANDY.get(),"White Icecandy");
		this.add(SLBlocks.YELLOW_ICE_CANDY.get(),"Yellow Icecandy");
		this.add(SLBlocks.SUGAR_LOG.get(),"Sugar Log");
		this.add(SLBlocks.SUGAR_LEAVES.get(),"Sugar Leaves");
		this.add(SLBlocks.SUGAR_SAPLING.get(),"Sugar Sapling");
		this.add(SLBlocks.SUGAR_PLANKS.get(),"Sugar Planks");
		this.add(SLBlocks.SUGAR_PLANKS_STAIRS.get(),"Sugar Planks Stairs");
		this.add(SLBlocks.SUGAR_STONE_STAIRS.get(), "Sugar Stone Stairs");
		this.add(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), "Sugar Cobblestone Stairs");
		this.add(SLBlocks.SUGAR_LOG_STAIRS.get(), "Sugar Log Stairs");
		this.add(SLBlocks.SUGAR_PLANKS_SLAB.get(), "Sugar Planks Slab");
		this.add(SLBlocks.SUGAR_STONE_SLAB.get(), "Sugar Stone Slab");
		this.add(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), "Sugar Cobblestone Slab");
		this.add(SLBlocks.SUGAR_LOG_SLAB.get(), "Sugar Log Slab");
		this.add(SLBlocks.SUGAR_LOG_FENCE.get(),"Sugar Log Fence");
		this.add(SLBlocks.SUGAR_PLANKS_FENCE.get(),"Sugar Planks Fence");
		this.add(SLBlocks.SUGAR_STONE_WALL.get(),"Sugar Stone Wall");
		this.add(SLBlocks.SUGAR_COBBLESTONE_WALL.get(),"Sugar Cobblestone Wall");
		this.add(SLBlocks.SUGAR_BRICKS_WALL.get(),"Sugar Bricks Wall");
		this.add(SLBlocks.SUGAR_CANDY_PANE.get(),"Sugar Candy Pane");
		this.add(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),"Sugar Planks TrapDoor");
		this.add(SLBlocks.SUGAR_DOOR.get(),"Sugar Door");
		this.add(SLBlocks.SUGAR_TORCH.get(),"Sugar Torch");
		//this.add(SLBlocks.Wall_Sugar_Torch.get(),"Wall Sugar Torch");
		this.add(SLBlocks.SUGAR_PLANKS_BUTTON.get(),"Sugar Planks Button");
		this.add(SLBlocks.SUGAR_STONE_BUTTON.get(),"Sugar Stone Button");
		this.add(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),"Sugar Planks PressurePlate");
		this.add(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),"Sugar Stone PressurePlate");
		this.add(SLBlocks.STRIPPED_SUGAR_LOG.get(),"Stripped Sugar Log");
		this.add(SLBlocks.SUGAR_WOOD.get(),"Sugar Wood");
		this.add(SLBlocks.STRIPPED_SUGAR_WOOD.get(),"Stripped Sugar Wood");
		this.add("biome.sugards.sugar_desert", "sugar_desert");
	}

}
