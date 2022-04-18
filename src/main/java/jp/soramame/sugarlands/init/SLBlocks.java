package jp.soramame.sugarlands.init;

import java.util.Collection;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.block.Candy_Block;
import jp.soramame.sugarlands.block.Raw_Sugar_Block;
import jp.soramame.sugarlands.block.SLLogs;
import jp.soramame.sugarlands.block.Sugar_Block;
import jp.soramame.sugarlands.block.Sugar_Ore_Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.item.DyeColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SLBlocks {
	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, SugarLandsCore.MOD_ID);

	//都合により順番入れ替え
	public static final RegistryObject<Block> MOIST_SUGAR_BLOCK =
			BLOCKS.register("moist_sugar_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F, 100.0F)
					.harvestLevel(-1)
					.harvestTool(ToolType.PICKAXE)
					));
	//都合に(ry
	public static final RegistryObject<Block> LIT_RAW_SUGAR_BLOCK =
			BLOCKS.register("lit_raw_sugar_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F, 100.0F)
					.harvestLevel(-1)
					.harvestTool(ToolType.PICKAXE)
					.lightLevel(lightlevel->15)
					));
	public static final RegistryObject<Block> SUGAR_BLOCK =
			BLOCKS.register("sugar_block",() -> new Sugar_Block(MOIST_SUGAR_BLOCK.get(),AbstractBlock.Properties.of(Material.SAND,DyeColor.WHITE)
					.strength(0.5F,0.5F)//硬さ,耐爆
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> SUGAR_STONE =
			BLOCKS.register("sugar_stone",()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> SUGAR_CANDY =
			BLOCKS.register("sugar_candy", ()-> new Candy_Block(AbstractBlock.Properties.of(Material.GLASS)
					.strength(0.6F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					.isViewBlocking(SLBlocks::never)
					));
	public static final RegistryObject<Block> SUGAR_DIAMOND_ORE =
			BLOCKS.register("sugar_diamond_ore", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.GLASS)
					.strength(0.6F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					.requiresCorrectToolForDrops()
					));
	public static final RegistryObject<Block> SUGAR_DIAMOND_BLOCK =
			BLOCKS.register("sugar_diamond_block", ()-> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(0.6F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					));
	public static final RegistryObject<Block> SUGAR_COBBLESTONE =
			BLOCKS.register("sugar_cobblestone", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> SUGAR_BRICKS =
			BLOCKS.register("sugar_bricks", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> RAW_SUGAR_BLOCK =
			BLOCKS.register("raw_sugar_block", ()-> new Raw_Sugar_Block(LIT_RAW_SUGAR_BLOCK.get(),AbstractBlock.Properties.of(Material.SAND)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> SUGARRACK =
			BLOCKS.register("sugarrack", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.NETHERRACK)
					));
	public static final RegistryObject<Block> END_SUGAR_STONE =
			BLOCKS.register("end_sugar_stone", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					));
	public static final RegistryObject<Block> BISMUTH_ORE =
			BLOCKS.register("bismuth_ore", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F,10.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> BISMUTH_CRYSTAL_BLOCK =
			BLOCKS.register("bismuth_crystal_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F,10.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.lightLevel(bismuthflash -> 15)
					));
	public static final RegistryObject<Block> PUDDING_BLOCK =
			BLOCKS.register("pudding_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SNOW)
					));
	public static final RegistryObject<Block> CALAMEL_SAUCE =
			BLOCKS.register("caramel_sauce", ()-> new Candy_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.2F)
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SLIME_BLOCK)
					.noOcclusion()
					.isViewBlocking(SLBlocks::never)
					));
	public static final RegistryObject<Block> COOKIE_BLOCK =
			BLOCKS.register("cookie_block", ()->new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> SUGAR_PILLAR =
			BLOCKS.register("sugar_pillar", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.2F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> ROTTEN_FLESH_BLOCK =
			BLOCKS.register("rotten_flesh_block", ()-> new Block(AbstractBlock.Properties.of(Material.DIRT)
					.strength(0.1F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.SLIME_BLOCK)
					.lightLevel(dirtylight-> 3)
					));
	public static final RegistryObject<Block> BLACK_ICE_CANDY =
			BLOCKS.register("black_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BLACK)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> BLUE_ICE_CANDY =
			BLOCKS.register("blue_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BLUE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> BROWN_ICE_CANDY =
			BLOCKS.register("brown_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BROWN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> CYAN_ICE_CANDY =
			BLOCKS.register("cyan_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.CYAN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> GRAY_ICE_CANDY =
			BLOCKS.register("gray_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.GRAY)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> GREEN_ICE_CANDY =
			BLOCKS.register("green_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.GREEN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> LIGHT_BLUE_ICE_CANDY =
			BLOCKS.register("light_blue_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIGHT_BLUE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> LIGHT_GRAY_ICE_CANDY =
			BLOCKS.register("light_gray_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIGHT_GRAY)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> LIME_ICE_CANDY =
			BLOCKS.register("lime_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIME)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> MAGENTA_ICE_CANDY =
			BLOCKS.register("magenta_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.MAGENTA)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> ORANGE_ICE_CANDY =
			BLOCKS.register("orange_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.ORANGE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> PINK_ICE_CANDY =
			BLOCKS.register("pink_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.PINK)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> PURPLE_ICE_CANDY =
			BLOCKS.register("purple_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.PURPLE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> RED_ICE_CANDY =
			BLOCKS.register("red_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.RED)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> WHITE_ICE_CANDY =
			BLOCKS.register("white_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.WHITE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));
	public static final RegistryObject<Block> YELLOW_ICE_CANDY =
			BLOCKS.register("yellow_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.YELLOW)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel(icelight -> 3)
					));

	private static MaterialColor top;
	private static MaterialColor side;
	public static final RegistryObject<Block> SUGAR_LOG =
			BLOCKS.register("sugar_log", ()-> new SLLogs(AbstractBlock.Properties.of(Material.WOOD,
					XZorY -> XZorY.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side)
					.strength(2.0F).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE), MaterialColor.QUARTZ, MaterialColor.QUARTZ));
	public static final RegistryObject<Block> SUGAR_LEAVES =
			BLOCKS.register("sugar_leaves", ()-> leaves());
	public static final RegistryObject<Block> SUGAR_SAPLING =
			BLOCKS.register("sugar_sapling", ()-> new SaplingBlock(new Sugar_Tree(), AbstractBlock.Properties.of(Material.PLANT)
					.noCollission()
					.randomTicks()
					.instabreak()
					.sound(SoundType.GRASS)
					));
	public static final RegistryObject<Block> SUGAR_PLANKS =
			BLOCKS.register("sugar_planks", ()-> new Block(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> SUGAR_PLANKS_STAIRS =
			BLOCKS.register("sugar_planks_stairs", ()-> new StairsBlock(SUGAR_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(SUGAR_PLANKS.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> SUGAR_STONE_STAIRS =
			BLOCKS.register("sugar_stone_stairs", ()-> new StairsBlock(SUGAR_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(SUGAR_STONE.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> SUGAR_COBBLESTONE_STAIRS =
			BLOCKS.register("sugar_cobblestone_stairs", ()-> new StairsBlock(SUGAR_COBBLESTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(SUGAR_COBBLESTONE.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> SUGAR_LOG_STAIRS =
			BLOCKS.register("sugar_log_stairs", ()-> new StairsBlock(SUGAR_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(SUGAR_PLANKS.get())));
	public static final RegistryObject<Block> SUGAR_PLANKS_SLAB =
			BLOCKS.register("sugar_planks_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> SUGAR_STONE_SLAB =
			BLOCKS.register("sugar_stone_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> SUGAR_COBBLESTONE_SLAB =
			BLOCKS.register("sugar_cobblestone_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> SUGAR_LOG_SLAB =
			BLOCKS.register("sugar_log_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> SUGAR_LOG_FENCE =
			BLOCKS.register("sugar_log_fence", ()-> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> SUGAR_PLANKS_FENCE =
			BLOCKS.register("sugar_planks_fence", ()-> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> SUGAR_STONE_WALL =
			BLOCKS.register("sugar_stone_wall",()-> new WallBlock(AbstractBlock.Properties.copy(SUGAR_STONE.get())));
	public static final RegistryObject<Block> SUGAR_COBBLESTONE_WALL =
			BLOCKS.register("sugar_cobblestone_wall",()-> new WallBlock(AbstractBlock.Properties.copy(SUGAR_COBBLESTONE.get())));
	public static final RegistryObject<Block> SUGAR_BRICKS_WALL =
			BLOCKS.register("sugar_bricks_wall",()-> new WallBlock(AbstractBlock.Properties.copy(SUGAR_BRICKS.get())));
	public static final RegistryObject<Block> SUGAR_CANDY_PANE =
			BLOCKS.register("sugar_candy_pane", ()-> new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Properties.of(Material.GLASS)
					.strength(0.6F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					.isValidSpawn(SLBlocks::never)
					.isViewBlocking(SLBlocks::never)
					.isRedstoneConductor(SLBlocks::never)
					.isSuffocating(SLBlocks::never)
					));
	public static final RegistryObject<Block> SUGAR_PLANKS_TRAPDOOR =
			BLOCKS.register("sugar_planks_trapdoor", ()-> new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					.isValidSpawn(SLBlocks::never)
					));
	public static final RegistryObject<Block> SUGAR_DOOR =
			BLOCKS.register("sugar_door", ()-> new DoorBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> SUGAR_TORCH =
			BLOCKS.register("sugar_torch", ()-> new TorchBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.noCollission()
					.instabreak()
					.lightLevel(sugar-> 10)
					.sound(SoundType.WOOD)
					,ParticleTypes.END_ROD));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> WALL_SUGAR_TORCH =
			BLOCKS.register("wall_sugar_torch", ()-> new WallTorchBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.noCollission()
					.instabreak()
					.lightLevel(sugar-> 10)
					.sound(SoundType.WOOD)
					.dropsLike(SUGAR_TORCH.get())
					,ParticleTypes.END_ROD));
	public static final RegistryObject<Block> SUGAR_PLANKS_BUTTON =
			BLOCKS.register("sugar_planks_button", ()-> new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noCollission()
					));
	public static final RegistryObject<Block> SUGAR_STONE_BUTTON =
			BLOCKS.register("sugar_stone_button",()-> new StoneButtonBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.noCollission()
					));
	public static final RegistryObject<Block> SUGAR_PLANKS_PRESSURE_PLATE =
			BLOCKS.register("sugar_planks_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD)
					.noCollission()
					.strength(0.5F)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> SUGAR_STONE_PRESSURE_PLATE =
			BLOCKS.register("sugar_stone_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.of(Material.STONE)
					.noCollission()
					.strength(0.5F)
					));
	public static final RegistryObject<Block> STRIPPED_SUGAR_LOG =
			BLOCKS.register("stripped_sugar_log", ()-> log(MaterialColor.QUARTZ, MaterialColor.QUARTZ));
	public static final RegistryObject<Block> SUGAR_WOOD =
			BLOCKS.register("sugar_wood", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(2.0F)
					.sound(SoundType.WOOD)
					.harvestLevel(0)
					.harvestTool(ToolType.AXE)
					));
	public static final RegistryObject<Block> STRIPPED_SUGAR_WOOD =
			BLOCKS.register("stripped_sugar_wood", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(2.0F)
					.sound(SoundType.WOOD)
					.harvestLevel(0)
					.harvestTool(ToolType.AXE)
					));
	public static final RegistryObject<Block> SUGAR_PLANKS_FENCE_GATE =
			BLOCKS.register("sugar_planks_fence_gate", ()-> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> SUGAR_LOG_FENCE_GATE =
			BLOCKS.register("sugar_log_fence_gate", ()-> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));


	public static void register(IEventBus event) {
		BLOCKS.register(event);
	}

	public static Collection<RegistryObject<Block>> getEntries(){
		return BLOCKS.getEntries();

	}

	private static boolean never(BlockState state, IBlockReader blockreader, BlockPos pos) {
		return false;
	}
	private static boolean never(BlockState state, IBlockReader blockreader, BlockPos pos, EntityType<?> entitytype) {
		return false;
	}
	private static Boolean ocelotOrParrot(BlockState state, IBlockReader blockreader, BlockPos pos, EntityType<?> entitytype) {
		return entitytype == EntityType.OCELOT || entitytype == EntityType.PARROT;
	}

	private static RotatedPillarBlock log(MaterialColor top, MaterialColor side) {
		return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, XZorY -> {
			return XZorY.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side;
		}).strength(2.0F).sound(SoundType.WOOD).harvestLevel(0).harvestTool(ToolType.AXE));
	}
	private static LeavesBlock leaves() {
		return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES)
				.strength(0.2F)
				.randomTicks()
				.sound(SoundType.GRASS)
				.noOcclusion()
				.isValidSpawn(SLBlocks::ocelotOrParrot)
				.isSuffocating(SLBlocks::never)
				.isViewBlocking(SLBlocks::never));
	}
}
