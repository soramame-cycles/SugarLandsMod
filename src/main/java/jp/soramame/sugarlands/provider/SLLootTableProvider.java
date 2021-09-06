package jp.soramame.sugarlands.provider;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class SLLootTableProvider extends LootTableProvider {

	public static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};

	public SLLootTableProvider(DataGenerator p_i50789_1_) {
		super(p_i50789_1_);
	}

	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables(){
		return ImmutableList.of(Pair.of(SLBlockLootTables::new, LootParameterSets.BLOCK));

	}

	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {

	}

	private static class SLBlockLootTables extends BlockLootTables{
		protected Iterable<Block> getKnownBlocks(){
			return SLBlocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
		}
		protected void addTables() {
			this.dropSelf(SLBlocks.Sugar_Block.get());
			this.dropSelf(SLBlocks.Sugar_Stone.get());
			this.dropSelf(SLBlocks.Sugar_Candy.get());
			this.add(SLBlocks.Sugar_Diamond_Ore.get(), (sugar_diamond)-> {
				return createOreDrop(sugar_diamond, SLItems.Sugar_Diamond_nugget.get());
			});
			this.dropSelf(SLBlocks.Sugar_Diamond_Block.get());
			this.dropSelf(SLBlocks.Sugar_CobbleStone.get());
			this.dropSelf(SLBlocks.Sugar_Bricks.get());
			this.dropSelf(SLBlocks.Moist_Sugar_Block.get());
			this.dropSelf(SLBlocks.Raw_Sugar_Block.get());
			this.dropSelf(SLBlocks.Lit_Raw_Sugar_Block.get());
			this.add(SLBlocks.Sugarrack.get(),(sugarrack)->{
				return createOreDrop(sugarrack,SLItems.Sugar_Diamond_nugget.get());
			});
			this.add(SLBlocks.End_Sugar_Stone.get(),(endsugar)->{
				return createOreDrop(endsugar,SLItems.Sugar_Diamond_nugget.get());
			});
			this.dropSelf(SLBlocks.Bismuth_Ore.get());
			this.dropSelf(SLBlocks.Bismuth_Crystal_Block.get());
			this.dropSelf(SLBlocks.Pudding_Block.get());
			this.dropSelf(SLBlocks.Calamel_Sauce.get());
			this.dropSelf(SLBlocks.Cookie_Block.get());
			this.dropSelf(SLBlocks.Sugar_Pillar.get());
			this.dropSelf(SLBlocks.Rotten_Flesh_Block.get());
			this.dropSelf(SLBlocks.Black_Ice_Candy.get());
			this.dropSelf(SLBlocks.Blue_Ice_Candy.get());
			this.dropSelf(SLBlocks.Brown_Ice_Candy.get());
			this.dropSelf(SLBlocks.Cyan_Ice_Candy.get());
			this.dropSelf(SLBlocks.Gray_Ice_Candy.get());
			this.dropSelf(SLBlocks.Green_Ice_Candy.get());
			this.dropSelf(SLBlocks.Light_Blue_Ice_Candy.get());
			this.dropSelf(SLBlocks.Light_Gray_Ice_Candy.get());
			this.dropSelf(SLBlocks.Lime_Ice_Candy.get());
			this.dropSelf(SLBlocks.Magenta_Ice_Candy.get());
			this.dropSelf(SLBlocks.Orange_Ice_Candy.get());
			this.dropSelf(SLBlocks.Pink_Ice_Candy.get());
			this.dropSelf(SLBlocks.Purple_Ice_Candy.get());
			this.dropSelf(SLBlocks.Red_Ice_Candy.get());
			this.dropSelf(SLBlocks.White_Ice_Candy.get());
			this.dropSelf(SLBlocks.Yellow_Ice_Candy.get());
			this.dropSelf(SLBlocks.Sugar_Log.get());
			this.add(SLBlocks.Sugar_Leaves.get(), (sugar_leaves)->{
				return createLeavesDrops(sugar_leaves, SLBlocks.Sugar_Sapling.get(), NORMAL_LEAVES_SAPLING_CHANCES);
			});
			this.dropSelf(SLBlocks.Sugar_Sapling.get());
			this.dropSelf(SLBlocks.Sugar_Planks.get());
			this.dropSelf(SLBlocks.Sugar_Planks_Stairs.get());
			this.dropSelf(SLBlocks.Sugar_Stone_Stairs.get());
			this.dropSelf(SLBlocks.Sugar_Cobblestone_Stairs.get());
			this.dropSelf(SLBlocks.Sugar_Log_Stairs.get());
			this.add(SLBlocks.Sugar_Planks_Slab.get(), BlockLootTables::createSlabItemTable);
			this.add(SLBlocks.Sugar_Stone_Slab.get(), BlockLootTables::createSlabItemTable);
			this.add(SLBlocks.Sugar_Cobblestone_Slab.get(), BlockLootTables::createSlabItemTable);
			this.add(SLBlocks.Sugar_Log_Slab.get(), BlockLootTables::createSlabItemTable);
			this.dropSelf(SLBlocks.Sugar_Log_Fence.get());
			this.dropSelf(SLBlocks.Sugar_Planks_Fence.get());
			this.dropSelf(SLBlocks.Sugar_Stone_Wall.get());
			this.dropSelf(SLBlocks.Sugar_Cobblestone_Wall.get());
			this.dropSelf(SLBlocks.Sugar_Bricks_Wall.get());
			this.dropSelf(SLBlocks.Sugar_Candy_Pane.get());
			this.dropSelf(SLBlocks.Sugar_Planks_TrapDoor.get());
			this.add(SLBlocks.Sugar_Door.get(), BlockLootTables::createDoorTable);
			this.dropSelf(SLBlocks.Sugar_Torch.get());
			this.dropOther(SLBlocks.Wall_Sugar_Torch.get(), SLBlocks.Sugar_Torch.get());
			this.dropSelf(SLBlocks.Sugar_Planks_Button.get());
			this.dropSelf(SLBlocks.Sugar_Stone_Button.get());
			this.dropSelf(SLBlocks.Sugar_planks_Pressure_Plate.get());
			this.dropSelf(SLBlocks.Sugar_stone_Pressure_Plate.get());
			this.dropSelf(SLBlocks.Stripped_Sugar_Log.get());
			this.dropSelf(SLBlocks.Sugar_Wood.get());
			this.dropSelf(SLBlocks.Stripped_Sugar_Wood.get());
		}
	}

}
