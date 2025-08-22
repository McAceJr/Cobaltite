package net.mcacejr.cobaltite.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum CobaltiteToolMaterials implements ToolMaterial {
    REINFORCED_IRON(500, 6.0F, 2.0F, 2, 13,
            () -> Ingredient.ofItems(CobaltiteItems.COBALT_INGOT, Items.IRON_INGOT)),
    REINFORCED_DIAMOND(2061, 8.0F, 3.0F, 3, 9,
            () -> Ingredient.ofItems(CobaltiteItems.COBALT_INGOT, Items.DIAMOND)),
    REINFORCED_GOLD(82, 12.0F, 0.0F, 0, 21,
            () -> Ingredient.ofItems(CobaltiteItems.COBALT_INGOT, Items.GOLD_INGOT)),
    REINFORCED_NETHERITE(2781, 9.0F, 4.0F, 4, 14,
            () -> Ingredient.ofItems(CobaltiteItems.COBALT_INGOT, Items.NETHERITE_INGOT));

    private final int toolDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    CobaltiteToolMaterials(int toolDurability, float miningSpeed, float attackDamage, int miningLevel,
                           int enchantability, Supplier<Ingredient> repairIngredient) {

        this.toolDurability = toolDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;

    }

    @Override
    public int getDurability() {
        return this.toolDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
