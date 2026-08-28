package net.mcacejr.cobaltite.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import org.jspecify.annotations.NonNull;

public class KaleidoscopeItem extends Item {
    public KaleidoscopeItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(@NonNull ItemStack itemStack, @NonNull LivingEntity user) {
        return 1200;
    }

    @Override
    public @NonNull ItemUseAnimation getUseAnimation(@NonNull ItemStack itemStack) {
        return ItemUseAnimation.SPYGLASS;
    }
}
