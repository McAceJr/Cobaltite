package net.mcacejr.cobaltite.world;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.HeightMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class CobaltiteOreFeatures {
    public static final ResourceKey<Feature> ORE_COBALT = register("ore_cobalt");
    public static final ResourceKey<Feature> ORE_OPAL = register("ore_opal");

    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest stoneOreReplaceables = RuleTest.either(new TagMatchTest(BlockTags.HEIGHT_SPECIFIC_ORE_REPLACEABLES), HeightMatchTest.min(0), new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES));
        RuleTest deepslateOreReplaceables = RuleTest.either(new TagMatchTest(BlockTags.HEIGHT_SPECIFIC_ORE_REPLACEABLES), HeightMatchTest.max(8), new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES));

        List<BlockReplacement> cobaltOres = List.of(
                BlockReplacement.replace(stoneOreReplaceables, CobaltiteBlocks.COBALT_ORE.defaultBlockState()),
                BlockReplacement.replace(deepslateOreReplaceables, CobaltiteBlocks.DEEPSLATE_COBALT_ORE.defaultBlockState()));

        List<BlockReplacement> opalOres = List.of(
                BlockReplacement.replace(stoneOreReplaceables, CobaltiteBlocks.OPAL_ORE.defaultBlockState()),
                BlockReplacement.replace(deepslateOreReplaceables, CobaltiteBlocks.DEEPSLATE_OPAL_ORE.defaultBlockState()));

        context.register(ORE_COBALT, new OreFeature(cobaltOres, 8));
        context.register(ORE_OPAL, new OreFeature(opalOres, 5));
    }

    public static ResourceKey<Feature> register(String key) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key));
    }
}
