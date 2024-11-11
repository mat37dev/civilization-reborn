package com.civilizationreborn.item.artefact;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.awt.*;
import java.util.Objects;

public class StaffCreationItem extends Item {
    private static final int COOLDOWN_DURATION = 100;

    public StaffCreationItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        Objects.requireNonNull(context.getPlayer()).getItemCooldownManager().set(context.getStack(), COOLDOWN_DURATION);

        if(clickedBlock== Blocks.GOLD_BLOCK){
            if(!world.isClient){
                world.setBlockState(context.getBlockPos(), Blocks.VOID_AIR.getDefaultState());
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);
                if (MinecraftClient.getInstance().player != null) {
                    MinecraftClient.getInstance().player.sendMessage(Text.translatable("item.civilization-reborn.message_create_village"), false);
                }
                //Code à exécuter pour créer un village
            }
        }
        else{
            if(!world.isClient){
                if (MinecraftClient.getInstance().player != null) {
                    MinecraftClient.getInstance().player.sendMessage(Text.translatable("item.civilization-reborn.message_create_village_error_block"), false);
                }
            }
        }

        return ActionResult.SUCCESS;
    }
}
