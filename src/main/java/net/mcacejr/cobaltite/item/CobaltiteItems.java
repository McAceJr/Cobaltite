package net.mcacejr.cobaltite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.custom.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

public class CobaltiteItems {

    public static final Item RAW_COBALT = registerItem("raw_cobalt",
            new Item(new Item.Settings().fireproof()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new Item.Settings().fireproof()));

    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget",
            new Item(new Item.Settings().fireproof()));

    public static final Item OPAL = registerItem("opal",
            new Item(new Item.Settings()));

    public static final Item NOTCH_KALEIDOSCOPE = registerItem("notch_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.NOTCH, new Item.Settings()));
    public static final Item ART_KALEIDOSCOPE = registerItem("art_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.ART, new Item.Settings()));
    public static final Item BUMPY_KALEIDOSCOPE = registerItem("bumpy_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BUMPY, new Item.Settings()));
    public static final Item BLOBS2_KALEIDOSCOPE = registerItem("blobs2_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BLOBS2, new Item.Settings()));
    public static final Item PENCIL_KALEIDOSCOPE = registerItem("pencil_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.PENCIL, new Item.Settings()));
    public static final Item COLOR_CONVOLVE_KALEIDOSCOPE = registerItem("color_convolve_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.COLOR_CONVOLVE, new Item.Settings()));
    public static final Item DECONVERGE_KALEIDOSCOPE = registerItem("deconverge_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.DECONVERGE, new Item.Settings()));
    public static final Item FLIP_KALEIDOSCOPE = registerItem("flip_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.FLIP, new Item.Settings()));
    public static final Item INVERT_KALEIDOSCOPE = registerItem("invert_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.INVERT, new Item.Settings()));
    public static final Item NTSC_KALEIDOSCOPE = registerItem("ntsc_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.NTSC, new Item.Settings()));
    public static final Item PHOSPHOR_KALEIDOSCOPE = registerItem("phosphor_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.PHOSPHOR, new Item.Settings()));
    public static final Item SCAN_PINCUSHION_KALEIDOSCOPE = registerItem("scan_pincushion_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.SCAN_PINCUSHION, new Item.Settings()));
    public static final Item SOBEL_KALEIDOSCOPE = registerItem("sobel_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.SOBEL, new Item.Settings()));
    public static final Item BITS_KALEIDOSCOPE = registerItem("bits_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BITS, new Item.Settings()));
    public static final Item DESATURATE_KALEIDOSCOPE = registerItem("desaturate_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.DESATURATE, new Item.Settings()));
    public static final Item GREEN_KALEIDOSCOPE = registerItem("green_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.GREEN, new Item.Settings()));
    public static final Item WOBBLE_KALEIDOSCOPE = registerItem("wobble_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.WOBBLE, new Item.Settings()));
    public static final Item BLOBS_KALEIDOSCOPE = registerItem("blobs_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BLOBS, new Item.Settings())); // Iffy
    public static final Item CREEPER_KALEIDOSCOPE = registerItem("creeper_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.CREEPER, new Item.Settings()));
    public static final Item SPIDER_KALEIDOSCOPE = registerItem("spider_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.SPIDER, new Item.Settings()));
    public static final Item BLINDING_KALEIDOSCOPE = registerItem("blinding_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BLINDING, new Item.Settings()));

    public static final Item REINFORCEMENT_TEMPLATE = registerItem("reinforcement_template",
            new ReinforcementTemplateItem(
                    Text.translatable("reinforcement_template.applies_to.tooltip").formatted(Formatting.GRAY),
                    Text.translatable("reinforcement_template.ingredients.tooltip").formatted(Formatting.GRAY),
                    Text.translatable("reinforcement_template.title.tooltip").formatted(Formatting.BLUE),

                    Text.translatable("reinforcement_template.base_slot_description.tooltip"),
                    Text.translatable("reinforcement_template.additions_slot_description.tooltip")
            ));

    public static final Item REINFORCED_IRON_SWORD = registerItem("reinforced_iron_sword",
            new ReinforcedSwordItem(CobaltiteToolMaterials.REINFORCED_IRON, 3, -2.4f, new FabricItemSettings()));
    public static final Item REINFORCED_IRON_SHOVEL = registerItem("reinforced_iron_shovel",
            new ReinforcedShovelItem(CobaltiteToolMaterials.REINFORCED_IRON, 1.5F, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_IRON_PICKAXE = registerItem("reinforced_iron_pickaxe",
            new ReinforcedPickaxeItem(CobaltiteToolMaterials.REINFORCED_IRON, 1, -2.8f, new FabricItemSettings()));
    public static final Item REINFORCED_IRON_AXE = registerItem("reinforced_iron_axe",
            new ReinforcedAxeItem(CobaltiteToolMaterials.REINFORCED_IRON, 6, -3.1f, new FabricItemSettings()));
    public static final Item REINFORCED_IRON_HOE = registerItem("reinforced_iron_hoe",
            new ReinforcedHoeItem(CobaltiteToolMaterials.REINFORCED_IRON, -2, -1.0f, new FabricItemSettings()));

    public static final Item REINFORCED_DIAMOND_SWORD = registerItem("reinforced_diamond_sword",
            new ReinforcedSwordItem(CobaltiteToolMaterials.REINFORCED_DIAMOND, 3, -2.4f, new FabricItemSettings()));
    public static final Item REINFORCED_DIAMOND_SHOVEL = registerItem("reinforced_diamond_shovel",
            new ReinforcedShovelItem(CobaltiteToolMaterials.REINFORCED_DIAMOND, 1.5F, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_DIAMOND_PICKAXE = registerItem("reinforced_diamond_pickaxe",
            new ReinforcedPickaxeItem(CobaltiteToolMaterials.REINFORCED_DIAMOND, 1, -2.8f, new FabricItemSettings()));
    public static final Item REINFORCED_DIAMOND_AXE = registerItem("reinforced_diamond_axe",
            new ReinforcedAxeItem(CobaltiteToolMaterials.REINFORCED_DIAMOND, 5, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_DIAMOND_HOE = registerItem("reinforced_diamond_hoe",
            new ReinforcedHoeItem(CobaltiteToolMaterials.REINFORCED_DIAMOND, -3, 0.0f, new FabricItemSettings()));

    public static final Item REINFORCED_GOLDEN_SWORD = registerItem("reinforced_golden_sword",
            new ReinforcedSwordItem(CobaltiteToolMaterials.REINFORCED_GOLD, 3, -2.4f, new FabricItemSettings()));
    public static final Item REINFORCED_GOLDEN_SHOVEL = registerItem("reinforced_golden_shovel",
            new ReinforcedShovelItem(CobaltiteToolMaterials.REINFORCED_GOLD, 1.5F, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_GOLDEN_PICKAXE = registerItem("reinforced_golden_pickaxe",
            new ReinforcedPickaxeItem(CobaltiteToolMaterials.REINFORCED_GOLD, 1, -2.8f, new FabricItemSettings()));
    public static final Item REINFORCED_GOLDEN_AXE = registerItem("reinforced_golden_axe",
            new ReinforcedAxeItem(CobaltiteToolMaterials.REINFORCED_GOLD, 6, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_GOLDEN_HOE = registerItem("reinforced_golden_hoe",
            new ReinforcedHoeItem(CobaltiteToolMaterials.REINFORCED_GOLD, 0, -3.0f, new FabricItemSettings()));

    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new ReinforcedSwordItem(CobaltiteToolMaterials.REINFORCED_NETHERITE, 3, -2.4f, new FabricItemSettings()));
    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ReinforcedShovelItem(CobaltiteToolMaterials.REINFORCED_NETHERITE, 1.5F, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new ReinforcedPickaxeItem(CobaltiteToolMaterials.REINFORCED_NETHERITE, 1, -2.8f, new FabricItemSettings()));
    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new ReinforcedAxeItem(CobaltiteToolMaterials.REINFORCED_NETHERITE, 5, -3.0f, new FabricItemSettings()));
    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new ReinforcedHoeItem(CobaltiteToolMaterials.REINFORCED_NETHERITE, -4, 0.0f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Cobaltite.MOD_ID, name), item);

    }

    public static void registerModItems() {

        Cobaltite.LOGGER.info("Registering Cobaltite Items for " + Cobaltite.MOD_ID);

    }

}
