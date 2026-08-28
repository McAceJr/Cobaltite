package net.mcacejr.cobaltite.item.data;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.data.custom.ReinforcedComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class CobaltiteDataComponents {
    public static final DataComponentType<ReinforcedComponent> REINFORCED = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, "reinforced"),
            DataComponentType.<ReinforcedComponent>builder().persistent(ReinforcedComponent.CODEC).build()
    );

    public static void registerDataComponents() {
        Cobaltite.LOGGER.info("Registering Data Components for " + Cobaltite.MOD_ID);
    }
}
