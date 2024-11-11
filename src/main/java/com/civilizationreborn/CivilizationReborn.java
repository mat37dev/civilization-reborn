package com.civilizationreborn;

import com.civilizationreborn.block.CommonBlocks;
import com.civilizationreborn.item.CommonItems;
import com.civilizationreborn.item.ItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CivilizationReborn implements ModInitializer {
	public static final String MOD_ID = "civilization-reborn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommonItems.registerCommonItems();
		CommonBlocks.registerCommonBlocks();
		ItemGroups.registerItemGroups();
	}
}