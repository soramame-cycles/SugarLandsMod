package jp.soramame.sugarlands.common.loot;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.LootModifier;

public class SeedForGrassConverterModifier extends LootModifier {

	@SuppressWarnings("unused")
	private final Item itemToCheck;
	@SuppressWarnings("unused")
	private final Item itemReward;

	public SeedForGrassConverterModifier(ILootCondition[] conditionsIn,Item itemCheck, Item reward) {
		super(conditionsIn);
		itemToCheck = itemCheck;
		itemReward = reward;
	}

	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		return generatedLoot;
	}

}
