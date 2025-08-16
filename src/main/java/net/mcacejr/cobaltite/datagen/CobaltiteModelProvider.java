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

        itemModelGenerator.register(CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.ART_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.BUMPY_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.BLOBS2_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.PENCIL_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.COLOR_CONVOLVE_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.DECONVERGE_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.FLIP_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.INVERT_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.NTSC_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.PHOSPHOR_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.SCAN_PINCUSHION_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.SOBEL_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.BITS_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.DESATURATE_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.GREEN_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.WOBBLE_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.BLOBS_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.CREEPER_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.SPIDER_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);
        itemModelGenerator.register(CobaltiteItems.BLINDING_KALEIDOSCOPE, CobaltiteItems.NOTCH_KALEIDOSCOPE, Models.GENERATED);

    }

}
