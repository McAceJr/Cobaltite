package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlockItemIds;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class CobaltiteBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

    public CobaltiteBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        this.tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(CobaltiteBlockItemIds.DEEPSLATE_COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.DEEPSLATE_OPAL_ORE.block());

        this.tag(BlockTags.STONE_ORE_REPLACEABLES)
                .add(CobaltiteBlockItemIds.COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.OPAL_ORE.block());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(CobaltiteBlockItemIds.COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.DEEPSLATE_COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.OPAL_ORE.block())
                .add(CobaltiteBlockItemIds.DEEPSLATE_OPAL_ORE.block())
                .add(CobaltiteBlockItemIds.RAW_COBALT_BLOCK.block())
                .add(CobaltiteBlockItemIds.COBALT_BLOCK.block())
                .add(CobaltiteBlockItemIds.OPAL_BLOCK.block())
                .add(CobaltiteBlockItemIds.POLISHED_OPAL_BLOCK.block());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(CobaltiteBlockItemIds.COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.DEEPSLATE_COBALT_ORE.block())
                .add(CobaltiteBlockItemIds.OPAL_ORE.block())
                .add(CobaltiteBlockItemIds.DEEPSLATE_OPAL_ORE.block())
                .add(CobaltiteBlockItemIds.RAW_COBALT_BLOCK.block())
                .add(CobaltiteBlockItemIds.COBALT_BLOCK.block())
                .add(CobaltiteBlockItemIds.OPAL_BLOCK.block())
                .add(CobaltiteBlockItemIds.POLISHED_OPAL_BLOCK.block());
    }
}
