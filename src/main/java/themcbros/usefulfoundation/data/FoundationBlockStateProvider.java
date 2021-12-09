package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;

import java.util.Objects;

public class FoundationBlockStateProvider extends BlockStateProvider {
    public FoundationBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, UsefulFoundation.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(FoundationBlocks.LEAD_ORE);
        simpleBlock(FoundationBlocks.DEEPSLATE_LEAD_ORE);
        simpleBlock(FoundationBlocks.LEAD_BLOCK);
        simpleBlock(FoundationBlocks.NICKEL_ORE);
        simpleBlock(FoundationBlocks.DEEPSLATE_NICKEL_ORE);
        simpleBlock(FoundationBlocks.NICKEL_BLOCK);
        simpleBlock(FoundationBlocks.SILVER_ORE);
        simpleBlock(FoundationBlocks.DEEPSLATE_SILVER_ORE);
        simpleBlock(FoundationBlocks.SILVER_BLOCK);
        simpleBlock(FoundationBlocks.TIN_ORE);
        simpleBlock(FoundationBlocks.DEEPSLATE_TIN_ORE);
        simpleBlock(FoundationBlocks.TIN_BLOCK);
        simpleBlock(FoundationBlocks.URANIUM_ORE);
        simpleBlock(FoundationBlocks.DEEPSLATE_URANIUM_ORE);
        simpleBlock(FoundationBlocks.URANIUM_BLOCK);
        simpleBlock(FoundationBlocks.BRONZE_BLOCK);
        simpleBlock(FoundationBlocks.ELECTRUM_BLOCK);
        simpleBlock(FoundationBlocks.INVAR_BLOCK);

        horizontalBlock(FoundationBlocks.USEFUL_BEEHIVE, models().getExistingFile(mcLoc("block/beehive")));

        simpleBlockItem(FoundationBlocks.LEAD_ORE);
        simpleBlockItem(FoundationBlocks.DEEPSLATE_LEAD_ORE);
        simpleBlockItem(FoundationBlocks.NICKEL_ORE);
        simpleBlockItem(FoundationBlocks.DEEPSLATE_NICKEL_ORE);
        simpleBlockItem(FoundationBlocks.SILVER_ORE);
        simpleBlockItem(FoundationBlocks.DEEPSLATE_SILVER_ORE);
        simpleBlockItem(FoundationBlocks.TIN_ORE);
        simpleBlockItem(FoundationBlocks.DEEPSLATE_TIN_ORE);
        simpleBlockItem(FoundationBlocks.URANIUM_ORE);
        simpleBlockItem(FoundationBlocks.DEEPSLATE_URANIUM_ORE);
        simpleBlockItem(FoundationBlocks.BRONZE_BLOCK);
        simpleBlockItem(FoundationBlocks.ELECTRUM_BLOCK);
        simpleBlockItem(FoundationBlocks.INVAR_BLOCK);
        simpleBlockItem(FoundationBlocks.LEAD_BLOCK);
        simpleBlockItem(FoundationBlocks.NICKEL_BLOCK);
        simpleBlockItem(FoundationBlocks.SILVER_BLOCK);
        simpleBlockItem(FoundationBlocks.TIN_BLOCK);
        simpleBlockItem(FoundationBlocks.URANIUM_BLOCK);
        simpleBlockItem(FoundationBlocks.USEFUL_BEEHIVE, models().getExistingFile(mcLoc("block/beehive")));
    }

    private void simpleBlockItem(Block block) {
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + Objects.requireNonNull(block.getRegistryName()).getPath())));
    }
}