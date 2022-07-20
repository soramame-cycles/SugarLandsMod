package jp.soramame.sugarlands.modifiers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import jp.soramame.sugarlands.SugarLandsCore;
import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.advancements.critereon.ItemPredicate.Builder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;

public class AzukiFromGrass extends LootModifier {
    public static final Codec<AzukiFromGrass> CODEC = RecordCodecBuilder
            .create(inst -> codecStart(inst).apply(inst, AzukiFromGrass::new));

    public AzukiFromGrass(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    public AzukiFromGrass() {
        this(new LootItemCondition[] {
                MatchTool.toolMatches(Builder.item().of(SLItems.Sugar_Diamond_Pickaxe.get())).build(),
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build()
        });
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        boolean remove = generatedLoot.removeIf(x -> x.getItem() == Items.WHEAT_SEEDS);
        SugarLandsCore.LOGGER.debug("remove wheat_seed:" + remove);
        if (remove) {
            boolean add = generatedLoot
                    .add(new ItemStack(SLItems.Azuki_Been.get(), context.getRandom().nextInt(3) + 1));
            SugarLandsCore.LOGGER.debug("add azuki:" + add);
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
