package net.mcacejr.cobaltite.mixin;

import net.mcacejr.cobaltite.Cobaltite;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useNotchKaleidoscopeModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                                            MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(CobaltiteItems.NOTCH_KALEIDOSCOPE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(
                    new ModelIdentifier(Cobaltite.MOD_ID, "notch_kaleidoscope_model", "inventory"));
        }
        return value;
    }
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useArtKaleidoscopeModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                                                MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(CobaltiteItems.ART_KALEIDOSCOPE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(
                    new ModelIdentifier(Cobaltite.MOD_ID, "art_kaleidoscope_model", "inventory"));
        }
        return value;
    }

}
