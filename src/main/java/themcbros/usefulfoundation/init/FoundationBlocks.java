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

import java.util.function.Supplier;

import static themcbros.usefulfoundation.init.Registration.BLOCKS;

public class FoundationBlocks {
    public static final ItemObject<BeehiveBlock> USEFUL_BEEHIVE = register("useful_beehive", () -> new UsefulBeehiveBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD)));
    public static final ItemObject<Block> TIN_ORE = register("tin_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE)));
    public static final ItemObject<Block> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> TIN_BLOCK = register("tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_TIN_BLOCK = register("raw_tin_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> BRONZE_BLOCK = register("bronze_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> NICKEL_ORE = register("nickel_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> NICKEL_BLOCK = register("nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_NICKEL_BLOCK = register("raw_nickel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> INVAR_BLOCK = register("invar_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> LEAD_ORE = register("lead_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> LEAD_BLOCK = register("lead_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_LEAD_BLOCK = register("raw_lead_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> SILVER_ORE = register("silver_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> SILVER_BLOCK = register("silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_SILVER_BLOCK = register("raw_silver_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> ELECTRUM_BLOCK = register("electrum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> URANIUM_ORE = register("uranium_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> URANIUM_BLOCK = register("uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_URANIUM_BLOCK = register("raw_uranium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> ALUMINUM_ORE = register("aluminum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_ALUMINUM_ORE = register("deepslate_aluminum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> ALUMINUM_BLOCK = register("aluminum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_ALUMINUM_BLOCK = register("raw_aluminum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> PLATINUM_ORE = register("platinum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore", () -> new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> PLATINUM_BLOCK = register("platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> RAW_PLATINUM_BLOCK = register("raw_platinum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> ENDERIUM_BLOCK = register("enderium_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> SIGNALUM_BLOCK = register("signalum_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final ItemObject<Block> STEEL_BLOCK = register("steel_block", () -> new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    private static <T extends Block> ItemObject<T> register(String registryName, Supplier<T> blockSupplier) {
        return BLOCKS.register(registryName, blockSupplier, block -> {
            Item.Properties props = new Item.Properties().tab(UsefulFoundation.GROUP);
            return new BlockItem(block, props);
        });
    }

    public static void init() {
    }
}
