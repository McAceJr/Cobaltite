package net.mcacejr.cobaltite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.client.gl.Uniform;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class CobaltiteLootTableProvider extends FabricBlockLootTableProvider {

    public CobaltiteLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(CobaltiteBlocks.COBALT_ORE, CobaltOreDrops(CobaltiteBlocks.COBALT_ORE));
        addDrop(CobaltiteBlocks.DEEPSLATE_COBALT_ORE, CobaltOreDrops(CobaltiteBlocks.DEEPSLATE_COBALT_ORE));

        addDrop(CobaltiteBlocks.OPAL_ORE, OpalOreDrops(CobaltiteBlocks.OPAL_ORE));
        addDrop(CobaltiteBlocks.DEEPSLATE_OPAL_ORE, OpalOreDrops(CobaltiteBlocks.DEEPSLATE_OPAL_ORE));

        addDrop(CobaltiteBlocks.RAW_COBALT_BLOCK);
        addDrop(CobaltiteBlocks.COBALT_BLOCK);

        addDrop(CobaltiteBlocks.OPAL_BLOCK);
        addDrop(CobaltiteBlocks.POLISHED_OPAL_BLOCK);

    }

    public LootTable.Builder CobaltOreDrops(Block drop){

        return BlockLootTableGenerator.dropsWithSilkTouch(
                drop, this.applyExplosionDecay(
                        drop, ((LeafEntry.Builder<?>)
                                ItemEntry.builder(CobaltiteItems.RAW_COBALT).apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider.create(1.0f, 1.0f))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));

    }

    public LootTable.Builder OpalOreDrops(Block drop){

        return BlockLootTableGenerator.dropsWithSilkTouch(
                drop, this.applyExplosionDecay(
                        drop, ((LeafEntry.Builder<?>)
                                ItemEntry.builder(CobaltiteItems.OPAL).apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider.create(1.0f, 3.0f))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));

    }

}
