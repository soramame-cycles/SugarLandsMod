package jp.soramame.sugarlands.provider;

import java.util.function.Consumer;

import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public class SLRecipeProvider extends RecipeProvider {

	public SLRecipeProvider(DataGenerator p_i48262_1_) {
		super(p_i48262_1_);

	}

	@Override
	protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(SLBlocks.SUGAR_BLOCK.get())
			.define('#', Items.SUGAR)
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar", has(Items.SUGAR))
			.group("sugar_block")
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(Items.SUGAR, 4)
			.requires(SLBlocks.SUGAR_BLOCK.get())
			.group("sugar")
			.unlockedBy("has_sugar_block", has(SLBlocks.SUGAR_BLOCK.get()))
			.save(consumer, "sugards:sugar_from_sugar_block");
		ShapedRecipeBuilder.shaped(SLBlocks.SUGAR_STONE.get())
			.define('#', SLBlocks.SUGAR_BLOCK.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_block", has(SLBlocks.SUGAR_BLOCK.get()))
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(SLBlocks.SUGAR_BLOCK.get(), 4)
			.requires(SLBlocks.SUGAR_STONE.get())
			.unlockedBy("has_sugar_stone", has(SLBlocks.SUGAR_STONE.get()))
			.group("sugar_block")
			.save(consumer, "sugards:sugar_block_from_sugar_stone");
		ShapedRecipeBuilder.shaped(SLBlocks.SUGAR_CANDY.get())
			.define('#', SLBlocks.SUGAR_STONE.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_stone", has(SLBlocks.SUGAR_STONE.get()))
			.save(consumer);
		ShapedRecipeBuilder.shaped(SLItems.Sugar_Diamond.get())
			.define('#', SLItems.Sugar_Diamond_nugget.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_diamond_nugget", has(SLItems.Sugar_Diamond_nugget.get()))
			.save(consumer);
		ShapedRecipeBuilder.shaped(SLBlocks.SUGAR_DIAMOND_BLOCK.get())
			.define('#', SLItems.Sugar_Diamond.get())
			.pattern("###")
			.pattern("###")
			.pattern("###")
			.unlockedBy("has_sugar_diamond", has(SLItems.Sugar_Diamond.get()))
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(SLItems.Sugar_Diamond.get(),9)
			.requires(SLBlocks.SUGAR_DIAMOND_BLOCK.get())
			.unlockedBy("has_sugar_diamond_block", has(SLBlocks.SUGAR_DIAMOND_BLOCK.get()))
			.save(consumer, "sugards:sugar_diamond_from_sugar_diamond_block");


		CookingRecipeBuilder.smelting(Ingredient.of(SLBlocks.SUGAR_CANDY.get()), SLItems.Sugar_Diamond_nugget.get(), 0.2F, 200)
			.unlockedBy("has_sugar_candy", has(SLBlocks.SUGAR_CANDY.get())
			).save(consumer,"sugards:sugar_diamond_from_smelting");
	}

}
