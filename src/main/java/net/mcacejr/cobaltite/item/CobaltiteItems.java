package net.mcacejr.cobaltite.item;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.custom.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class CobaltiteItems {
    public static final Item RAW_COBALT = registerItem(
            CobaltiteItemIds.RAW_COBALT,
            Item::new,
            new Item.Properties().fireResistant()
    );

    public static final Item COBALT_INGOT = registerItem(
            CobaltiteItemIds.COBALT_INGOT,
            Item::new,
            new Item.Properties().fireResistant()
    );

    public static final Item COBALT_NUGGET = registerItem(
            CobaltiteItemIds.COBALT_NUGGET,
            Item::new,
            new Item.Properties().fireResistant()
    );

    public static final Item OPAL = registerItem(
            CobaltiteItemIds.OPAL,
            Item::new,
            new Item.Properties()
    );

    public static final Item REINFORCEMENT_TEMPLATE = registerItem(
            CobaltiteItemIds.REINFORCEMENT_TEMPLATE,
            ReinforcementTemplateItem::new,
            new Item.Properties()
    );

    public static Item registerItem(ResourceKey<Item> key, Function<Item.Properties, Item> itemFactory, Item.Properties properties) {
        return Registry.register(BuiltInRegistries.ITEM, key, itemFactory.apply(properties.setId(key)));
    }

    public static void registerItems() {
        Cobaltite.LOGGER.info("Registering Cobaltite Items for " + Cobaltite.MOD_ID);

    }

}
