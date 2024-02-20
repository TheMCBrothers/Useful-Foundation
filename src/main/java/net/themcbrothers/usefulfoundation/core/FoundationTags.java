package net.themcbrothers.usefulfoundation.core;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.themcbrothers.lib.util.TagUtils;

public class FoundationTags {
    public static class Blocks {
        // Tools
        public static final TagKey<Block> MINEABLE_WITH_HAMMER = TagUtils.forgeBlockTag("mineable/hammer");

        // Ore Blocks
        public static final TagKey<Block> ORES_ALUMINUM = TagUtils.forgeBlockTag("ores/aluminum");
        public static final TagKey<Block> ORES_LEAD = TagUtils.forgeBlockTag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = TagUtils.forgeBlockTag("ores/nickel");
        public static final TagKey<Block> ORES_PLATINUM = TagUtils.forgeBlockTag("ores/platinum");
        public static final TagKey<Block> ORES_SILVER = TagUtils.forgeBlockTag("ores/silver");
        public static final TagKey<Block> ORES_TIN = TagUtils.forgeBlockTag("ores/tin");
        public static final TagKey<Block> ORES_URANIUM = TagUtils.forgeBlockTag("ores/uranium");

        // Storage Blocks
        public static final TagKey<Block> BLOCKS_ALUMINUM = TagUtils.forgeBlockTag("storage_blocks/aluminum");
        public static final TagKey<Block> BLOCKS_BRONZE = TagUtils.forgeBlockTag("storage_blocks/bronze");
        public static final TagKey<Block> BLOCKS_ELECTRUM = TagUtils.forgeBlockTag("storage_blocks/electrum");
        public static final TagKey<Block> BLOCKS_ENDEIRUM = TagUtils.forgeBlockTag("storage_blocks/enderium");
        public static final TagKey<Block> BLOCKS_INVAR = TagUtils.forgeBlockTag("storage_blocks/invar");
        public static final TagKey<Block> BLOCKS_LEAD = TagUtils.forgeBlockTag("storage_blocks/lead");
        public static final TagKey<Block> BLOCKS_NICKEL = TagUtils.forgeBlockTag("storage_blocks/nickel");
        public static final TagKey<Block> BLOCKS_PLATINUM = TagUtils.forgeBlockTag("storage_blocks/platinum");
        public static final TagKey<Block> BLOCKS_SILVER = TagUtils.forgeBlockTag("storage_blocks/silver");
        public static final TagKey<Block> BLOCKS_SIGNALUM = TagUtils.forgeBlockTag("storage_blocks/signalum");
        public static final TagKey<Block> BLOCKS_STEEL = TagUtils.forgeBlockTag("storage_blocks/steel");
        public static final TagKey<Block> BLOCKS_TIN = TagUtils.forgeBlockTag("storage_blocks/tin");
        public static final TagKey<Block> BLOCKS_URANIUM = TagUtils.forgeBlockTag("storage_blocks/uranium");

        // Raw Storage Blocks
        public static final TagKey<Block> RAW_BLOCKS_ALUMINUM = TagUtils.forgeBlockTag("storage_blocks/raw_aluminum");
        public static final TagKey<Block> RAW_BLOCKS_LEAD = TagUtils.forgeBlockTag("storage_blocks/raw_lead");
        public static final TagKey<Block> RAW_BLOCKS_NICKEL = TagUtils.forgeBlockTag("storage_blocks/raw_nickel");
        public static final TagKey<Block> RAW_BLOCKS_PLATINUM = TagUtils.forgeBlockTag("storage_blocks/raw_platinum");
        public static final TagKey<Block> RAW_BLOCKS_SILVER = TagUtils.forgeBlockTag("storage_blocks/raw_silver");
        public static final TagKey<Block> RAW_BLOCKS_TIN = TagUtils.forgeBlockTag("storage_blocks/raw_tin");
        public static final TagKey<Block> RAW_BLOCKS_URANIUM = TagUtils.forgeBlockTag("storage_blocks/raw_uranium");
    }

    public static class Items {
        // Ingots
        public static final TagKey<Item> INGOTS_ALUMINUM = TagUtils.forgeItemTag("ingots/aluminum");
        public static final TagKey<Item> INGOTS_BRONZE = TagUtils.forgeItemTag("ingots/bronze");
        public static final TagKey<Item> INGOTS_ELECTRUM = TagUtils.forgeItemTag("ingots/electrum");
        public static final TagKey<Item> INGOTS_ENDERIUM = TagUtils.forgeItemTag("ingots/enderium");
        public static final TagKey<Item> INGOTS_INVAR = TagUtils.forgeItemTag("ingots/invar");
        public static final TagKey<Item> INGOTS_LEAD = TagUtils.forgeItemTag("ingots/lead");
        public static final TagKey<Item> INGOTS_NICKEL = TagUtils.forgeItemTag("ingots/nickel");
        public static final TagKey<Item> INGOTS_PLATINUM = TagUtils.forgeItemTag("ingots/platinum");
        public static final TagKey<Item> INGOTS_SIGNALUM = TagUtils.forgeItemTag("ingots/signalum");
        public static final TagKey<Item> INGOTS_SILVER = TagUtils.forgeItemTag("ingots/silver");
        public static final TagKey<Item> INGOTS_STEEL = TagUtils.forgeItemTag("ingots/steel");
        public static final TagKey<Item> INGOTS_TIN = TagUtils.forgeItemTag("ingots/tin");
        public static final TagKey<Item> INGOTS_URANIUM = TagUtils.forgeItemTag("ingots/uranium");

        // Raw Materials
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = TagUtils.forgeItemTag("raw_materials/aluminum");
        public static final TagKey<Item> RAW_MATERIALS_LEAD = TagUtils.forgeItemTag("raw_materials/lead");
        public static final TagKey<Item> RAW_MATERIALS_NICKEL = TagUtils.forgeItemTag("raw_materials/nickel");
        public static final TagKey<Item> RAW_MATERIALS_PLATINUM = TagUtils.forgeItemTag("raw_materials/platinum");
        public static final TagKey<Item> RAW_MATERIALS_SILVER = TagUtils.forgeItemTag("raw_materials/silver");
        public static final TagKey<Item> RAW_MATERIALS_TIN = TagUtils.forgeItemTag("raw_materials/tin");
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = TagUtils.forgeItemTag("raw_materials/uranium");

        // Nuggets
        public static final TagKey<Item> NUGGETS_ALUMINUM = TagUtils.forgeItemTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGETS_BRONZE = TagUtils.forgeItemTag("nuggets/bronze");
        public static final TagKey<Item> NUGGETS_COPPER = TagUtils.forgeItemTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_ELECTRUM = TagUtils.forgeItemTag("nuggets/electrum");
        public static final TagKey<Item> NUGGETS_ENDERIUM = TagUtils.forgeItemTag("nuggets/enderium");
        public static final TagKey<Item> NUGGETS_INVAR = TagUtils.forgeItemTag("nuggets/invar");
        public static final TagKey<Item> NUGGETS_LEAD = TagUtils.forgeItemTag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_NICKEL = TagUtils.forgeItemTag("nuggets/nickel");
        public static final TagKey<Item> NUGGETS_PLATINUM = TagUtils.forgeItemTag("nuggets/platinum");
        public static final TagKey<Item> NUGGETS_SIGNALUM = TagUtils.forgeItemTag("nuggets/signalum");
        public static final TagKey<Item> NUGGETS_SILVER = TagUtils.forgeItemTag("nuggets/silver");
        public static final TagKey<Item> NUGGETS_STEEL = TagUtils.forgeItemTag("nuggets/steel");
        public static final TagKey<Item> NUGGETS_TIN = TagUtils.forgeItemTag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_URANIUM = TagUtils.forgeItemTag("nuggets/uranium");

        // Storage Blocks
        public static final TagKey<Item> BLOCKS_ALUMINUM = TagUtils.forgeItemTag("storage_blocks/aluminum");
        public static final TagKey<Item> BLOCKS_BRONZE = TagUtils.forgeItemTag("storage_blocks/bronze");
        public static final TagKey<Item> BLOCKS_COPPER = TagUtils.forgeItemTag("storage_blocks/copper");
        public static final TagKey<Item> BLOCKS_ELECTRUM = TagUtils.forgeItemTag("storage_blocks/electrum");
        public static final TagKey<Item> BLOCKS_ENDERIUM = TagUtils.forgeItemTag("storage_blocks/enderium");
        public static final TagKey<Item> BLOCKS_INVAR = TagUtils.forgeItemTag("storage_blocks/invar");
        public static final TagKey<Item> BLOCKS_LEAD = TagUtils.forgeItemTag("storage_blocks/lead");
        public static final TagKey<Item> BLOCKS_NICKEL = TagUtils.forgeItemTag("storage_blocks/nickel");
        public static final TagKey<Item> BLOCKS_PLATINUM = TagUtils.forgeItemTag("storage_blocks/platinum");
        public static final TagKey<Item> BLOCKS_SIGNALUM = TagUtils.forgeItemTag("storage_blocks/signalum");
        public static final TagKey<Item> BLOCKS_SILVER = TagUtils.forgeItemTag("storage_blocks/silver");
        public static final TagKey<Item> BLOCKS_STEEL = TagUtils.forgeItemTag("storage_blocks/steel");
        public static final TagKey<Item> BLOCKS_TIN = TagUtils.forgeItemTag("storage_blocks/tin");
        public static final TagKey<Item> BLOCKS_URANIUM = TagUtils.forgeItemTag("storage_blocks/uranium");

        // Raw Storage Blocks
        public static final TagKey<Item> RAW_BLOCKS_ALUMINUM = TagUtils.forgeItemTag("storage_blocks/raw_aluminum");
        public static final TagKey<Item> RAW_BLOCKS_LEAD = TagUtils.forgeItemTag("storage_blocks/raw_lead");
        public static final TagKey<Item> RAW_BLOCKS_NICKEL = TagUtils.forgeItemTag("storage_blocks/raw_nickel");
        public static final TagKey<Item> RAW_BLOCKS_PLATINUM = TagUtils.forgeItemTag("storage_blocks/raw_platinum");
        public static final TagKey<Item> RAW_BLOCKS_SILVER = TagUtils.forgeItemTag("storage_blocks/raw_silver");
        public static final TagKey<Item> RAW_BLOCKS_TIN = TagUtils.forgeItemTag("storage_blocks/raw_tin");
        public static final TagKey<Item> RAW_BLOCKS_URANIUM = TagUtils.forgeItemTag("storage_blocks/raw_uranium");

        // Ores
        public static final TagKey<Item> ORES_ALUMINUM = TagUtils.forgeItemTag("ores/aluminum");
        public static final TagKey<Item> ORES_LEAD = TagUtils.forgeItemTag("ores/lead");
        public static final TagKey<Item> ORES_NICKEL = TagUtils.forgeItemTag("ores/nickel");
        public static final TagKey<Item> ORES_PLATINUM = TagUtils.forgeItemTag("ores/platinum");
        public static final TagKey<Item> ORES_SILVER = TagUtils.forgeItemTag("ores/silver");
        public static final TagKey<Item> ORES_TIN = TagUtils.forgeItemTag("ores/tin");
        public static final TagKey<Item> ORES_URANIUM = TagUtils.forgeItemTag("ores/uranium");

        // Gears
        public static final TagKey<Item> GEARS = TagUtils.forgeItemTag("gears");
        public static final TagKey<Item> GEARS_ALUMINUM = TagUtils.forgeItemTag("gears/aluminum");
        public static final TagKey<Item> GEARS_BRONZE = TagUtils.forgeItemTag("gears/bronze");
        public static final TagKey<Item> GEARS_COPPER = TagUtils.forgeItemTag("gears/copper");
        public static final TagKey<Item> GEARS_DIAMOND = TagUtils.forgeItemTag("gears/diamond");
        public static final TagKey<Item> GEARS_ELECTRUM = TagUtils.forgeItemTag("gears/electrum");
        public static final TagKey<Item> GEARS_GOLD = TagUtils.forgeItemTag("gears/gold");
        public static final TagKey<Item> GEARS_ENDERIUM = TagUtils.forgeItemTag("gears/enderium");
        public static final TagKey<Item> GEARS_INVAR = TagUtils.forgeItemTag("gears/invar");
        public static final TagKey<Item> GEARS_IRON = TagUtils.forgeItemTag("gears/iron");
        public static final TagKey<Item> GEARS_LEAD = TagUtils.forgeItemTag("gears/lead");
        public static final TagKey<Item> GEARS_NICKEL = TagUtils.forgeItemTag("gears/nickel");
        public static final TagKey<Item> GEARS_PLATINUM = TagUtils.forgeItemTag("gears/platinum");
        public static final TagKey<Item> GEARS_SIGNALUM = TagUtils.forgeItemTag("gears/signalum");
        public static final TagKey<Item> GEARS_SILVER = TagUtils.forgeItemTag("gears/silver");
        public static final TagKey<Item> GEARS_STEEL = TagUtils.forgeItemTag("gears/steel");
        public static final TagKey<Item> GEARS_TIN = TagUtils.forgeItemTag("gears/tin");
        public static final TagKey<Item> GEARS_URANIUM = TagUtils.forgeItemTag("gears/uranium");

        // Plates
        public static final TagKey<Item> PLATES = TagUtils.forgeItemTag("plates");
        public static final TagKey<Item> PLATES_ALUMINUM = TagUtils.forgeItemTag("plates/aluminum");
        public static final TagKey<Item> PLATES_BRONZE = TagUtils.forgeItemTag("plates/bronze");
        public static final TagKey<Item> PLATES_COPPER = TagUtils.forgeItemTag("plates/copper");
        public static final TagKey<Item> PLATES_DIAMOND = TagUtils.forgeItemTag("plates/diamond");
        public static final TagKey<Item> PLATES_ELECTRUM = TagUtils.forgeItemTag("plates/electrum");
        public static final TagKey<Item> PLATES_GOLD = TagUtils.forgeItemTag("plates/gold");
        public static final TagKey<Item> PLATES_ENDERIUM = TagUtils.forgeItemTag("plates/enderium");
        public static final TagKey<Item> PLATES_INVAR = TagUtils.forgeItemTag("plates/invar");
        public static final TagKey<Item> PLATES_IRON = TagUtils.forgeItemTag("plates/iron");
        public static final TagKey<Item> PLATES_LEAD = TagUtils.forgeItemTag("plates/lead");
        public static final TagKey<Item> PLATES_NICKEL = TagUtils.forgeItemTag("plates/nickel");
        public static final TagKey<Item> PLATES_PLATINUM = TagUtils.forgeItemTag("plates/platinum");
        public static final TagKey<Item> PLATES_SIGNALUM = TagUtils.forgeItemTag("plates/signalum");
        public static final TagKey<Item> PLATES_SILVER = TagUtils.forgeItemTag("plates/silver");
        public static final TagKey<Item> PLATES_STEEL = TagUtils.forgeItemTag("plates/steel");
        public static final TagKey<Item> PLATES_TIN = TagUtils.forgeItemTag("plates/tin");
        public static final TagKey<Item> PLATES_URANIUM = TagUtils.forgeItemTag("plates/uranium");

        // Dusts
        public static final TagKey<Item> DUSTS = TagUtils.forgeItemTag("dusts");
        public static final TagKey<Item> DUSTS_ALUMINUM = TagUtils.forgeItemTag("dusts/aluminum");
        public static final TagKey<Item> DUSTS_BRONZE = TagUtils.forgeItemTag("dusts/bronze");
        public static final TagKey<Item> DUSTS_COPPER = TagUtils.forgeItemTag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND = TagUtils.forgeItemTag("dusts/diamond");
        public static final TagKey<Item> DUSTS_ELECTRUM = TagUtils.forgeItemTag("dusts/electrum");
        public static final TagKey<Item> DUSTS_GOLD = TagUtils.forgeItemTag("dusts/gold");
        public static final TagKey<Item> DUSTS_ENDERIUM = TagUtils.forgeItemTag("dusts/enderium");
        public static final TagKey<Item> DUSTS_INVAR = TagUtils.forgeItemTag("dusts/invar");
        public static final TagKey<Item> DUSTS_IRON = TagUtils.forgeItemTag("dusts/iron");
        public static final TagKey<Item> DUSTS_LEAD = TagUtils.forgeItemTag("dusts/lead");
        public static final TagKey<Item> DUSTS_NICKEL = TagUtils.forgeItemTag("dusts/nickel");
        public static final TagKey<Item> DUSTS_PLATINUM = TagUtils.forgeItemTag("dusts/platinum");
        public static final TagKey<Item> DUSTS_SIGNALUM = TagUtils.forgeItemTag("dusts/signalum");
        public static final TagKey<Item> DUSTS_SILVER = TagUtils.forgeItemTag("dusts/silver");
        public static final TagKey<Item> DUSTS_STEEL = TagUtils.forgeItemTag("dusts/steel");
        public static final TagKey<Item> DUSTS_TIN = TagUtils.forgeItemTag("dusts/tin");
        public static final TagKey<Item> DUSTS_URANIUM = TagUtils.forgeItemTag("dusts/uranium");
    }
}
