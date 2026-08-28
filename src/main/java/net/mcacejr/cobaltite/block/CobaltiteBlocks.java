package net.mcacejr.cobaltite.block;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class CobaltiteBlocks {
    public static final Block COBALT_ORE = registerBlock(
            CobaltiteBlockItemIds.COBALT_ORE,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)
    );

    public static final Block DEEPSLATE_COBALT_ORE = registerBlock(
            CobaltiteBlockItemIds.DEEPSLATE_COBALT_ORE,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)
    );

    public static final Block OPAL_ORE = registerBlock(
            CobaltiteBlockItemIds.OPAL_ORE,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)
    );

    public static final Block DEEPSLATE_OPAL_ORE = registerBlock(
            CobaltiteBlockItemIds.DEEPSLATE_OPAL_ORE,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)
    );

    public static final Block RAW_COBALT_BLOCK = registerBlock(
            CobaltiteBlockItemIds.RAW_COBALT_BLOCK,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK)
    );

    public static final Block COBALT_BLOCK = registerBlock(
            CobaltiteBlockItemIds.COBALT_BLOCK,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)
    );

    public static final Block OPAL_BLOCK = registerBlock(
            CobaltiteBlockItemIds.OPAL_BLOCK,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)
    );

    public static final Block POLISHED_OPAL_BLOCK = registerBlock(
            CobaltiteBlockItemIds.POLISHED_OPAL_BLOCK,
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)
    );

    public static Block registerBlock(BlockItemId key, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties, boolean registerItem) {
        Block block = blockFactory.apply(properties.setId(key.block()));
        if (registerItem) {
            registerBlockItem(key, block);
        }
        return Registry.register(BuiltInRegistries.BLOCK, key.block(), block);
    }

    public static Block registerBlock(BlockItemId key, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        return registerBlock(key, blockFactory, properties, true);
    }

    public static void registerBlockItem(BlockItemId key, Block block) {
        CobaltiteItems.registerItem(key.item(), properties -> new BlockItem(block, properties), new Item.Properties());
    }

    public static void registerModBlocks() {
        Cobaltite.LOGGER.info("Registering Cobaltite Blocks for " + Cobaltite.MOD_ID);
    }

}
