package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CobaltiteItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public CobaltiteItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {

        super (output, completableFuture);

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        

    }

}