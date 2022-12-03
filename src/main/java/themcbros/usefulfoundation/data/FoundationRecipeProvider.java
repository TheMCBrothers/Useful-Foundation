package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

import static themcbros.usefulfoundation.FoundationTags.Items.*;
import static themcbros.usefulfoundation.UsefulFoundation.getId;
import static themcbros.usefulfoundation.init.FoundationItems.*;

public class FoundationRecipeProvider extends RecipeProvider {
    public FoundationRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> recipe) {
        //Ingots
        ShapedRecipeBuilder.shaped(ALUMINUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ALUMINUM).unlockedBy("has_aluminum_nugget", has(NUGGETS_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(BRONZE_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_BRONZE).unlockedBy("has_bronze_nugget", has(NUGGETS_BRONZE)).save(recipe, getId("bronze_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(Items.COPPER_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_COPPER).unlockedBy("has_copper_nugget", has(NUGGETS_COPPER)).save(recipe, getId("copper_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(ELECTRUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ELECTRUM).unlockedBy("has_electrum_nugget", has(NUGGETS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(ENDERIUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ENDERIUM).unlockedBy("has_enderium_nugget", has(NUGGETS_ENDERIUM)).save(recipe, getId("enderium_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(INVAR_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_INVAR).unlockedBy("has_invar_nugget", has(NUGGETS_INVAR)).save(recipe, getId("invar_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(LEAD_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_LEAD).unlockedBy("has_lead_nugget", has(NUGGETS_LEAD)).save(recipe, getId("lead_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(NICKEL_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_NICKEL).unlockedBy("has_nickel_nugget", has(NUGGETS_NICKEL)).save(recipe, getId("nickel_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(PLATINUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_PLATINUM).unlockedBy("has_platinum_nugget", has(NUGGETS_PLATINUM)).save(recipe, getId("platinum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(SIGNALUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SIGNALUM).unlockedBy("has_signalum_nugget", has(NUGGETS_SIGNALUM)).save(recipe, getId("signalum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(SILVER_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SILVER).unlockedBy("has_silver_nugget", has(NUGGETS_SILVER)).save(recipe, getId("silver_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(STEEL_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_STEEL).unlockedBy("has_steel_nugget", has(NUGGETS_STEEL)).save(recipe, getId("steel_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(TIN_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_TIN).unlockedBy("has_tin_nugget", has(NUGGETS_TIN)).save(recipe, getId("tin_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(URANIUM_INGOT.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_URANIUM).unlockedBy("has_uranium_nugget", has(NUGGETS_URANIUM)).save(recipe, getId("uranium_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(ALUMINUM_INGOT.get(), 9).requires(BLOCKS_ALUMINUM).unlockedBy("has_aluminum_block", has(BLOCKS_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_aluminum_block"));
        ShapelessRecipeBuilder.shapeless(BRONZE_INGOT.get(), 9).requires(BLOCKS_BRONZE).unlockedBy("has_bronze_block", has(BLOCKS_BRONZE)).save(recipe, getId("bronze_ingot_from_bronze_block"));
        ShapelessRecipeBuilder.shapeless(ELECTRUM_INGOT.get(), 9).requires(BLOCKS_ELECTRUM).unlockedBy("has_electrum_block", has(BLOCKS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_electrum_block"));
        ShapelessRecipeBuilder.shapeless(ENDERIUM_INGOT.get(), 9).requires(BLOCKS_ENDERIUM).unlockedBy("has_enderium_block", has(BLOCKS_ENDERIUM)).save(recipe, getId("enderium_ingot_from_enderium_block"));
        ShapelessRecipeBuilder.shapeless(INVAR_INGOT.get(), 9).requires(BLOCKS_INVAR).unlockedBy("has_invar_block", has(BLOCKS_INVAR)).save(recipe, getId("invar_ingot_from_invar_block"));
        ShapelessRecipeBuilder.shapeless(LEAD_INGOT.get(), 9).requires(BLOCKS_LEAD).unlockedBy("has_lead_block", has(BLOCKS_LEAD)).save(recipe, getId("lead_ingot_from_lead_block"));
        ShapelessRecipeBuilder.shapeless(NICKEL_INGOT.get(), 9).requires(BLOCKS_NICKEL).unlockedBy("has_nickel_block", has(BLOCKS_NICKEL)).save(recipe, getId("nickel_ingot_from_nickel_block"));
        ShapelessRecipeBuilder.shapeless(PLATINUM_INGOT.get(), 9).requires(BLOCKS_PLATINUM).unlockedBy("has_platinum_block", has(BLOCKS_PLATINUM)).save(recipe, getId("platinum_ingot_from_platinum_block"));
        ShapelessRecipeBuilder.shapeless(SIGNALUM_INGOT.get(), 9).requires(BLOCKS_SIGNALUM).unlockedBy("has_silver_block", has(BLOCKS_SIGNALUM)).save(recipe, getId("signalum_ingot_from_signalum_block"));
        ShapelessRecipeBuilder.shapeless(SILVER_INGOT.get(), 9).requires(BLOCKS_SILVER).unlockedBy("has_silver_block", has(BLOCKS_SILVER)).save(recipe, getId("silver_ingot_from_silver_block"));
        ShapelessRecipeBuilder.shapeless(STEEL_INGOT.get(), 9).requires(BLOCKS_STEEL).unlockedBy("has_steel_block", has(BLOCKS_STEEL)).save(recipe, getId("steel_ingot_from_steel_block"));
        ShapelessRecipeBuilder.shapeless(TIN_INGOT.get(), 9).requires(BLOCKS_TIN).unlockedBy("has_tin_block", has(BLOCKS_TIN)).save(recipe, getId("tin_ingot_from_tin_block"));
        ShapelessRecipeBuilder.shapeless(URANIUM_INGOT.get(), 9).requires(BLOCKS_URANIUM).unlockedBy("has_uranium_block", has(BLOCKS_URANIUM)).save(recipe, getId("uranium_ingot_from_uranium_block"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_ALUMINUM), ALUMINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_smelting_raw_aluminum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_ALUMINUM), ALUMINUM_INGOT.get(), 0.7F, 50).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_blasting_raw_aluminum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_LEAD), LEAD_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, getId("lead_ingot_from_smelting_raw_lead"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_LEAD), LEAD_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, getId("lead_ingot_from_blasting_raw_lead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_NICKEL), NICKEL_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, getId("nickel_ingot_from_smelting_raw_nickel"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_NICKEL), NICKEL_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, getId("nickel_ingot_from_blasting_raw_nickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_PLATINUM), PLATINUM_INGOT.get(), 0.7F, 250).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe, getId("platinum_ingot_from_smelting_raw_platinum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_PLATINUM), PLATINUM_INGOT.get(), 0.7F, 150).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe, getId("platinum_ingot_from_blasting_raw_platinum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_SILVER), SILVER_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, getId("silver_ingot_from_smelting_raw_silver"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_SILVER), SILVER_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, getId("silver_ingot_from_blasting_raw_silver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_TIN), TIN_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, getId("tin_ingot_from_smelting_raw_tin"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_TIN), TIN_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, getId("tin_ingot_from_blasting_raw_tin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_URANIUM), URANIUM_INGOT.get(), 0.7F, 200).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, getId("uranium_ingot_from_smelting_raw_uranium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_URANIUM), URANIUM_INGOT.get(), 0.7F, 100).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, getId("uranium_ingot_from_blasting_raw_uranium"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_ALUMINUM), ALUMINUM_INGOT.get(), 0.7F, 200).unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_smelting_aluminum_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_ALUMINUM), ALUMINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(recipe, getId("aluminum_ingot_from_blasting_aluminum_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_LEAD), LEAD_INGOT.get(), 0.7F, 200).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, getId("lead_ingot_from_smelting_lead_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_LEAD), LEAD_INGOT.get(), 0.7F, 100).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, getId("lead_ingot_from_blasting_lead_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_NICKEL), NICKEL_INGOT.get(), 0.7F, 200).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, getId("nickel_ingot_from_smelting_nickel_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_NICKEL), NICKEL_INGOT.get(), 0.7F, 100).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, getId("nickel_ingot_from_blasting_nickel_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_PLATINUM), PLATINUM_INGOT.get(), 0.7F, 200).unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(recipe, getId("platinum_ingot_from_smelting_platinum_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_PLATINUM), PLATINUM_INGOT.get(), 0.7F, 100).unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(recipe, getId("platinum_ingot_from_blasting_platinum_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_SILVER), SILVER_INGOT.get(), 0.7F, 200).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, getId("silver_ingot_from_smelting_silver_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_SILVER), SILVER_INGOT.get(), 0.7F, 100).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, getId("silver_ingot_from_blasting_silver_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_TIN), TIN_INGOT.get(), 0.7F, 200).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, getId("tin_ingot_from_smelting_tin_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_TIN), TIN_INGOT.get(), 0.7F, 100).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, getId("tin_ingot_from_blasting_tin_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_URANIUM), URANIUM_INGOT.get(), 0.7F, 200).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, getId("uranium_ingot_from_smelting_uranium_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_URANIUM), URANIUM_INGOT.get(), 0.7F, 100).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, getId("uranium_ingot_from_blasting_uranium_ore"));

        //Raw Materials
        ShapelessRecipeBuilder.shapeless(RAW_ALUMINUM.get(), 9).requires(RAW_BLOCKS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_BLOCKS_ALUMINUM)).save(recipe, getId("raw_aluminum_from_raw_aluminum_block"));
        ShapelessRecipeBuilder.shapeless(RAW_LEAD.get(), 9).requires(RAW_BLOCKS_LEAD).unlockedBy("has_raw_lead", has(RAW_BLOCKS_LEAD)).save(recipe, getId("raw_lead_from_raw_lead_block"));
        ShapelessRecipeBuilder.shapeless(RAW_NICKEL.get(), 9).requires(RAW_BLOCKS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_BLOCKS_NICKEL)).save(recipe, getId("raw_nickel_from_raw_nickel_block"));
        ShapelessRecipeBuilder.shapeless(RAW_PLATINUM.get(), 9).requires(RAW_BLOCKS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_BLOCKS_PLATINUM)).save(recipe, getId("raw_platinum_from_raw_platinum_block"));
        ShapelessRecipeBuilder.shapeless(RAW_SILVER.get(), 9).requires(RAW_BLOCKS_SILVER).unlockedBy("has_raw_silver", has(RAW_BLOCKS_SILVER)).save(recipe, getId("raw_silver_from_raw_silver_block"));
        ShapelessRecipeBuilder.shapeless(RAW_TIN.get(), 9).requires(RAW_BLOCKS_TIN).unlockedBy("has_raw_tin", has(RAW_BLOCKS_TIN)).save(recipe, getId("raw_tin_from_raw_tin_block"));
        ShapelessRecipeBuilder.shapeless(RAW_URANIUM.get(), 9).requires(RAW_BLOCKS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_BLOCKS_URANIUM)).save(recipe, getId("raw_uranium_from_raw_uranium_block"));

        //Gears
        ShapedRecipeBuilder.shaped(ALUMINUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(BRONZE_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(COPPER_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_COPPER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapedRecipeBuilder.shaped(DIAMOND_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.GEMS_DIAMOND).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(recipe);
        ShapedRecipeBuilder.shaped(ELECTRUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(ENDERIUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapedRecipeBuilder.shaped(GOLD_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_GOLD).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapedRecipeBuilder.shaped(INVAR_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(IRON_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapedRecipeBuilder.shaped(LEAD_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(NICKEL_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(PLATINUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(SIGNALUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapedRecipeBuilder.shaped(SILVER_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(STEEL_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapedRecipeBuilder.shaped(TIN_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(URANIUM_GEAR.get()).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Plates
        ShapelessRecipeBuilder.shapeless(ALUMINUM_PLATE.get()).requires(INGOTS_ALUMINUM).requires(HAMMER.get()).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(BRONZE_PLATE.get()).requires(INGOTS_BRONZE).requires(HAMMER.get()).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(COPPER_PLATE.get()).requires(Tags.Items.INGOTS_COPPER).requires(HAMMER.get()).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(DIAMOND_PLATE.get()).requires(Tags.Items.GEMS_DIAMOND).requires(HAMMER.get()).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ELECTRUM_PLATE.get()).requires(INGOTS_ELECTRUM).requires(HAMMER.get()).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ENDERIUM_PLATE.get()).requires(INGOTS_ENDERIUM).requires(HAMMER.get()).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(GOLD_PLATE.get()).requires(Tags.Items.INGOTS_GOLD).requires(HAMMER.get()).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(INVAR_PLATE.get()).requires(INGOTS_INVAR).requires(HAMMER.get()).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(IRON_PLATE.get()).requires(Tags.Items.INGOTS_IRON).requires(HAMMER.get()).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapelessRecipeBuilder.shapeless(LEAD_PLATE.get()).requires(INGOTS_LEAD).requires(HAMMER.get()).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(NICKEL_PLATE.get()).requires(INGOTS_NICKEL).requires(HAMMER.get()).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(PLATINUM_PLATE.get()).requires(INGOTS_PLATINUM).requires(HAMMER.get()).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SIGNALUM_PLATE.get()).requires(INGOTS_SIGNALUM).requires(HAMMER.get()).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SILVER_PLATE.get()).requires(INGOTS_SILVER).requires(HAMMER.get()).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(STEEL_PLATE.get()).requires(INGOTS_STEEL).requires(HAMMER.get()).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(TIN_PLATE.get()).requires(INGOTS_TIN).requires(HAMMER.get()).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(URANIUM_PLATE.get()).requires(INGOTS_URANIUM).requires(HAMMER.get()).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Nuggets
        ShapelessRecipeBuilder.shapeless(ALUMINUM_NUGGET.get(), 9).requires(INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(BRONZE_NUGGET.get(), 9).requires(INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(COPPER_NUGGET.get(), 9).requires(Tags.Items.INGOTS_COPPER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ELECTRUM_NUGGET.get(), 9).requires(INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ENDERIUM_NUGGET.get(), 9).requires(INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(INVAR_NUGGET.get(), 9).requires(INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(LEAD_NUGGET.get(), 9).requires(INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(NICKEL_NUGGET.get(), 9).requires(INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(PLATINUM_NUGGET.get(), 9).requires(INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SIGNALUM_NUGGET.get(), 9).requires(INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SILVER_NUGGET.get(), 9).requires(INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(STEEL_NUGGET.get(), 9).requires(INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(TIN_NUGGET.get(), 9).requires(INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(URANIUM_NUGGET.get(), 9).requires(INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Dusts
        ShapelessRecipeBuilder.shapeless(BRONZE_DUST.get(), 4).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_TIN).unlockedBy("has_copper_dust", has(DUSTS_COPPER)).save(recipe, getId("bronze_dust_from_dust_mix"));
        ShapelessRecipeBuilder.shapeless(ELECTRUM_DUST.get(), 2).requires(DUSTS_GOLD).requires(DUSTS_SILVER).unlockedBy("has_silver_dust", has(DUSTS_SILVER)).save(recipe, getId("electrum_dust_from_dust_mix"));
        ShapelessRecipeBuilder.shapeless(INVAR_DUST.get(), 3).requires(DUSTS_IRON).requires(DUSTS_IRON).requires(DUSTS_NICKEL).unlockedBy("has_iron_dust", has(DUSTS_IRON)).save(recipe, getId("invar_dust_from_dust_mix"));

        //Storage Blocks
        ShapedRecipeBuilder.shaped(ALUMINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(BRONZE_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(ELECTRUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(ENDERIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(recipe);
        ShapedRecipeBuilder.shaped(INVAR_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(LEAD_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(NICKEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(PLATINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(SIGNALUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SIGNALUM).unlockedBy("has_silver_ingot", has(INGOTS_SIGNALUM)).save(recipe);
        ShapedRecipeBuilder.shaped(SILVER_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(STEEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(recipe);
        ShapedRecipeBuilder.shaped(TIN_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(URANIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Raw Storage Blocks
        ShapedRecipeBuilder.shaped(RAW_ALUMINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_LEAD_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_LEAD).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_NICKEL_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_PLATINUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_SILVER_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_SILVER).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_TIN_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_TIN).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_URANIUM_BLOCK.get()).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe);

        //Tools
        ShapedRecipeBuilder.shaped(HAMMER.get()).pattern(" X#").pattern(" RX").pattern("R  ").define('X', Tags.Items.INGOTS_IRON).define('#', Tags.Items.STRING).define('R', Tags.Items.RODS_WOODEN).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipe);
    }
}
