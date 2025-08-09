package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class CobaltiteRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> COBALT_SMELTABLES = List.of (
            CobaltiteItems.RAW_COBALT,
            CobaltiteBlocks.COBALT_ORE,
            CobaltiteBlocks.DEEPSLATE_COBALT_ORE
    );
    private static final List<ItemConvertible> OPAL_SMELTABLES = List.of (
            CobaltiteBlocks.OPAL_ORE,
            CobaltiteBlocks.DEEPSLATE_OPAL_ORE
    );

    public CobaltiteRecipeProvider(FabricDataOutput output) {

        super (output);

    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, COBALT_SMELTABLES , RecipeCategory.MISC, CobaltiteItems.COBALT_INGOT, 0.7f, 200, "cobalt_ingot");
        offerSmelting(exporter, OPAL_SMELTABLES , RecipeCategory.MISC, CobaltiteItems.OPAL, 1.0f, 200, "opal");

        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, CobaltiteItems.COBALT_INGOT, 0.7f, 100, "cobalt_ingot");
        offerBlasting(exporter, OPAL_SMELTABLES, RecipeCategory.MISC, CobaltiteItems.OPAL, 0.7f, 100, "opal");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, CobaltiteItems.RAW_COBALT, RecipeCategory.MISC, CobaltiteBlocks.RAW_COBALT_BLOCK);

        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, RecipeCategory.MISC, CobaltiteItems.COBALT_INGOT, RecipeCategory.MISC,
                CobaltiteBlocks.COBALT_BLOCK, "cobalt_ingot_to_block", "cobalt_ingot_and_block");
        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, RecipeCategory.MISC, CobaltiteItems.COBALT_NUGGET, RecipeCategory.MISC,
                CobaltiteItems.COBALT_INGOT, "cobalt_nugget_to_ingot", "cobalt_ingot_and_nugget");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, CobaltiteItems.OPAL, RecipeCategory.MISC, CobaltiteBlocks.OPAL_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.MISC, CobaltiteBlocks.POLISHED_OPAL_BLOCK, CobaltiteBlocks.OPAL_BLOCK);

    }

}
