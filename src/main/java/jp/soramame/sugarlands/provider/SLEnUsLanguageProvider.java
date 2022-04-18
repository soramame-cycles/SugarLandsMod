package jp.soramame.sugarlands.provider;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBiomes;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.data.LanguageProvider;

public class SLEnUsLanguageProvider extends LanguageProvider {

	public SLEnUsLanguageProvider(DataGenerator gen, String modid) {
		super(gen, modid,"en_us");
	}

	@Override
	protected void addTranslations() {
		add(SugarLandsCore.SUGARD_TAB, "SugarLands");
		add(SLBlocks.SUGAR_BLOCK.get(),"Sugar Block");
		add(SLBlocks.SUGAR_STONE.get(), "Sugar Stone");
		add(SLBlocks.SUGAR_CANDY.get(), "Sugar Candy");
		add(SLBlocks.SUGAR_DIAMOND_ORE.get(), "Sugar Diamond Ore");
		add(SLBlocks.SUGAR_DIAMOND_BLOCK.get(), "Sugar Diamond Block");
		add(SLItems.Sugar_Diamond.get(), "Sugar Diamond");
		add(SLItems.Sugar_Diamond_nugget.get(), "Sugar Diamond Nugget");
		add(SLBlocks.SUGAR_COBBLESTONE.get(),"Sugar Cobblestone");
		add(SLBlocks.SUGAR_BRICKS.get(),"Sugar Bricks");
		add(SLBlocks.MOIST_SUGAR_BLOCK.get(),"Moist Sugar Block");
		add(SLBlocks.RAW_SUGAR_BLOCK.get(),"Raw Sugar Block");
		add(SLBlocks.LIT_RAW_SUGAR_BLOCK.get(),"Lit Raw sugar Block");
		add(SLBlocks.SUGARRACK.get(),"Sugarrack");
		add(SLBlocks.END_SUGAR_STONE.get(),"End Sugar Stone");
		add(SLBlocks.BISMUTH_ORE.get(),"Bismuth Ore");
		add(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get(),"Bismuth Crystal Block");
		add(SLBlocks.PUDDING_BLOCK.get(),"Pudding Block");
		add(SLBlocks.CALAMEL_SAUCE.get(),"Caramel Block");
		add(SLBlocks.COOKIE_BLOCK.get(),"Cookie Block");
		add(SLBlocks.SUGAR_PILLAR.get(),"Sugar Pillar");
		add(SLBlocks.ROTTEN_FLESH_BLOCK.get(),"Rotten Fresh Block");
		add(SLBlocks.BLACK_ICE_CANDY.get(),"Black Icecandy");
		add(SLBlocks.BLUE_ICE_CANDY.get(),"Blue Icecandy");
		add(SLBlocks.BROWN_ICE_CANDY.get(),"Brown Icecandy");
		add(SLBlocks.CYAN_ICE_CANDY.get(),"Cyan Icecandy");
		add(SLBlocks.GRAY_ICE_CANDY.get(),"Gray Icecandy");
		add(SLBlocks.GREEN_ICE_CANDY.get(),"Green Icecandy");
		add(SLBlocks.LIGHT_BLUE_ICE_CANDY.get(),"LightBlue Icecandy");
		add(SLBlocks.LIGHT_GRAY_ICE_CANDY.get(),"LightGray Icecandy");
		add(SLBlocks.LIME_ICE_CANDY.get(),"Lime Icecandy");
		add(SLBlocks.MAGENTA_ICE_CANDY.get(),"Magenta Icecandy");
		add(SLBlocks.ORANGE_ICE_CANDY.get(),"Orange Icecandy");
		add(SLBlocks.PINK_ICE_CANDY.get(),"Pink Icecandy");
		add(SLBlocks.PURPLE_ICE_CANDY.get(),"Purple Icecandy");
		add(SLBlocks.RED_ICE_CANDY.get(),"Red Icecandy");
		add(SLBlocks.WHITE_ICE_CANDY.get(),"White Icecandy");
		add(SLBlocks.YELLOW_ICE_CANDY.get(),"Yellow Icecandy");
		add(SLBlocks.SUGAR_LOG.get(),"Sugar Log");
		add(SLBlocks.SUGAR_LEAVES.get(),"Sugar Leaves");
		add(SLBlocks.SUGAR_SAPLING.get(),"Sugar Sapling");
		add(SLBlocks.SUGAR_PLANKS.get(),"Sugar Planks");
		add(SLBlocks.SUGAR_PLANKS_STAIRS.get(),"Sugar Planks Stairs");
		add(SLBlocks.SUGAR_STONE_STAIRS.get(), "Sugar Stone Stairs");
		add(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), "Sugar Cobblestone Stairs");
		add(SLBlocks.SUGAR_LOG_STAIRS.get(), "Sugar Log Stairs");
		add(SLBlocks.SUGAR_PLANKS_SLAB.get(), "Sugar Planks Slab");
		add(SLBlocks.SUGAR_STONE_SLAB.get(), "Sugar Stone Slab");
		add(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), "Sugar Cobblestone Slab");
		add(SLBlocks.SUGAR_LOG_SLAB.get(), "Sugar Log Slab");
		add(SLBlocks.SUGAR_LOG_FENCE.get(),"Sugar Log Fence");
		add(SLBlocks.SUGAR_PLANKS_FENCE.get(),"Sugar Planks Fence");
		add(SLBlocks.SUGAR_STONE_WALL.get(),"Sugar Stone Wall");
		add(SLBlocks.SUGAR_COBBLESTONE_WALL.get(),"Sugar Cobblestone Wall");
		add(SLBlocks.SUGAR_BRICKS_WALL.get(),"Sugar Bricks Wall");
		add(SLBlocks.SUGAR_CANDY_PANE.get(),"Sugar Candy Pane");
		add(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),"Sugar Planks TrapDoor");
		add(SLBlocks.SUGAR_DOOR.get(),"Sugar Door");
		add(SLBlocks.SUGAR_TORCH.get(),"Sugar Torch");
		//add(SLBlocks.Wall_Sugar_Torch.get(),"Wall Sugar Torch");
		add(SLBlocks.SUGAR_PLANKS_BUTTON.get(),"Sugar Planks Button");
		add(SLBlocks.SUGAR_STONE_BUTTON.get(),"Sugar Stone Button");
		add(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),"Sugar Planks PressurePlate");
		add(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),"Sugar Stone PressurePlate");
		add(SLBlocks.STRIPPED_SUGAR_LOG.get(),"Stripped Sugar Log");
		add(SLBlocks.SUGAR_WOOD.get(),"Sugar Wood");
		add(SLBlocks.STRIPPED_SUGAR_WOOD.get(),"Stripped Sugar Wood");
		add(SLBiomes.SUGAR_DESERT_REGISTRY.get(), "Sugar Desert");
		add(SLBiomes.PUDDING_PLAIN_REGISTRY.get(), "Pudding Plain");
		add(SLBiomes.SUGAR_FOREST_REGISTRY.get(), "Sugar Forest");
		add(SLBiomes.ICECANDY_SPIKES_REGISTRY.get(), "IceCandy Spikes");
		add(SLItems.Sugar_Diamond_Pickaxe.get(), "Sugar Diamond Pickaxe");
		add(SLItems.Bismuth_Pickaxe.get(), "Bismuth Pickaxe");
		add(SLItems.Crushed_Sugar_Cane.get(), "Crushed Sugar Cane");
		add(SLItems.Poppy_Seed.get(), "Poppy Seed");
		add(SLItems.Pudding.get(), "Pudding");
		add(SLItems.Raw_sugar.get(), "Raw Sugar");
		add(SLItems.Bismuth_Crystal.get(), "Bismuth Crystal");
		add(SLItems.Azuki_Been.get(), "Azuki Been");
		add(SLItems.Azuki_Paste.get(), "Azuki Paste");
		add(SLItems.Azuki_Paste_Bun.get(), "Azuki Paste Bun");
		add(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(), "Sugar Planks Fence Gate");
		add(SLBlocks.SUGAR_LOG_FENCE_GATE.get(), "sugar Log Fence Gate");
		add();
	}

	private void add() {
		addadvance("sugar.sugar", "Sweet Powder", "Get Sugar");
		addadvance("sugar.root", "SugarLands", "In search of sweetness");
		addadvance("sugar.sugar_block", "Sugar Hunter", "Get Sugar Block");
		addadvance("sugar.rotten", "Isn't that rotten?", "Get Rotten Fresh Block");
	}

	private void add(Biome biome, String name) {
		add(Util.makeDescriptionId("biome",biome.getRegistryName()),name);
	}
	private void add(ItemGroup i,String name) {
		add(i.getDisplayName().getString(),name);
	}
	public void addadvance(String ad,String title,String desc) {
		String modid = SugarLandsCore.MOD_ID;
		add(Util.makeDescriptionId("advancements", new ResourceLocation(modid,ad+".title")),title);
		add(Util.makeDescriptionId("advancements", new ResourceLocation(modid,ad+".description")),desc);
	}
}
