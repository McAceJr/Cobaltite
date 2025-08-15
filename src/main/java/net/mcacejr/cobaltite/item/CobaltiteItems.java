package net.mcacejr.cobaltite.item;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.custom.KaleidoscopeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
    public static final Item FXAA_KALEIDOSCOPE = registerItem("fxaa_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.FXAA, new Item.Settings()));
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
    public static final Item OUTLINE_KALEIDOSCOPE = registerItem("outline_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.OUTLINE, new Item.Settings()));
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
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.BLOBS, new Item.Settings()));
    public static final Item ANTIALIAS_KALEIDOSCOPE = registerItem("antialias_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.ANTIALIAS, new Item.Settings()));
    public static final Item CREEPER_KALEIDOSCOPE = registerItem("creeper_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.CREEPER, new Item.Settings()));
    public static final Item SPIDER_KALEIDOSCOPE = registerItem("spider_kaleidoscope",
            new KaleidoscopeItem(KaleidoscopeItem.KaleidoscopeOptions.SPIDER, new Item.Settings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Cobaltite.MOD_ID, name), item);

    }

    public static void registerModItems() {

        Cobaltite.LOGGER.info("Registering Cobaltite Items for " + Cobaltite.MOD_ID);

    }

}
