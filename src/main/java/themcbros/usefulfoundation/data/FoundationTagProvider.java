package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.FoundationTags;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;

import javax.annotation.Nullable;

import static themcbros.usefulfoundation.FoundationTags.Items.*;
import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationTagProvider {
    public static class Items extends ItemTagsProvider {
        public Items(DataGenerator gen, BlockTagsProvider tagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(gen, tagsProvider, UsefulFoundation.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags() {
            //Ingots
            this.tag(INGOTS_BRONZE).add(BRONZE_INGOT);
            this.tag(INGOTS_COPPER).add(net.minecraft.world.item.Items.COPPER_INGOT);
            this.tag(INGOTS_ELECTRUM).add(ELECTRUM_INGOT);
            this.tag(INGOTS_INVAR).add(INVAR_INGOT);
            this.tag(INGOTS_LEAD).add(LEAD_INGOT);
            this.tag(INGOTS_NICKEL).add(NICKEL_INGOT);
            this.tag(INGOTS_SILVER).add(SILVER_INGOT);
            this.tag(INGOTS_TIN).add(TIN_INGOT);
            this.tag(INGOTS_URANIUM).add(URANIUM_INGOT);
            this.tag(Tags.Items.INGOTS).addTags(INGOTS_BRONZE, INGOTS_COPPER, INGOTS_ELECTRUM, INGOTS_INVAR, INGOTS_LEAD, INGOTS_NICKEL, INGOTS_SILVER, INGOTS_TIN, INGOTS_URANIUM);

            //Gears
            this.tag(GEARS_BRONZE).add(BRONZE_GEAR);
            this.tag(GEARS_COPPER).add(COPPER_GEAR);
            this.tag(GEARS_ELECTRUM).add(ELECTRUM_GEAR);
            this.tag(GEARS_GOLD).add(GOLD_GEAR);
            this.tag(GEARS_INVAR).add(INVAR_GEAR);
            this.tag(GEARS_IRON).add(IRON_GEAR);
            this.tag(GEARS_LEAD).add(LEAD_GEAR);
            this.tag(GEARS_NICKEL).add(NICKEL_GEAR);
            this.tag(GEARS_SILVER).add(SILVER_GEAR);
            this.tag(GEARS_TIN).add(TIN_GEAR);
            this.tag(GEARS_URANIUM).add(URANIUM_GEAR);
            this.tag(GEARS).addTags(GEARS_BRONZE, GEARS_COPPER, GEARS_ELECTRUM, GEARS_INVAR, GEARS_LEAD, GEARS_NICKEL, GEARS_SILVER, GEARS_TIN, GEARS_URANIUM);

            //Nuggets
            this.tag(NUGGETS_BRONZE).add(BRONZE_NUGGET);
            this.tag(NUGGETS_COPPER).add(COPPER_NUGGET);
            this.tag(NUGGETS_ELECTRUM).add(ELECTRUM_NUGGET);
            this.tag(NUGGETS_INVAR).add(INVAR_NUGGET);
            this.tag(NUGGETS_LEAD).add(LEAD_NUGGET);
            this.tag(NUGGETS_NICKEL).add(NICKEL_NUGGET);
            this.tag(NUGGETS_SILVER).add(SILVER_NUGGET);
            this.tag(NUGGETS_TIN).add(TIN_NUGGET);
            this.tag(NUGGETS_URANIUM).add(URANIUM_NUGGET);
            this.tag(Tags.Items.NUGGETS).addTags(NUGGETS_BRONZE, NUGGETS_COPPER, NUGGETS_ELECTRUM, NUGGETS_INVAR, NUGGETS_LEAD, NUGGETS_NICKEL, NUGGETS_SILVER, NUGGETS_TIN, NUGGETS_URANIUM);

            //Plates
            this.tag(PLATES_BRONZE).add(BRONZE_PLATE);
            this.tag(PLATES_COPPER).add(COPPER_PLATE);
            this.tag(PLATES_GOLD).add(GOLD_PLATE);
            this.tag(PLATES_ELECTRUM).add(ELECTRUM_PLATE);
            this.tag(PLATES_INVAR).add(INVAR_PLATE);
            this.tag(PLATES_IRON).add(IRON_PLATE);
            this.tag(PLATES_LEAD).add(LEAD_PLATE);
            this.tag(PLATES_NICKEL).add(NICKEL_PLATE);
            this.tag(PLATES_SILVER).add(SILVER_PLATE);
            this.tag(PLATES_TIN).add(TIN_PLATE);
            this.tag(PLATES_URANIUM).add(URANIUM_PLATE);
            this.tag(PLATES).addTags(PLATES_BRONZE, PLATES_COPPER, PLATES_ELECTRUM, PLATES_INVAR, PLATES_LEAD, PLATES_NICKEL, PLATES_SILVER, PLATES_TIN, PLATES_URANIUM);

            //Storage Blocks
            this.copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
            this.copy(FoundationTags.Blocks.BLOCKS_BRONZE, BLOCKS_BRONZE);
            this.copy(FoundationTags.Blocks.BLOCKS_COPPER, BLOCKS_COPPER);
            this.copy(FoundationTags.Blocks.BLOCKS_ELECTRUM, BLOCKS_ELECTRUM);
            this.copy(FoundationTags.Blocks.BLOCKS_INVAR, BLOCKS_INVAR);
            this.copy(FoundationTags.Blocks.BLOCKS_LEAD, BLOCKS_LEAD);
            this.copy(FoundationTags.Blocks.BLOCKS_NICKEL, BLOCKS_NICKEL);
            this.copy(FoundationTags.Blocks.BLOCKS_SILVER, BLOCKS_SILVER);
            this.copy(FoundationTags.Blocks.BLOCKS_TIN, BLOCKS_TIN);
            this.copy(FoundationTags.Blocks.BLOCKS_URANIUM, BLOCKS_URANIUM);

            //Ores
            this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
            this.copy(FoundationTags.Blocks.ORES_LEAD, ORES_LEAD);
            this.copy(FoundationTags.Blocks.ORES_NICKEL, ORES_NICKEL);
            this.copy(FoundationTags.Blocks.ORES_SILVER, ORES_SILVER);
            this.copy(FoundationTags.Blocks.ORES_TIN, ORES_TIN);
            this.copy(FoundationTags.Blocks.ORES_URANIUM, ORES_URANIUM);
        }
    }

    public static class Blocks extends BlockTagsProvider {
        public Blocks(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
            super(gen, UsefulFoundation.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags() {
            //Storage Blocks
            this.tag(FoundationTags.Blocks.BLOCKS_BRONZE).add(FoundationBlocks.BRONZE_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_COPPER).add(net.minecraft.world.level.block.Blocks.COPPER_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_ELECTRUM).add(FoundationBlocks.ELECTRUM_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_INVAR).add(FoundationBlocks.INVAR_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_LEAD).add(FoundationBlocks.LEAD_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_NICKEL).add(FoundationBlocks.NICKEL_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_SILVER).add(FoundationBlocks.SILVER_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_TIN).add(FoundationBlocks.TIN_BLOCK);
            this.tag(FoundationTags.Blocks.BLOCKS_URANIUM).add(FoundationBlocks.URANIUM_BLOCK);
            this.tag(Tags.Blocks.STORAGE_BLOCKS).addTags(FoundationTags.Blocks.BLOCKS_BRONZE, FoundationTags.Blocks.BLOCKS_COPPER, FoundationTags.Blocks.BLOCKS_ELECTRUM, FoundationTags.Blocks.BLOCKS_INVAR, FoundationTags.Blocks.BLOCKS_LEAD, FoundationTags.Blocks.BLOCKS_NICKEL, FoundationTags.Blocks.BLOCKS_SILVER, FoundationTags.Blocks.BLOCKS_TIN, FoundationTags.Blocks.BLOCKS_URANIUM);

            //Ore Blocks
            this.tag(FoundationTags.Blocks.ORES_LEAD).add(FoundationBlocks.LEAD_ORE, FoundationBlocks.DEEPSLATE_LEAD_ORE);
            this.tag(FoundationTags.Blocks.ORES_NICKEL).add(FoundationBlocks.NICKEL_ORE, FoundationBlocks.DEEPSLATE_NICKEL_ORE);
            this.tag(FoundationTags.Blocks.ORES_SILVER).add(FoundationBlocks.SILVER_ORE, FoundationBlocks.DEEPSLATE_SILVER_ORE);
            this.tag(FoundationTags.Blocks.ORES_TIN).add(FoundationBlocks.TIN_ORE, FoundationBlocks.DEEPSLATE_TIN_ORE);
            this.tag(FoundationTags.Blocks.ORES_URANIUM).add(FoundationBlocks.URANIUM_ORE, FoundationBlocks.DEEPSLATE_URANIUM_ORE);
            this.tag(Tags.Blocks.ORES).addTags(FoundationTags.Blocks.ORES_LEAD, FoundationTags.Blocks.ORES_NICKEL, FoundationTags.Blocks.ORES_SILVER, FoundationTags.Blocks.ORES_TIN, FoundationTags.Blocks.ORES_URANIUM);

            //Vanilla Tags
            this.tag(BlockTags.BEACON_BASE_BLOCKS).addTags(FoundationTags.Blocks.BLOCKS_BRONZE, FoundationTags.Blocks.BLOCKS_COPPER, FoundationTags.Blocks.BLOCKS_ELECTRUM, FoundationTags.Blocks.BLOCKS_INVAR, FoundationTags.Blocks.BLOCKS_LEAD, FoundationTags.Blocks.BLOCKS_NICKEL, FoundationTags.Blocks.BLOCKS_SILVER, FoundationTags.Blocks.BLOCKS_TIN, FoundationTags.Blocks.BLOCKS_URANIUM);
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(FoundationBlocks.LEAD_ORE, FoundationBlocks.DEEPSLATE_LEAD_ORE, FoundationBlocks.LEAD_BLOCK, FoundationBlocks.NICKEL_ORE, FoundationBlocks.DEEPSLATE_NICKEL_ORE, FoundationBlocks.NICKEL_BLOCK, FoundationBlocks.SILVER_ORE, FoundationBlocks.DEEPSLATE_SILVER_ORE, FoundationBlocks.SILVER_BLOCK, FoundationBlocks.TIN_ORE, FoundationBlocks.DEEPSLATE_TIN_ORE, FoundationBlocks.TIN_BLOCK, FoundationBlocks.URANIUM_ORE, FoundationBlocks.DEEPSLATE_URANIUM_ORE, FoundationBlocks.URANIUM_BLOCK);
            this.tag(BlockTags.MINEABLE_WITH_AXE).add(FoundationBlocks.USEFUL_BEEHIVE);
        }
    }
}
