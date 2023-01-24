package themcbros.usefulfoundation.init;

import net.minecraft.world.item.Item;
import net.themcbrothers.lib.registration.object.ItemObject;
import themcbros.usefulfoundation.items.HammerItem;

import static themcbros.usefulfoundation.init.Registration.ITEMS;

public class FoundationItems {
    //Tool Items
    public static final ItemObject<HammerItem> HAMMER = ITEMS.register("hammer", () -> new HammerItem(new Item.Properties()));

    //Material Items
    public static final ItemObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> IRON_GEAR = ITEMS.register("iron_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> GOLD_GEAR = ITEMS.register("gold_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> COPPER_PLATE = ITEMS.register("copper_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> COPPER_GEAR = ITEMS.register("copper_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> TIN_GEAR = ITEMS.register("tin_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> INVAR_PLATE = ITEMS.register("invar_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> INVAR_GEAR = ITEMS.register("invar_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> INVAR_DUST = ITEMS.register("invar_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> LEAD_PLATE = ITEMS.register("lead_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> LEAD_GEAR = ITEMS.register("lead_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SILVER_PLATE = ITEMS.register("silver_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> URANIUM_GEAR = ITEMS.register("uranium_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ENDERIUM_PLATE = ITEMS.register("enderium_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ENDERIUM_GEAR = ITEMS.register("enderium_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SIGNALUM_PLATE = ITEMS.register("signalum_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SIGNALUM_GEAR = ITEMS.register("signalum_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", () -> new Item(new Item.Properties()));
    public static final ItemObject<Item> STEEL_DUST = ITEMS.register("steel_dust", () -> new Item(new Item.Properties()));

    protected static void init() {
    }
}
