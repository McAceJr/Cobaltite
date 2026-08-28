package net.mcacejr.cobaltite.item.recipe;

import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class CobaltiteRecipeSerializers {
    public static final RecipeSerializer<ReinforcementSmithingRecipe> REINFORCEMENT_SMITHING_RECIPE_SERIALIZER = registerRecipeSerializer(
            "reinforcement_smithing",
            ReinforcementSmithingRecipe.SERIALIZER
    );

    public static <S extends RecipeSerializer<T>, T extends Recipe<?>> S registerRecipeSerializer(String key, S recipeSerializer) {
        return Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key), recipeSerializer);
    }

    public static void registerRecipeSerializers() {
        Cobaltite.LOGGER.info("Registering Recipe Serializers for " + Cobaltite.MOD_ID);
    }
}
