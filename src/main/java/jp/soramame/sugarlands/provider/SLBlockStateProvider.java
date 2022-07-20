package jp.soramame.sugarlands.provider;

import java.util.Objects;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlockStateProvider extends BlockStateProvider {

    public SLBlockStateProvider(DataGenerator gen,String modid,ExistingFileHelper exFileHelper) {
        super(gen,modid,exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(SLBlocks.SUGAR_BLOCK.get());
        simpleBlockWithItem(SLBlocks.SUGAR_STONE.get());
        simpleBlockWithItem(SLBlocks.SUGAR_CANDY.get());
        simpleBlockWithItem(SLBlocks.SUGAR_DIAMOND_ORE.get());
        simpleBlockWithItem(SLBlocks.SUGAR_DIAMOND_BLOCK.get());
        simpleBlockWithItem(SLBlocks.SUGAR_COBBLESTONE.get());
        simpleBlockWithItem(SLBlocks.SUGAR_BRICKS.get());
        simpleBlockWithItem(SLBlocks.MOIST_SUGAR_BLOCK.get());
        simpleBlockWithItem(SLBlocks.RAW_SUGAR_BLOCK.get());
        simpleBlockWithItem(SLBlocks.LIT_RAW_SUGAR_BLOCK.get());
        simpleBlockWithItem(SLBlocks.SUGARRACK.get());
        simpleBlockWithItem(SLBlocks.END_SUGAR_STONE.get());
        simpleBlockWithItem(SLBlocks.BISMUTH_ORE.get());
        simpleBlockWithItem(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get());
        simpleBlockWithItem(SLBlocks.PUDDING_BLOCK.get());
        simpleBlockWithItem(SLBlocks.CALAMEL_SAUCE.get());
        simpleBlockWithItem(SLBlocks.COOKIE_BLOCK.get());
        simpleBlockWithItem(SLBlocks.ROTTEN_FLESH_BLOCK.get());
        simpleBlockWithItem(SLBlocks.BLACK_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.BLUE_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.BROWN_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.CYAN_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.GRAY_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.GREEN_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.LIGHT_BLUE_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.LIGHT_GRAY_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.LIME_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.MAGENTA_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.ORANGE_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.PINK_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.PURPLE_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.RED_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.WHITE_ICE_CANDY.get());
        simpleBlockWithItem(SLBlocks.YELLOW_ICE_CANDY.get());
        logBlockWithItem((RotatedPillarBlock) SLBlocks.SUGAR_LOG.get(),sugarlog(),
                new ResourceLocation("sugards:block/sugar_log_top"));
        simpleBlockWithItem(SLBlocks.SUGAR_LEAVES.get());
        simpleBlockWithItem(SLBlocks.SUGAR_PLANKS.get());
        stairBlockWithItem((StairBlock) SLBlocks.SUGAR_PLANKS_STAIRS.get(), sugarplanks());
        stairBlockWithItem((StairBlock) SLBlocks.SUGAR_STONE_STAIRS.get(), sugarstone());
        stairBlockWithItem((StairBlock) SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), sugarcobble());
        stairBlockWithItem((StairBlock) SLBlocks.SUGAR_LOG_STAIRS.get(), sugarlog());
        slabBlockWithItem((SlabBlock) SLBlocks.SUGAR_PLANKS_SLAB.get(), sugarplanks(), sugarplanks());
        slabBlockWithItem((SlabBlock) SLBlocks.SUGAR_STONE_SLAB.get(), sugarstone(), sugarstone());
        doubleslabBlock(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(),
                new ResourceLocation("sugards:block/sugar_cobblestone_slab_double"),sugarcobble());
        slabBlockWithItem((SlabBlock) SLBlocks.SUGAR_COBBLESTONE_SLAB.get(),
                new ResourceLocation("sugards:block/sugar_cobblestone_slab_double"),sugarcobble());
        slabBlockWithItem((SlabBlock) SLBlocks.SUGAR_LOG_SLAB.get(), sugarlog(), sugarlog());
        fenceBlockWithItem((FenceBlock) SLBlocks.SUGAR_LOG_FENCE.get(), sugarlog());
        fenceBlockWithItem((FenceBlock) SLBlocks.SUGAR_LOG_FENCE.get(),sugarlog());
        fenceBlockWithItem((FenceBlock) SLBlocks.SUGAR_PLANKS_FENCE.get(),sugarplanks());
        wallBlockWithItem((WallBlock) SLBlocks.SUGAR_STONE_WALL.get(), sugarstone());
        wallBlockWithItem((WallBlock) SLBlocks.SUGAR_COBBLESTONE_WALL.get(), sugarcobble());
        wallBlockWithItem((WallBlock) SLBlocks.SUGAR_BRICKS_WALL.get(),
                new ResourceLocation("sugards:block/sugar_bricks"));
        paneBlockWithItem((StainedGlassPaneBlock) SLBlocks.SUGAR_CANDY_PANE.get(),
                new ResourceLocation("sugards:block/sugar_candy"),
                new ResourceLocation("sugards:block/sugar_candy"));
        trapdoorWithItem((TrapDoorBlock) SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),
                new ResourceLocation("sugards:block/sugar_trapdoor"), false);
        doorBlockWithItem((DoorBlock) SLBlocks.SUGAR_DOOR.get(),
                new ResourceLocation(SugarLandsCore.MOD_ID,"item/sugar_door"),
                new ResourceLocation("sugards:block/sugar_door_bottom"),
                new ResourceLocation("sugards:block/sugar_door_top"));
        torchWithItem(SLBlocks.SUGAR_TORCH.get(), sugartorch());
        wallTorchBlock(SLBlocks.WALL_SUGAR_TORCH.get(),sugartorch(), sugartorch(), sugartorch(), sugartorch());
        buttonWithItem(SLBlocks.SUGAR_PLANKS_BUTTON.get(),sugarplanks());
        buttonWithItem(SLBlocks.SUGAR_STONE_BUTTON.get(),sugarstone());
        pressurePlateWithItem(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(),sugarplanks());
        pressurePlateWithItem(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(),sugarstone());
        logBlockWithItem((RotatedPillarBlock) SLBlocks.STRIPPED_SUGAR_LOG.get(),
                new ResourceLocation("sugards:block/stripped_sugar_log"),
                new ResourceLocation("sugards:block/stripped_sugar_log_top"));
        pillarBlockWithItem(SLBlocks.SUGAR_WOOD.get(), sugarlog(), sugarlog());
        pillarBlockWithItem(SLBlocks.STRIPPED_SUGAR_WOOD.get(),
                new ResourceLocation("sugards:block/stripped_sugar_log"),
                new ResourceLocation("sugards:block/stripped_sugar_log"));
        fenceGateBlockWithItem((FenceGateBlock)SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(), sugarplanks());
        fenceGateBlockWithItem((FenceGateBlock)SLBlocks.SUGAR_LOG_FENCE_GATE.get(), sugarlog());
        simpleBlockWithItem(SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get());
        simpleBlockWithItem(SLBlocks.DEEPSLATE_BISMUTH_ORE.get());
    }

    /** ほとんどのブロックはアイテムモデル生成もいけそうなのでここを見に来た人の為にやっておく。
     * 参考になるかわからんが
     * ボタン…は改良の余地あり*/
    /**BlockWithItem*/
    private void simpleBlockWithItem(Block block) {
        ModelFile model = cubeAll(block);
        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }
    private void pillarBlockWithItem(Block block,ResourceLocation side,ResourceLocation end) {
        pillarBlock(block, side, end);
        simpleBlockItem(block,pillar(block, side, end));
    }
    private void fenceBlockWithItem(FenceBlock block,ResourceLocation rl) {
        fenceBlock(block, rl);
        fenceInventory(block,rl);
        simpleBlockItem(block, fenceInventory(block,rl));
    }
    private void fenceGateBlockWithItem(FenceGateBlock block,ResourceLocation rl) {
        fenceGateBlock(block, rl);
        fencegateInventry(block, rl);
        simpleBlockItem(block,fencegateInventry(block, rl));

    }
    private void slabBlockWithItem(SlabBlock block, ResourceLocation doubleslab, ResourceLocation texture) {
        slabBlock(block, doubleslab, texture);
        simpleBlockItem(block, slab(block, texture));
    }
    @SuppressWarnings("unused")
    private void slabDoubleBlockWithItem(SlabBlock block, ResourceLocation doubleslab, ResourceLocation texture,ResourceLocation side,ResourceLocation end) {
        doubleslabBlock(block,side, end);
        slabBlock(block, doubleslab, texture);
        simpleBlockItem(block, slab(block, texture));
    }
    private void stairBlockWithItem(StairBlock block,ResourceLocation rl) {
        stairsBlock(block, rl);
        simpleBlockItem(block, stairs(block, rl));
    }
    private void logBlockWithItem(RotatedPillarBlock block,ResourceLocation side,ResourceLocation end) {
        logBlock(block);
        simpleBlockItem(block, log(block, side, end));
    }
    private void wallBlockWithItem(WallBlock block,ResourceLocation rl) {
        wallBlock(block,rl);
        wallInventory(block,rl);
        simpleBlockItem(block,wallInventory(block,rl));
    }
    private void trapdoorWithItem(TrapDoorBlock block,ResourceLocation rl,boolean orientable) {
        trapdoorBlock(block, rl, orientable);
        if(orientable) {
            simpleBlockItem(block,trapdoorOrientable(block,rl));
        }else{
            simpleBlockItem(block,trapdoor(block,rl));
        }
    }
    private void torchWithItem(Block block,ResourceLocation torch) {
        torchBlock(block, torch);
        simpleBlockItem(block,torch(block, torch));
    }
    private void buttonWithItem(Block block,ResourceLocation button) {
        buttonBlock(block,button);
        buttonInventory(block,button);
        simpleBlockItem(block,buttonInventory(block, button));
    }
    private void pressurePlateWithItem(Block block,ResourceLocation rl) {
        pressurePlateBlock(block, rl, rl);
        simpleBlockItem(block, pressurePlate(block,rl));
    }
    private void paneBlockWithItem(IronBarsBlock block, ResourceLocation pane, ResourceLocation edge) {
        paneBlock(block,pane,edge);
        SimpleItem(block, pane);
    }
    private void doorBlockWithItem(DoorBlock block,ResourceLocation item,ResourceLocation bottom,ResourceLocation top) {
        doorBlock2(block,bottom , top);
        SimpleItem(block,item);
    }

    /**Blocks*/
    private void torchBlock(Block block,ResourceLocation torch) {
        torchBlock(block,torch(block, torch));
    }
    private void pillarBlock(Block block,ResourceLocation side,ResourceLocation end) {
        pillarBlock(block, pillar(block, side, end), pillar(block, side, end));
    }
    private void wallTorchBlock(Block block,ResourceLocation east,ResourceLocation north,ResourceLocation south,ResourceLocation west) {
        wallTorchBlock(block,walltorch(block,north),walltorch(block,south),walltorch(block, east),walltorch(block, west));
    }
    private void buttonBlock(Block block, ResourceLocation button) {
        buttonblock(block,
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
                button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button));
    }
    private void doorBlock2(Block block, ResourceLocation bottom,ResourceLocation top) {
        doorblock(block,
                doorBottomLeft(block,bottom,top), doorBottomLeftOpen(block,bottom,top),
                doorBottomRight(block, bottom, top), doorBottomRightOpen(block, bottom, top),
                doorTopLeft(block, bottom, top), doorTopLeftOpen(block, bottom, top),
                doorTopRight(block, bottom, top), doorTopRightOpen(block, bottom, top),
                doorBottomLeft(block,bottom,top), doorBottomLeftOpen(block,bottom,top),
                doorBottomRight(block, bottom, top), doorBottomRightOpen(block, bottom, top),
                doorTopLeft(block, bottom, top), doorTopLeftOpen(block, bottom, top),
                doorTopRight(block, bottom, top), doorTopRightOpen(block, bottom, top),
                doorBottomLeft(block,bottom,top), doorBottomLeftOpen(block,bottom,top),
                doorBottomRight(block, bottom, top), doorBottomRightOpen(block, bottom, top),
                doorTopLeft(block, bottom, top), doorTopLeftOpen(block, bottom, top),
                doorTopRight(block, bottom, top), doorTopRightOpen(block, bottom, top),
                doorBottomLeft(block,bottom,top), doorBottomLeftOpen(block,bottom,top),
                doorBottomRight(block, bottom, top), doorBottomRightOpen(block, bottom, top),
                doorTopLeft(block, bottom, top), doorTopLeftOpen(block, bottom, top),
                doorTopRight(block, bottom, top), doorTopRightOpen(block, bottom, top));
    }
    private void doubleslabBlock(Block block,ResourceLocation side,ResourceLocation end) {
        doubleslab(block, side, end);
    }
    private void pressurePlateBlock(Block block,ResourceLocation on,ResourceLocation off) {
        pressurePlateBlock(block,pressurePlateDown(block,on) ,pressurePlate(block,off));
    }
    /**model*/
    private void torchBlock(Block block,ModelFile model) {
        torchBlock(block,new ConfiguredModel(model));
    }
    private void pillarBlock(Block block,ModelFile horizontal,ModelFile base) {
        getVariantBuilder(block).partialState()
            .with(RotatedPillarBlock.AXIS, Axis.X).modelForState().modelFile(horizontal).rotationX(90).rotationY(90).addModel().partialState()
            .with(RotatedPillarBlock.AXIS, Axis.Y).modelForState().modelFile(base).addModel().partialState()
            .with(RotatedPillarBlock.AXIS, Axis.Z).modelForState().modelFile(horizontal).rotationX(90).addModel().partialState();
    }
    private void wallTorchBlock(Block block,ModelFile north, ModelFile south,ModelFile east,ModelFile west) {
        getVariantBuilder(block).partialState()
            .with(WallTorchBlock.FACING,Direction.NORTH).modelForState().modelFile(north).rotationY(270).addModel().partialState()
            .with(WallTorchBlock.FACING,Direction.EAST).modelForState().modelFile(east).addModel().partialState()
            .with(WallTorchBlock.FACING,Direction.SOUTH).modelForState().modelFile(south).rotationY(90).addModel().partialState()
            .with(WallTorchBlock.FACING,Direction.WEST).modelForState().modelFile(west).rotationY(180).addModel().partialState();
    }
    private void pressurePlateBlock(Block block,ModelFile on,ModelFile off){
        getVariantBuilder(block).partialState()
            .with(PressurePlateBlock.POWERED, false).modelForState().modelFile(off).addModel().partialState()
            .with(PressurePlateBlock.POWERED, true).modelForState().modelFile(on).addModel().partialState();
    }
    private void doorblock(Block block,
            ModelFile ellf,ModelFile ellt,ModelFile elrf,ModelFile elrt,ModelFile eulf,ModelFile eult,ModelFile eurf,ModelFile eurt,
            ModelFile nllf,ModelFile nllt,ModelFile nlrf,ModelFile nlrt,ModelFile nulf,ModelFile nult,ModelFile nurf,ModelFile nurt,
            ModelFile sllf,ModelFile sllt,ModelFile slrf,ModelFile slrt,ModelFile sulf,ModelFile sult,ModelFile surf,ModelFile surt,
            ModelFile wllf,ModelFile wllt,ModelFile wlrf,ModelFile wlrt,ModelFile wulf,ModelFile wult,ModelFile wurf,ModelFile wurt) {
        getVariantBuilder(block)
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(ellf).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(ellt).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(elrf).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(elrt).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(eulf).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(eult).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(eurf).addModel()
        .partialState().with(DoorBlock.FACING, Direction.EAST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(eurt).rotationY(270).addModel()

        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(nllf).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(nllt).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(nlrf).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(nlrt).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(nulf).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(nult).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(nurf).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.NORTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(nurt).rotationY(180).addModel()

        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(sllf).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(sllt).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(slrf).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(slrt).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(sulf).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(sult).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(surf).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.SOUTH).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(surt).addModel()

        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(wllf).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(wllt).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(wlrf).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.LOWER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(wlrt).rotationY(90).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, false).modelForState().modelFile(wulf).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.LEFT).with(DoorBlock.OPEN, true).modelForState().modelFile(wult).rotationY(270).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, false).modelForState().modelFile(wurf).rotationY(180).addModel()
        .partialState().with(DoorBlock.FACING, Direction.WEST).with(DoorBlock.HALF, DoubleBlockHalf.UPPER).with(DoorBlock.HINGE, DoorHingeSide.RIGHT).with(DoorBlock.OPEN, true).modelForState().modelFile(wurt).rotationY(90).addModel();
    }
    private void buttonblock(Block block,
            ModelFile cef,ModelFile cet,ModelFile cnf,ModelFile cnt,ModelFile csf,ModelFile cst,ModelFile cwf,ModelFile cwt,
            ModelFile fef,ModelFile fet,ModelFile fnf,ModelFile fnt,ModelFile fsf,ModelFile fst,ModelFile fwf,ModelFile fwt,
            ModelFile wef,ModelFile wet,ModelFile wnf,ModelFile wnt,ModelFile wsf,ModelFile wst,ModelFile wwf,ModelFile wwt) {
        getVariantBuilder(block)
        //Line1
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, false).modelForState().modelFile(cef).rotationY(270).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, true).modelForState().modelFile(cet).rotationY(270).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(cnf).rotationY(180).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(cnt).rotationY(180).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(csf).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(cst).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, false).modelForState().modelFile(cwf).rotationY(90).rotationX(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.CEILING).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, true).modelForState().modelFile(cwt).rotationY(90).rotationX(180).addModel()
        //Line2
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, false).modelForState().modelFile(fef).rotationY(90).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, true).modelForState().modelFile(fet).rotationY(90).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(fnf).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(fnt).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(fsf).rotationY(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(fst).rotationY(180).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, false).modelForState().modelFile(fwf).rotationY(270).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.FLOOR).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, true).modelForState().modelFile(fwt).rotationY(270).addModel()
            //Line3
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, false).modelForState().modelFile(wef).rotationY(90).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.EAST).with(ButtonBlock.POWERED, true).modelForState().modelFile(wet).rotationY(90).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(wnf).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.NORTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(wnt).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, false).modelForState().modelFile(wsf).rotationY(180).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.SOUTH).with(ButtonBlock.POWERED, true).modelForState().modelFile(wst).rotationY(180).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, false).modelForState().modelFile(wwf).rotationY(270).rotationX(90).uvLock(true).addModel()
        .partialState().with(ButtonBlock.FACE, AttachFace.WALL).with(ButtonBlock.FACING, Direction.WEST).with(ButtonBlock.POWERED, true).modelForState().modelFile(wwt).rotationY(270).rotationX(90).uvLock(true).addModel();
    }
    private void SimpleItem(Block block,ResourceLocation texture) {
        ResourceLocation name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block));
        itemModels().singleTexture(name.getPath(), mcLoc("minecraft:item/generated"), "layer0", texture);
    }
    /**wakarann*/
    private void torchBlock(Block block, ConfiguredModel... models) {
        this.getVariantBuilder(block).partialState().setModels(models);
    }
    @SuppressWarnings("unused")
    private void buttonblock(Block block, ConfiguredModel... models) {
        this.getVariantBuilder(block).partialState().setModels(models);
    }

    /**ModelFile*/
    private ModelFile fenceInventory(Block block,ResourceLocation base) {
        return models().fenceInventory(baseName(block)+"_inventory",base);
    }
    private ModelFile fencegateInventry(Block block,ResourceLocation base) {
        return models().fenceGate(baseName(block), base);
    }
    private ModelFile slab(Block block,ResourceLocation rl) {
        return models().slab(baseName(block), rl, rl, rl);
    }
    private ModelFile pillar(Block block,ResourceLocation side,ResourceLocation end) {
        return models().cubeColumn(baseName(block), side, end);
    }
    private ModelFile doubleslab(Block block,ResourceLocation side,ResourceLocation end) {
        return models().cubeColumn(baseName(block)+"_double", side, end);
    }
    private ModelFile stairs(Block block,ResourceLocation rl) {
        return models().stairs(baseName(block), rl, rl, rl);
    }
    private ModelFile log(Block block,ResourceLocation side,ResourceLocation end) {
        return models().cubeColumn(baseName(block), side, end);
    }
    private ModelFile wallInventory(Block block,ResourceLocation base) {
        return models().wallInventory(baseName(block)+"_inventory", base);
    }
    //オーク、ダークオークのトラップドアあたり
    private ModelFile trapdoor(Block block,ResourceLocation rl) {
        return models().trapdoorBottom(baseName(block)+"_bottom", rl);
    }
    //アカシア、歪んだトラップドアあたり
    private ModelFile trapdoorOrientable(Block block,ResourceLocation rl) {
        return models().trapdoorOrientableBottom(baseName(block)+"_bottom", rl);
    }
    private ModelFile torch(Block block,ResourceLocation torch) {
        return models().torch(baseName(block), torch);
    }
    private ModelFile walltorch(Block block,ResourceLocation torch) {
        return models().torchWall(baseName(block), torch);
    }
    private ModelFile button(Block block,ResourceLocation button) {
        return models().withExistingParent(baseName(block), "button").texture("texture", button);
    }
    private ModelFile buttonPressed(Block block,ResourceLocation button) {
        return models().withExistingParent(baseName(block)+"_pressed", "button_pressed").texture("texture", button);
    }
    private ModelFile buttonInventory(Block block,ResourceLocation button) {
        return models().withExistingParent(baseName(block)+"_inventory", "button_inventory").texture("texture", button);
    }
    private ModelFile pressurePlate(Block block,ResourceLocation rl) {
        return models().withExistingParent(baseName(block), "pressure_plate_up").texture("texture", rl);
    }
    private ModelFile pressurePlateDown(Block block,ResourceLocation rl) {
        return models().withExistingParent(baseName(block)+"_down", "pressure_plate_down").texture("texture", rl);
    }
    private ModelFile doorBottomLeft(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_bottom_left", "door_bottom_left").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorBottomLeftOpen(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_bottom_left_open", "door_bottom_left_open").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorBottomRight(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_bottom_right", "door_bottom_right").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorBottomRightOpen(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_bottom_right_open", "door_bottom_right_open").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorTopLeft(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_top_left", "door_top_left").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorTopLeftOpen(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_top_left_open", "door_top_left_open").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorTopRight(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_top_right", "door_top_right").texture("bottom", bottom).texture("top", top);
    }
    private ModelFile doorTopRightOpen(Block block,ResourceLocation bottom,ResourceLocation top) {
        return models().withExistingParent(baseName(block)+"_top_right_open", "door_top_right_open").texture("bottom", bottom).texture("top", top);
    }


    //いちいち一回入力するのが面倒なので作業省略
    private ResourceLocation sugarplanks() {
        return new ResourceLocation("sugards:block/sugar_planks");
    }
    private ResourceLocation sugarstone() {
        return new ResourceLocation("sugards:block/sugar_stone");
    }
    private ResourceLocation sugarcobble() {
        return new ResourceLocation("sugards:block/sugar_cobblestone");
    }
    private ResourceLocation sugarlog() {
        return new ResourceLocation("sugards:block/sugar_log");
    }
    private ResourceLocation sugartorch() {
        return new ResourceLocation("sugards:block/sugar_torch");
    }
    private String baseName(Block block) {
        //String name = ForgeRegistries.BLOCKS.getKey(block).toString();
        //SugarLandsCore.LOGGER.info(name);
        //ResourceKey<Block> tako = SLBlocks.SUGAR_BLOCK.getKey();
        //ResourceLocation ika = SLBlocks.SUGAR_BLOCK.getId();
        return ForgeRegistries.BLOCKS.getKey(block).toString();
    }
}
