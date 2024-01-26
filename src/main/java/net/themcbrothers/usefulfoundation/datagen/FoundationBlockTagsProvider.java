package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.themcbrothers.usefulfoundation.FoundationTags.Blocks.*;
import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;

public class FoundationBlockTagsProvider extends BlockTagsProvider {
    public FoundationBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Storage Blocks
        this.tag(BLOCKS_ALUMINUM).add(ALUMINUM_BLOCK.get());
        this.tag(BLOCKS_BRONZE).add(BRONZE_BLOCK.get());
        this.tag(BLOCKS_ELECTRUM).add(ELECTRUM_BLOCK.get());
        this.tag(BLOCKS_ENDEIRUM).add(ENDERIUM_BLOCK.get());
        this.tag(BLOCKS_INVAR).add(INVAR_BLOCK.get());
        this.tag(BLOCKS_LEAD).add(LEAD_BLOCK.get());
        this.tag(BLOCKS_NICKEL).add(NICKEL_BLOCK.get());
        this.tag(BLOCKS_PLATINUM).add(PLATINUM_BLOCK.get());
        this.tag(BLOCKS_SIGNALUM).add(SIGNALUM_BLOCK.get());
        this.tag(BLOCKS_SILVER).add(SILVER_BLOCK.get());
        this.tag(BLOCKS_STEEL).add(STEEL_BLOCK.get());
        this.tag(BLOCKS_TIN).add(TIN_BLOCK.get());
        this.tag(BLOCKS_URANIUM).add(URANIUM_BLOCK.get());
        this.tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(BLOCKS_ALUMINUM,
                        BLOCKS_BRONZE,
                        BLOCKS_ELECTRUM,
                        BLOCKS_ENDEIRUM,
                        BLOCKS_INVAR,
                        BLOCKS_LEAD,
                        BLOCKS_NICKEL,
                        BLOCKS_PLATINUM,
                        BLOCKS_SIGNALUM,
                        BLOCKS_SILVER,
                        BLOCKS_STEEL,
                        BLOCKS_TIN,
                        BLOCKS_URANIUM
                );

        // Raw Storage Blocks
        this.tag(RAW_BLOCKS_ALUMINUM).add(RAW_ALUMINUM_BLOCK.get());
        this.tag(RAW_BLOCKS_LEAD).add(RAW_LEAD_BLOCK.get());
        this.tag(RAW_BLOCKS_NICKEL).add(RAW_NICKEL_BLOCK.get());
        this.tag(RAW_BLOCKS_PLATINUM).add(RAW_PLATINUM_BLOCK.get());
        this.tag(RAW_BLOCKS_SILVER).add(RAW_SILVER_BLOCK.get());
        this.tag(RAW_BLOCKS_TIN).add(RAW_TIN_BLOCK.get());
        this.tag(RAW_BLOCKS_URANIUM).add(RAW_URANIUM_BLOCK.get());
        this.tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(RAW_BLOCKS_ALUMINUM,
                        RAW_BLOCKS_LEAD,
                        RAW_BLOCKS_NICKEL,
                        RAW_BLOCKS_PLATINUM,
                        RAW_BLOCKS_SILVER,
                        RAW_BLOCKS_TIN,
                        RAW_BLOCKS_URANIUM
                );

        // Ore Blocks
        this.tag(ORES_ALUMINUM).add(ALUMINUM_ORE.get(), DEEPSLATE_ALUMINUM_ORE.get());
        this.tag(ORES_LEAD).add(LEAD_ORE.get(), DEEPSLATE_LEAD_ORE.get());
        this.tag(ORES_NICKEL).add(NICKEL_ORE.get(), DEEPSLATE_NICKEL_ORE.get());
        this.tag(ORES_PLATINUM).add(PLATINUM_ORE.get(), DEEPSLATE_PLATINUM_ORE.get());
        this.tag(ORES_SILVER).add(SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get());
        this.tag(ORES_TIN).add(TIN_ORE.get(), DEEPSLATE_TIN_ORE.get());
        this.tag(ORES_URANIUM).add(URANIUM_ORE.get(), DEEPSLATE_URANIUM_ORE.get());
        this.tag(Tags.Blocks.ORES)
                .addTags(ORES_ALUMINUM,
                        ORES_LEAD,
                        ORES_NICKEL,
                        ORES_PLATINUM,
                        ORES_SILVER,
                        ORES_TIN,
                        ORES_URANIUM
                );

        // Forge Tags
        this.tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                .add(ALUMINUM_ORE.get(),
                        LEAD_ORE.get(),
                        NICKEL_ORE.get(),
                        PLATINUM_ORE.get(),
                        SILVER_ORE.get(),
                        TIN_ORE.get(),
                        URANIUM_ORE.get()
                );
        this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                .add(DEEPSLATE_ALUMINUM_ORE.get(),
                        DEEPSLATE_LEAD_ORE.get(),
                        DEEPSLATE_NICKEL_ORE.get(),
                        DEEPSLATE_PLATINUM_ORE.get(),
                        DEEPSLATE_SILVER_ORE.get(),
                        DEEPSLATE_TIN_ORE.get(),
                        DEEPSLATE_URANIUM_ORE.get()
                );
        this.tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(ALUMINUM_ORE.get(),
                        LEAD_ORE.get(),
                        NICKEL_ORE.get(),
                        PLATINUM_ORE.get(),
                        SILVER_ORE.get(),
                        TIN_ORE.get(),
                        URANIUM_ORE.get(),
                        DEEPSLATE_ALUMINUM_ORE.get(),
                        DEEPSLATE_LEAD_ORE.get(),
                        DEEPSLATE_NICKEL_ORE.get(),
                        DEEPSLATE_PLATINUM_ORE.get(),
                        DEEPSLATE_SILVER_ORE.get(),
                        DEEPSLATE_TIN_ORE.get(),
                        DEEPSLATE_URANIUM_ORE.get()
                );

        // Vanilla Tags
        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .addTags(BLOCKS_ALUMINUM,
                        BLOCKS_BRONZE,
                        Tags.Blocks.STORAGE_BLOCKS_COPPER,
                        BLOCKS_ELECTRUM,
                        BLOCKS_ENDEIRUM,
                        BLOCKS_INVAR,
                        BLOCKS_LEAD,
                        BLOCKS_NICKEL,
                        BLOCKS_PLATINUM,
                        BLOCKS_SIGNALUM,
                        BLOCKS_SILVER,
                        BLOCKS_STEEL,
                        BLOCKS_TIN,
                        BLOCKS_URANIUM);
        this.tag(BlockTags.BEEHIVES).add(USEFUL_BEEHIVE.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(USEFUL_BEEHIVE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ALUMINUM_ORE.get(),
                        DEEPSLATE_ALUMINUM_ORE.get(),
                        ALUMINUM_BLOCK.get(),
                        LEAD_ORE.get(),
                        DEEPSLATE_LEAD_ORE.get(),
                        LEAD_BLOCK.get(),
                        NICKEL_ORE.get(),
                        DEEPSLATE_NICKEL_ORE.get(),
                        NICKEL_BLOCK.get(),
                        PLATINUM_ORE.get(),
                        DEEPSLATE_PLATINUM_ORE.get(),
                        PLATINUM_BLOCK.get(),
                        SILVER_ORE.get(),
                        DEEPSLATE_SILVER_ORE.get(),
                        SILVER_BLOCK.get(),
                        TIN_ORE.get(),
                        DEEPSLATE_TIN_ORE.get(),
                        TIN_BLOCK.get(),
                        URANIUM_ORE.get(),
                        DEEPSLATE_URANIUM_ORE.get(),
                        URANIUM_BLOCK.get(),
                        BRONZE_BLOCK.get(),
                        INVAR_BLOCK.get(),
                        ELECTRUM_BLOCK.get(),
                        ENDERIUM_BLOCK.get(),
                        SIGNALUM_BLOCK.get(),
                        STEEL_BLOCK.get(),
                        RAW_ALUMINUM_BLOCK.get(),
                        RAW_LEAD_BLOCK.get(),
                        RAW_NICKEL_BLOCK.get(),
                        RAW_PLATINUM_BLOCK.get(),
                        RAW_SILVER_BLOCK.get(),
                        RAW_TIN_BLOCK.get(),
                        RAW_URANIUM_BLOCK.get()
                );

        // Needs Tool
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(ALUMINUM_ORE.get(), DEEPSLATE_ALUMINUM_ORE.get(), ALUMINUM_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(LEAD_ORE.get(),
                        DEEPSLATE_LEAD_ORE.get(),
                        LEAD_BLOCK.get(),
                        RAW_LEAD_BLOCK.get(),
                        NICKEL_ORE.get(),
                        DEEPSLATE_NICKEL_ORE.get(),
                        NICKEL_BLOCK.get(),
                        RAW_NICKEL_BLOCK.get(),
                        SILVER_ORE.get(),
                        DEEPSLATE_SILVER_ORE.get(),
                        SILVER_BLOCK.get(),
                        RAW_SILVER_BLOCK.get(),
                        TIN_ORE.get(),
                        DEEPSLATE_TIN_ORE.get(),
                        TIN_BLOCK.get(),
                        RAW_TIN_BLOCK.get(),
                        BRONZE_BLOCK.get(),
                        INVAR_BLOCK.get(),
                        STEEL_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(URANIUM_ORE.get(),
                        DEEPSLATE_URANIUM_ORE.get(),
                        URANIUM_BLOCK.get(),
                        RAW_URANIUM_BLOCK.get(),
                        ELECTRUM_BLOCK.get(),
                        ENDERIUM_BLOCK.get(),
                        SIGNALUM_BLOCK.get()
                );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(PLATINUM_ORE.get(),
                        DEEPSLATE_PLATINUM_ORE.get(),
                        PLATINUM_BLOCK.get(),
                        RAW_PLATINUM_BLOCK.get()
                );
    }
}