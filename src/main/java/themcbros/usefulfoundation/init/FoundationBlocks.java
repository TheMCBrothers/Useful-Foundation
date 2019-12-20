package themcbros.usefulfoundation.init;

import com.google.common.collect.Lists;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class FoundationBlocks {

    private static final List<Block> BLOCKS = Lists.newArrayList();

    public static final BeehiveBlock USEFUL_BEE_HIVE = register("useful_beehive", new BeehiveBlock(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD)));
    public static final Block COPPER_ORE = register("copper_ore", new Block(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(5f).sound(SoundType.STONE)));
    public static final Block COPPER_BLOCK = register("copper_block", new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f).sound(SoundType.METAL)));
    public static final Block TIN_ORE = register("tin_ore", new Block(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(5f).sound(SoundType.STONE)));
    public static final Block TIN_BLOCK = register("tin_block", new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f).sound(SoundType.METAL)));
    public static final Block BRONZE_BLOCK = register("bronze_block", new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5f).sound(SoundType.METAL)));

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
