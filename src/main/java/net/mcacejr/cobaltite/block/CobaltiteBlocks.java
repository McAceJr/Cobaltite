package net.mcacejr.cobaltite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CobaltiteBlocks {

    public static final Block COBALT_ORE = registerBlock("cobalt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));

    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE)));

    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));

    public static final Block DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));



    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Cobaltite.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(Cobaltite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {

        Cobaltite.LOGGER.info("Registering Cobaltite Blocks for " + Cobaltite.MOD_ID);

    }

}
