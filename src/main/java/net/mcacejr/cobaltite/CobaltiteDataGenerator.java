package net.mcacejr.cobaltite;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.mcacejr.cobaltite.datagen.*;

public class CobaltiteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(CobaltiteBlockTagProvider::new);
		pack.addProvider(CobaltiteItemTagProvider::new);
		pack.addProvider(CobaltiteLootTableProvider::new);
		pack.addProvider(CobaltiteModelProvider::new);
		pack.addProvider(CobaltiteRecipeProvider::new);

	}
}
