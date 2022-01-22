package jp.soramame.sugarlands.provider;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;
import net.minecraft.util.Direction.Axis;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlockStateProvider extends BlockStateProvider {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

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
		//axisBlock((RotatedPillarBlock) SLBlocks.Sugar_Pillar.get());
		//上記のコードは何故かは良く分からないがmodels.blockのpillarの方のsideとendが入れ替わる
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
		stairBlockWithItem((StairsBlock) SLBlocks.SUGAR_PLANKS_STAIRS.get(), sugarplanks());
		stairBlockWithItem((StairsBlock) SLBlocks.SUGAR_STONE_STAIRS.get(), sugarstone());
		stairBlockWithItem((StairsBlock) SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), sugarcobble());
		stairBlockWithItem((StairsBlock) SLBlocks.SUGAR_LOG_STAIRS.get(), sugarlog());
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
		paneBlockWithItem((PaneBlock) SLBlocks.SUGAR_CANDY_PANE.get(),
				new ResourceLocation("sugards:block/sugar_candy"),
				new ResourceLocation("sugards:block/sugar_candy"));
		trapdoorWithItem((TrapDoorBlock) SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(),
				new ResourceLocation("sugards:block/sugar_trapdoor"), false);
		doorBlockWithItem((DoorBlock) SLBlocks.SUGAR_DOOR.get(),
				new ResourceLocation("sugards:block/sugar_door_lower"),
				new ResourceLocation("sugards:block/sugar_door_upper"),
				new ResourceLocation("sugards:item/sugar_door"));
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
		/** ほとんどのブロックはアイテムモデル生成もいけそうなのでここを見に来た人の為にやっておく。
		 * 参考になるかわからんが
		 * ボタン…は改良の余地あり*/
	}

	/**BlockWithItem*/
	private void simpleBlockWithItem(Block block) {
		ModelFile model = cubeAll(block);
		simpleBlock(block, model);
		simpleBlockItem(block, model);
	}
	public void pillarBlockWithItem(Block block,ResourceLocation side,ResourceLocation end) {
		pillarBlock(block, side, end);
		simpleBlockItem(block,pillar(block, side, end));
	}
	public void fenceBlockWithItem(FenceBlock block,ResourceLocation rl) {
		fenceBlock(block, rl);
		fenceInventory(block,rl);
		simpleBlockItem(block, fenceInventory(block,rl));
	}
	public void fenceGateBlockWithItem(FenceGateBlock block,ResourceLocation rl) {
		fenceGateBlock(block, rl);
		fencegateInventry(block, rl);
		simpleBlockItem(block,fencegateInventry(block, rl));

	}
	public void slabBlockWithItem(SlabBlock block, ResourceLocation doubleslab, ResourceLocation texture) {
		slabBlock(block, doubleslab, texture);
		simpleBlockItem(block, slab(block, texture));
	}
	public void slabDoubleBlockWithItem(SlabBlock block, ResourceLocation doubleslab, ResourceLocation texture,ResourceLocation side,ResourceLocation end) {
		doubleslabBlock(block,side, end);
		slabBlock(block, doubleslab, texture);
		simpleBlockItem(block, slab(block, texture));
	}
	public void stairBlockWithItem(StairsBlock block,ResourceLocation rl) {
		stairsBlock(block, rl);
		simpleBlockItem(block, stairs(block, rl));
	}
	public void logBlockWithItem(RotatedPillarBlock block,ResourceLocation side,ResourceLocation end) {
		logBlock(block);
		simpleBlockItem(block, log(block, side, end));
	}
	public void wallBlockWithItem(WallBlock block,ResourceLocation rl) {
		wallBlock(block,rl);
		wallInventory(block,rl);
		simpleBlockItem(block,wallInventory(block,rl));
	}
	public void trapdoorWithItem(TrapDoorBlock block,ResourceLocation rl,boolean orientable) {
		trapdoorBlock(block, rl, orientable);
		if(orientable == false) {
			simpleBlockItem(block,trapdoor(block,rl));
		}else{
			simpleBlockItem(block,trapdoorOrientable(block,rl));
		}
	}
	public void torchWithItem(Block block,ResourceLocation torch) {
		torchBlock(block, torch);
		simpleBlockItem(block,torch(block, torch));
	}
	public void buttonWithItem(Block block,ResourceLocation button) {
		buttonBlock(block,button);
		buttonInventory(block,button);
		simpleBlockItem(block,buttonInventory(block, button));
	}
	public void pressurePlateWithItem(Block block,ResourceLocation rl) {
		pressurePlateBlock(block, rl, rl);
		simpleBlockItem(block, pressurePlate(block,rl));
	}
	public void paneBlockWithItem(PaneBlock block, ResourceLocation pane, ResourceLocation edge) {
		paneBlock(block,pane,edge);
		SimpleItem(block, pane);
	}
	public void doorBlockWithItem(DoorBlock block,ResourceLocation bottom, ResourceLocation top,ResourceLocation item) {
		doorBlock(block,bottom,top);
		SimpleItem(block,item);
	}

	/**Blocks*/
	public void torchBlock(Block block,ResourceLocation torch) {
		torchBlock(block,torch(block, torch));
	}
	public void pillarBlock(Block block,ResourceLocation side,ResourceLocation end) {
		pillarBlock(block, pillar(block, side, end), pillar(block, side, end));
	}
	public void wallTorchBlock(Block block,ResourceLocation east,ResourceLocation north,ResourceLocation south,ResourceLocation west) {
		wallTorchBlock(block,walltorch(block,north),walltorch(block,south),walltorch(block, east),walltorch(block, west));
	}
	public void buttonBlock(Block block, ResourceLocation button) {
		buttonblock(block,
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button),
				button(block,button),buttonPressed(block,button),button(block,button),buttonPressed(block,button));
	}
	public void doubleslabBlock(Block block,ResourceLocation side,ResourceLocation end) {
		doubleslab(block, side, end);
	}
	public void pressurePlateBlock(Block block,ResourceLocation on,ResourceLocation off) {
		pressurePlateBlock(block,pressurePlateDown(block,on) ,pressurePlate(block,off));
	}
	/**model*/
	public void torchBlock(Block block,ModelFile model) {
		torchBlock(block,new ConfiguredModel(model));
	}
	public void pillarBlock(Block block,ModelFile horizontal,ModelFile base) {
		getVariantBuilder(block).partialState()
			.with(RotatedPillarBlock.AXIS, Axis.X).modelForState().modelFile(horizontal).rotationX(90).rotationY(90).addModel().partialState()
			.with(RotatedPillarBlock.AXIS, Axis.Y).modelForState().modelFile(base).addModel().partialState()
			.with(RotatedPillarBlock.AXIS, Axis.Z).modelForState().modelFile(horizontal).rotationX(90).addModel().partialState();
	}
	public void wallTorchBlock(Block block,ModelFile north, ModelFile south,ModelFile east,ModelFile west) {
		getVariantBuilder(block).partialState()
			.with(WallTorchBlock.FACING,Direction.NORTH).modelForState().modelFile(north).rotationY(270).addModel().partialState()
			.with(WallTorchBlock.FACING,Direction.EAST).modelForState().modelFile(east).addModel().partialState()
			.with(WallTorchBlock.FACING,Direction.SOUTH).modelForState().modelFile(south).rotationY(90).addModel().partialState()
			.with(WallTorchBlock.FACING,Direction.WEST).modelForState().modelFile(west).rotationY(180).addModel().partialState();
	}
	public void pressurePlateBlock(Block block,ModelFile on,ModelFile off){
		getVariantBuilder(block).partialState()
			.with(PressurePlateBlock.POWERED, false).modelForState().modelFile(off).addModel().partialState()
			.with(PressurePlateBlock.POWERED, true).modelForState().modelFile(on).addModel().partialState();
	}
	public void buttonblock(Block block,
			ModelFile cef,ModelFile cet,ModelFile cnf,ModelFile cnt,ModelFile csf,ModelFile cst,ModelFile cwf,ModelFile cwt,
			ModelFile fef,ModelFile fet,ModelFile fnf,ModelFile fnt,ModelFile fsf,ModelFile fst,ModelFile fwf,ModelFile fwt,
			ModelFile wef,ModelFile wet,ModelFile wnf,ModelFile wnt,ModelFile wsf,ModelFile wst,ModelFile wwf,ModelFile wwt) {
		getVariantBuilder(block).partialState()
			//Line1
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(cef).rotationY(270).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(cet).rotationY(270).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(cnf).rotationY(180).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(cnt).rotationY(180).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(csf).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(cst).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(cwf).rotationY(90).rotationX(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.CEILING)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(cwt).rotationY(90).rotationX(180).addModel().partialState()
			//Line2
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(fef).rotationY(90).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(fet).rotationY(90).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(fnf).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(fnt).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(fsf).rotationY(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(fst).rotationY(180).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(fwf).rotationY(270).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.FLOOR)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(fwt).rotationY(270).addModel().partialState()
			//Line3
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(wef).rotationY(90).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.EAST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(wet).rotationY(90).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(wnf).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.NORTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(wnt).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(wsf).rotationY(180).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.SOUTH)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(wst).rotationY(180).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, false).modelForState()
			.modelFile(wwf).rotationY(270).rotationX(90).uvLock(true).addModel().partialState()
			.with(AbstractButtonBlock.FACE, AttachFace.WALL)
			.with(AbstractButtonBlock.FACING, Direction.WEST)
			.with(AbstractButtonBlock.POWERED, true).modelForState()
			.modelFile(wwt).rotationY(270).rotationX(90).uvLock(true).addModel().partialState();
	}
	public void SimpleItem(Block block,ResourceLocation texture) {
		ResourceLocation name = Objects.requireNonNull(block.getRegistryName());
		itemModels().singleTexture(name.getPath(), mcLoc("minecraft:item/generated"), "layer0", texture);
	}
	/**wakarann*/
	public void torchBlock(Block block, ConfiguredModel... models) {
		this.getVariantBuilder(block).partialState().setModels(models);
	}
	public void buttonblock(Block block, ConfiguredModel... models) {
		this.getVariantBuilder(block).partialState().setModels(models);
	}

	/**ModelFile*/
	public ModelFile fenceInventory(Block block,ResourceLocation base) {
		return models().fenceInventory(baseName(block)+"_inventory",base);
	}
	public ModelFile fencegateInventry(Block block,ResourceLocation base) {
		return models().fenceGate(baseName(block), base);
	}
	public ModelFile slab(Block block,ResourceLocation rl) {
		return models().slab(baseName(block), rl, rl, rl);
	}
	public ModelFile pillar(Block block,ResourceLocation side,ResourceLocation end) {
		return models().cubeColumn(baseName(block), side, end);
	}
	public ModelFile doubleslab(Block block,ResourceLocation side,ResourceLocation end) {
		return models().cubeColumn(baseName(block)+"_double", side, end);
	}
	public ModelFile stairs(Block block,ResourceLocation rl) {
		return models().stairs(baseName(block), rl, rl, rl);
	}
	public ModelFile log(Block block,ResourceLocation side,ResourceLocation end) {
		return models().cubeColumn(baseName(block), side, end);
	}
	public ModelFile wallInventory(Block block,ResourceLocation base) {
		return models().wallInventory(baseName(block)+"_inventory", base);
	}
	//オーク、ダークオークのトラップドアあたり
	public ModelFile trapdoor(Block block,ResourceLocation rl) {
		return models().trapdoorBottom(baseName(block)+"_bottom", rl);
	}
	//アカシア、歪んだトラップドアあたり
	public ModelFile trapdoorOrientable(Block block,ResourceLocation rl) {
		return models().trapdoorOrientableBottom(baseName(block)+"_bottom", rl);
	}
	public ModelFile torch(Block block,ResourceLocation torch) {
		return models().torch(baseName(block), torch);
	}
	public ModelFile walltorch(Block block,ResourceLocation torch) {
		return models().torchWall(baseName(block), torch);
	}
	public ModelFile button(Block block,ResourceLocation button) {
		return models().withExistingParent(baseName(block), "button").texture("texture", button);
	}
	public ModelFile buttonPressed(Block block,ResourceLocation button) {
		return models().withExistingParent(baseName(block)+"_pressed", "button_pressed").texture("texture", button);
	}
	public ModelFile buttonInventory(Block block,ResourceLocation button) {
		return models().withExistingParent(baseName(block)+"_inventory", "button_inventory").texture("texture", button);
	}
	public ModelFile pressurePlate(Block block,ResourceLocation rl) {
		return models().withExistingParent(baseName(block), "pressure_plate_up").texture("texture", rl);
	}
	public ModelFile pressurePlateDown(Block block,ResourceLocation rl) {
		return models().withExistingParent(baseName(block)+"_down", "pressure_plate_down").texture("texture", rl);
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
		return block.getRegistryName().toString();
	}
}
