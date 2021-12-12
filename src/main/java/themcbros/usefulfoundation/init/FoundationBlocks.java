package themcbros.usefulfoundation.init;

import com.google.common.collect.Lists;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.block.UsefulBeehiveBlock;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class FoundationBlocks {
    private static final List<Block> BLOCKS = Lists.newArrayList();

    public static final BeehiveBlock USEFUL_BEEHIVE = register("useful_beehive", new UsefulBeehiveBlock(Block.Properties.of(Material.WOOD).sound(SoundType.WOOD)));
    public static final Block TIN_ORE = register("tin_ore", new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block TIN_BLOCK = register("tin_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block BRONZE_BLOCK = register("bronze_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block NICKEL_ORE = register("nickel_ore", new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block NICKEL_BLOCK = register("nickel_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block INVAR_BLOCK = register("invar_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block LEAD_ORE = register("lead_ore", new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block LEAD_BLOCK = register("lead_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block SILVER_ORE = register("silver_ore", new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block SILVER_BLOCK = register("silver_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block ELECTRUM_BLOCK = register("electrum_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block URANIUM_ORE = register("uranium_ore", new Block(Block.Properties.of(Material.STONE).strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", new Block(Block.Properties.of(Material.STONE).strength(4.5F, 3F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final Block URANIUM_BLOCK = register("uranium_block", new Block(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    private static <T extends Block> T register(String registryName, T block) {
        block.setRegistryName(UsefulFoundation.getId(registryName));
        BLOCKS.add(block);
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        BLOCKS.forEach(event.getRegistry()::register);
    }
}
