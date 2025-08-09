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

    }

}
