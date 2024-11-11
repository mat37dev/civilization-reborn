package com.civilizationreborn.block;

import com.civilizationreborn.CivilizationReborn;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class CommonBlocks {
    //Création des blocks
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", Block::new,
            Block.Settings.create().strength(4.0f).
                    requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",Block::new,
            Block.Settings.create().strength(4.0f).
                    requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    //Méthode pour enregistrer les blocks et les mettre dans le jeu
    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CivilizationReborn.MOD_ID, name));
        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void registerCommonBlocks(){
        CivilizationReborn.LOGGER.info("Registering blocks "+ CivilizationReborn.MOD_ID);

        //On ajoute à l'inventaire créatif les blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PINK_GARNET_BLOCK);
            entries.add(RAW_PINK_GARNET_BLOCK);
        });
    }
}
