package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

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

    public static void offerReinforcementRecipe(Consumer<RecipeJsonProvider> exporter, Item nonReinforcedItem, Item reinforcedItem) {

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(CobaltiteItems.REINFORCEMENT_TEMPLATE),
                Ingredient.ofItems(nonReinforcedItem), Ingredient.ofItems(CobaltiteItems.COBALT_INGOT),
                RecipeCategory.TOOLS, reinforcedItem)
                .criterion(hasItem(CobaltiteItems.REINFORCEMENT_TEMPLATE), conditionsFromItem(CobaltiteItems.REINFORCEMENT_TEMPLATE))
                .offerTo(exporter, getItemPath(reinforcedItem) + "_smithing");

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

        offerKaleidoscope(exporter, Items.ENCHANTED_GOLDEN_APPLE, CobaltiteItems.NOTCH_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.PAINTING, CobaltiteItems.ART_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.RAW_COPPER, CobaltiteItems.BUMPY_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.RAW_GOLD, CobaltiteItems.BLOBS2_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.FLINT, CobaltiteItems.PENCIL_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.POPPY, CobaltiteItems.COLOR_CONVOLVE_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.ENDER_PEARL, CobaltiteItems.DECONVERGE_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.DAYLIGHT_DETECTOR, CobaltiteItems.FLIP_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.ENDER_EYE, CobaltiteItems.INVERT_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.GRAY_STAINED_GLASS_PANE, CobaltiteItems.NTSC_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.SLIME_BALL, CobaltiteItems.PHOSPHOR_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, CobaltiteItems.SCAN_PINCUSHION_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.WITHER_SKELETON_SKULL, CobaltiteItems.SOBEL_KALEIDOSCOPE);
        offerKaleidoscope(exporter, CobaltiteItems.COBALT_NUGGET, CobaltiteItems.BITS_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.GRAY_DYE, CobaltiteItems.DESATURATE_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.GREEN_STAINED_GLASS_PANE, CobaltiteItems.GREEN_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.RED_MUSHROOM, CobaltiteItems.WOBBLE_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.RAW_IRON, CobaltiteItems.BLOBS_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.CREEPER_HEAD, CobaltiteItems.CREEPER_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Items.FERMENTED_SPIDER_EYE, CobaltiteItems.SPIDER_KALEIDOSCOPE);
        offerKaleidoscope(exporter, Blocks.OBSIDIAN, CobaltiteItems.BLINDING_KALEIDOSCOPE);

        offerReinforcementRecipe(exporter, Items.IRON_SWORD, CobaltiteItems.REINFORCED_IRON_SWORD);
        offerReinforcementRecipe(exporter, Items.IRON_SHOVEL, CobaltiteItems.REINFORCED_IRON_SHOVEL);
        offerReinforcementRecipe(exporter, Items.IRON_PICKAXE, CobaltiteItems.REINFORCED_IRON_PICKAXE);
        offerReinforcementRecipe(exporter, Items.IRON_AXE, CobaltiteItems.REINFORCED_IRON_AXE);
        offerReinforcementRecipe(exporter, Items.IRON_HOE, CobaltiteItems.REINFORCED_IRON_HOE);
        offerReinforcementRecipe(exporter, Items.DIAMOND_SWORD, CobaltiteItems.REINFORCED_DIAMOND_SWORD);
        offerReinforcementRecipe(exporter, Items.DIAMOND_SHOVEL, CobaltiteItems.REINFORCED_DIAMOND_SHOVEL);
        offerReinforcementRecipe(exporter, Items.DIAMOND_PICKAXE, CobaltiteItems.REINFORCED_DIAMOND_PICKAXE);
        offerReinforcementRecipe(exporter, Items.DIAMOND_AXE, CobaltiteItems.REINFORCED_DIAMOND_AXE);
        offerReinforcementRecipe(exporter, Items.DIAMOND_HOE, CobaltiteItems.REINFORCED_DIAMOND_HOE);
        offerReinforcementRecipe(exporter, Items.GOLDEN_SWORD, CobaltiteItems.REINFORCED_GOLDEN_SWORD);
        offerReinforcementRecipe(exporter, Items.GOLDEN_SHOVEL, CobaltiteItems.REINFORCED_GOLDEN_SHOVEL);
        offerReinforcementRecipe(exporter, Items.GOLDEN_PICKAXE, CobaltiteItems.REINFORCED_GOLDEN_PICKAXE);
        offerReinforcementRecipe(exporter, Items.GOLDEN_AXE, CobaltiteItems.REINFORCED_GOLDEN_AXE);
        offerReinforcementRecipe(exporter, Items.GOLDEN_HOE, CobaltiteItems.REINFORCED_GOLDEN_HOE);;
        offerReinforcementRecipe(exporter, Items.NETHERITE_SWORD, CobaltiteItems.REINFORCED_NETHERITE_SWORD);
        offerReinforcementRecipe(exporter, Items.NETHERITE_SHOVEL, CobaltiteItems.REINFORCED_NETHERITE_SHOVEL);
        offerReinforcementRecipe(exporter, Items.NETHERITE_PICKAXE, CobaltiteItems.REINFORCED_NETHERITE_PICKAXE);
        offerReinforcementRecipe(exporter, Items.NETHERITE_AXE, CobaltiteItems.REINFORCED_NETHERITE_AXE);
        offerReinforcementRecipe(exporter, Items.NETHERITE_HOE, CobaltiteItems.REINFORCED_NETHERITE_HOE);

    }

    public void offerKaleidoscope(Consumer<RecipeJsonProvider> exporter, ItemConvertible ingredient, Item result) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result, 1)
                .pattern("o")
                .pattern("i")
                .pattern("c")
                .input('o', CobaltiteItems.OPAL)
                .input('i', ingredient)
                .input('c', CobaltiteItems.COBALT_INGOT)
                .criterion(hasItem(CobaltiteItems.COBALT_INGOT), conditionsFromItem(CobaltiteItems.COBALT_INGOT))
                .criterion(hasItem(CobaltiteItems.OPAL), conditionsFromItem(CobaltiteItems.OPAL))
                .group("kaleidoscope")
                .offerTo(exporter);
    }

}
