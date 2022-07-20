package jp.soramame.sugarlands.provider;

import java.util.function.Consumer;

import jp.soramame.sugarlands.init.SLBlockItems;
import jp.soramame.sugarlands.init.SLBlocks;
import jp.soramame.sugarlands.init.SLItems;
import jp.soramame.sugarlands.tags.SLItemTags;
import jp.soramame.sugarlands.util.Stil;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class SLRecipeProvider extends RecipeProvider {

    String from = "_from_";
    String has = "has_";

    public SLRecipeProvider(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        twoByFour(consumer, SLBlocks.SUGAR_BLOCK.get(), Items.SUGAR, "sugar_block");
        shapeless(consumer, Items.SUGAR, 4, SLBlocks.SUGAR_BLOCK.get(), "sugar");
        twoByFour(consumer, SLBlocks.SUGAR_STONE.get(), SLBlocks.SUGAR_BLOCK.get());
        shapeless(consumer, SLBlocks.SUGAR_BLOCK.get(), 4, SLBlocks.SUGAR_STONE.get(), "sugar_block");
        twoByFour(consumer, SLBlocks.SUGAR_CANDY.get(), SLBlocks.SUGAR_STONE.get());
        twoByFour(consumer, SLItems.Sugar_Diamond.get() , SLItems.Sugar_Diamond_nugget.get());
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
        pickAxe(consumer, SLItems.Bismuth_Pickaxe.get(), SLItems.Bismuth_Crystal.get());
        pickAxe(consumer, SLItems.Sugar_Diamond_Pickaxe.get(), SLItems.Sugar_Diamond.get());
        addition(consumer, SLItems.Azuki_Paste.get(), 2, SLItems.Azuki_Been.get(), Items.SUGAR);
        addition(consumer, SLBlocks.SUGAR_TORCH.get(), 4, Items.SUGAR, Items.STICK);
        shapeless(consumer, SLBlocks.SUGAR_STONE_BUTTON.get(), 1, SLBlocks.SUGAR_STONE.get());
        pressurePlate(consumer, SLBlocks.SUGAR_STONE_PRESSURE_PLATE.get(), SLBlocks.SUGAR_STONE.get());
        bonA(consumer, SLItems.Pudding.get(), SLBlocks.CALAMEL_SAUCE.get(), SLBlocks.PUDDING_BLOCK.get());
        addition(consumer, SLItems.Crushed_Sugar_Cane.get(), 2, Items.SUGAR_CANE, Items.FLINT);
        woodenFenceGate(consumer,SLBlocks.SUGAR_LOG_FENCE_GATE.get(),SLBlocks.SUGAR_LOG.get());
        woodenFenceGate(consumer, SLBlocks.SUGAR_PLANKS_FENCE_GATE.get(), SLBlocks.SUGAR_PLANKS.get());

        smelting(consumer, SLItems.Sugar_Diamond_nugget.get(),SLBlocks.SUGAR_CANDY.get(), 0.2F, 200);
        smelting(consumer, Items.LEATHER,SLBlocks.ROTTEN_FLESH_BLOCK.get(), 0.1F, 50);
        smelting(consumer, SLItems.Bismuth_Crystal.get(),SLBlocks.BISMUTH_ORE.get(), 1.0F, 200,"bismuth");
        smelting(consumer, SLItems.Sugar_Diamond.get(),SLBlocks.SUGAR_DIAMOND_ORE.get(), 1.0F, 200,"sugar_diamond");
        smelting(consumer, SLItems.Azuki_Been.get(), SLBlocks.SUGAR_LEAVES.get(), 0.1F, 100);
        smelting(consumer, SLItems.Poppy_Seed.get(),Items.POPPY, 0.1F, 100);
        smelting(consumer, Items.SUGAR,SLItems.Raw_sugar.get(), 0.1F, 100);
        smelting(consumer, SLBlockItems.Sugar_block.get(),SLBlockItems.Moist_sugar_block.get(), 0.1F, 200);
        smelting(consumer, SLItems.Raw_sugar.get(), SLItems.Crushed_Sugar_Cane.get(), 0.1F, 100);
        smelting(consumer, SLItems.Bismuth_Crystal.get(),SLBlocks.DEEPSLATE_BISMUTH_ORE.get(), 1.0F, 200,"bismuth");
        smelting(consumer, SLItems.Sugar_Diamond.get(),SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get(), 1.0F, 200,"sugar_diamond");

        blasting(consumer, SLItems.Sugar_Diamond_nugget.get(),SLBlocks.SUGAR_CANDY.get(), 0.1F, 100);
        blasting(consumer, Items.LEATHER,SLBlocks.ROTTEN_FLESH_BLOCK.get(), 0.1F, 25);
        blasting(consumer, SLItems.Bismuth_Crystal.get(),SLBlocks.BISMUTH_ORE.get(), 0.5F, 100,"bismuth");
        blasting(consumer, SLItems.Sugar_Diamond.get(),SLBlocks.SUGAR_DIAMOND_ORE.get(), 0.5F, 100,"sugar_diamond");
        blasting(consumer, SLItems.Azuki_Been.get(), SLBlocks.SUGAR_LEAVES.get(), 0.1F, 50);
        blasting(consumer, SLItems.Poppy_Seed.get(),Items.POPPY, 0.1F, 50);
        blasting(consumer, Items.SUGAR,SLItems.Raw_sugar.get(), 0.1F, 50);
        blasting(consumer, SLBlockItems.Sugar_block.get(),SLBlockItems.Moist_sugar_block.get(), 0.1F, 100);
        blasting(consumer, SLItems.Raw_sugar.get(), SLItems.Crushed_Sugar_Cane.get(), 0.1F, 50);
        blasting(consumer, SLItems.Bismuth_Crystal.get(),SLBlocks.DEEPSLATE_BISMUTH_ORE.get(), 0.5F, 100,"bismuth");
        blasting(consumer, SLItems.Sugar_Diamond.get(),SLBlocks.DEEPSLATE_SUGAR_DIAMOND_ORE.get(), 0.5F, 100,"sugar_diamond");

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

        aLaCarte(consumer);
    }

    private String name(ItemLike item) {
        return item.asItem().toString();
    }

    //一品料理
    private void aLaCarte(Consumer<FinishedRecipe> con) {
        ItemLike azuki = SLItems.Azuki_Paste.get();
        ItemLike azukipan = SLItems.Azuki_Paste_Bun.get();
        ItemLike pSeed = SLItems.Poppy_Seed.get();

        ShapedRecipeBuilder.shaped(azukipan)
        .define('p', pSeed).define('a', azuki).define('b', Items.WHEAT)
        .pattern(" p ").pattern("bab").pattern(" b ").group("anpan")
        .unlockedBy(has+name(azuki), has(azuki)).save(con,Stil.prefix(name(azukipan))+"_from_wheat");

        ShapedRecipeBuilder.shaped(azukipan).define('T', pSeed).define('n', azuki).define('t', Items.BREAD)
        .pattern(" T ").pattern(" n ").pattern(" t ").group("anpan")
        .unlockedBy(has+name(azuki), has(azuki)).save(con, Stil.prefix(name(azukipan))+"_from_bread");
    }

    private void twoByFour(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out).define('#', in)
        .pattern("##")
        .pattern("##")
        .unlockedBy(has+name(in),has(in)).save(con);
    }

    private void twoByFour(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in,String group) {
        ShapedRecipeBuilder.shaped(out).define('#', in)
        .pattern("##")
        .pattern("##")
        .group(group).unlockedBy(has+name(in),has(in)).save(con);
    }
    private void threeNine(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out).define('#',in)
        .pattern("###")
        .pattern("###")
        .pattern("###")
        .unlockedBy(has+name(in),has(in)).save(con);
    }
    private void bonA(Consumer<FinishedRecipe> con,ItemLike out,ItemLike b,ItemLike a) {
        ShapedRecipeBuilder.shaped(out,4).define('#',b).define('i',a)
        .pattern("#")
        .pattern("i")
        .unlockedBy(has+name(b),has(b)).unlockedBy(name(a),has(a)).save(con);
    }
    private void stairs(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out,4).define('#',in)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .unlockedBy(has+name(in),has(in)).save(con);
    }

    private void woodenButton(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapelessRecipeBuilder.shapeless(out).requires(in).group("wooden_button")
                .unlockedBy("has_planks",has(in)).save(con);
    }

    private void woodenDoor(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out,3).define('#',in)
        .pattern("##")
        .pattern("##")
        .pattern("##")
        .group("wooden_door")
        .unlockedBy("has_planks",has(in)).save(con);
    }

    private void woodenFence(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out,3).define('#',Items.STICK).define('W',in)
        .pattern("W#W")
        .pattern("W#W")
        .group("wooden_fence")
        .unlockedBy("has_planks",has(in)).save(con);
    }

    private void woodenFenceGate(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out).define('#', Items.STICK).define('W', in)
        .pattern("#W#")
        .pattern("#W#")
        .group("wooden_fence_gate")
        .unlockedBy("has_planks",has(in)).save(con);
    }

    private void woodenPressurePlate(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out).define('#',in)
        .pattern("##")
        .group("wooden_pressure_plate")
        .unlockedBy("has_planks", has(in)).save(con);
    }

    private void woodenSlab(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out,6).define('#',in)
        .pattern("###").group("wooden_slab")
        .unlockedBy("has_planks",has(in)).save(con);
    }

    private void woodenStairs(Consumer<FinishedRecipe> con, ItemLike out, ItemLike in) {
        ShapedRecipeBuilder.shaped(out, 4).define('#', in)
        .pattern("#  ")
        .pattern("## ")
        .pattern("###")
        .group("wooden_stairs").unlockedBy("has_planks", has(in)).save(con);
    }

    private void woodenTrapdoor(Consumer<FinishedRecipe> con, ItemLike out, ItemLike in) {
        ShapedRecipeBuilder.shaped(out, 2).define('#', in)
        .pattern("###")
        .pattern("###")
        .group("wooden_trapdoor").unlockedBy("has_planks", has(in)).save(con);
    }
    private void pickAxe(Consumer<FinishedRecipe> con,ItemLike out,ItemLike in) {
        ShapedRecipeBuilder.shaped(out).define('#', Items.STICK).define('W', in)
        .pattern("WWW")
        .pattern(" # ")
        .pattern(" # ")
        .unlockedBy(has+name(in), has(in)).save(con);
    }
    private void addition(Consumer<FinishedRecipe> con,ItemLike out,int count,ItemLike in1,ItemLike in2) {
        ShapelessRecipeBuilder.shapeless(out,count)
        .requires(in1).requires(in2)
        .unlockedBy(has+name(in1), has(in1))
        .unlockedBy(has+name(in2), has(in2))
        .save(con, Stil.prefix(name(out))+from+name(in1)+"_plus_"+name(in2));
    }
    private void smelting(Consumer<FinishedRecipe> con, ItemLike out,ItemLike in,float exp,int time) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(in),out,exp,time)
        .unlockedBy(has+name(in), has(in))
        .save(con,Stil.prefix(name(out))+"_from_smelting");
    }
    private void smelting(Consumer<FinishedRecipe> con, ItemLike out,ItemLike in,float exp,int time,String group) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(in),out,exp,time)
        .unlockedBy(has+name(in), has(in)).group(group)
        .save(con,Stil.prefix(name(out))+"_from_smelting_from_"+name(in));
    }
    private void blasting(Consumer<FinishedRecipe> con, ItemLike out,ItemLike in,float exp,int time) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(in),out,exp,time)
        .unlockedBy(has+name(in), has(in))
        .save(con,Stil.prefix(name(out))+"_from_blasting");
    }
    private void blasting(Consumer<FinishedRecipe> con, ItemLike out,ItemLike in,float exp,int time,String group) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(in),out,exp,time)
        .unlockedBy(has+name(in), has(in)).group(group)
        .save(con,Stil.prefix(name(out))+"_from_blasting_from_"+name(in));
    }
    private void shapeless(Consumer<FinishedRecipe> con, ItemLike out, int count, ItemLike in) {
        ShapelessRecipeBuilder.shapeless(out,count)
        .requires(in)
        .unlockedBy(has+name(in), has(in)).save(con, Stil.prefix(name(out))+from+name(in));
    }
    private void shapeless(Consumer<FinishedRecipe> con,ItemLike out, int count,ItemLike in, String group) {
        ShapelessRecipeBuilder.shapeless(out,count)
        .requires(in).group(group)
        .unlockedBy(has+name(in), has(in)).save(con, Stil.prefix(name(out))+from+name(in));
    }
    private void stoneCut(Consumer<FinishedRecipe> con, ItemLike out, int count, ItemLike in) {
        if(count<=1) {
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(in),out)
            .unlockedBy(has+name(in), has(in)).save(con, Stil.prefix(name(out))+from+name(in)+"_stonecutting");
        }else{
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(in),out,count)
            .unlockedBy(has+name(in), has(in)).save(con, Stil.prefix(name(out))+from+name(in)+"_stonecutting");
        }
    }
    @Override
    protected void finalize() throws Throwable {
        System.gc();
    }
}
