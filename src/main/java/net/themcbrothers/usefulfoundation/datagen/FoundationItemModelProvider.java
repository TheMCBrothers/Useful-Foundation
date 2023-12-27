package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.themcbrothers.usefulfoundation.UsefulFoundation;

import static net.themcbrothers.usefulfoundation.infrastructure.FoundationItems.*;

public class FoundationItemModelProvider extends ItemModelProvider {
    public FoundationItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UsefulFoundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Foundation Items
        basicItem(ALUMINUM_GEAR.get());
        basicItem(ALUMINUM_INGOT.get());
        basicItem(RAW_ALUMINUM.get());
        basicItem(ALUMINUM_NUGGET.get());
        basicItem(ALUMINUM_PLATE.get());
        basicItem(ALUMINUM_DUST.get());
        basicItem(BRONZE_GEAR.get());
        basicItem(BRONZE_INGOT.get());
        basicItem(BRONZE_NUGGET.get());
        basicItem(BRONZE_PLATE.get());
        basicItem(BRONZE_DUST.get());
        basicItem(ELECTRUM_GEAR.get());
        basicItem(ELECTRUM_INGOT.get());
        basicItem(ELECTRUM_NUGGET.get());
        basicItem(ELECTRUM_PLATE.get());
        basicItem(ELECTRUM_DUST.get());
        basicItem(ENDERIUM_GEAR.get());
        basicItem(ENDERIUM_INGOT.get());
        basicItem(ENDERIUM_NUGGET.get());
        basicItem(ENDERIUM_PLATE.get());
        basicItem(ENDERIUM_DUST.get());
        basicItem(INVAR_GEAR.get());
        basicItem(INVAR_INGOT.get());
        basicItem(INVAR_NUGGET.get());
        basicItem(INVAR_PLATE.get());
        basicItem(INVAR_DUST.get());
        basicItem(LEAD_GEAR.get());
        basicItem(LEAD_INGOT.get());
        basicItem(RAW_LEAD.get());
        basicItem(LEAD_NUGGET.get());
        basicItem(LEAD_PLATE.get());
        basicItem(LEAD_DUST.get());
        basicItem(NICKEL_GEAR.get());
        basicItem(NICKEL_INGOT.get());
        basicItem(RAW_NICKEL.get());
        basicItem(NICKEL_NUGGET.get());
        basicItem(NICKEL_PLATE.get());
        basicItem(NICKEL_DUST.get());
        basicItem(PLATINUM_GEAR.get());
        basicItem(PLATINUM_INGOT.get());
        basicItem(RAW_PLATINUM.get());
        basicItem(PLATINUM_NUGGET.get());
        basicItem(PLATINUM_PLATE.get());
        basicItem(PLATINUM_DUST.get());
        basicItem(SILVER_GEAR.get());
        basicItem(SILVER_INGOT.get());
        basicItem(RAW_SILVER.get());
        basicItem(SIGNALUM_GEAR.get());
        basicItem(SIGNALUM_INGOT.get());
        basicItem(SIGNALUM_NUGGET.get());
        basicItem(SIGNALUM_PLATE.get());
        basicItem(SIGNALUM_DUST.get());
        basicItem(SILVER_NUGGET.get());
        basicItem(SILVER_PLATE.get());
        basicItem(SILVER_DUST.get());
        basicItem(STEEL_GEAR.get());
        basicItem(STEEL_INGOT.get());
        basicItem(STEEL_NUGGET.get());
        basicItem(STEEL_PLATE.get());
        basicItem(STEEL_DUST.get());
        basicItem(TIN_GEAR.get());
        basicItem(TIN_INGOT.get());
        basicItem(RAW_TIN.get());
        basicItem(TIN_NUGGET.get());
        basicItem(TIN_PLATE.get());
        basicItem(TIN_DUST.get());
        basicItem(URANIUM_GEAR.get());
        basicItem(URANIUM_INGOT.get());
        basicItem(RAW_URANIUM.get());
        basicItem(URANIUM_NUGGET.get());
        basicItem(URANIUM_PLATE.get());
        basicItem(URANIUM_DUST.get());

        // Foundation Tools
        // simpleTool(HAMMER.get());

        // Vanilla Items
        basicItem(COPPER_GEAR.get());
        basicItem(COPPER_NUGGET.get());
        basicItem(COPPER_PLATE.get());
        basicItem(COPPER_DUST.get());
        basicItem(GOLD_GEAR.get());
        basicItem(GOLD_PLATE.get());
        basicItem(GOLD_DUST.get());
        basicItem(DIAMOND_GEAR.get());
        basicItem(DIAMOND_PLATE.get());
        basicItem(DIAMOND_DUST.get());
        basicItem(IRON_GEAR.get());
        basicItem(IRON_PLATE.get());
        basicItem(IRON_DUST.get());
    }

    private void basicTool(Item item) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
        this.generatedModels.put(id, this.singleTexture(id.getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + id.getPath())));
    }
}
