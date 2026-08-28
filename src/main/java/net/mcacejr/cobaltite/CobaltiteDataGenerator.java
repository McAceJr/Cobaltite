package net.mcacejr.cobaltite;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.mcacejr.cobaltite.datagen.*;
import net.mcacejr.cobaltite.world.CobaltiteOreFeatures;
import net.mcacejr.cobaltite.world.CobaltitePlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import org.jspecify.annotations.NonNull;

public class CobaltiteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		FabricTagsProvider.BlockTagsProvider blockTagsProvider = pack.addProvider(CobaltiteBlockTagProvider::new);
		pack.addProvider((output, registriesFuture) -> new CobaltiteItemTagProvider(output, registriesFuture, blockTagsProvider));
		// pack.addProvider(CobaltiteLootTableProvider::new);
		pack.addProvider(CobaltiteModelProvider::new);
		pack.addProvider(CobaltiteRecipeProvider::new);
		pack.addProvider(CobaltiteDynamicRegistryProvider::new);
	}

	@Override
	public void buildRegistry(@NonNull RegistrySetBuilder registrySetBuilder) {
		registrySetBuilder.add(Registries.FEATURE, CobaltiteOreFeatures::bootstrap);
		registrySetBuilder.add(Registries.PLACED_FEATURE, CobaltitePlacedFeatures::bootstrap);
	}
}
