package net.themcbrothers.usefulfoundation.datagen.models;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Blocks;
import net.themcbrothers.lib.data.models.ModelSubProvider;

import java.util.Map;

import static net.minecraft.client.data.models.BlockModelGenerators.*;
import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;

public class FoundationBlockModelProvider extends ModelSubProvider {
    public FoundationBlockModelProvider(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super(blockModels, itemModels);
    }

    @Override
    protected void register() {
        blockModels.createTrivialCube(LEAD_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_LEAD_ORE.get());
        blockModels.createTrivialCube(NICKEL_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_NICKEL_ORE.get());
        blockModels.createTrivialCube(SILVER_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_SILVER_ORE.get());
        blockModels.createTrivialCube(TIN_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_TIN_ORE.get());
        blockModels.createTrivialCube(URANIUM_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_URANIUM_ORE.get());
        blockModels.createTrivialCube(ALUMINUM_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_ALUMINUM_ORE.get());
        blockModels.createTrivialCube(PLATINUM_ORE.get());
        blockModels.createTrivialCube(DEEPSLATE_PLATINUM_ORE.get());
        blockModels.createTrivialCube(ELECTRUM_BLOCK.get());
        blockModels.createTrivialCube(INVAR_BLOCK.get());
        blockModels.createTrivialCube(LEAD_BLOCK.get());
        blockModels.createTrivialCube(RAW_LEAD_BLOCK.get());
        blockModels.createTrivialCube(NICKEL_BLOCK.get());
        blockModels.createTrivialCube(RAW_NICKEL_BLOCK.get());
        blockModels.createTrivialCube(SILVER_BLOCK.get());
        blockModels.createTrivialCube(RAW_SILVER_BLOCK.get());
        blockModels.createTrivialCube(TIN_BLOCK.get());
        blockModels.createTrivialCube(RAW_TIN_BLOCK.get());
        blockModels.createTrivialCube(URANIUM_BLOCK.get());
        blockModels.createTrivialCube(RAW_URANIUM_BLOCK.get());
        blockModels.createTrivialCube(ALUMINUM_BLOCK.get());
        blockModels.createTrivialCube(RAW_ALUMINUM_BLOCK.get());
        blockModels.createTrivialCube(PLATINUM_BLOCK.get());
        blockModels.createTrivialCube(RAW_PLATINUM_BLOCK.get());
        blockModels.createTrivialCube(SIGNALUM_BLOCK.get());
        blockModels.createTrivialCube(ENDERIUM_BLOCK.get());
        blockModels.createTrivialCube(STEEL_BLOCK.get());
        blockModels.createTrivialCube(BRONZE_BLOCK.get());

        // Beehive
        Identifier emptyModel = ModelLocationUtils.getModelLocation(Blocks.BEEHIVE, "_empty");
        Identifier fullModel = ModelLocationUtils.getModelLocation(Blocks.BEEHIVE, "_honey");
        this.blockModels.itemModelOutput.accept(USEFUL_BEEHIVE.asItem(), ItemModelUtils.selectBlockItemProperty(BeehiveBlock.HONEY_LEVEL, ItemModelUtils.plainModel(emptyModel), Map.of(5, ItemModelUtils.plainModel(fullModel))));
        this.blockStateOutput.accept(MultiVariantGenerator.dispatch( USEFUL_BEEHIVE.get()).with(createEmptyOrFullDispatch(BeehiveBlock.HONEY_LEVEL, 5, plainVariant(fullModel), plainVariant(emptyModel))).with(ROTATION_HORIZONTAL_FACING));
    }
}
