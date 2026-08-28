package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.datagen.recipes.ReinforcementSmithingRecipeBuilder;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CobaltiteRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemLike> COBALT_SMELTABLES = List.of (
            CobaltiteItems.RAW_COBALT,
            CobaltiteBlocks.COBALT_ORE,
            CobaltiteBlocks.DEEPSLATE_COBALT_ORE
    );
    private static final List<ItemLike> OPAL_SMELTABLES = List.of (
            CobaltiteBlocks.OPAL_ORE,
            CobaltiteBlocks.DEEPSLATE_OPAL_ORE
    );

    public CobaltiteRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull BootstrapContext<Recipe<?>> recipes, @NonNull BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                this.oreSmelting(COBALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, CobaltiteItems.COBALT_INGOT, 0.7F, 200, "cobaltite_ingot");
                this.oreSmelting(OPAL_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, CobaltiteItems.COBALT_INGOT, 1.0F, 200, "opal");

                this.oreBlasting(COBALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, CobaltiteItems.COBALT_INGOT, 0.7F, 100, "cobaltite_ingot");
                this.oreBlasting(OPAL_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, CobaltiteItems.COBALT_INGOT, 1.0F, 100, "opal");

                this.nineBlockStorageRecipesWithCustomPacking(RecipeCategory.MISC, CobaltiteItems.RAW_COBALT, RecipeCategory.BUILDING_BLOCKS, CobaltiteBlocks.RAW_COBALT_BLOCK, "raw_cobalt_to_block", "raw_cobalt_and_block");
                this.nineBlockStorageRecipesWithCustomPacking(RecipeCategory.MISC, CobaltiteItems.COBALT_INGOT, RecipeCategory.BUILDING_BLOCKS, CobaltiteBlocks.COBALT_BLOCK, "cobalt_ingot_to_block", "cobalt_block_and_ingot");
                this.nineBlockStorageRecipesWithCustomPacking(RecipeCategory.MISC, CobaltiteItems.COBALT_NUGGET, RecipeCategory.MISC, CobaltiteItems.COBALT_INGOT, "cobalt_nugget_to_ingot", "cobalt_ingot_and_nugget");
                this.nineBlockStorageRecipesWithCustomPacking(RecipeCategory.MISC, CobaltiteItems.OPAL, RecipeCategory.BUILDING_BLOCKS, CobaltiteBlocks.OPAL_BLOCK, "opal_to_block", "opal_and_block");
                this.polished(RecipeCategory.BUILDING_BLOCKS, CobaltiteBlocks.POLISHED_OPAL_BLOCK, CobaltiteBlocks.OPAL_BLOCK);

                this.reinforcement(Items.WOODEN_SWORD);
                this.reinforcement(Items.WOODEN_PICKAXE);
                this.reinforcement(Items.WOODEN_AXE);
                this.reinforcement(Items.WOODEN_SHOVEL);
                this.reinforcement(Items.WOODEN_HOE);
                this.reinforcement(Items.WOODEN_SPEAR);

                this.reinforcement(Items.STONE_SWORD);
                this.reinforcement(Items.STONE_PICKAXE);
                this.reinforcement(Items.STONE_AXE);
                this.reinforcement(Items.STONE_SHOVEL);
                this.reinforcement(Items.STONE_HOE);
                this.reinforcement(Items.STONE_SPEAR);

                this.reinforcement(Items.COPPER_SWORD);
                this.reinforcement(Items.COPPER_PICKAXE);
                this.reinforcement(Items.COPPER_AXE);
                this.reinforcement(Items.COPPER_SHOVEL);
                this.reinforcement(Items.COPPER_HOE);
                this.reinforcement(Items.COPPER_SPEAR);

                this.reinforcement(Items.IRON_SWORD);
                this.reinforcement(Items.IRON_PICKAXE);
                this.reinforcement(Items.IRON_AXE);
                this.reinforcement(Items.IRON_SHOVEL);
                this.reinforcement(Items.IRON_HOE);
                this.reinforcement(Items.IRON_SPEAR);

                this.reinforcement(Items.GOLDEN_SWORD);
                this.reinforcement(Items.GOLDEN_PICKAXE);
                this.reinforcement(Items.GOLDEN_AXE);
                this.reinforcement(Items.GOLDEN_SHOVEL);
                this.reinforcement(Items.GOLDEN_HOE);
                this.reinforcement(Items.GOLDEN_SPEAR);

                this.reinforcement(Items.DIAMOND_SWORD);
                this.reinforcement(Items.DIAMOND_PICKAXE);
                this.reinforcement(Items.DIAMOND_AXE);
                this.reinforcement(Items.DIAMOND_SHOVEL);
                this.reinforcement(Items.DIAMOND_HOE);
                this.reinforcement(Items.DIAMOND_SPEAR);

                this.reinforcement(Items.NETHERITE_SWORD);
                this.reinforcement(Items.NETHERITE_PICKAXE);
                this.reinforcement(Items.NETHERITE_AXE);
                this.reinforcement(Items.NETHERITE_SHOVEL);
                this.reinforcement(Items.NETHERITE_HOE);
                this.reinforcement(Items.NETHERITE_SPEAR);
            }

            public void reinforcement(ItemLike tool) {
                ReinforcementSmithingRecipeBuilder.reinforcement(Ingredient.of(CobaltiteItems.REINFORCEMENT_TEMPLATE), Ingredient.of(tool), Ingredient.of(CobaltiteItems.COBALT_INGOT), RecipeCategory.TOOLS, tool.asItem())
                        .unlockedBy(getHasName(tool), has(tool))
                        .save(this.output, RecipeProvider.getItemName(tool) + "_reinforcement");
            }
        };
    }
}