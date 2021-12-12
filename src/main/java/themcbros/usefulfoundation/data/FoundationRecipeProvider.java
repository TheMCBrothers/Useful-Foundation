package themcbros.usefulfoundation.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
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

        //Blocks
        ShapedRecipeBuilder.shaped(BRONZE_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(recipe);
        ShapedRecipeBuilder.shaped(Items.COPPER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_COPPER).unlockedBy("has_copper_ingot", has(INGOTS_COPPER)).save(recipe);
        ShapedRecipeBuilder.shaped(ELECTRUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(recipe);
        ShapedRecipeBuilder.shaped(INVAR_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(recipe);
        ShapedRecipeBuilder.shaped(LEAD_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(recipe);
        ShapedRecipeBuilder.shaped(NICKEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(recipe);
        ShapedRecipeBuilder.shaped(SILVER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(recipe);
        ShapedRecipeBuilder.shaped(TIN_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(recipe);
        ShapedRecipeBuilder.shaped(URANIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(recipe);

        //Tools
        ShapedRecipeBuilder.shaped(HAMMER).pattern(" X#").pattern(" RX").pattern("R  ").define('X', Tags.Items.INGOTS_IRON).define('#', Tags.Items.STRING).define('R', Tags.Items.RODS_WOODEN).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipe);
    }
}
