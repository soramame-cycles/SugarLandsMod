package jp.soramame.sugarlands.item;

import jp.soramame.sugarlands.init.SLItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public enum SLItemTier implements Tier {

    BISMUTH_CRYSTAL(1500,5F,5F,3,20,SLItems.Bismuth_Crystal.get()),
    SUGAR_DIAMOND(1400,8F,3F,3,15,SLItems.Sugar_Diamond.get());

    private int uses;
    private float speed;
    private float attackDamageBonus;
    private int level;
    private int enchantmentValue;
    private ItemLike repair;

    private SLItemTier(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue,
            ItemLike repairIngredient) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repair = repairIngredient;

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
        return Ingredient.of(this.repair);
    }



}
