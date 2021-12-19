package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;

import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationLanguageProvider extends LanguageProvider {
    public FoundationLanguageProvider(DataGenerator gen) {
        super(gen, UsefulFoundation.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Creative Tab
        this.add("itemGroup.usefulfoundation", "Useful Foundation");

        //Blocks
        this.add(FoundationBlocks.BRONZE_BLOCK, "Block of Bronze");
        this.add(FoundationBlocks.ELECTRUM_BLOCK, "Block of Electrum");
        this.add(FoundationBlocks.INVAR_BLOCK, "Block of Invar");
        this.add(FoundationBlocks.LEAD_BLOCK, "Block of Lead");
        this.add(FoundationBlocks.NICKEL_BLOCK, "Block of Nickel");
        this.add(FoundationBlocks.SILVER_BLOCK, "Block of Silver");
        this.add(FoundationBlocks.TIN_BLOCK, "Block of Tin");
        this.add(FoundationBlocks.URANIUM_BLOCK, "Block of Uranium");
        this.add(FoundationBlocks.RAW_BRONZE_BLOCK, "Block of Raw Bronze");
        this.add(FoundationBlocks.RAW_ELECTRUM_BLOCK, "Block of Raw Electrum");
        this.add(FoundationBlocks.RAW_INVAR_BLOCK, "Block of Raw Invar");
        this.add(FoundationBlocks.RAW_LEAD_BLOCK, "Block of Raw Lead");
        this.add(FoundationBlocks.RAW_NICKEL_BLOCK, "Block of Raw Nickel");
        this.add(FoundationBlocks.RAW_SILVER_BLOCK, "Block of Raw Silver");
        this.add(FoundationBlocks.RAW_TIN_BLOCK, "Block of Raw Tin");
        this.add(FoundationBlocks.RAW_URANIUM_BLOCK, "Block of Raw Uranium");
        this.add(FoundationBlocks.USEFUL_BEEHIVE, "Useful Beehive");

        //Ores
        this.add(FoundationBlocks.LEAD_ORE, "Lead Ore");
        this.add(FoundationBlocks.DEEPSLATE_LEAD_ORE, "Deepslate Lead Ore");
        this.add(FoundationBlocks.NICKEL_ORE, "Nickel Ore");
        this.add(FoundationBlocks.DEEPSLATE_NICKEL_ORE, "Deepslate Nickel Ore");
        this.add(FoundationBlocks.SILVER_ORE, "Silver Ore");
        this.add(FoundationBlocks.DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");
        this.add(FoundationBlocks.TIN_ORE, "Tin Ore");
        this.add(FoundationBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        this.add(FoundationBlocks.URANIUM_ORE, "Uranium Ore");
        this.add(FoundationBlocks.DEEPSLATE_URANIUM_ORE, "Deepslate Uranium Ore");

        //Mod Items
        this.add(BRONZE_GEAR, "Bronze Gear");
        this.add(BRONZE_INGOT, "Bronze Ingot");
        this.add(RAW_BRONZE, "Raw Bronze");
        this.add(BRONZE_NUGGET, "Bronze Nugget");
        this.add(BRONZE_PLATE, "Bronze Plate");
        this.add(ELECTRUM_GEAR, "Electrum Gear");
        this.add(ELECTRUM_INGOT, "Electrum Ingot");
        this.add(RAW_ELECTRUM, "Raw Electrum");
        this.add(ELECTRUM_NUGGET, "Electrum Nugget");
        this.add(ELECTRUM_PLATE, "Electrum Plate");
        this.add(INVAR_GEAR, "Invar Gear");
        this.add(INVAR_INGOT, "Invar Ingot");
        this.add(RAW_INVAR, "Raw Invar");
        this.add(INVAR_NUGGET, "Invar Nugget");
        this.add(INVAR_PLATE, "Invar Plate");
        this.add(LEAD_GEAR, "Lead Gear");
        this.add(LEAD_INGOT, "Lead Ingot");
        this.add(RAW_LEAD, "Raw Lead");
        this.add(LEAD_NUGGET, "Lead Nugget");
        this.add(LEAD_PLATE, "Lead Plate");
        this.add(NICKEL_GEAR, "Nickel Gear");
        this.add(NICKEL_INGOT, "Nickel Ingot");
        this.add(RAW_NICKEL, "Raw Nickel");
        this.add(NICKEL_NUGGET, "Nickel Nugget");
        this.add(NICKEL_PLATE, "Nickel Plate");
        this.add(SILVER_GEAR, "Silver Gear");
        this.add(SILVER_INGOT, "Silver Ingot");
        this.add(RAW_SILVER, "Raw Silver");
        this.add(SILVER_NUGGET, "Silver Nugget");
        this.add(SILVER_PLATE, "Silver Plate");
        this.add(TIN_GEAR, "Tin Gear");
        this.add(TIN_INGOT, "Tin Ingot");
        this.add(RAW_TIN, "Raw Tin");
        this.add(TIN_NUGGET, "Tin Nugget");
        this.add(TIN_PLATE, "Tin Plate");
        this.add(URANIUM_GEAR, "Uranium Gear");
        this.add(URANIUM_INGOT, "Uranium Ingot");
        this.add(RAW_URANIUM, "Raw Uranium");
        this.add(URANIUM_NUGGET, "Uranium Nugget");
        this.add(URANIUM_PLATE, "Uranium Plate");

        //Vanilla Items
        this.add(COPPER_GEAR, "Copper Gear");
        this.add(COPPER_NUGGET, "Copper Nugget");
        this.add(COPPER_PLATE, "Copper Plate");
        this.add(GOLD_GEAR, "Gold Gear");
        this.add(GOLD_PLATE, "Gold Plate");
        this.add(IRON_GEAR, "Iron Gear");
        this.add(IRON_PLATE, "Iron Plate");

        //Tools
        this.add(HAMMER, "Hammer");
    }
}
