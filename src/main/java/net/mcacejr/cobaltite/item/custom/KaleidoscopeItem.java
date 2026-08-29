package net.mcacejr.cobaltite.item.custom;

import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.mcacejr.cobaltite.item.data.custom.KaleidoscopeLensComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.Level;
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

    @Override
    public @NonNull InteractionResult use(@NonNull Level level, Player player, @NonNull InteractionHand hand) {
        player.playSound(SoundEvents.SPYGLASS_USE, 1.0f, 1.0f);
        player.awardStat(Stats.ITEM_USED.get(this));
        KaleidoscopeLensComponent lensComponent = player.getItemInHand(hand).get(CobaltiteDataComponents.KALEIDOSCOPE_LENS);
        if (lensComponent != null && lensComponent.hasValidIdentifier()) {
            if (player instanceof ServerPlayer serverPlayer) {
                serverPlayer.addPostEffect(lensComponent.getIdentifier());
            }
        }
        return ItemUtils.startUsingInstantly(level, player, hand);
    }

    @Override
    public @NonNull ItemStack finishUsingItem(@NonNull ItemStack itemStack, @NonNull Level level, @NonNull LivingEntity entity) {
        this.stopUsing(entity, itemStack);
        return itemStack;
    }

    @Override
    public boolean releaseUsing(@NonNull ItemStack itemStack, @NonNull Level level, @NonNull LivingEntity entity, int remainingTime) {
        this.stopUsing(entity, itemStack);
        return true;
    }

    private void stopUsing(LivingEntity entity, ItemStack itemStack) {
        entity.playSound(SoundEvents.SPYGLASS_STOP_USING, 1.0f, 1.0f);
        KaleidoscopeLensComponent lensComponent = itemStack.get(CobaltiteDataComponents.KALEIDOSCOPE_LENS);
        if (lensComponent != null && lensComponent.hasValidIdentifier()) {
            if (entity instanceof ServerPlayer serverPlayer) {
                serverPlayer.removePostEffect(lensComponent.getIdentifier());
            }
        }
    }
}
