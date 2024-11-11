package com.civilizationreborn.item;


import com.civilizationreborn.CivilizationReborn;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class CommonItems {
    //Création et enregistrement d'un item
    public static final Item PINK_GARNET = registerItem("pink_garnet",Item::new, new Item.Settings());

    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CivilizationReborn.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerCommonItems(){
        CivilizationReborn.LOGGER.info("Registering Mod Items for " + CivilizationReborn.MOD_ID);

        //On ajoute les items dans l'inventaire créatif
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}
