package net.mcacejr.cobaltite.item;

import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class CobaltiteItemIds {
    public static final ResourceKey<Item> RAW_COBALT = create("raw_cobalt");
    public static final ResourceKey<Item> COBALT_INGOT = create("cobalt_ingot");
    public static final ResourceKey<Item> COBALT_NUGGET = create("cobalt_nugget");
    public static final ResourceKey<Item> OPAL = create("opal");
    public static final ResourceKey<Item> REINFORCEMENT_TEMPLATE = create("reinforcement_template");

    public static ResourceKey<Item> create(String key) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key));
    }
}
