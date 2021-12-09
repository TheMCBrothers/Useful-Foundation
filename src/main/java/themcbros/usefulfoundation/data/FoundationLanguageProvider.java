package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import themcbros.usefulfoundation.UsefulFoundation;
import themcbros.usefulfoundation.init.FoundationBlocks;
import themcbros.usefulfoundation.init.FoundationItems;

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
        this.add(FoundationItems.BRONZE_GEAR, "Bronze Gear");
        this.add(FoundationItems.BRONZE_INGOT, "Bronze Ingot");
        this.add(FoundationItems.BRONZE_NUGGET, "Bronze Nugget");
        this.add(FoundationItems.BRONZE_PLATE, "Bronze Plate");
        this.add(FoundationItems.ELECTRUM_GEAR, "Electrum Gear");
        this.add(FoundationItems.ELECTRUM_INGOT, "Electrum Ingot");
        this.add(FoundationItems.ELECTRUM_NUGGET, "Electrum Nugget");
        this.add(FoundationItems.ELECTRUM_PLATE, "Electrum Plate");
        this.add(FoundationItems.INVAR_GEAR, "Invar Gear");
        this.add(FoundationItems.INVAR_INGOT, "Invar Ingot");
        this.add(FoundationItems.INVAR_NUGGET, "Invar Nugget");
        this.add(FoundationItems.INVAR_PLATE, "Invar Plate");
        this.add(FoundationItems.LEAD_GEAR, "Lead Gear");
        this.add(FoundationItems.LEAD_INGOT, "Lead Ingot");
        this.add(FoundationItems.LEAD_NUGGET, "Lead Nugget");
        this.add(FoundationItems.LEAD_PLATE, "Lead Plate");
        this.add(FoundationItems.NICKEL_GEAR, "Nickel Gear");
        this.add(FoundationItems.NICKEL_INGOT, "Nickel Ingot");
        this.add(FoundationItems.NICKEL_NUGGET, "Nickel Nugget");
        this.add(FoundationItems.NICKEL_PLATE, "Nickel Plate");
        this.add(FoundationItems.SILVER_GEAR, "Silver Gear");
        this.add(FoundationItems.SILVER_INGOT, "Silver Ingot");
        this.add(FoundationItems.SILVER_NUGGET, "Silver Nugget");
        this.add(FoundationItems.SILVER_PLATE, "Silver Plate");
        this.add(FoundationItems.TIN_GEAR, "Tin Gear");
        this.add(FoundationItems.TIN_INGOT, "Tin Ingot");
        this.add(FoundationItems.TIN_NUGGET, "Tin Nugget");
        this.add(FoundationItems.TIN_PLATE, "Tin Plate");
        this.add(FoundationItems.URANIUM_GEAR, "Uranium Gear");
        this.add(FoundationItems.URANIUM_INGOT, "Uranium Ingot");
        this.add(FoundationItems.URANIUM_NUGGET, "Uranium Nugget");
        this.add(FoundationItems.URANIUM_PLATE, "Uranium Plate");

        //Vanilla Items
        this.add(FoundationItems.COPPER_GEAR, "Copper Gear");
        this.add(FoundationItems.COPPER_NUGGET, "Copper Nugget");
        this.add(FoundationItems.COPPER_PLATE, "Copper Plate");
        this.add(FoundationItems.GOLD_GEAR, "Copper Gear");
        this.add(FoundationItems.GOLD_PLATE, "Copper Plate");
        this.add(FoundationItems.IRON_GEAR, "Iron Gear");
        this.add(FoundationItems.IRON_PLATE, "Iron Plate");

        //Tools
        this.add(FoundationItems.HAMMER, "Hammer");
    }
}
