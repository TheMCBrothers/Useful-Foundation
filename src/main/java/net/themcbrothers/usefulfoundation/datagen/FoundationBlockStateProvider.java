package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;

public class FoundationBlockStateProvider extends BlockStateProvider {
    public FoundationBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UsefulFoundation.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(LEAD_ORE.get());
        simpleBlockWithItem(DEEPSLATE_LEAD_ORE.get());
        simpleBlockWithItem(NICKEL_ORE.get());
        simpleBlockWithItem(DEEPSLATE_NICKEL_ORE.get());
        simpleBlockWithItem(SILVER_ORE.get());
        simpleBlockWithItem(DEEPSLATE_SILVER_ORE.get());
        simpleBlockWithItem(TIN_ORE.get());
        simpleBlockWithItem(DEEPSLATE_TIN_ORE.get());
        simpleBlockWithItem(URANIUM_ORE.get());
        simpleBlockWithItem(DEEPSLATE_URANIUM_ORE.get());
        simpleBlockWithItem(ALUMINUM_ORE.get());
        simpleBlockWithItem(DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlockWithItem(PLATINUM_ORE.get());
        simpleBlockWithItem(DEEPSLATE_PLATINUM_ORE.get());
        simpleBlockWithItem(ELECTRUM_BLOCK.get());
        simpleBlockWithItem(INVAR_BLOCK.get());
        simpleBlockWithItem(LEAD_BLOCK.get());
        simpleBlockWithItem(RAW_LEAD_BLOCK.get());
        simpleBlockWithItem(NICKEL_BLOCK.get());
        simpleBlockWithItem(RAW_NICKEL_BLOCK.get());
        simpleBlockWithItem(SILVER_BLOCK.get());
        simpleBlockWithItem(RAW_SILVER_BLOCK.get());
        simpleBlockWithItem(TIN_BLOCK.get());
        simpleBlockWithItem(RAW_TIN_BLOCK.get());
        simpleBlockWithItem(URANIUM_BLOCK.get());
        simpleBlockWithItem(RAW_URANIUM_BLOCK.get());
        simpleBlockWithItem(ALUMINUM_BLOCK.get());
        simpleBlockWithItem(RAW_ALUMINUM_BLOCK.get());
        simpleBlockWithItem(PLATINUM_BLOCK.get());
        simpleBlockWithItem(RAW_PLATINUM_BLOCK.get());
        simpleBlockWithItem(SIGNALUM_BLOCK.get());
        simpleBlockWithItem(ENDERIUM_BLOCK.get());
        simpleBlockWithItem(STEEL_BLOCK.get());
        simpleBlockWithItem(BRONZE_BLOCK.get());

        horizontalBlock(USEFUL_BEEHIVE.get(), models().getExistingFile(mcLoc("block/beehive")));
        simpleBlockItem(USEFUL_BEEHIVE.get(), models().getExistingFile(mcLoc("block/beehive")));
    }

    private void simpleBlockItem(Block block) {
        simpleBlockItem(block, models().getExistingFile(blockTexture(block)));
    }

    private void simpleBlockWithItem(Block block) {
        simpleBlock(block);
        simpleBlockItem(block);
    }
}
