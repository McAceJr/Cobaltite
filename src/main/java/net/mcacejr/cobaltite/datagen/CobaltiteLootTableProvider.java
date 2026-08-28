package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.core.HolderLookup;


import java.util.concurrent.CompletableFuture;

public class CobaltiteLootTableProvider extends FabricBlockLootSubProvider {
    public CobaltiteLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        this.add(CobaltiteBlocks.COBALT_ORE, this.createOreDrop(CobaltiteBlocks.COBALT_ORE, CobaltiteItems.RAW_COBALT));
        this.add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE, this.createOreDrop(CobaltiteBlocks.DEEPSLATE_COBALT_ORE, CobaltiteItems.RAW_COBALT));

        this.add(CobaltiteBlocks.OPAL_ORE, this.createOreDrop(CobaltiteBlocks.OPAL_ORE, CobaltiteItems.OPAL));
        this.add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE, this.createOreDrop(CobaltiteBlocks.DEEPSLATE_OPAL_ORE, CobaltiteItems.OPAL));

        this.dropSelf(CobaltiteBlocks.RAW_COBALT_BLOCK);
        this.dropSelf(CobaltiteBlocks.COBALT_BLOCK);

        this.dropSelf(CobaltiteBlocks.OPAL_BLOCK);
        this.dropSelf(CobaltiteBlocks.POLISHED_OPAL_BLOCK);
    }
}
