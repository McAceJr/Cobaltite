package net.mcacejr.cobaltite.mixin;

import net.mcacejr.cobaltite.item.CobaltiteItemIds;
import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.mcacejr.cobaltite.item.data.custom.KaleidoscopeLensComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Inventory.class)
public class InventoryMixin {
    @Shadow
    private int selected;
    @Final
    @Shadow
    public Player player;

    @Inject(method = "setSelectedSlot", at = @At("HEAD"))
    private void onSlotChange(int selected, CallbackInfo ci) {
        if (this.selected != selected) {
            ItemStack oldItem = this.player.getInventory().getItem(this.selected);

            if (oldItem.is(CobaltiteItemIds.KALEIDOSCOPE)) {
                if (this.player instanceof ServerPlayer serverPlayer) {
                    KaleidoscopeLensComponent lensComponent = oldItem.get(CobaltiteDataComponents.KALEIDOSCOPE_LENS);
                    if (lensComponent != null && lensComponent.hasValidIdentifier()) {
                        serverPlayer.removePostEffect(lensComponent.getIdentifier());
                    }
                }
            }
        }
    }
}
