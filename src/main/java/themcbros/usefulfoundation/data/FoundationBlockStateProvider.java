package themcbros.usefulfoundation.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.UsefulFoundation;

import static themcbros.usefulfoundation.init.FoundationBlocks.*;

public class FoundationBlockStateProvider extends BlockStateProvider {
    public FoundationBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UsefulFoundation.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(LEAD_ORE.get());
        simpleBlock(DEEPSLATE_LEAD_ORE.get());
        simpleBlock(NICKEL_ORE.get());
        simpleBlock(DEEPSLATE_NICKEL_ORE.get());
        simpleBlock(SILVER_ORE.get());
        simpleBlock(DEEPSLATE_SILVER_ORE.get());
        simpleBlock(TIN_ORE.get());
        simpleBlock(DEEPSLATE_TIN_ORE.get());
        simpleBlock(URANIUM_ORE.get());
        simpleBlock(DEEPSLATE_URANIUM_ORE.get());
        simpleBlock(ALUMINUM_ORE.get());
        simpleBlock(DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlock(PLATINUM_ORE.get());
        simpleBlock(DEEPSLATE_PLATINUM_ORE.get());
        simpleBlock(ELECTRUM_BLOCK.get());
        simpleBlock(INVAR_BLOCK.get());
        simpleBlock(LEAD_BLOCK.get());
        simpleBlock(RAW_LEAD_BLOCK.get());
        simpleBlock(NICKEL_BLOCK.get());
        simpleBlock(RAW_NICKEL_BLOCK.get());
        simpleBlock(SILVER_BLOCK.get());
        simpleBlock(RAW_SILVER_BLOCK.get());
        simpleBlock(TIN_BLOCK.get());
        simpleBlock(RAW_TIN_BLOCK.get());
        simpleBlock(URANIUM_BLOCK.get());
        simpleBlock(RAW_URANIUM_BLOCK.get());
        simpleBlock(ALUMINUM_BLOCK.get());
        simpleBlock(RAW_ALUMINUM_BLOCK.get());
        simpleBlock(PLATINUM_BLOCK.get());
        simpleBlock(RAW_PLATINUM_BLOCK.get());
        simpleBlock(SIGNALUM_BLOCK.get());
        simpleBlock(ENDERIUM_BLOCK.get());
        simpleBlock(STEEL_BLOCK.get());
        simpleBlock(BRONZE_BLOCK.get());

        horizontalBlock(USEFUL_BEEHIVE.get(), models().getExistingFile(mcLoc("block/beehive")));

        simpleBlockItem(LEAD_ORE.get());
        simpleBlockItem(DEEPSLATE_LEAD_ORE.get());
        simpleBlockItem(NICKEL_ORE.get());
        simpleBlockItem(DEEPSLATE_NICKEL_ORE.get());
        simpleBlockItem(SILVER_ORE.get());
        simpleBlockItem(DEEPSLATE_SILVER_ORE.get());
        simpleBlockItem(TIN_ORE.get());
        simpleBlockItem(DEEPSLATE_TIN_ORE.get());
        simpleBlockItem(URANIUM_ORE.get());
        simpleBlockItem(DEEPSLATE_URANIUM_ORE.get());
        simpleBlockItem(ALUMINUM_ORE.get());
        simpleBlockItem(DEEPSLATE_ALUMINUM_ORE.get());
        simpleBlockItem(PLATINUM_ORE.get());
        simpleBlockItem(DEEPSLATE_PLATINUM_ORE.get());
        simpleBlockItem(BRONZE_BLOCK.get());
        simpleBlockItem(ELECTRUM_BLOCK.get());
        simpleBlockItem(INVAR_BLOCK.get());
        simpleBlockItem(LEAD_BLOCK.get());
        simpleBlockItem(RAW_LEAD_BLOCK.get());
        simpleBlockItem(NICKEL_BLOCK.get());
        simpleBlockItem(RAW_NICKEL_BLOCK.get());
        simpleBlockItem(SILVER_BLOCK.get());
        simpleBlockItem(RAW_SILVER_BLOCK.get());
        simpleBlockItem(TIN_BLOCK.get());
        simpleBlockItem(RAW_TIN_BLOCK.get());
        simpleBlockItem(URANIUM_BLOCK.get());
        simpleBlockItem(RAW_URANIUM_BLOCK.get());
        simpleBlockItem(ALUMINUM_BLOCK.get());
        simpleBlockItem(RAW_ALUMINUM_BLOCK.get());
        simpleBlockItem(PLATINUM_BLOCK.get());
        simpleBlockItem(RAW_PLATINUM_BLOCK.get());
        simpleBlockItem(SIGNALUM_BLOCK.get());
        simpleBlockItem(ENDERIUM_BLOCK.get());
        simpleBlockItem(STEEL_BLOCK.get());
        simpleBlockItem(USEFUL_BEEHIVE.get(), models().getExistingFile(mcLoc("block/beehive")));
    }

    private void simpleBlockItem(Block block) {
        simpleBlockItem(block, models().getExistingFile(blockTexture(block)));
    }
}
