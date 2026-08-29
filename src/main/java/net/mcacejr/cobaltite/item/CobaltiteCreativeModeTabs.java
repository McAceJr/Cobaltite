package net.mcacejr.cobaltite.item;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.mcacejr.cobaltite.item.data.custom.KaleidoscopeLensComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class CobaltiteCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> COBALTITE_KEY = createKey("cobaltite.creative_mode_tab");

    private static ResourceKey<CreativeModeTab> createKey(String key) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key));
    }

    public static final CreativeModeTab COBALTITE_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            COBALTITE_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("creative_mode_tab.cobaltite"))
                    .icon(() -> new ItemStack(CobaltiteItems.COBALT_INGOT))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Generic Items
                        output.accept(CobaltiteItems.RAW_COBALT);
                        output.accept(CobaltiteItems.COBALT_INGOT);
                        output.accept(CobaltiteItems.COBALT_NUGGET);
                        output.accept(CobaltiteItems.OPAL);
                        output.accept(CobaltiteItems.REINFORCEMENT_TEMPLATE);

                        //Generic Blocks
                        output.accept(CobaltiteBlocks.COBALT_ORE);
                        output.accept(CobaltiteBlocks.DEEPSLATE_COBALT_ORE);
                        output.accept(CobaltiteBlocks.OPAL_ORE);
                        output.accept(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);
                        output.accept(CobaltiteBlocks.RAW_COBALT_BLOCK);
                        output.accept(CobaltiteBlocks.COBALT_BLOCK);
                        output.accept(CobaltiteBlocks.OPAL_BLOCK);
                        output.accept(CobaltiteBlocks.POLISHED_OPAL_BLOCK);

                        //Tools & Weapons
                        ItemStack stack1 = new ItemStack(CobaltiteItems.KALEIDOSCOPE);
                        stack1.set(CobaltiteDataComponents.KALEIDOSCOPE_LENS, new KaleidoscopeLensComponent("minecraft:blur"));
                        output.accept(stack1);
                        ItemStack stack2 = new ItemStack(CobaltiteItems.KALEIDOSCOPE);
                        stack2.set(CobaltiteDataComponents.KALEIDOSCOPE_LENS, new KaleidoscopeLensComponent("minecraft:creeper"));
                        output.accept(stack2);
                        ItemStack stack3 = new ItemStack(CobaltiteItems.KALEIDOSCOPE);
                        stack3.set(CobaltiteDataComponents.KALEIDOSCOPE_LENS, new KaleidoscopeLensComponent("minecraft:invert"));
                        output.accept(stack3);
                        ItemStack stack4 = new ItemStack(CobaltiteItems.KALEIDOSCOPE);
                        stack4.set(CobaltiteDataComponents.KALEIDOSCOPE_LENS, new KaleidoscopeLensComponent("minecraft:spider"));
                        output.accept(stack4);

                        //Enchantment Books

                        //Spawn Eggs (If Any)

                    }).build());

    public static void registerCreativeModetabs() {

        Cobaltite.LOGGER.info("Registering Cobaltite Item Groups for " + Cobaltite.MOD_ID);

    }

}
