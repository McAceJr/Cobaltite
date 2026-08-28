package net.mcacejr.cobaltite.item.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.mcacejr.cobaltite.item.data.custom.ReinforcedComponent;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.minecraft.world.item.crafting.display.SmithingRecipeDisplay;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Optional;

public class ReinforcementSmithingRecipe extends SimpleSmithingRecipe {
    public static final MapCodec<ReinforcementSmithingRecipe> MAP_CODEC = RecordCodecBuilder.mapCodec(
            (i) -> i.group(
                    CommonInfo.MAP_CODEC.forGetter((o) -> o.commonInfo),
                    Ingredient.CODEC.optionalFieldOf("template").forGetter(o -> o.template),
                    Ingredient.CODEC.fieldOf("base").forGetter(o -> o.base),
                    Ingredient.CODEC.optionalFieldOf("addition").forGetter(o -> o.addition),
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(o -> o.result))
                    .apply(i, ReinforcementSmithingRecipe::new)
    );
    public static final StreamCodec<RegistryFriendlyByteBuf, ReinforcementSmithingRecipe> STREAM_CODEC = StreamCodec.composite(Recipe.CommonInfo.STREAM_CODEC,
            o -> o.commonInfo, Ingredient.OPTIONAL_CONTENTS_STREAM_CODEC,
            o -> o.template, Ingredient.CONTENTS_STREAM_CODEC,
            o -> o.base, Ingredient.OPTIONAL_CONTENTS_STREAM_CODEC,
            o -> o.addition, ItemStackTemplate.STREAM_CODEC, o -> o.result,
            ReinforcementSmithingRecipe::new
    );
    public static final RecipeSerializer<ReinforcementSmithingRecipe> SERIALIZER = new RecipeSerializer<>(MAP_CODEC, STREAM_CODEC);
    private final Optional<Ingredient> template;
    private final Ingredient base;
    private final Optional<Ingredient> addition;
    private final ItemStackTemplate result;

    public ReinforcementSmithingRecipe(CommonInfo commonInfo, Optional<Ingredient> template, Ingredient base, Optional<Ingredient> addition, ItemStackTemplate result) {
        super(commonInfo);
        this.template = template;
        this.base = base;
        this.addition = addition;
        this.result = result;
    }

    @Override
    public boolean matches(@NonNull SmithingRecipeInput input, @NonNull Level level) {
        return super.matches(input, level) && !input.getItem(1).has(CobaltiteDataComponents.REINFORCED);
    }

    @Override
    public @NonNull Optional<Ingredient> templateIngredient() {
        return this.template;
    }

    @Override
    public @NonNull Ingredient baseIngredient() {
        return this.base;
    }

    @Override
    public @NonNull Optional<Ingredient> additionIngredient() {
        return this.addition;
    }

    @Override
    public @NonNull ItemStack assemble(@NonNull SmithingRecipeInput input) {
        ItemStack result = TransmuteRecipe.createWithOriginalComponents(this.result, input.base());
        DataComponentMap.Builder builder = DataComponentMap.builder()
                .set(CobaltiteDataComponents.REINFORCED, new ReinforcedComponent(true));
        if (result.getMaxDamage() > 0) {
            builder.set(DataComponents.MAX_DAMAGE, result.getMaxDamage() * 2);
        }
        result.applyComponents(builder.build());
        return result;
    }

    @Override
    public @NonNull RecipeSerializer<ReinforcementSmithingRecipe> getSerializer() {
        return SERIALIZER;
    }

    @Override
    protected @NonNull PlacementInfo createPlacementInfo() {
        return PlacementInfo.createFromOptionals(List.of(this.template, Optional.of(this.base), this.addition));
    }

    @Override
    public @NonNull List<RecipeDisplay> display() {
        return List.of(new SmithingRecipeDisplay(Ingredient.optionalIngredientToDisplay(this.template), this.base.display(), Ingredient.optionalIngredientToDisplay(this.addition), new SlotDisplay.ItemStackSlotDisplay(this.result), new SlotDisplay.ItemSlotDisplay(Items.SMITHING_TABLE)));
    }
}
