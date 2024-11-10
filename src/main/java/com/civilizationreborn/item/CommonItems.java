package com.civilizationreborn.item;


import com.civilizationreborn.CivilizationReborn;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class CommonItems {
    //Création et enregistrement d'un item
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CivilizationReborn.MOD_ID, name), item);
    }

    public static void registerCommonItems(){
        CivilizationReborn.LOGGER.info("Registering Mod Items for " + CivilizationReborn.MOD_ID);

        //On ajoute les items dans l'inventaire créatif
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}
