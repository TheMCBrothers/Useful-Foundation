package themcbros.usefulfoundation.data;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import themcbros.usefulfoundation.init.FoundationItems;

import javax.annotation.Nonnull;

import static themcbros.usefulfoundation.init.FoundationBlocks.*;

public class FoundationBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        //Ores
        this.add(DEEPSLATE_LEAD_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_LEAD));
        this.add(LEAD_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_LEAD));
        this.add(DEEPSLATE_NICKEL_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_NICKEL));
        this.add(NICKEL_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_NICKEL));
        this.add(DEEPSLATE_SILVER_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_SILVER));
        this.add(SILVER_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_SILVER));
        this.add(DEEPSLATE_TIN_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_TIN));
        this.add(TIN_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_TIN));
        this.add(DEEPSLATE_URANIUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_URANIUM));
        this.add(URANIUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_URANIUM));
        this.add(DEEPSLATE_ALUMINUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_ALUMINUM));
        this.add(ALUMINUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_ALUMINUM));
        this.add(DEEPSLATE_PLATINUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_PLATINUM));
        this.add(PLATINUM_ORE, (block) -> createOreDrop(block, FoundationItems.RAW_PLATINUM));

        //Storage Blocks
        this.dropSelf(BRONZE_BLOCK);
        this.dropSelf(ELECTRUM_BLOCK);
        this.dropSelf(INVAR_BLOCK);
        this.dropSelf(LEAD_BLOCK);
        this.dropSelf(NICKEL_BLOCK);
        this.dropSelf(SILVER_BLOCK);
        this.dropSelf(TIN_BLOCK);
        this.dropSelf(URANIUM_BLOCK);
        this.dropSelf(ALUMINUM_BLOCK);
        this.dropSelf(PLATINUM_BLOCK);
        this.dropSelf(SIGNALUM_BLOCK);
        this.dropSelf(ENDERIUM_BLOCK);
        this.dropSelf(STEEL_BLOCK);

        //Raw Storage Blocks
        this.dropSelf(RAW_LEAD_BLOCK);
        this.dropSelf(RAW_NICKEL_BLOCK);
        this.dropSelf(RAW_SILVER_BLOCK);
        this.dropSelf(RAW_TIN_BLOCK);
        this.dropSelf(RAW_URANIUM_BLOCK);
        this.dropSelf(RAW_ALUMINUM_BLOCK);
        this.dropSelf(RAW_PLATINUM_BLOCK);

        //Other
        this.add(USEFUL_BEEHIVE, BlockLoot::createBeeHiveDrop);
    }


    @Nonnull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BLOCKS;
    }
}
