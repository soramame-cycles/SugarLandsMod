package jp.soramame.sugarlands.provider;

import java.util.function.Consumer;

import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import jp.soramame.sugarlands.tags.SLItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag.INamedTag;
import net.minecraft.util.IItemProvider;

public class SLRecipeProvider extends RecipeProvider {

	public SLRecipeProvider(DataGenerator p_i48262_1_) {
		super(p_i48262_1_);

	}

	@Override
	protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		twoByFour(consumer, SLBlocks.SUGAR_BLOCK.get(), Items.SUGAR,"sugar_block");
		shapeless(consumer, Items.SUGAR, 4, SLBlocks.SUGAR_BLOCK.get(),"sugar");
		twoByFour(consumer, SLBlocks.SUGAR_STONE.get(), SLBlocks.SUGAR_BLOCK.get());
		shapeless(consumer, SLBlocks.SUGAR_BLOCK.get(), 4, SLBlocks.SUGAR_STONE.get(), "sugar_block");
		twoByFour(consumer, SLBlocks.SUGAR_CANDY.get(), SLBlocks.SUGAR_STONE.get());
		twoByFour(consumer,SLItems.Sugar_Diamond.get() , SLItems.Sugar_Diamond_nugget.get());
		threeNine(consumer, SLBlocks.SUGAR_DIAMOND_BLOCK.get(), SLItems.Sugar_Diamond.get());
		shapeless(consumer, SLItems.Sugar_Diamond.get(), 9, SLBlocks.SUGAR_DIAMOND_BLOCK.get());
		planksFromLog(consumer, SLBlocks.SUGAR_PLANKS.get(), SLItemTags.SUGAR_LOGS);
		woodenButton(consumer, SLBlocks.SUGAR_PLANKS_BUTTON.get(), SLBlocks.SUGAR_PLANKS.get());
		woodenDoor(consumer, SLBlocks.SUGAR_DOOR.get(), SLBlocks.SUGAR_PLANKS.get());
		woodenFence(consumer, SLBlocks.SUGAR_LOG_FENCE.get(), SLBlocks.SUGAR_LOG.get());
		woodenFence(consumer, SLBlocks.SUGAR_PLANKS_FENCE.get(), SLBlocks.SUGAR_PLANKS.get());
		woodenPressurePlate(consumer, SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(), SLBlocks.SUGAR_PLANKS.get());
		woodenSlab(consumer, SLBlocks.SUGAR_LOG_SLAB.get(), SLBlocks.SUGAR_LOG.get());
		woodenSlab(consumer, SLBlocks.SUGAR_PLANKS_SLAB.get(), SLBlocks.SUGAR_PLANKS.get());
		woodenStairs(consumer, SLBlocks.SUGAR_PLANKS_STAIRS.get(),SLBlocks.SUGAR_PLANKS.get());
		woodenTrapdoor(consumer, SLBlocks.SUGAR_PLANKS_TRAPDOOR.get(), SLBlocks.SUGAR_PLANKS.get());
		woodFromLogs(consumer, SLBlocks.SUGAR_WOOD.get(), SLBlocks.SUGAR_LOG.get());
		woodFromLogs(consumer, SLBlocks.STRIPPED_SUGAR_WOOD.get(), SLBlocks.STRIPPED_SUGAR_LOG.get());
		slab(consumer, SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), SLBlocks.SUGAR_COBBLESTONE.get());
		slab(consumer, SLBlocks.SUGAR_STONE_SLAB.get(), SLBlocks.SUGAR_STONE.get());
		stairs(consumer, SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), SLBlocks.SUGAR_COBBLESTONE.get());
		stairs(consumer, SLBlocks.SUGAR_STONE_STAIRS.get(), SLBlocks.SUGAR_STONE.get());
		twoByFour(consumer, SLBlocks.COOKIE_BLOCK.get(), Items.COOKIE);
		shapeless(consumer, Items.COOKIE, 4, SLBlocks.COOKIE_BLOCK.get());
		twoByFour(consumer, SLBlocks.RAW_SUGAR_BLOCK.get(), SLItems.Raw_sugar.get());
		shapeless(consumer, SLItems.Raw_sugar.get(), 4, SLBlocks.RAW_SUGAR_BLOCK.get());
		PickAxe(consumer, SLItems.Bismuth_Pickaxe.get(), SLItems.Bismuth_Crystal.get());
		PickAxe(consumer, SLItems.Sugar_Diamond_Pickaxe.get(), SLItems.Sugar_Diamond.get());
		addition(consumer, SLItems.Azuki_Paste.get(), 2, SLItems.Azuki_Been.get(), Items.SUGAR);
		addition(consumer, SLBlocks.SUGAR_TORCH.get(), 4, Items.SUGAR, Items.STICK);
		shapeless(consumer, SLBlocks.SUGAR_STONE_BUTTON.get(), 1, SLBlocks.SUGAR_STONE.get());
		pressurePlate(consumer, SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(), SLBlocks.SUGAR_STONE.get());

		smelting(consumer, SLItems.Sugar_Diamond_nugget.get(), SLBlocks.SUGAR_CANDY.get(), 0.2F, 200);
		smelting(consumer, SLBlocks.ROTTEN_FLESH_BLOCK.get(), Items.LEATHER, 0.1F, 50);
		smelting(consumer, SLItems.Bismuth_Crystal.get(), SLBlocks.BISMUTH_ORE.get(), 1.0F, 200);
		smelting(consumer, SLBlocks.SUGAR_DIAMOND_ORE.get(), SLItems.Sugar_Diamond.get(), 1.0F, 200);
		smelting(consumer, SLItems.Azuki_Been.get(), SLBlocks.SUGAR_LEAVES.get(), 0.1F, 100);
		smelting(consumer, Items.POPPY, SLItems.Poppy_Seed.get(), 0.1F, 100);
		smelting(consumer, SLItems.Raw_sugar.get(), SLItems.Raw_sugar.get(), 0.1F, 100);
		smelting(consumer, SLBlockItems.Sugar_block.get(), SLBlockItems.Moist_sugar_block.get(), 0.1F, 200);

		stoneCut(consumer, SLBlocks.SUGAR_STONE_BUTTON.get(), 1, SLBlocks.SUGAR_STONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(), 1, SLBlocks.SUGAR_STONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_STONE_SLAB.get(), 2, SLBlocks.SUGAR_STONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_STONE_STAIRS.get(), 1, SLBlocks.SUGAR_STONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_COBBLESTONE_SLAB.get(), 2, SLBlocks.SUGAR_COBBLESTONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_COBBLESTONE_STAIRS.get(), 1, SLBlocks.SUGAR_COBBLESTONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_COBBLESTONE_WALL.get(), 1, SLBlocks.SUGAR_COBBLESTONE.get());
		stoneCut(consumer, SLBlocks.SUGAR_PLANKS_BUTTON.get(), 0, SLBlocks.SUGAR_PLANKS.get());
		stoneCut(consumer, SLBlocks.SUGAR_PLANKS_PRESSURE_PLATE.get(), 1, SLBlocks.SUGAR_PLANKS.get());
		stoneCut(consumer, SLBlocks.SUGAR_PLANKS_SLAB.get(), 2, SLBlocks.SUGAR_PLANKS.get());
		stoneCut(consumer, SLBlocks.SUGAR_PLANKS_STAIRS.get(), 1, SLBlocks.SUGAR_PLANKS.get());
	}

	private static void twoByFour(Consumer<IFinishedRecipe> con,IItemProvider out,IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out)
		.define('#', in)
		.pattern("##")
		.pattern("##")
		.unlockedBy("has_"+name , has(in))
		.save(con);
	}
	private static void twoByFour(Consumer<IFinishedRecipe> con,IItemProvider out,IItemProvider in,String group) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out)
		.define('#', in)
		.pattern("##")
		.pattern("##")
		.group(group)
		.unlockedBy("has_"+name , has(in))
		.save(con);
	}
	private static void threeNine(Consumer<IFinishedRecipe> con,IItemProvider out,IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out)
		.define('#', in)
		.pattern("###")
		.pattern("###")
		.pattern("###")
		.unlockedBy("has_"+name, has(in))
		.save(con);
	}
	private static void slab(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out,6)
		.define('#', in)
		.pattern("###")
		.unlockedBy("has_"+name , has(in))
		.save(con);
	}
	private static void stairs(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out, 4).define('#', in)
		.pattern("#  ")
		.pattern("## ")
		.pattern("###")
		.unlockedBy("has_"+name, has(in)).save(con);
	}
	private static void pressurePlate(Consumer<IFinishedRecipe> con, IItemProvider out,IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out).define('#', in)
		.pattern("##")
		.unlockedBy("has_"+name, has(in)).save(con);
	}
	private static void woodFromLogs(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 3).define('#', in)
		.pattern("##")
		.pattern("##")
		.group("bark")
		.unlockedBy("has_log", has(in)).save(con);
	}

	@SuppressWarnings("unused")
	private static void woodenBoat(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out).define('#', in)
		.pattern("# #")
		.pattern("###")
		.group("boat")
		.unlockedBy("in_water", insideOf(Blocks.WATER)).save(con);
	}

	private static void woodenButton(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapelessRecipeBuilder.shapeless(out).requires(in).group("wooden_button")
				.unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenDoor(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 3).define('#', in)
		.pattern("##")
		.pattern("##")
		.pattern("##")
		.group("wooden_door")
		.unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenFence(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 3).define('#', Items.STICK).define('W', in)
		.pattern("W#W")
		.pattern("W#W")
		.group("wooden_fence")
		.unlockedBy("has_planks", has(in)).save(con);
	}

	@SuppressWarnings("unused")
	private static void woodenFenceGate(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out).define('#', Items.STICK).define('W', in)
		.pattern("#W#")
		.pattern("#W#")
		.group("wooden_fence_gate")
		.unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenPressurePlate(Consumer<IFinishedRecipe> con, IItemProvider out,IItemProvider in) {
		ShapedRecipeBuilder.shaped(out).define('#', in)
		.pattern("##")
		.group("wooden_pressure_plate")
		.unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenSlab(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 6).define('#', in)
		.pattern("###").group("wooden_slab")
		.unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenStairs(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 4).define('#', in)
		.pattern("#  ")
		.pattern("## ")
		.pattern("###")
		.group("wooden_stairs").unlockedBy("has_planks", has(in)).save(con);
	}

	private static void woodenTrapdoor(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		ShapedRecipeBuilder.shaped(out, 2).define('#', in)
		.pattern("###")
		.pattern("###")
		.group("wooden_trapdoor").unlockedBy("has_planks", has(in)).save(con);
	}

	private static void planksFromLog(Consumer<IFinishedRecipe> consumer, IItemProvider out, INamedTag<Item> in) {
		ShapelessRecipeBuilder.shapeless(out, 4).requires(in).group("planks")
		.unlockedBy("has_log", has(in)).save(consumer);
	}
	private static void PickAxe(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in) {
		String name = in.asItem().toString();
		ShapedRecipeBuilder.shaped(out).define('#', Items.STICK).define('W', in)
		.pattern("WWW")
		.pattern(" # ")
		.pattern(" # ")
		.unlockedBy("has_"+name, has(in)).save(con);
	}
	private static void addition(Consumer<IFinishedRecipe> con, IItemProvider out,int count, IItemProvider in1, IItemProvider in2) {
		String name = in1.asItem().toString();
		String name1 = in2.asItem().toString();
		String name2 = out.asItem().toString();
		ShapelessRecipeBuilder.shapeless(out, count)
		.requires(in1).requires(in2)
		.unlockedBy("has_"+name, has(in1))
		.unlockedBy("has_"+name1, has(in2))
		.save(con, SugarLandsCore.MOD_ID+":"+name2+"_from_"+name+"_plus_"+name1);
	}
	private static void smelting(Consumer<IFinishedRecipe> con, IItemProvider out, IItemProvider in,float exp,int time) {
		String name = in.asItem().toString();
		String name1 = out.asItem().toString();
		CookingRecipeBuilder.smelting(Ingredient.of(in), out, exp, time)
		.unlockedBy("has_"+name, has(in))
		.save(con, SugarLandsCore.MOD_ID+":"+name1+"_from_smelting");
	}
	private static void shapeless(Consumer<IFinishedRecipe> con, IItemProvider out,int count, IItemProvider in) {
		String name = in.asItem().toString();
		String name1 = out.asItem().toString();
		ShapelessRecipeBuilder.shapeless(out, count)
		.requires(in)
		.unlockedBy("has_"+name, has(in))
		.save(con, SugarLandsCore.MOD_ID+":"+name1+"_from_"+name);
	}
	private static void shapeless(Consumer<IFinishedRecipe> con, IItemProvider out,int count, IItemProvider in,String group) {
		String name = in.asItem().toString();
		String name1 = out.asItem().toString();
		ShapelessRecipeBuilder.shapeless(out, count)
		.requires(in).group(group)
		.unlockedBy("has_"+name, has(in))
		.save(con, SugarLandsCore.MOD_ID+":"+name1+"_from_"+name);
	}
	private static void stoneCut(Consumer<IFinishedRecipe> con, IItemProvider out,int count, IItemProvider in) {
		String name = in.asItem().toString();
		String name1 = out.asItem().toString();
		if (count<=1) {
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(in), out)
					.unlocks("has_" + name, has(in))
					.save(con, SugarLandsCore.MOD_ID + ":" + name1 + "_from_" + name + "_stonecutting");
		}else if(1<count) {
			SingleItemRecipeBuilder.stonecutting(Ingredient.of(in), out,count)
			.unlocks("has_"+name,has(in))
			.save(con, SugarLandsCore.MOD_ID+":"+name1+"_from_"+name+"_stonecutting");
		}
	}
}
