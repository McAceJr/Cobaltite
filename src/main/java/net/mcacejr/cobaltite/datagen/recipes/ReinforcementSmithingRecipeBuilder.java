package net.mcacejr.cobaltite.datagen.recipes;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.recipe.ReinforcementSmithingRecipe;
import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

import java.util.Optional;

public class ReinforcementSmithingRecipeBuilder {
    private final Ingredient template;
    private final Ingredient base;
    private final Ingredient addition;
    private final RecipeCategory category;
    private final ItemStackTemplate result;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();

    public ReinforcementSmithingRecipeBuilder(Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, ItemStackTemplate result) {
        this.category = category;
        this.template = template;
        this.base = base;
        this.addition = addition;
        this.result = result;
    }

    public static ReinforcementSmithingRecipeBuilder reinforcement(Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result) {
        return new ReinforcementSmithingRecipeBuilder(template, base, addition, category, new ItemStackTemplate(result));
    }

    public ReinforcementSmithingRecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    public void save(RecipeOutput output, String id) {
        this.save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, id)));
    }

    public void save(RecipeOutput output, ResourceKey<Recipe<?>> id) {
        ReinforcementSmithingRecipe recipe = new ReinforcementSmithingRecipe(new Recipe.CommonInfo(true), Optional.of(this.template), this.base, Optional.of(this.addition), this.result);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, this.category));
    }
}
