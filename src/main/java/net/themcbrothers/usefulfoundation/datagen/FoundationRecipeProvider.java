package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import static net.minecraft.world.item.Items.*;
import static net.themcbrothers.usefulfoundation.UsefulFoundation.rl;
import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;
import static net.themcbrothers.usefulfoundation.core.FoundationItems.*;
import static net.themcbrothers.usefulfoundation.core.FoundationTags.Items.*;

public class FoundationRecipeProvider extends RecipeProvider {
    public FoundationRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipe) {
        // Ingots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ALUMINUM).unlockedBy("has_aluminum_nugget", has(NUGGETS_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BRONZE_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_BRONZE).unlockedBy("has_bronze_nugget", has(NUGGETS_BRONZE)).save(recipe, rl("bronze_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COPPER_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_COPPER).unlockedBy("has_copper_nugget", has(NUGGETS_COPPER)).save(recipe, rl("copper_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ELECTRUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ELECTRUM).unlockedBy("has_electrum_nugget", has(NUGGETS_ELECTRUM)).save(recipe, rl("electrum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ENDERIUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ENDERIUM).unlockedBy("has_enderium_nugget", has(NUGGETS_ENDERIUM)).save(recipe, rl("enderium_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, INVAR_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_INVAR).unlockedBy("has_invar_nugget", has(NUGGETS_INVAR)).save(recipe, rl("invar_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LEAD_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_LEAD).unlockedBy("has_lead_nugget", has(NUGGETS_LEAD)).save(recipe, rl("lead_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NICKEL_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_NICKEL).unlockedBy("has_nickel_nugget", has(NUGGETS_NICKEL)).save(recipe, rl("nickel_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PLATINUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_PLATINUM).unlockedBy("has_platinum_nugget", has(NUGGETS_PLATINUM)).save(recipe, rl("platinum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SIGNALUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SIGNALUM).unlockedBy("has_signalum_nugget", has(NUGGETS_SIGNALUM)).save(recipe, rl("signalum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SILVER_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SILVER).unlockedBy("has_silver_nugget", has(NUGGETS_SILVER)).save(recipe, rl("silver_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, STEEL_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_STEEL).unlockedBy("has_steel_nugget", has(NUGGETS_STEEL)).save(recipe, rl("steel_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TIN_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_TIN).unlockedBy("has_tin_nugget", has(NUGGETS_TIN)).save(recipe, rl("tin_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, URANIUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_URANIUM).unlockedBy("has_uranium_nugget", has(NUGGETS_URANIUM)).save(recipe, rl("uranium_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ALUMINUM_INGOT.get(), 9).requires(BLOCKS_ALUMINUM).unlockedBy("has_aluminum_block", has(BLOCKS_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_aluminum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BRONZE_INGOT.get(), 9).requires(BLOCKS_BRONZE).unlockedBy("has_bronze_block", has(BLOCKS_BRONZE)).save(recipe, rl("bronze_ingot_from_bronze_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ELECTRUM_INGOT.get(), 9).requires(BLOCKS_ELECTRUM).unlockedBy("has_electrum_block", has(BLOCKS_ELECTRUM)).save(recipe, rl("electrum_ingot_from_electrum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ENDERIUM_INGOT.get(), 9).requires(BLOCKS_ENDERIUM).unlockedBy("has_enderium_block", has(BLOCKS_ENDERIUM)).save(recipe, rl("enderium_ingot_from_enderium_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, INVAR_INGOT.get(), 9).requires(BLOCKS_INVAR).unlockedBy("has_invar_block", has(BLOCKS_INVAR)).save(recipe, rl("invar_ingot_from_invar_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, LEAD_INGOT.get(), 9).requires(BLOCKS_LEAD).unlockedBy("has_lead_block", has(BLOCKS_LEAD)).save(recipe, rl("lead_ingot_from_lead_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NICKEL_INGOT.get(), 9).requires(BLOCKS_NICKEL).unlockedBy("has_nickel_block", has(BLOCKS_NICKEL)).save(recipe, rl("nickel_ingot_from_nickel_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PLATINUM_INGOT.get(), 9).requires(BLOCKS_PLATINUM).unlockedBy("has_platinum_block", has(BLOCKS_PLATINUM)).save(recipe, rl("platinum_ingot_from_platinum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SIGNALUM_INGOT.get(), 9).requires(BLOCKS_SIGNALUM).unlockedBy("has_silver_block", has(BLOCKS_SIGNALUM)).save(recipe, rl("signalum_ingot_from_signalum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SILVER_INGOT.get(), 9).requires(BLOCKS_SILVER).unlockedBy("has_silver_block", has(BLOCKS_SILVER)).save(recipe, rl("silver_ingot_from_silver_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_INGOT.get(), 9).requires(BLOCKS_STEEL).unlockedBy("has_steel_block", has(BLOCKS_STEEL)).save(recipe, rl("steel_ingot_from_steel_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TIN_INGOT.get(), 9).requires(BLOCKS_TIN).unlockedBy("has_tin_block", has(BLOCKS_TIN)).save(recipe, rl("tin_ingot_from_tin_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, URANIUM_INGOT.get(), 9).requires(BLOCKS_URANIUM).unlockedBy("has_uranium_block", has(BLOCKS_URANIUM)).save(recipe, rl("uranium_ingot_from_uranium_block"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_ALUMINUM), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_smelting_raw_aluminum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_ALUMINUM), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.7F, 50).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_blasting_raw_aluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_LEAD), RecipeCategory.MISC, LEAD_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, rl("lead_ingot_from_smelting_raw_lead"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_LEAD), RecipeCategory.MISC, LEAD_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, rl("lead_ingot_from_blasting_raw_lead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_NICKEL), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, rl("nickel_ingot_from_smelting_raw_nickel"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_NICKEL), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, rl("nickel_ingot_from_blasting_raw_nickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_PLATINUM), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.7F, 250).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe, rl("platinum_ingot_from_smelting_raw_platinum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_PLATINUM), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.7F, 150).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe, rl("platinum_ingot_from_blasting_raw_platinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_SILVER), RecipeCategory.MISC, SILVER_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, rl("silver_ingot_from_smelting_raw_silver"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_SILVER), RecipeCategory.MISC, SILVER_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, rl("silver_ingot_from_blasting_raw_silver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_TIN), RecipeCategory.MISC, TIN_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, rl("tin_ingot_from_smelting_raw_tin"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_TIN), RecipeCategory.MISC, TIN_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, rl("tin_ingot_from_blasting_raw_tin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_URANIUM), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, rl("uranium_ingot_from_smelting_raw_uranium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_URANIUM), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, rl("uranium_ingot_from_blasting_raw_uranium"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_ALUMINUM), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.7F, 200).unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_smelting_aluminum_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_ALUMINUM), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(recipe, rl("aluminum_ingot_from_blasting_aluminum_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_LEAD), RecipeCategory.MISC, LEAD_INGOT.get(), 0.7F, 200).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, rl("lead_ingot_from_smelting_lead_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_LEAD), RecipeCategory.MISC, LEAD_INGOT.get(), 0.7F, 100).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, rl("lead_ingot_from_blasting_lead_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_NICKEL), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 200).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, rl("nickel_ingot_from_smelting_nickel_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_NICKEL), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 100).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, rl("nickel_ingot_from_blasting_nickel_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_PLATINUM), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.7F, 200).unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(recipe, rl("platinum_ingot_from_smelting_platinum_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_PLATINUM), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(recipe, rl("platinum_ingot_from_blasting_platinum_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_SILVER), RecipeCategory.MISC, SILVER_INGOT.get(), 0.7F, 200).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, rl("silver_ingot_from_smelting_silver_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_SILVER), RecipeCategory.MISC, SILVER_INGOT.get(), 0.7F, 100).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, rl("silver_ingot_from_blasting_silver_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_TIN), RecipeCategory.MISC, TIN_INGOT.get(), 0.7F, 200).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, rl("tin_ingot_from_smelting_tin_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_TIN), RecipeCategory.MISC, TIN_INGOT.get(), 0.7F, 100).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, rl("tin_ingot_from_blasting_tin_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_URANIUM), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.7F, 200).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, rl("uranium_ingot_from_smelting_uranium_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_URANIUM), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.7F, 100).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, rl("uranium_ingot_from_blasting_uranium_ore"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ALUMINUM_DUST), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.3F, 200).unlockedBy("has_aluminum_dust", has(ALUMINUM_DUST)).save(recipe, rl("aluminum_ingot_from_smelting_aluminum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ALUMINUM_DUST), RecipeCategory.MISC, ALUMINUM_INGOT.get(), 0.3F, 100).unlockedBy("has_aluminum_dust", has(ALUMINUM_DUST)).save(recipe, rl("aluminum_ingot_from_blasting_aluminum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BRONZE_DUST), RecipeCategory.MISC, BRONZE_INGOT.get(), 0.3F, 200).unlockedBy("has_bronze_dust", has(BRONZE_INGOT)).save(recipe, rl("bronze_ingot_from_smelting_bronze_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BRONZE_DUST), RecipeCategory.MISC, BRONZE_INGOT.get(), 0.3F, 100).unlockedBy("has_bronze_dust", has(BRONZE_INGOT)).save(recipe, rl("bronze_ingot_from_blasting_bronze_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COPPER_DUST), RecipeCategory.MISC, COPPER_INGOT, 0.3F, 200).unlockedBy("has_copper_dust", has(COPPER_INGOT)).save(recipe, rl("copper_ingot_from_smelting_copper_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(COPPER_DUST), RecipeCategory.MISC, COPPER_INGOT, 0.3F, 100).unlockedBy("has_copper_dust", has(COPPER_INGOT)).save(recipe, rl("copper_ingot_from_blasting_copper_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DIAMOND_DUST), RecipeCategory.MISC, DIAMOND, 0.3F, 200).unlockedBy("has_diamond_dust", has(DIAMOND)).save(recipe, rl("diamond_from_smelting_diamond_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(DIAMOND_DUST), RecipeCategory.MISC, DIAMOND, 0.3F, 100).unlockedBy("has_diamond_dust", has(DIAMOND)).save(recipe, rl("diamond_from_blasting_diamond_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ELECTRUM_DUST), RecipeCategory.MISC, ELECTRUM_INGOT, 0.3F, 200).unlockedBy("has_electrum_dust", has(ELECTRUM_INGOT)).save(recipe, rl("electrum_ingot_from_smelting_electrum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ELECTRUM_DUST), RecipeCategory.MISC, ELECTRUM_INGOT, 0.3F, 100).unlockedBy("has_electrum_dust", has(ELECTRUM_INGOT)).save(recipe, rl("electrum_ingot_from_blasting_electrum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ENDERIUM_DUST), RecipeCategory.MISC, ENDERIUM_INGOT, 0.3F, 200).unlockedBy("has_enderium_dust", has(ENDERIUM_INGOT)).save(recipe, rl("enderium_ingot_from_smelting_enderium_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ENDERIUM_DUST), RecipeCategory.MISC, ENDERIUM_INGOT, 0.3F, 100).unlockedBy("has_enderium_dust", has(ENDERIUM_INGOT)).save(recipe, rl("enderium_ingot_from_blasting_enderium_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GOLD_DUST), RecipeCategory.MISC, GOLD_INGOT, 0.3F, 200).unlockedBy("has_gold_dust", has(GOLD_INGOT)).save(recipe, rl("gold_ingot_from_smelting_gold_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GOLD_DUST), RecipeCategory.MISC, GOLD_INGOT, 0.3F, 100).unlockedBy("has_gold_dust", has(GOLD_INGOT)).save(recipe, rl("gold_ingot_from_blasting_gold_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(INVAR_DUST), RecipeCategory.MISC, INVAR_INGOT, 0.3F, 200).unlockedBy("has_invar_dust", has(INVAR_INGOT)).save(recipe, rl("invar_ingot_from_smelting_invar_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(INVAR_DUST), RecipeCategory.MISC, INVAR_INGOT, 0.3F, 100).unlockedBy("has_invar_dust", has(INVAR_INGOT)).save(recipe, rl("invar_ingot_from_blasting_invar_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(IRON_DUST), RecipeCategory.MISC, IRON_INGOT, 0.3F, 200).unlockedBy("has_iron_dust", has(IRON_INGOT)).save(recipe, rl("iron_ingot_from_smelting_iron_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(IRON_DUST), RecipeCategory.MISC, IRON_INGOT, 0.3F, 100).unlockedBy("has_iron_dust", has(IRON_INGOT)).save(recipe, rl("iron_ingot_from_blasting_iron_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(LEAD_DUST), RecipeCategory.MISC, LEAD_INGOT.get(), 0.3F, 200).unlockedBy("has_lead_dust", has(LEAD_DUST)).save(recipe, rl("lead_ingot_from_smelting_lead_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(LEAD_DUST), RecipeCategory.MISC, LEAD_INGOT.get(), 0.3F, 100).unlockedBy("has_lead_dust", has(LEAD_DUST)).save(recipe, rl("lead_ingot_from_blasting_lead_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NICKEL_DUST), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.3F, 200).unlockedBy("has_nickel_dust", has(NICKEL_DUST)).save(recipe, rl("nickel_ingot_from_smelting_nickel_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NICKEL_DUST), RecipeCategory.MISC, NICKEL_INGOT.get(), 0.3F, 100).unlockedBy("has_nickel_dust", has(NICKEL_DUST)).save(recipe, rl("nickel_ingot_from_blasting_nickel_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(PLATINUM_DUST), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.3F, 200).unlockedBy("has_platinum_dust", has(PLATINUM_DUST)).save(recipe, rl("platinum_ingot_from_smelting_platinum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(PLATINUM_DUST), RecipeCategory.MISC, PLATINUM_INGOT.get(), 0.3F, 100).unlockedBy("has_platinum_dust", has(PLATINUM_DUST)).save(recipe, rl("platinum_ingot_from_blasting_platinum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SIGNALUM_DUST), RecipeCategory.MISC, SIGNALUM_INGOT.get(), 0.3F, 200).unlockedBy("has_signalum_dust", has(SIGNALUM_DUST)).save(recipe, rl("signalum_ingot_from_smelting_signalum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SIGNALUM_DUST), RecipeCategory.MISC, SIGNALUM_INGOT.get(), 0.3F, 100).unlockedBy("has_signalum_dust", has(SIGNALUM_DUST)).save(recipe, rl("signalum_ingot_from_blasting_signalum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SILVER_DUST), RecipeCategory.MISC, SILVER_INGOT.get(), 0.3F, 200).unlockedBy("has_silver_dust", has(SILVER_DUST)).save(recipe, rl("silver_ingot_from_smelting_silver_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SILVER_DUST), RecipeCategory.MISC, SILVER_INGOT.get(), 0.3F, 100).unlockedBy("has_silver_dust", has(SILVER_DUST)).save(recipe, rl("silver_ingot_from_blasting_silver_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(STEEL_DUST), RecipeCategory.MISC, STEEL_INGOT.get(), 0.3F, 200).unlockedBy("has_steel_dust", has(STEEL_DUST)).save(recipe, rl("steel_ingot_from_smelting_steel_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(STEEL_DUST), RecipeCategory.MISC, STEEL_INGOT.get(), 0.3F, 100).unlockedBy("has_steel_dust", has(STEEL_DUST)).save(recipe, rl("steel_ingot_from_blasting_steel_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(TIN_DUST), RecipeCategory.MISC, TIN_INGOT.get(), 0.3F, 200).unlockedBy("has_tin_dust", has(TIN_DUST)).save(recipe, rl("tin_ingot_from_smelting_tin_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(TIN_DUST), RecipeCategory.MISC, TIN_INGOT.get(), 0.3F, 100).unlockedBy("has_tin_dust", has(TIN_DUST)).save(recipe, rl("tin_ingot_from_blasting_tin_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(URANIUM_DUST), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.3F, 200).unlockedBy("has_uranium_dust", has(URANIUM_DUST)).save(recipe, rl("uranium_ingot_from_smelting_uranium_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(URANIUM_DUST), RecipeCategory.MISC, URANIUM_INGOT.get(), 0.3F, 100).unlockedBy("has_uranium_dust", has(URANIUM_DUST)).save(recipe, rl("uranium_ingot_from_blasting_uranium_dust"));

        // Raw Materials
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_ALUMINUM.get(), 9).requires(RAW_BLOCKS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_BLOCKS_ALUMINUM)).save(recipe, rl("raw_aluminum_from_raw_aluminum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_LEAD.get(), 9).requires(RAW_BLOCKS_LEAD).unlockedBy("has_raw_lead", has(RAW_BLOCKS_LEAD)).save(recipe, rl("raw_lead_from_raw_lead_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_NICKEL.get(), 9).requires(RAW_BLOCKS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_BLOCKS_NICKEL)).save(recipe, rl("raw_nickel_from_raw_nickel_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_PLATINUM.get(), 9).requires(RAW_BLOCKS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_BLOCKS_PLATINUM)).save(recipe, rl("raw_platinum_from_raw_platinum_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_SILVER.get(), 9).requires(RAW_BLOCKS_SILVER).unlockedBy("has_raw_silver", has(RAW_BLOCKS_SILVER)).save(recipe, rl("raw_silver_from_raw_silver_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_TIN.get(), 9).requires(RAW_BLOCKS_TIN).unlockedBy("has_raw_tin", has(RAW_BLOCKS_TIN)).save(recipe, rl("raw_tin_from_raw_tin_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_URANIUM.get(), 9).requires(RAW_BLOCKS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_BLOCKS_URANIUM)).save(recipe, rl("raw_uranium_from_raw_uranium_block"));

        // Gears
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BRONZE_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COPPER_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_COPPER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, DIAMOND_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.GEMS_DIAMOND).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ELECTRUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ENDERIUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GOLD_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_GOLD).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, INVAR_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, IRON_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LEAD_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NICKEL_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PLATINUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SIGNALUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SILVER_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, STEEL_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TIN_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, URANIUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        // Plates
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ALUMINUM_PLATE.get()).requires(INGOTS_ALUMINUM).requires(HAMMER.get()).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BRONZE_PLATE.get()).requires(INGOTS_BRONZE).requires(HAMMER.get()).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPPER_PLATE.get()).requires(Tags.Items.INGOTS_COPPER).requires(HAMMER.get()).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DIAMOND_PLATE.get()).requires(Tags.Items.GEMS_DIAMOND).requires(HAMMER.get()).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ELECTRUM_PLATE.get()).requires(INGOTS_ELECTRUM).requires(HAMMER.get()).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ENDERIUM_PLATE.get()).requires(INGOTS_ENDERIUM).requires(HAMMER.get()).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GOLD_PLATE.get()).requires(Tags.Items.INGOTS_GOLD).requires(HAMMER.get()).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, INVAR_PLATE.get()).requires(INGOTS_INVAR).requires(HAMMER.get()).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IRON_PLATE.get()).requires(Tags.Items.INGOTS_IRON).requires(HAMMER.get()).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, LEAD_PLATE.get()).requires(INGOTS_LEAD).requires(HAMMER.get()).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NICKEL_PLATE.get()).requires(INGOTS_NICKEL).requires(HAMMER.get()).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PLATINUM_PLATE.get()).requires(INGOTS_PLATINUM).requires(HAMMER.get()).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SIGNALUM_PLATE.get()).requires(INGOTS_SIGNALUM).requires(HAMMER.get()).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SILVER_PLATE.get()).requires(INGOTS_SILVER).requires(HAMMER.get()).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_PLATE.get()).requires(INGOTS_STEEL).requires(HAMMER.get()).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TIN_PLATE.get()).requires(INGOTS_TIN).requires(HAMMER.get()).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, URANIUM_PLATE.get()).requires(INGOTS_URANIUM).requires(HAMMER.get()).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        // Nuggets
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ALUMINUM_NUGGET.get(), 9).requires(INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BRONZE_NUGGET.get(), 9).requires(INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, COPPER_NUGGET.get(), 9).requires(Tags.Items.INGOTS_COPPER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ELECTRUM_NUGGET.get(), 9).requires(INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ENDERIUM_NUGGET.get(), 9).requires(INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, INVAR_NUGGET.get(), 9).requires(INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, LEAD_NUGGET.get(), 9).requires(INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NICKEL_NUGGET.get(), 9).requires(INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, PLATINUM_NUGGET.get(), 9).requires(INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SIGNALUM_NUGGET.get(), 9).requires(INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SILVER_NUGGET.get(), 9).requires(INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_NUGGET.get(), 9).requires(INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TIN_NUGGET.get(), 9).requires(INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, URANIUM_NUGGET.get(), 9).requires(INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        // Dusts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BRONZE_DUST.get(), 4).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_TIN).unlockedBy("has_copper_dust", has(DUSTS_COPPER)).save(recipe, rl("bronze_dust_from_dust_mix"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ELECTRUM_DUST.get(), 2).requires(DUSTS_GOLD).requires(DUSTS_SILVER).unlockedBy("has_silver_dust", has(DUSTS_SILVER)).save(recipe, rl("electrum_dust_from_dust_mix"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, INVAR_DUST.get(), 3).requires(DUSTS_IRON).requires(DUSTS_IRON).requires(DUSTS_NICKEL).unlockedBy("has_iron_dust", has(DUSTS_IRON)).save(recipe, rl("invar_dust_from_dust_mix"));

        // Storage Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BRONZE_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ELECTRUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ENDERIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, INVAR_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, LEAD_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NICKEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PLATINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SIGNALUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SIGNALUM).unlockedBy("has_silver_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SILVER_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, STEEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TIN_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, URANIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        // Raw Storage Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_ALUMINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_LEAD_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_LEAD).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_NICKEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_PLATINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_SILVER_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_SILVER).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_TIN_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_TIN).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_URANIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe);

        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HAMMER.get()).pattern(" X#").pattern(" RX").pattern("R  ").define('X', Tags.Items.INGOTS_IRON).define('#', Tags.Items.STRING).define('R', Tags.Items.RODS_WOODEN).unlockedBy("has_iron_ingot", has(IRON_INGOT)).save(recipe);
    }
}
