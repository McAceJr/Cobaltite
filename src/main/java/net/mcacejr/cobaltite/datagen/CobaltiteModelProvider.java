package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class CobaltiteModelProvider extends FabricModelProvider {

    public CobaltiteModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerator) {
        blockModelGenerator.createTrivialCube(CobaltiteBlocks.COBALT_ORE);
        blockModelGenerator.createTrivialCube(CobaltiteBlocks.DEEPSLATE_COBALT_ORE);

        blockModelGenerator.createTrivialCube(CobaltiteBlocks.OPAL_ORE);
        blockModelGenerator.createTrivialCube(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

        blockModelGenerator.createTrivialCube(CobaltiteBlocks.RAW_COBALT_BLOCK);
        blockModelGenerator.createTrivialCube(CobaltiteBlocks.COBALT_BLOCK);

        blockModelGenerator.createTrivialCube(CobaltiteBlocks.OPAL_BLOCK);
        blockModelGenerator.createTrivialCube(CobaltiteBlocks.POLISHED_OPAL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(CobaltiteItems.RAW_COBALT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CobaltiteItems.COBALT_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CobaltiteItems.COBALT_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CobaltiteItems.OPAL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(CobaltiteItems.REINFORCEMENT_TEMPLATE, ModelTemplates.FLAT_ITEM);
    }

}
