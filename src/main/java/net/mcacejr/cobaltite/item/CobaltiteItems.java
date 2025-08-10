package net.mcacejr.cobaltite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CobaltiteItems {

    public static final Item RAW_COBALT = registerItem("raw_cobalt",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Cobaltite.MOD_ID, name), item);

    }

    public static void registerModItems() {

        Cobaltite.LOGGER.info("Registering Cobaltite Items for " + Cobaltite.MOD_ID);

    }

}
