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
		ShapedRecipeBuilder.shaped(SLBlocks.Sugar_Block.get())
			.define('#', Items.SUGAR)
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar", has(Items.SUGAR))
			.group("sugar_block")
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(Items.SUGAR, 4)
			.requires(SLBlocks.Sugar_Block.get())
			.group("sugar")
			.unlockedBy("has_sugar_block", has(SLBlocks.Sugar_Block.get()))
			.save(consumer, "sugards:sugar_from_sugar_block");
		ShapedRecipeBuilder.shaped(SLBlocks.Sugar_Stone.get())
			.define('#', SLBlocks.Sugar_Block.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_block", has(SLBlocks.Sugar_Block.get()))
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(SLBlocks.Sugar_Block.get(), 4)
			.requires(SLBlocks.Sugar_Stone.get())
			.unlockedBy("has_sugar_stone", has(SLBlocks.Sugar_Stone.get()))
			.group("sugar_block")
			.save(consumer, "sugards:sugar_block_from_sugar_stone");
		ShapedRecipeBuilder.shaped(SLBlocks.Sugar_Candy.get())
			.define('#', SLBlocks.Sugar_Stone.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_stone", has(SLBlocks.Sugar_Stone.get()))
			.save(consumer);
		ShapedRecipeBuilder.shaped(SLItems.Sugar_Diamond.get())
			.define('#', SLItems.Sugar_Diamond_nugget.get())
			.pattern("##")
			.pattern("##")
			.unlockedBy("has_sugar_diamond_nugget", has(SLItems.Sugar_Diamond_nugget.get()))
			.save(consumer);
		ShapedRecipeBuilder.shaped(SLBlocks.Sugar_Diamond_Block.get())
			.define('#', SLItems.Sugar_Diamond.get())
			.pattern("###")
			.pattern("###")
			.pattern("###")
			.unlockedBy("has_sugar_diamond", has(SLItems.Sugar_Diamond.get()))
			.save(consumer);
		ShapelessRecipeBuilder.shapeless(SLItems.Sugar_Diamond.get(),9)
			.requires(SLBlocks.Sugar_Diamond_Block.get())
			.unlockedBy("has_sugar_diamond_block", has(SLBlocks.Sugar_Diamond_Block.get()))
			.save(consumer, "sugards:sugar_diamond_from_sugar_diamond_block");


		CookingRecipeBuilder.smelting(Ingredient.of(SLBlocks.Sugar_Candy.get()), SLItems.Sugar_Diamond_nugget.get(), 0.2F, 200)
			.unlockedBy("has_sugar_candy", has(SLBlocks.Sugar_Candy.get())
			).save(consumer,"sugards:sugar_diamond_from_smelting");
	}

}
