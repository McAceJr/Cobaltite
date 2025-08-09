package net.mcacejr.cobaltite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CobaltiteItemGroups {

    public static final ItemGroup COBALTITE_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Cobaltite.MOD_ID, "cobalt_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cobaltite_tab"))
                    .icon(() -> new ItemStack(CobaltiteItems.COBALT_INGOT)).entries((displayContext, entries) -> {

                        //Generic Items

                        entries.add(CobaltiteItems.RAW_COBALT);
                        entries.add(CobaltiteItems.COBALT_INGOT);
                        entries.add(CobaltiteItems.RAW_COBALT);

                        //Generic Blocks

                        entries.add(CobaltiteBlocks.COBALT_ORE);
                        entries.add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(CobaltiteBlocks.OPAL_ORE);
                        entries.add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);

                        //Tools & Weapons



                        //Enchantment Books



                        //Spawn Eggs (If Any)

                    }).build());

    public static void registerItemGroups() {

        Cobaltite.LOGGER.info("Registering Cobaltite Item Groups for " + Cobaltite.MOD_ID);

    }

}
