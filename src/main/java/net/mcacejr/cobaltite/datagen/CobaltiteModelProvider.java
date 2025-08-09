package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CobaltiteModelProvider extends FabricModelProvider {

    public CobaltiteModelProvider(FabricDataOutput output) {

        super (output);

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.DEEPSLATE_COBALT_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.OPAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.RAW_COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.COBALT_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.OPAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(CobaltiteBlocks.POLISHED_OPAL_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(CobaltiteItems.RAW_COBALT, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.COBALT_INGOT, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.COBALT_NUGGET, Models.GENERATED);

        itemModelGenerator.register(CobaltiteItems.OPAL, Models.GENERATED);

    }

}
