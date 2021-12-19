package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
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
        ShapedRecipeBuilder.shaped(BRONZE_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_BRONZE).unlockedBy("has_bronze_nugget", has(NUGGETS_BRONZE)).save(recipe, getId("bronze_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(Items.COPPER_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_COPPER).unlockedBy("has_copper_nugget", has(NUGGETS_COPPER)).save(recipe, getId("copper_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(ELECTRUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ELECTRUM).unlockedBy("has_electrum_nugget", has(NUGGETS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(INVAR_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_INVAR).unlockedBy("has_invar_nugget", has(NUGGETS_INVAR)).save(recipe, getId("invar_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(LEAD_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_LEAD).unlockedBy("has_lead_nugget", has(NUGGETS_LEAD)).save(recipe, getId("lead_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(NICKEL_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_NICKEL).unlockedBy("has_nickel_nugget", has(NUGGETS_NICKEL)).save(recipe, getId("nickel_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(SILVER_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SILVER).unlockedBy("has_silver_nugget", has(NUGGETS_SILVER)).save(recipe, getId("silver_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(TIN_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_TIN).unlockedBy("has_tin_nugget", has(NUGGETS_TIN)).save(recipe, getId("tin_ingot_from_nuggets"));
        ShapedRecipeBuilder.shaped(URANIUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_URANIUM).unlockedBy("has_uranium_nugget", has(NUGGETS_URANIUM)).save(recipe, getId("uranium_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(BRONZE_INGOT, 9).requires(BLOCKS_BRONZE).unlockedBy("has_bronze_block", has(BLOCKS_BRONZE)).save(recipe, getId("bronze_ingot_from_bronze_block"));
        ShapelessRecipeBuilder.shapeless(ELECTRUM_INGOT, 9).requires(BLOCKS_ELECTRUM).unlockedBy("has_electrum_block", has(BLOCKS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_electrum_block"));
        ShapelessRecipeBuilder.shapeless(INVAR_INGOT, 9).requires(BLOCKS_INVAR).unlockedBy("has_invar_block", has(BLOCKS_INVAR)).save(recipe, getId("invar_ingot_from_invar_block"));
        ShapelessRecipeBuilder.shapeless(LEAD_INGOT, 9).requires(BLOCKS_LEAD).unlockedBy("has_lead_block", has(BLOCKS_LEAD)).save(recipe, getId("lead_ingot_from_lead_block"));
        ShapelessRecipeBuilder.shapeless(NICKEL_INGOT, 9).requires(BLOCKS_NICKEL).unlockedBy("has_nickel_block", has(BLOCKS_NICKEL)).save(recipe, getId("nickel_ingot_from_nickel_block"));
        ShapelessRecipeBuilder.shapeless(SILVER_INGOT, 9).requires(BLOCKS_SILVER).unlockedBy("has_silver_block", has(BLOCKS_SILVER)).save(recipe, getId("silver_ingot_from_silver_block"));
        ShapelessRecipeBuilder.shapeless(TIN_INGOT, 9).requires(BLOCKS_TIN).unlockedBy("has_tin_block", has(BLOCKS_TIN)).save(recipe, getId("tin_ingot_from_tin_block"));
        ShapelessRecipeBuilder.shapeless(URANIUM_INGOT, 9).requires(BLOCKS_URANIUM).unlockedBy("has_uranium_block", has(BLOCKS_URANIUM)).save(recipe, getId("uranium_ingot_from_uranium_block"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_BRONZE), BRONZE_INGOT, 0.7F, 200).unlockedBy("has_raw_bronze", has(RAW_MATERIALS_BRONZE)).save(recipe, getId("bronze_ingot_from_smelting_raw_bronze"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_BRONZE), BRONZE_INGOT, 0.7F, 100).unlockedBy("has_raw_bronze", has(RAW_MATERIALS_BRONZE)).save(recipe, getId("bronze_ingot_from_blasting_raw_bronze"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_ELECTRUM), ELECTRUM_INGOT, 0.7F, 200).unlockedBy("has_raw_electrum", has(RAW_MATERIALS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_smelting_raw_electrum"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_ELECTRUM), ELECTRUM_INGOT, 0.7F, 100).unlockedBy("has_raw_electrum", has(RAW_MATERIALS_ELECTRUM)).save(recipe, getId("electrum_ingot_from_blasting_raw_electrum"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_INVAR), INVAR_INGOT, 0.7F, 200).unlockedBy("has_raw_invar", has(RAW_MATERIALS_INVAR)).save(recipe, getId("invar_ingot_from_smelting_raw_invar"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_INVAR), INVAR_INGOT, 0.7F, 100).unlockedBy("has_raw_invar", has(RAW_MATERIALS_INVAR)).save(recipe, getId("invar_ingot_from_blasting_raw_invar"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_LEAD), LEAD_INGOT, 0.7F, 200).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, getId("lead_ingot_from_smelting_raw_lead"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_LEAD), LEAD_INGOT, 0.7F, 100).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(recipe, getId("lead_ingot_from_blasting_raw_lead"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_NICKEL), NICKEL_INGOT, 0.7F, 200).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, getId("nickel_ingot_from_smelting_raw_nickel"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_NICKEL), NICKEL_INGOT, 0.7F, 100).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(recipe, getId("nickel_ingot_from_blasting_raw_nickel"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_SILVER), SILVER_INGOT, 0.7F, 200).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, getId("silver_ingot_from_smelting_raw_silver"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_SILVER), SILVER_INGOT, 0.7F, 100).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe, getId("silver_ingot_from_blasting_raw_silver"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_TIN), TIN_INGOT, 0.7F, 200).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, getId("tin_ingot_from_smelting_raw_tin"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_TIN), TIN_INGOT, 0.7F, 100).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(recipe, getId("tin_ingot_from_blasting_raw_tin"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_MATERIALS_URANIUM), URANIUM_INGOT, 0.7F, 200).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, getId("uranium_ingot_from_smelting_raw_uranium"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_MATERIALS_URANIUM), URANIUM_INGOT, 0.7F, 100).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(recipe, getId("uranium_ingot_from_blasting_raw_uranium"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_LEAD), LEAD_INGOT, 0.7F, 200).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, getId("lead_ingot_from_smelting_lead_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_LEAD), LEAD_INGOT, 0.7F, 100).unlockedBy("has_lead_ore", has(ORES_LEAD)).save(recipe, getId("lead_ingot_from_blasting_lead_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_NICKEL), NICKEL_INGOT, 0.7F, 200).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, getId("nickel_ingot_from_smelting_nickel_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_NICKEL), NICKEL_INGOT, 0.7F, 100).unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(recipe, getId("nickel_ingot_from_blasting_nickel_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_SILVER), SILVER_INGOT, 0.7F, 200).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, getId("silver_ingot_from_smelting_silver_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_SILVER), SILVER_INGOT, 0.7F, 100).unlockedBy("has_silver_ore", has(ORES_SILVER)).save(recipe, getId("silver_ingot_from_blasting_silver_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_TIN), TIN_INGOT, 0.7F, 200).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, getId("tin_ingot_from_smelting_tin_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_TIN), TIN_INGOT, 0.7F, 100).unlockedBy("has_tin_ore", has(ORES_TIN)).save(recipe, getId("tin_ingot_from_blasting_tin_ore"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ORES_URANIUM), URANIUM_INGOT, 0.7F, 200).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, getId("uranium_ingot_from_smelting_uranium_ore"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ORES_URANIUM), URANIUM_INGOT, 0.7F, 100).unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(recipe, getId("uranium_ingot_from_blasting_uranium_ore"));

        //Raw Materials
        ShapelessRecipeBuilder.shapeless(RAW_BRONZE, 4).requires(RAW_MATERIALS_COPPER).requires(RAW_MATERIALS_COPPER).requires(RAW_MATERIALS_COPPER).requires(RAW_MATERIALS_TIN).unlockedBy("has_raw_copper", has(RAW_MATERIALS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RAW_ELECTRUM, 2).requires(RAW_MATERIALS_GOLD).requires(RAW_MATERIALS_SILVER).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(RAW_INVAR, 3).requires(RAW_MATERIALS_IRON).requires(RAW_MATERIALS_IRON).requires(RAW_MATERIALS_NICKEL).unlockedBy("has_raw_iron", has(RAW_MATERIALS_IRON)).save(recipe);

        ShapelessRecipeBuilder.shapeless(RAW_BRONZE, 9).requires(RAW_BLOCKS_BRONZE).unlockedBy("has_raw_bronze", has(RAW_BLOCKS_BRONZE)).save(recipe, getId("raw_bronze_from_raw_bronze_block"));
        ShapelessRecipeBuilder.shapeless(RAW_ELECTRUM, 9).requires(RAW_BLOCKS_ELECTRUM).unlockedBy("has_raw_electrum", has(RAW_BLOCKS_ELECTRUM)).save(recipe, getId("raw_electrum_from_raw_electrum_block"));
        ShapelessRecipeBuilder.shapeless(RAW_INVAR, 9).requires(RAW_BLOCKS_INVAR).unlockedBy("has_raw_invar", has(RAW_BLOCKS_INVAR)).save(recipe, getId("raw_invar_from_raw_invar_block"));
        ShapelessRecipeBuilder.shapeless(RAW_LEAD, 9).requires(RAW_BLOCKS_LEAD).unlockedBy("has_raw_lead", has(RAW_BLOCKS_LEAD)).save(recipe, getId("raw_lead_from_raw_lead_block"));
        ShapelessRecipeBuilder.shapeless(RAW_NICKEL, 9).requires(RAW_BLOCKS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_BLOCKS_NICKEL)).save(recipe, getId("raw_nickel_from_raw_nickel_block"));
        ShapelessRecipeBuilder.shapeless(RAW_SILVER, 9).requires(RAW_BLOCKS_SILVER).unlockedBy("has_raw_silver", has(RAW_BLOCKS_SILVER)).save(recipe, getId("raw_silver_from_raw_silver_block"));
        ShapelessRecipeBuilder.shapeless(RAW_TIN, 9).requires(RAW_BLOCKS_TIN).unlockedBy("has_raw_tin", has(RAW_BLOCKS_TIN)).save(recipe, getId("raw_tin_from_raw_tin_block"));
        ShapelessRecipeBuilder.shapeless(RAW_URANIUM, 9).requires(RAW_BLOCKS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_BLOCKS_URANIUM)).save(recipe, getId("raw_uranium_from_raw_uranium_block"));

        //Gears
        ShapedRecipeBuilder.shaped(BRONZE_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(COPPER_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_COPPER).unlockedBy("has_copper_ingot", has(INGOTS_COPPER)).save(recipe);
        ShapedRecipeBuilder.shaped(ELECTRUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(GOLD_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_GOLD).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapedRecipeBuilder.shaped(INVAR_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(IRON_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapedRecipeBuilder.shaped(LEAD_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(NICKEL_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(SILVER_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(TIN_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(URANIUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Plates
        ShapelessRecipeBuilder.shapeless(BRONZE_PLATE).requires(INGOTS_BRONZE).requires(HAMMER).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(COPPER_PLATE).requires(INGOTS_COPPER).requires(HAMMER).unlockedBy("has_copper_ingot", has(INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ELECTRUM_PLATE).requires(INGOTS_ELECTRUM).requires(HAMMER).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(GOLD_PLATE).requires(Tags.Items.INGOTS_GOLD).requires(HAMMER).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(INVAR_PLATE).requires(INGOTS_INVAR).requires(HAMMER).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(IRON_PLATE).requires(Tags.Items.INGOTS_IRON).requires(HAMMER).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(recipe);
        ShapelessRecipeBuilder.shapeless(LEAD_PLATE).requires(INGOTS_LEAD).requires(HAMMER).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(NICKEL_PLATE).requires(INGOTS_NICKEL).requires(HAMMER).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SILVER_PLATE).requires(INGOTS_SILVER).requires(HAMMER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(TIN_PLATE).requires(INGOTS_TIN).requires(HAMMER).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(URANIUM_PLATE).requires(INGOTS_URANIUM).requires(HAMMER).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Nuggets
        ShapelessRecipeBuilder.shapeless(BRONZE_NUGGET, 9).requires(INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapelessRecipeBuilder.shapeless(COPPER_NUGGET, 9).requires(INGOTS_COPPER).unlockedBy("has_copper_ingot", has(INGOTS_COPPER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(ELECTRUM_NUGGET, 9).requires(INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapelessRecipeBuilder.shapeless(INVAR_NUGGET, 9).requires(INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapelessRecipeBuilder.shapeless(LEAD_NUGGET, 9).requires(INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapelessRecipeBuilder.shapeless(NICKEL_NUGGET, 9).requires(INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapelessRecipeBuilder.shapeless(SILVER_NUGGET, 9).requires(INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapelessRecipeBuilder.shapeless(TIN_NUGGET, 9).requires(INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapelessRecipeBuilder.shapeless(URANIUM_NUGGET, 9).requires(INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Storage Blocks
        ShapedRecipeBuilder.shaped(BRONZE_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(Items.COPPER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_COPPER).unlockedBy("has_copper_ingot", has(INGOTS_COPPER)).save(recipe);
        ShapedRecipeBuilder.shaped(ELECTRUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(INVAR_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(LEAD_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(NICKEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(SILVER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(TIN_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(URANIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Raw Storage Blocks
        ShapedRecipeBuilder.shaped(RAW_BRONZE_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_BRONZE).unlockedBy("has_raw_bronze", has(RAW_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_ELECTRUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_ELECTRUM).unlockedBy("has_raw_electrum", has(RAW_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_INVAR_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_INVAR).unlockedBy("has_raw_invar", has(RAW_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_LEAD_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_LEAD).unlockedBy("has_raw_lead", has(RAW_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_NICKEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_NICKEL).unlockedBy("has_raw_nickel", has(RAW_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_SILVER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_SILVER).unlockedBy("has_raw_silver", has(RAW_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_TIN_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_TIN).unlockedBy("has_raw_tin", has(RAW_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(RAW_URANIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_URANIUM).unlockedBy("has_raw_uranium", has(RAW_URANIUM)).save(recipe);

        //Tools
        ShapedRecipeBuilder.shaped(HAMMER).pattern(" X#").pattern(" RX").pattern("R  ").define('X', Tags.Items.INGOTS_IRON).define('#', Tags.Items.STRING).define('R', Tags.Items.RODS_WOODEN).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipe);
    }
}
