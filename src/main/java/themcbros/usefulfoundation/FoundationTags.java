package themcbros.usefulfoundation;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class FoundationTags {
    public static class Blocks {
        //Ore Blocks
        public static final TagKey<Block> ORES_ALUMINUM = BlockTags.create(new ResourceLocation("forge", "ores/aluminum"));
        public static final TagKey<Block> ORES_LEAD = BlockTags.create(new ResourceLocation("forge", "ores/lead"));
        public static final TagKey<Block> ORES_NICKEL = BlockTags.create(new ResourceLocation("forge", "ores/nickel"));
        public static final TagKey<Block> ORES_PLATINUM = BlockTags.create(new ResourceLocation("forge", "ores/platinum"));
        public static final TagKey<Block> ORES_SILVER = BlockTags.create(new ResourceLocation("forge", "ores/silver"));
        public static final TagKey<Block> ORES_TIN = BlockTags.create(new ResourceLocation("forge", "ores/tin"));
        public static final TagKey<Block> ORES_URANIUM = BlockTags.create(new ResourceLocation("forge", "ores/uranium"));

        //Storage Blocks
        public static final TagKey<Block> BLOCKS_ALUMINUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/aluminum"));
        public static final TagKey<Block> BLOCKS_BRONZE = BlockTags.create(new ResourceLocation("forge", "storage_blocks/bronze"));
        public static final TagKey<Block> BLOCKS_ELECTRUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/electrum"));
        public static final TagKey<Block> BLOCKS_ENDEIRUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/enderium"));
        public static final TagKey<Block> BLOCKS_INVAR = BlockTags.create(new ResourceLocation("forge", "storage_blocks/invar"));
        public static final TagKey<Block> BLOCKS_LEAD = BlockTags.create(new ResourceLocation("forge", "storage_blocks/lead"));
        public static final TagKey<Block> BLOCKS_NICKEL = BlockTags.create(new ResourceLocation("forge", "storage_blocks/nickel"));
        public static final TagKey<Block> BLOCKS_PLATINUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/platinum"));
        public static final TagKey<Block> BLOCKS_SILVER = BlockTags.create(new ResourceLocation("forge", "storage_blocks/silver"));
        public static final TagKey<Block> BLOCKS_SIGNALUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/signalum"));
        public static final TagKey<Block> BLOCKS_STEEL = BlockTags.create(new ResourceLocation("forge", "storage_blocks/steel"));
        public static final TagKey<Block> BLOCKS_TIN = BlockTags.create(new ResourceLocation("forge", "storage_blocks/tin"));
        public static final TagKey<Block> BLOCKS_URANIUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/uranium"));

        //Raw Storage Blocks
        public static final TagKey<Block> RAW_BLOCKS_ALUMINUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_aluminum"));
        public static final TagKey<Block> RAW_BLOCKS_LEAD = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_lead"));
        public static final TagKey<Block> RAW_BLOCKS_NICKEL = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_nickel"));
        public static final TagKey<Block> RAW_BLOCKS_PLATINUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_platinum"));
        public static final TagKey<Block> RAW_BLOCKS_SILVER = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_silver"));
        public static final TagKey<Block> RAW_BLOCKS_TIN = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_tin"));
        public static final TagKey<Block> RAW_BLOCKS_URANIUM = BlockTags.create(new ResourceLocation("forge", "storage_blocks/raw_uranium"));
    }

    public static class Items {
        //Ingots
        public static final TagKey<Item> INGOTS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "ingots/aluminum"));
        public static final TagKey<Item> INGOTS_BRONZE = ItemTags.create(new ResourceLocation("forge", "ingots/bronze"));
        public static final TagKey<Item> INGOTS_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "ingots/electrum"));
        public static final TagKey<Item> INGOTS_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "ingots/enderium"));
        public static final TagKey<Item> INGOTS_INVAR = ItemTags.create(new ResourceLocation("forge", "ingots/invar"));
        public static final TagKey<Item> INGOTS_LEAD = ItemTags.create(new ResourceLocation("forge", "ingots/lead"));
        public static final TagKey<Item> INGOTS_NICKEL = ItemTags.create(new ResourceLocation("forge", "ingots/nickel"));
        public static final TagKey<Item> INGOTS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "ingots/platinum"));
        public static final TagKey<Item> INGOTS_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "ingots/signalum"));
        public static final TagKey<Item> INGOTS_SILVER = ItemTags.create(new ResourceLocation("forge", "ingots/silver"));
        public static final TagKey<Item> INGOTS_STEEL = ItemTags.create(new ResourceLocation("forge", "ingots/steel"));
        public static final TagKey<Item> INGOTS_TIN = ItemTags.create(new ResourceLocation("forge", "ingots/tin"));
        public static final TagKey<Item> INGOTS_URANIUM = ItemTags.create(new ResourceLocation("forge", "ingots/uranium"));

        //Raw Materials
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "raw_materials/aluminum"));
        public static final TagKey<Item> RAW_MATERIALS_LEAD = ItemTags.create(new ResourceLocation("forge", "raw_materials/lead"));
        public static final TagKey<Item> RAW_MATERIALS_NICKEL = ItemTags.create(new ResourceLocation("forge", "raw_materials/nickel"));
        public static final TagKey<Item> RAW_MATERIALS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "raw_materials/platinum"));
        public static final TagKey<Item> RAW_MATERIALS_SILVER = ItemTags.create(new ResourceLocation("forge", "raw_materials/silver"));
        public static final TagKey<Item> RAW_MATERIALS_TIN = ItemTags.create(new ResourceLocation("forge", "raw_materials/tin"));
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = ItemTags.create(new ResourceLocation("forge", "raw_materials/uranium"));

        //Nuggets
        public static final TagKey<Item> NUGGETS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "nuggets/aluminum"));
        public static final TagKey<Item> NUGGETS_BRONZE = ItemTags.create(new ResourceLocation("forge", "nuggets/bronze"));
        public static final TagKey<Item> NUGGETS_COPPER = ItemTags.create(new ResourceLocation("forge", "nuggets/copper"));
        public static final TagKey<Item> NUGGETS_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "nuggets/electrum"));
        public static final TagKey<Item> NUGGETS_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "nuggets/enderium"));
        public static final TagKey<Item> NUGGETS_INVAR = ItemTags.create(new ResourceLocation("forge", "nuggets/invar"));
        public static final TagKey<Item> NUGGETS_LEAD = ItemTags.create(new ResourceLocation("forge", "nuggets/lead"));
        public static final TagKey<Item> NUGGETS_NICKEL = ItemTags.create(new ResourceLocation("forge", "nuggets/nickel"));
        public static final TagKey<Item> NUGGETS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "nuggets/platinum"));
        public static final TagKey<Item> NUGGETS_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "nuggets/signalum"));
        public static final TagKey<Item> NUGGETS_SILVER = ItemTags.create(new ResourceLocation("forge", "nuggets/silver"));
        public static final TagKey<Item> NUGGETS_STEEL = ItemTags.create(new ResourceLocation("forge", "nuggets/steel"));
        public static final TagKey<Item> NUGGETS_TIN = ItemTags.create(new ResourceLocation("forge", "nuggets/tin"));
        public static final TagKey<Item> NUGGETS_URANIUM = ItemTags.create(new ResourceLocation("forge", "nuggets/uranium"));

        //Storage Blocks
        public static final TagKey<Item> BLOCKS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/aluminum"));
        public static final TagKey<Item> BLOCKS_BRONZE = ItemTags.create(new ResourceLocation("forge", "storage_blocks/bronze"));
        public static final TagKey<Item> BLOCKS_COPPER = ItemTags.create(new ResourceLocation("forge", "storage_blocks/copper"));
        public static final TagKey<Item> BLOCKS_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/electrum"));
        public static final TagKey<Item> BLOCKS_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/enderium"));
        public static final TagKey<Item> BLOCKS_INVAR = ItemTags.create(new ResourceLocation("forge", "storage_blocks/invar"));
        public static final TagKey<Item> BLOCKS_LEAD = ItemTags.create(new ResourceLocation("forge", "storage_blocks/lead"));
        public static final TagKey<Item> BLOCKS_NICKEL = ItemTags.create(new ResourceLocation("forge", "storage_blocks/nickel"));
        public static final TagKey<Item> BLOCKS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/platinum"));
        public static final TagKey<Item> BLOCKS_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/signalum"));
        public static final TagKey<Item> BLOCKS_SILVER = ItemTags.create(new ResourceLocation("forge", "storage_blocks/silver"));
        public static final TagKey<Item> BLOCKS_STEEL = ItemTags.create(new ResourceLocation("forge", "storage_blocks/steel"));
        public static final TagKey<Item> BLOCKS_TIN = ItemTags.create(new ResourceLocation("forge", "storage_blocks/tin"));
        public static final TagKey<Item> BLOCKS_URANIUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/uranium"));

        //Raw Storage Blocks
        public static final TagKey<Item> RAW_BLOCKS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_aluminum"));
        public static final TagKey<Item> RAW_BLOCKS_LEAD = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_lead"));
        public static final TagKey<Item> RAW_BLOCKS_NICKEL = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_nickel"));
        public static final TagKey<Item> RAW_BLOCKS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_platinum"));
        public static final TagKey<Item> RAW_BLOCKS_SILVER = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_silver"));
        public static final TagKey<Item> RAW_BLOCKS_TIN = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_tin"));
        public static final TagKey<Item> RAW_BLOCKS_URANIUM = ItemTags.create(new ResourceLocation("forge", "storage_blocks/raw_uranium"));

        //Ores
        public static final TagKey<Item> ORES_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "ores/aluminum"));
        public static final TagKey<Item> ORES_LEAD = ItemTags.create(new ResourceLocation("forge", "ores/lead"));
        public static final TagKey<Item> ORES_NICKEL = ItemTags.create(new ResourceLocation("forge", "ores/nickel"));
        public static final TagKey<Item> ORES_PLATINUM = ItemTags.create(new ResourceLocation("forge", "ores/platinum"));
        public static final TagKey<Item> ORES_SILVER = ItemTags.create(new ResourceLocation("forge", "ores/silver"));
        public static final TagKey<Item> ORES_TIN = ItemTags.create(new ResourceLocation("forge", "ores/tin"));
        public static final TagKey<Item> ORES_URANIUM = ItemTags.create(new ResourceLocation("forge", "ores/uranium"));

        //Gears
        public static final TagKey<Item> GEARS = ItemTags.create(new ResourceLocation("forge", "gears"));
        public static final TagKey<Item> GEARS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "gears/aluminum"));
        public static final TagKey<Item> GEARS_BRONZE = ItemTags.create(new ResourceLocation("forge", "gears/bronze"));
        public static final TagKey<Item> GEARS_COPPER = ItemTags.create(new ResourceLocation("forge", "gears/copper"));
        public static final TagKey<Item> GEARS_DIAMOND = ItemTags.create(new ResourceLocation("forge", "gears/diamond"));
        public static final TagKey<Item> GEARS_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "gears/electrum"));
        public static final TagKey<Item> GEARS_GOLD = ItemTags.create(new ResourceLocation("forge", "gears/gold"));
        public static final TagKey<Item> GEARS_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "gears/enderium"));
        public static final TagKey<Item> GEARS_INVAR = ItemTags.create(new ResourceLocation("forge", "gears/invar"));
        public static final TagKey<Item> GEARS_IRON = ItemTags.create(new ResourceLocation("forge", "gears/iron"));
        public static final TagKey<Item> GEARS_LEAD = ItemTags.create(new ResourceLocation("forge", "gears/lead"));
        public static final TagKey<Item> GEARS_NICKEL = ItemTags.create(new ResourceLocation("forge", "gears/nickel"));
        public static final TagKey<Item> GEARS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "gears/platinum"));
        public static final TagKey<Item> GEARS_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "gears/signalum"));
        public static final TagKey<Item> GEARS_SILVER = ItemTags.create(new ResourceLocation("forge", "gears/silver"));
        public static final TagKey<Item> GEARS_STEEL = ItemTags.create(new ResourceLocation("forge", "gears/steel"));
        public static final TagKey<Item> GEARS_TIN = ItemTags.create(new ResourceLocation("forge", "gears/tin"));
        public static final TagKey<Item> GEARS_URANIUM = ItemTags.create(new ResourceLocation("forge", "gears/uranium"));

        //Plates
        public static final TagKey<Item> PLATES = ItemTags.create(new ResourceLocation("forge", "plates"));
        public static final TagKey<Item> PLATES_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "plates/aluminum"));
        public static final TagKey<Item> PLATES_BRONZE = ItemTags.create(new ResourceLocation("forge", "plates/bronze"));
        public static final TagKey<Item> PLATES_COPPER = ItemTags.create(new ResourceLocation("forge", "plates/copper"));
        public static final TagKey<Item> PLATES_DIAMOND = ItemTags.create(new ResourceLocation("forge", "plates/diamond"));
        public static final TagKey<Item> PLATES_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "plates/electrum"));
        public static final TagKey<Item> PLATES_GOLD = ItemTags.create(new ResourceLocation("forge", "plates/gold"));
        public static final TagKey<Item> PLATES_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "plates/enderium"));
        public static final TagKey<Item> PLATES_INVAR = ItemTags.create(new ResourceLocation("forge", "plates/invar"));
        public static final TagKey<Item> PLATES_IRON = ItemTags.create(new ResourceLocation("forge", "plates/iron"));
        public static final TagKey<Item> PLATES_LEAD = ItemTags.create(new ResourceLocation("forge", "plates/lead"));
        public static final TagKey<Item> PLATES_NICKEL = ItemTags.create(new ResourceLocation("forge", "plates/nickel"));
        public static final TagKey<Item> PLATES_PLATINUM = ItemTags.create(new ResourceLocation("forge", "plates/platinum"));
        public static final TagKey<Item> PLATES_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "plates/signalum"));
        public static final TagKey<Item> PLATES_SILVER = ItemTags.create(new ResourceLocation("forge", "plates/silver"));
        public static final TagKey<Item> PLATES_STEEL = ItemTags.create(new ResourceLocation("forge", "plates/steel"));
        public static final TagKey<Item> PLATES_TIN = ItemTags.create(new ResourceLocation("forge", "plates/tin"));
        public static final TagKey<Item> PLATES_URANIUM = ItemTags.create(new ResourceLocation("forge", "plates/uranium"));

        //Dusts
        public static final TagKey<Item> DUSTS = ItemTags.create(new ResourceLocation("forge", "dusts"));
        public static final TagKey<Item> DUSTS_ALUMINUM = ItemTags.create(new ResourceLocation("forge", "dusts/aluminum"));
        public static final TagKey<Item> DUSTS_BRONZE = ItemTags.create(new ResourceLocation("forge", "dusts/bronze"));
        public static final TagKey<Item> DUSTS_COPPER = ItemTags.create(new ResourceLocation("forge", "dusts/copper"));
        public static final TagKey<Item> DUSTS_DIAMOND = ItemTags.create(new ResourceLocation("forge", "dusts/diamond"));
        public static final TagKey<Item> DUSTS_ELECTRUM = ItemTags.create(new ResourceLocation("forge", "dusts/electrum"));
        public static final TagKey<Item> DUSTS_GOLD = ItemTags.create(new ResourceLocation("forge", "dusts/gold"));
        public static final TagKey<Item> DUSTS_ENDERIUM = ItemTags.create(new ResourceLocation("forge", "dusts/enderium"));
        public static final TagKey<Item> DUSTS_INVAR = ItemTags.create(new ResourceLocation("forge", "dusts/invar"));
        public static final TagKey<Item> DUSTS_IRON = ItemTags.create(new ResourceLocation("forge", "dusts/iron"));
        public static final TagKey<Item> DUSTS_LEAD = ItemTags.create(new ResourceLocation("forge", "dusts/lead"));
        public static final TagKey<Item> DUSTS_NICKEL = ItemTags.create(new ResourceLocation("forge", "dusts/nickel"));
        public static final TagKey<Item> DUSTS_PLATINUM = ItemTags.create(new ResourceLocation("forge", "dusts/platinum"));
        public static final TagKey<Item> DUSTS_SIGNALUM = ItemTags.create(new ResourceLocation("forge", "dusts/signalum"));
        public static final TagKey<Item> DUSTS_SILVER = ItemTags.create(new ResourceLocation("forge", "dusts/silver"));
        public static final TagKey<Item> DUSTS_STEEL = ItemTags.create(new ResourceLocation("forge", "dusts/steel"));
        public static final TagKey<Item> DUSTS_TIN = ItemTags.create(new ResourceLocation("forge", "dusts/tin"));
        public static final TagKey<Item> DUSTS_URANIUM = ItemTags.create(new ResourceLocation("forge", "dusts/uranium"));
    }
}
