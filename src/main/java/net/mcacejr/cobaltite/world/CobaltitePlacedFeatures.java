package net.mcacejr.cobaltite.world;

import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class CobaltitePlacedFeatures {
    public static final ResourceKey<PlacedFeature> ORE_COBALT = register("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> ORE_OPAL = register("opal_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<Feature> configuredFeatures = context.lookup(Registries.FEATURE);
        Holder.Reference<Feature> oreCobalt = configuredFeatures.getOrThrow(CobaltiteOreFeatures.ORE_COBALT);
        Holder.Reference<Feature> oreOpal = configuredFeatures.getOrThrow(CobaltiteOreFeatures.ORE_OPAL);

        PlacementUtils.register(context, ORE_COBALT, oreCobalt,
                CobaltiteOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(100))));

        PlacementUtils.register(context, ORE_OPAL, oreOpal,
                CobaltiteOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-70), VerticalAnchor.absolute(5))));
    }

    public static ResourceKey<PlacedFeature> register(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key));
    }
}
