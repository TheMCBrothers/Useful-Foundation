package net.themcbrothers.usefulfoundation.core;

import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.themcbrothers.usefulfoundation.block.UsefulBeehiveBlock;

import static net.themcbrothers.usefulfoundation.core.Registration.BLOCKS;

public final class FoundationBlocks {
    static void init() {
    }

    public static final DeferredBlock<BeehiveBlock> USEFUL_BEEHIVE = BLOCKS.registerBlock("useful_beehive", UsefulBeehiveBlock::new, props -> props.sound(SoundType.WOOD));
    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.registerSimpleBlock("tin_ore", props -> props.strength(3f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = BLOCKS.registerSimpleBlock("deepslate_tin_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> TIN_BLOCK = BLOCKS.registerSimpleBlock("tin_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = BLOCKS.registerSimpleBlock("raw_tin_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> BRONZE_BLOCK = BLOCKS.registerSimpleBlock("bronze_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> NICKEL_ORE = BLOCKS.registerSimpleBlock("nickel_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = BLOCKS.registerSimpleBlock("deepslate_nickel_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> NICKEL_BLOCK = BLOCKS.registerSimpleBlock("nickel_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = BLOCKS.registerSimpleBlock("raw_nickel_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> INVAR_BLOCK = BLOCKS.registerSimpleBlock("invar_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> LEAD_ORE = BLOCKS.registerSimpleBlock("lead_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = BLOCKS.registerSimpleBlock("deepslate_lead_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> LEAD_BLOCK = BLOCKS.registerSimpleBlock("lead_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = BLOCKS.registerSimpleBlock("raw_lead_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SILVER_ORE = BLOCKS.registerSimpleBlock("silver_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = BLOCKS.registerSimpleBlock("deepslate_silver_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SILVER_BLOCK = BLOCKS.registerSimpleBlock("silver_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = BLOCKS.registerSimpleBlock("raw_silver_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ELECTRUM_BLOCK = BLOCKS.registerSimpleBlock("electrum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> URANIUM_ORE = BLOCKS.registerSimpleBlock("uranium_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = BLOCKS.registerSimpleBlock("deepslate_uranium_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> URANIUM_BLOCK = BLOCKS.registerSimpleBlock("uranium_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = BLOCKS.registerSimpleBlock("raw_uranium_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ALUMINUM_ORE = BLOCKS.registerSimpleBlock("aluminum_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = BLOCKS.registerSimpleBlock("deepslate_aluminum_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ALUMINUM_BLOCK = BLOCKS.registerSimpleBlock("aluminum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = BLOCKS.registerSimpleBlock("raw_aluminum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> PLATINUM_ORE = BLOCKS.registerSimpleBlock("platinum_ore", props -> props.strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.registerSimpleBlock("deepslate_platinum_ore", props -> props.strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> PLATINUM_BLOCK = BLOCKS.registerSimpleBlock("platinum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = BLOCKS.registerSimpleBlock("raw_platinum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ENDERIUM_BLOCK = BLOCKS.registerSimpleBlock("enderium_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SIGNALUM_BLOCK = BLOCKS.registerSimpleBlock("signalum_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> STEEL_BLOCK = BLOCKS.registerSimpleBlock("steel_block", props -> props.strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
}
