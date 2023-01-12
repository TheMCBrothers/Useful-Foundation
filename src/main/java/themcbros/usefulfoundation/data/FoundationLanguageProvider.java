package themcbros.usefulfoundation.data;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;

import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationLanguageProvider extends LanguageProvider {
    public FoundationLanguageProvider(PackOutput output) {
        super(output, UsefulFoundation.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Creative Tab
        this.add("itemGroup.usefulfoundation", "Useful Foundation");

        //Blocks
        this.add(FoundationBlocks.ALUMINUM_BLOCK.get(), "Block of Aluminum");
        this.add(FoundationBlocks.BRONZE_BLOCK.get(), "Block of Bronze");
        this.add(FoundationBlocks.ELECTRUM_BLOCK.get(), "Block of Electrum");
        this.add(FoundationBlocks.ENDERIUM_BLOCK.get(), "Block of Enderium");
        this.add(FoundationBlocks.INVAR_BLOCK.get(), "Block of Invar");
        this.add(FoundationBlocks.LEAD_BLOCK.get(), "Block of Lead");
        this.add(FoundationBlocks.NICKEL_BLOCK.get(), "Block of Nickel");
        this.add(FoundationBlocks.PLATINUM_BLOCK.get(), "Block of Platinum");
        this.add(FoundationBlocks.SIGNALUM_BLOCK.get(), "Block of Signalum");
        this.add(FoundationBlocks.SILVER_BLOCK.get(), "Block of Silver");
        this.add(FoundationBlocks.STEEL_BLOCK.get(), "Block of Steel");
        this.add(FoundationBlocks.TIN_BLOCK.get(), "Block of Tin");
        this.add(FoundationBlocks.URANIUM_BLOCK.get(), "Block of Uranium");
        this.add(FoundationBlocks.RAW_ALUMINUM_BLOCK.get(), "Block of Raw Aluminum");
        this.add(FoundationBlocks.RAW_LEAD_BLOCK.get(), "Block of Raw Lead");
        this.add(FoundationBlocks.RAW_NICKEL_BLOCK.get(), "Block of Raw Nickel");
        this.add(FoundationBlocks.RAW_PLATINUM_BLOCK.get(), "Block of Raw Platinum");
        this.add(FoundationBlocks.RAW_SILVER_BLOCK.get(), "Block of Raw Silver");
        this.add(FoundationBlocks.RAW_TIN_BLOCK.get(), "Block of Raw Tin");
        this.add(FoundationBlocks.RAW_URANIUM_BLOCK.get(), "Block of Raw Uranium");
        this.add(FoundationBlocks.USEFUL_BEEHIVE.get(), "Useful Beehive");

        //Ores
        this.add(FoundationBlocks.ALUMINUM_ORE.get(), "Aluminum Ore");
        this.add(FoundationBlocks.DEEPSLATE_ALUMINUM_ORE.get(), "Deepslate Aluminum Ore");
        this.add(FoundationBlocks.LEAD_ORE.get(), "Lead Ore");
        this.add(FoundationBlocks.DEEPSLATE_LEAD_ORE.get(), "Deepslate Lead Ore");
        this.add(FoundationBlocks.NICKEL_ORE.get(), "Nickel Ore");
        this.add(FoundationBlocks.DEEPSLATE_NICKEL_ORE.get(), "Deepslate Nickel Ore");
        this.add(FoundationBlocks.PLATINUM_ORE.get(), "Platinum Ore");
        this.add(FoundationBlocks.DEEPSLATE_PLATINUM_ORE.get(), "Deepslate Platinum Ore");
        this.add(FoundationBlocks.SILVER_ORE.get(), "Silver Ore");
        this.add(FoundationBlocks.DEEPSLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        this.add(FoundationBlocks.TIN_ORE.get(), "Tin Ore");
        this.add(FoundationBlocks.DEEPSLATE_TIN_ORE.get(), "Deepslate Tin Ore");
        this.add(FoundationBlocks.URANIUM_ORE.get(), "Uranium Ore");
        this.add(FoundationBlocks.DEEPSLATE_URANIUM_ORE.get(), "Deepslate Uranium Ore");

        //Mod Items
        this.add(ALUMINUM_GEAR.get(), "Aluminum Gear");
        this.add(ALUMINUM_INGOT.get(), "Aluminum Ingot");
        this.add(RAW_ALUMINUM.get(), "Raw Aluminum");
        this.add(ALUMINUM_NUGGET.get(), "Aluminum Nugget");
        this.add(ALUMINUM_PLATE.get(), "Aluminum Plate");
        this.add(ALUMINUM_DUST.get(), "Aluminum Dust");
        this.add(BRONZE_GEAR.get(), "Bronze Gear");
        this.add(BRONZE_INGOT.get(), "Bronze Ingot");
        this.add(BRONZE_NUGGET.get(), "Bronze Nugget");
        this.add(BRONZE_PLATE.get(), "Bronze Plate");
        this.add(BRONZE_DUST.get(), "Bronze Dust");
        this.add(ELECTRUM_GEAR.get(), "Electrum Gear");
        this.add(ELECTRUM_INGOT.get(), "Electrum Ingot");
        this.add(ELECTRUM_NUGGET.get(), "Electrum Nugget");
        this.add(ELECTRUM_PLATE.get(), "Electrum Plate");
        this.add(ELECTRUM_DUST.get(), "Electrum Dust");
        this.add(ENDERIUM_GEAR.get(), "Enderium Gear");
        this.add(ENDERIUM_INGOT.get(), "Enderium Ingot");
        this.add(ENDERIUM_NUGGET.get(), "Enderium Nugget");
        this.add(ENDERIUM_PLATE.get(), "Enderium Plate");
        this.add(ENDERIUM_DUST.get(), "Enderium Dust");
        this.add(INVAR_GEAR.get(), "Invar Gear");
        this.add(INVAR_INGOT.get(), "Invar Ingot");
        this.add(INVAR_NUGGET.get(), "Invar Nugget");
        this.add(INVAR_PLATE.get(), "Invar Plate");
        this.add(INVAR_DUST.get(), "Invar Dust");
        this.add(LEAD_GEAR.get(), "Lead Gear");
        this.add(LEAD_INGOT.get(), "Lead Ingot");
        this.add(RAW_LEAD.get(), "Raw Lead");
        this.add(LEAD_NUGGET.get(), "Lead Nugget");
        this.add(LEAD_PLATE.get(), "Lead Plate");
        this.add(LEAD_DUST.get(), "Lead Dust");
        this.add(NICKEL_GEAR.get(), "Nickel Gear");
        this.add(NICKEL_INGOT.get(), "Nickel Ingot");
        this.add(RAW_NICKEL.get(), "Raw Nickel");
        this.add(NICKEL_NUGGET.get(), "Nickel Nugget");
        this.add(NICKEL_PLATE.get(), "Nickel Plate");
        this.add(NICKEL_DUST.get(), "Nickel Dust");
        this.add(PLATINUM_GEAR.get(), "Platinum Gear");
        this.add(PLATINUM_INGOT.get(), "Platinum Ingot");
        this.add(RAW_PLATINUM.get(), "Raw Platinum");
        this.add(PLATINUM_NUGGET.get(), "Platinum Nugget");
        this.add(PLATINUM_PLATE.get(), "Platinum Plate");
        this.add(PLATINUM_DUST.get(), "Platinum Dust");
        this.add(SILVER_GEAR.get(), "Silver Gear");
        this.add(SILVER_INGOT.get(), "Silver Ingot");
        this.add(RAW_SILVER.get(), "Raw Silver");
        this.add(SILVER_NUGGET.get(), "Silver Nugget");
        this.add(SILVER_PLATE.get(), "Silver Plate");
        this.add(SILVER_DUST.get(), "Silver Dust");
        this.add(SIGNALUM_GEAR.get(), "Signalum Gear");
        this.add(SIGNALUM_INGOT.get(), "Signalum Ingot");
        this.add(SIGNALUM_NUGGET.get(), "Signalum Nugget");
        this.add(SIGNALUM_DUST.get(), "Signalum Dust");
        this.add(SIGNALUM_PLATE.get(), "Signalum Plate");
        this.add(STEEL_GEAR.get(), "Steel Gear");
        this.add(STEEL_INGOT.get(), "Steel Ingot");
        this.add(STEEL_NUGGET.get(), "Steel Nugget");
        this.add(STEEL_PLATE.get(), "Steel Plate");
        this.add(STEEL_DUST.get(), "Steel Dust");
        this.add(TIN_GEAR.get(), "Tin Gear");
        this.add(TIN_INGOT.get(), "Tin Ingot");
        this.add(RAW_TIN.get(), "Raw Tin");
        this.add(TIN_NUGGET.get(), "Tin Nugget");
        this.add(TIN_PLATE.get(), "Tin Plate");
        this.add(TIN_DUST.get(), "Tin Dust");
        this.add(URANIUM_GEAR.get(), "Uranium Gear");
        this.add(URANIUM_INGOT.get(), "Uranium Ingot");
        this.add(RAW_URANIUM.get(), "Raw Uranium");
        this.add(URANIUM_NUGGET.get(), "Uranium Nugget");
        this.add(URANIUM_PLATE.get(), "Uranium Plate");
        this.add(URANIUM_DUST.get(), "Uranium Dust");

        //Vanilla Items
        this.add(COPPER_GEAR.get(), "Copper Gear");
        this.add(COPPER_NUGGET.get(), "Copper Nugget");
        this.add(COPPER_PLATE.get(), "Copper Plate");
        this.add(COPPER_DUST.get(), "Copper Dust");
        this.add(GOLD_GEAR.get(), "Gold Gear");
        this.add(GOLD_PLATE.get(), "Gold Plate");
        this.add(GOLD_DUST.get(), "Gold Dust");
        this.add(DIAMOND_GEAR.get(), "Diamond Gear");
        this.add(DIAMOND_PLATE.get(), "Diamond Plate");
        this.add(DIAMOND_DUST.get(), "Diamond Dust");
        this.add(IRON_GEAR.get(), "Iron Gear");
        this.add(IRON_PLATE.get(), "Iron Plate");
        this.add(IRON_DUST.get(), "Iron Dust");

        //Tools
        this.add(HAMMER.get(), "Hammer");
    }
}
