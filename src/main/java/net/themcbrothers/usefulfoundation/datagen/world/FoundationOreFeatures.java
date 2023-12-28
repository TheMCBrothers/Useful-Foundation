package net.themcbrothers.usefulfoundation.datagen.world;

import com.google.common.base.Suppliers;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import net.themcbrothers.usefulfoundation.infrastructure.FoundationBlocks;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.tags.BlockTags.DEEPSLATE_ORE_REPLACEABLES;
import static net.minecraft.tags.BlockTags.STONE_ORE_REPLACEABLES;

public class FoundationOreFeatures {
    private static final RuleTest stoneOreTest = new TagMatchTest(STONE_ORE_REPLACEABLES);
    private static final RuleTest deepslateOreTest = new TagMatchTest(DEEPSLATE_ORE_REPLACEABLES);

    //Targets
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_ALUMINUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.ALUMINUM_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_LEAD_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_NICKEL_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.NICKEL_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_PLATINUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.PLATINUM_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_SILVER_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.SILVER_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_TIN_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.TIN_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())));
    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORE_URANIUM_SUPPLIER = Suppliers.memoize(() -> List.of(OreConfiguration.target(stoneOreTest, FoundationBlocks.URANIUM_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateOreTest, FoundationBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState())));

    //Features
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALUMINUM = FeatureUtils.createKey(UsefulFoundation.rl("ore_aluminum").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LEAD = FeatureUtils.createKey(UsefulFoundation.rl("ore_lead").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_NICKEL = FeatureUtils.createKey(UsefulFoundation.rl("ore_nickel").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_PLATINUM = FeatureUtils.createKey(UsefulFoundation.rl("ore_platinum").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SILVER = FeatureUtils.createKey(UsefulFoundation.rl("ore_silver").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN = FeatureUtils.createKey(UsefulFoundation.rl("ore_tin").toString());
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_URANIUM = FeatureUtils.createKey(UsefulFoundation.rl("ore_uranium").toString());

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        context.register(ORE_ALUMINUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_ALUMINUM_SUPPLIER.get(), 8)));
        context.register(ORE_LEAD, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_LEAD_SUPPLIER.get(), 8)));
        context.register(ORE_NICKEL, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_NICKEL_SUPPLIER.get(), 8)));
        context.register(ORE_PLATINUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_PLATINUM_SUPPLIER.get(), 4)));
        context.register(ORE_SILVER, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_SILVER_SUPPLIER.get(), 8)));
        context.register(ORE_TIN, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_TIN_SUPPLIER.get(), 8)));
        context.register(ORE_URANIUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_URANIUM_SUPPLIER.get(), 8)));
    }
}
