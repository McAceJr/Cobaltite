package net.mcacejr.cobaltite.item.data.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentGetter;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipProvider;
import org.jspecify.annotations.NonNull;

import java.util.function.Consumer;

public record ReinforcedComponent(boolean reinforced) implements TooltipProvider {
    public static final Codec<ReinforcedComponent> CODEC = RecordCodecBuilder.create(builder ->
            builder.group(
                    Codec.BOOL.optionalFieldOf("reinforced", false).forGetter(ReinforcedComponent::reinforced)
        ).apply(builder, ReinforcedComponent::new)
    );

    @Override
    public void addToTooltip(Item.@NonNull TooltipContext context, @NonNull Consumer<Component> consumer, @NonNull TooltipFlag flag, @NonNull DataComponentGetter components) {
        if (components.getOrDefault(CobaltiteDataComponents.REINFORCED, new ReinforcedComponent(false)).reinforced) {
            consumer.accept(Component.translatable("item.cobaltite.reinforced.info").withStyle(ChatFormatting.DARK_AQUA));
        }
    }
}
