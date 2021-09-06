package jp.soramame.sugarlands.provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.soramame.sugarlands.init.SLBlocks;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
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
		simpleBlockWithItem(SLBlocks.Sugar_Block.get());
		simpleBlockWithItem(SLBlocks.Sugar_Stone.get());
		simpleBlockWithItem(SLBlocks.Sugar_Candy.get());
		simpleBlockWithItem(SLBlocks.Sugar_Diamond_Ore.get());
		simpleBlockWithItem(SLBlocks.Sugar_Diamond_Block.get());
		simpleBlockWithItem(SLBlocks.Sugar_CobbleStone.get());
		simpleBlockWithItem(SLBlocks.Sugar_Bricks.get());
		simpleBlockWithItem(SLBlocks.Moist_Sugar_Block.get());
		simpleBlockWithItem(SLBlocks.Raw_Sugar_Block.get());
		simpleBlockWithItem(SLBlocks.Lit_Raw_Sugar_Block.get());
		simpleBlockWithItem(SLBlocks.Sugarrack.get());
		simpleBlockWithItem(SLBlocks.End_Sugar_Stone.get());
		simpleBlockWithItem(SLBlocks.Bismuth_Ore.get());
		simpleBlockWithItem(SLBlocks.Bismuth_Crystal_Block.get());
		simpleBlockWithItem(SLBlocks.Pudding_Block.get());
		simpleBlockWithItem(SLBlocks.Calamel_Sauce.get());
		simpleBlockWithItem(SLBlocks.Cookie_Block.get());
		//axisBlock((RotatedPillarBlock) SLBlocks.Sugar_Pillar.get());
		//上記のコードは何故かは良く分からないがmodels.blockのpillarの方のsideとendが入れ替わる
		simpleBlockWithItem(SLBlocks.Rotten_Flesh_Block.get());
		simpleBlockWithItem(SLBlocks.Black_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Blue_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Brown_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Cyan_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Gray_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Green_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Light_Blue_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Light_Gray_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Lime_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Magenta_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Orange_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Pink_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Purple_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Red_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.White_Ice_Candy.get());
		simpleBlockWithItem(SLBlocks.Yellow_Ice_Candy.get());
		logBlockWithItem((RotatedPillarBlock) SLBlocks.Sugar_Log.get(),sugarlog(),
				new ResourceLocation("sugards:block/sugar_log_top"));
		simpleBlockWithItem(SLBlocks.Sugar_Leaves.get());
		simpleBlockWithItem(SLBlocks.Sugar_Planks.get());
		stairBlockWithItem((StairsBlock) SLBlocks.Sugar_Planks_Stairs.get(), sugarplanks());
		stairBlockWithItem((StairsBlock) SLBlocks.Sugar_Stone_Stairs.get(), sugarstone());
		stairBlockWithItem((StairsBlock) SLBlocks.Sugar_Cobblestone_Stairs.get(), sugarcobble());
		stairBlockWithItem((StairsBlock) SLBlocks.Sugar_Log_Stairs.get(), sugarlog());
		slabBlockWithItem((SlabBlock) SLBlocks.Sugar_Planks_Slab.get(), sugarplanks(), sugarplanks());
		slabBlockWithItem((SlabBlock) SLBlocks.Sugar_Stone_Slab.get(), sugarstone(), sugarstone());
		doubleslabBlock(SLBlocks.Sugar_Cobblestone_Slab.get(),
				new ResourceLocation("sugards:block/sugar_cobblestone_slab_double"),sugarcobble());
		slabBlockWithItem((SlabBlock) SLBlocks.Sugar_Cobblestone_Slab.get(),
				new ResourceLocation("sugards:block/sugar_cobblestone_slab_double"),sugarcobble());
		slabBlockWithItem((SlabBlock) SLBlocks.Sugar_Log_Slab.get(), sugarlog(), sugarlog());
		fenceBlockWithItem((FenceBlock) SLBlocks.Sugar_Log_Fence.get(), sugarlog());
		fenceBlockWithItem((FenceBlock) SLBlocks.Sugar_Log_Fence.get(),sugarlog());
		fenceBlockWithItem((FenceBlock) SLBlocks.Sugar_Planks_Fence.get(),sugarplanks());
		wallBlockWithItem((WallBlock) SLBlocks.Sugar_Stone_Wall.get(), sugarstone());
		wallBlockWithItem((WallBlock) SLBlocks.Sugar_Cobblestone_Wall.get(), sugarcobble());
		wallBlockWithItem((WallBlock) SLBlocks.Sugar_Bricks_Wall.get(),
				new ResourceLocation("sugards:block/sugar_bricks"));
		//下記に注釈あり
		paneBlock((PaneBlock) SLBlocks.Sugar_Candy_Pane.get(),
				new ResourceLocation("sugards:block/sugar_candy"),
				new ResourceLocation("sugards:block/sugar_candy"));
		trapdoorWithItem((TrapDoorBlock) SLBlocks.Sugar_Planks_TrapDoor.get(),
				new ResourceLocation("sugards:block/sugar_trapdoor"), false);
		doorBlock((DoorBlock) SLBlocks.Sugar_Door.get(),
				new ResourceLocation("sugards:block/sugar_door_lower"),
				new ResourceLocation("sugards:block/sugar_door_upper"));
		torchWithItem(SLBlocks.Sugar_Torch.get(), sugartorch());
		wallTorchBlock(SLBlocks.Wall_Sugar_Torch.get(),sugartorch(), sugartorch(), sugartorch(), sugartorch());
		buttonWithItem(SLBlocks.Sugar_Planks_Button.get(),sugarplanks());
		buttonWithItem(SLBlocks.Sugar_Stone_Button.get(),sugarstone());
		pressurePlateWithItem(SLBlocks.Sugar_planks_Pressure_Plate.get(),sugarplanks());
		pressurePlateWithItem(SLBlocks.Sugar_stone_Pressure_Plate.get(),sugarstone());
		logBlockWithItem((RotatedPillarBlock) SLBlocks.Stripped_Sugar_Log.get(),
				new ResourceLocation("sugards:block/stripped_sugar_log"),
				new ResourceLocation("sugards:block/stripped_sugar_log_top"));
		pillarBlockWithItem(SLBlocks.Sugar_Wood.get(), sugarlog(), sugarlog());
		pillarBlockWithItem(SLBlocks.Stripped_Sugar_Wood.get(),
				new ResourceLocation("sugards:block/stripped_sugar_log"),
				new ResourceLocation("sugards:block/stripped_sugar_log"));
		/**paneBlock,doorBlockの場合はアイテムモデルが生成されないので作成を忘れないように
		 * 自分はSLItemModelProvider.javaで別途アイテムモデルを生成する方法を取った
		 * 他のブロックはアイテムモデル生成もいけそうなのでここを見に来た人の為にやっておく。参考になるかわからんが
		 * ボタン…*/
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
		}else {
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
	public ResourceLocation sugarplanks() {
		return new ResourceLocation("sugards:block/sugar_planks");
	}
	public ResourceLocation sugarstone() {
		return new ResourceLocation("sugards:block/sugar_stone");
	}
	public ResourceLocation sugarcobble() {
		return new ResourceLocation("sugards:block/sugar_cobblestone");
	}
	public ResourceLocation sugarlog() {
		return new ResourceLocation("sugards:block/sugar_log");
	}
	public ResourceLocation sugartorch() {
		return new ResourceLocation("sugards:block/sugar_torch");
	}
	public String baseName(Block block) {
		return block.getRegistryName().toString();
	}
}
