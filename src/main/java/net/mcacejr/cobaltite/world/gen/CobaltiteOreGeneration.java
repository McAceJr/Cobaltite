package net.mcacejr.cobaltite.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mcacejr.cobaltite.world.CobaltitePlacedFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;

public class CobaltiteOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES, CobaltitePlacedFeatures.ORE_COBALT);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES, CobaltitePlacedFeatures.ORE_OPAL);

    }

}
