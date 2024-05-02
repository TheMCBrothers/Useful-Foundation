package net.themcbrothers.usefulfoundation.core;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.themcbrothers.lib.util.TagUtils;

public class FoundationTags {
    public static class Blocks {
        // Tools
        public static final TagKey<Block> MINEABLE_WITH_HAMMER = TagUtils.commonBlockTag("mineable/hammer");

        // Ore Blocks
        public static final TagKey<Block> ORES_ALUMINUM = TagUtils.commonBlockTag("ores/aluminum");
        public static final TagKey<Block> ORES_LEAD = TagUtils.commonBlockTag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = TagUtils.commonBlockTag("ores/nickel");
        public static final TagKey<Block> ORES_PLATINUM = TagUtils.commonBlockTag("ores/platinum");
        public static final TagKey<Block> ORES_SILVER = TagUtils.commonBlockTag("ores/silver");
        public static final TagKey<Block> ORES_TIN = TagUtils.commonBlockTag("ores/tin");
        public static final TagKey<Block> ORES_URANIUM = TagUtils.commonBlockTag("ores/uranium");

        // Storage Blocks
        public static final TagKey<Block> BLOCKS_ALUMINUM = TagUtils.commonBlockTag("storage_blocks/aluminum");
        public static final TagKey<Block> BLOCKS_BRONZE = TagUtils.commonBlockTag("storage_blocks/bronze");
        public static final TagKey<Block> BLOCKS_ELECTRUM = TagUtils.commonBlockTag("storage_blocks/electrum");
        public static final TagKey<Block> BLOCKS_ENDEIRUM = TagUtils.commonBlockTag("storage_blocks/enderium");
        public static final TagKey<Block> BLOCKS_INVAR = TagUtils.commonBlockTag("storage_blocks/invar");
        public static final TagKey<Block> BLOCKS_LEAD = TagUtils.commonBlockTag("storage_blocks/lead");
        public static final TagKey<Block> BLOCKS_NICKEL = TagUtils.commonBlockTag("storage_blocks/nickel");
        public static final TagKey<Block> BLOCKS_PLATINUM = TagUtils.commonBlockTag("storage_blocks/platinum");
        public static final TagKey<Block> BLOCKS_SILVER = TagUtils.commonBlockTag("storage_blocks/silver");
        public static final TagKey<Block> BLOCKS_SIGNALUM = TagUtils.commonBlockTag("storage_blocks/signalum");
        public static final TagKey<Block> BLOCKS_STEEL = TagUtils.commonBlockTag("storage_blocks/steel");
        public static final TagKey<Block> BLOCKS_TIN = TagUtils.commonBlockTag("storage_blocks/tin");
        public static final TagKey<Block> BLOCKS_URANIUM = TagUtils.commonBlockTag("storage_blocks/uranium");

        // Raw Storage Blocks
        public static final TagKey<Block> RAW_BLOCKS_ALUMINUM = TagUtils.commonBlockTag("storage_blocks/raw_aluminum");
        public static final TagKey<Block> RAW_BLOCKS_LEAD = TagUtils.commonBlockTag("storage_blocks/raw_lead");
        public static final TagKey<Block> RAW_BLOCKS_NICKEL = TagUtils.commonBlockTag("storage_blocks/raw_nickel");
        public static final TagKey<Block> RAW_BLOCKS_PLATINUM = TagUtils.commonBlockTag("storage_blocks/raw_platinum");
        public static final TagKey<Block> RAW_BLOCKS_SILVER = TagUtils.commonBlockTag("storage_blocks/raw_silver");
        public static final TagKey<Block> RAW_BLOCKS_TIN = TagUtils.commonBlockTag("storage_blocks/raw_tin");
        public static final TagKey<Block> RAW_BLOCKS_URANIUM = TagUtils.commonBlockTag("storage_blocks/raw_uranium");
    }

    public static class Items {
        // Ingots
        public static final TagKey<Item> INGOTS_ALUMINUM = TagUtils.commonItemTag("ingots/aluminum");
        public static final TagKey<Item> INGOTS_BRONZE = TagUtils.commonItemTag("ingots/bronze");
        public static final TagKey<Item> INGOTS_ELECTRUM = TagUtils.commonItemTag("ingots/electrum");
        public static final TagKey<Item> INGOTS_ENDERIUM = TagUtils.commonItemTag("ingots/enderium");
        public static final TagKey<Item> INGOTS_INVAR = TagUtils.commonItemTag("ingots/invar");
        public static final TagKey<Item> INGOTS_LEAD = TagUtils.commonItemTag("ingots/lead");
        public static final TagKey<Item> INGOTS_NICKEL = TagUtils.commonItemTag("ingots/nickel");
        public static final TagKey<Item> INGOTS_PLATINUM = TagUtils.commonItemTag("ingots/platinum");
        public static final TagKey<Item> INGOTS_SIGNALUM = TagUtils.commonItemTag("ingots/signalum");
        public static final TagKey<Item> INGOTS_SILVER = TagUtils.commonItemTag("ingots/silver");
        public static final TagKey<Item> INGOTS_STEEL = TagUtils.commonItemTag("ingots/steel");
        public static final TagKey<Item> INGOTS_TIN = TagUtils.commonItemTag("ingots/tin");
        public static final TagKey<Item> INGOTS_URANIUM = TagUtils.commonItemTag("ingots/uranium");

        // Raw Materials
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = TagUtils.commonItemTag("raw_materials/aluminum");
        public static final TagKey<Item> RAW_MATERIALS_LEAD = TagUtils.commonItemTag("raw_materials/lead");
        public static final TagKey<Item> RAW_MATERIALS_NICKEL = TagUtils.commonItemTag("raw_materials/nickel");
        public static final TagKey<Item> RAW_MATERIALS_PLATINUM = TagUtils.commonItemTag("raw_materials/platinum");
        public static final TagKey<Item> RAW_MATERIALS_SILVER = TagUtils.commonItemTag("raw_materials/silver");
        public static final TagKey<Item> RAW_MATERIALS_TIN = TagUtils.commonItemTag("raw_materials/tin");
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = TagUtils.commonItemTag("raw_materials/uranium");

        // Nuggets
        public static final TagKey<Item> NUGGETS_ALUMINUM = TagUtils.commonItemTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGETS_BRONZE = TagUtils.commonItemTag("nuggets/bronze");
        public static final TagKey<Item> NUGGETS_COPPER = TagUtils.commonItemTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_ELECTRUM = TagUtils.commonItemTag("nuggets/electrum");
        public static final TagKey<Item> NUGGETS_ENDERIUM = TagUtils.commonItemTag("nuggets/enderium");
        public static final TagKey<Item> NUGGETS_INVAR = TagUtils.commonItemTag("nuggets/invar");
        public static final TagKey<Item> NUGGETS_LEAD = TagUtils.commonItemTag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_NICKEL = TagUtils.commonItemTag("nuggets/nickel");
        public static final TagKey<Item> NUGGETS_PLATINUM = TagUtils.commonItemTag("nuggets/platinum");
        public static final TagKey<Item> NUGGETS_SIGNALUM = TagUtils.commonItemTag("nuggets/signalum");
        public static final TagKey<Item> NUGGETS_SILVER = TagUtils.commonItemTag("nuggets/silver");
        public static final TagKey<Item> NUGGETS_STEEL = TagUtils.commonItemTag("nuggets/steel");
        public static final TagKey<Item> NUGGETS_TIN = TagUtils.commonItemTag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_URANIUM = TagUtils.commonItemTag("nuggets/uranium");

        // Storage Blocks
        public static final TagKey<Item> BLOCKS_ALUMINUM = TagUtils.commonItemTag("storage_blocks/aluminum");
        public static final TagKey<Item> BLOCKS_BRONZE = TagUtils.commonItemTag("storage_blocks/bronze");
        public static final TagKey<Item> BLOCKS_COPPER = TagUtils.commonItemTag("storage_blocks/copper");
        public static final TagKey<Item> BLOCKS_ELECTRUM = TagUtils.commonItemTag("storage_blocks/electrum");
        public static final TagKey<Item> BLOCKS_ENDERIUM = TagUtils.commonItemTag("storage_blocks/enderium");
        public static final TagKey<Item> BLOCKS_INVAR = TagUtils.commonItemTag("storage_blocks/invar");
        public static final TagKey<Item> BLOCKS_LEAD = TagUtils.commonItemTag("storage_blocks/lead");
        public static final TagKey<Item> BLOCKS_NICKEL = TagUtils.commonItemTag("storage_blocks/nickel");
        public static final TagKey<Item> BLOCKS_PLATINUM = TagUtils.commonItemTag("storage_blocks/platinum");
        public static final TagKey<Item> BLOCKS_SIGNALUM = TagUtils.commonItemTag("storage_blocks/signalum");
        public static final TagKey<Item> BLOCKS_SILVER = TagUtils.commonItemTag("storage_blocks/silver");
        public static final TagKey<Item> BLOCKS_STEEL = TagUtils.commonItemTag("storage_blocks/steel");
        public static final TagKey<Item> BLOCKS_TIN = TagUtils.commonItemTag("storage_blocks/tin");
        public static final TagKey<Item> BLOCKS_URANIUM = TagUtils.commonItemTag("storage_blocks/uranium");

        // Raw Storage Blocks
        public static final TagKey<Item> RAW_BLOCKS_ALUMINUM = TagUtils.commonItemTag("storage_blocks/raw_aluminum");
        public static final TagKey<Item> RAW_BLOCKS_LEAD = TagUtils.commonItemTag("storage_blocks/raw_lead");
        public static final TagKey<Item> RAW_BLOCKS_NICKEL = TagUtils.commonItemTag("storage_blocks/raw_nickel");
        public static final TagKey<Item> RAW_BLOCKS_PLATINUM = TagUtils.commonItemTag("storage_blocks/raw_platinum");
        public static final TagKey<Item> RAW_BLOCKS_SILVER = TagUtils.commonItemTag("storage_blocks/raw_silver");
        public static final TagKey<Item> RAW_BLOCKS_TIN = TagUtils.commonItemTag("storage_blocks/raw_tin");
        public static final TagKey<Item> RAW_BLOCKS_URANIUM = TagUtils.commonItemTag("storage_blocks/raw_uranium");

        // Ores
        public static final TagKey<Item> ORES_ALUMINUM = TagUtils.commonItemTag("ores/aluminum");
        public static final TagKey<Item> ORES_LEAD = TagUtils.commonItemTag("ores/lead");
        public static final TagKey<Item> ORES_NICKEL = TagUtils.commonItemTag("ores/nickel");
        public static final TagKey<Item> ORES_PLATINUM = TagUtils.commonItemTag("ores/platinum");
        public static final TagKey<Item> ORES_SILVER = TagUtils.commonItemTag("ores/silver");
        public static final TagKey<Item> ORES_TIN = TagUtils.commonItemTag("ores/tin");
        public static final TagKey<Item> ORES_URANIUM = TagUtils.commonItemTag("ores/uranium");

        // Gears
        public static final TagKey<Item> GEARS = TagUtils.commonItemTag("gears");
        public static final TagKey<Item> GEARS_ALUMINUM = TagUtils.commonItemTag("gears/aluminum");
        public static final TagKey<Item> GEARS_BRONZE = TagUtils.commonItemTag("gears/bronze");
        public static final TagKey<Item> GEARS_COPPER = TagUtils.commonItemTag("gears/copper");
        public static final TagKey<Item> GEARS_DIAMOND = TagUtils.commonItemTag("gears/diamond");
        public static final TagKey<Item> GEARS_ELECTRUM = TagUtils.commonItemTag("gears/electrum");
        public static final TagKey<Item> GEARS_GOLD = TagUtils.commonItemTag("gears/gold");
        public static final TagKey<Item> GEARS_ENDERIUM = TagUtils.commonItemTag("gears/enderium");
        public static final TagKey<Item> GEARS_INVAR = TagUtils.commonItemTag("gears/invar");
        public static final TagKey<Item> GEARS_IRON = TagUtils.commonItemTag("gears/iron");
        public static final TagKey<Item> GEARS_LEAD = TagUtils.commonItemTag("gears/lead");
        public static final TagKey<Item> GEARS_NICKEL = TagUtils.commonItemTag("gears/nickel");
        public static final TagKey<Item> GEARS_PLATINUM = TagUtils.commonItemTag("gears/platinum");
        public static final TagKey<Item> GEARS_SIGNALUM = TagUtils.commonItemTag("gears/signalum");
        public static final TagKey<Item> GEARS_SILVER = TagUtils.commonItemTag("gears/silver");
        public static final TagKey<Item> GEARS_STEEL = TagUtils.commonItemTag("gears/steel");
        public static final TagKey<Item> GEARS_TIN = TagUtils.commonItemTag("gears/tin");
        public static final TagKey<Item> GEARS_URANIUM = TagUtils.commonItemTag("gears/uranium");

        // Plates
        public static final TagKey<Item> PLATES = TagUtils.commonItemTag("plates");
        public static final TagKey<Item> PLATES_ALUMINUM = TagUtils.commonItemTag("plates/aluminum");
        public static final TagKey<Item> PLATES_BRONZE = TagUtils.commonItemTag("plates/bronze");
        public static final TagKey<Item> PLATES_COPPER = TagUtils.commonItemTag("plates/copper");
        public static final TagKey<Item> PLATES_DIAMOND = TagUtils.commonItemTag("plates/diamond");
        public static final TagKey<Item> PLATES_ELECTRUM = TagUtils.commonItemTag("plates/electrum");
        public static final TagKey<Item> PLATES_GOLD = TagUtils.commonItemTag("plates/gold");
        public static final TagKey<Item> PLATES_ENDERIUM = TagUtils.commonItemTag("plates/enderium");
        public static final TagKey<Item> PLATES_INVAR = TagUtils.commonItemTag("plates/invar");
        public static final TagKey<Item> PLATES_IRON = TagUtils.commonItemTag("plates/iron");
        public static final TagKey<Item> PLATES_LEAD = TagUtils.commonItemTag("plates/lead");
        public static final TagKey<Item> PLATES_NICKEL = TagUtils.commonItemTag("plates/nickel");
        public static final TagKey<Item> PLATES_PLATINUM = TagUtils.commonItemTag("plates/platinum");
        public static final TagKey<Item> PLATES_SIGNALUM = TagUtils.commonItemTag("plates/signalum");
        public static final TagKey<Item> PLATES_SILVER = TagUtils.commonItemTag("plates/silver");
        public static final TagKey<Item> PLATES_STEEL = TagUtils.commonItemTag("plates/steel");
        public static final TagKey<Item> PLATES_TIN = TagUtils.commonItemTag("plates/tin");
        public static final TagKey<Item> PLATES_URANIUM = TagUtils.commonItemTag("plates/uranium");

        // Dusts
        public static final TagKey<Item> DUSTS = TagUtils.commonItemTag("dusts");
        public static final TagKey<Item> DUSTS_ALUMINUM = TagUtils.commonItemTag("dusts/aluminum");
        public static final TagKey<Item> DUSTS_BRONZE = TagUtils.commonItemTag("dusts/bronze");
        public static final TagKey<Item> DUSTS_COPPER = TagUtils.commonItemTag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND = TagUtils.commonItemTag("dusts/diamond");
        public static final TagKey<Item> DUSTS_ELECTRUM = TagUtils.commonItemTag("dusts/electrum");
        public static final TagKey<Item> DUSTS_GOLD = TagUtils.commonItemTag("dusts/gold");
        public static final TagKey<Item> DUSTS_ENDERIUM = TagUtils.commonItemTag("dusts/enderium");
        public static final TagKey<Item> DUSTS_INVAR = TagUtils.commonItemTag("dusts/invar");
        public static final TagKey<Item> DUSTS_IRON = TagUtils.commonItemTag("dusts/iron");
        public static final TagKey<Item> DUSTS_LEAD = TagUtils.commonItemTag("dusts/lead");
        public static final TagKey<Item> DUSTS_NICKEL = TagUtils.commonItemTag("dusts/nickel");
        public static final TagKey<Item> DUSTS_PLATINUM = TagUtils.commonItemTag("dusts/platinum");
        public static final TagKey<Item> DUSTS_SIGNALUM = TagUtils.commonItemTag("dusts/signalum");
        public static final TagKey<Item> DUSTS_SILVER = TagUtils.commonItemTag("dusts/silver");
        public static final TagKey<Item> DUSTS_STEEL = TagUtils.commonItemTag("dusts/steel");
        public static final TagKey<Item> DUSTS_TIN = TagUtils.commonItemTag("dusts/tin");
        public static final TagKey<Item> DUSTS_URANIUM = TagUtils.commonItemTag("dusts/uranium");
    }
}
