package net.mcacejr.cobaltite;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.ItemComponentTooltipProviderRegistry;
import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteCreativeModeTabs;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.mcacejr.cobaltite.item.data.CobaltiteDataComponents;
import net.mcacejr.cobaltite.item.recipe.CobaltiteRecipeSerializers;
import net.mcacejr.cobaltite.world.gen.CobaltiteWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cobaltite implements ModInitializer {
	public static final String MOD_ID = "cobaltite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CobaltiteItems.registerItems();
		CobaltiteCreativeModeTabs.registerCreativeModetabs();
		CobaltiteBlocks.registerModBlocks();
		CobaltiteWorldGeneration.generateCobaltiteWorldGen();
		CobaltiteDataComponents.registerDataComponents();
		CobaltiteRecipeSerializers.registerRecipeSerializers();

		ItemComponentTooltipProviderRegistry.addFirst(CobaltiteDataComponents.REINFORCED);
	}
}