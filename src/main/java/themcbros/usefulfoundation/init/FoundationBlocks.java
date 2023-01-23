package themcbros.usefulfoundation.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.themcbrothers.lib.registration.object.ItemObject;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.block.UsefulBeehiveBlock;

import java.util.function.Function;

import static themcbros.usefulfoundation.init.Registration.BLOCKS;

public class FoundationBlocks {
    private static final Item.Properties ITEM_PROPS = new Item.Properties().tab(UsefulFoundation.GROUP);
    private static final Function<? super Block, BlockItem> BLOCK_ITEM = block -> new BlockItem(block, ITEM_PROPS);

    public static final ItemObject<BeehiveBlock> USEFUL_BEEHIVE = BLOCKS.register("useful_beehive", () -> new UsefulBeehiveBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD)), BLOCK_ITEM);
    public static final ItemObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE)), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_URANIUM_BLOCK = BLOCKS.register("raw_uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_ALUMINUM_ORE = BLOCKS.register("deepslate_aluminum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_ALUMINUM_BLOCK = BLOCKS.register("raw_aluminum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> SIGNALUM_BLOCK = BLOCKS.register("signalum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);
    public static final ItemObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()), BLOCK_ITEM);

    protected static void init() {
    }
}
