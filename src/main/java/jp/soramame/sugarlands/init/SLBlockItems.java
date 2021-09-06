package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlockItems {

	static ItemGroup satou = SugarLandsCore.SUGARD_TAB;

	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, SugarLandsCore.MOD_ID);

	public static final RegistryObject<Item> Sugar_block =
			ITEMS.register("sugar_block",
					()-> new BlockItem(SLBlocks.Sugar_Block.get(),
							new Item.Properties().tab(SugarLandsCore.SUGARD_TAB)));
	public static final RegistryObject<Item> Sugar_stone =
			ITEMS.register("sugar_stone",
					()-> new BlockItem(SLBlocks.Sugar_Stone.get(),
							new Item.Properties().tab(SugarLandsCore.SUGARD_TAB)));
	public static final RegistryObject<Item> Sugar_candy =
			ITEMS.register("sugar_candy",
					()-> new BlockItem(SLBlocks.Sugar_Candy.get(),
							new Item.Properties().tab(SugarLandsCore.SUGARD_TAB)));
	public static final RegistryObject<Item> Sugar_diamond_ore =
			ITEMS.register("sugar_diamond_ore",
					()-> new BlockItem(SLBlocks.Sugar_Diamond_Ore.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_diamond_block =
			ITEMS.register("sugar_diamond_block",
					()-> new BlockItem(SLBlocks.Sugar_Diamond_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_cobblestone =
			ITEMS.register("sugar_cobblestone",
					()-> new BlockItem(SLBlocks.Sugar_CobbleStone.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_bricks =
			ITEMS.register("sugar_bricks",
					()-> new BlockItem(SLBlocks.Sugar_Bricks.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Moist_sugar_block =
			ITEMS.register("moist_sugar_block",
					()-> new BlockItem(SLBlocks.Moist_Sugar_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Raw_sugar_block =
			ITEMS.register("raw_sugar_block",
					()-> new BlockItem(SLBlocks.Raw_Sugar_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Lit_raw_sugar_block =
			ITEMS.register("lit_raw_sugar_block",
					()-> new BlockItem(SLBlocks.Lit_Raw_Sugar_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugarrack =
			ITEMS.register("sugarrack",
					()-> new BlockItem(SLBlocks.Sugarrack.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> End_sugar_stone =
			ITEMS.register("end_sugar_stone",
					()-> new BlockItem(SLBlocks.End_Sugar_Stone.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Bismuth_ore =
			ITEMS.register("bismuth_ore",
					()-> new BlockItem(SLBlocks.Bismuth_Ore.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Bismuth_crystal_block =
			ITEMS.register("bismuth_crystal_block",
					()-> new BlockItem(SLBlocks.Bismuth_Crystal_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Pudding_block =
			ITEMS.register("pudding_block",
					()-> new BlockItem(SLBlocks.Pudding_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Caramel_sauce =
			ITEMS.register("caramel_sauce",
					()-> new BlockItem(SLBlocks.Calamel_Sauce.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Cookie_block =
			ITEMS.register("cookie_block",
					()-> new BlockItem(SLBlocks.Cookie_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_pillar =
			ITEMS.register("sugar_pillar",
					()-> new BlockItem(SLBlocks.Sugar_Pillar.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Rotten_flesh_block =
			ITEMS.register("rotten_flesh_block",
					()-> new BlockItem(SLBlocks.Rotten_Flesh_Block.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Black_ice_candy =
			ITEMS.register("black_ice_candy",
					()-> new BlockItem(SLBlocks.Black_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Blue_ice_candy =
			ITEMS.register("blue_ice_candy",
					()-> new BlockItem(SLBlocks.Blue_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Brown_ice_candy =
			ITEMS.register("brown_ice_candy",
					()-> new BlockItem(SLBlocks.Brown_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Cyan_ice_candy =
			ITEMS.register("cyan_ice_candy",
					()-> new BlockItem(SLBlocks.Cyan_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Gray_ice_candy =
			ITEMS.register("gray_ice_candy",
					()-> new BlockItem(SLBlocks.Gray_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Green_ice_candy =
			ITEMS.register("green_ice_candy",
					()-> new BlockItem(SLBlocks.Green_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Light_blue_ice_candy =
			ITEMS.register("light_blue_ice_candy",
					()-> new BlockItem(SLBlocks.Light_Blue_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Light_gray_ice_candy =
			ITEMS.register("light_gray_ice_candy",
					()-> new BlockItem(SLBlocks.Light_Gray_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Lime_Ice_Candy =
			ITEMS.register("lime_ice_candy",
					()-> new BlockItem(SLBlocks.Lime_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Magenta_ice_candy =
			ITEMS.register("magenta_ice_candy",
					()-> new BlockItem(SLBlocks.Magenta_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Orande_ice_candy =
			ITEMS.register("orange_ice_candy",
					()-> new BlockItem(SLBlocks.Orange_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Pink_ice_candy =
			ITEMS.register("pink_ice_candy",
					()-> new BlockItem(SLBlocks.Pink_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Purple_ice_candy =
			ITEMS.register("purple_ice_candy",
					()-> new BlockItem(SLBlocks.Purple_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Red_ice_candy =
			ITEMS.register("red_ice_candy",
					()-> new BlockItem(SLBlocks.Red_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> White_ice_candy =
			ITEMS.register("white_ice_candy",
					()-> new BlockItem(SLBlocks.White_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Yellow_Ice_Candy =
			ITEMS.register("yellow_ice_candy",
					()-> new BlockItem(SLBlocks.Yellow_Ice_Candy.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_log =
			ITEMS.register("sugar_log",
					()-> new BlockItem(SLBlocks.Sugar_Log.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_leaves =
			ITEMS.register("sugar_leaves",
					()-> new BlockItem(SLBlocks.Sugar_Leaves.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_sapling =
			ITEMS.register("sugar_sapling",
					()-> new BlockItem(SLBlocks.Sugar_Sapling.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks =
			ITEMS.register("sugar_planks",
					()-> new BlockItem(SLBlocks.Sugar_Planks.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks_Stairs =
			ITEMS.register("sugar_planks_stairs",
					()-> new BlockItem(SLBlocks.Sugar_Planks_Stairs.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Stone_Stairs =
			ITEMS.register("sugar_stone_stairs",
					()-> new BlockItem(SLBlocks.Sugar_Stone_Stairs.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_CobbleStone_Stairs =
			ITEMS.register("sugar_cobblestone_stairs",
					()-> new BlockItem(SLBlocks.Sugar_Cobblestone_Stairs.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Log_Stairs =
			ITEMS.register("sugar_log_stairs",
					()-> new BlockItem(SLBlocks.Sugar_Log_Stairs.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks_Slab =
			ITEMS.register("sugar_planks_slab",
					()-> new BlockItem(SLBlocks.Sugar_Planks_Slab.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Stone_Slab =
			ITEMS.register("sugar_stone_slab",
					()-> new BlockItem(SLBlocks.Sugar_Stone_Slab.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Cobblestone_Slab =
			ITEMS.register("sugar_cobblestone_slab",
					()-> new BlockItem(SLBlocks.Sugar_Cobblestone_Slab.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Log_Slab =
			ITEMS.register("sugar_log_slab",
					()-> new BlockItem(SLBlocks.Sugar_Log_Slab.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Log_Fence =
			ITEMS.register("sugar_log_fence",
					()-> new BlockItem(SLBlocks.Sugar_Log_Fence.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks_Fence =
			ITEMS.register("sugar_planks_fence",
					()-> new BlockItem(SLBlocks.Sugar_Planks_Fence.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Stone_Wall =
			ITEMS.register("sugar_stone_wall",
					()-> new BlockItem(SLBlocks.Sugar_Stone_Wall.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Cobblestone_Wall =
			ITEMS.register("sugar_cobblestone_wall",
					()-> new BlockItem(SLBlocks.Sugar_Cobblestone_Wall.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Bricks_Wall =
			ITEMS.register("sugar_bricks_wall",
					()-> new BlockItem(SLBlocks.Sugar_Bricks_Wall.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Candy_Pane =
			ITEMS.register("sugar_candy_pane",
					()-> new BlockItem(SLBlocks.Sugar_Candy_Pane.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks_TrapDoor =
			ITEMS.register("sugar_planks_trapdoor",
					()-> new BlockItem(SLBlocks.Sugar_Planks_TrapDoor.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Door =
			ITEMS.register("sugar_door",
					()-> new BlockItem(SLBlocks.Sugar_Door.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Torch =
			ITEMS.register("sugar_torch",
					()-> new WallOrFloorItem(SLBlocks.Sugar_Torch.get(),SLBlocks.Wall_Sugar_Torch.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Planks_Button =
			ITEMS.register("sugar_planks_button",
					()-> new BlockItem(SLBlocks.Sugar_Planks_Button.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Stone_Button =
			ITEMS.register("sugar_stone_button",
					()-> new BlockItem(SLBlocks.Sugar_Stone_Button.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_planks_Pressure_Plate =
			ITEMS.register("sugar_planks_pressure_plate",
					()-> new BlockItem(SLBlocks.Sugar_planks_Pressure_Plate.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_stone_Pressure_Plate =
			ITEMS.register("sugar_stone_pressure_plate",
					()-> new BlockItem(SLBlocks.Sugar_stone_Pressure_Plate.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Stripped_Sugar_Log =
			ITEMS.register("stripped_sugar_log",
					()-> new BlockItem(SLBlocks.Stripped_Sugar_Log.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Sugar_Wood =
			ITEMS.register("sugar_wood",
					()-> new BlockItem(SLBlocks.Sugar_Wood.get(),
							new Item.Properties().tab(satou)));
	public static final RegistryObject<Item> Stripped_Sugar_Wood =
			ITEMS.register("stripped_sugar_wood",
					()-> new BlockItem(SLBlocks.Stripped_Sugar_Wood.get(),
							new Item.Properties().tab(satou)));


	public static void register(IEventBus event) {
		ITEMS.register(event);
	}
}
