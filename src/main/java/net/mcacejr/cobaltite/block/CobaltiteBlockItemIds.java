package net.mcacejr.cobaltite.block;


import net.mcacejr.cobaltite.Cobaltite;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class CobaltiteBlockItemIds {
    public static final BlockItemId COBALT_ORE = create("cobalt_ore");
    public static final BlockItemId DEEPSLATE_COBALT_ORE = create("deepslate_cobalt_ore");
    public static final BlockItemId OPAL_ORE = create("opal_ore");
    public static final BlockItemId DEEPSLATE_OPAL_ORE = create("deepslate_opal_ore");
    public static final BlockItemId RAW_COBALT_BLOCK = create("raw_cobalt_block");
    public static final BlockItemId COBALT_BLOCK = create("cobalt_block");
    public static final BlockItemId OPAL_BLOCK = create("opal_block");
    public static final BlockItemId POLISHED_OPAL_BLOCK = create("polished_opal_block");

    public static BlockItemId create(String key) {
        return BlockItemId.create(
                Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key),
                Identifier.fromNamespaceAndPath(Cobaltite.MOD_ID, key)
        );
    }
}
