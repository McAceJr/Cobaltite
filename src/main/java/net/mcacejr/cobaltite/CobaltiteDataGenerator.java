package net.mcacejr.cobaltite;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mcacejr.cobaltite.datagen.*;
import net.mcacejr.cobaltite.world.CobaltiteConfiguredFeatures;
import net.mcacejr.cobaltite.world.CobaltitePlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class CobaltiteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CobaltiteBlockTagProvider::new);
		pack.addProvider(CobaltiteItemTagProvider::new);
		pack.addProvider(CobaltiteLootTableProvider::new);
		pack.addProvider(CobaltiteModelProvider::new);
		pack.addProvider(CobaltiteRecipeProvider::new);
		pack.addProvider(CobaltiteWorldGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, CobaltiteConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, CobaltitePlacedFeatures::boostrap);
	}
}
