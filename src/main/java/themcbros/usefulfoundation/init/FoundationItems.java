package themcbros.usefulfoundation.init;

import com.google.common.collect.Lists;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.items.HammerItem;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = UsefulFoundation.MOD_ID)
public class FoundationItems {
    private static final List<Item> ITEMS = Lists.newArrayList();

    //Tool Items
    public static final HammerItem HAMMER = register("hammer", new HammerItem(new Item.Properties().tab(UsefulFoundation.GROUP)));

    //Blocks
    public static final BlockItem USEFUL_BEEHIVE = register("useful_beehive", new BlockItem(FoundationBlocks.USEFUL_BEEHIVE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem TIN_ORE = register("tin_ore", new BlockItem(FoundationBlocks.TIN_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", new BlockItem(FoundationBlocks.DEEPSLATE_TIN_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem TIN_BLOCK = register("tin_block", new BlockItem(FoundationBlocks.TIN_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_TIN_BLOCK = register("raw_tin_block", new BlockItem(FoundationBlocks.RAW_TIN_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem BRONZE_BLOCK = register("bronze_block", new BlockItem(FoundationBlocks.BRONZE_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_BRONZE_BLOCK = register("raw_bronze_block", new BlockItem(FoundationBlocks.RAW_BRONZE_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem NICKEL_ORE = register("nickel_ore", new BlockItem(FoundationBlocks.NICKEL_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", new BlockItem(FoundationBlocks.DEEPSLATE_NICKEL_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem NICKEL_BLOCK = register("nickel_block", new BlockItem(FoundationBlocks.NICKEL_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_NICKEL_BLOCK = register("raw_nickel_block", new BlockItem(FoundationBlocks.RAW_NICKEL_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem INVAR_BLOCK = register("invar_block", new BlockItem(FoundationBlocks.INVAR_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_INVAR_BLOCK = register("raw_invar_block", new BlockItem(FoundationBlocks.RAW_INVAR_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem LEAD_ORE = register("lead_ore", new BlockItem(FoundationBlocks.LEAD_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", new BlockItem(FoundationBlocks.DEEPSLATE_LEAD_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem LEAD_BLOCK = register("lead_block", new BlockItem(FoundationBlocks.LEAD_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_LEAD_BLOCK = register("raw_lead_block", new BlockItem(FoundationBlocks.RAW_LEAD_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem SILVER_ORE = register("silver_ore", new BlockItem(FoundationBlocks.SILVER_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new BlockItem(FoundationBlocks.DEEPSLATE_SILVER_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem SILVER_BLOCK = register("silver_block", new BlockItem(FoundationBlocks.SILVER_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_SILVER_BLOCK = register("raw_silver_block", new BlockItem(FoundationBlocks.RAW_SILVER_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem ELECTRUM_BLOCK = register("electrum_block", new BlockItem(FoundationBlocks.ELECTRUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_ELECTRUM_BLOCK = register("raw_electrum_block", new BlockItem(FoundationBlocks.RAW_ELECTRUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem URANIUM_ORE = register("uranium_ore", new BlockItem(FoundationBlocks.URANIUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", new BlockItem(FoundationBlocks.DEEPSLATE_URANIUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem URANIUM_BLOCK = register("uranium_block", new BlockItem(FoundationBlocks.URANIUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_URANIUM_BLOCK = register("raw_uranium_block", new BlockItem(FoundationBlocks.RAW_URANIUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));

    //Material Items
    public static final Item IRON_PLATE = register("iron_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item IRON_GEAR = register("iron_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item GOLD_PLATE = register("gold_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item GOLD_GEAR = register("gold_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_PLATE = register("copper_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_GEAR = register("copper_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_INGOT = register("tin_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_TIN = register("raw_tin", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_NUGGET = register("tin_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_PLATE = register("tin_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_GEAR = register("tin_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_INGOT = register("bronze_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_BRONZE = register("raw_bronze", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_NUGGET = register("bronze_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_PLATE = register("bronze_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_GEAR = register("bronze_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_INGOT = register("nickel_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_NICKEL = register("raw_nickel", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_NUGGET = register("nickel_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_PLATE = register("nickel_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_GEAR = register("nickel_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_INGOT = register("invar_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_INVAR = register("raw_invar", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_NUGGET = register("invar_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_PLATE = register("invar_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_GEAR = register("invar_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_INGOT = register("lead_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_LEAD = register("raw_lead", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_NUGGET = register("lead_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_PLATE = register("lead_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_GEAR = register("lead_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_INGOT = register("silver_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_SILVER = register("raw_silver", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_NUGGET = register("silver_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_PLATE = register("silver_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_GEAR = register("silver_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_INGOT = register("electrum_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_ELECTRUM = register("raw_electrum", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_NUGGET = register("electrum_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_PLATE = register("electrum_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_GEAR = register("electrum_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_INGOT = register("uranium_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_URANIUM = register("raw_uranium", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_NUGGET = register("uranium_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_PLATE = register("uranium_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_GEAR = register("uranium_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    // TODO: Aluminum (coming soon)

    private static <T extends Item> T register(String registryName, T item) {
        item.setRegistryName(UsefulFoundation.getId(registryName));
        ITEMS.add(item);
        return item;
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        ITEMS.forEach(event.getRegistry()::register);
    }
}