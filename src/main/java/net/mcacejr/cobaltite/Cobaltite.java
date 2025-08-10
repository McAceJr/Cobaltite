package net.mcacejr.cobaltite;

import net.fabricmc.api.ModInitializer;

import net.mcacejr.cobaltite.block.CobaltiteBlocks;
import net.mcacejr.cobaltite.item.CobaltiteItemGroups;
import net.mcacejr.cobaltite.item.CobaltiteItems;
import net.mcacejr.cobaltite.world.gen.CobaltiteWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cobaltite implements ModInitializer {

	public static final String MOD_ID = "cobaltite";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		CobaltiteItems.registerModItems();
		CobaltiteItemGroups.registerItemGroups();
		CobaltiteBlocks.registerModBlocks();
		CobaltiteWorldGeneration.generateCobaltiteWorldGen();

	}
}