package net.themcbrothers.usefulfoundation.datagen.world;

import com.google.common.base.Suppliers;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.themcbrothers.usefulfoundation.UsefulFoundation;
import net.themcbrothers.usefulfoundation.core.FoundationBlocks;

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
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_ALUMINUM = createKey("ore_aluminum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_LEAD = createKey("ore_lead");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_NICKEL = createKey("ore_nickel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_PLATINUM = createKey("ore_platinum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SILVER = createKey("ore_silver");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN = createKey("ore_tin");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_URANIUM = createKey("ore_uranium");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.register(ORE_ALUMINUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_ALUMINUM_SUPPLIER.get(), 8)));
        context.register(ORE_LEAD, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_LEAD_SUPPLIER.get(), 8)));
        context.register(ORE_NICKEL, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_NICKEL_SUPPLIER.get(), 8)));
        context.register(ORE_PLATINUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_PLATINUM_SUPPLIER.get(), 4)));
        context.register(ORE_SILVER, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_SILVER_SUPPLIER.get(), 8)));
        context.register(ORE_TIN, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_TIN_SUPPLIER.get(), 8)));
        context.register(ORE_URANIUM, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ORE_URANIUM_SUPPLIER.get(), 8)));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, UsefulFoundation.id(name));
    }
}
