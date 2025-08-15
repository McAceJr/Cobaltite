package net.mcacejr.cobaltite.item.custom;

import net.mcacejr.cobaltite.mixin.GameRendererInvoker;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class KaleidoscopeItem extends Item {
    private final KaleidoscopeOptions effect;

    public KaleidoscopeItem(KaleidoscopeOptions effect, Settings settings) {
        super(settings.maxCount(1));
        this.effect = effect;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 1200;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            MinecraftClient client = MinecraftClient.getInstance();

            if (client.gameRenderer != null) {
                ((GameRendererInvoker)client.gameRenderer).invokeLoadPostProcessor(effect.getSetting());
            }
        }
        user.playSound(SoundEvents.ITEM_SPYGLASS_USE, SoundCategory.PLAYERS, 1.0F, 1.0F);

        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.SPYGLASS;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.playSound(SoundEvents.ITEM_SPYGLASS_STOP_USING, 1.0F, 1.0F);
        if (world.isClient) {
            MinecraftClient client = MinecraftClient.getInstance();

            if (client.gameRenderer != null) {
                client.gameRenderer.disablePostProcessor();
            }
        }
        return stack;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(effect.getId() + "_kaleidoscope_tooltip").formatted(Formatting.LIGHT_PURPLE));
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        user.playSound(SoundEvents.ITEM_SPYGLASS_STOP_USING, 1.0F, 1.0F);
        if (world.isClient) {
            MinecraftClient client = MinecraftClient.getInstance();

            if (client.gameRenderer != null) {
                client.gameRenderer.disablePostProcessor();
            }
        }
    }

    public enum KaleidoscopeOptions {
        NOTCH(new Identifier("shaders/post/notch.json"), "notch"),
        FXAA(new Identifier("shaders/post/fxaa.json"), "fxaa"),
        ART(new Identifier("shaders/post/art.json"), "art"),
        BUMPY(new Identifier("shaders/post/bumpy.json"), "bumpy"),
        BLOBS2(new Identifier("shaders/post/blobs2.json"), "blobs2"),
        PENCIL(new Identifier("shaders/post/pencil.json"), "pencil"),
        COLOR_CONVOLVE(new Identifier("shaders/post/color_convolve.json"), "color_convolve"),
        DECONVERGE(new Identifier("shaders/post/deconverge.json"), "deconverge"),
		FLIP(new Identifier("shaders/post/flip.json"), "flip"),
		INVERT(new Identifier("shaders/post/invert.json"), "invert"),
		NTSC(new Identifier("shaders/post/ntsc.json"), "ntsc"),
		OUTLINE(new Identifier("shaders/post/outline.json"), "outline"),
		PHOSPHOR(new Identifier("shaders/post/phosphor.json"), "phosphor"),
		SCAN_PINCUSHION(new Identifier("shaders/post/scan_pincushion.json"), "scan_pincushion"),
		SOBEL(new Identifier("shaders/post/sobel.json"), "sobel"),
		BITS(new Identifier("shaders/post/bits.json"), "bits"),
		DESATURATE(new Identifier("shaders/post/desaturate.json"), "desaturate"),
		GREEN(new Identifier("shaders/post/green.json"), "green"),
        // Blur has been removed due to graphical errors
		WOBBLE(new Identifier("shaders/post/wobble.json"), "wobble"),
		BLOBS(new Identifier("shaders/post/blobs.json"), "blobs"),
		ANTIALIAS(new Identifier("shaders/post/antialias.json"), "antialias"),
		CREEPER(new Identifier("shaders/post/creeper.json"), "creeper"),
		SPIDER(new Identifier("shaders/post/spider.json"), "spider");

        private final Identifier setting;
        private final String id;

        KaleidoscopeOptions(Identifier setting, String id) {
            this.setting = setting;
            this.id = id;
        }

        public Identifier getSetting() {
            return this.setting;
        }

        public String getId() {
            return this.id;
        }
    }
}
