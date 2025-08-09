package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class CobaltiteRecipeProvider extends FabricRecipeProvider {

    public CobaltiteRecipeProvider(FabricDataOutput output) {

        super (output);

    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {



    }

}
