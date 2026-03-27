package net.themcbrothers.usefulfoundation.datagen.models;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.themcbrothers.lib.data.models.ModelSubProvider;

import static net.themcbrothers.usefulfoundation.core.FoundationItems.*;


public class FoundationItemModelProvider extends ModelSubProvider {
    public FoundationItemModelProvider(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        super(blockModels, itemModels);
    }

    @Override
    protected void register() {
        // Foundation Items
        itemModels.generateFlatItem(ALUMINUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ALUMINUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_ALUMINUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ALUMINUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ALUMINUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ALUMINUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(BRONZE_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(BRONZE_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(BRONZE_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(BRONZE_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ELECTRUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ELECTRUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ELECTRUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ELECTRUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ELECTRUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ENDERIUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ENDERIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ENDERIUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ENDERIUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ENDERIUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(INVAR_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(INVAR_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(INVAR_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(INVAR_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(INVAR_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LEAD_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LEAD_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LEAD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LEAD_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LEAD_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(NICKEL_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(NICKEL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_NICKEL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(NICKEL_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(NICKEL_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(NICKEL_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PLATINUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PLATINUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_PLATINUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PLATINUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PLATINUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PLATINUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SILVER_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SILVER_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_SILVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SIGNALUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SIGNALUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SIGNALUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SIGNALUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SIGNALUM_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SILVER_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SILVER_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(SILVER_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(STEEL_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(STEEL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(STEEL_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(STEEL_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(STEEL_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(TIN_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(TIN_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(TIN_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(TIN_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(TIN_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(URANIUM_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(URANIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(RAW_URANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(URANIUM_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(URANIUM_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(URANIUM_DUST.get(), ModelTemplates.FLAT_ITEM);

        // Foundation Tools
        itemModels.generateFlatItem(HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        // Vanilla Items
        itemModels.generateFlatItem(COPPER_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(COPPER_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(COPPER_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(GOLD_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(GOLD_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(GOLD_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(DIAMOND_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(DIAMOND_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(DIAMOND_DUST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(IRON_GEAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(IRON_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(IRON_DUST.get(), ModelTemplates.FLAT_ITEM);
    }
}
