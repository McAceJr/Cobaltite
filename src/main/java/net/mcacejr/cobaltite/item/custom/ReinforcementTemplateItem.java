package net.mcacejr.cobaltite.item.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ReinforcementTemplateItem extends SmithingTemplateItem {

    private static final Identifier SWORD_SLOT;
    private static final Identifier SHOVEL_SLOT;
    private static final Identifier PICKAXE_SLOT;
    private static final Identifier AXE_SLOT;
    private static final Identifier HOE_SLOT;
    private static final Identifier INGOT_SLOT;

    public ReinforcementTemplateItem(Text appliesToText, Text ingredientsText, Text titleText,
                                     Text baseSlotDescriptionText, Text additionsSlotDescriptionText) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText,
                additionsSlotDescriptionText, getReinforcementEmptyBaseSlotTextures(), getReinforcementEmptyAdditionsSlotTextures());
    }

    public static List<Identifier> getReinforcementEmptyBaseSlotTextures() {

        return List.of(SWORD_SLOT, SHOVEL_SLOT, PICKAXE_SLOT, AXE_SLOT, HOE_SLOT);

    }

    public static List<Identifier> getReinforcementEmptyAdditionsSlotTextures() {

        return List.of(INGOT_SLOT);

    }

    static {

        SWORD_SLOT = new Identifier("item/empty_slot_sword");
        SHOVEL_SLOT = new Identifier("item/empty_slot_shovel");
        PICKAXE_SLOT = new Identifier("item/empty_slot_pickaxe");
        AXE_SLOT = new Identifier("item/empty_slot_axe");
        HOE_SLOT = new Identifier("item/empty_slot_hoe");
        INGOT_SLOT = new Identifier("item/empty_slot_ingot");

    }

}
