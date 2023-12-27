package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.usefulfoundation.FoundationTags;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.themcbrothers.usefulfoundation.FoundationTags.Items.*;
import static net.themcbrothers.usefulfoundation.infrastructure.FoundationItems.*;

public class FoundationItemTagsProvider extends ItemTagsProvider {
    public FoundationItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTags, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Ingots
        this.tag(INGOTS_ALUMINUM).add(ALUMINUM_INGOT.get());
        this.tag(INGOTS_BRONZE).add(BRONZE_INGOT.get());
        this.tag(INGOTS_ELECTRUM).add(ELECTRUM_INGOT.get());
        this.tag(INGOTS_ENDERIUM).add(ENDERIUM_INGOT.get());
        this.tag(INGOTS_INVAR).add(INVAR_INGOT.get());
        this.tag(INGOTS_LEAD).add(LEAD_INGOT.get());
        this.tag(INGOTS_NICKEL).add(NICKEL_INGOT.get());
        this.tag(INGOTS_PLATINUM).add(PLATINUM_INGOT.get());
        this.tag(INGOTS_SIGNALUM).add(SIGNALUM_INGOT.get());
        this.tag(INGOTS_SILVER).add(SILVER_INGOT.get());
        this.tag(INGOTS_STEEL).add(STEEL_INGOT.get());
        this.tag(INGOTS_TIN).add(TIN_INGOT.get());
        this.tag(INGOTS_URANIUM).add(URANIUM_INGOT.get());
        this.tag(Tags.Items.INGOTS).addTags(INGOTS_ALUMINUM, INGOTS_BRONZE, INGOTS_ELECTRUM, INGOTS_ENDERIUM, INGOTS_INVAR, INGOTS_LEAD, INGOTS_NICKEL, INGOTS_PLATINUM, INGOTS_SIGNALUM, INGOTS_SILVER, INGOTS_STEEL, INGOTS_TIN, INGOTS_URANIUM);

        // Gears
        this.tag(GEARS_ALUMINUM).add(ALUMINUM_GEAR.get());
        this.tag(GEARS_BRONZE).add(BRONZE_GEAR.get());
        this.tag(GEARS_COPPER).add(COPPER_GEAR.get());
        this.tag(GEARS_DIAMOND).add(DIAMOND_GEAR.get());
        this.tag(GEARS_ELECTRUM).add(ELECTRUM_GEAR.get());
        this.tag(GEARS_ENDERIUM).add(ENDERIUM_GEAR.get());
        this.tag(GEARS_GOLD).add(GOLD_GEAR.get());
        this.tag(GEARS_INVAR).add(INVAR_GEAR.get());
        this.tag(GEARS_IRON).add(IRON_GEAR.get());
        this.tag(GEARS_LEAD).add(LEAD_GEAR.get());
        this.tag(GEARS_NICKEL).add(NICKEL_GEAR.get());
        this.tag(GEARS_PLATINUM).add(PLATINUM_GEAR.get());
        this.tag(GEARS_SIGNALUM).add(SIGNALUM_GEAR.get());
        this.tag(GEARS_SILVER).add(SILVER_GEAR.get());
        this.tag(GEARS_STEEL).add(STEEL_GEAR.get());
        this.tag(GEARS_TIN).add(TIN_GEAR.get());
        this.tag(GEARS_URANIUM).add(URANIUM_GEAR.get());
        this.tag(GEARS).addTags(GEARS_ALUMINUM, GEARS_BRONZE, GEARS_COPPER, GEARS_DIAMOND, GEARS_ELECTRUM, GEARS_ENDERIUM, GEARS_GOLD, GEARS_INVAR, GEARS_IRON, GEARS_LEAD, GEARS_NICKEL, GEARS_PLATINUM, GEARS_SIGNALUM, GEARS_SILVER, GEARS_STEEL, GEARS_TIN, GEARS_URANIUM);

        // Nuggets
        this.tag(NUGGETS_ALUMINUM).add(ALUMINUM_NUGGET.get());
        this.tag(NUGGETS_BRONZE).add(BRONZE_NUGGET.get());
        this.tag(NUGGETS_COPPER).add(COPPER_NUGGET.get());
        this.tag(NUGGETS_ELECTRUM).add(ELECTRUM_NUGGET.get());
        this.tag(NUGGETS_ENDERIUM).add(ENDERIUM_NUGGET.get());
        this.tag(NUGGETS_INVAR).add(INVAR_NUGGET.get());
        this.tag(NUGGETS_LEAD).add(LEAD_NUGGET.get());
        this.tag(NUGGETS_NICKEL).add(NICKEL_NUGGET.get());
        this.tag(NUGGETS_PLATINUM).add(PLATINUM_NUGGET.get());
        this.tag(NUGGETS_SIGNALUM).add(SIGNALUM_NUGGET.get());
        this.tag(NUGGETS_SILVER).add(SILVER_NUGGET.get());
        this.tag(NUGGETS_STEEL).add(STEEL_NUGGET.get());
        this.tag(NUGGETS_TIN).add(TIN_NUGGET.get());
        this.tag(NUGGETS_URANIUM).add(URANIUM_NUGGET.get());
        this.tag(Tags.Items.NUGGETS).addTags(NUGGETS_ALUMINUM, NUGGETS_BRONZE, NUGGETS_COPPER, NUGGETS_ELECTRUM, NUGGETS_ENDERIUM, NUGGETS_INVAR, NUGGETS_LEAD, NUGGETS_NICKEL, NUGGETS_PLATINUM, NUGGETS_SIGNALUM, NUGGETS_SILVER, NUGGETS_STEEL, NUGGETS_TIN, NUGGETS_URANIUM);

        // Dusts
        this.tag(DUSTS_ALUMINUM).add(ALUMINUM_DUST.get());
        this.tag(DUSTS_BRONZE).add(BRONZE_DUST.get());
        this.tag(DUSTS_COPPER).add(COPPER_DUST.get());
        this.tag(DUSTS_DIAMOND).add(DIAMOND_DUST.get());
        this.tag(DUSTS_ELECTRUM).add(ELECTRUM_DUST.get());
        this.tag(DUSTS_ENDERIUM).add(ENDERIUM_DUST.get());
        this.tag(DUSTS_GOLD).add(GOLD_DUST.get());
        this.tag(DUSTS_INVAR).add(INVAR_DUST.get());
        this.tag(DUSTS_IRON).add(IRON_DUST.get());
        this.tag(DUSTS_LEAD).add(LEAD_DUST.get());
        this.tag(DUSTS_NICKEL).add(NICKEL_DUST.get());
        this.tag(DUSTS_PLATINUM).add(PLATINUM_DUST.get());
        this.tag(DUSTS_SIGNALUM).add(SIGNALUM_DUST.get());
        this.tag(DUSTS_SILVER).add(SILVER_DUST.get());
        this.tag(DUSTS_STEEL).add(STEEL_DUST.get());
        this.tag(DUSTS_TIN).add(TIN_DUST.get());
        this.tag(DUSTS_URANIUM).add(URANIUM_DUST.get());
        this.tag(DUSTS).addTags(DUSTS_ALUMINUM, DUSTS_BRONZE, DUSTS_COPPER, DUSTS_DIAMOND, DUSTS_ELECTRUM, DUSTS_ENDERIUM, DUSTS_GOLD, DUSTS_INVAR, DUSTS_IRON, DUSTS_LEAD, DUSTS_NICKEL, DUSTS_PLATINUM, DUSTS_SIGNALUM, DUSTS_SILVER, DUSTS_STEEL, DUSTS_TIN, DUSTS_URANIUM);

        // Plates
        this.tag(PLATES_ALUMINUM).add(ALUMINUM_PLATE.get());
        this.tag(PLATES_BRONZE).add(BRONZE_PLATE.get());
        this.tag(PLATES_COPPER).add(COPPER_PLATE.get());
        this.tag(PLATES_DIAMOND).add(DIAMOND_PLATE.get());
        this.tag(PLATES_ELECTRUM).add(ELECTRUM_PLATE.get());
        this.tag(PLATES_ENDERIUM).add(ENDERIUM_PLATE.get());
        this.tag(PLATES_GOLD).add(GOLD_PLATE.get());
        this.tag(PLATES_INVAR).add(INVAR_PLATE.get());
        this.tag(PLATES_IRON).add(IRON_PLATE.get());
        this.tag(PLATES_LEAD).add(LEAD_PLATE.get());
        this.tag(PLATES_NICKEL).add(NICKEL_PLATE.get());
        this.tag(PLATES_PLATINUM).add(PLATINUM_PLATE.get());
        this.tag(PLATES_SIGNALUM).add(SIGNALUM_PLATE.get());
        this.tag(PLATES_SILVER).add(SILVER_PLATE.get());
        this.tag(PLATES_STEEL).add(STEEL_PLATE.get());
        this.tag(PLATES_TIN).add(TIN_PLATE.get());
        this.tag(PLATES_URANIUM).add(URANIUM_PLATE.get());
        this.tag(PLATES).addTags(PLATES_ALUMINUM, PLATES_BRONZE, PLATES_COPPER, PLATES_DIAMOND, PLATES_ELECTRUM, PLATES_ENDERIUM, PLATES_GOLD, PLATES_INVAR, PLATES_IRON, PLATES_LEAD, PLATES_NICKEL, PLATES_PLATINUM, PLATES_SIGNALUM, PLATES_SILVER, PLATES_STEEL, PLATES_TIN, PLATES_URANIUM);

        // Raw Materials
        this.tag(RAW_MATERIALS_ALUMINUM).add(RAW_ALUMINUM.get());
        this.tag(RAW_MATERIALS_LEAD).add(RAW_LEAD.get());
        this.tag(RAW_MATERIALS_NICKEL).add(RAW_NICKEL.get());
        this.tag(RAW_MATERIALS_PLATINUM).add(RAW_PLATINUM.get());
        this.tag(RAW_MATERIALS_SILVER).add(RAW_SILVER.get());
        this.tag(RAW_MATERIALS_TIN).add(RAW_TIN.get());
        this.tag(RAW_MATERIALS_URANIUM).add(RAW_URANIUM.get());
        this.tag(Tags.Items.RAW_MATERIALS).addTags(RAW_MATERIALS_ALUMINUM, RAW_MATERIALS_LEAD, RAW_MATERIALS_NICKEL, RAW_MATERIALS_PLATINUM, RAW_MATERIALS_SILVER, RAW_MATERIALS_TIN, RAW_MATERIALS_URANIUM);

        // Storage Blocks
        this.copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        this.copy(FoundationTags.Blocks.BLOCKS_ALUMINUM, BLOCKS_ALUMINUM);
        this.copy(FoundationTags.Blocks.BLOCKS_BRONZE, BLOCKS_BRONZE);
        this.copy(FoundationTags.Blocks.BLOCKS_ELECTRUM, BLOCKS_ELECTRUM);
        this.copy(FoundationTags.Blocks.BLOCKS_ENDEIRUM, BLOCKS_ENDERIUM);
        this.copy(FoundationTags.Blocks.BLOCKS_INVAR, BLOCKS_INVAR);
        this.copy(FoundationTags.Blocks.BLOCKS_LEAD, BLOCKS_LEAD);
        this.copy(FoundationTags.Blocks.BLOCKS_NICKEL, BLOCKS_NICKEL);
        this.copy(FoundationTags.Blocks.BLOCKS_PLATINUM, BLOCKS_PLATINUM);
        this.copy(FoundationTags.Blocks.BLOCKS_SIGNALUM, BLOCKS_SIGNALUM);
        this.copy(FoundationTags.Blocks.BLOCKS_SILVER, BLOCKS_SILVER);
        this.copy(FoundationTags.Blocks.BLOCKS_STEEL, BLOCKS_STEEL);
        this.copy(FoundationTags.Blocks.BLOCKS_TIN, BLOCKS_TIN);
        this.copy(FoundationTags.Blocks.BLOCKS_URANIUM, BLOCKS_URANIUM);

        // Raw Storage Blocks
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_ALUMINUM, RAW_BLOCKS_ALUMINUM);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_LEAD, RAW_BLOCKS_LEAD);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_NICKEL, RAW_BLOCKS_NICKEL);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_PLATINUM, RAW_BLOCKS_PLATINUM);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_SILVER, RAW_BLOCKS_SILVER);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_TIN, RAW_BLOCKS_TIN);
        this.copy(FoundationTags.Blocks.RAW_BLOCKS_URANIUM, RAW_BLOCKS_URANIUM);

        // Ores
        this.copy(Tags.Blocks.ORES, Tags.Items.ORES);
        this.copy(FoundationTags.Blocks.ORES_ALUMINUM, ORES_ALUMINUM);
        this.copy(FoundationTags.Blocks.ORES_LEAD, ORES_LEAD);
        this.copy(FoundationTags.Blocks.ORES_NICKEL, ORES_NICKEL);
        this.copy(FoundationTags.Blocks.ORES_PLATINUM, ORES_PLATINUM);
        this.copy(FoundationTags.Blocks.ORES_SILVER, ORES_SILVER);
        this.copy(FoundationTags.Blocks.ORES_TIN, ORES_TIN);
        this.copy(FoundationTags.Blocks.ORES_URANIUM, ORES_URANIUM);

        // Forge Tags
        this.copy(Tags.Blocks.ORES_IN_GROUND_STONE, Tags.Items.ORES_IN_GROUND_STONE);
        this.copy(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, Tags.Items.ORES_IN_GROUND_DEEPSLATE);
        this.copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
    }
}
