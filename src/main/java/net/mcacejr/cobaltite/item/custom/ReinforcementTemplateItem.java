package net.mcacejr.cobaltite.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ReinforcementTemplateItem extends SmithingTemplateItem {

    private static final Identifier SWORD_SLOT;
    private static final Identifier SHOVEL_SLOT;
    private static final Identifier PICKAXE_SLOT;
    private static final Identifier AXE_SLOT;
    private static final Identifier HOE_SLOT;
    private static final Identifier SPEAR_SLOT;
    private static final Identifier INGOT_SLOT;

    public static final Component APPLIES_TO = Component.translatable("reinforcement_template.applies_to.tooltip").withStyle(ChatFormatting.BLUE);
    public static final Component INGREDIENTS = Component.translatable("reinforcement_template.ingredients.tooltip").withStyle(ChatFormatting.BLUE);
    public static final Component BASE_SLOT_DESCRIPTION = Component.translatable("reinforcement_template.base_slot_description.tooltip");
    public static final Component ADDITIONS_SLOT_DESCRIPTION = Component.translatable("reinforcement_template.additions_slot_description.tooltip");

    public ReinforcementTemplateItem(Item.Properties properties) {
        super(APPLIES_TO, INGREDIENTS, BASE_SLOT_DESCRIPTION, ADDITIONS_SLOT_DESCRIPTION, getReinforcementEmptyBaseSlotTextures(), getReinforcementEmptyAdditionsSlotTextures(), properties);
    }

    public static List<Identifier> getReinforcementEmptyBaseSlotTextures() {
        return List.of(SWORD_SLOT, SHOVEL_SLOT, PICKAXE_SLOT, AXE_SLOT, HOE_SLOT, SPEAR_SLOT);
    }

    public static List<Identifier> getReinforcementEmptyAdditionsSlotTextures() {
        return List.of(INGOT_SLOT);
    }

    static {
        SWORD_SLOT = Identifier.withDefaultNamespace("container/slot/sword");
        SHOVEL_SLOT = Identifier.withDefaultNamespace("container/slot/shovel");
        PICKAXE_SLOT = Identifier.withDefaultNamespace("container/slot/pickaxe");
        AXE_SLOT = Identifier.withDefaultNamespace("container/slot/axe");
        HOE_SLOT = Identifier.withDefaultNamespace("container/slot/hoe");
        SPEAR_SLOT = Identifier.withDefaultNamespace("container/slot/spear");
        INGOT_SLOT = Identifier.withDefaultNamespace("container/slot/ingot");
    }
}