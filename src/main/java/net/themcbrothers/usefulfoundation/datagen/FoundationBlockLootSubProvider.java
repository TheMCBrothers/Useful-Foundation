package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.themcbrothers.usefulfoundation.core.Registration;

import java.util.Collections;
import java.util.stream.Collectors;

import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;
import static net.themcbrothers.usefulfoundation.core.FoundationItems.*;

public class FoundationBlockLootSubProvider extends BlockLootSubProvider {
    protected FoundationBlockLootSubProvider() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(USEFUL_BEEHIVE.get(), BlockLootSubProvider::createBeeHiveDrop);

        // Storage Blocks
        this.dropSelf(TIN_BLOCK.get());
        this.dropSelf(BRONZE_BLOCK.get());
        this.dropSelf(NICKEL_BLOCK.get());
        this.dropSelf(INVAR_BLOCK.get());
        this.dropSelf(LEAD_BLOCK.get());
        this.dropSelf(SILVER_BLOCK.get());
        this.dropSelf(ELECTRUM_BLOCK.get());
        this.dropSelf(URANIUM_BLOCK.get());
        this.dropSelf(ALUMINUM_BLOCK.get());
        this.dropSelf(PLATINUM_BLOCK.get());
        this.dropSelf(ENDERIUM_BLOCK.get());
        this.dropSelf(SIGNALUM_BLOCK.get());
        this.dropSelf(STEEL_BLOCK.get());

        // Raw Storage Blocks
        this.dropSelf(RAW_TIN_BLOCK.get());
        this.dropSelf(RAW_NICKEL_BLOCK.get());
        this.dropSelf(RAW_LEAD_BLOCK.get());
        this.dropSelf(RAW_SILVER_BLOCK.get());
        this.dropSelf(RAW_URANIUM_BLOCK.get());
        this.dropSelf(RAW_ALUMINUM_BLOCK.get());
        this.dropSelf(RAW_PLATINUM_BLOCK.get());

        // Ores
        this.add(TIN_ORE.get(), block -> this.createOreDrop(block, RAW_TIN.get()));
        this.add(NICKEL_ORE.get(), block -> this.createOreDrop(block, RAW_NICKEL.get()));
        this.add(LEAD_ORE.get(), block -> this.createOreDrop(block, RAW_LEAD.get()));
        this.add(SILVER_ORE.get(), block -> this.createOreDrop(block, RAW_SILVER.get()));
        this.add(URANIUM_ORE.get(), block -> this.createOreDrop(block, RAW_URANIUM.get()));
        this.add(ALUMINUM_ORE.get(), block -> this.createOreDrop(block, RAW_ALUMINUM.get()));
        this.add(PLATINUM_ORE.get(), block -> this.createOreDrop(block, RAW_PLATINUM.get()));

        // Deepslate Ores
        this.add(DEEPSLATE_TIN_ORE.get(), block -> this.createOreDrop(block, RAW_TIN.get()));
        this.add(DEEPSLATE_NICKEL_ORE.get(), block -> this.createOreDrop(block, RAW_NICKEL.get()));
        this.add(DEEPSLATE_LEAD_ORE.get(), block -> this.createOreDrop(block, RAW_LEAD.get()));
        this.add(DEEPSLATE_SILVER_ORE.get(), block -> this.createOreDrop(block, RAW_SILVER.get()));
        this.add(DEEPSLATE_URANIUM_ORE.get(), block -> this.createOreDrop(block, RAW_URANIUM.get()));
        this.add(DEEPSLATE_ALUMINUM_ORE.get(), block -> this.createOreDrop(block, RAW_ALUMINUM.get()));
        this.add(DEEPSLATE_PLATINUM_ORE.get(), block -> this.createOreDrop(block, RAW_PLATINUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::value)
                .collect(Collectors.toList());
    }
}

