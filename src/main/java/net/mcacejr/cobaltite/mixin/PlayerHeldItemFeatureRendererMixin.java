package net.mcacejr.cobaltite.mixin;

import net.mcacejr.cobaltite.item.custom.KaleidoscopeItem;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.PlayerHeldItemFeatureRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerHeldItemFeatureRenderer.class)
public abstract class PlayerHeldItemFeatureRendererMixin {

    @Inject(method = "renderItem", at = @At(value = "HEAD"), cancellable = true)
    void renderItem(LivingEntity entity, ItemStack stack, ModelTransformationMode transformationMode, Arm arm, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        if ((stack.getItem() instanceof KaleidoscopeItem) && entity.getActiveItem() == stack && entity.handSwingTicks == 0) {
            ((PlayerHeldItemFeatureRendererInvoker)this).invokeRenderSpyglass(entity, stack, arm, matrices, vertexConsumers, light);
            ci.cancel();
        }
    }

    @Mixin(PlayerHeldItemFeatureRenderer.class)
    public interface PlayerHeldItemFeatureRendererInvoker {

        @Invoker("renderSpyglass")
        void invokeRenderSpyglass(LivingEntity entity, ItemStack stack, Arm arm, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light);
    }
}
