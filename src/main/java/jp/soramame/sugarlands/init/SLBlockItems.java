package jp.soramame.sugarlands.init;

import jp.soramame.sugarlands.SugarLandsCore;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlockItems {

    static CreativeModeTab satou = SugarLandsCore.SUGARD_TAB;

    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SugarLandsCore.MOD_ID);

    public static final RegistryObject<Item> Sugar_block =
            ITEMS.register("sugar_block",
                    ()-> new BlockItem(SLBlocks.SUGAR_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_stone =
            ITEMS.register("sugar_stone",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_candy =
            ITEMS.register("sugar_candy",
                    ()-> new BlockItem(SLBlocks.SUGAR_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_diamond_ore =
            ITEMS.register("sugar_diamond_ore",
                    ()-> new BlockItem(SLBlocks.SUGAR_DIAMOND_ORE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_diamond_block =
            ITEMS.register("sugar_diamond_block",
                    ()-> new BlockItem(SLBlocks.SUGAR_DIAMOND_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_cobblestone =
            ITEMS.register("sugar_cobblestone",
                    ()-> new BlockItem(SLBlocks.SUGAR_COBBLESTONE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_bricks =
            ITEMS.register("sugar_bricks",
                    ()-> new BlockItem(SLBlocks.SUGAR_BRICKS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Moist_sugar_block =
            ITEMS.register("moist_sugar_block",
                    ()-> new BlockItem(SLBlocks.MOIST_SUGAR_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Raw_sugar_block =
            ITEMS.register("raw_sugar_block",
                    ()-> new BlockItem(SLBlocks.RAW_SUGAR_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Lit_raw_sugar_block =
            ITEMS.register("lit_raw_sugar_block",
                    ()-> new BlockItem(SLBlocks.LIT_RAW_SUGAR_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugarrack =
            ITEMS.register("sugarrack",
                    ()-> new BlockItem(SLBlocks.SUGARRACK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> End_sugar_stone =
            ITEMS.register("end_sugar_stone",
                    ()-> new BlockItem(SLBlocks.END_SUGAR_STONE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Bismuth_ore =
            ITEMS.register("bismuth_ore",
                    ()-> new BlockItem(SLBlocks.BISMUTH_ORE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Bismuth_crystal_block =
            ITEMS.register("bismuth_crystal_block",
                    ()-> new BlockItem(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Pudding_block =
            ITEMS.register("pudding_block",
                    ()-> new BlockItem(SLBlocks.PUDDING_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Caramel_sauce =
            ITEMS.register("caramel_sauce",
                    ()-> new BlockItem(SLBlocks.CALAMEL_SAUCE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Cookie_block =
            ITEMS.register("cookie_block",
                    ()-> new BlockItem(SLBlocks.COOKIE_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_pillar =
            ITEMS.register("sugar_pillar",
                    ()-> new BlockItem(SLBlocks.SUGAR_PILLAR.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Rotten_flesh_block =
            ITEMS.register("rotten_flesh_block",
                    ()-> new BlockItem(SLBlocks.ROTTEN_FLESH_BLOCK.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Black_ice_candy =
            ITEMS.register("black_ice_candy",
                    ()-> new BlockItem(SLBlocks.BLACK_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Blue_ice_candy =
            ITEMS.register("blue_ice_candy",
                    ()-> new BlockItem(SLBlocks.BLUE_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Brown_ice_candy =
            ITEMS.register("brown_ice_candy",
                    ()-> new BlockItem(SLBlocks.BROWN_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Cyan_ice_candy =
            ITEMS.register("cyan_ice_candy",
                    ()-> new BlockItem(SLBlocks.CYAN_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Gray_ice_candy =
            ITEMS.register("gray_ice_candy",
                    ()-> new BlockItem(SLBlocks.GRAY_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Green_ice_candy =
            ITEMS.register("green_ice_candy",
                    ()-> new BlockItem(SLBlocks.GREEN_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Light_blue_ice_candy =
            ITEMS.register("light_blue_ice_candy",
                    ()-> new BlockItem(SLBlocks.LIGHT_BLUE_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Light_gray_ice_candy =
            ITEMS.register("light_gray_ice_candy",
                    ()-> new BlockItem(SLBlocks.LIGHT_GRAY_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Lime_Ice_Candy =
            ITEMS.register("lime_ice_candy",
                    ()-> new BlockItem(SLBlocks.LIME_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Magenta_ice_candy =
            ITEMS.register("magenta_ice_candy",
                    ()-> new BlockItem(SLBlocks.MAGENTA_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Orande_ice_candy =
            ITEMS.register("orange_ice_candy",
                    ()-> new BlockItem(SLBlocks.ORANGE_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Pink_ice_candy =
            ITEMS.register("pink_ice_candy",
                    ()-> new BlockItem(SLBlocks.PINK_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Purple_ice_candy =
            ITEMS.register("purple_ice_candy",
                    ()-> new BlockItem(SLBlocks.PURPLE_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Red_ice_candy =
            ITEMS.register("red_ice_candy",
                    ()-> new BlockItem(SLBlocks.RED_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> White_ice_candy =
            ITEMS.register("white_ice_candy",
                    ()-> new BlockItem(SLBlocks.WHITE_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Yellow_Ice_Candy =
            ITEMS.register("yellow_ice_candy",
                    ()-> new BlockItem(SLBlocks.YELLOW_ICE_CANDY.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_log =
            ITEMS.register("sugar_log",
                    ()-> new BlockItem(SLBlocks.SUGAR_LOG.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_leaves =
            ITEMS.register("sugar_leaves",
                    ()-> new BlockItem(SLBlocks.SUGAR_LEAVES.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_sapling =
            ITEMS.register("sugar_sapling",
                    ()-> new BlockItem(SLBlocks.SUGAR_SAPLING.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks =
            ITEMS.register("sugar_planks",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks_Stairs =
            ITEMS.register("sugar_planks_stairs",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_STAIRS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Stone_Stairs =
            ITEMS.register("sugar_stone_stairs",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE_STAIRS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_CobbleStone_Stairs =
            ITEMS.register("sugar_cobblestone_stairs",
                    ()-> new BlockItem(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Log_Stairs =
            ITEMS.register("sugar_log_stairs",
                    ()-> new BlockItem(SLBlocks.SUGAR_LOG_STAIRS.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks_Slab =
            ITEMS.register("sugar_planks_slab",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_SLAB.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Stone_Slab =
            ITEMS.register("sugar_stone_slab",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE_SLAB.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Cobblestone_Slab =
            ITEMS.register("sugar_cobblestone_slab",
                    ()-> new BlockItem(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Log_Slab =
            ITEMS.register("sugar_log_slab",
                    ()-> new BlockItem(SLBlocks.SUGAR_LOG_SLAB.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Log_Fence =
            ITEMS.register("sugar_log_fence",
                    ()-> new BlockItem(SLBlocks.SUGAR_LOG_FENCE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks_Fence =
            ITEMS.register("sugar_planks_fence",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_FENCE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Stone_Wall =
            ITEMS.register("sugar_stone_wall",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE_WALL.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Cobblestone_Wall =
            ITEMS.register("sugar_cobblestone_wall",
                    ()-> new BlockItem(SLBlocks.SUGAR_COBBLESTONE_WALL.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Bricks_Wall =
            ITEMS.register("sugar_bricks_wall",
                    ()-> new BlockItem(SLBlocks.SUGAR_BRICKS_WALL.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Candy_Pane =
            ITEMS.register("sugar_candy_pane",
                    ()-> new BlockItem(SLBlocks.SUGAR_CANDY_PANE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks_TrapDoor =
            ITEMS.register("sugar_planks_trapdoor",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Door =
            ITEMS.register("sugar_door",
                    ()-> new BlockItem(SLBlocks.SUGAR_DOOR.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Torch =
            ITEMS.register("sugar_torch",
                    ()-> new StandingAndWallBlockItem(SLBlocks.SUGAR_TORCH.get(),SLBlocks.WALL_SUGAR_TORCH.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Planks_Button =
            ITEMS.register("sugar_planks_button",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_BUTTON.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Stone_Button =
            ITEMS.register("sugar_stone_button",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE_BUTTON.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> SUGAR_PLANKS_PRESSURE_PLATE =
            ITEMS.register("sugar_planks_pressure_plate",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> SUGAR_STONE_PRESSURE_PLATE =
            ITEMS.register("sugar_stone_pressure_plate",
                    ()-> new BlockItem(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> STRIPPED_SUGAR_LOG =
            ITEMS.register("stripped_sugar_log",
                    ()-> new BlockItem(SLBlocks.STRIPPED_SUGAR_LOG.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> Sugar_Wood =
            ITEMS.register("sugar_wood",
                    ()-> new BlockItem(SLBlocks.SUGAR_WOOD.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> STRIPPED_SUGAR_WOOD =
            ITEMS.register("stripped_sugar_wood",
                    ()-> new BlockItem(SLBlocks.STRIPPED_SUGAR_WOOD.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> SUGAR_PLANKS_FENCE_GATE =
            ITEMS.register("sugar_planks_fence_gate",
                    ()-> new BlockItem(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> SUGAR_LOG_FENCE_GATE =
            ITEMS.register("sugar_log_fence_gate",
                    ()-> new BlockItem(SLBlocks.SUGAR_LOG_FENCE_GATE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> DEEPSLATE_SUGAR_DIAMOND_ORE =
            ITEMS.register("deepslate_sugar_diamond_ore",
                    ()-> new BlockItem(SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get(),
                            new Item.Properties().tab(satou)));
    public static final RegistryObject<Item> DEEPSLATE_BISMUTH_ORE =
            ITEMS.register("deepslate_bismuth_ore",
                    ()-> new BlockItem(SLBlocks.DEEPSLATE_BISMUTH_ORE.get(),
                            new Item.Properties().tab(satou)));


    public static void register(IEventBus event) {
        ITEMS.register(event);
    }
}
