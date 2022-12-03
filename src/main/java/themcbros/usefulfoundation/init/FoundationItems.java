package themcbros.usefulfoundation.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.items.HammerItem;

import static themcbros.usefulfoundation.init.Registration.ITEMS;

public class FoundationItems {
    //Tool Items
    public static final RegistryObject<HammerItem> HAMMER = ITEMS.register("hammer", () -> new HammerItem(new Item.Properties().tab(UsefulFoundation.GROUP)));

    //Blocks
    public static final RegistryObject<BlockItem> USEFUL_BEEHIVE = ITEMS.register("useful_beehive", () -> new BlockItem(FoundationBlocks.USEFUL_BEEHIVE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> TIN_ORE = ITEMS.register("tin_ore", () -> new BlockItem(FoundationBlocks.TIN_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> NICKEL_ORE = ITEMS.register("nickel_ore", () -> new BlockItem(FoundationBlocks.NICKEL_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(FoundationBlocks.LEAD_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore", () -> new BlockItem(FoundationBlocks.SILVER_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> URANIUM_ORE = ITEMS.register("uranium_ore", () -> new BlockItem(FoundationBlocks.URANIUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> ALUMINUM_ORE = ITEMS.register("aluminum_ore", () -> new BlockItem(FoundationBlocks.ALUMINUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_ORE = ITEMS.register("platinum_ore", () -> new BlockItem(FoundationBlocks.PLATINUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final RegistryObject<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.register("deepslate_tin_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_TIN_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_NICKEL_ORE = ITEMS.register("deepslate_nickel_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_NICKEL_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_LEAD_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_SILVER_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_URANIUM_ORE = ITEMS.register("deepslate_uranium_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_URANIUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_ALUMINUM_ORE = ITEMS.register("deepslate_aluminum_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_ALUMINUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> DEEPSLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore", () -> new BlockItem(FoundationBlocks.DEEPSLATE_PLATINUM_ORE.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK = ITEMS.register("raw_tin_block", () -> new BlockItem(FoundationBlocks.RAW_TIN_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_NICKEL_BLOCK = ITEMS.register("raw_nickel_block", () -> new BlockItem(FoundationBlocks.RAW_NICKEL_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK = ITEMS.register("raw_lead_block", () -> new BlockItem(FoundationBlocks.RAW_LEAD_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK = ITEMS.register("raw_silver_block", () -> new BlockItem(FoundationBlocks.RAW_SILVER_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_URANIUM_BLOCK = ITEMS.register("raw_uranium_block", () -> new BlockItem(FoundationBlocks.RAW_URANIUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_ALUMINUM_BLOCK = ITEMS.register("raw_aluminum_block", () -> new BlockItem(FoundationBlocks.RAW_ALUMINUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> RAW_PLATINUM_BLOCK = ITEMS.register("raw_platinum_block", () -> new BlockItem(FoundationBlocks.RAW_PLATINUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));

    public static final RegistryObject<BlockItem> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(FoundationBlocks.TIN_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(FoundationBlocks.BRONZE_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(FoundationBlocks.NICKEL_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> INVAR_BLOCK = ITEMS.register("invar_block", () -> new BlockItem(FoundationBlocks.INVAR_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(FoundationBlocks.LEAD_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(FoundationBlocks.SILVER_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> ELECTRUM_BLOCK = ITEMS.register("electrum_block", () -> new BlockItem(FoundationBlocks.ELECTRUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(FoundationBlocks.URANIUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> ALUMINUM_BLOCK = ITEMS.register("aluminum_block", () -> new BlockItem(FoundationBlocks.ALUMINUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK = ITEMS.register("platinum_block", () -> new BlockItem(FoundationBlocks.PLATINUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> ENDERIUM_BLOCK = ITEMS.register("enderium_block", () -> new BlockItem(FoundationBlocks.ENDERIUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> SIGNALUM_BLOCK = ITEMS.register("signalum_block", () -> new BlockItem(FoundationBlocks.SIGNALUM_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(FoundationBlocks.STEEL_BLOCK.get(), new Item.Properties().tab(UsefulFoundation.GROUP)));

    //Material Items
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> INVAR_PLATE = ITEMS.register("invar_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> INVAR_GEAR = ITEMS.register("invar_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> INVAR_DUST = ITEMS.register("invar_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> LEAD_PLATE = ITEMS.register("lead_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ENDERIUM_PLATE = ITEMS.register("enderium_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ENDERIUM_GEAR = ITEMS.register("enderium_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SIGNALUM_PLATE = ITEMS.register("signalum_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SIGNALUM_GEAR = ITEMS.register("signalum_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", () -> new Item(new Item.Properties().tab(UsefulFoundation.GROUP)));

    protected static void init() {
    }
}
