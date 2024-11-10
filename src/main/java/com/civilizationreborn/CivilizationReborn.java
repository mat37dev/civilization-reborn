package com.civilizationreborn;

import com.civilizationreborn.item.CommonItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CivilizationReborn implements ModInitializer {
	public static final String MOD_ID = "civilization_reborn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommonItems.registerCommonItems();
	}
}