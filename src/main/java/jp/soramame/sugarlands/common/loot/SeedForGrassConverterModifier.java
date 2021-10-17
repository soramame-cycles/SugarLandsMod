package jp.soramame.sugarlands.common.loot;

import java.util.List;

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

public class SeedForGrassConverterModifier extends LootModifier {

	private final Item itemToCheck;
	private final Item itemReward;
	private final int numSeedsToConvert;

	public SeedForGrassConverterModifier(ILootCondition[] conditionsIn,int numSeeds,Item itemCheck, Item reward) {
		super(conditionsIn);
		itemToCheck = itemCheck;
		itemReward = reward;
		numSeedsToConvert = numSeeds;
	}

	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		int numSeeds = 0;
		for(ItemStack stack : generatedLoot) {
			if(stack.getItem() == itemToCheck)
				numSeeds+=stack.getCount();
		}
		if(numSeeds >= numSeedsToConvert) {
			generatedLoot.removeIf(x -> x.getItem() == itemToCheck);
			generatedLoot.add(new ItemStack(itemReward, (numSeeds/numSeedsToConvert)));
			numSeeds = numSeeds%numSeedsToConvert;
			if(numSeeds > 0)
				generatedLoot.add(new ItemStack(itemToCheck, numSeeds));
		}
		return generatedLoot;
	}

	public static class Serializer extends GlobalLootModifierSerializer<SeedForGrassConverterModifier>{

		@Override
		public SeedForGrassConverterModifier read(ResourceLocation location, JsonObject object,
				ILootCondition[] ailootcondition) {
			int numSeeds = JSONUtils.getAsInt(object, "numSeeds");
			Item seed = ForgeRegistries.ITEMS.getValue(new ResourceLocation((JSONUtils.getAsString(object, "seedItem"))));
			Item reward = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getAsString(object, "replacement")));
			return new SeedForGrassConverterModifier(ailootcondition, numSeeds, seed, reward);
		}

		@Override
		public JsonObject write(SeedForGrassConverterModifier instance) {
			JsonObject json = makeConditions(instance.conditions);
			json.addProperty("numSeeds", instance.numSeedsToConvert);
			json.addProperty("seedItem", ForgeRegistries.ITEMS.getKey(instance.itemToCheck).toString());
			json.addProperty("replacement", ForgeRegistries.ITEMS.getKey(instance.itemReward).toString());
			return json;
		}

	}

	public static SeedForGrassConverterModifier.Builder test(){
		return new SeedForGrassConverterModifier.Builder();

	}

	public static class Builder{
		private Item seeditem;
		private Item itemreward;
		private int numseed = 0;

		public SeedForGrassConverterModifier.Builder SeedItem(Item seed){
			this.seeditem = seed;
			return this;
		}
		public SeedForGrassConverterModifier.Builder NumSeed(int num) {
			this.numseed = num;
			return this;
		}
		public SeedForGrassConverterModifier.Builder ItemReward(Item reward){
			this.itemreward = reward;
			return this;
		}

		public SeedForGrassConverterModifier build() {
			return new SeedForGrassConverterModifier(new ILootCondition[0], numseed, seeditem, itemreward);
		}
	}

}
