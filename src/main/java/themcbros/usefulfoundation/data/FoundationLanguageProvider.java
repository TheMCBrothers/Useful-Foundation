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
        this.addBlock(FoundationBlocks.ALUMINUM_BLOCK, "Block of Aluminum");
        this.addBlock(FoundationBlocks.BRONZE_BLOCK, "Block of Bronze");
        this.addBlock(FoundationBlocks.ELECTRUM_BLOCK, "Block of Electrum");
        this.addBlock(FoundationBlocks.ENDERIUM_BLOCK, "Block of Enderium");
        this.addBlock(FoundationBlocks.INVAR_BLOCK, "Block of Invar");
        this.addBlock(FoundationBlocks.LEAD_BLOCK, "Block of Lead");
        this.addBlock(FoundationBlocks.NICKEL_BLOCK, "Block of Nickel");
        this.addBlock(FoundationBlocks.PLATINUM_BLOCK, "Block of Platinum");
        this.addBlock(FoundationBlocks.SIGNALUM_BLOCK, "Block of Signalum");
        this.addBlock(FoundationBlocks.SILVER_BLOCK, "Block of Silver");
        this.addBlock(FoundationBlocks.STEEL_BLOCK, "Block of Steel");
        this.addBlock(FoundationBlocks.TIN_BLOCK, "Block of Tin");
        this.addBlock(FoundationBlocks.URANIUM_BLOCK, "Block of Uranium");
        this.addBlock(FoundationBlocks.RAW_ALUMINUM_BLOCK, "Block of Raw Aluminum");
        this.addBlock(FoundationBlocks.RAW_LEAD_BLOCK, "Block of Raw Lead");
        this.addBlock(FoundationBlocks.RAW_NICKEL_BLOCK, "Block of Raw Nickel");
        this.addBlock(FoundationBlocks.RAW_PLATINUM_BLOCK, "Block of Raw Platinum");
        this.addBlock(FoundationBlocks.RAW_SILVER_BLOCK, "Block of Raw Silver");
        this.addBlock(FoundationBlocks.RAW_TIN_BLOCK, "Block of Raw Tin");
        this.addBlock(FoundationBlocks.RAW_URANIUM_BLOCK, "Block of Raw Uranium");
        this.addBlock(FoundationBlocks.USEFUL_BEEHIVE, "Useful Beehive");

        //Ores
        this.addBlock(FoundationBlocks.ALUMINUM_ORE, "Aluminum Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_ALUMINUM_ORE, "Deepslate Aluminum Ore");
        this.addBlock(FoundationBlocks.LEAD_ORE, "Lead Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_LEAD_ORE, "Deepslate Lead Ore");
        this.addBlock(FoundationBlocks.NICKEL_ORE, "Nickel Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_NICKEL_ORE, "Deepslate Nickel Ore");
        this.addBlock(FoundationBlocks.PLATINUM_ORE, "Platinum Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_PLATINUM_ORE, "Deepslate Platinum Ore");
        this.addBlock(FoundationBlocks.SILVER_ORE, "Silver Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");
        this.addBlock(FoundationBlocks.TIN_ORE, "Tin Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        this.addBlock(FoundationBlocks.URANIUM_ORE, "Uranium Ore");
        this.addBlock(FoundationBlocks.DEEPSLATE_URANIUM_ORE, "Deepslate Uranium Ore");

        //Mod Items
        this.addItem(ALUMINUM_GEAR, "Aluminum Gear");
        this.addItem(ALUMINUM_INGOT, "Aluminum Ingot");
        this.addItem(RAW_ALUMINUM, "Raw Aluminum");
        this.addItem(ALUMINUM_NUGGET, "Aluminum Nugget");
        this.addItem(ALUMINUM_PLATE, "Aluminum Plate");
        this.addItem(ALUMINUM_DUST, "Aluminum Dust");
        this.addItem(BRONZE_GEAR, "Bronze Gear");
        this.addItem(BRONZE_INGOT, "Bronze Ingot");
        this.addItem(BRONZE_NUGGET, "Bronze Nugget");
        this.addItem(BRONZE_PLATE, "Bronze Plate");
        this.addItem(BRONZE_DUST, "Bronze Dust");
        this.addItem(ELECTRUM_GEAR, "Electrum Gear");
        this.addItem(ELECTRUM_INGOT, "Electrum Ingot");
        this.addItem(ELECTRUM_NUGGET, "Electrum Nugget");
        this.addItem(ELECTRUM_PLATE, "Electrum Plate");
        this.addItem(ELECTRUM_DUST , "Electrum Dust");
        this.addItem(ENDERIUM_GEAR, "Enderium Gear");
        this.addItem(ENDERIUM_INGOT, "Enderium Ingot");
        this.addItem(ENDERIUM_NUGGET, "Enderium Nugget");
        this.addItem(ENDERIUM_PLATE, "Enderium Plate");
        this.addItem(ENDERIUM_DUST , "Enderium Dust");
        this.addItem(INVAR_GEAR, "Invar Gear");
        this.addItem(INVAR_INGOT, "Invar Ingot");
        this.addItem(INVAR_NUGGET, "Invar Nugget");
        this.addItem(INVAR_PLATE, "Invar Plate");
        this.addItem(INVAR_DUST , "Invar Dust");
        this.addItem(LEAD_GEAR, "Lead Gear");
        this.addItem(LEAD_INGOT, "Lead Ingot");
        this.addItem(RAW_LEAD, "Raw Lead");
        this.addItem(LEAD_NUGGET, "Lead Nugget");
        this.addItem(LEAD_PLATE, "Lead Plate");
        this.addItem(LEAD_DUST , "Lead Dust");
        this.addItem(NICKEL_GEAR, "Nickel Gear");
        this.addItem(NICKEL_INGOT, "Nickel Ingot");
        this.addItem(RAW_NICKEL, "Raw Nickel");
        this.addItem(NICKEL_NUGGET, "Nickel Nugget");
        this.addItem(NICKEL_PLATE, "Nickel Plate");
        this.addItem(NICKEL_DUST , "Nickel Dust");
        this.addItem(PLATINUM_GEAR, "Platinum Gear");
        this.addItem(PLATINUM_INGOT, "Platinum Ingot");
        this.addItem(RAW_PLATINUM, "Raw Platinum");
        this.addItem(PLATINUM_NUGGET, "Platinum Nugget");
        this.addItem(PLATINUM_PLATE, "Platinum Plate");
        this.addItem(PLATINUM_DUST , "Platinum Dust");
        this.addItem(SILVER_GEAR, "Silver Gear");
        this.addItem(SILVER_INGOT, "Silver Ingot");
        this.addItem(RAW_SILVER, "Raw Silver");
        this.addItem(SILVER_NUGGET, "Silver Nugget");
        this.addItem(SILVER_PLATE, "Silver Plate");
        this.addItem(SILVER_DUST , "Silver Dust");
        this.addItem(SIGNALUM_GEAR, "Signalum Gear");
        this.addItem(SIGNALUM_INGOT, "Signalum Ingot");
        this.addItem(SIGNALUM_NUGGET, "Signalum Nugget");
        this.addItem(SIGNALUM_DUST , "Signalum Dust");
        this.addItem(SIGNALUM_PLATE, "Signalum Plate");
        this.addItem(STEEL_GEAR, "Steel Gear");
        this.addItem(STEEL_INGOT, "Steel Ingot");
        this.addItem(STEEL_NUGGET, "Steel Nugget");
        this.addItem(STEEL_PLATE, "Steel Plate");
        this.addItem(STEEL_DUST , "Steel Dust");
        this.addItem(TIN_GEAR, "Tin Gear");
        this.addItem(TIN_INGOT, "Tin Ingot");
        this.addItem(RAW_TIN, "Raw Tin");
        this.addItem(TIN_NUGGET, "Tin Nugget");
        this.addItem(TIN_PLATE, "Tin Plate");
        this.addItem(TIN_DUST , "Tin Dust");
        this.addItem(URANIUM_GEAR, "Uranium Gear");
        this.addItem(URANIUM_INGOT, "Uranium Ingot");
        this.addItem(RAW_URANIUM, "Raw Uranium");
        this.addItem(URANIUM_NUGGET, "Uranium Nugget");
        this.addItem(URANIUM_PLATE, "Uranium Plate");
        this.addItem(URANIUM_DUST , "Uranium Dust");

        //Vanilla Items
        this.addItem(COPPER_GEAR, "Copper Gear");
        this.addItem(COPPER_NUGGET, "Copper Nugget");
        this.addItem(COPPER_PLATE, "Copper Plate");
        this.addItem(COPPER_DUST, "Copper Dust");
        this.addItem(GOLD_GEAR, "Gold Gear");
        this.addItem(GOLD_PLATE, "Gold Plate");
        this.addItem(GOLD_DUST, "Gold Dust");
        this.addItem(DIAMOND_GEAR, "Diamond Gear");
        this.addItem(DIAMOND_PLATE, "Diamond Plate");
        this.addItem(DIAMOND_DUST, "Diamond Dust");
        this.addItem(IRON_GEAR, "Iron Gear");
        this.addItem(IRON_PLATE, "Iron Plate");
        this.addItem(IRON_DUST, "Iron Dust");

        //Tools
        this.addItem(HAMMER, "Hammer");
    }
}
