package jp.soramame.sugarlands.item;

import java.util.function.Supplier;

import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum SLItemTier implements IItemTier {

    BISMUTH_CRYSTAL(1500,5F,5F,3,20,()->Ingredient.of(SLItems.Bismuth_Crystal.get())),
    SUGAR_DIAMOND(1400,8F,3F,3,15,()->Ingredient.of(SLItems.Sugar_Diamond.get()));

    private int uses;
    private float speed;
    private float attackDamageBonus;
    private int level;
    private int enchantmentValue;
    private LazyValue<Ingredient> repairIngredient;


    private SLItemTier(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue,
            Supplier<Ingredient> repairIngredient) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
