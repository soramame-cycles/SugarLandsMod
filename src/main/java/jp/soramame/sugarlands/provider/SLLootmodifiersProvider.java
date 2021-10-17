package jp.soramame.sugarlands.provider;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.RandomChance;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.util.ResourceLocation;


/**あずきのルートテーブル自動生成を試そうとしたが途中で良く分からなくなったため中止
 * がんばったので消さないでおくあとでやくにたつかもしれない*/
public class SLLootmodifiersProvider extends LootTableProvider {

	public SLLootmodifiersProvider(DataGenerator p_i50789_1_) {
		super(p_i50789_1_);
	}

	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables(){
		return ImmutableList.of(Pair.of(SLBlockLootmodifiersTables::new, LootParameterSets.BLOCK));
	}
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
	}

	public static class SLBlockLootmodifiersTables extends BlockLootTables{
		protected void addTables() {

		}
		public static final ILootCondition.IBuilder Wheat = BlockStateProperty.hasBlockStateProperties(Blocks.WHEAT);


		public static LootTable.Builder createGrassDropsModifier(Block block,Item seedItem) {
		      return createShearsDispatchTable(block, applyExplosionDecay(block, ItemLootEntry.lootTableItem(seedItem).when(RandomChance.randomChance(0.125F)).apply(ApplyBonus.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, 2))));
		   }
		public static LootTable.Builder test(Item seed){
			return LootTable.lootTable().withPool(LootPool.lootPool().when(Wheat)).withPool(LootPool.lootPool().add(ItemLootEntry.lootTableItem(seed)));

		}
	}

	public static Path createPath(Path path, ResourceLocation rl) {
		return path.resolve("data/" + rl.getNamespace() + "/loot_modifier/" + rl.getPath() + ".json");
	}

	public String getName() {
		return "LootModifier";
	}

}
