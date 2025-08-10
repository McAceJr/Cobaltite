package net.mcacejr.cobaltite.world;

import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class CobaltitePlacedFeatures {

    public static final RegistryKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");

    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {

        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CobaltiteConfiguredFeatures.COBALT_ORE_KEY),
                CobaltiteOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-60), YOffset.fixed(100))));

        register(context, OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CobaltiteConfiguredFeatures.OPAL_ORE_KEY),
                CobaltiteOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-70), YOffset.fixed(5))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {

        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Cobaltite.MOD_ID, name));

    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {

        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));

    }

}
