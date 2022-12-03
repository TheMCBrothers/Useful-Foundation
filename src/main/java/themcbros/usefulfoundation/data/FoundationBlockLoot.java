package themcbros.usefulfoundation.data;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import themcbros.usefulfoundation.init.FoundationItems;
import themcbros.usefulfoundation.init.Registration;

import javax.annotation.Nonnull;

import static themcbros.usefulfoundation.init.FoundationBlocks.*;

public class FoundationBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        //Ores
        this.add(DEEPSLATE_LEAD_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_LEAD.get()));
        this.add(LEAD_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_LEAD.get()));
        this.add(DEEPSLATE_NICKEL_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_NICKEL.get()));
        this.add(NICKEL_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_NICKEL.get()));
        this.add(DEEPSLATE_SILVER_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_SILVER.get()));
        this.add(SILVER_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_SILVER.get()));
        this.add(DEEPSLATE_TIN_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_TIN.get()));
        this.add(TIN_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_TIN.get()));
        this.add(DEEPSLATE_URANIUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_URANIUM.get()));
        this.add(URANIUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_URANIUM.get()));
        this.add(DEEPSLATE_ALUMINUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_ALUMINUM.get()));
        this.add(ALUMINUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_ALUMINUM.get()));
        this.add(DEEPSLATE_PLATINUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_PLATINUM.get()));
        this.add(PLATINUM_ORE.get(), (block) -> createOreDrop(block, FoundationItems.RAW_PLATINUM.get()));

        //Storage Blocks
        this.dropSelf(BRONZE_BLOCK.get());
        this.dropSelf(ELECTRUM_BLOCK.get());
        this.dropSelf(INVAR_BLOCK.get());
        this.dropSelf(LEAD_BLOCK.get());
        this.dropSelf(NICKEL_BLOCK.get());
        this.dropSelf(SILVER_BLOCK.get());
        this.dropSelf(TIN_BLOCK.get());
        this.dropSelf(URANIUM_BLOCK.get());
        this.dropSelf(ALUMINUM_BLOCK.get());
        this.dropSelf(PLATINUM_BLOCK.get());
        this.dropSelf(SIGNALUM_BLOCK.get());
        this.dropSelf(ENDERIUM_BLOCK.get());
        this.dropSelf(STEEL_BLOCK.get());

        //Raw Storage Blocks
        this.dropSelf(RAW_LEAD_BLOCK.get());
        this.dropSelf(RAW_NICKEL_BLOCK.get());
        this.dropSelf(RAW_SILVER_BLOCK.get());
        this.dropSelf(RAW_TIN_BLOCK.get());
        this.dropSelf(RAW_URANIUM_BLOCK.get());
        this.dropSelf(RAW_ALUMINUM_BLOCK.get());
        this.dropSelf(RAW_PLATINUM_BLOCK.get());

        //Other
        this.add(USEFUL_BEEHIVE.get(), BlockLoot::createBeeHiveDrop);
    }

    @Nonnull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get).toList();
    }
}
