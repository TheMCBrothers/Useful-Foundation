package net.themcbrothers.usefulfoundation.core;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.themcbrothers.usefulfoundation.item.HammerItem;

import static net.themcbrothers.usefulfoundation.core.Registration.ITEMS;

public final class FoundationItems {
    static void init() {
    }

    // Tool Items
    public static final DeferredItem<HammerItem> HAMMER = ITEMS.register("hammer", () -> new HammerItem(new Item.Properties()));

    // Material Items
    public static final DeferredItem<Item> IRON_PLATE = ITEMS.registerSimpleItem("iron_plate");
    public static final DeferredItem<Item> IRON_GEAR = ITEMS.registerSimpleItem("iron_gear");
    public static final DeferredItem<Item> IRON_DUST = ITEMS.registerSimpleItem("iron_dust");
    public static final DeferredItem<Item> GOLD_PLATE = ITEMS.registerSimpleItem("gold_plate");
    public static final DeferredItem<Item> GOLD_GEAR = ITEMS.registerSimpleItem("gold_gear");
    public static final DeferredItem<Item> GOLD_DUST = ITEMS.registerSimpleItem("gold_dust");
    public static final DeferredItem<Item> DIAMOND_PLATE = ITEMS.registerSimpleItem("diamond_plate");
    public static final DeferredItem<Item> DIAMOND_GEAR = ITEMS.registerSimpleItem("diamond_gear");
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.registerSimpleItem("diamond_dust");
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.registerSimpleItem("copper_nugget");
    public static final DeferredItem<Item> COPPER_PLATE = ITEMS.registerSimpleItem("copper_plate");
    public static final DeferredItem<Item> COPPER_GEAR = ITEMS.registerSimpleItem("copper_gear");
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.registerSimpleItem("copper_dust");
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot");
    public static final DeferredItem<Item> RAW_TIN = ITEMS.registerSimpleItem("raw_tin");
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.registerSimpleItem("tin_nugget");
    public static final DeferredItem<Item> TIN_PLATE = ITEMS.registerSimpleItem("tin_plate");
    public static final DeferredItem<Item> TIN_GEAR = ITEMS.registerSimpleItem("tin_gear");
    public static final DeferredItem<Item> TIN_DUST = ITEMS.registerSimpleItem("tin_dust");
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.registerSimpleItem("bronze_ingot");
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.registerSimpleItem("bronze_nugget");
    public static final DeferredItem<Item> BRONZE_PLATE = ITEMS.registerSimpleItem("bronze_plate");
    public static final DeferredItem<Item> BRONZE_GEAR = ITEMS.registerSimpleItem("bronze_gear");
    public static final DeferredItem<Item> BRONZE_DUST = ITEMS.registerSimpleItem("bronze_dust");
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.registerSimpleItem("nickel_ingot");
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.registerSimpleItem("raw_nickel");
    public static final DeferredItem<Item> NICKEL_NUGGET = ITEMS.registerSimpleItem("nickel_nugget");
    public static final DeferredItem<Item> NICKEL_PLATE = ITEMS.registerSimpleItem("nickel_plate");
    public static final DeferredItem<Item> NICKEL_GEAR = ITEMS.registerSimpleItem("nickel_gear");
    public static final DeferredItem<Item> NICKEL_DUST = ITEMS.registerSimpleItem("nickel_dust");
    public static final DeferredItem<Item> INVAR_INGOT = ITEMS.registerSimpleItem("invar_ingot");
    public static final DeferredItem<Item> INVAR_NUGGET = ITEMS.registerSimpleItem("invar_nugget");
    public static final DeferredItem<Item> INVAR_PLATE = ITEMS.registerSimpleItem("invar_plate");
    public static final DeferredItem<Item> INVAR_GEAR = ITEMS.registerSimpleItem("invar_gear");
    public static final DeferredItem<Item> INVAR_DUST = ITEMS.registerSimpleItem("invar_dust");
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.registerSimpleItem("lead_ingot");
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.registerSimpleItem("raw_lead");
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.registerSimpleItem("lead_nugget");
    public static final DeferredItem<Item> LEAD_PLATE = ITEMS.registerSimpleItem("lead_plate");
    public static final DeferredItem<Item> LEAD_GEAR = ITEMS.registerSimpleItem("lead_gear");
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.registerSimpleItem("lead_dust");
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.registerSimpleItem("silver_nugget");
    public static final DeferredItem<Item> SILVER_PLATE = ITEMS.registerSimpleItem("silver_plate");
    public static final DeferredItem<Item> SILVER_GEAR = ITEMS.registerSimpleItem("silver_gear");
    public static final DeferredItem<Item> SILVER_DUST = ITEMS.registerSimpleItem("silver_dust");
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.registerSimpleItem("electrum_ingot");
    public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.registerSimpleItem("electrum_nugget");
    public static final DeferredItem<Item> ELECTRUM_PLATE = ITEMS.registerSimpleItem("electrum_plate");
    public static final DeferredItem<Item> ELECTRUM_GEAR = ITEMS.registerSimpleItem("electrum_gear");
    public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.registerSimpleItem("electrum_dust");
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.registerSimpleItem("uranium_ingot");
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.registerSimpleItem("raw_uranium");
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.registerSimpleItem("uranium_nugget");
    public static final DeferredItem<Item> URANIUM_PLATE = ITEMS.registerSimpleItem("uranium_plate");
    public static final DeferredItem<Item> URANIUM_GEAR = ITEMS.registerSimpleItem("uranium_gear");
    public static final DeferredItem<Item> URANIUM_DUST = ITEMS.registerSimpleItem("uranium_dust");
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot");
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.registerSimpleItem("raw_aluminum");
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.registerSimpleItem("aluminum_nugget");
    public static final DeferredItem<Item> ALUMINUM_PLATE = ITEMS.registerSimpleItem("aluminum_plate");
    public static final DeferredItem<Item> ALUMINUM_GEAR = ITEMS.registerSimpleItem("aluminum_gear");
    public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.registerSimpleItem("aluminum_dust");
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.registerSimpleItem("platinum_ingot");
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.registerSimpleItem("raw_platinum");
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.registerSimpleItem("platinum_nugget");
    public static final DeferredItem<Item> PLATINUM_PLATE = ITEMS.registerSimpleItem("platinum_plate");
    public static final DeferredItem<Item> PLATINUM_GEAR = ITEMS.registerSimpleItem("platinum_gear");
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.registerSimpleItem("platinum_dust");
    public static final DeferredItem<Item> ENDERIUM_INGOT = ITEMS.registerSimpleItem("enderium_ingot");
    public static final DeferredItem<Item> ENDERIUM_NUGGET = ITEMS.registerSimpleItem("enderium_nugget");
    public static final DeferredItem<Item> ENDERIUM_PLATE = ITEMS.registerSimpleItem("enderium_plate");
    public static final DeferredItem<Item> ENDERIUM_GEAR = ITEMS.registerSimpleItem("enderium_gear");
    public static final DeferredItem<Item> ENDERIUM_DUST = ITEMS.registerSimpleItem("enderium_dust");
    public static final DeferredItem<Item> SIGNALUM_INGOT = ITEMS.registerSimpleItem("signalum_ingot");
    public static final DeferredItem<Item> SIGNALUM_NUGGET = ITEMS.registerSimpleItem("signalum_nugget");
    public static final DeferredItem<Item> SIGNALUM_PLATE = ITEMS.registerSimpleItem("signalum_plate");
    public static final DeferredItem<Item> SIGNALUM_GEAR = ITEMS.registerSimpleItem("signalum_gear");
    public static final DeferredItem<Item> SIGNALUM_DUST = ITEMS.registerSimpleItem("signalum_dust");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.registerSimpleItem("steel_nugget");
    public static final DeferredItem<Item> STEEL_PLATE = ITEMS.registerSimpleItem("steel_plate");
    public static final DeferredItem<Item> STEEL_GEAR = ITEMS.registerSimpleItem("steel_gear");
    public static final DeferredItem<Item> STEEL_DUST = ITEMS.registerSimpleItem("steel_dust");
}
