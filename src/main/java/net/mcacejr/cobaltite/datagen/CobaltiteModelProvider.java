package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Items;

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

        itemModelGenerator.register(CobaltiteItems.REINFORCEMENT_TEMPLATE, Models.GENERATED);

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

        itemModelGenerator.register(CobaltiteItems.REINFORCED_IRON_SWORD, Items.IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_IRON_SHOVEL, Items.IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_IRON_PICKAXE, Items.IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_IRON_AXE, Items.IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_IRON_HOE, Items.IRON_HOE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_DIAMOND_SWORD, Items.DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_DIAMOND_SHOVEL, Items.DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_DIAMOND_PICKAXE, Items.DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_DIAMOND_AXE, Items.DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_DIAMOND_HOE, Items.DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_GOLDEN_SWORD, Items.GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_GOLDEN_SHOVEL, Items.GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_GOLDEN_PICKAXE, Items.GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_GOLDEN_AXE, Items.GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_GOLDEN_HOE, Items.GOLDEN_HOE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_NETHERITE_SWORD, Items.NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_NETHERITE_SHOVEL, Items.NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_NETHERITE_PICKAXE, Items.NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_NETHERITE_AXE, Items.NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(CobaltiteItems.REINFORCED_NETHERITE_HOE, Items.NETHERITE_HOE, Models.HANDHELD);
    }

}
