package net.themcbrothers.usefulfoundation.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.item.Items.*;
import static net.themcbrothers.usefulfoundation.UsefulFoundation.id;
import static net.themcbrothers.usefulfoundation.core.FoundationBlocks.*;
import static net.themcbrothers.usefulfoundation.core.FoundationItems.*;
import static net.themcbrothers.usefulfoundation.core.FoundationTags.Items.*;

public class FoundationRecipeProvider extends RecipeProvider {
    public FoundationRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    private ResourceKey<Recipe<?>> key(String path) {
        return ResourceKey.create(Registries.RECIPE, id(path));
    }

    @Override
    protected void buildRecipes() {
        // Ingots
        this.shaped(RecipeCategory.MISC, ALUMINUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ALUMINUM).group("aluminum_ingot").unlockedBy("has_aluminum_nugget", has(NUGGETS_ALUMINUM)).save(this.output, key("aluminum_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, BRONZE_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_BRONZE).group("bronze_ingot").unlockedBy("has_bronze_nugget", has(NUGGETS_BRONZE)).save(this.output, key("bronze_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, ELECTRUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ELECTRUM).group("electrum_ingot").unlockedBy("has_electrum_nugget", has(NUGGETS_ELECTRUM)).save(this.output, key("electrum_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, ENDERIUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_ENDERIUM).group("enderium_ingot").unlockedBy("has_enderium_nugget", has(NUGGETS_ENDERIUM)).save(this.output, key("enderium_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, INVAR_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_INVAR).group("invar_ingot").unlockedBy("has_invar_nugget", has(NUGGETS_INVAR)).save(this.output, key("invar_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, LEAD_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_LEAD).group("lead_ingot").unlockedBy("has_lead_nugget", has(NUGGETS_LEAD)).save(this.output, key("lead_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, NICKEL_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_NICKEL).group("nickel_ingot").unlockedBy("has_nickel_nugget", has(NUGGETS_NICKEL)).save(this.output, key("nickel_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, PLATINUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_PLATINUM).group("platinum_ingot").unlockedBy("has_platinum_nugget", has(NUGGETS_PLATINUM)).save(this.output, key("platinum_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, SIGNALUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SIGNALUM).group("signalum_ingot").unlockedBy("has_signalum_nugget", has(NUGGETS_SIGNALUM)).save(this.output, key("signalum_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, SILVER_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_SILVER).group("silver_ingot").unlockedBy("has_silver_nugget", has(NUGGETS_SILVER)).save(this.output, key("silver_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, STEEL_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_STEEL).group("steel_ingot").unlockedBy("has_steel_nugget", has(NUGGETS_STEEL)).save(this.output, key("steel_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, TIN_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_TIN).group("tin_ingot").unlockedBy("has_tin_nugget", has(NUGGETS_TIN)).save(this.output, key("tin_ingot_from_nuggets"));
        this.shaped(RecipeCategory.MISC, URANIUM_INGOT).pattern("XXX").pattern("XXX").pattern("XXX").define('X', NUGGETS_URANIUM).group("uranium_ingot").unlockedBy("has_uranium_nugget", has(NUGGETS_URANIUM)).save(this.output, key("uranium_ingot_from_nuggets"));

        this.shapeless(RecipeCategory.MISC, ALUMINUM_INGOT, 9).requires(BLOCKS_ALUMINUM).group("aluminum_ingot").unlockedBy("has_aluminum_block", has(BLOCKS_ALUMINUM)).save(this.output, key("aluminum_ingot_from_aluminum_block"));
        this.shapeless(RecipeCategory.MISC, BRONZE_INGOT, 9).requires(BLOCKS_BRONZE).group("bronze_ingot").unlockedBy("has_bronze_block", has(BLOCKS_BRONZE)).save(this.output, key("bronze_ingot_from_bronze_block"));
        this.shapeless(RecipeCategory.MISC, ELECTRUM_INGOT, 9).requires(BLOCKS_ELECTRUM).group("electrum_ingot").unlockedBy("has_electrum_block", has(BLOCKS_ELECTRUM)).save(this.output, key("electrum_ingot_from_electrum_block"));
        this.shapeless(RecipeCategory.MISC, ENDERIUM_INGOT, 9).requires(BLOCKS_ENDERIUM).group("enderium_ingot").unlockedBy("has_enderium_block", has(BLOCKS_ENDERIUM)).save(this.output, key("enderium_ingot_from_enderium_block"));
        this.shapeless(RecipeCategory.MISC, INVAR_INGOT, 9).requires(BLOCKS_INVAR).group("invar_ingot").unlockedBy("has_invar_block", has(BLOCKS_INVAR)).save(this.output, key("invar_ingot_from_invar_block"));
        this.shapeless(RecipeCategory.MISC, LEAD_INGOT, 9).requires(BLOCKS_LEAD).group("lead_ingot").unlockedBy("has_lead_block", has(BLOCKS_LEAD)).save(this.output, key("lead_ingot_from_lead_block"));
        this.shapeless(RecipeCategory.MISC, NICKEL_INGOT, 9).requires(BLOCKS_NICKEL).group("nickel_ingot").unlockedBy("has_nickel_block", has(BLOCKS_NICKEL)).save(this.output, key("nickel_ingot_from_nickel_block"));
        this.shapeless(RecipeCategory.MISC, PLATINUM_INGOT, 9).requires(BLOCKS_PLATINUM).group("platinum_ingot").unlockedBy("has_platinum_block", has(BLOCKS_PLATINUM)).save(this.output, key("platinum_ingot_from_platinum_block"));
        this.shapeless(RecipeCategory.MISC, SIGNALUM_INGOT, 9).requires(BLOCKS_SIGNALUM).group("signalum_ingot").unlockedBy("has_silver_block", has(BLOCKS_SIGNALUM)).save(this.output, key("signalum_ingot_from_signalum_block"));
        this.shapeless(RecipeCategory.MISC, SILVER_INGOT, 9).requires(BLOCKS_SILVER).group("silver_ingot").unlockedBy("has_silver_block", has(BLOCKS_SILVER)).save(this.output, key("silver_ingot_from_silver_block"));
        this.shapeless(RecipeCategory.MISC, STEEL_INGOT, 9).requires(BLOCKS_STEEL).group("steel_ingot").unlockedBy("has_steel_block", has(BLOCKS_STEEL)).save(this.output, key("steel_ingot_from_steel_block"));
        this.shapeless(RecipeCategory.MISC, TIN_INGOT, 9).requires(BLOCKS_TIN).group("tin_ingot").unlockedBy("has_tin_block", has(BLOCKS_TIN)).save(this.output, key("tin_ingot_from_tin_block"));
        this.shapeless(RecipeCategory.MISC, URANIUM_INGOT, 9).requires(BLOCKS_URANIUM).group("uranium_ingot").unlockedBy("has_uranium_block", has(BLOCKS_URANIUM)).save(this.output, key("uranium_ingot_from_uranium_block"));

        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_ALUMINUM), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.7F, 100).group("aluminum_ingot").unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(this.output, key("aluminum_ingot_from_smelting_raw_aluminum"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_ALUMINUM), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.7F, 50).group("aluminum_ingot").unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(this.output, key("aluminum_ingot_from_blasting_raw_aluminum"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_LEAD), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.7F, 200).group("lead_ingot").unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(this.output, key("lead_ingot_from_smelting_raw_lead"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_LEAD), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.7F, 100).group("lead_ingot").unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(this.output, key("lead_ingot_from_blasting_raw_lead"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_NICKEL), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.7F, 200).group("nickel_ingot").unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(this.output, key("nickel_ingot_from_smelting_raw_nickel"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_NICKEL), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.7F, 100).group("nickel_ingot").unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(this.output, key("nickel_ingot_from_blasting_raw_nickel"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_PLATINUM), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.7F, 250).group("platinum_ingot").unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(this.output, key("platinum_ingot_from_smelting_raw_platinum"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_PLATINUM), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.7F, 150).group("platinum_ingot").unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(this.output, key("platinum_ingot_from_blasting_raw_platinum"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_SILVER), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.7F, 200).group("silver_ingot").unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(this.output, key("silver_ingot_from_smelting_raw_silver"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_SILVER), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.7F, 100).group("silver_ingot").unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(this.output, key("silver_ingot_from_blasting_raw_silver"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_TIN), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.7F, 200).group("tin_ingot").unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(this.output, key("tin_ingot_from_smelting_raw_tin"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_TIN), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.7F, 100).group("tin_ingot").unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(this.output, key("tin_ingot_from_blasting_raw_tin"));
        SimpleCookingRecipeBuilder.smelting(this.tag(RAW_MATERIALS_URANIUM), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.7F, 200).group("uranium_ingot").unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(this.output, key("uranium_ingot_from_smelting_raw_uranium"));
        SimpleCookingRecipeBuilder.blasting(this.tag(RAW_MATERIALS_URANIUM), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.7F, 100).group("uranium_ingot").unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(this.output, key("uranium_ingot_from_blasting_raw_uranium"));

        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_ALUMINUM), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.7F, 200).group("aluminum_ingot").unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(this.output, key("aluminum_ingot_from_smelting_aluminum_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_ALUMINUM), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.7F, 100).group("aluminum_ingot").unlockedBy("has_aluminum_ore", has(ORES_ALUMINUM)).save(this.output, key("aluminum_ingot_from_blasting_aluminum_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_LEAD), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.7F, 200).group("lead_ingot").unlockedBy("has_lead_ore", has(ORES_LEAD)).save(this.output, key("lead_ingot_from_smelting_lead_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_LEAD), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.7F, 100).group("lead_ingot").unlockedBy("has_lead_ore", has(ORES_LEAD)).save(this.output, key("lead_ingot_from_blasting_lead_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_NICKEL), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.7F, 200).group("nickel_ingot").unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(this.output, key("nickel_ingot_from_smelting_nickel_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_NICKEL), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.7F, 100).group("nickel_ingot").unlockedBy("has_nickel_ore", has(ORES_NICKEL)).save(this.output, key("nickel_ingot_from_blasting_nickel_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_PLATINUM), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.7F, 200).group("platinum_ingot").unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(this.output, key("platinum_ingot_from_smelting_platinum_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_PLATINUM), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.7F, 100).group("platinum_ingot").unlockedBy("has_platinum_ore", has(ORES_PLATINUM)).save(this.output, key("platinum_ingot_from_blasting_platinum_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_SILVER), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.7F, 200).group("silver_ingot").unlockedBy("has_silver_ore", has(ORES_SILVER)).save(this.output, key("silver_ingot_from_smelting_silver_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_SILVER), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.7F, 100).group("silver_ingot").unlockedBy("has_silver_ore", has(ORES_SILVER)).save(this.output, key("silver_ingot_from_blasting_silver_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_TIN), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.7F, 200).group("tin_ingot").unlockedBy("has_tin_ore", has(ORES_TIN)).save(this.output, key("tin_ingot_from_smelting_tin_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_TIN), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.7F, 100).group("tin_ingot").unlockedBy("has_tin_ore", has(ORES_TIN)).save(this.output, key("tin_ingot_from_blasting_tin_ore"));
        SimpleCookingRecipeBuilder.smelting(this.tag(ORES_URANIUM), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.7F, 200).group("uranium_ingot").unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(this.output, key("uranium_ingot_from_smelting_uranium_ore"));
        SimpleCookingRecipeBuilder.blasting(this.tag(ORES_URANIUM), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.7F, 100).group("uranium_ingot").unlockedBy("has_uranium_ore", has(ORES_URANIUM)).save(this.output, key("uranium_ingot_from_blasting_uranium_ore"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ALUMINUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.3F, 200).group("aluminum_ingot").unlockedBy("has_aluminum_dust", has(ALUMINUM_DUST)).save(this.output, key("aluminum_ingot_from_smelting_aluminum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ALUMINUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ALUMINUM_INGOT, 0.3F, 100).group("aluminum_ingot").unlockedBy("has_aluminum_dust", has(ALUMINUM_DUST)).save(this.output, key("aluminum_ingot_from_blasting_aluminum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BRONZE_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, BRONZE_INGOT, 0.3F, 200).group("bronze_ingot").unlockedBy("has_bronze_dust", has(BRONZE_INGOT)).save(this.output, key("bronze_ingot_from_smelting_bronze_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BRONZE_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, BRONZE_INGOT, 0.3F, 100).group("bronze_ingot").unlockedBy("has_bronze_dust", has(BRONZE_INGOT)).save(this.output, key("bronze_ingot_from_blasting_bronze_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(COPPER_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, COPPER_INGOT, 0.3F, 200).group("copper_ingot").unlockedBy("has_copper_dust", has(COPPER_INGOT)).save(this.output, key("copper_ingot_from_smelting_copper_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(COPPER_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, COPPER_INGOT, 0.3F, 100).group("copper_ingot").unlockedBy("has_copper_dust", has(COPPER_INGOT)).save(this.output, key("copper_ingot_from_blasting_copper_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(DIAMOND_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, DIAMOND, 0.3F, 200).group("diamond_ingot").unlockedBy("has_diamond_dust", has(DIAMOND)).save(this.output, key("diamond_from_smelting_diamond_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(DIAMOND_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, DIAMOND, 0.3F, 100).group("diamond_ingot").unlockedBy("has_diamond_dust", has(DIAMOND)).save(this.output, key("diamond_from_blasting_diamond_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ELECTRUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ELECTRUM_INGOT, 0.3F, 200).group("electrum_ingot").unlockedBy("has_electrum_dust", has(ELECTRUM_INGOT)).save(this.output, key("electrum_ingot_from_smelting_electrum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ELECTRUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ELECTRUM_INGOT, 0.3F, 100).group("electrum_ingot").unlockedBy("has_electrum_dust", has(ELECTRUM_INGOT)).save(this.output, key("electrum_ingot_from_blasting_electrum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ENDERIUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ENDERIUM_INGOT, 0.3F, 200).group("enderium_ingot").unlockedBy("has_enderium_dust", has(ENDERIUM_INGOT)).save(this.output, key("enderium_ingot_from_smelting_enderium_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ENDERIUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, ENDERIUM_INGOT, 0.3F, 100).group("enderium_ingot").unlockedBy("has_enderium_dust", has(ENDERIUM_INGOT)).save(this.output, key("enderium_ingot_from_blasting_enderium_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GOLD_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, GOLD_INGOT, 0.3F, 200).group("gold_ingot").unlockedBy("has_gold_dust", has(GOLD_INGOT)).save(this.output, key("gold_ingot_from_smelting_gold_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GOLD_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, GOLD_INGOT, 0.3F, 100).group("gold_ingot").unlockedBy("has_gold_dust", has(GOLD_INGOT)).save(this.output, key("gold_ingot_from_blasting_gold_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(INVAR_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, INVAR_INGOT, 0.3F, 200).group("invar_ingot").unlockedBy("has_invar_dust", has(INVAR_INGOT)).save(this.output, key("invar_ingot_from_smelting_invar_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(INVAR_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, INVAR_INGOT, 0.3F, 100).group("invar_ingot").unlockedBy("has_invar_dust", has(INVAR_INGOT)).save(this.output, key("invar_ingot_from_blasting_invar_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(IRON_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, IRON_INGOT, 0.3F, 200).group("iron_ingot").unlockedBy("has_iron_dust", has(IRON_INGOT)).save(this.output, key("iron_ingot_from_smelting_iron_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(IRON_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, IRON_INGOT, 0.3F, 100).group("iron_ingot").unlockedBy("has_iron_dust", has(IRON_INGOT)).save(this.output, key("iron_ingot_from_blasting_iron_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(LEAD_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.3F, 200).group("lead_ingot").unlockedBy("has_lead_dust", has(LEAD_DUST)).save(this.output, key("lead_ingot_from_smelting_lead_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(LEAD_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, LEAD_INGOT, 0.3F, 100).group("lead_ingot").unlockedBy("has_lead_dust", has(LEAD_DUST)).save(this.output, key("lead_ingot_from_blasting_lead_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(NICKEL_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.3F, 200).group("nickel_ingot").unlockedBy("has_nickel_dust", has(NICKEL_DUST)).save(this.output, key("nickel_ingot_from_smelting_nickel_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(NICKEL_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, NICKEL_INGOT, 0.3F, 100).group("nickel_ingot").unlockedBy("has_nickel_dust", has(NICKEL_DUST)).save(this.output, key("nickel_ingot_from_blasting_nickel_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(PLATINUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.3F, 200).group("platinum_ingot").unlockedBy("has_platinum_dust", has(PLATINUM_DUST)).save(this.output, key("platinum_ingot_from_smelting_platinum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(PLATINUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, PLATINUM_INGOT, 0.3F, 100).group("platinum_ingot").unlockedBy("has_platinum_dust", has(PLATINUM_DUST)).save(this.output, key("platinum_ingot_from_blasting_platinum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SIGNALUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, SIGNALUM_INGOT, 0.3F, 200).group("signalum_ingot").unlockedBy("has_signalum_dust", has(SIGNALUM_DUST)).save(this.output, key("signalum_ingot_from_smelting_signalum_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SIGNALUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, SIGNALUM_INGOT, 0.3F, 100).group("signalum_ingot").unlockedBy("has_signalum_dust", has(SIGNALUM_DUST)).save(this.output, key("signalum_ingot_from_blasting_signalum_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(SILVER_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.3F, 200).group("silver_ingot").unlockedBy("has_silver_dust", has(SILVER_DUST)).save(this.output, key("silver_ingot_from_smelting_silver_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(SILVER_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, SILVER_INGOT, 0.3F, 100).group("silver_ingot").unlockedBy("has_silver_dust", has(SILVER_DUST)).save(this.output, key("silver_ingot_from_blasting_silver_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(STEEL_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, STEEL_INGOT, 0.3F, 200).group("steel_ingot").unlockedBy("has_steel_dust", has(STEEL_DUST)).save(this.output, key("steel_ingot_from_smelting_steel_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(STEEL_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, STEEL_INGOT, 0.3F, 100).group("steel_ingot").unlockedBy("has_steel_dust", has(STEEL_DUST)).save(this.output, key("steel_ingot_from_blasting_steel_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(TIN_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.3F, 200).group("tin_ingot").unlockedBy("has_tin_dust", has(TIN_DUST)).save(this.output, key("tin_ingot_from_smelting_tin_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(TIN_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, TIN_INGOT, 0.3F, 100).group("tin_ingot").unlockedBy("has_tin_dust", has(TIN_DUST)).save(this.output, key("tin_ingot_from_blasting_tin_dust"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(URANIUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.3F, 200).group("uranium_ingot").unlockedBy("has_uranium_dust", has(URANIUM_DUST)).save(this.output, key("uranium_ingot_from_smelting_uranium_dust"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(URANIUM_DUST), RecipeCategory.MISC, CookingBookCategory.MISC, URANIUM_INGOT, 0.3F, 100).group("uranium_ingot").unlockedBy("has_uranium_dust", has(URANIUM_DUST)).save(this.output, key("uranium_ingot_from_blasting_uranium_dust"));

        // Raw Materials
        this.shapeless(RecipeCategory.MISC, RAW_ALUMINUM, 9).requires(RAW_BLOCKS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_BLOCKS_ALUMINUM)).save(this.output, key("raw_aluminum_from_raw_aluminum_block"));
        this.shapeless(RecipeCategory.MISC, RAW_LEAD, 9).requires(RAW_BLOCKS_LEAD).unlockedBy("has_raw_lead", has(RAW_BLOCKS_LEAD)).save(this.output, key("raw_lead_from_raw_lead_block"));
        this.shapeless(RecipeCategory.MISC, RAW_NICKEL, 9).requires(RAW_BLOCKS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_BLOCKS_NICKEL)).save(this.output, key("raw_nickel_from_raw_nickel_block"));
        this.shapeless(RecipeCategory.MISC, RAW_PLATINUM, 9).requires(RAW_BLOCKS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_BLOCKS_PLATINUM)).save(this.output, key("raw_platinum_from_raw_platinum_block"));
        this.shapeless(RecipeCategory.MISC, RAW_SILVER, 9).requires(RAW_BLOCKS_SILVER).unlockedBy("has_raw_silver", has(RAW_BLOCKS_SILVER)).save(this.output, key("raw_silver_from_raw_silver_block"));
        this.shapeless(RecipeCategory.MISC, RAW_TIN, 9).requires(RAW_BLOCKS_TIN).unlockedBy("has_raw_tin", has(RAW_BLOCKS_TIN)).save(this.output, key("raw_tin_from_raw_tin_block"));
        this.shapeless(RecipeCategory.MISC, RAW_URANIUM, 9).requires(RAW_BLOCKS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_BLOCKS_URANIUM)).save(this.output, key("raw_uranium_from_raw_uranium_block"));

        // Gears
        this.shaped(RecipeCategory.MISC, ALUMINUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, BRONZE_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(this.output);
        this.shaped(RecipeCategory.MISC, COPPER_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_COPPER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(this.output);
        this.shaped(RecipeCategory.MISC, DIAMOND_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.GEMS_DIAMOND).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(this.output);
        this.shaped(RecipeCategory.MISC, ELECTRUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, ENDERIUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, GOLD_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_GOLD).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(this.output);
        this.shaped(RecipeCategory.MISC, INVAR_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(this.output);
        this.shaped(RecipeCategory.MISC, IRON_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', Tags.Items.INGOTS_IRON).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(this.output);
        this.shaped(RecipeCategory.MISC, LEAD_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(this.output);
        this.shaped(RecipeCategory.MISC, NICKEL_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(this.output);
        this.shaped(RecipeCategory.MISC, PLATINUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, SIGNALUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, SILVER_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(this.output);
        this.shaped(RecipeCategory.MISC, STEEL_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(this.output);
        this.shaped(RecipeCategory.MISC, TIN_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(this.output);
        this.shaped(RecipeCategory.MISC, URANIUM_GEAR).pattern(" X ").pattern("X X").pattern(" X ").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(this.output);

        // Plates
        this.shapeless(RecipeCategory.MISC, ALUMINUM_PLATE).requires(INGOTS_ALUMINUM).requires(HAMMER).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, BRONZE_PLATE).requires(INGOTS_BRONZE).requires(HAMMER).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(this.output);
        this.shapeless(RecipeCategory.MISC, COPPER_PLATE).requires(Tags.Items.INGOTS_COPPER).requires(HAMMER).unlockedBy("has_copper_ingot", has(Tags.Items.INGOTS_COPPER)).save(this.output);
        this.shapeless(RecipeCategory.MISC, DIAMOND_PLATE).requires(Tags.Items.GEMS_DIAMOND).requires(HAMMER).unlockedBy("has_diamond_gem", has(Tags.Items.GEMS_DIAMOND)).save(this.output);
        this.shapeless(RecipeCategory.MISC, ELECTRUM_PLATE).requires(INGOTS_ELECTRUM).requires(HAMMER).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, ENDERIUM_PLATE).requires(INGOTS_ENDERIUM).requires(HAMMER).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, GOLD_PLATE).requires(Tags.Items.INGOTS_GOLD).requires(HAMMER).unlockedBy("has_gold_ingot", has(Tags.Items.INGOTS_GOLD)).save(this.output);
        this.shapeless(RecipeCategory.MISC, INVAR_PLATE).requires(INGOTS_INVAR).requires(HAMMER).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(this.output);
        this.shapeless(RecipeCategory.MISC, IRON_PLATE).requires(Tags.Items.INGOTS_IRON).requires(HAMMER).unlockedBy("has_iron_ingot", has(Tags.Items.INGOTS_IRON)).save(this.output);
        this.shapeless(RecipeCategory.MISC, LEAD_PLATE).requires(INGOTS_LEAD).requires(HAMMER).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(this.output);
        this.shapeless(RecipeCategory.MISC, NICKEL_PLATE).requires(INGOTS_NICKEL).requires(HAMMER).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(this.output);
        this.shapeless(RecipeCategory.MISC, PLATINUM_PLATE).requires(INGOTS_PLATINUM).requires(HAMMER).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, SIGNALUM_PLATE).requires(INGOTS_SIGNALUM).requires(HAMMER).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, SILVER_PLATE).requires(INGOTS_SILVER).requires(HAMMER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(this.output);
        this.shapeless(RecipeCategory.MISC, STEEL_PLATE).requires(INGOTS_STEEL).requires(HAMMER).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(this.output);
        this.shapeless(RecipeCategory.MISC, TIN_PLATE).requires(INGOTS_TIN).requires(HAMMER).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(this.output);
        this.shapeless(RecipeCategory.MISC, URANIUM_PLATE).requires(INGOTS_URANIUM).requires(HAMMER).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(this.output);

        // Nuggets
        this.shapeless(RecipeCategory.MISC, ALUMINUM_NUGGET, 9).requires(INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, BRONZE_NUGGET, 9).requires(INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(this.output);
        this.shapeless(RecipeCategory.MISC, ELECTRUM_NUGGET, 9).requires(INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, ENDERIUM_NUGGET, 9).requires(INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, INVAR_NUGGET, 9).requires(INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(this.output);
        this.shapeless(RecipeCategory.MISC, LEAD_NUGGET, 9).requires(INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(this.output);
        this.shapeless(RecipeCategory.MISC, NICKEL_NUGGET, 9).requires(INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(this.output);
        this.shapeless(RecipeCategory.MISC, PLATINUM_NUGGET, 9).requires(INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, SIGNALUM_NUGGET, 9).requires(INGOTS_SIGNALUM).unlockedBy("has_signalum_ingot", has(INGOTS_SIGNALUM)).save(this.output);
        this.shapeless(RecipeCategory.MISC, SILVER_NUGGET, 9).requires(INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(this.output);
        this.shapeless(RecipeCategory.MISC, STEEL_NUGGET, 9).requires(INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(this.output);
        this.shapeless(RecipeCategory.MISC, TIN_NUGGET, 9).requires(INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(this.output);
        this.shapeless(RecipeCategory.MISC, URANIUM_NUGGET, 9).requires(INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(this.output);

        // Dusts
        this.shapeless(RecipeCategory.MISC, BRONZE_DUST, 4).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_COPPER).requires(DUSTS_TIN).unlockedBy("has_copper_dust", has(DUSTS_COPPER)).save(this.output, key("bronze_dust_from_dust_mix"));
        this.shapeless(RecipeCategory.MISC, ELECTRUM_DUST, 2).requires(DUSTS_GOLD).requires(DUSTS_SILVER).unlockedBy("has_silver_dust", has(DUSTS_SILVER)).save(this.output, key("electrum_dust_from_dust_mix"));
        this.shapeless(RecipeCategory.MISC, INVAR_DUST, 3).requires(DUSTS_IRON).requires(DUSTS_IRON).requires(DUSTS_NICKEL).unlockedBy("has_iron_dust", has(DUSTS_IRON)).save(this.output, key("invar_dust_from_dust_mix"));

        // Storage Blocks
        this.shaped(RecipeCategory.MISC, ALUMINUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ALUMINUM).unlockedBy("has_aluminum_ingot", has(INGOTS_ALUMINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, BRONZE_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_BRONZE).unlockedBy("has_bronze_ingot", has(INGOTS_BRONZE)).save(this.output);
        this.shaped(RecipeCategory.MISC, ELECTRUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ELECTRUM).unlockedBy("has_electrum_ingot", has(INGOTS_ELECTRUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, ENDERIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_ENDERIUM).unlockedBy("has_enderium_ingot", has(INGOTS_ENDERIUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, INVAR_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_INVAR).unlockedBy("has_invar_ingot", has(INGOTS_INVAR)).save(this.output);
        this.shaped(RecipeCategory.MISC, LEAD_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_LEAD).unlockedBy("has_lead_ingot", has(INGOTS_LEAD)).save(this.output);
        this.shaped(RecipeCategory.MISC, NICKEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_NICKEL).unlockedBy("has_nickel_ingot", has(INGOTS_NICKEL)).save(this.output);
        this.shaped(RecipeCategory.MISC, PLATINUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_PLATINUM).unlockedBy("has_platinum_ingot", has(INGOTS_PLATINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, SIGNALUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SIGNALUM).unlockedBy("has_silver_ingot", has(INGOTS_SIGNALUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, SILVER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_SILVER).unlockedBy("has_silver_ingot", has(INGOTS_SILVER)).save(this.output);
        this.shaped(RecipeCategory.MISC, STEEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_STEEL).unlockedBy("has_steel_ingot", has(INGOTS_STEEL)).save(this.output);
        this.shaped(RecipeCategory.MISC, TIN_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_TIN).unlockedBy("has_tin_ingot", has(INGOTS_TIN)).save(this.output);
        this.shaped(RecipeCategory.MISC, URANIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', INGOTS_URANIUM).unlockedBy("has_uranium_ingot", has(INGOTS_URANIUM)).save(this.output);

        // Raw Storage Blocks
        this.shaped(RecipeCategory.MISC, RAW_ALUMINUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_ALUMINUM).unlockedBy("has_raw_aluminum", has(RAW_MATERIALS_ALUMINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_LEAD_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_LEAD).unlockedBy("has_raw_lead", has(RAW_MATERIALS_LEAD)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_NICKEL_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_NICKEL).unlockedBy("has_raw_nickel", has(RAW_MATERIALS_NICKEL)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_PLATINUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_PLATINUM).unlockedBy("has_raw_platinum", has(RAW_MATERIALS_PLATINUM)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_SILVER_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_SILVER).unlockedBy("has_raw_silver", has(RAW_MATERIALS_SILVER)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_TIN_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_TIN).unlockedBy("has_raw_tin", has(RAW_MATERIALS_TIN)).save(this.output);
        this.shaped(RecipeCategory.MISC, RAW_URANIUM_BLOCK).pattern("XXX").pattern("XXX").pattern("XXX").define('X', RAW_MATERIALS_URANIUM).unlockedBy("has_raw_uranium", has(RAW_MATERIALS_URANIUM)).save(this.output);

        // Tools
        this.shaped(RecipeCategory.MISC, HAMMER).pattern(" X#").pattern(" RX").pattern("R  ").define('X', Tags.Items.INGOTS_IRON).define('#', Tags.Items.STRINGS).define('R', Tags.Items.RODS_WOODEN).unlockedBy("has_iron_ingot", has(IRON_INGOT)).save(this.output);
    }

    static final class Runner extends RecipeProvider.Runner {
        Runner(CompletableFuture<HolderLookup.Provider> registries, PackOutput packOutput) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new FoundationRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Useful Foundation Recipes";
        }
    }
}
