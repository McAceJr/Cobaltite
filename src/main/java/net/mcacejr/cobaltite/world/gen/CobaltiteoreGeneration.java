package net.mcacejr.cobaltite.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mcacejr.cobaltite.world.CobaltitePlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class CobaltiteoreGeneration {

    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, CobaltitePlacedFeatures.COBALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, CobaltitePlacedFeatures.OPAL_ORE_PLACED_KEY);

    }

}
