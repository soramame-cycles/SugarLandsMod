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

    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {	}

    private static class SLBlockLootTables extends BlockLootTables{
        protected Iterable<Block> getKnownBlocks(){
            return SLBlocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
        protected void addTables() {
            dropSelf(SLBlocks.SUGAR_BLOCK.get());
            dropSelf(SLBlocks.SUGAR_STONE.get());
            dropSelf(SLBlocks.SUGAR_CANDY.get());
            add(SLBlocks.SUGAR_DIAMOND_ORE.get(),
                    sugar_diamond->createOreDrop(sugar_diamond, SLItems.Sugar_Diamond_nugget.get()));
            dropSelf(SLBlocks.SUGAR_DIAMOND_BLOCK.get());
            dropSelf(SLBlocks.SUGAR_COBBLESTONE.get());
            dropSelf(SLBlocks.SUGAR_BRICKS.get());
            dropSelf(SLBlocks.MOIST_SUGAR_BLOCK.get());
            dropSelf(SLBlocks.RAW_SUGAR_BLOCK.get());
            dropSelf(SLBlocks.LIT_RAW_SUGAR_BLOCK.get());
            add(SLBlocks.SUGARRACK.get(),
                    sugarrack->createOreDrop(sugarrack,SLItems.Sugar_Diamond_nugget.get()));
            add(SLBlocks.END_SUGAR_STONE.get(),
                    endsugar->createOreDrop(endsugar,SLItems.Sugar_Diamond_nugget.get()));
            dropSelf(SLBlocks.BISMUTH_ORE.get());
            dropSelf(SLBlocks.BISMUTH_CRYSTAL_BLOCK.get());
            dropSelf(SLBlocks.PUDDING_BLOCK.get());
            dropSelf(SLBlocks.CALAMEL_SAUCE.get());
            dropSelf(SLBlocks.COOKIE_BLOCK.get());
            dropSelf(SLBlocks.SUGAR_PILLAR.get());
            dropSelf(SLBlocks.ROTTEN_FLESH_BLOCK.get());
            dropSelf(SLBlocks.BLACK_ICE_CANDY.get());
            dropSelf(SLBlocks.BLUE_ICE_CANDY.get());
            dropSelf(SLBlocks.BROWN_ICE_CANDY.get());
            dropSelf(SLBlocks.CYAN_ICE_CANDY.get());
            dropSelf(SLBlocks.GRAY_ICE_CANDY.get());
            dropSelf(SLBlocks.GREEN_ICE_CANDY.get());
            dropSelf(SLBlocks.LIGHT_BLUE_ICE_CANDY.get());
            dropSelf(SLBlocks.LIGHT_GRAY_ICE_CANDY.get());
            dropSelf(SLBlocks.LIME_ICE_CANDY.get());
            dropSelf(SLBlocks.MAGENTA_ICE_CANDY.get());
            dropSelf(SLBlocks.ORANGE_ICE_CANDY.get());
            dropSelf(SLBlocks.PINK_ICE_CANDY.get());
            dropSelf(SLBlocks.PURPLE_ICE_CANDY.get());
            dropSelf(SLBlocks.RED_ICE_CANDY.get());
            dropSelf(SLBlocks.WHITE_ICE_CANDY.get());
            dropSelf(SLBlocks.YELLOW_ICE_CANDY.get());
            dropSelf(SLBlocks.SUGAR_LOG.get());
            add(SLBlocks.SUGAR_LEAVES.get(), sugar_leaves->
                createLeavesDrops(sugar_leaves, SLBlocks.SUGAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            dropSelf(SLBlocks.SUGAR_SAPLING.get());
            dropSelf(SLBlocks.SUGAR_PLANKS.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_STAIRS.get());
            dropSelf(SLBlocks.SUGAR_STONE_STAIRS.get());
            dropSelf(SLBlocks.SUGAR_COBBLESTONE_STAIRS.get());
            dropSelf(SLBlocks.SUGAR_LOG_STAIRS.get());
            add(SLBlocks.SUGAR_PLANKS_SLAB.get(), BlockLootTables::createSlabItemTable);
            add(SLBlocks.SUGAR_STONE_SLAB.get(), BlockLootTables::createSlabItemTable);
            add(SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), BlockLootTables::createSlabItemTable);
            add(SLBlocks.SUGAR_LOG_SLAB.get(), BlockLootTables::createSlabItemTable);
            dropSelf(SLBlocks.SUGAR_LOG_FENCE.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_FENCE.get());
            dropSelf(SLBlocks.SUGAR_STONE_WALL.get());
            dropSelf(SLBlocks.SUGAR_COBBLESTONE_WALL.get());
            dropSelf(SLBlocks.SUGAR_BRICKS_WALL.get());
            dropSelf(SLBlocks.SUGAR_CANDY_PANE.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_TRAPDOOR.get());
            add(SLBlocks.SUGAR_DOOR.get(), BlockLootTables::createDoorTable);
            dropSelf(SLBlocks.SUGAR_TORCH.get());
            dropOther(SLBlocks.WALL_SUGAR_TORCH.get(), SLBlocks.SUGAR_TORCH.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_BUTTON.get());
            dropSelf(SLBlocks.SUGAR_STONE_BUTTON.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get());
            dropSelf(SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get());
            dropSelf(SLBlocks.STRIPPED_SUGAR_LOG.get());
            dropSelf(SLBlocks.SUGAR_WOOD.get());
            dropSelf(SLBlocks.STRIPPED_SUGAR_WOOD.get());
            dropSelf(SLBlocks.SUGAR_PLANKS_FENCE_GATE.get());
            dropSelf(SLBlocks.SUGAR_LOG_FENCE_GATE.get());

        }
    }

}
