package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.UsefulFoundation;

import java.util.Objects;

import static themcbros.usefulfoundation.init.FoundationBlocks.*;

public class FoundationBlockStateProvider extends BlockStateProvider {
    public FoundationBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, UsefulFoundation.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(LEAD_ORE);
        simpleBlock(DEEPSLATE_LEAD_ORE);
        simpleBlock(NICKEL_ORE);
        simpleBlock(DEEPSLATE_NICKEL_ORE);
        simpleBlock(SILVER_ORE);
        simpleBlock(DEEPSLATE_SILVER_ORE);
        simpleBlock(DEEPSLATE_TIN_ORE);
        simpleBlock(TIN_ORE);
        simpleBlock(URANIUM_ORE);
        simpleBlock(DEEPSLATE_URANIUM_ORE);
        simpleBlock(BRONZE_BLOCK);
        simpleBlock(RAW_BRONZE_BLOCK);
        simpleBlock(ELECTRUM_BLOCK);
        simpleBlock(RAW_ELECTRUM_BLOCK);
        simpleBlock(INVAR_BLOCK);
        simpleBlock(RAW_INVAR_BLOCK);
        simpleBlock(LEAD_BLOCK);
        simpleBlock(RAW_LEAD_BLOCK);
        simpleBlock(NICKEL_BLOCK);
        simpleBlock(RAW_NICKEL_BLOCK);
        simpleBlock(SILVER_BLOCK);
        simpleBlock(RAW_SILVER_BLOCK);
        simpleBlock(TIN_BLOCK);
        simpleBlock(RAW_TIN_BLOCK);
        simpleBlock(URANIUM_BLOCK);
        simpleBlock(RAW_URANIUM_BLOCK);

        horizontalBlock(USEFUL_BEEHIVE, models().getExistingFile(mcLoc("block/beehive")));

        simpleBlockItem(LEAD_ORE);
        simpleBlockItem(DEEPSLATE_LEAD_ORE);
        simpleBlockItem(NICKEL_ORE);
        simpleBlockItem(DEEPSLATE_NICKEL_ORE);
        simpleBlockItem(SILVER_ORE);
        simpleBlockItem(DEEPSLATE_SILVER_ORE);
        simpleBlockItem(TIN_ORE);
        simpleBlockItem(DEEPSLATE_TIN_ORE);
        simpleBlockItem(URANIUM_ORE);
        simpleBlockItem(DEEPSLATE_URANIUM_ORE);
        simpleBlockItem(BRONZE_BLOCK);
        simpleBlockItem(RAW_BRONZE_BLOCK);
        simpleBlockItem(ELECTRUM_BLOCK);
        simpleBlockItem(RAW_ELECTRUM_BLOCK);
        simpleBlockItem(INVAR_BLOCK);
        simpleBlockItem(RAW_INVAR_BLOCK);
        simpleBlockItem(LEAD_BLOCK);
        simpleBlockItem(RAW_LEAD_BLOCK);
        simpleBlockItem(NICKEL_BLOCK);
        simpleBlockItem(RAW_NICKEL_BLOCK);
        simpleBlockItem(SILVER_BLOCK);
        simpleBlockItem(RAW_SILVER_BLOCK);
        simpleBlockItem(TIN_BLOCK);
        simpleBlockItem(RAW_TIN_BLOCK);
        simpleBlockItem(URANIUM_BLOCK);
        simpleBlockItem(RAW_URANIUM_BLOCK);
        simpleBlockItem(USEFUL_BEEHIVE, models().getExistingFile(mcLoc("block/beehive")));
    }

    private void simpleBlockItem(Block block) {
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + Objects.requireNonNull(block.getRegistryName()).getPath())));
    }
}