package net.themcbrothers.usefulfoundation.core;

import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.themcbrothers.usefulfoundation.block.UsefulBeehiveBlock;

import java.util.function.Function;

import static net.themcbrothers.usefulfoundation.core.Registration.BLOCKS;
import static net.themcbrothers.usefulfoundation.core.Registration.ITEMS;

public final class FoundationBlocks {
    static void init() {
    }

    public static final DeferredBlock<BeehiveBlock> USEFUL_BEEHIVE = registerBlock("useful_beehive", UsefulBeehiveBlock::new, BlockBehaviour.Properties.of().sound(SoundType.WOOD));
    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> NICKEL_ORE = registerBlock("nickel_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> NICKEL_BLOCK = registerBlock("nickel_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> INVAR_BLOCK = registerBlock("invar_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ELECTRUM_BLOCK = registerBlock("electrum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> URANIUM_ORE = registerBlock("uranium_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> URANIUM_BLOCK = registerBlock("uranium_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ALUMINUM_ORE = registerBlock("aluminum_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore", BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", BlockBehaviour.Properties.of().strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> ENDERIUM_BLOCK = registerBlock("enderium_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SIGNALUM_BLOCK = registerBlock("signalum_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block", BlockBehaviour.Properties.of().strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops());

    private static DeferredBlock<Block> registerBlock(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, Block::new, props);
    }

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        DeferredBlock<B> deferredBlock = BLOCKS.registerBlock(name, func, props);
        ITEMS.registerSimpleBlockItem(deferredBlock);
        return deferredBlock;
    }
}
