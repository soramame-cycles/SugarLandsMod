package jp.soramame.sugarlands.init;

import java.util.Collection;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.block.Candy_Block;
import jp.soramame.sugarlands.block.Raw_Sugar_Block;
import jp.soramame.sugarlands.block.Sugar_Block;
import jp.soramame.sugarlands.block.Sugar_Ore_Block;
import jp.soramame.sugarlands.world.gen.feature.Sugar_Tree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
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
	public static final RegistryObject<Block> Moist_Sugar_Block =
			BLOCKS.register("moist_sugar_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F, 100.0F)
					.harvestLevel(-1)
					.harvestTool(ToolType.PICKAXE)
					));
	//都合に(ry
	public static final RegistryObject<Block> Lit_Raw_Sugar_Block =
			BLOCKS.register("lit_raw_sugar_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F, 100.0F)
					.harvestLevel(-1)
					.harvestTool(ToolType.PICKAXE)
					.lightLevel((lightlevel)->{return 15;})
					));
	public static final RegistryObject<Block> Sugar_Block =
			BLOCKS.register("sugar_block",() -> new Sugar_Block(Moist_Sugar_Block.get(),AbstractBlock.Properties.of(Material.SAND,DyeColor.WHITE)
					.strength(0.5F,0.5F)//硬さ,耐爆
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> Sugar_Stone =
			BLOCKS.register("sugar_stone",()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Sugar_Candy =
			BLOCKS.register("sugar_candy", ()-> new Candy_Block(AbstractBlock.Properties.of(Material.GLASS)
					.strength(0.6F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					.isViewBlocking(SLBlocks::never)
					));
	public static final RegistryObject<Block> Sugar_Diamond_Ore =
			BLOCKS.register("sugar_diamond_ore", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.GLASS)
					.strength(0.6F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					.requiresCorrectToolForDrops()
					));
	public static final RegistryObject<Block> Sugar_Diamond_Block =
			BLOCKS.register("sugar_diamond_block", ()-> new Block(AbstractBlock.Properties.of(Material.METAL)
					.strength(0.6F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					));
	public static final RegistryObject<Block> Sugar_CobbleStone =
			BLOCKS.register("sugar_cobblestone", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Sugar_Bricks =
			BLOCKS.register("sugar_bricks", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Raw_Sugar_Block =
			BLOCKS.register("raw_sugar_block", ()-> new Raw_Sugar_Block(Lit_Raw_Sugar_Block.get(),AbstractBlock.Properties.of(Material.SAND)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> Sugarrack =
			BLOCKS.register("sugarrack", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.NETHERRACK)
					));
	public static final RegistryObject<Block> End_Sugar_Stone =
			BLOCKS.register("end_sugar_stone", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.GLASS)
					));
	public static final RegistryObject<Block> Bismuth_Ore =
			BLOCKS.register("bismuth_ore", ()-> new Sugar_Ore_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F,10.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Bismuth_Crystal_Block =
			BLOCKS.register("bismuth_crystal_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F,10.0F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					.lightLevel((bismuthflash) -> {return 15;})
					));
	public static final RegistryObject<Block> Pudding_Block =
			BLOCKS.register("pudding_block", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SNOW)
					));
	public static final RegistryObject<Block> Calamel_Sauce =
			BLOCKS.register("caramel_sauce", ()-> new Candy_Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.2F)
					.harvestLevel(-1)
					.harvestTool(ToolType.SHOVEL)
					.sound(SoundType.SLIME_BLOCK)
					.noOcclusion()
					.isViewBlocking(SLBlocks::never)
					));
	public static final RegistryObject<Block> Cookie_Block =
			BLOCKS.register("cookie_block", ()->new Block(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.SAND)
					));
	public static final RegistryObject<Block> Sugar_Pillar =
			BLOCKS.register("sugar_pillar", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(0.2F)
					.harvestLevel(1)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Rotten_Flesh_Block =
			BLOCKS.register("rotten_flesh_block", ()-> new Block(AbstractBlock.Properties.of(Material.DIRT)
					.strength(0.1F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.SLIME_BLOCK)
					.lightLevel((dirtylight) -> {return 3;})
					));
	public static final RegistryObject<Block> Black_Ice_Candy =
			BLOCKS.register("black_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BLACK)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Blue_Ice_Candy =
			BLOCKS.register("blue_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BLUE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Brown_Ice_Candy =
			BLOCKS.register("brown_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.BROWN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Cyan_Ice_Candy =
			BLOCKS.register("cyan_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.CYAN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Gray_Ice_Candy =
			BLOCKS.register("gray_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.GRAY)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Green_Ice_Candy =
			BLOCKS.register("green_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.GREEN)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Light_Blue_Ice_Candy =
			BLOCKS.register("light_blue_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIGHT_BLUE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Light_Gray_Ice_Candy =
			BLOCKS.register("light_gray_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIGHT_GRAY)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Lime_Ice_Candy =
			BLOCKS.register("lime_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.LIME)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Magenta_Ice_Candy =
			BLOCKS.register("magenta_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.MAGENTA)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Orange_Ice_Candy =
			BLOCKS.register("orange_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.ORANGE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Pink_Ice_Candy =
			BLOCKS.register("pink_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.PINK)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Purple_Ice_Candy =
			BLOCKS.register("purple_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.PURPLE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Red_Ice_Candy =
			BLOCKS.register("red_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.RED)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> White_Ice_Candy =
			BLOCKS.register("white_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.WHITE)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Yellow_Ice_Candy =
			BLOCKS.register("yellow_ice_candy", ()-> new Block(AbstractBlock.Properties.of(Material.STONE,DyeColor.YELLOW)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.friction(0.989F)
					.sound(SoundType.GLASS)
					.lightLevel((icelight) -> {return 3;})
					));
	public static final RegistryObject<Block> Sugar_Log =
			BLOCKS.register("sugar_log", ()-> log(MaterialColor.SAND, MaterialColor.QUARTZ));
	public static final RegistryObject<Block> Sugar_Leaves =
			BLOCKS.register("sugar_leaves", ()-> leaves());
	public static final RegistryObject<Block> Sugar_Sapling =
			BLOCKS.register("sugar_sapling", ()-> new SaplingBlock(new Sugar_Tree(), AbstractBlock.Properties.of(Material.PLANT)
					.noCollission()
					.randomTicks()
					.instabreak()
					.sound(SoundType.GRASS)
					));
	public static final RegistryObject<Block> Sugar_Planks =
			BLOCKS.register("sugar_planks", ()-> new Block(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> Sugar_Planks_Stairs =
			BLOCKS.register("sugar_planks_stairs", ()-> new StairsBlock(Sugar_Planks.get().defaultBlockState(), AbstractBlock.Properties.copy(Sugar_Planks.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> Sugar_Stone_Stairs =
			BLOCKS.register("sugar_stone_stairs", ()-> new StairsBlock(Sugar_Stone.get().defaultBlockState(), AbstractBlock.Properties.copy(Sugar_Stone.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> Sugar_Cobblestone_Stairs =
			BLOCKS.register("sugar_cobblestone_stairs", ()-> new StairsBlock(Sugar_CobbleStone.get().defaultBlockState(), AbstractBlock.Properties.copy(Sugar_CobbleStone.get())));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> Sugar_Log_Stairs =
			BLOCKS.register("sugar_log_stairs", ()-> new StairsBlock(Sugar_Planks.get().defaultBlockState(), AbstractBlock.Properties.copy(Sugar_Planks.get())));
	public static final RegistryObject<Block> Sugar_Planks_Slab =
			BLOCKS.register("sugar_planks_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> Sugar_Stone_Slab =
			BLOCKS.register("sugar_stone_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Sugar_Cobblestone_Slab =
			BLOCKS.register("sugar_cobblestone_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.STONE)
					.strength(2.0F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					));
	public static final RegistryObject<Block> Sugar_Log_Slab =
			BLOCKS.register("sugar_log_slab", ()-> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> Sugar_Log_Fence =
			BLOCKS.register("sugar_log_fence", ()-> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> Sugar_Planks_Fence =
			BLOCKS.register("sugar_planks_fence", ()-> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> Sugar_Stone_Wall =
			BLOCKS.register("sugar_stone_wall",()-> new WallBlock(AbstractBlock.Properties.copy(Sugar_Stone.get())));
	public static final RegistryObject<Block> Sugar_Cobblestone_Wall =
			BLOCKS.register("sugar_cobblestone_wall",()-> new WallBlock(AbstractBlock.Properties.copy(Sugar_CobbleStone.get())));
	public static final RegistryObject<Block> Sugar_Bricks_Wall =
			BLOCKS.register("sugar_bricks_wall",()-> new WallBlock(AbstractBlock.Properties.copy(Sugar_Bricks.get())));
	public static final RegistryObject<Block> Sugar_Candy_Pane =
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
	public static final RegistryObject<Block> Sugar_Planks_TrapDoor =
			BLOCKS.register("sugar_planks_trapdoor", ()-> new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					.isValidSpawn(SLBlocks::never)
					));
	public static final RegistryObject<Block> Sugar_Door =
			BLOCKS.register("sugar_door", ()-> new DoorBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noOcclusion()
					));
	public static final RegistryObject<Block> Sugar_Torch =
			BLOCKS.register("sugar_torch", ()-> new TorchBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.noCollission()
					.instabreak()
					.lightLevel((sugar)-> {
						return 10;
					})
					.sound(SoundType.WOOD)
					,ParticleTypes.END_ROD));
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> Wall_Sugar_Torch =
			BLOCKS.register("wall_sugar_torch", ()-> new WallTorchBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.noCollission()
					.instabreak()
					.lightLevel((sugar)-> {
						return 10;
					})
					.sound(SoundType.WOOD)
					.dropsLike(Sugar_Torch.get())
					,ParticleTypes.END_ROD));
	public static final RegistryObject<Block> Sugar_Planks_Button =
			BLOCKS.register("sugar_planks_button", ()-> new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.strength(0.5F)
					.harvestLevel(-1)
					.harvestTool(ToolType.AXE)
					.sound(SoundType.WOOD)
					.noCollission()
					));
	public static final RegistryObject<Block> Sugar_Stone_Button =
			BLOCKS.register("sugar_stone_button",()-> new StoneButtonBlock(AbstractBlock.Properties.of(Material.DECORATION)
					.strength(0.5F)
					.harvestLevel(0)
					.harvestTool(ToolType.PICKAXE)
					.noCollission()
					));
	public static final RegistryObject<Block> Sugar_planks_Pressure_Plate =
			BLOCKS.register("sugar_planks_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.EVERYTHING, AbstractBlock.Properties.of(Material.WOOD)
					.noCollission()
					.strength(0.5F)
					.sound(SoundType.WOOD)
					));
	public static final RegistryObject<Block> Sugar_stone_Pressure_Plate =
			BLOCKS.register("sugar_stone_pressure_plate", ()-> new PressurePlateBlock(Sensitivity.MOBS, AbstractBlock.Properties.of(Material.STONE)
					.noCollission()
					.strength(0.5F)
					));
	public static final RegistryObject<Block> Stripped_Sugar_Log =
			BLOCKS.register("stripped_sugar_log", ()-> log(MaterialColor.QUARTZ, MaterialColor.QUARTZ));
	public static final RegistryObject<Block> Sugar_Wood =
			BLOCKS.register("sugar_wood", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(2.0F)
					.sound(SoundType.WOOD)
					.harvestLevel(0)
					.harvestTool(ToolType.AXE)
					));
	public static final RegistryObject<Block> Stripped_Sugar_Wood =
			BLOCKS.register("stripped_sugar_wood", ()-> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)
					.strength(2.0F)
					.sound(SoundType.WOOD)
					.harvestLevel(0)
					.harvestTool(ToolType.AXE)
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
		return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, (XZorY) -> {
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
