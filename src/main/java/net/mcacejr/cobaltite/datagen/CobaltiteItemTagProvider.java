package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CobaltiteItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public CobaltiteItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {

    }
}