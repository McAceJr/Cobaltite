package net.mcacejr.cobaltite.item.data.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponentGetter;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipProvider;
import org.jspecify.annotations.NonNull;

import java.util.function.Consumer;

public record KaleidoscopeLensComponent(String stringIdentifier) implements TooltipProvider {
    public static final Codec<KaleidoscopeLensComponent> CODEC = RecordCodecBuilder.create(builder ->
            builder.group(
                    Codec.STRING.optionalFieldOf("stringIdentifer", "minecraft:creeper").forGetter(KaleidoscopeLensComponent::stringIdentifier)
            ).apply(builder, KaleidoscopeLensComponent::new)
    );

    @Override
    public void addToTooltip(Item.@NonNull TooltipContext context, @NonNull Consumer<Component> consumer, @NonNull TooltipFlag flag, @NonNull DataComponentGetter components) {
        Identifier identifier = Identifier.tryParse(stringIdentifier);
        if (identifier == null) return;
        consumer.accept(Component.translatable("lens.kaleidoscope." + identifier.getPath()).withStyle(ChatFormatting.LIGHT_PURPLE));
    }

    public boolean hasValidIdentifier() {
        return Identifier.tryParse(stringIdentifier) != null;
    }

    public Identifier getIdentifier() {
        return Identifier.parse(stringIdentifier);
    }
}
