package net.mcacejr.cobaltite.world;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class CobaltiteConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registryKey("cobalt_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registryKey("opal_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> CobaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, CobaltiteBlocks.COBALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, CobaltiteBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> OpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, CobaltiteBlocks.OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, CobaltiteBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));

        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(CobaltOres, 8));
        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(OpalOres, 5));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {

        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Cobaltite.MOD_ID, name));

    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature,
                                                                                   FC configuration) {

        context.register(key, new ConfiguredFeature<>(feature, configuration));

    }

}
