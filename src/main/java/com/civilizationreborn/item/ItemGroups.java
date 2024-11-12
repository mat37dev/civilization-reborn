package com.civilizationreborn.item;

import com.civilizationreborn.CivilizationReborn;
import com.civilizationreborn.block.CommonBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup TEST_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CivilizationReborn.MOD_ID, "test_items_group"), FabricItemGroup.builder().
                    icon(()->new ItemStack(CommonItems.PINK_GARNET)).
                    displayName(Text.translatable("itemgroup.civilization-reborn.test_pink_garnet")).
                    entries(((displayContext, entries) -> {
                        entries.add(CommonItems.PINK_GARNET);
                        entries.add(CommonItems.RAW_PINK_GARNET);
                        entries.add(CommonBlocks.PINK_GARNET_BLOCK);
                        entries.add(CommonBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(CommonItems.STAFF_CREATION_ITEM);
                        entries.add(CommonItems.CAULIFLOWER);
                    })).

                    build());

    public static void registerItemGroups(){
        CivilizationReborn.LOGGER.info("Registering Item Groups for "+CivilizationReborn.MOD_ID);
    }
}
