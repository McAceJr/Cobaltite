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
                        entries.add(CobaltiteItems.COBALT_NUGGET);
                        entries.add(CobaltiteItems.OPAL);

                        //Generic Blocks

                        entries.add(CobaltiteBlocks.COBALT_ORE);
                        entries.add(CobaltiteBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(CobaltiteBlocks.OPAL_ORE);
                        entries.add(CobaltiteBlocks.DEEPSLATE_OPAL_ORE);
                        entries.add(CobaltiteBlocks.RAW_COBALT_BLOCK);
                        entries.add(CobaltiteBlocks.COBALT_BLOCK);
                        entries.add(CobaltiteBlocks.OPAL_BLOCK);
                        entries.add(CobaltiteBlocks.POLISHED_OPAL_BLOCK);

                        //Tools & Weapons
                        entries.add(CobaltiteItems.NOTCH_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.ART_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.BUMPY_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.BLOBS2_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.PENCIL_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.COLOR_CONVOLVE_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.DECONVERGE_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.FLIP_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.INVERT_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.NTSC_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.PHOSPHOR_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.SCAN_PINCUSHION_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.SOBEL_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.BITS_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.DESATURATE_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.GREEN_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.WOBBLE_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.BLOBS_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.CREEPER_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.SPIDER_KALEIDOSCOPE);
                        entries.add(CobaltiteItems.BLINDING_KALEIDOSCOPE);


                        //Enchantment Books



                        //Spawn Eggs (If Any)

                    }).build());

    public static void registerItemGroups() {

        Cobaltite.LOGGER.info("Registering Cobaltite Item Groups for " + Cobaltite.MOD_ID);

    }

}
