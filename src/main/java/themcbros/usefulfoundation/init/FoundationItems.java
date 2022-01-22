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
    public static final BlockItem NICKEL_ORE = register("nickel_ore", new BlockItem(FoundationBlocks.NICKEL_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem LEAD_ORE = register("lead_ore", new BlockItem(FoundationBlocks.LEAD_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem SILVER_ORE = register("silver_ore", new BlockItem(FoundationBlocks.SILVER_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem URANIUM_ORE = register("uranium_ore", new BlockItem(FoundationBlocks.URANIUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem ALUMINUM_ORE = register("aluminum_ore", new BlockItem(FoundationBlocks.ALUMINUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem PLATINUM_ORE = register("platinum_ore", new BlockItem(FoundationBlocks.PLATINUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final BlockItem DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", new BlockItem(FoundationBlocks.DEEPSLATE_TIN_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", new BlockItem(FoundationBlocks.DEEPSLATE_NICKEL_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", new BlockItem(FoundationBlocks.DEEPSLATE_LEAD_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", new BlockItem(FoundationBlocks.DEEPSLATE_SILVER_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", new BlockItem(FoundationBlocks.DEEPSLATE_URANIUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_ALUMINUM_ORE = register("deepslate_aluminum_ore", new BlockItem(FoundationBlocks.DEEPSLATE_ALUMINUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore", new BlockItem(FoundationBlocks.DEEPSLATE_PLATINUM_ORE, new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final BlockItem RAW_TIN_BLOCK = register("raw_tin_block", new BlockItem(FoundationBlocks.RAW_TIN_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_NICKEL_BLOCK = register("raw_nickel_block", new BlockItem(FoundationBlocks.RAW_NICKEL_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_LEAD_BLOCK = register("raw_lead_block", new BlockItem(FoundationBlocks.RAW_LEAD_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_SILVER_BLOCK = register("raw_silver_block", new BlockItem(FoundationBlocks.RAW_SILVER_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_URANIUM_BLOCK = register("raw_uranium_block", new BlockItem(FoundationBlocks.RAW_URANIUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_ALUMINUM_BLOCK = register("raw_aluminum_block", new BlockItem(FoundationBlocks.RAW_ALUMINUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem RAW_PLATINUM_BLOCK = register("raw_platinum_block", new BlockItem(FoundationBlocks.RAW_PLATINUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final BlockItem TIN_BLOCK = register("tin_block", new BlockItem(FoundationBlocks.TIN_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem BRONZE_BLOCK = register("bronze_block", new BlockItem(FoundationBlocks.BRONZE_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem NICKEL_BLOCK = register("nickel_block", new BlockItem(FoundationBlocks.NICKEL_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem INVAR_BLOCK = register("invar_block", new BlockItem(FoundationBlocks.INVAR_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem LEAD_BLOCK = register("lead_block", new BlockItem(FoundationBlocks.LEAD_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem SILVER_BLOCK = register("silver_block", new BlockItem(FoundationBlocks.SILVER_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem ELECTRUM_BLOCK = register("electrum_block", new BlockItem(FoundationBlocks.ELECTRUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem URANIUM_BLOCK = register("uranium_block", new BlockItem(FoundationBlocks.URANIUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem ALUMINUM_BLOCK = register("aluminum_block", new BlockItem(FoundationBlocks.ALUMINUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem PLATINUM_BLOCK = register("platinum_block", new BlockItem(FoundationBlocks.PLATINUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem ENDERIUM_BLOCK = register("enderium_block", new BlockItem(FoundationBlocks.ENDERIUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem SIGNALUM_BLOCK = register("signalum_block", new BlockItem(FoundationBlocks.SIGNALUM_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final BlockItem STEEL_BLOCK = register("steel_block", new BlockItem(FoundationBlocks.STEEL_BLOCK, new Item.Properties().tab(UsefulFoundation.GROUP)));

    //Material Items
    public static final Item IRON_PLATE = register("iron_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item IRON_GEAR = register("iron_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item IRON_DUST = register("iron_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item GOLD_PLATE = register("gold_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item GOLD_GEAR = register("gold_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item GOLD_DUST = register("gold_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item DIAMOND_PLATE = register("diamond_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item DIAMOND_GEAR = register("diamond_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item DIAMOND_DUST = register("diamond_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_PLATE = register("copper_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_GEAR = register("copper_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item COPPER_DUST = register("copper_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_INGOT = register("tin_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_TIN = register("raw_tin", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_NUGGET = register("tin_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_PLATE = register("tin_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_GEAR = register("tin_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item TIN_DUST = register("tin_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_INGOT = register("bronze_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_NUGGET = register("bronze_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_PLATE = register("bronze_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_GEAR = register("bronze_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item BRONZE_DUST = register("bronze_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_INGOT = register("nickel_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_NICKEL = register("raw_nickel", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_NUGGET = register("nickel_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_PLATE = register("nickel_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_GEAR = register("nickel_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item NICKEL_DUST = register("nickel_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_INGOT = register("invar_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_NUGGET = register("invar_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_PLATE = register("invar_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_GEAR = register("invar_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item INVAR_DUST = register("invar_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_INGOT = register("lead_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_LEAD = register("raw_lead", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_NUGGET = register("lead_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_PLATE = register("lead_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_GEAR = register("lead_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item LEAD_DUST = register("lead_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_INGOT = register("silver_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_SILVER = register("raw_silver", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_NUGGET = register("silver_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_PLATE = register("silver_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_GEAR = register("silver_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SILVER_DUST = register("silver_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_INGOT = register("electrum_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_NUGGET = register("electrum_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_PLATE = register("electrum_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_GEAR = register("electrum_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ELECTRUM_DUST = register("electrum_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_INGOT = register("uranium_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_URANIUM = register("raw_uranium", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_NUGGET = register("uranium_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_PLATE = register("uranium_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_GEAR = register("uranium_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item URANIUM_DUST = register("uranium_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ALUMINUM_INGOT = register("aluminum_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_ALUMINUM = register("raw_aluminum", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ALUMINUM_NUGGET = register("aluminum_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ALUMINUM_PLATE = register("aluminum_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ALUMINUM_GEAR = register("aluminum_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ALUMINUM_DUST = register("aluminum_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item PLATINUM_INGOT = register("platinum_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item RAW_PLATINUM = register("raw_platinum", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item PLATINUM_NUGGET = register("platinum_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item PLATINUM_PLATE = register("platinum_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item PLATINUM_GEAR = register("platinum_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item PLATINUM_DUST = register("platinum_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ENDERIUM_INGOT = register("enderium_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ENDERIUM_NUGGET = register("enderium_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ENDERIUM_PLATE = register("enderium_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ENDERIUM_GEAR = register("enderium_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item ENDERIUM_DUST = register("enderium_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SIGNALUM_INGOT = register("signalum_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SIGNALUM_NUGGET = register("signalum_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SIGNALUM_PLATE = register("signalum_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SIGNALUM_GEAR = register("signalum_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item SIGNALUM_DUST = register("signalum_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item STEEL_NUGGET = register("steel_nugget", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item STEEL_PLATE = register("steel_plate", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item STEEL_GEAR = register("steel_gear", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final Item STEEL_DUST = register("steel_dust", new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));

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