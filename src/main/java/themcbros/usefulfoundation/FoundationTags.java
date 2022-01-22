package themcbros.usefulfoundation;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class FoundationTags {
    public static class Blocks {
        //Ore Blocks
        public static final Tags.IOptionalNamedTag<Block> ORES_ALUMINUM = BlockTags.createOptional(new ResourceLocation("forge", "ores/aluminum"));
        public static final Tags.IOptionalNamedTag<Block> ORES_LEAD = BlockTags.createOptional(new ResourceLocation("forge", "ores/lead"));
        public static final Tags.IOptionalNamedTag<Block> ORES_NICKEL = BlockTags.createOptional(new ResourceLocation("forge", "ores/nickel"));
        public static final Tags.IOptionalNamedTag<Block> ORES_PLATINUM = BlockTags.createOptional(new ResourceLocation("forge", "ores/platinum"));
        public static final Tags.IOptionalNamedTag<Block> ORES_SILVER = BlockTags.createOptional(new ResourceLocation("forge", "ores/silver"));
        public static final Tags.IOptionalNamedTag<Block> ORES_TIN = BlockTags.createOptional(new ResourceLocation("forge", "ores/tin"));
        public static final Tags.IOptionalNamedTag<Block> ORES_URANIUM = BlockTags.createOptional(new ResourceLocation("forge", "ores/uranium"));

        //Storage Blocks
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_ALUMINUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/aluminum"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_BRONZE = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/bronze"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_ELECTRUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/electrum"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_ENDEIRUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/enderium"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_INVAR = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/invar"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_LEAD = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/lead"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_NICKEL = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/nickel"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_PLATINUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/platinum"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_SILVER = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/silver"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_SIGNALUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/signalum"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_STEEL = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/steel"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_TIN = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/tin"));
        public static final Tags.IOptionalNamedTag<Block> BLOCKS_URANIUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/uranium"));

        //Raw Storage Blocks
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_ALUMINUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_aluminum"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_LEAD = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_lead"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_NICKEL = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_nickel"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_PLATINUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_platinum"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_SILVER = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_silver"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_TIN = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_tin"));
        public static final Tags.IOptionalNamedTag<Block> RAW_BLOCKS_URANIUM = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_uranium"));
    }

    public static class Items {
        //Ingots
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "ingots/bronze"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/electrum"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/enderium"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "ingots/invar"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "ingots/lead"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "ingots/nickel"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/platinum"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/signalum"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "ingots/silver"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "ingots/steel"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "ingots/tin"));
        public static final Tags.IOptionalNamedTag<Item> INGOTS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "ingots/uranium"));

        //Raw Materials
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/lead"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/nickel"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/platinum"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/silver"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/tin"));
        public static final Tags.IOptionalNamedTag<Item> RAW_MATERIALS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "raw_materials/uranium"));

        //Nuggets
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/bronze"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_COPPER = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/copper"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/electrum"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/enderium"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/invar"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/lead"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/nickel"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/platinum"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/signalum"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/silver"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/steel"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/tin"));
        public static final Tags.IOptionalNamedTag<Item> NUGGETS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/uranium"));

        //Storage Blocks
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/bronze"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_COPPER = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/copper"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/electrum"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/enderium"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/invar"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/lead"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/nickel"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/platinum"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/signalum"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/silver"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/steel"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/tin"));
        public static final Tags.IOptionalNamedTag<Item> BLOCKS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/uranium"));

        //Raw Storage Blocks
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_aluminum"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_lead"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_nickel"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_platinum"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_silver"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_tin"));
        public static final Tags.IOptionalNamedTag<Item> RAW_BLOCKS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/raw_uranium"));

        //Ores
        public static final Tags.IOptionalNamedTag<Item> ORES_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "ores/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> ORES_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "ores/lead"));
        public static final Tags.IOptionalNamedTag<Item> ORES_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "ores/nickel"));
        public static final Tags.IOptionalNamedTag<Item> ORES_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "ores/platinum"));
        public static final Tags.IOptionalNamedTag<Item> ORES_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "ores/silver"));
        public static final Tags.IOptionalNamedTag<Item> ORES_TIN = ItemTags.createOptional(new ResourceLocation("forge", "ores/tin"));
        public static final Tags.IOptionalNamedTag<Item> ORES_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "ores/uranium"));

        //Gears
        public static final Tags.IOptionalNamedTag<Item> GEARS = ItemTags.createOptional(new ResourceLocation("forge", "gears"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "gears/bronze"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_COPPER = ItemTags.createOptional(new ResourceLocation("forge", "gears/copper"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_DIAMOND = ItemTags.createOptional(new ResourceLocation("forge", "gears/diamond"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/electrum"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_GOLD = ItemTags.createOptional(new ResourceLocation("forge", "gears/gold"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/enderium"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "gears/invar"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_IRON = ItemTags.createOptional(new ResourceLocation("forge", "gears/iron"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "gears/lead"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "gears/nickel"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/platinum"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/signalum"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "gears/silver"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "gears/steel"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "gears/tin"));
        public static final Tags.IOptionalNamedTag<Item> GEARS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "gears/uranium"));

        //Plates
        public static final Tags.IOptionalNamedTag<Item> PLATES = ItemTags.createOptional(new ResourceLocation("forge", "plates"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "plates/bronze"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_COPPER = ItemTags.createOptional(new ResourceLocation("forge", "plates/copper"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_DIAMOND = ItemTags.createOptional(new ResourceLocation("forge", "plates/diamond"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/electrum"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_GOLD = ItemTags.createOptional(new ResourceLocation("forge", "plates/gold"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/enderium"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "plates/invar"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_IRON = ItemTags.createOptional(new ResourceLocation("forge", "plates/iron"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "plates/lead"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "plates/nickel"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/platinum"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/signalum"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "plates/silver"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "plates/steel"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_TIN = ItemTags.createOptional(new ResourceLocation("forge", "plates/tin"));
        public static final Tags.IOptionalNamedTag<Item> PLATES_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "plates/uranium"));

        //Dusts
        public static final Tags.IOptionalNamedTag<Item> DUSTS = ItemTags.createOptional(new ResourceLocation("forge", "dusts"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ALUMINUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/aluminum"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_BRONZE = ItemTags.createOptional(new ResourceLocation("forge", "dusts/bronze"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_COPPER = ItemTags.createOptional(new ResourceLocation("forge", "dusts/copper"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_DIAMOND = ItemTags.createOptional(new ResourceLocation("forge", "dusts/diamond"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ELECTRUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/electrum"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_GOLD = ItemTags.createOptional(new ResourceLocation("forge", "dusts/gold"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_ENDERIUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/enderium"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_INVAR = ItemTags.createOptional(new ResourceLocation("forge", "dusts/invar"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_IRON = ItemTags.createOptional(new ResourceLocation("forge", "dusts/iron"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_LEAD = ItemTags.createOptional(new ResourceLocation("forge", "dusts/lead"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_NICKEL = ItemTags.createOptional(new ResourceLocation("forge", "dusts/nickel"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_PLATINUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/platinum"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SIGNALUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/signalum"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_SILVER = ItemTags.createOptional(new ResourceLocation("forge", "dusts/silver"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_STEEL = ItemTags.createOptional(new ResourceLocation("forge", "dusts/steel"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_TIN = ItemTags.createOptional(new ResourceLocation("forge", "dusts/tin"));
        public static final Tags.IOptionalNamedTag<Item> DUSTS_URANIUM = ItemTags.createOptional(new ResourceLocation("forge", "dusts/uranium"));
    }
}
