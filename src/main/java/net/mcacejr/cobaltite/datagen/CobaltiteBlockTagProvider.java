package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CobaltiteBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public CobaltiteBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {

        super(output, registriesFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE)
                .add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

        getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES)
                .add(CobaltiteBlocks.COBALT_ORE)
                .add(CobaltiteBlocks.OPAL_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(CobaltiteBlocks.COBALT_ORE)
                .add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE)
                .add(CobaltiteBlocks.OPAL_ORE)
                .add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(CobaltiteBlocks.COBALT_ORE)
                .add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE)
                .add(CobaltiteBlocks.OPAL_ORE)
                .add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

    }

}
