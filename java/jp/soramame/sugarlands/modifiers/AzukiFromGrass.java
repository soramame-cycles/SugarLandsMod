package jp.soramame.sugarlands.modifiers;

import java.util.List;
import java.util.Random;

import com.google.gson.JsonObject;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class AzukiFromGrass extends LootModifier {
    private int count;
    private Item subject;
    private Item result;

    protected AzukiFromGrass(ILootCondition[] conditionsIn, Item sub, Item res, int cou) {
        super(conditionsIn);
        this.subject = sub;
        this.result = res;
        this.count = cou;
    }

    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        Random rand = new Random();
        generatedLoot.removeIf(x -> x.getItem() == this.subject);
        generatedLoot.add(new ItemStack(this.result, rand.nextInt(count) + 1));
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<AzukiFromGrass> {

        @Override
        public AzukiFromGrass read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
            Item seed = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getAsString(object, "seedItem")));
            Item azuki = ForgeRegistries.ITEMS
                    .getValue(new ResourceLocation(JSONUtils.getAsString(object, "replacement")));
            return new AzukiFromGrass(ailootcondition, seed, azuki, 3);
        }

        @Override
        public JsonObject write(AzukiFromGrass instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("seedItem", ForgeRegistries.ITEMS.getKey(instance.subject).toString());
            json.addProperty("replacement", ForgeRegistries.ITEMS.getKey(instance.result).toString());
            return json;
        }
    }
}
