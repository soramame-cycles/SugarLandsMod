package jp.soramame.sugarlands.init;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.block.Candy_Block;
import jp.soramame.sugarlands.block.Raw_Sugar_Block;
import jp.soramame.sugarlands.block.SLLogs;
import jp.soramame.sugarlands.block.Sugar_Block;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlocks {

    private static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SugarLandsCore.MOD_ID);

    public static final RegistryObject<Block> SUGAR_BLOCK =
            BLOCKS.register("sugar_block",()-> new Sugar_Block(Properties.of(Material.SAND,DyeColor.WHITE)
                    .strength(0.5F,0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> SUGAR_STONE =
            BLOCKS.register("sugar_stone",()-> block(Material.STONE,2.0F));
    public static final RegistryObject<Block> SUGAR_CANDY =
            BLOCKS.register("sugar_candy", ()-> new Candy_Block(prop(Material.STONE,0.6F).sound(SoundType.GLASS)
                    .noOcclusion().isViewBlocking(SLBlocks::never)));
    public static final RegistryObject<Block> SUGAR_DIAMOND_ORE =
            BLOCKS.register("sugar_diamond_ore", ()-> new DropExperienceBlock(prop(Material.STONE,0.6F)
                    .sound(SoundType.GLASS).requiresCorrectToolForDrops(),UniformInt.of(3, 7)));
    public static final RegistryObject<Block> SUGAR_DIAMOND_BLOCK =
            BLOCKS.register("sugar_diamond_block", ()-> block(Material.METAL,0.6F,SoundType.GLASS));
    public static final RegistryObject<Block> SUGAR_COBBLESTONE =
            BLOCKS.register("sugar_cobblestone", ()-> block(Material.STONE,2.0F));
    public static final RegistryObject<Block> SUGAR_BRICKS =
            BLOCKS.register("sugar_bricks", ()-> block(Material.STONE,2.0F));
    public static final RegistryObject<Block> MOIST_SUGAR_BLOCK =
            BLOCKS.register("moist_sugar_block", ()-> new Block(Properties.of(Material.STONE)
                    .strength(2.0F, 100.0F)));
    public static final RegistryObject<Block> RAW_SUGAR_BLOCK =
            BLOCKS.register("raw_sugar_block",()-> new Raw_Sugar_Block(prop(Material.SAND,0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> LIT_RAW_SUGAR_BLOCK =
            BLOCKS.register("lit_raw_sugar_block", ()-> new Block(Properties.of(Material.STONE)
                    .strength(2.0F, 100.0F).lightLevel(lightlevel->15)));
    public static final RegistryObject<Block> SUGARRACK =
            BLOCKS.register("sugarrack", ()-> oreBlock(SoundType.NETHERRACK));
    public static final RegistryObject<Block> END_SUGAR_STONE =
            BLOCKS.register("end_sugar_stone", ()-> oreBlock(SoundType.GLASS, UniformInt.of(1, 5)));
    public static final RegistryObject<Block> BISMUTH_ORE =
            BLOCKS.register("bismuth_ore", ()-> new DropExperienceBlock(Properties.of(Material.STONE)
                    .strength(2.0F,10.0F)));
    public static final RegistryObject<Block> BISMUTH_CRYSTAL_BLOCK =
            BLOCKS.register("bismuth_crystal_block", ()-> new Block(Properties.of(Material.STONE)
                    .strength(2.0F,10.0F).lightLevel(bismuthflash -> 15)));
    public static final RegistryObject<Block> PUDDING_BLOCK =
            BLOCKS.register("pudding_block", ()-> block(Material.SAND,2.0F,SoundType.SNOW));
    public static final RegistryObject<Block> CALAMEL_SAUCE =
            BLOCKS.register("caramel_sauce", ()-> new Candy_Block(prop(Material.SAND,0.2F)
                    .sound(SoundType.SLIME_BLOCK).noOcclusion().isViewBlocking(SLBlocks::never)));
    public static final RegistryObject<Block> COOKIE_BLOCK =
            BLOCKS.register("cookie_block", ()-> block(Material.SAND,0.5F,SoundType.SAND));
    public static final RegistryObject<Block> SUGAR_PILLAR =
            BLOCKS.register("sugar_pillar", ()-> new RotatedPillarBlock(prop(Material.STONE,0.2F)));
    public static final RegistryObject<Block> ROTTEN_FLESH_BLOCK =
            BLOCKS.register("rotten_flesh_block", ()-> new Block(prop(Material.DIRT,0.1F)
                    .sound(SoundType.SLIME_BLOCK).lightLevel(dirtylight-> 3)));
    public static final RegistryObject<Block> BLACK_ICE_CANDY =
            BLOCKS.register("black_ice_candy", ()-> ices(DyeColor.BLACK));
    public static final RegistryObject<Block> BLUE_ICE_CANDY =
            BLOCKS.register("blue_ice_candy", ()-> ices(DyeColor.BLUE));
    public static final RegistryObject<Block> BROWN_ICE_CANDY =
            BLOCKS.register("brown_ice_candy", ()-> ices(DyeColor.BROWN));
    public static final RegistryObject<Block> CYAN_ICE_CANDY =
            BLOCKS.register("cyan_ice_candy", ()-> ices(DyeColor.CYAN));
    public static final RegistryObject<Block> GRAY_ICE_CANDY =
            BLOCKS.register("gray_ice_candy", ()-> ices(DyeColor.GRAY));
    public static final RegistryObject<Block> GREEN_ICE_CANDY =
            BLOCKS.register("green_ice_candy", ()-> ices(DyeColor.GREEN));
    public static final RegistryObject<Block> LIGHT_BLUE_ICE_CANDY =
            BLOCKS.register("light_blue_ice_candy", ()-> ices(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<Block> LIGHT_GRAY_ICE_CANDY =
            BLOCKS.register("light_gray_ice_candy", ()-> ices(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<Block> LIME_ICE_CANDY =
            BLOCKS.register("lime_ice_candy", ()-> ices(DyeColor.LIME));
    public static final RegistryObject<Block> MAGENTA_ICE_CANDY =
            BLOCKS.register("magenta_ice_candy", ()-> ices(DyeColor.MAGENTA));
    public static final RegistryObject<Block> ORANGE_ICE_CANDY =
            BLOCKS.register("orange_ice_candy", ()-> ices(DyeColor.ORANGE));
    public static final RegistryObject<Block> PINK_ICE_CANDY =
            BLOCKS.register("pink_ice_candy", ()-> ices(DyeColor.PINK));
    public static final RegistryObject<Block> PURPLE_ICE_CANDY =
            BLOCKS.register("purple_ice_candy", ()-> ices(DyeColor.PURPLE));
    public static final RegistryObject<Block> RED_ICE_CANDY =
            BLOCKS.register("red_ice_candy", ()-> ices(DyeColor.RED));
    public static final RegistryObject<Block> WHITE_ICE_CANDY =
            BLOCKS.register("white_ice_candy", ()-> ices(DyeColor.WHITE));
    public static final RegistryObject<Block> YELLOW_ICE_CANDY =
            BLOCKS.register("yellow_ice_candy", ()-> ices(DyeColor.YELLOW));
    public static final RegistryObject<Block> SUGAR_LOG =
            BLOCKS.register("sugar_log", ()-> new SLLogs(MaterialColor.QUARTZ, MaterialColor.QUARTZ));
    public static final RegistryObject<Block> SUGAR_LEAVES =
            BLOCKS.register("sugar_leaves", ()-> leaves());
    public static final RegistryObject<Block> SUGAR_SAPLING =
            BLOCKS.register("sugar_sapling", ()-> new SaplingBlock(new Sugar_Tree(), Properties.of(Material.PLANT)
                    .noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> SUGAR_PLANKS =
            BLOCKS.register("sugar_planks", ()-> block(Material.WOOD,0.5F,SoundType.WOOD));
    public static final RegistryObject<Block> SUGAR_PLANKS_STAIRS =
            BLOCKS.register("sugar_planks_stairs", ()-> new StairBlock(get(SUGAR_PLANKS), Properties.copy(SUGAR_PLANKS.get())));
    public static final RegistryObject<Block> SUGAR_STONE_STAIRS =
            BLOCKS.register("sugar_stone_stairs", ()-> new StairBlock(get(SUGAR_STONE), Properties.copy(SUGAR_STONE.get())));
    public static final RegistryObject<Block> SUGAR_COBBLESTONE_STAIRS =
            BLOCKS.register("sugar_cobblestone_stairs", ()-> new StairBlock(get(SUGAR_COBBLESTONE), Properties.copy(SUGAR_COBBLESTONE.get())));
    public static final RegistryObject<Block> SUGAR_LOG_STAIRS =
            BLOCKS.register("sugar_log_stairs", ()-> new StairBlock(get(SUGAR_PLANKS), Properties.copy(SUGAR_PLANKS.get())));
    public static final RegistryObject<Block> SUGAR_PLANKS_SLAB =
            BLOCKS.register("sugar_planks_slab", ()-> woodenslab(0.5F));
    public static final RegistryObject<Block> SUGAR_STONE_SLAB =
            BLOCKS.register("sugar_stone_slab", ()-> stoneSlab(2.0F));
    public static final RegistryObject<Block> SUGAR_COBBLESTONE_SLAB =
            BLOCKS.register("sugar_cobblestone_slab", ()-> stoneSlab(2.0F));
    public static final RegistryObject<Block> SUGAR_LOG_SLAB =
            BLOCKS.register("sugar_log_slab", ()-> woodenslab(0.5F));
    public static final RegistryObject<Block> SUGAR_LOG_FENCE =
            BLOCKS.register("sugar_log_fence", ()-> new FenceBlock(prop(Material.WOOD,0.5F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SUGAR_PLANKS_FENCE =
            BLOCKS.register("sugar_planks_fence", ()-> new FenceBlock(prop(Material.WOOD,0.5F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SUGAR_STONE_WALL =
            BLOCKS.register("sugar_stone_wall",()-> new WallBlock(Properties.copy(SUGAR_STONE.get())));
    public static final RegistryObject<Block> SUGAR_COBBLESTONE_WALL =
            BLOCKS.register("sugar_cobblestone_wall",()-> new WallBlock(Properties.copy(SUGAR_COBBLESTONE.get())));
    public static final RegistryObject<Block> SUGAR_BRICKS_WALL =
            BLOCKS.register("sugar_bricks_wall",()-> new WallBlock(Properties.copy(SUGAR_BRICKS.get())));
    public static final RegistryObject<Block> SUGAR_CANDY_PANE =
            BLOCKS.register("sugar_candy_pane", ()-> new StainedGlassPaneBlock(DyeColor.WHITE, prop(Material.WOOD,0.6F)
                    .sound(SoundType.GLASS).noOcclusion().isValidSpawn(SLBlocks::never).isViewBlocking(SLBlocks::never)
                    .isRedstoneConductor(SLBlocks::never).isSuffocating(SLBlocks::never)));
    public static final RegistryObject<Block> SUGAR_PLANKS_TRAPDOOR =
            BLOCKS.register("sugar_planks_trapdoor", ()-> new TrapDoorBlock(prop(Material.WOOD,0.5F)
                    .sound(SoundType.WOOD).noOcclusion().isValidSpawn(SLBlocks::never)));
    public static final RegistryObject<Block> SUGAR_DOOR =
            BLOCKS.register("sugar_door", ()-> new DoorBlock(prop(Material.WOOD,0.5F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SUGAR_TORCH =
            BLOCKS.register("sugar_torch", ()-> new TorchBlock(torchProp(),ParticleTypes.END_ROD));
    public static final RegistryObject<Block> WALL_SUGAR_TORCH =
            BLOCKS.register("wall_sugar_torch", ()-> new WallTorchBlock(torchProp().lootFrom(()->SUGAR_TORCH.get()),ParticleTypes.END_ROD));
    public static final RegistryObject<Block> SUGAR_PLANKS_BUTTON =
            BLOCKS.register("sugar_planks_button", ()-> new WoodButtonBlock(prop(Material.DECORATION,0.5F)
                    .sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> SUGAR_STONE_BUTTON =
            BLOCKS.register("sugar_stone_button",()-> new StoneButtonBlock(prop(Material.DECORATION,0.5F).noCollission()));
    public static final RegistryObject<Block> SUGAR_PLANKS_PRESSURE_PLATE =
            BLOCKS.register("sugar_planks_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.EVERYTHING, Properties.of(Material.WOOD)
                    .strength(0.5F).sound(SoundType.WOOD).noCollission()));
    public static final RegistryObject<Block> SUGAR_STONE_PRESSURE_PLATE =
            BLOCKS.register("sugar_stone_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.MOBS, Properties.of(Material.STONE)
                    .noCollission().strength(0.5F)));
    public static final RegistryObject<Block> STRIPPED_SUGAR_LOG =
            BLOCKS.register("stripped_sugar_log", ()-> log(MaterialColor.QUARTZ, MaterialColor.QUARTZ));
    public static final RegistryObject<Block> SUGAR_WOOD =
            BLOCKS.register("sugar_wood", ()-> new SLLogs(MaterialColor.QUARTZ,MaterialColor.QUARTZ));
    public static final RegistryObject<Block> STRIPPED_SUGAR_WOOD =
            BLOCKS.register("stripped_sugar_wood", ()-> new RotatedPillarBlock(prop(Material.WOOD,2.0F)));
    public static final RegistryObject<Block> SUGAR_PLANKS_FENCE_GATE =
            BLOCKS.register("sugar_planks_fence_gate", ()-> new FenceGateBlock(prop(Material.WOOD,0.5F)
                    .sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> SUGAR_LOG_FENCE_GATE =
            BLOCKS.register("sugar_log_fence_gate", ()-> new FenceGateBlock(prop(Material.WOOD,0.5F)
                    .sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> DEEPSLATE_SUGAR_DIAMOND_ORE =
            BLOCKS.register("deepslate_sugar_diamond_ore", ()-> deepslateOre(SUGAR_DIAMOND_ORE, UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_BISMUTH_ORE =
            BLOCKS.register("deepslate_bismuth_ore", ()-> deepslate(BISMUTH_ORE));

    public static void register(IEventBus event) {
        BLOCKS.register(event);
    }

    public static Collection<RegistryObject<Block>> getEntries(){
        return BLOCKS.getEntries();
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }
    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entitytype) {
        return false;
    }
    private static Boolean ocelotOrParrot(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entitytype) {
        return entitytype == EntityType.OCELOT || entitytype == EntityType.PARROT;
    }

    private static Block block(Material material,float str,SoundType sound) {
        return new Block(prop(material,str).sound(sound));
    }
    private static Block block(Material material,float str) {
        return new Block(prop(material,str));
    }
    private static RotatedPillarBlock log(MaterialColor top, MaterialColor side) {
        return new RotatedPillarBlock(Properties.of(Material.WOOD, XZorY -> {
            return XZorY.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side;
        }).strength(2.0F).sound(SoundType.WOOD));
    }
    private static LeavesBlock leaves() {
        return new LeavesBlock(Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()
                .isValidSpawn(SLBlocks::ocelotOrParrot).isSuffocating(SLBlocks::never).isViewBlocking(SLBlocks::never));
    }
    private static Block ices(DyeColor d) {
        return new Block(Properties.of(Material.STONE,d).strength(0.5F)
                .friction(0.989F).sound(SoundType.GLASS).lightLevel(icelight -> 3));
    }
    private static SlabBlock woodenslab(float str) {
        return new SlabBlock(prop(Material.WOOD,str).sound(SoundType.WOOD));
    }
    private static SlabBlock stoneSlab(float str) {
        return new SlabBlock(prop(Material.STONE,str));
    }
    private static DropExperienceBlock oreBlock(SoundType s) {
        return new DropExperienceBlock(prop(Material.STONE, 0.5f).sound(s));
    }
    private static DropExperienceBlock oreBlock(SoundType s,IntProvider xpRange) {
        return new DropExperienceBlock(prop(Material.STONE, 0.5f).sound(s),xpRange);
    }
    private static DropExperienceBlock deepslate(RegistryObject<Block> block) {
        return new DropExperienceBlock(Properties.copy(block.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));
    }
    private static DropExperienceBlock deepslateOre(RegistryObject<Block> block,IntProvider xpRange) {
        return new DropExperienceBlock(Properties.copy(block.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE),xpRange);
    }

    private static Properties prop(Material material,float str) {
        return Properties.of(material).strength(str);
    }
    private static Properties torchProp() {
        return Properties.of(Material.DECORATION).noCollission().instabreak().lightLevel(sugar-> 10).sound(SoundType.WOOD);
    }

    private static Supplier<BlockState> get(RegistryObject<Block> block){
        return ()-> block.get().defaultBlockState();
    }

    public static Block[] use_axe() {
        return material(Material.WOOD);
    }
    public static Block[] use_pickaxe() {
        return material(Material.STONE, Material.METAL);
    }
    public static Block[] use_hoe() {
        return material(Material.LEAVES, Material.PLANT);
    }
    public static Block[] use_shovel() {
        return material(Material.SAND, Material.DIRT);
    }
    private static Block[] material(Material... ms) {
        ArrayList<Block> list = new ArrayList<>();
        getEntries().forEach(block->{
            for(Material m:ms) {
                if(block.get().defaultBlockState().getMaterial().equals(m)) {
                    list.add(block.get());
                }
            }
        });
        Block[] b = new Block[list.size()];
        b = list.toArray(b);
        return b;
    }

}
